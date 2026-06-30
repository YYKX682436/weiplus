package pm0;

/* loaded from: classes7.dex */
public abstract class b0 {
    public static final java.lang.String a(java.lang.String originKey, java.util.HashMap hashMap) {
        kotlin.jvm.internal.o.g(originKey, "originKey");
        if (hashMap == null || !hashMap.containsKey(originKey)) {
            return originKey;
        }
        java.lang.String str = (java.lang.String) hashMap.get(originKey);
        return str == null ? "" : str;
    }

    public static final org.json.JSONObject b(java.lang.Object originObj) {
        kotlin.jvm.internal.o.g(originObj, "originObj");
        if (originObj instanceof com.tencent.mm.protobuf.e) {
            return ((com.tencent.mm.protobuf.e) originObj).toJSON();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        f(d(originObj, originObj.getClass(), null), jSONObject);
        return jSONObject;
    }

    public static final java.util.LinkedList c(java.util.LinkedList list, java.util.HashMap hashMap) {
        kotlin.jvm.internal.o.g(list, "list");
        java.lang.Object obj = list.size() > 0 ? list.get(0) : null;
        kotlin.jvm.internal.o.d(obj);
        if (obj.getClass().isPrimitive() || (obj instanceof java.lang.String)) {
            return list;
        }
        if (obj instanceof r45.du5) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().toString());
            }
            return linkedList;
        }
        if (!(obj instanceof com.tencent.mm.protobuf.f)) {
            return null;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            kotlin.jvm.internal.o.d(next);
            linkedList2.add(d(next, next.getClass(), hashMap));
        }
        return linkedList2;
    }

    public static final java.util.HashMap d(java.lang.Object obj, java.lang.Class clazz, java.util.HashMap hashMap) {
        java.util.LinkedList c17;
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.reflect.Field[] fields = clazz.getFields();
        kotlin.jvm.internal.o.d(fields);
        for (java.lang.reflect.Field field : fields) {
            try {
                java.lang.Object obj2 = field.get(obj);
                if (obj2 != null) {
                    if (!field.getType().isPrimitive() && !(obj2 instanceof java.lang.String)) {
                        if (obj2 instanceof com.tencent.mm.protobuf.f) {
                            if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                                java.lang.Class<?> type = field.getType();
                                kotlin.jvm.internal.o.f(type, "getType(...)");
                                java.util.HashMap d17 = d(obj2, type, hashMap);
                                java.lang.String name = field.getName();
                                kotlin.jvm.internal.o.f(name, "getName(...)");
                                hashMap2.put(a(name, hashMap), d17);
                            }
                        } else if ((obj2 instanceof java.util.LinkedList) && (c17 = c((java.util.LinkedList) obj2, hashMap)) != null) {
                            java.lang.String name2 = field.getName();
                            kotlin.jvm.internal.o.f(name2, "getName(...)");
                            hashMap2.put(a(name2, hashMap), c17);
                        }
                    }
                    java.lang.String name3 = field.getName();
                    kotlin.jvm.internal.o.f(name3, "getName(...)");
                    hashMap2.put(a(name3, hashMap), obj2);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return hashMap2;
    }

    public static final void e(java.util.List list, org.json.JSONArray array) {
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(array, "array");
        for (java.lang.Object obj : list) {
            if (obj instanceof java.util.LinkedList) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                e((java.util.List) obj, jSONArray);
                array.put(jSONArray);
            } else if (obj instanceof java.util.Map) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                f((java.util.Map) obj, jSONObject);
                array.put(jSONObject);
            } else {
                array.put(obj);
            }
        }
    }

    public static final void f(java.util.Map map, org.json.JSONObject obj) {
        kotlin.jvm.internal.o.g(map, "map");
        kotlin.jvm.internal.o.g(obj, "obj");
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value instanceof java.util.Map) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                f((java.util.Map) value, jSONObject);
                obj.put(str, jSONObject);
            } else if (value instanceof java.util.LinkedList) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                e((java.util.LinkedList) value, jSONArray);
                obj.put(str, jSONArray);
            } else if (value instanceof java.lang.Long) {
                obj.put(str, value.toString());
            } else {
                obj.put(str, value);
            }
        }
    }

    public static final org.json.JSONObject g(java.lang.Object originObj) {
        kotlin.jvm.internal.o.g(originObj, "originObj");
        try {
            return b(originObj);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("safePbToJSON", "[safePbToJSON] e:" + e17.getMessage());
            return new org.json.JSONObject();
        }
    }

    public static final com.tencent.mm.protobuf.g h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
    }
}
