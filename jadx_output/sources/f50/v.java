package f50;

/* loaded from: classes8.dex */
public final class v implements f50.a0, pi0.n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f50.v f259592a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f259593b;

    static {
        f50.v vVar = new f50.v();
        f259592a = vVar;
        f259593b = new java.util.HashMap();
        pi0.z.f354748a = vVar;
    }

    @Override // pi0.n0
    public void a(java.lang.String paramsKey, java.util.HashMap map) {
        kotlin.jvm.internal.o.g(paramsKey, "paramsKey");
        kotlin.jvm.internal.o.g(map, "map");
        r45.z33 z33Var = new r45.z33();
        r45.x33 x33Var = new r45.x33();
        e(x33Var, map);
        z33Var.f391672d = x33Var;
        f259593b.put(paramsKey, z33Var);
    }

    @Override // pi0.n0
    public java.lang.String b() {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        return uuid;
    }

    @Override // f50.a0
    public com.tencent.mm.protobuf.f c(byte[] bArr, java.lang.String engineId) {
        kotlin.jvm.internal.o.g(engineId, "engineId");
        r45.y33 y33Var = new r45.y33();
        if (bArr != null) {
            try {
                y33Var.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        java.lang.String paramsKey = y33Var.f390739d;
        kotlin.jvm.internal.o.f(paramsKey, "paramsKey");
        java.util.HashMap hashMap = f259593b;
        r45.z33 z33Var = (r45.z33) hashMap.get(paramsKey);
        hashMap.remove(paramsKey);
        return z33Var;
    }

    public final void d(r45.w33 w33Var, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            w33Var.f388831d = 1;
            w33Var.f388832e = (java.lang.String) obj;
            return;
        }
        if (obj instanceof java.lang.Short) {
            w33Var.f388831d = 2;
            w33Var.f388833f = ((java.lang.Number) obj).shortValue();
            return;
        }
        if (obj instanceof java.lang.Integer) {
            w33Var.f388831d = 2;
            w33Var.f388833f = ((java.lang.Number) obj).intValue();
            return;
        }
        if (obj instanceof java.lang.Long) {
            w33Var.f388831d = 2;
            w33Var.f388833f = ((java.lang.Number) obj).longValue();
            return;
        }
        if (obj instanceof java.lang.Float) {
            w33Var.f388831d = 4;
            w33Var.f388835h = ((java.lang.Number) obj).floatValue();
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            w33Var.f388831d = 3;
            w33Var.f388834g = ((java.lang.Boolean) obj).booleanValue();
            return;
        }
        if (obj instanceof com.tencent.mm.protobuf.g) {
            w33Var.f388831d = 5;
            w33Var.f388836i = (com.tencent.mm.protobuf.g) obj;
            return;
        }
        if (obj instanceof byte[]) {
            w33Var.f388831d = 5;
            w33Var.f388836i = new com.tencent.mm.protobuf.g((byte[]) obj);
            return;
        }
        if (obj instanceof java.util.List) {
            w33Var.f388831d = 6;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            w33Var.f388837m = linkedList;
            for (java.lang.Object obj2 : (java.util.List) obj) {
                if (obj2 != null) {
                    r45.w33 w33Var2 = new r45.w33();
                    d(w33Var2, obj2);
                    linkedList.add(w33Var2);
                }
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            r45.x33 x33Var = new r45.x33();
            e(x33Var, (java.util.Map) obj);
            w33Var.f388831d = 7;
            w33Var.f388838n = x33Var;
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterFuncEngineParams", "paramsItemFromValue unknown params type " + obj.getClass());
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public final void e(r45.x33 x33Var, java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getKey() instanceof java.lang.String) {
                r45.w33 w33Var = new r45.w33();
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    d(w33Var, value);
                    java.util.LinkedList linkedList = x33Var.f389751d;
                    java.lang.Object key = entry.getKey();
                    kotlin.jvm.internal.o.e(key, "null cannot be cast to non-null type kotlin.String");
                    linkedList.add((java.lang.String) key);
                    x33Var.f389752e.add(w33Var);
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("paramsMapFromMap unknown params key type ");
                java.lang.Object key2 = entry.getKey();
                sb6.append(key2 != null ? key2.getClass() : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterFuncEngineParams", sb6.toString());
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
        }
    }
}
