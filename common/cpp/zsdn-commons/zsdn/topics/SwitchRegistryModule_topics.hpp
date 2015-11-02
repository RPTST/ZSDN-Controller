//
// Autogenerated Code. Changes here will be automatically overwritten.
//
// @author Andre Kutzleb
//

#ifndef ZSDN_SWITCHREGISTRYMODULE_H
#define ZSDN_SWITCHREGISTRYMODULE_H

#include <stdint.h>
#include "zmf/MessageType.hpp"

using namespace zmf::data;

namespace switchregistrymodule_topics {

const uint8_t  TOPIC_VAL__TO = 0x01;
const uint8_t  TOPIC_VAL__FROM = 0x02;
const uint16_t TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE = 0x0001;
const uint8_t  TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE__SWITCH_EVENT = 0x00;
const uint8_t  TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE__SWITCH_EVENT__ADDED = 0x00;
const uint8_t  TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE__SWITCH_EVENT__REMOVED = 0x01;
const uint8_t  TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE__SWITCH_EVENT__CHANGED = 0x02;
const uint8_t  TOPIC_VAL__REQUEST = 0x03;
const uint16_t TOPIC_VAL__REQUEST__SWITCH_REGISTRY_MODULE = 0x0001;
const uint8_t  TOPIC_VAL__REQUEST__SWITCH_REGISTRY_MODULE__GET_ALL_SWITCHES = 0x00;
const uint8_t  TOPIC_VAL__REQUEST__SWITCH_REGISTRY_MODULE__GET_SWITCH_BY_ID = 0x01;
const uint8_t  TOPIC_VAL__REPLY = 0x04;
const uint16_t TOPIC_VAL__REPLY__SWITCH_REGISTRY_MODULE = 0x0001;
const uint8_t  TOPIC_VAL__REPLY__SWITCH_REGISTRY_MODULE__GET_ALL_SWITCHES = 0x00;
const uint8_t  TOPIC_VAL__REPLY__SWITCH_REGISTRY_MODULE__GET_SWITCH_BY_ID = 0x01;

class AbstractFactory {
protected:
MessageType& id;
AbstractFactory(MessageType &f) : id(f) {}
public:
MessageType build() {return id;}
};

class TO {
private:
MessageType id;
public:
TO() : id() {id.appendMatch8((uint8_t) TOPIC_VAL__TO); }
};

class FROM {
private:
MessageType id;
public:
class SWITCH_REGISTRY_MODULE : public AbstractFactory {
public:
SWITCH_REGISTRY_MODULE(MessageType &f) : AbstractFactory(f) {id.appendMatch16((uint16_t) TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE); }
class SWITCH_EVENT : public AbstractFactory {
public:
SWITCH_EVENT(MessageType &f) : AbstractFactory(f) {id.appendMatch8((uint8_t) TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE__SWITCH_EVENT); }
class ADDED : public AbstractFactory {
public:
ADDED(MessageType &f) : AbstractFactory(f) {id.appendMatch8((uint8_t) TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE__SWITCH_EVENT__ADDED); }
};
class REMOVED : public AbstractFactory {
public:
REMOVED(MessageType &f) : AbstractFactory(f) {id.appendMatch8((uint8_t) TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE__SWITCH_EVENT__REMOVED); }
};
class CHANGED : public AbstractFactory {
public:
CHANGED(MessageType &f) : AbstractFactory(f) {id.appendMatch8((uint8_t) TOPIC_VAL__FROM__SWITCH_REGISTRY_MODULE__SWITCH_EVENT__CHANGED); }
};
ADDED added() {return ADDED(id);}
REMOVED removed() {return REMOVED(id);}
CHANGED changed() {return CHANGED(id);}
};
SWITCH_EVENT switch_event() {return SWITCH_EVENT(id);}
};
FROM() : id() {id.appendMatch8((uint8_t) TOPIC_VAL__FROM); }
SWITCH_REGISTRY_MODULE switch_registry_module() {return SWITCH_REGISTRY_MODULE(id);}
};

class REQUEST {
private:
MessageType id;
public:
class SWITCH_REGISTRY_MODULE : public AbstractFactory {
public:
SWITCH_REGISTRY_MODULE(MessageType &f) : AbstractFactory(f) {id.appendMatch16((uint16_t) TOPIC_VAL__REQUEST__SWITCH_REGISTRY_MODULE); }
class GET_ALL_SWITCHES : public AbstractFactory {
public:
GET_ALL_SWITCHES(MessageType &f) : AbstractFactory(f) {id.appendMatch8((uint8_t) TOPIC_VAL__REQUEST__SWITCH_REGISTRY_MODULE__GET_ALL_SWITCHES); }
};
class GET_SWITCH_BY_ID : public AbstractFactory {
public:
GET_SWITCH_BY_ID(MessageType &f) : AbstractFactory(f) {id.appendMatch8((uint8_t) TOPIC_VAL__REQUEST__SWITCH_REGISTRY_MODULE__GET_SWITCH_BY_ID); }
};
GET_ALL_SWITCHES get_all_switches() {return GET_ALL_SWITCHES(id);}
GET_SWITCH_BY_ID get_switch_by_id() {return GET_SWITCH_BY_ID(id);}
};
REQUEST() : id() {id.appendMatch8((uint8_t) TOPIC_VAL__REQUEST); }
SWITCH_REGISTRY_MODULE switch_registry_module() {return SWITCH_REGISTRY_MODULE(id);}
};

class REPLY {
private:
MessageType id;
public:
class SWITCH_REGISTRY_MODULE : public AbstractFactory {
public:
SWITCH_REGISTRY_MODULE(MessageType &f) : AbstractFactory(f) {id.appendMatch16((uint16_t) TOPIC_VAL__REPLY__SWITCH_REGISTRY_MODULE); }
class GET_ALL_SWITCHES : public AbstractFactory {
public:
GET_ALL_SWITCHES(MessageType &f) : AbstractFactory(f) {id.appendMatch8((uint8_t) TOPIC_VAL__REPLY__SWITCH_REGISTRY_MODULE__GET_ALL_SWITCHES); }
};
class GET_SWITCH_BY_ID : public AbstractFactory {
public:
GET_SWITCH_BY_ID(MessageType &f) : AbstractFactory(f) {id.appendMatch8((uint8_t) TOPIC_VAL__REPLY__SWITCH_REGISTRY_MODULE__GET_SWITCH_BY_ID); }
};
GET_ALL_SWITCHES get_all_switches() {return GET_ALL_SWITCHES(id);}
GET_SWITCH_BY_ID get_switch_by_id() {return GET_SWITCH_BY_ID(id);}
};
REPLY() : id() {id.appendMatch8((uint8_t) TOPIC_VAL__REPLY); }
SWITCH_REGISTRY_MODULE switch_registry_module() {return SWITCH_REGISTRY_MODULE(id);}
};


} // namespace switchregistrymodule_topics

#endif //ZSDN_SWITCHREGISTRYMODULE_H