package dq1;

/* loaded from: classes8.dex */
public final class m extends dq1.a {
    public m() {
        dq1.u[] uVarArr = dq1.u.f242358d;
    }

    @Override // dq1.k
    public boolean a(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI ui6, dq1.b context, com.tencent.mm.protobuf.g actionBuffer, com.tencent.mm.protobuf.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f242353a;
        if (!pVar.a(dq1.c.f242346d, context, pVar.b())) {
            return false;
        }
        ui6.f93876g = true;
        r45.m00 m00Var = new r45.m00();
        try {
            m00Var.parseFrom(actionBuffer.g());
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = m00Var.f380040d;
            b1Var.f317012a = m00Var.f380041e;
            b1Var.f317022f = m00Var.f380042f;
            b1Var.f317016c = m00Var.f380043g;
            b1Var.f317034l = m00Var.f380045i;
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            b1Var.f317041s = appBrandLaunchReferrer;
            appBrandLaunchReferrer.f77323e = m00Var.f380046m;
            appBrandLaunchReferrer.f77322d = 8;
            b1Var.f317032k = 1065;
            b1Var.L = new dq1.l(new java.lang.ref.WeakReference(ui6));
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSchemeMiniProgram", "WeAppOpenBundle init, appid = " + b1Var.f317014b + ", username = " + b1Var.f317012a + ", enterPath = " + b1Var.f317022f + ", versionType = " + b1Var.f317016c);
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(ui6.getContext(), b1Var);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = ui6.f93877h;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeMiniProgram", "e = " + e17.getMessage());
            return false;
        }
    }
}
