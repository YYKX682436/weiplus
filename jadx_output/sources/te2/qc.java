package te2;

/* loaded from: classes9.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public static final te2.qc f418364a = new te2.qc();

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.e());
        sb6.append("gamewelfaretaskminiapphelper/");
        java.lang.String a17 = en1.a.a();
        kotlin.jvm.internal.o.f(a17, "username(...)");
        byte[] bytes = a17.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        java.lang.String sb7 = sb6.toString();
        if (!com.tencent.mm.vfs.w6.j(sb7)) {
            com.tencent.mm.vfs.w6.u(sb7);
        }
        return sb7 + "/snapshot";
    }

    public final void b(android.content.Context context, java.lang.String appId, java.lang.String path, int i17, com.tencent.mm.protobuf.g gVar, yz5.l lVar) {
        java.lang.String str;
        android.graphics.Bitmap d17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("GameWelfareTaskMiniAppHelper", "#goMiniApp appId=" + appId + " path=" + path + " version=" + i17 + " extraData=" + gVar);
        if (((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ni()) {
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                try {
                    android.view.View decorView = mMActivity.getWindow().getDecorView();
                    kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
                    d17 = uj5.g.d(decorView, decorView.getWidth(), decorView.getHeight(), false, android.graphics.Bitmap.Config.RGB_565);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("GameWelfareTaskMiniAppHelper", th6, "getSnapShot err", new java.lang.Object[0]);
                }
                if (d17 != null) {
                    str = a();
                    if (com.tencent.mm.vfs.w6.j(str)) {
                        com.tencent.mm.vfs.w6.h(str);
                    }
                    com.tencent.mm.sdk.platformtools.x.D0(d17, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317014b = appId;
                    b1Var.f317022f = path;
                    b1Var.f317016c = i17;
                    b1Var.f317028i = new te2.nc(gVar);
                    b1Var.H = k91.z3.TRANSPARENT;
                    k91.y3 y3Var = k91.y3.DISABLED;
                    b1Var.S = y3Var;
                    b1Var.T = y3Var;
                    b1Var.U = true;
                    b1Var.f317024g = true;
                    b1Var.f317032k = 1205;
                    b1Var.I = str;
                    b1Var.K = true;
                    b1Var.f317038p = new te2.oc(lVar);
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
                }
            }
        }
        str = "";
        l81.b1 b1Var2 = new l81.b1();
        b1Var2.f317014b = appId;
        b1Var2.f317022f = path;
        b1Var2.f317016c = i17;
        b1Var2.f317028i = new te2.nc(gVar);
        b1Var2.H = k91.z3.TRANSPARENT;
        k91.y3 y3Var2 = k91.y3.DISABLED;
        b1Var2.S = y3Var2;
        b1Var2.T = y3Var2;
        b1Var2.U = true;
        b1Var2.f317024g = true;
        b1Var2.f317032k = 1205;
        b1Var2.I = str;
        b1Var2.K = true;
        b1Var2.f317038p = new te2.oc(lVar);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var2);
    }
}
