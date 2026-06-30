package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class n7 extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final com.tencent.mm.plugin.finder.live.plugin.l H;
    public android.widget.RelativeLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.RelativeLayout f119163J;
    public android.view.View K;
    public android.view.View L;
    public android.view.View M;
    public yz5.a N;
    public yz5.l P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(android.content.Context context, com.tencent.mm.plugin.finder.live.plugin.l plugin) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.H = plugin;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.eaw;
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
    public java.lang.String L() {
        return "";
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        android.widget.RelativeLayout relativeLayout;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicEntranceSelectPanel", "initContentView");
        a0(this.f118183e.getDrawable(com.tencent.mm.R.drawable.clh));
        this.I = (android.widget.RelativeLayout) rootView.findViewById(com.tencent.mm.R.id.fda);
        this.f119163J = (android.widget.RelativeLayout) rootView.findViewById(com.tencent.mm.R.id.fdd);
        this.K = rootView.findViewById(com.tencent.mm.R.id.ags);
        this.L = rootView.findViewById(com.tencent.mm.R.id.ndm);
        this.M = rootView.findViewById(com.tencent.mm.R.id.rmh);
        android.widget.RelativeLayout relativeLayout2 = this.I;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.j7(this));
        }
        android.widget.RelativeLayout relativeLayout3 = this.f119163J;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.k7(this));
        }
        if (!e0() && !((mm2.e1) this.H.S0().a(mm2.e1.class)).d7() && (relativeLayout = this.f119163J) != null) {
            relativeLayout.setVisibility(8);
        }
        ym5.a1.h(rootView, new com.tencent.mm.plugin.finder.live.widget.l7(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicEntranceSelectPanel", "onDismiss");
        ll2.e eVar = ll2.e.f319133a;
        eVar.e("anchorlive.bottom.music.song", false);
        eVar.e("startlive.bottom.music.song", false);
        eVar.e("startlive.bottom.music.bgmusic", false);
        eVar.e("anchorlive.bottom.music.bgmusic", false);
        yz5.a aVar = this.N;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0063, code lost:
    
        if (r3.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_SET_MUSIC_COUNT) == true) goto L12;
     */
    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 r21, boolean r22, int r23) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.n7.V(com.tencent.mm.plugin.finder.live.widget.e0, boolean, int):void");
    }

    public final boolean e0() {
        return ((mm2.c1) this.H.S0().a(mm2.c1.class)).a8();
    }

    public final void f0(boolean z17) {
        if (zl2.r4.f473950a.w1()) {
            java.util.Map k17 = kz5.c1.k(new jz5.l("type", e0() ? z17 ? "4" : "3" : z17 ? "2" : "1"), new jz5.l("style", "1"));
            if (e0()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f328370p1, new org.json.JSONObject(k17).toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var = ml2.c1.f327325e;
                zy2.zb.j5(zbVar, 34L, new org.json.JSONObject(k17).toString(), null, 4, null);
            }
        }
    }
}
