package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gg f117877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f117878e;

    public bg(com.tencent.mm.plugin.finder.live.widget.gg ggVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f117877d = ggVar;
        this.f117878e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget$showWecoinNotEnoughDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.live.widget.gg.f118429z;
        this.f117877d.c(2);
        this.f117878e.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansJoinWidget$showWecoinNotEnoughDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
