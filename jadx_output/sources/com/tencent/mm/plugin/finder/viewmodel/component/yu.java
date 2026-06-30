package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class yu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f136615d;

    public yu(com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f136615d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateMsgSecurityRemindApi$showSecurityRemindHalfIfNeeded$bm$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.f136615d;
        e3Var.f131965o = false;
        e3Var.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateMsgSecurityRemindApi$showSecurityRemindHalfIfNeeded$bm$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
