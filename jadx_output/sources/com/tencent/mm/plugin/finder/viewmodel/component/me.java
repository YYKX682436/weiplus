package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class me implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.oe f135164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135167g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f135168h;

    public me(com.tencent.mm.plugin.finder.viewmodel.component.oe oeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, android.view.View view, android.widget.TextView textView) {
        this.f135164d = oeVar;
        this.f135165e = baseFinderFeed;
        this.f135166f = s0Var;
        this.f135167g = view;
        this.f135168h = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.oe oeVar = this.f135164d;
        r45.u25 u25Var = oeVar.f135470o;
        oeVar.h7(this.f135165e, u25Var != null ? u25Var.getString(4) : null);
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) this.f135166f.p(com.tencent.mm.R.id.ghd);
        kotlin.jvm.internal.o.d(finderFullSeekBarLayout);
        cw2.ca.d(finderFullSeekBarLayout, null, false, 3, null);
        in5.s0 s0Var = this.f135166f;
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135165e;
            com.tencent.mm.plugin.finder.assist.y5 y5Var = com.tencent.mm.plugin.finder.assist.y5.f102716a;
            r45.u25 u25Var2 = oeVar.f135470o;
            y5Var.d(mMActivity, baseFinderFeed, 4L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : u25Var2 != null ? u25Var2.getString(4) : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : s0Var, new com.tencent.mm.plugin.finder.viewmodel.component.le(this.f135167g, oeVar, this.f135168h, finderFullSeekBarLayout));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneUIC$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
