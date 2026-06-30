package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i2 f117716d;

    public a2(com.tencent.mm.plugin.finder.live.widget.i2 i2Var) {
        this.f117716d = i2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderGameLivePostCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.i2 i2Var = this.f117716d;
        i2Var.getClass();
        boolean l17 = gm0.j1.u().l();
        android.app.Activity activity = i2Var.f118616d;
        if (l17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.d2(i2Var);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.e2(i2Var);
            k0Var.C = new com.tencent.mm.plugin.finder.live.widget.f2(i2Var);
            k0Var.f211856e = new com.tencent.mm.plugin.finder.live.widget.g2(i2Var);
            k0Var.v();
        } else {
            db5.t7.l(activity);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderGameLivePostCoverWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
