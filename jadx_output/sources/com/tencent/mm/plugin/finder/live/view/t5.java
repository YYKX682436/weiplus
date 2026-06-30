package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class t5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView f116692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116693e;

    public t5(com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView finderLiveHonorView, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        this.f116692d = finderLiveHonorView;
        this.f116693e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveHonorView$showView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView finderLiveHonorView = this.f116692d;
        finderLiveHonorView.b();
        dk2.xf j17 = dk2.ef.f233372a.j(this.f116693e);
        if (j17 != null) {
            android.content.Context context = finderLiveHonorView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            dk2.xf.c(j17, (android.app.Activity) context, false, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveHonorView$showView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
