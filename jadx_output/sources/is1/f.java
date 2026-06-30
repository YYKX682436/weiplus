package is1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final is1.f f294413d = new is1.f();

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.String i18 = is1.l.i();
        com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplInfoManager", "cleanInvalidTmpl saveDir:%s", i18);
        com.tencent.mm.vfs.r6 l17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.l(i18);
        if (!l17.m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplInfoManager", "fileDir:%s is not exist, err", i18);
            return;
        }
        if (!l17.y()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplInfoManager", "fileDir:%s is not dir, err", i18);
            return;
        }
        com.tencent.mm.vfs.r6[] G = l17.G();
        if (G != null) {
            if (!(G.length == 0)) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                is1.l lVar = is1.l.f294423a;
                for (java.lang.Integer num : (java.lang.Integer[]) ((jz5.n) is1.l.f294426d).getValue()) {
                    int intValue = num.intValue();
                    r45.vm6 j17 = is1.l.j(lVar, intValue, null, 2, null);
                    java.util.Set stringSet = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().getStringSet(com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.f(is1.l.f(intValue)), new java.util.HashSet());
                    kotlin.jvm.internal.o.d(stringSet);
                    java.util.List<java.lang.String> S0 = kz5.n0.S0(stringSet);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(S0, 10));
                    for (java.lang.String str2 : S0) {
                        r45.vm6 vm6Var = new r45.vm6();
                        kotlin.jvm.internal.o.d(str2);
                        lVar.l(vm6Var, intValue, str2);
                        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        arrayList2.add(vm6Var);
                    }
                    for (r45.vm6 vm6Var2 : kz5.n0.K0(kz5.n0.F0(arrayList2, new is1.g()), ((java.lang.Number) ((jz5.n) is1.l.f294430h).getValue()).intValue())) {
                        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.j(vm6Var2)) {
                            arrayList.add(com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.a(vm6Var2));
                        }
                        if (j17.f388373e != vm6Var2.f388373e) {
                            java.lang.String a17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.a(vm6Var2);
                            com.tencent.mm.vfs.r6 l18 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.l(a17);
                            if (l18.y()) {
                                com.tencent.mm.vfs.r6[] G2 = l18.G();
                                if (G2 != null) {
                                    int length = G2.length;
                                    while (i17 < length) {
                                        com.tencent.mm.vfs.r6 r6Var = G2[i17];
                                        java.lang.String o17 = r6Var.o();
                                        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                                        if (!((r26.t) ((jz5.n) is1.l.f294431i).getValue()).e(o17)) {
                                            java.lang.String o18 = r6Var.o();
                                            kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                                            i17 = r26.i0.n(o18, ".js.utf16", false) ? 0 : i17 + 1;
                                        }
                                        r6Var.l();
                                        r6Var.u();
                                    }
                                }
                            } else {
                                com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplInfoManager", "deleteInvalidCacheFile fileDir:%s is not dir, err", a17);
                            }
                        }
                    }
                }
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                    if (com.tencent.mm.sdk.platformtools.y3.b(r6Var2.B(), 604800000L)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(r6Var2.o());
                        sb6.append(r6Var2.y() ? "/" : "");
                        if (!arrayList.contains(sb6.toString())) {
                            arrayList3.add(r6Var2.o());
                        }
                    }
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
                if (1 >= com.tencent.mars.xlog.Log.getLogLevel()) {
                    arrayList.size();
                }
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    java.lang.String str6 = (java.lang.String) it.next();
                    kotlin.jvm.internal.o.d(str6);
                    if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.l(str6).y()) {
                        com.tencent.mm.vfs.w6.g(str6, true);
                    } else {
                        com.tencent.mm.vfs.w6.h(str6);
                    }
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplInfoManager", "files is null");
    }
}
