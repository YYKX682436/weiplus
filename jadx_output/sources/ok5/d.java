package ok5;

/* loaded from: classes12.dex */
public abstract class d {
    public static final java.lang.Object a(android.content.Intent intent, java.lang.String key) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Map b17 = ok5.c.f346065a.b(intent);
        ok5.e eVar = b17 != null ? (ok5.e) b17.get(key) : null;
        if (eVar != null) {
            eVar.f346070d.a(eVar);
        }
        if (eVar != null) {
            return eVar.f346069c;
        }
        return null;
    }

    public static final android.content.Intent b(android.content.Intent intent, java.lang.String key, java.lang.Object obj, ok5.g removeObjStrategy) {
        int i17;
        kotlin.jvm.internal.o.g(intent, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(removeObjStrategy, "removeObjStrategy");
        ok5.c cVar = ok5.c.f346065a;
        ok5.e eVar = new ok5.e(intent, key, obj, removeObjStrategy);
        if (intent.hasExtra("KEY_PUT_OBJECT_MAP_ID")) {
            i17 = intent.getIntExtra("KEY_PUT_OBJECT_MAP_ID", 0);
        } else {
            int nextInt = new java.util.Random().nextInt();
            intent.putExtra("KEY_PUT_OBJECT_MAP_ID", nextInt);
            i17 = nextInt;
        }
        java.util.Map map = ok5.c.f346066b;
        java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (map2 == null) {
            map2 = new java.util.LinkedHashMap();
            map.put(java.lang.Integer.valueOf(i17), map2);
        }
        map2.put(key, eVar);
        removeObjStrategy.b(eVar);
        return intent;
    }

    public static final void c(android.content.Intent intent, e14.k params) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        kotlin.jvm.internal.o.g(params, "params");
        intent.putExtra("intent_params_".concat(params.getClass().getSimpleName()), params.toXml());
    }
}
