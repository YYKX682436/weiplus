package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView f119913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f119914e;

    public tw(com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView, android.content.Context context, com.tencent.mm.plugin.finder.live.widget.uw uwVar) {
        this.f119913d = finderLiveTaskBannerView;
        this.f119914e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$1$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView = this.f119913d;
        java.util.LinkedList linkedList = finderLiveTaskBannerView.f117676g;
        com.tencent.mm.plugin.finder.live.widget.pw pwVar = linkedList != null ? (com.tencent.mm.plugin.finder.live.widget.pw) linkedList.get(intValue) : null;
        if (pwVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$1$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" click posttion = ");
        sb6.append(intValue);
        sb6.append(", reset = -1 ，activityICon:");
        com.tencent.mm.plugin.finder.live.widget.ow owVar = (com.tencent.mm.plugin.finder.live.widget.ow) pwVar;
        sb6.append(owVar.f119330a.getString(0));
        com.tencent.mars.xlog.Log.i(finderLiveTaskBannerView.f117681o, sb6.toString());
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        r45.y53 y53Var = owVar.f119330a;
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Fk(this.f119914e, null, 4, y53Var.getString(1));
        com.tencent.mm.plugin.finder.assist.x2.f102672a.e(12, y53Var.getString(2), finderLiveTaskBannerView.getGameAppId());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$1$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
