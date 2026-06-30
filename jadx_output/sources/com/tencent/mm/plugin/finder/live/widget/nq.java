package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class nq extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final java.lang.String H;
    public androidx.viewpager.widget.ViewPager I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.jq f119197J;
    public android.view.View K;
    public final jz5.g L;
    public final java.lang.String M;
    public r45.hv1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.H = "FinderLivePostGameChoosePanel";
        this.L = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.lq(context));
        this.M = "https://channels-aladin.wxqcloud.qq.com/aladin/html/df473215-ad02-4fc8-af49-98fcaa3e8593.html?immersiveUIStyle=0&hexBackgroundColor=FFFFFF#/?rd=wechat_redirect";
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.dl7;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getString(com.tencent.mm.R.string.kei);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484766qs0);
        this.K = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.mq(this));
        }
        a0(this.f118183e.getDrawable(com.tencent.mm.R.drawable.clh));
        this.I = (androidx.viewpager.widget.ViewPager) rootView.findViewById(com.tencent.mm.R.id.p1t);
        com.tencent.mm.plugin.finder.live.widget.jq jqVar = new com.tencent.mm.plugin.finder.live.widget.jq(this);
        this.f119197J = jqVar;
        androidx.viewpager.widget.ViewPager viewPager = this.I;
        if (viewPager != null) {
            viewPager.setAdapter(jqVar);
        }
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) rootView.findViewById(com.tencent.mm.R.id.nv8);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(this.I);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        com.tencent.mm.plugin.finder.live.widget.rq rqVar = (com.tencent.mm.plugin.finder.live.widget.rq) ((jz5.n) this.L).getValue();
        com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var = (com.tencent.mm.plugin.finder.live.viewmodel.s1) ((jz5.n) rqVar.I).getValue();
        if (s1Var != null) {
            s1Var.f117379n = new db2.m5("", "", 1, null, 8, null);
            gm0.j1.d().g(s1Var.f117379n);
            gm0.j1.d().a(4140, s1Var);
        }
        com.tencent.mm.plugin.finder.live.widget.e0.W(rqVar, this, false, 0, 6, null);
        cl0.g gVar = new cl0.g();
        gVar.o("type", 14);
        gVar.h("game_id", null);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 47L, gVar.toString(), null, 4, null);
    }

    public final void e0(r45.hv1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        this.N = resp;
        zl2.s sVar = zl2.s.f473962a;
        sVar.a(10, null);
        sVar.a(11, null);
        d0();
        com.tencent.mm.plugin.finder.live.widget.jq jqVar = this.f119197J;
        if (jqVar != null) {
            jqVar.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118183e);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 24), i65.a.b(weImageView.getContext(), 24)));
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_search);
        return weImageView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return true;
    }
}
