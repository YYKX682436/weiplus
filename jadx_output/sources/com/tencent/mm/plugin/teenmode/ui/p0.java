package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI f173101d;

    public p0(com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI bindGuardianMsgUI) {
        this.f173101d = bindGuardianMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f173101d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
