package kk2;

/* loaded from: classes3.dex */
public final class p extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    public static final kk2.e f308505t = new kk2.e(null);

    /* renamed from: h, reason: collision with root package name */
    public final jk2.a f308506h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.zd2 f308507i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f308508m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.model.guide.panel.LiveSquareGuidePanel$lifeObserver$1 f308509n;

    /* renamed from: o, reason: collision with root package name */
    public fg2.s1 f308510o;

    /* renamed from: p, reason: collision with root package name */
    public r45.es2 f308511p;

    /* renamed from: q, reason: collision with root package name */
    public long f308512q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f308513r;

    /* renamed from: s, reason: collision with root package name */
    public r45.fa2 f308514s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.tencent.mm.plugin.finder.live.model.guide.panel.LiveSquareGuidePanel$lifeObserver$1] */
    public p(jk2.a plugin, r45.zd2 guideData) {
        super(((df2.wv) plugin).f231723a.O6(), false, null, false, 12, null);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(guideData, "guideData");
        this.f308506h = plugin;
        this.f308507i = guideData;
        ae2.in.f3688a.r0();
        this.f308509n = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.live.model.guide.panel.LiveSquareGuidePanel$lifeObserver$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onPause() {
                c50.m0 y17 = kk2.p.this.y();
                if (y17 != null) {
                    c50.m0.b(y17, null, 1, null);
                }
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResume() {
                kk2.p.this.B();
            }
        };
        this.f308513r = jz5.h.b(new kk2.l(this));
        fg2.s1 s1Var = this.f308510o;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView headerText = s1Var.f262298d;
        kotlin.jvm.internal.o.f(headerText, "headerText");
        com.tencent.mm.ui.fk.a(headerText);
        fg2.s1 s1Var2 = this.f308510o;
        if (s1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        s1Var2.f262300f.setOnClickListener(this);
        fg2.s1 s1Var3 = this.f308510o;
        if (s1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        s1Var3.f262299e.setOnClickListener(this);
        fg2.s1 s1Var4 = this.f308510o;
        if (s1Var4 != null) {
            s1Var4.f262297c.setOnClickListener(this);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    public void A(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadSquareData container: ");
        sb6.append(this.f308514s);
        sb6.append(" isShowing: ");
        sb6.append(q());
        sb6.append(" active: ");
        kotlinx.coroutines.r2 r2Var = this.f308508m;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        com.tencent.mars.xlog.Log.i("LiveSquareGuidePanel", sb6.toString());
        if (z()) {
            return;
        }
        kotlinx.coroutines.r2 r2Var2 = this.f308508m;
        boolean z18 = false;
        if (r2Var2 != null && r2Var2.a()) {
            z18 = true;
        }
        if (z18) {
            return;
        }
        if (q()) {
            pm0.v.X(new kk2.f(this));
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar = ((df2.wv) this.f308506h).f231723a.f291099e;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = ubVar instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) ubVar : null;
        yg2.b viewScope = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getViewScope() : null;
        this.f308508m = viewScope != null ? kotlinx.coroutines.l.d(viewScope, kotlinx.coroutines.q1.f310570c, null, new kk2.i(this, z17, null), 2, null) : null;
    }

    public final void B() {
        if (q()) {
            fg2.s1 s1Var = this.f308510o;
            if (s1Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            s1Var.f262296b.post(new kk2.k(this));
        }
    }

    public final void C() {
        c50.m0 y17 = y();
        if (y17 != null) {
            c50.m0.b(y17, null, 1, null);
        }
        ((gp2.l0) y()).o();
    }

    public final void D(r45.fa2 fa2Var) {
        fg2.s1 s1Var = this.f308510o;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        s1Var.f262304j.setVisibility(4);
        fg2.s1 s1Var2 = this.f308510o;
        if (s1Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        s1Var2.f262296b.setVisibility(0);
        fg2.s1 s1Var3 = this.f308510o;
        if (s1Var3 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        df2.wv wvVar = (df2.wv) this.f308506h;
        s1Var3.f262301g.setReportObj(wvVar.c());
        fg2.s1 s1Var4 = this.f308510o;
        if (s1Var4 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        s1Var4.f262303i.setReportObj(wvVar.c());
        fg2.s1 s1Var5 = this.f308510o;
        if (s1Var5 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        s1Var5.f262302h.setReportObj(wvVar.c());
        if (fa2Var.f374129h.size() > 0) {
            fg2.s1 s1Var6 = this.f308510o;
            if (s1Var6 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            s1Var6.f262301g.post(new kk2.m(this, fa2Var));
        } else {
            fg2.s1 s1Var7 = this.f308510o;
            if (s1Var7 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            s1Var7.f262301g.setVisibility(8);
        }
        java.util.LinkedList linkedList = fa2Var.f374129h;
        if (linkedList.size() > 1) {
            fg2.s1 s1Var8 = this.f308510o;
            if (s1Var8 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            s1Var8.f262303i.setVisibility(0);
            fg2.s1 s1Var9 = this.f308510o;
            if (s1Var9 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            s1Var9.f262303i.post(new kk2.n(this, fa2Var));
        } else {
            fg2.s1 s1Var10 = this.f308510o;
            if (s1Var10 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            s1Var10.f262303i.setVisibility(8);
        }
        if (linkedList.size() > 2) {
            fg2.s1 s1Var11 = this.f308510o;
            if (s1Var11 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            s1Var11.f262302h.setVisibility(0);
            fg2.s1 s1Var12 = this.f308510o;
            if (s1Var12 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            s1Var12.f262302h.post(new kk2.o(this, fa2Var));
        } else {
            fg2.s1 s1Var13 = this.f308510o;
            if (s1Var13 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            s1Var13.f262302h.setVisibility(8);
        }
        this.f308514s = fa2Var;
        ((gp2.l0) y()).e(null);
        B();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadSquare flag: ");
        r45.zd2 zd2Var = this.f308507i;
        sb6.append(zd2Var.getBoolean(4));
        com.tencent.mars.xlog.Log.i("LiveSquareGuidePanel", sb6.toString());
        if (zd2Var.getBoolean(4)) {
            ys5.f fVar = (ys5.f) i95.n0.c(ys5.f.class);
            ys5.e eVar = ys5.e.f465260h;
            r45.es2 es2Var = this.f308511p;
            ((sq2.g) fVar).wi(eVar, 0.0f, new ws5.h("closeGuidePreload", 135, "", es2Var != null ? es2Var.getByteString(3) : null, null));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return h();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dow;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.protobuf.g byteString;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/guide/panel/LiveSquareGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.s1 s1Var = this.f308510o;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = s1Var.f262299e.getId();
        kk2.e eVar = f308505t;
        jk2.a aVar = this.f308506h;
        if (valueOf != null && valueOf.intValue() == id6) {
            eVar.a(2);
            ((df2.wv) aVar).a();
            java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(26, 2, 313);
            com.tencent.mars.xlog.Log.i("LiveSquareGuidePanel", "#gotoMoreLiveImpl contextId:" + Gj);
            uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
            android.content.Intent intent = new android.content.Intent();
            r45.es2 es2Var = this.f308511p;
            if (es2Var != null && (byteString = es2Var.getByteString(3)) != null) {
                intent.putExtra("nearby_live_target_last_buffer_params_key", byteString.f192156a);
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(Gj);
            intent.putExtra("key_context_id", Gj);
            ws5.j[] jVarArr = ws5.j.f449218d;
            intent.putExtra("nearby_live_enter_source_params_key", 2);
            intent.putExtra("nearby_live_forbid_enter_preload_params_key", true);
            intent.putExtra("nearby_live_disable_clean_red_params_key", true);
            intent.putExtra("nearby_live_preload_cache_business_params_key", "closeGuidePreload");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ref_commenscene", 313);
            jSONObject.put("liveid", pm0.v.u(((mm2.e1) ((df2.wv) aVar).b().a(mm2.e1.class)).f328988r.getLong(0)));
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            intent.putExtra("NEARBY_LIVE_REPORT_REF_JSON_KEY", r26.i0.t(jSONObject2, ",", ";", false));
            ((v40.s) nVar).wi(this.f118381d, intent);
            C();
        } else {
            fg2.s1 s1Var2 = this.f308510o;
            if (s1Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = s1Var2.f262300f.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                eVar.a(3);
                a();
                ((df2.wv) aVar).a();
            } else {
                fg2.s1 s1Var3 = this.f308510o;
                if (s1Var3 == null) {
                    kotlin.jvm.internal.o.o("uiBinding");
                    throw null;
                }
                int id8 = s1Var3.f262297c.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    eVar.a(4);
                    a();
                    com.tencent.mm.sdk.platformtools.o4.L().putInt("live_close_square_guide_forbid_tips", 1);
                    pm0.v.V(200L, new kk2.j(this));
                    ((df2.wv) aVar).a();
                    C();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/guide/panel/LiveSquareGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.a4f;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.a4f);
        if (weImageView != null) {
            i17 = com.tencent.mm.R.id.cgi;
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.cgi);
            if (roundCornerRelativeLayout != null) {
                i17 = com.tencent.mm.R.id.che;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.che);
                if (linearLayout != null) {
                    i17 = com.tencent.mm.R.id.r_7;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.r_7);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.gz9;
                        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(rootView, com.tencent.mm.R.id.gz9);
                        if (finderFixedTextView != null) {
                            i17 = com.tencent.mm.R.id.f485454ra1;
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.f485454ra1);
                            if (relativeLayout != null) {
                                i17 = com.tencent.mm.R.id.ra6;
                                com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) x4.b.a(rootView, com.tencent.mm.R.id.ra6);
                                if (weButton != null) {
                                    i17 = com.tencent.mm.R.id.icl;
                                    com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView guideSquareLivingCardView = (com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView) x4.b.a(rootView, com.tencent.mm.R.id.icl);
                                    if (guideSquareLivingCardView != null) {
                                        i17 = com.tencent.mm.R.id.ifc;
                                        com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView guideSquareLivingCardView2 = (com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView) x4.b.a(rootView, com.tencent.mm.R.id.ifc);
                                        if (guideSquareLivingCardView2 != null) {
                                            i17 = com.tencent.mm.R.id.f485640ig2;
                                            com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView guideSquareLivingCardView3 = (com.tencent.mm.plugin.finder.live.view.GuideSquareLivingCardView) x4.b.a(rootView, com.tencent.mm.R.id.f485640ig2);
                                            if (guideSquareLivingCardView3 != null) {
                                                i17 = com.tencent.mm.R.id.ihm;
                                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.ihm);
                                                if (linearLayout2 != null) {
                                                    i17 = com.tencent.mm.R.id.imc;
                                                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.tencent.mm.R.id.imc);
                                                    if (progressBar != null) {
                                                        this.f308510o = new fg2.s1((androidx.core.widget.NestedScrollView) rootView, weImageView, roundCornerRelativeLayout, linearLayout, textView, finderFixedTextView, relativeLayout, weButton, guideSquareLivingCardView, guideSquareLivingCardView2, guideSquareLivingCardView3, linearLayout2, progressBar);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        androidx.lifecycle.o mo133getLifecycle;
        super.t();
        com.tencent.mars.xlog.Log.i("LiveSquareGuidePanel", "onDismiss");
        C();
        android.content.Context context = this.f118381d;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity == null || (mo133getLifecycle = mMActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.c(this.f308509n);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        androidx.lifecycle.o mo133getLifecycle;
        android.content.Context context = this.f118381d;
        jz5.f0 f0Var = null;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null && (mo133getLifecycle = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.a(this.f308509n);
        }
        super.w();
        r45.fa2 fa2Var = this.f308514s;
        if (fa2Var != null) {
            D(fa2Var);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            kotlinx.coroutines.r2 r2Var = this.f308508m;
            if (!(r2Var != null && ((kotlinx.coroutines.a) r2Var).a())) {
                A(false);
            }
        }
        f308505t.a(1);
    }

    public final c50.m0 y() {
        return (c50.m0) ((jz5.n) this.f308513r).getValue();
    }

    public final boolean z() {
        long currentTimeMillis = (java.lang.System.currentTimeMillis() - this.f308512q) / 1000;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isCacheValid cacheTime: ");
        sb6.append(currentTimeMillis);
        sb6.append(" preload_interval_sec: ");
        r45.es2 es2Var = this.f308511p;
        sb6.append(es2Var != null ? java.lang.Integer.valueOf(es2Var.getInteger(2)) : null);
        com.tencent.mars.xlog.Log.i("LiveSquareGuidePanel", sb6.toString());
        r45.es2 es2Var2 = this.f308511p;
        if (es2Var2 != null) {
            return currentTimeMillis <= ((long) (es2Var2 != null ? es2Var2.getInteger(2) : 0));
        }
        return false;
    }
}
