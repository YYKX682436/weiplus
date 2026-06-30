package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class he implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.je f134621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134623f;

    public he(com.tencent.mm.plugin.finder.viewmodel.component.je jeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f134621d = jeVar;
        this.f134622e = baseFinderFeed;
        this.f134623f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.je jeVar = this.f134621d;
        r45.u25 u25Var = jeVar.f134859o;
        jeVar.h7(this.f134622e, u25Var != null ? u25Var.getString(4) : null);
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) this.f134623f.p(com.tencent.mm.R.id.ghd);
        kotlin.jvm.internal.o.d(finderFullSeekBarLayout);
        cw2.ca.d(finderFullSeekBarLayout, null, false, 3, null);
        in5.s0 s0Var = this.f134623f;
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f134622e;
            com.tencent.mm.plugin.finder.assist.y5 y5Var = com.tencent.mm.plugin.finder.assist.y5.f102716a;
            r45.u25 u25Var2 = jeVar.f134859o;
            y5Var.d(mMActivity, baseFinderFeed, 4L, false, u25Var2 != null ? u25Var2.getString(4) : null, jeVar.f134267g, jeVar.f134268h, s0Var, new com.tencent.mm.plugin.finder.viewmodel.component.ge(finderFullSeekBarLayout));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
