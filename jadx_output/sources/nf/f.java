package nf;

/* loaded from: classes7.dex */
public abstract class f {
    public static org.json.JSONObject a(android.os.PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.String str : persistableBundle.keySet()) {
            java.lang.Object obj = persistableBundle.get(str);
            if (obj instanceof android.os.PersistableBundle) {
                jSONObject.put(str, a((android.os.PersistableBundle) obj));
            } else {
                jSONObject.put(str, obj);
            }
        }
        return jSONObject;
    }

    public static java.lang.Boolean b(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        java.lang.String str = (java.lang.String) obj;
        if ("true".equalsIgnoreCase(str)) {
            return java.lang.Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    public static void c(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if ((key instanceof java.lang.String) && (value instanceof java.util.Map)) {
                java.util.Map map2 = (java.util.Map) value;
                c(map2);
                map.put(key, new org.json.JSONObject(map2));
            }
        }
    }
}
