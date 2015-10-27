package zsdn.topics;

import jmf.data.MessageType;
import jmf.data.builder.MessageTypeBuilder;

/**
 * Autogenerated Code. Changes here will be automatically overwritten.
 *
 * @author Andre Kutzleb
 */
public class DeviceModuleTopics {

private static final byte  TOPIC_VAL__FROM = (byte)0x02L;
private static final short TOPIC_VAL__FROM__DEVICE_MODULE = (short)0x0002L;
private static final byte  TOPIC_VAL__FROM__DEVICE_MODULE__DEVICE_EVENT = (byte)0x00L;
private static final byte  TOPIC_VAL__FROM__DEVICE_MODULE__DEVICE_EVENT__ADDED = (byte)0x00L;
private static final byte  TOPIC_VAL__FROM__DEVICE_MODULE__DEVICE_EVENT__REMOVED = (byte)0x01L;
private static final byte  TOPIC_VAL__FROM__DEVICE_MODULE__DEVICE_EVENT__CHANGED = (byte)0x02L;
private static final byte  TOPIC_VAL__REQUEST = (byte)0x03L;
private static final short TOPIC_VAL__REQUEST__DEVICE_MODULE = (short)0x0002L;
private static final byte  TOPIC_VAL__REQUEST__DEVICE_MODULE__GET_ALL_DEVICES = (byte)0x00L;
private static final byte  TOPIC_VAL__REQUEST__DEVICE_MODULE__GET_DEVICE_BY_MAC_ADDRESS = (byte)0x01L;
private static final byte  TOPIC_VAL__REQUEST__DEVICE_MODULE__GET_DEVICES_BY_FILTER = (byte)0x02L;
private static final byte  TOPIC_VAL__REPLY = (byte)0x04L;
private static final short TOPIC_VAL__REPLY__DEVICE_MODULE = (short)0x0002L;
private static final byte  TOPIC_VAL__REPLY__DEVICE_MODULE__GET_ALL_DEVICES = (byte)0x00L;
private static final byte  TOPIC_VAL__REPLY__DEVICE_MODULE__GET_DEVICE_BY_MAC_ADDRESS = (byte)0x01L;
private static final byte  TOPIC_VAL__REPLY__DEVICE_MODULE__GET_DEVICES_BY_FILTER = (byte)0x02L;

public static class FROM {
private final MessageTypeBuilder id;
public class DEVICE_MODULE {
public class DEVICE_EVENT {
public class ADDED {
private ADDED() {id.appendMatch8((byte) TOPIC_VAL__FROM__DEVICE_MODULE__DEVICE_EVENT__ADDED); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class REMOVED {
private REMOVED() {id.appendMatch8((byte) TOPIC_VAL__FROM__DEVICE_MODULE__DEVICE_EVENT__REMOVED); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class CHANGED {
private CHANGED() {id.appendMatch8((byte) TOPIC_VAL__FROM__DEVICE_MODULE__DEVICE_EVENT__CHANGED); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private DEVICE_EVENT() {id.appendMatch8((byte) TOPIC_VAL__FROM__DEVICE_MODULE__DEVICE_EVENT); }
public ADDED added() {return new ADDED();}
public REMOVED removed() {return new REMOVED();}
public CHANGED changed() {return new CHANGED();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private DEVICE_MODULE() {id.appendMatch16((short) TOPIC_VAL__FROM__DEVICE_MODULE); }
public DEVICE_EVENT device_event() {return new DEVICE_EVENT();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public FROM() {id = new MessageTypeBuilder(); id.appendMatch8((byte) TOPIC_VAL__FROM); }
public FROM(MessageTypeBuilder preallocatedBuilder) {id = preallocatedBuilder; id.appendMatch8((byte) TOPIC_VAL__FROM); }
public DEVICE_MODULE device_module() {return new DEVICE_MODULE();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public static class REQUEST {
private final MessageTypeBuilder id;
public class DEVICE_MODULE {
public class GET_ALL_DEVICES {
private GET_ALL_DEVICES() {id.appendMatch8((byte) TOPIC_VAL__REQUEST__DEVICE_MODULE__GET_ALL_DEVICES); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_DEVICE_BY_MAC_ADDRESS {
private GET_DEVICE_BY_MAC_ADDRESS() {id.appendMatch8((byte) TOPIC_VAL__REQUEST__DEVICE_MODULE__GET_DEVICE_BY_MAC_ADDRESS); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_DEVICES_BY_FILTER {
private GET_DEVICES_BY_FILTER() {id.appendMatch8((byte) TOPIC_VAL__REQUEST__DEVICE_MODULE__GET_DEVICES_BY_FILTER); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private DEVICE_MODULE() {id.appendMatch16((short) TOPIC_VAL__REQUEST__DEVICE_MODULE); }
public GET_ALL_DEVICES get_all_devices() {return new GET_ALL_DEVICES();}
public GET_DEVICE_BY_MAC_ADDRESS get_device_by_mac_address() {return new GET_DEVICE_BY_MAC_ADDRESS();}
public GET_DEVICES_BY_FILTER get_devices_by_filter() {return new GET_DEVICES_BY_FILTER();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public REQUEST() {id = new MessageTypeBuilder(); id.appendMatch8((byte) TOPIC_VAL__REQUEST); }
public REQUEST(MessageTypeBuilder preallocatedBuilder) {id = preallocatedBuilder; id.appendMatch8((byte) TOPIC_VAL__REQUEST); }
public DEVICE_MODULE device_module() {return new DEVICE_MODULE();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public static class REPLY {
private final MessageTypeBuilder id;
public class DEVICE_MODULE {
public class GET_ALL_DEVICES {
private GET_ALL_DEVICES() {id.appendMatch8((byte) TOPIC_VAL__REPLY__DEVICE_MODULE__GET_ALL_DEVICES); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_DEVICE_BY_MAC_ADDRESS {
private GET_DEVICE_BY_MAC_ADDRESS() {id.appendMatch8((byte) TOPIC_VAL__REPLY__DEVICE_MODULE__GET_DEVICE_BY_MAC_ADDRESS); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_DEVICES_BY_FILTER {
private GET_DEVICES_BY_FILTER() {id.appendMatch8((byte) TOPIC_VAL__REPLY__DEVICE_MODULE__GET_DEVICES_BY_FILTER); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private DEVICE_MODULE() {id.appendMatch16((short) TOPIC_VAL__REPLY__DEVICE_MODULE); }
public GET_ALL_DEVICES get_all_devices() {return new GET_ALL_DEVICES();}
public GET_DEVICE_BY_MAC_ADDRESS get_device_by_mac_address() {return new GET_DEVICE_BY_MAC_ADDRESS();}
public GET_DEVICES_BY_FILTER get_devices_by_filter() {return new GET_DEVICES_BY_FILTER();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public REPLY() {id = new MessageTypeBuilder(); id.appendMatch8((byte) TOPIC_VAL__REPLY); }
public REPLY(MessageTypeBuilder preallocatedBuilder) {id = preallocatedBuilder; id.appendMatch8((byte) TOPIC_VAL__REPLY); }
public DEVICE_MODULE device_module() {return new DEVICE_MODULE();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

};
