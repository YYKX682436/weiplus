package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class k6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.r6 f116440d;

    public k6(com.tencent.mm.plugin.finder.live.view.r6 r6Var) {
        this.f116440d = r6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.s6 s6Var = this.f116440d.f116632b;
        if (s6Var != null) {
            df2.t2 t2Var = (df2.t2) s6Var;
            com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "onCameraClick");
            android.content.Context context = null;
            if (pm0.v.z(t2Var.d7(), 2)) {
                com.tencent.mm.plugin.finder.live.view.r6 r6Var = t2Var.f231396m;
                if (r6Var != null && (view2 = r6Var.f116631a) != null) {
                    context = view2.getContext();
                }
                if (context != null) {
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.d(com.tencent.mm.R.string.omk);
                    e4Var.c();
                }
            } else {
                fj2.s sVar = fj2.s.f263183a;
                sVar.e(ml2.q4.f327855h, null);
                sVar.b(ml2.n4.F);
                if2.b.Y6(t2Var, qo0.b.f365360h3, null, 2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
