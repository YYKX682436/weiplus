package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class u4 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185432c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185435f;

    public u4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, nw4.y2 y2Var) {
        this.f185435f = c1Var;
        this.f185430a = str;
        this.f185431b = str2;
        this.f185432c = str3;
        this.f185433d = i17;
        this.f185434e = y2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        nw4.y2 y2Var = this.f185434e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185435f;
        if (!z17) {
            c1Var.i5(y2Var, "doResendRemittanceMsg:fail", null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(ya.b.TRANSACTION_ID, this.f185430a);
        intent.putExtra("transfer_id", this.f185431b);
        intent.putExtra("receiver_name", this.f185432c);
        intent.putExtra("resend_msg_from_flag", 4);
        intent.putExtra("is_open_im", this.f185433d);
        j45.l.j(c1Var.f184975d, "remittance", ".ui.RemittanceResendMsgUI", intent, null);
        c1Var.i5(y2Var, "doResendRemittanceMsg:ok", null);
    }
}
