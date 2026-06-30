package i53;

/* loaded from: classes8.dex */
public class a2 extends android.widget.FrameLayout implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f288496d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f288497e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f288498f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f288499g;

    /* renamed from: h, reason: collision with root package name */
    public i53.n0 f288500h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f288501i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f288502m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f288503n;

    /* renamed from: o, reason: collision with root package name */
    public i53.t f288504o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f288505p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f288506q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f288507r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f288508s;

    /* renamed from: t, reason: collision with root package name */
    public int f288509t;

    /* renamed from: u, reason: collision with root package name */
    public p33.l f288510u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f288511v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f288512w;

    /* renamed from: x, reason: collision with root package name */
    public final android.content.Context f288513x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f288514y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f288515z;

    public a2(android.content.Context context) {
        super(context);
        this.f288507r = false;
        this.f288508s = false;
        this.f288509t = 0;
        this.f288513x = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDataFromNet() {
        java.lang.System.currentTimeMillis();
        this.f288504o.d(new i53.y1(this));
    }

    public final void b(android.view.View view, int i17, int i18) {
        ((android.view.ViewGroup) this.f288496d.findViewById(com.tencent.mm.R.id.ghu)).addView(view, i17, i18);
    }

    public final void c() {
        android.view.View view = this.f288499g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void d() {
        if (this.f288512w) {
            return;
        }
        this.f288505p.show();
        getDataFromNet();
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new i53.t1(this), false);
        this.f288511v = b4Var;
        b4Var.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    public final void e(p33.o oVar) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(oVar.f351627g)) {
            this.f288515z.setVisibility(8);
            this.f288514y.setVisibility(8);
            return;
        }
        this.f288514y.setAdapter(new i53.z1(this, ((androidx.fragment.app.FragmentActivity) this.f288513x).getSupportFragmentManager(), oVar.f351627g));
        this.f288514y.setOffscreenPageLimit(3);
        this.f288514y.setPageMargin(ym5.x.a(getContext(), 8.0f));
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(getContext());
        ((android.widget.LinearLayout.LayoutParams) this.f288514y.getLayoutParams()).height = ((int) ((a17.f197135a - ym5.x.a(getContext(), 40.0f)) * 0.5625f)) + ym5.x.a(getContext(), 73.0f);
        this.f288515z.setVisibility(0);
        this.f288514y.setVisibility(0);
    }

    public final void f(int i17, int i18, java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8762, i17, i18, this.f288509t, lj0.a.a(7, map));
    }

    public final void g(java.util.LinkedList linkedList, boolean z17, boolean z18) {
        if (!z18) {
            this.f288505p.dismiss();
        }
        android.view.View view = this.f288498f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f288511v;
        if (b4Var != null) {
            b4Var.d();
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            android.view.View view2 = this.f288497e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f(502, 1, null);
            com.tencent.mm.plugin.game.media.GamePublishGalleryUI gamePublishGalleryUI = (com.tencent.mm.plugin.game.media.GamePublishGalleryUI) getContext();
            gamePublishGalleryUI.getClass();
            if (com.tencent.mm.sdk.platformtools.o4.M(i53.t.b("game_haowan_mmkv_key")).getInt("game_last_choose_gallery", 0) == 0 && gamePublishGalleryUI.f140057f.getCurrentItem() % 2 == 0) {
                gamePublishGalleryUI.U6(1, false);
            }
        } else {
            android.view.View view3 = this.f288497e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f288501i) {
                java.lang.String str = ((p33.l) linkedList.get(0)).f351614s;
                com.tencent.mm.sdk.platformtools.o4.M(i53.t.b("game_haowan_mmkv_key")).putBoolean("game_publish_gallery_first_enter", false);
            }
        }
        this.f288500h.g1(linkedList, z17, z18);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f288504o.a();
        gm0.j1.d().q(9911, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null && m1Var.getType() == 9911 && i17 == 0 && i18 == 0) {
            java.lang.Object value = ((r33.h) m1Var).f368983e.getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) value).f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.ugc.GetRecommendVideoListResponse");
            p33.o oVar = (p33.o) fVar;
            com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
            am.we weVar = gamePBCacheEvent.f54369g;
            weVar.f8278a = 2;
            weVar.f8279b = "cache_video_recommend";
            try {
                weVar.f8280c = oVar.toByteArray();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameHaoWanGalleryView", e17.getMessage());
            }
            gamePBCacheEvent.e();
            e(oVar);
        }
    }

    public void setLocalAlbumInfos(org.json.JSONArray jSONArray) {
        i53.t tVar = new i53.t();
        this.f288504o = tVar;
        i53.t.f288715p = tVar;
        tVar.h(jSONArray);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bg8, (android.view.ViewGroup) this, true);
        this.f288496d = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gla);
        this.f288503n = findViewById;
        if (this.f288507r) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f288496d.findViewById(com.tencent.mm.R.id.gn9).setOnClickListener(new i53.w1(this));
        this.f288512w = false;
        i53.n0 n0Var = new i53.n0(getContext(), 8762, this.f288509t);
        this.f288500h = n0Var;
        n0Var.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f288500h.i(new i53.r1(this));
        android.content.Context context = this.f288513x;
        this.f288505p = com.tencent.mm.ui.widget.dialog.u3.c(context, context.getString(com.tencent.mm.R.string.ggd), false, 3, null);
        this.f288500h.setOnItemClickListener(new i53.s1(this));
        b(this.f288500h, -1, -1);
        android.view.View inflate2 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bdr, (android.view.ViewGroup) this, false);
        this.f288497e = inflate2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(inflate2, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(inflate2, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b(this.f288497e, -1, -1);
        android.view.View inflate3 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bdv, (android.view.ViewGroup) this, false);
        this.f288498f = inflate3;
        ((android.widget.Button) inflate3.findViewById(com.tencent.mm.R.id.gpm)).setOnClickListener(new i53.u1(this));
        android.view.View view = this.f288498f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b(this.f288498f, -1, -1);
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.M(i53.t.b("game_haowan_mmkv_key")).getBoolean("game_publish_gallery_first_enter", true);
        this.f288501i = z17;
        if (z17) {
            android.view.View inflate4 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bds, (android.view.ViewGroup) this.f288500h, false);
            this.f288502m = inflate4;
            ((android.widget.ImageView) inflate4.findViewById(com.tencent.mm.R.id.glp)).setOnClickListener(new i53.v1(this));
            i53.n0 n0Var2 = this.f288500h;
            n0Var2.f288671e2.f288625g.add(this.f288502m);
            f(503, 1, null);
        }
        android.view.View inflate5 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bhz, (android.view.ViewGroup) null);
        this.f288514y = (androidx.viewpager.widget.ViewPager) inflate5.findViewById(com.tencent.mm.R.id.f487570p16);
        this.f288515z = (android.widget.TextView) inflate5.findViewById(com.tencent.mm.R.id.ond);
        this.f288500h.f288671e2.f288625g.add(inflate5);
        android.view.View inflate6 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bdt, (android.view.ViewGroup) this, false);
        this.f288499g = inflate6;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(inflate6, arrayList5.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(inflate6, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b(this.f288499g, -1, -1);
        java.util.LinkedList c17 = this.f288504o.c();
        if (com.tencent.mm.sdk.platformtools.t8.L0(c17)) {
            android.view.View view2 = this.f288499g;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            g(c17, false, true);
        }
        com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
        am.we weVar = gamePBCacheEvent.f54369g;
        weVar.f8278a = 1;
        weVar.f8279b = "cache_video_recommend";
        gamePBCacheEvent.e();
        byte[] bArr = weVar.f8280c;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            p33.o oVar = new p33.o();
            try {
                oVar.parseFrom(bArr);
                e(oVar);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameHaoWanGalleryView", e17.getMessage());
            }
        }
        gm0.j1.d().a(9911, this);
        gm0.j1.d().g(new r33.h());
        getDataFromNet();
    }
}
