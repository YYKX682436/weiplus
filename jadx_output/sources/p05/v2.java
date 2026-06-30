package p05;

@j95.b
/* loaded from: classes5.dex */
public final class v2 extends i95.w implements rh0.x {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.v2 f350704d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f350705e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f350706f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f350707g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.LinkedList f350708h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f350709i;

    static {
        p05.v2 v2Var = new p05.v2();
        f350704d = v2Var;
        f350705e = "MicroMsg.WeVisEffectConfigMgr";
        f350706f = 604800000L;
        f350707g = 86400000L;
        f350708h = new java.util.LinkedList();
        f350709i = new java.util.concurrent.ConcurrentHashMap();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            pm0.v.V(5000L, p05.o2.f350631d);
        } else {
            v2Var.Di();
        }
    }

    public java.util.Map Ai(rh0.z scene) {
        java.lang.String str;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.Set<java.util.Map.Entry> entrySet;
        kotlin.jvm.internal.o.g(scene, "scene");
        java.util.HashMap hashMap = new java.util.HashMap();
        switch (scene.ordinal()) {
            case 0:
            case 4:
                str = "voip";
                break;
            case 1:
                str = "zpbq";
                break;
            case 2:
            case 3:
                str = "livevlog";
                break;
            case 5:
                str = "sightcameracap";
                break;
            case 6:
                str = "livepusher";
                break;
            case 7:
            default:
                str = null;
                break;
            case 8:
                str = "miaojian";
                break;
            case 9:
                str = com.eclipsesource.mmv8.Platform.UNKNOWN;
                break;
        }
        if (str != null && (concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f350709i.get(str)) != null && (entrySet = concurrentHashMap.entrySet()) != null) {
            for (java.util.Map.Entry entry : entrySet) {
                java.lang.Object key = entry.getKey();
                kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                hashMap.put(key, java.lang.String.valueOf(((r45.r87) entry.getValue()).f384646f));
            }
        }
        return hashMap;
    }

    public final com.tencent.mm.sdk.platformtools.o4 Bi() {
        return p05.p3.f350639a.b();
    }

    public final void Di() {
        r45.t87 t87Var = new r45.t87();
        com.tencent.mm.sdk.platformtools.o4 Bi = Bi();
        p05.p3 p3Var = p05.p3.f350639a;
        byte[] j17 = Bi.j("effect_config");
        if (j17 != null) {
            try {
                t87Var.parseFrom(j17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        Ni(t87Var, false);
    }

    public final void Ni(r45.t87 t87Var, boolean z17) {
        java.util.LinkedList<r45.r87> linkedList = f350708h;
        linkedList.clear();
        linkedList.addAll(t87Var.f386208d);
        for (r45.r87 r87Var : linkedList) {
            java.lang.String str = r87Var.f384647g;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f350709i;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(str);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
                java.lang.String Scenario = r87Var.f384647g;
                kotlin.jvm.internal.o.f(Scenario, "Scenario");
                concurrentHashMap.put(Scenario, concurrentHashMap2);
            }
            java.lang.String ConfigKey = r87Var.f384644d;
            kotlin.jvm.internal.o.f(ConfigKey, "ConfigKey");
            concurrentHashMap2.put(ConfigKey, r87Var);
            com.tencent.mars.xlog.Log.i(f350705e, "updateConfigMap: scene:" + r87Var.f384647g + ", key:" + r87Var.f384644d + ", value:" + r87Var.f384646f);
        }
        int i17 = com.tencent.mm.plugin.xlabeffect.WeVisUpdateReceiver.f188595a;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.WeVisUpdate");
            intent.putExtra("type", "effect_config");
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }

    public java.lang.String wi(rh0.z scene, java.lang.String configKey) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(configKey, "configKey");
        return (java.lang.String) ((java.util.HashMap) Ai(scene)).get(configKey);
    }
}
