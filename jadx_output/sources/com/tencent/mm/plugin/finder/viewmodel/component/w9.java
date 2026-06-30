package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mb0 f136315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mb0 f136316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136319h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f136320i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136321m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.db0 f136322n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC f136323o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var, com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var2, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.view.View view, android.view.View view2, android.view.ViewGroup viewGroup, in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.db0 db0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC) {
        super(0);
        this.f136315d = mb0Var;
        this.f136316e = mb0Var2;
        this.f136317f = baseFinderFeed;
        this.f136318g = view;
        this.f136319h = view2;
        this.f136320i = viewGroup;
        this.f136321m = s0Var;
        this.f136322n = db0Var;
        this.f136323o = finderDescPanelUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var = this.f136316e;
        boolean a76 = this.f136315d.a7(mb0Var.S6());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f136317f;
        if (a76) {
            baseFinderFeed.H1(null);
            int u17 = hc2.f1.u(this.f136318g);
            int n17 = hc2.f1.n(this.f136319h);
            android.view.ViewGroup viewGroup = this.f136320i;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = n17;
            viewGroup.setLayoutParams(layoutParams);
            in5.s0 holder = this.f136321m;
            kotlin.jvm.internal.o.g(holder, "holder");
            com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType = this.f136322n;
            kotlin.jvm.internal.o.g(animationType, "animationType");
            mb0Var.V6(holder, animationType, u17);
            mb0Var.O6(holder, animationType);
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(n17, u17);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.t9(viewGroup));
            com.tencent.mm.plugin.finder.viewmodel.component.u9 u9Var = new com.tencent.mm.plugin.finder.viewmodel.component.u9(viewGroup, this.f136323o, holder);
            ofInt.addListener(new com.tencent.mm.plugin.finder.viewmodel.component.v9(u9Var, u9Var));
            ofInt.start();
        } else {
            baseFinderFeed.H1(mb0Var.S6());
        }
        return jz5.f0.f302826a;
    }
}
