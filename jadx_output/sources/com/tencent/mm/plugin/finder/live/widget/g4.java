package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h4 f118398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b56 f118399e;

    public g4(com.tencent.mm.plugin.finder.live.widget.h4 h4Var, r45.b56 b56Var) {
        this.f118398d = h4Var;
        this.f118399e = b56Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget$showSimpleInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.h4.a(this.f118398d, this.f118399e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget$showSimpleInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
