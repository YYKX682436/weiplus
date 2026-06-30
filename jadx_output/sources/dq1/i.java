package dq1;

/* loaded from: classes8.dex */
public final class i extends dq1.a {
    public i() {
        dq1.u[] uVarArr = dq1.u.f242358d;
    }

    @Override // dq1.k
    public boolean a(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI ui6, dq1.b context, com.tencent.mm.protobuf.g actionBuffer, com.tencent.mm.protobuf.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f242353a;
        if (!pVar.a(dq1.c.f242347e, context, pVar.b())) {
            return false;
        }
        r45.n00 n00Var = new r45.n00();
        try {
            n00Var.parseFrom(actionBuffer.g());
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSchemeH5NoLoginPage", "urlActionBuffer.url:" + n00Var.f380971d);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", n00Var.f380971d);
            intent.putExtra("showShare", false);
            intent.putExtra("KRightBtn", true);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
            intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
            j45.l.j(ui6, "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.ui.widget.dialog.u3 u3Var = ui6.f93877h;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeH5NoLoginPage", "e = " + e17.getMessage());
            return false;
        }
    }
}
