package com.tencent.youtu.ytcommon.tools.wejson;

/* loaded from: classes13.dex */
public class WeJson {
    private static final java.lang.String EMPTY_ARR = "[]";
    private static final java.lang.String EMPTY_MAP = "{}";

    private <T> T fromArr(org.json.JSONArray jSONArray, java.lang.Class<T> cls) {
        java.lang.Class<?> componentType = cls.getComponentType();
        T t17 = (T) java.lang.reflect.Array.newInstance(componentType, jSONArray.length());
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            java.lang.reflect.Array.set(t17, i17, fromJsonData(getObject(jSONArray, i17), componentType, componentType));
        }
        return t17;
    }

    private <T> T fromJsonArr(org.json.JSONArray jSONArray, java.lang.Class<T> cls, java.lang.Class<?> cls2) {
        if (cls.equals(java.util.List.class)) {
            return (T) fromList(jSONArray, cls, cls2);
        }
        if (cls.isArray()) {
            return (T) fromArr(jSONArray, cls);
        }
        throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("json 解析错误:不支持的类型:".concat(cls.getName()));
    }

    private java.lang.Object fromJsonData(java.lang.Object obj, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        return obj instanceof org.json.JSONArray ? fromJsonArr((org.json.JSONArray) obj, cls, cls2) : obj instanceof org.json.JSONObject ? fromJsonObj((org.json.JSONObject) obj, cls, cls2) : obj;
    }

    private <T> T fromJsonObj(org.json.JSONObject jSONObject, java.lang.Class<T> cls, java.lang.Class<?> cls2) {
        return cls.equals(java.util.Map.class) ? (T) fromMap(jSONObject, cls, cls2) : (T) fromPojo(jSONObject, cls);
    }

    private java.util.List fromList(org.json.JSONArray jSONArray, java.lang.Class<java.util.List> cls, java.lang.Class<?> cls2) {
        java.util.List newInstance;
        if (cls2 == null) {
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("无法确定列表项的类型");
        }
        if (cls.getName().equals("java.util.List")) {
            newInstance = new java.util.ArrayList();
        } else {
            try {
                newInstance = cls.newInstance();
            } catch (java.lang.Exception e17) {
                throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("创建List类型失败,该列表不支持无参实例化", e17);
            }
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            java.lang.Object object = getObject(jSONArray, i17);
            if (object instanceof org.json.JSONArray) {
                newInstance.add(fromJsonArr((org.json.JSONArray) object, cls, cls2));
            } else if (object instanceof org.json.JSONObject) {
                newInstance.add(fromJsonObj((org.json.JSONObject) object, cls, cls2));
            } else {
                newInstance.add(object);
            }
        }
        return newInstance;
    }

    private java.util.Map fromMap(org.json.JSONObject jSONObject, java.lang.Class<java.util.Map> cls, java.lang.Class<?> cls2) {
        java.util.Map newInstance;
        if (cls2 == null) {
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("无法确定列表项的类型");
        }
        if (cls.getName().equals("java.util.Map")) {
            newInstance = new java.util.HashMap();
        } else {
            try {
                newInstance = cls.newInstance();
            } catch (java.lang.Exception e17) {
                throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("创建Map类型失败,该Map不支持无参实例化", e17);
            }
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object object = getObject(jSONObject, next);
            if (object != null) {
                newInstance.put(next, fromJsonData(object, cls, cls2));
            } else {
                newInstance.put(next, null);
            }
        }
        return newInstance;
    }

    private <T> T fromPojo(org.json.JSONObject jSONObject, java.lang.Class<T> cls) {
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        java.lang.Class<? super T> superclass = cls.getSuperclass();
        java.lang.reflect.Field[] fieldArr = new java.lang.reflect.Field[0];
        if (superclass != null) {
            fieldArr = superclass.getDeclaredFields();
        }
        int length = declaredFields.length + fieldArr.length;
        java.lang.reflect.Field[] fieldArr2 = new java.lang.reflect.Field[length];
        for (int i17 = 0; i17 < declaredFields.length; i17++) {
            fieldArr2[i17] = declaredFields[i17];
        }
        for (int length2 = declaredFields.length; length2 < length; length2++) {
            fieldArr2[length2] = fieldArr[length2 - declaredFields.length];
        }
        if (length == 0) {
            return null;
        }
        try {
            T newInstance = cls.newInstance();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.reflect.Field field = fieldArr2[i18];
                java.lang.String name = field.getName();
                if (!name.contains("$")) {
                    int modifiers = field.getModifiers();
                    java.lang.Object opt = jSONObject.opt(name);
                    if (opt == null) {
                        continue;
                    } else {
                        java.lang.Object fromJsonData = fromJsonData(opt, getMemberType(cls, field), getSubType(cls, field, opt));
                        if (org.json.JSONObject.NULL.equals(fromJsonData)) {
                            fromJsonData = null;
                        }
                        if ((modifiers & 1) != 0) {
                            try {
                                field.set(newInstance, fromJsonData);
                            } catch (java.lang.IllegalAccessException e17) {
                                throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("设置成员变量值失败.", e17);
                            }
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set");
                            sb6.append(name.substring(0, 1).toUpperCase());
                            sb6.append(name.length() == 1 ? "" : name.substring(1));
                            try {
                                try {
                                    cls.getMethod(sb6.toString(), field.getType()).invoke(newInstance, fromJsonData);
                                } catch (java.lang.Exception e18) {
                                    throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("调用set方法失败.", e18);
                                }
                            } catch (java.lang.NoSuchMethodException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            return newInstance;
        } catch (java.lang.Exception e19) {
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("必须为该类型提供一个无参构造方法:".concat(cls.getName()), e19);
        }
    }

    private <T> java.lang.Class<?> getMemberType(java.lang.Class<T> cls, java.lang.reflect.Field field) {
        if (!(field.getGenericType() instanceof java.lang.reflect.TypeVariable)) {
            return field.getType();
        }
        cls.getTypeParameters();
        java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof java.lang.reflect.ParameterizedType)) {
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("缺少泛型信息:" + cls);
        }
        java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("不支持嵌套泛型");
    }

    private java.lang.Object getObject(org.json.JSONArray jSONArray, int i17) {
        try {
            return jSONArray.get(i17);
        } catch (org.json.JSONException e17) {
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("JSONArray.get() cause JSONException", e17);
        }
    }

    private <T> java.lang.Class<?> getSubType(java.lang.Class<T> cls, java.lang.reflect.Field field, java.lang.Object obj) {
        if (field.getGenericType() instanceof java.lang.reflect.TypeVariable) {
            cls.getTypeParameters();
            java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
            if (!(genericSuperclass instanceof java.lang.reflect.ParameterizedType)) {
                throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("缺少泛型信息:" + cls);
            }
            java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            if (type instanceof java.lang.Class) {
                return (java.lang.Class) type;
            }
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("不支持嵌套泛型");
        }
        if (field.getType().equals(java.util.List.class)) {
            java.lang.reflect.Type genericType = field.getGenericType();
            if (!(genericType instanceof java.lang.reflect.ParameterizedType)) {
                throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("缺少泛型类型声明:" + field.getName());
            }
            java.lang.reflect.Type type2 = ((java.lang.reflect.ParameterizedType) genericType).getActualTypeArguments()[0];
            if (type2 instanceof java.lang.Class) {
                return (java.lang.Class) type2;
            }
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("不支持嵌套泛型:" + field.getName());
        }
        if (!field.getType().equals(java.util.Map.class)) {
            return field.getType();
        }
        java.lang.reflect.Type genericType2 = field.getGenericType();
        if (!(genericType2 instanceof java.lang.reflect.ParameterizedType)) {
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("缺少泛型类型声明:" + field.getName());
        }
        java.lang.reflect.Type type3 = ((java.lang.reflect.ParameterizedType) genericType2).getActualTypeArguments()[1];
        if (type3 instanceof java.lang.Class) {
            return (java.lang.Class) type3;
        }
        throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("不支持嵌套泛型:" + field.getName());
    }

    private java.lang.String getValidStr(java.lang.String str) {
        return str.replace("\"", "\\\"").replace("\\", "\\\\").replace("\b", "\\b").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\t", "\\t");
    }

    private <T> boolean isPrimitivePackageType(T t17) {
        return (t17 instanceof java.lang.Integer) || (t17 instanceof java.lang.Short) || (t17 instanceof java.lang.Long) || (t17 instanceof java.lang.Byte) || (t17 instanceof java.lang.Boolean) || (t17 instanceof java.lang.Float) || (t17 instanceof java.lang.Double) || (t17 instanceof java.lang.Character);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void process(java.lang.StringBuilder sb6, T t17) {
        if (t17.getClass().isPrimitive()) {
            sb6.append(t17);
            return;
        }
        if (t17 instanceof java.lang.String) {
            sb6.append('\"');
            sb6.append(getValidStr((java.lang.String) t17));
            sb6.append('\"');
        } else {
            if (isPrimitivePackageType(t17)) {
                sb6.append(t17);
                return;
            }
            if (t17.getClass().isArray()) {
                processArr(sb6, (java.lang.Object[]) t17);
                return;
            }
            if (t17 instanceof java.lang.Iterable) {
                processIterable(sb6, (java.lang.Iterable) t17);
            } else if (t17 instanceof java.util.Map) {
                processMap(sb6, (java.util.Map) t17);
            } else {
                processObj(sb6, t17);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void processArr(java.lang.StringBuilder sb6, java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            sb6.append(EMPTY_ARR);
            return;
        }
        sb6.append('[');
        for (int i17 = 0; i17 < objArr.length; i17++) {
            process(sb6, objArr[i17]);
            if (i17 < objArr.length - 1) {
                sb6.append(',');
            }
        }
        sb6.append(']');
    }

    private void processIterable(java.lang.StringBuilder sb6, java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        sb6.append('[');
        int i17 = 0;
        while (it.hasNext()) {
            i17++;
            process(sb6, it.next());
            sb6.append(',');
        }
        if (i17 > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        sb6.append(']');
    }

    private void processMap(java.lang.StringBuilder sb6, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map.size() == 0) {
            sb6.append(EMPTY_MAP);
            return;
        }
        sb6.append('{');
        int size = map.size();
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            java.lang.String key = entry.getKey();
            if (key != null && !key.equals("") && value != null && (!(value instanceof java.lang.String) || !entry.equals(""))) {
                sb6.append('\"');
                sb6.append(key);
                sb6.append('\"');
                sb6.append(':');
                process(sb6, value);
                if (i17 < size - 1) {
                    sb6.append(',');
                }
                i17++;
            }
        }
        sb6.append('}');
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void processObj(java.lang.StringBuilder sb6, T t17) {
        java.lang.Object invoke;
        java.lang.reflect.Field[] declaredFields = t17.getClass().getDeclaredFields();
        java.lang.reflect.Field[] declaredFields2 = t17.getClass().getSuperclass().getDeclaredFields();
        int length = declaredFields.length + declaredFields2.length;
        java.lang.reflect.Field[] fieldArr = new java.lang.reflect.Field[length];
        int i17 = 0;
        for (int i18 = 0; i18 < declaredFields.length; i18++) {
            fieldArr[i18] = declaredFields[i18];
        }
        for (int length2 = declaredFields.length; length2 < length; length2++) {
            fieldArr[length2] = declaredFields2[length2 - declaredFields.length];
        }
        if (length == 0) {
            sb6.append(EMPTY_MAP);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int i19 = 0;
        while (true) {
            java.lang.String str = "";
            if (i19 >= length) {
                break;
            }
            try {
                java.lang.reflect.Field field = fieldArr[i19];
                int modifiers = field.getModifiers();
                if ((modifiers & 8) == 0) {
                    java.lang.String name = field.getName();
                    if (!name.contains("$")) {
                        if ((modifiers & 1) != 0) {
                            java.lang.Object obj = field.get(t17);
                            if (obj != null) {
                                hashMap.put(name, obj);
                            }
                        } else {
                            java.lang.Class<?> cls = t17.getClass();
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append("get");
                            sb7.append(name.substring(0, 1).toUpperCase());
                            if (name.length() != 1) {
                                str = name.substring(1);
                            }
                            sb7.append(str);
                            java.lang.reflect.Method method = cls.getMethod(sb7.toString(), new java.lang.Class[0]);
                            if (method != null && (invoke = method.invoke(t17, new java.lang.Object[0])) != null) {
                                hashMap.put(name, invoke);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            i19++;
        }
        sb6.append('{');
        int size = hashMap.size();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            i17++;
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (!(value instanceof java.lang.String) || !value.equals("")) {
                sb6.append('\"');
                sb6.append(str2);
                sb6.append('\"');
                sb6.append(':');
                process(sb6, value);
                if (i17 < size) {
                    sb6.append(',');
                }
            }
        }
        sb6.append('}');
    }

    public <T> T fromJson(java.lang.String str, java.lang.Class<T> cls) {
        if (str == null) {
            return null;
        }
        if (cls == null) {
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("必须指定classOfT");
        }
        java.lang.String trim = str.trim();
        if (trim.startsWith("[")) {
            try {
                T t17 = (T) fromJsonArr(new org.json.JSONArray(trim), cls, null);
                if (t17 != null) {
                    return t17;
                }
            } catch (java.lang.Exception e17) {
                throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("json 解析错误" + e17.getMessage(), e17);
            }
        } else if (trim.startsWith("{")) {
            try {
                return (T) fromJsonObj(new org.json.JSONObject(trim), cls, null);
            } catch (java.lang.Exception e18) {
                throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("json 解析错误:" + e18.getMessage(), e18);
            }
        }
        throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("classOfT 指定错误");
    }

    public <T> java.lang.String toJson(T t17) {
        return toJson(t17, 0);
    }

    public <T> java.lang.String toJson(T t17, int i17) {
        if (t17 == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        process(sb6, t17);
        return sb6.toString();
    }

    private java.lang.Object getObject(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            return jSONObject.get(str);
        } catch (org.json.JSONException e17) {
            throw new com.tencent.youtu.ytcommon.tools.wejson.WeJsonException("JSONObject.get() cause JSONException", e17);
        }
    }
}
