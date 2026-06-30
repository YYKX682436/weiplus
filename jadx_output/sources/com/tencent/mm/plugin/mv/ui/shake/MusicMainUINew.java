package com.tencent.mm.plugin.mv.ui.shake;

@db5.a(32)
/* loaded from: classes11.dex */
public class MusicMainUINew extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int H = 0;
    public wu5.c A;
    public final java.util.HashMap B;
    public final rk4.o5 C;
    public boolean D;
    public final com.tencent.mm.plugin.mv.ui.shake.p E;
    public com.tencent.mm.plugin.mv.ui.WeCheckBox F;
    public final com.tencent.mm.sdk.event.IListener G;

    /* renamed from: d, reason: collision with root package name */
    public pk4.c f150901d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f150902e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.shake.a0 f150903f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Float f150904g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f150906i;

    /* renamed from: m, reason: collision with root package name */
    public b21.r f150907m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.lp0 f150908n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f150909o;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f150911q;

    /* renamed from: u, reason: collision with root package name */
    public boolean f150915u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f150916v;

    /* renamed from: x, reason: collision with root package name */
    public int f150918x;

    /* renamed from: y, reason: collision with root package name */
    public final ka0.l0 f150919y;

    /* renamed from: z, reason: collision with root package name */
    public final qk.g9 f150920z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f150905h = false;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f150910p = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f150912r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f150913s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f150914t = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f150917w = false;

    public MusicMainUINew() {
        ((ja0.g0) ((ka0.m0) i95.n0.c(ka0.m0.class))).getClass();
        this.f150919y = new ll3.r1();
        this.f150920z = (qk.g9) i95.n0.c(qk.g9.class);
        this.B = new java.util.HashMap();
        this.C = new com.tencent.mm.plugin.mv.ui.shake.o(this);
        this.D = false;
        this.E = new com.tencent.mm.plugin.mv.ui.shake.p();
        this.F = null;
        this.G = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew.14
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.plugin.mv.ui.WeCheckBox weCheckBox;
                pk4.c cVar;
                int i17 = musicPlayerEvent.f54512g.f7036b;
                com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew.this;
                if (i17 != 0) {
                    if (i17 == 1) {
                        pk4.c cVar2 = musicMainUINew.f150901d;
                        if (cVar2 != null) {
                            ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar2).c();
                        }
                    } else if (i17 != 2) {
                        if (i17 == 3 && (cVar = musicMainUINew.f150901d) != null) {
                            ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).a();
                        }
                    } else if (musicMainUINew.f150913s && (weCheckBox = musicMainUINew.F) != null) {
                        weCheckBox.setChecked(false);
                        musicMainUINew.F = null;
                    }
                } else if (!musicMainUINew.f150913s && musicMainUINew.f150904g.floatValue() != -1.0f && !musicMainUINew.f150905h) {
                    musicMainUINew.f150905h = true;
                    rk4.z8 z8Var = (rk4.z8) musicMainUINew.f150920z;
                    int Ai = z8Var.Ai();
                    int intValue = musicMainUINew.f150904g.intValue();
                    com.tencent.mars.xlog.Log.i("MusicMainUINew", "seekToMusicWhenPlay with seekPostion %d, duration %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(Ai));
                    if (intValue > 0 && intValue < Ai - 3000) {
                        z8Var.xj(intValue);
                    }
                }
                return false;
            }
        };
    }

    public final void T6(java.lang.String str, android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.mv.ui.shake.a0 a0Var = new com.tencent.mm.plugin.mv.ui.shake.a0(getContext(), viewGroup, (int) (i65.a.k(getContext()) * 0.7d * 0.4d), i17);
        this.f150903f = a0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvLyric", "onCreate");
        if (a0Var.f150926d == 0) {
            a0Var.b().setLayoutManager(new com.tencent.mm.plugin.mv.ui.shake.MusicShakeLyricLayoutManager(a0Var.f150923a, 0, false, 6, null));
        } else {
            a0Var.b().setLayoutManager(new com.tencent.mm.plugin.mv.ui.shake.MusicBlackLyricLayoutManager(a0Var.f150923a, 0, false, 6, null));
            a0Var.b().getRecycledViewPool().e(0, 0);
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) a0Var.b().getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = a0Var.f150925c;
        }
        i95.m c17 = i95.n0.c(qk.u8.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.mv.ui.shake.z listener = a0Var.f150932j;
        kotlin.jvm.internal.o.g(listener, "listener");
        ((ef0.j3) ((qk.u8) c17)).f252241e.add(listener);
        com.tencent.mm.plugin.mv.ui.shake.a0 a0Var2 = this.f150903f;
        a0Var2.getClass();
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                java.util.ArrayList arrayList = a0Var2.f150928f;
                arrayList.clear();
                ll3.h1 f17 = ll3.h1.f(str, "", "", true, "", false, false);
                ll3.h1 h1Var = f17.e() > 1 ? f17 : null;
                a0Var2.f150929g = h1Var;
                if (h1Var != null) {
                    int e17 = h1Var.e();
                    for (int i18 = 0; i18 < e17; i18++) {
                        java.lang.String str2 = h1Var.d(i18).f319168b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList.add(str2);
                    }
                }
                if (((com.tencent.mm.plugin.mv.ui.shake.t) a0Var2.b().getAdapter()) == null) {
                    androidx.recyclerview.widget.RecyclerView b17 = a0Var2.b();
                    com.tencent.mm.plugin.mv.ui.shake.t tVar = new com.tencent.mm.plugin.mv.ui.shake.t(a0Var2.f150931i, a0Var2.f150926d);
                    java.util.ArrayList arrayList2 = tVar.f150964f;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    tVar.notifyDataSetChanged();
                    b17.setAdapter(tVar);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvLyric", "setSongInfo, lyric.length:" + str.length() + ", lyricLine.size:" + arrayList.size() + ", lyricRv-Visisble:" + a0Var2.b().getVisibility() + ", lyricRv.alpha:" + a0Var2.b().getAlpha());
            }
        }
    }

    public final void U6(b21.r rVar, boolean z17) {
        ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(z17);
        ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(z17);
        qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
        bw5.lp0 lp0Var = new bw5.lp0();
        bw5.v70 v70Var = new bw5.v70();
        java.lang.String str = rVar.f17346e;
        if (str != null) {
            lp0Var.g(str);
        }
        v70Var.y(1);
        java.lang.String str2 = rVar.f17349h;
        if (str2 != null) {
            v70Var.p(str2);
        }
        java.lang.String str3 = rVar.f17348g;
        if (str3 != null) {
            v70Var.x(str3);
        }
        java.lang.String str4 = rVar.f17351m;
        if (str4 != null) {
            v70Var.q(str4);
        }
        v70Var.t(true);
        bw5.z90 z90Var = new bw5.z90();
        java.lang.String str5 = rVar.f17348g;
        if (str5 != null) {
            z90Var.E(str5);
        }
        java.lang.String str6 = rVar.f17349h;
        if (str6 != null) {
            z90Var.C(str6);
        }
        java.lang.String str7 = rVar.f17354p;
        if (str7 != null) {
            z90Var.B(str7);
        }
        java.lang.String str8 = rVar.f17352n;
        if (str8 != null) {
            z90Var.z(str8);
        }
        java.lang.String str9 = rVar.f17358t;
        if (str9 != null) {
            z90Var.y(str9);
        }
        java.lang.String str10 = rVar.f17351m;
        if (str10 != null) {
            z90Var.r(str10);
        }
        java.lang.String str11 = rVar.f17350i;
        if (str11 != null) {
            z90Var.q(str11);
        }
        java.lang.String str12 = rVar.f17355q;
        if (str12 != null) {
            z90Var.x(str12);
        }
        v70Var.w(z90Var);
        lp0Var.j(v70Var);
        il4.e eVar = new il4.e();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        eVar.f292106c = 2004;
        eVar.f292107d = false;
        ((rk4.z8) g9Var).qj(lp0Var.b(), lp0Var, eVar);
        this.f150908n = lp0Var;
        this.f150907m = rVar;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477721i, com.tencent.mm.R.anim.f477722j);
        ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).Ai(this.C);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c4k;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.D && !this.f150913s) {
            setResult(-1);
        }
        this.G.dead();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.mv.ui.shake.a0 a0Var;
        requestWindowFeature(1);
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MusicMainUINew", "onCreate");
        this.G.alive();
        overridePendingTransition(com.tencent.mm.R.anim.f477721i, com.tencent.mm.R.anim.f477722j);
        getWindow().setFlags(67109888, 67109888);
        hideTitleView();
        this.f150904g = java.lang.Float.valueOf(getIntent().getFloatExtra("key_offset", -1.0f));
        this.f150907m = (b21.r) getIntent().getSerializableExtra("key_music_wrapper");
        this.f150915u = getIntent().getIntExtra("key_pure", 0) == 1;
        this.f150912r = getIntent().getBooleanExtra("key_copyright", false);
        this.f150916v = getIntent().getIntExtra("key_byuser", 0) == 1;
        this.f150914t = getIntent().getBooleanExtra("key_history", false);
        this.f150911q = (java.util.List) getIntent().getSerializableExtra("key_recommend_list");
        this.f150918x = getIntent().getIntExtra("key_duration", 0);
        this.f150917w = getIntent().getBooleanExtra("key_hasPre", false);
        if (this.f150907m == null) {
            finish();
        }
        b21.r rVar = this.f150907m;
        this.f150906i = rVar != null ? rVar.f17355q : "";
        this.E.f150958b = rVar;
        java.lang.String stringExtra = getIntent().getStringExtra("report_sessionid");
        java.lang.String stringExtra2 = getIntent().getStringExtra("shake_sessionid");
        int intExtra = getIntent().getIntExtra("key_copyright_report", 0);
        com.tencent.mm.plugin.mv.ui.shake.d0 d0Var = com.tencent.mm.plugin.mv.ui.shake.d0.f150940a;
        b21.r rVar2 = this.f150907m;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intExtra);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(this.f150914t);
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReport2Struct shakeActionReport2Struct = com.tencent.mm.plugin.mv.ui.shake.d0.f150941b;
        shakeActionReport2Struct.f60314j = shakeActionReport2Struct.b("SessionID", stringExtra, true);
        shakeActionReport2Struct.f60315k = shakeActionReport2Struct.b("SharkSessionID", stringExtra2, true);
        android.view.ViewGroup viewGroup = null;
        shakeActionReport2Struct.f60316l = shakeActionReport2Struct.b("ToSongName", rVar2 != null ? rVar2.f17348g : null, true);
        shakeActionReport2Struct.f60317m = shakeActionReport2Struct.b("ToSongSinger", rVar2 != null ? rVar2.f17349h : null, true);
        shakeActionReport2Struct.f60319o = shakeActionReport2Struct.b("ToSongDataurl", rVar2 != null ? rVar2.Q : null, true);
        shakeActionReport2Struct.f60318n = shakeActionReport2Struct.b("ToSongWeburl", rVar2 != null ? rVar2.Q : null, true);
        shakeActionReport2Struct.f60322r = valueOf != null ? valueOf.intValue() : 0L;
        shakeActionReport2Struct.f60323s = kotlin.jvm.internal.o.b(valueOf2, java.lang.Boolean.TRUE) ? 1L : 2L;
        shakeActionReport2Struct.f60311g = shakeActionReport2Struct.b("ToSongOrTv", rVar2 != null ? rVar2.f17346e : null, true);
        shakeActionReport2Struct.f60313i = 2;
        d0Var.a(250);
        ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).wi(this.C);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.j8h);
        this.f150909o = frameLayout;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.height = (int) (i65.a.k(getContext()) * 0.7d);
        layoutParams.width = (int) (i65.a.k(getContext()) * 0.42d);
        this.f150909o.setLayoutParams(layoutParams);
        this.f150909o.setClipToOutline(true);
        this.f150909o.setOutlineProvider(new com.tencent.mm.plugin.mv.ui.shake.b0(i65.a.b(getContext(), 25)));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ko_);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams2.width = (int) (i65.a.k(getContext()) * 0.42d);
        linearLayout.setLayoutParams(layoutParams2);
        findViewById(com.tencent.mm.R.id.bys).setOnClickListener(new com.tencent.mm.plugin.mv.ui.shake.f(this));
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.aam);
        cdnImageView.setVisibility(0);
        cdnImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        ((ll3.r1) this.f150919y).a(this.f150907m, cdnImageView, getContext(), true, true);
        if (this.f150912r) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c5g, (android.view.ViewGroup) null);
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.oxq);
            pk4.c cVar = (pk4.c) inflate.findViewById(com.tencent.mm.R.id.ozb);
            this.f150901d = cVar;
            cVar.setMute(true);
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.gym);
            cdnImageView2.setVisibility(0);
            cdnImageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            ((ll3.r1) this.f150919y).a(this.f150907m, cdnImageView2, getContext(), true, false);
            cdnImageView2.setClipToOutline(true);
            cdnImageView2.setOutlineProvider(new com.tencent.mm.plugin.mv.ui.shake.b0(i65.a.b(getContext(), 5)));
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gz_);
            b21.r rVar3 = this.f150907m;
            textView3.setText(rVar3 != null ? rVar3.f17348g : "");
            android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gza);
            b21.r rVar4 = this.f150907m;
            textView4.setText(rVar4 != null ? rVar4.f17349h : "");
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView3 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.ckj);
            this.f150902e = cdnImageView3;
            cdnImageView3.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            int k17 = (int) (i65.a.k(getContext()) * 0.42d);
            ((ja0.g0) ((ka0.m0) i95.n0.c(ka0.m0.class))).getClass();
            ll3.r1 r1Var = new ll3.r1();
            r1Var.f319225c = new com.tencent.mm.plugin.mv.ui.shake.i(this, k17, (int) (i65.a.k(getContext()) * 0.7d));
            r1Var.a(this.f150907m, this.f150902e, getContext(), true, false);
            this.f150902e.setVisibility(0);
            T6(this.f150906i, relativeLayout, 0);
            inflate.findViewById(com.tencent.mm.R.id.h7j).setOnClickListener(new com.tencent.mm.plugin.mv.ui.shake.j(this));
            inflate.findViewById(com.tencent.mm.R.id.h6a).setOnClickListener(new com.tencent.mm.plugin.mv.ui.shake.k(this));
            inflate.findViewById(com.tencent.mm.R.id.gsk).setOnClickListener(new com.tencent.mm.plugin.mv.ui.shake.l(this));
            this.f150909o.addView(inflate);
            this.f150909o.post(new com.tencent.mm.plugin.mv.ui.shake.m(this));
        } else {
            android.view.View inflate2 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c4c, (android.view.ViewGroup) null);
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate2.findViewById(com.tencent.mm.R.id.oxq);
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView4 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate2.findViewById(com.tencent.mm.R.id.ckj);
            cdnImageView4.setVisibility(0);
            cdnImageView4.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            ((ll3.r1) this.f150919y).a(this.f150907m, cdnImageView4, getContext(), true, false);
            java.lang.String str = this.f150906i;
            if (str == null) {
                android.widget.TextView textView5 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.nen);
                textView5.setVisibility(0);
                if (this.f150915u) {
                    textView5.setText("纯音乐无歌词");
                } else {
                    textView5.setText("暂无歌词");
                }
            } else {
                T6(str, linearLayout2, 1);
            }
            if (!this.f150914t && (a0Var = this.f150903f) != null) {
                pm0.v.X(new com.tencent.mm.plugin.mv.ui.shake.x(a0Var, this.f150904g.intValue()));
            }
            if (!this.f150916v && !this.f150914t) {
                this.A = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.plugin.mv.ui.shake.n(this), 0L, 100L);
            }
            this.f150909o.addView(inflate2);
            int i17 = com.tencent.mm.R.id.ndn;
            android.widget.TextView textView6 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.ndn);
            com.tencent.mm.ui.bk.s0(textView6.getPaint());
            com.tencent.mm.ui.bk.s0(((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.c7a)).getPaint());
            int i18 = com.tencent.mm.R.id.myd;
            android.widget.TextView textView7 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.myd);
            b21.r rVar5 = this.f150907m;
            if (rVar5 != null) {
                textView6.setText(rVar5.f17348g);
                textView7.setText(this.f150907m.f17349h);
            }
            java.util.List list = this.f150911q;
            if (list != null && list.size() > 0) {
                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.lny);
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
                layoutParams3.width = (int) (i65.a.k(getContext()) * 0.42d);
                linearLayout3.setLayoutParams(layoutParams3);
                linearLayout3.setVisibility(0);
                int i19 = 0;
                for (b21.r rVar6 : this.f150911q) {
                    i19++;
                    android.view.View inflate3 = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c5e, viewGroup);
                    com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView5 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate3.findViewById(com.tencent.mm.R.id.f483970cl4);
                    android.widget.ImageView imageView = (android.widget.ImageView) inflate3.findViewById(com.tencent.mm.R.id.dfa);
                    android.widget.TextView textView8 = (android.widget.TextView) inflate3.findViewById(i17);
                    android.widget.TextView textView9 = (android.widget.TextView) inflate3.findViewById(i18);
                    com.tencent.mm.plugin.mv.ui.WeCheckBox weCheckBox = (com.tencent.mm.plugin.mv.ui.WeCheckBox) inflate3.findViewById(com.tencent.mm.R.id.kwj);
                    this.B.put(rVar6.f17346e, weCheckBox);
                    if (rVar6.f17351m.isEmpty()) {
                        imageView.setVisibility(0);
                        imageView.setClipToOutline(true);
                        imageView.setOutlineProvider(new com.tencent.mm.plugin.mv.ui.shake.b0(i65.a.b(getContext(), 5)));
                        textView = textView9;
                        textView2 = textView8;
                    } else {
                        cdnImageView5.setVisibility(0);
                        textView = textView9;
                        textView2 = textView8;
                        ((ll3.r1) this.f150919y).a(rVar6, cdnImageView5, getContext(), true, false);
                        cdnImageView5.setClipToOutline(true);
                        cdnImageView5.setOutlineProvider(new com.tencent.mm.plugin.mv.ui.shake.b0(i65.a.b(getContext(), 5)));
                    }
                    textView2.setText(rVar6.f17348g);
                    textView.setText(rVar6.f17349h);
                    inflate3.setOnClickListener(new com.tencent.mm.plugin.mv.ui.shake.b(this, rVar6, i19));
                    weCheckBox.setOnCheckedChangeListener(new com.tencent.mm.plugin.mv.ui.shake.c(this, rVar6));
                    linearLayout3.addView(inflate3);
                    viewGroup = null;
                    i17 = com.tencent.mm.R.id.ndn;
                    i18 = com.tencent.mm.R.id.myd;
                }
            }
        }
        ((ja0.c0) ((ka0.h0) i95.n0.c(ka0.h0.class))).getClass();
        ll3.b1 b1Var = ll3.b1.f319140a;
        ll3.e1 e1Var = ll3.b1.f319141b;
        e1Var.f319158v = true;
        e1Var.f319160x = true;
        if (this.f150914t) {
            com.tencent.mm.plugin.mv.ui.shake.p pVar = this.E;
            getContext();
            pVar.getClass();
        }
        this.f150908n = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        setBounceEnabled(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        b21.r rVar;
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MusicMainUINew", "onDestroy gotoPlayer: %s, recommend: %s, pre: %s", java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(this.f150913s), java.lang.Boolean.valueOf(this.f150917w));
        this.E.getClass();
        pk4.c cVar = this.f150901d;
        if (cVar != null) {
            ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).b();
        }
        if (!this.D && !this.f150917w && (rVar = this.f150907m) != null) {
            java.lang.String str = rVar.f17346e;
            rk4.z8 z8Var = (rk4.z8) this.f150920z;
            if (z8Var.oj(str)) {
                if (!this.f150913s) {
                    z8Var.pj();
                }
                ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(true);
                ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(true);
            }
        }
        com.tencent.mm.plugin.mv.ui.shake.a0 a0Var = this.f150903f;
        if (a0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvLyric", "onDestroy");
            a0Var.f150928f.clear();
            a0Var.f150929g = null;
            i95.m c17 = i95.n0.c(qk.u8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.mv.ui.shake.z listener = a0Var.f150932j;
            kotlin.jvm.internal.o.g(listener, "listener");
            ((ef0.j3) ((qk.u8) c17)).f252241e.remove(listener);
        }
        this.G.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.mv.ui.shake.a0 a0Var = this.f150903f;
        if (a0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvLyric", "onPause");
            i95.m c17 = i95.n0.c(qk.u8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.mv.ui.shake.z listener = a0Var.f150932j;
            kotlin.jvm.internal.o.g(listener, "listener");
            ((ef0.j3) ((qk.u8) c17)).f252241e.remove(listener);
        }
        com.tencent.mars.xlog.Log.i("MusicMainUINew", "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.mv.ui.shake.a0 a0Var;
        super.onResume();
        if (!this.f150913s) {
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(false);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(false);
        }
        if (!this.f150912r && (a0Var = this.f150903f) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvLyric", "onPause");
            i95.m c17 = i95.n0.c(qk.u8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.mv.ui.shake.z listener = a0Var.f150932j;
            kotlin.jvm.internal.o.g(listener, "listener");
            ((ef0.j3) ((qk.u8) c17)).f252241e.remove(listener);
        }
        com.tencent.mars.xlog.Log.i("MusicMainUINew", "onResume");
    }
}
