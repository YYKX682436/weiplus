package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class f7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172996d;

    public f7(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        this.f172996d = teenModePrivatePwdUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f172996d.hideTenpayKB();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
