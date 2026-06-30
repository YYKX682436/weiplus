package d75;

/* loaded from: classes12.dex */
public abstract class b {
    public static final java.lang.String a(java.lang.String str, java.lang.String tagName) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        if (str != null) {
            int L = r26.n0.L(str, "<".concat(tagName), 0, false, 6, null);
            int P = r26.n0.P(str, "</" + tagName + '>', 0, false, 6, null);
            boolean z17 = false;
            if (L >= 0 && L < P) {
                z17 = true;
            }
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String substring = str.substring(L, P);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                sb6.append(substring);
                sb6.append("</");
                sb6.append(tagName);
                sb6.append('>');
                return sb6.toString();
            }
        }
        return null;
    }

    public static final java.lang.Class b(java.lang.Class clazz, int i17) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.lang.reflect.Type genericSuperclass = clazz.getGenericSuperclass();
        kotlin.jvm.internal.o.f(genericSuperclass, "getGenericSuperclass(...)");
        while (!(genericSuperclass instanceof java.lang.reflect.ParameterizedType)) {
            genericSuperclass = clazz.getSuperclass().getGenericSuperclass();
            kotlin.jvm.internal.o.f(genericSuperclass, "getGenericSuperclass(...)");
        }
        java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[i17];
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        return null;
    }

    public static final java.util.List c(java.util.List originList, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(originList, "originList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i19 = 0;
        do {
            int i27 = i17 * i19;
            i19++;
            i18 = i17 * i19;
            if (originList.size() <= i18) {
                i18 = originList.size();
            }
            arrayList.add(originList.subList(i27, i18));
        } while (i18 < originList.size());
        return arrayList;
    }

    public static final java.util.Map d(java.util.List list, yz5.l keyMethod) {
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(keyMethod, "keyMethod");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : list) {
            linkedHashMap.put(keyMethod.invoke(obj), obj);
        }
        return linkedHashMap;
    }

    public static final java.util.Map e(org.json.JSONObject jSONObject, yz5.l transform) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(transform, "transform");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            kotlin.jvm.internal.o.d(next);
            java.lang.Object obj = jSONObject.get(next);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            hashMap.put(next, transform.invoke(obj));
        }
        return hashMap;
    }

    public static final int f(java.lang.String str) {
        int hashCode;
        if (str == null) {
            return 0;
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            hashCode = new java.math.BigInteger(1, messageDigest.digest(bytes)).intValue();
        } catch (java.security.NoSuchAlgorithmException unused) {
            hashCode = str.hashCode();
        }
        return hashCode & Integer.MAX_VALUE;
    }

    public static final void g(yz5.a block) {
        kotlin.jvm.internal.o.g(block, "block");
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            block.invoke();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new d75.a(block));
    }

    public static final java.lang.String h(java.lang.String str, java.lang.String tagName) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        if (str == null) {
            return null;
        }
        return "<" + tagName + '>' + str + "</" + tagName + '>';
    }
}
