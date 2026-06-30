package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175440d;

    public k0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175440d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175440d;
        com.tencent.mm.plugin.transvoice.model.e eVar = v0Var.f175479f;
        eVar.f175400x = 1;
        v0Var.P = true;
        if (v0Var.I) {
            v0Var.I = false;
            eVar.f175398v = 0;
            eVar.f175394r = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.transvoice.model.c cVar = v0Var.f175494w;
            if (cVar != null) {
                cVar.a(false, true);
            }
            android.view.View view2 = v0Var.f175486p;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = v0Var.L;
            if (n3Var != null) {
                n3Var.removeMessages(5000);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = v0Var.H;
            if (b4Var != null) {
                b4Var.d();
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText = v0Var.f175484n;
            if (mMEditText != null) {
                mMEditText.setText(v0Var.f175496x0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
