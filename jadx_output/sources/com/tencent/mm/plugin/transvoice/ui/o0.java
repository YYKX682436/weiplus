package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175454d;

    public o0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175454d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175454d;
        int ordinal = v0Var.B.ordinal();
        if (ordinal == 0) {
            v0Var.B = com.tencent.mm.plugin.transvoice.ui.w.f175500d;
            v0Var.K(6);
        } else if (ordinal == 1) {
            v0Var.B = com.tencent.mm.plugin.transvoice.ui.w.f175500d;
            com.tencent.mm.plugin.transvoice.ui.v0.G(v0Var, false);
            com.tencent.mm.plugin.transvoice.ui.v0.F(v0Var, true);
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = v0Var.f175491t;
            if (chatFooterPanel != null) {
                chatFooterPanel.setVisibility(8);
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText = v0Var.f175484n;
            if (mMEditText != null) {
                mMEditText.setCursorVisible(false);
            }
            v0Var.J(false);
        } else if (ordinal == 2) {
            v0Var.M(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
