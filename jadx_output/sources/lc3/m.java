package lc3;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.o f317909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(lc3.o oVar) {
        super(0);
        this.f317909d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lc3.f r17;
        long j17;
        lc3.o oVar = this.f317909d;
        if (oVar.f317913e == null) {
            boolean j18 = oVar.j();
            java.lang.String str = oVar.f317894d;
            if (!j18 || oVar.x()) {
                if (oVar.i() && !oVar.x()) {
                    com.tencent.mars.xlog.Log.i("MircoMsg.MBBootsPkgManagementBase", "try use boots pkg, instance:" + str);
                    com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo Ni = ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Ni(oVar.m());
                    if (Ni != null) {
                        long V = com.tencent.mm.sdk.platformtools.t8.V(Ni.f147866o, -1L);
                        lc3.a k17 = oVar.k();
                        j17 = k17 != null ? k17.f317879b : -1L;
                        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MagicBootsPkgVersion");
                            java.lang.String lowerCase = oVar.m().toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                            long q17 = M.q(lowerCase, j17);
                            if (j17 != q17) {
                                com.tencent.mars.xlog.Log.i("MircoMsg.MBBootsPkgManagementBase", "change asset version from " + j17 + " to settledVersion:" + q17);
                                j17 = q17;
                            }
                        } else {
                            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        }
                        if (V > j17) {
                            com.tencent.mars.xlog.Log.i("MircoMsg.MBBootsPkgManagementBase", "use boots pkg,instance:" + str + ",bootsPkgVersion:" + V + ",basePkgVersion:" + j17);
                            r17 = new lc3.h(oVar, Ni);
                        } else {
                            r17 = oVar.r();
                        }
                    } else {
                        r17 = oVar.r();
                    }
                    oVar.f317913e = r17;
                }
                r17 = oVar.r();
                oVar.f317913e = r17;
            } else {
                com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(oVar.u(), oVar.v());
                if (Ui != null) {
                    long j19 = Ui.f217590e;
                    lc3.a k18 = oVar.k();
                    j17 = k18 != null ? k18.f317881d : -1L;
                    if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("MagicBootsPkgVersion");
                        java.lang.String lowerCase2 = oVar.m().toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
                        long q18 = M2.q(lowerCase2, j17);
                        if (j17 != q18) {
                            com.tencent.mars.xlog.Log.i("MircoMsg.MBBootsPkgManagementBase", "change asset version from " + j17 + " to settledVersion:" + q18);
                            j17 = q18;
                        }
                    } else {
                        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                    if (j19 > 0 && j19 > j17) {
                        com.tencent.mars.xlog.Log.i("MircoMsg.MBBootsPkgManagementBase", "use udr pkg,instance:" + str + ",udrPkgVersion:" + j19 + ",basePkgVersion:" + j17);
                        r17 = new lc3.i(oVar, Ui);
                        oVar.f317913e = r17;
                    }
                }
                com.tencent.mars.xlog.Log.i("MircoMsg.MBBootsPkgManagementBase", "udr pkg not exist,instance:" + str);
                r17 = oVar.r();
                oVar.f317913e = r17;
            }
        }
        lc3.f fVar = oVar.f317913e;
        kotlin.jvm.internal.o.d(fVar);
        return fVar;
    }
}
