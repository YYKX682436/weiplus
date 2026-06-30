package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f117455e;

    public u5(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f117454d = c0Var;
        this.f117455e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithContinue$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f117454d.f310112d = true;
        this.f117455e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostSecurityUIC$dealWithContinue$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
