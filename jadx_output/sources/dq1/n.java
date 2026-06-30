package dq1;

/* loaded from: classes8.dex */
public final class n extends dq1.a {
    public n() {
        dq1.u[] uVarArr = dq1.u.f242358d;
    }

    @Override // dq1.k
    public boolean a(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI ui6, dq1.b context, com.tencent.mm.protobuf.g actionBuffer, com.tencent.mm.protobuf.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionBuffer, "actionBuffer");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSchemeQQAssistantProfile", "handle BizSchemeQQAssistantProfile");
        dq1.p pVar = dq1.p.f242353a;
        if (!pVar.a(dq1.c.f242346d, context, pVar.b())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizSchemeQQAssistantProfile", "contextSelfCheck failed");
            return false;
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigQQAssistant()) != 1 || c01.e2.a0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizSchemeQQAssistantProfile", "QQAssistant closed");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSchemeQQAssistantProfile", "ready to jump QQAssistant from deeplink.");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", "gh_051d9102de63");
        intent.putExtra("Contact_NeedBackToLauncherUI", true);
        intent.addFlags(268435456);
        j45.l.j(ui6.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSchemeQQAssistantProfile", "start QQAssistant from BizSchemeQQAssistantProfile.");
        return true;
    }
}
