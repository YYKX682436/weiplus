package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.e4 f174400d;

    public w3(com.tencent.mm.plugin.textstatus.ui.e4 e4Var) {
        this.f174400d = e4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/StatusMuteButtonHelper$attachTo$iv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.e4 e4Var = this.f174400d;
        boolean z17 = !e4Var.f173837k;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusMuteButtonHelper", "onToggle: showingMuted " + e4Var.f173837k + " -> " + z17);
        e4Var.c(z17);
        yz5.l lVar = e4Var.f173839m;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/StatusMuteButtonHelper$attachTo$iv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
