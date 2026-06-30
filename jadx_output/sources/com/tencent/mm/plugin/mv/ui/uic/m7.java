package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class m7 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f151298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f151300f;

    public m7(com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.h0 h0Var, fm3.u uVar, r45.hf2 hf2Var) {
        this.f151295a = q7Var;
        this.f151296b = str;
        this.f151297c = str2;
        this.f151298d = h0Var;
        this.f151299e = uVar;
        this.f151300f = hf2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.mv.ui.uic.g8 g8Var;
        com.tencent.mm.plugin.mv.ui.uic.q7 q7Var = this.f151295a;
        if (!z17 && (g8Var = q7Var.f151388d) != null) {
            g8Var.a(java.lang.System.currentTimeMillis(), 1, "2", 10, null);
        }
        if (z17) {
            java.lang.String str2 = this.f151296b;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("content_type_forward_to_wework", 11);
            intent.putExtra("Retr_Msg_content", this.f151297c);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_thumb_path", (java.lang.String) this.f151298d.f310123d);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", str2);
            android.app.Activity context = q7Var.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j45.l.w((com.tencent.mm.ui.MMActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1, new com.tencent.mm.plugin.mv.ui.uic.l7(this.f151299e, q7Var, str2, this.f151300f));
        }
    }
}
