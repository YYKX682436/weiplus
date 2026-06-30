package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class y5 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.a6 f208262a;

    public y5(com.tencent.mm.ui.conversation.a6 a6Var) {
        this.f208262a = a6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.InitHelper", "onDialogClick %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mm.ui.conversation.b6 b6Var = this.f208262a.f207439d;
            com.tencent.mm.ui.conversation.q5 q5Var = b6Var.f207479e;
            int i17 = b6Var.f207478d.f380680s;
            q5Var.getClass();
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493422k42, com.tencent.mm.sdk.platformtools.m2.d(), java.lang.Integer.valueOf(i17), 1);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", string);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 28L, 1L, false);
        }
    }
}
