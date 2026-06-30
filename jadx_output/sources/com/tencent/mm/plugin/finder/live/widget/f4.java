package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h4 f118309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b56 f118310e;

    public f4(com.tencent.mm.plugin.finder.live.widget.h4 h4Var, r45.b56 b56Var) {
        this.f118309d = h4Var;
        this.f118310e = b56Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget$showDetailInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.h4.a(this.f118309d, this.f118310e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget$showDetailInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
