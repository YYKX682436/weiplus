package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class vb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout f174372d;

    public vb(com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout) {
        this.f174372d = textStatusEditVideoPluginLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout.G;
        this.f174372d.getBackToRecordPlugin().onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
