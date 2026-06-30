package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class q2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f116597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView f116598e;

    public q2(android.content.Context context, com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView) {
        this.f116597d = context;
        this.f116598e = finderLiveCameraOptBeautyPowerfulDetailsView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f116597d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.j(context.getString(com.tencent.mm.R.string.dty));
        u1Var.n(context.getString(com.tencent.mm.R.string.f491659du2));
        u1Var.g(context.getString(com.tencent.mm.R.string.dtz));
        u1Var.c(com.tencent.mm.plugin.finder.live.view.o2.f116554a, new com.tencent.mm.plugin.finder.live.view.p2(this.f116598e, context));
        u1Var.r(true);
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulDetailsView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
