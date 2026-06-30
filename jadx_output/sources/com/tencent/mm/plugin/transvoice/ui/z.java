package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175507d;

    public z(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175507d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TransVoiceDialog", "sendVoiceMsg onClick.");
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175507d;
        com.tencent.mm.plugin.transvoice.ui.y yVar = v0Var.f175498y0;
        boolean z17 = false;
        if (yVar != null) {
            java.lang.String str = v0Var.D;
            java.lang.Long valueOf = java.lang.Long.valueOf(v0Var.C);
            com.tencent.mm.pluginsdk.ui.chat.m2 m2Var = (com.tencent.mm.pluginsdk.ui.chat.m2) yVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onVoiceMsgSend, fileName: %s.", str);
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = m2Var.f190482a;
            com.tencent.mm.pluginsdk.ui.chat.k5 k5Var = chatFooter.f190090x0;
            if (true == (k5Var != null ? k5Var.p(str, intValue, chatFooter.getQuoteMsgInfo()) : false)) {
                z17 = true;
            }
        }
        if (z17) {
            v0Var.E = true;
        }
        v0Var.K(7);
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
