package p05;

/* loaded from: classes5.dex */
public final class t2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.t2 f350692a = new p05.t2();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        rh0.z zVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.t87 t87Var = (r45.t87) fVar.f70618d;
        java.lang.String str = p05.v2.f350705e;
        com.tencent.mars.xlog.Log.i(str, "CgiWeVisGetEffectConfig: " + i17 + ", " + i18);
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resp: runScore: ");
            sb6.append(t87Var.f386209e);
            sb6.append(", size:");
            java.util.LinkedList<r45.r87> linkedList = t87Var.f386208d;
            sb6.append(linkedList.size());
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            for (r45.r87 r87Var : linkedList) {
                com.tencent.mars.xlog.Log.i(p05.v2.f350705e, "resp: key:" + r87Var.f384644d + ", value:" + r87Var.f384646f + ", name:" + r87Var.f384645e + ", scene:" + r87Var.f384647g + ", device:" + r87Var.f384648h);
            }
            p05.v2 v2Var = p05.v2.f350704d;
            com.tencent.mm.sdk.platformtools.o4 Bi = v2Var.Bi();
            p05.p3 p3Var = p05.p3.f350639a;
            Bi.H("effect_config", pm0.v.D(t87Var));
            v2Var.Ni(t87Var, true);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = p05.v2.f350709i;
            java.util.Set entrySet = concurrentHashMap.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            java.util.Iterator it = entrySet.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                p05.n2 n2Var = p05.n2.f350626a;
                if (hasNext) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.Object key = entry.getKey();
                    kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                    java.lang.String str2 = (java.lang.String) key;
                    p05.v2.f350704d.getClass();
                    switch (str2.hashCode()) {
                        case -284840886:
                            if (str2.equals(com.eclipsesource.mmv8.Platform.UNKNOWN)) {
                                zVar = rh0.z.f395619p;
                                break;
                            }
                            break;
                        case 3625376:
                            if (str2.equals("voip")) {
                                zVar = rh0.z.f395611e;
                                break;
                            }
                            break;
                        case 3745285:
                            if (str2.equals("zpbq")) {
                                zVar = rh0.z.f395612f;
                                break;
                            }
                            break;
                        case 1418699258:
                            if (str2.equals("livevlog")) {
                                zVar = rh0.z.f395613g;
                                break;
                            }
                            break;
                        case 1702014259:
                            if (str2.equals("livepusher")) {
                                zVar = rh0.z.f395617n;
                                break;
                            }
                            break;
                        case 2091275664:
                            if (str2.equals("sightcameracap")) {
                                zVar = rh0.z.f395616m;
                                break;
                            }
                            break;
                    }
                    zVar = null;
                    java.util.Set entrySet2 = ((java.util.concurrent.ConcurrentHashMap) entry.getValue()).entrySet();
                    kotlin.jvm.internal.o.f(entrySet2, "<get-entries>(...)");
                    java.lang.String g07 = kz5.n0.g0(entrySet2, ";", null, null, 0, null, p05.u2.f350698d, 30, null);
                    if (zVar != null) {
                        n2Var.a(zVar.ordinal(), g07);
                    }
                } else if (concurrentHashMap.isEmpty()) {
                    n2Var.a(-1, "");
                }
            }
        } else if (i17 == 4) {
            com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct wevisionSwitchResStruct = new com.tencent.mm.autogen.mmdata.rpt.WevisionSwitchResStruct();
            if (tq5.i.f421269a == 0) {
                tq5.i.f421269a = 2014500;
            }
            wevisionSwitchResStruct.f62979d = tq5.i.f421269a;
            wevisionSwitchResStruct.f62981f = 10;
            wevisionSwitchResStruct.k();
        }
        return jz5.f0.f302826a;
    }
}
