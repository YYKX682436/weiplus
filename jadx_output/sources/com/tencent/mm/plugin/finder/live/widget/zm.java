package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zm extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final java.lang.String H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f120580J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public r45.wg7 N;
    public boolean P;
    public java.lang.Integer Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.H = "FinderLiveLikeRecommendGuidePanel";
        this.N = r45.wg7.MMFinderLiveLikeSource_RealnameLikeBubble;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.f488913do0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.I = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.kb_);
        this.f120580J = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.a9m);
        this.K = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.khs);
        this.L = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.obc);
        this.M = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.b5d);
        android.widget.TextView textView = this.K;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = this.L;
        if (textView2 != null) {
            com.tencent.mm.ui.fk.a(textView2);
        }
        android.widget.TextView textView3 = this.M;
        if (textView3 != null) {
            com.tencent.mm.ui.fk.a(textView3);
        }
        android.widget.TextView textView4 = this.I;
        if (textView4 != null) {
            com.tencent.mm.ui.fk.a(textView4);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        df2.cn cnVar;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        super.S();
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore == null || (cnVar = (df2.cn) liveRoomControllerStore.controller(df2.cn.class)) == null || (liveMutableData = cnVar.f229898v) == null) {
            return;
        }
        liveMutableData.postValue(new jz5.l(java.lang.Boolean.valueOf(!this.P), this.N));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        df2.cn cnVar;
        super.V(e0Var, z17, i17);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SHOW_LIKE_RECOMMEND_ROLE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.widget.TextView textView = this.K;
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.xm(this));
        }
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ym(this));
        }
        android.widget.TextView textView3 = this.I;
        if (textView3 != null) {
            java.lang.String l17 = c01.z1.l();
            if (!(!(l17.length() == 0))) {
                l17 = null;
            }
            if (l17 == null) {
                l17 = c01.z1.r();
            }
            textView3.setText(l17);
        }
        ng5.a.a(this.f120580J, c01.z1.r());
        e0(3);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore == null || (cnVar = (df2.cn) liveRoomControllerStore.controller(df2.cn.class)) == null) {
            return;
        }
        cnVar.t7(120, 40, null);
    }

    public final void e0(int i17) {
        df2.cn cnVar;
        df2.cn cnVar2;
        r45.wg7 wg7Var = this.N;
        if (wg7Var == r45.wg7.MMFinderLiveLikeSource_RealnameLikeBubble) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            if (liveRoomControllerStore == null || (cnVar2 = (df2.cn) liveRoomControllerStore.controller(df2.cn.class)) == null) {
                return;
            }
            cnVar2.s7(i17, this.Q);
            return;
        }
        if (wg7Var == r45.wg7.MMFinderLiveLikeSource_ForwardRealnameLikeButton) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 7);
            jSONObject.put("type", i17);
            dk2.ef efVar2 = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore2 = dk2.ef.f233371J;
            jSONObject.put("friend_wx_username", (liveRoomControllerStore2 == null || (cnVar = (df2.cn) liveRoomControllerStore2.controller(df2.cn.class)) == null) ? null : cnVar.o7());
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.P1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return true;
    }
}
