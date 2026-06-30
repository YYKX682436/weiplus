package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class j implements com.tencent.mm.plugin.topstory.ui.home.a, al5.f3 {
    public android.view.View A;
    public final com.tencent.mm.network.s0 A1;
    public android.view.View B;
    public boolean C;
    public boolean D;
    public boolean E;
    public long F;
    public com.google.android.material.tabs.TabLayout G;
    public android.content.Context M;
    public org.json.JSONObject Q;
    public final wm4.x R;
    public final oa.d S;
    public final androidx.viewpager.widget.a T;
    public final androidx.viewpager.widget.ViewPager.OnPageChangeListener U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final com.tencent.mm.sdk.event.IListener Z;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity f174986d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f174987e;

    /* renamed from: f, reason: collision with root package name */
    public r45.in6 f174988f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f174989g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.topstory.ui.webview.j f174990h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.websearch.webview.WebSearchWebView f174991i;

    /* renamed from: l1, reason: collision with root package name */
    public final androidx.lifecycle.k0 f174992l1;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.topstory.ui.webview.l f174993m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f174994n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.ThreeDotsLoadingView f174995o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f174996p;

    /* renamed from: p0, reason: collision with root package name */
    public final androidx.lifecycle.k0 f174997p0;

    /* renamed from: p1, reason: collision with root package name */
    public final androidx.lifecycle.k0 f174998p1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f175000r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f175001s;

    /* renamed from: x0, reason: collision with root package name */
    public final androidx.lifecycle.k0 f175007x0;

    /* renamed from: x1, reason: collision with root package name */
    public final androidx.lifecycle.k0 f175008x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f175009y;

    /* renamed from: y0, reason: collision with root package name */
    public final androidx.lifecycle.k0 f175010y0;

    /* renamed from: y1, reason: collision with root package name */
    public final androidx.lifecycle.k0 f175011y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager f175012z;

    /* renamed from: z1, reason: collision with root package name */
    public final mf0.c0 f175013z1;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f174999q = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public int f175002t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f175003u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f175004v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f175005w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f175006x = false;
    public final java.util.List H = new java.util.ArrayList();
    public int I = -1;

    /* renamed from: J, reason: collision with root package name */
    public int f174985J = -1;
    public int K = 0;
    public boolean L = false;
    public int N = 0;
    public int P = 0;

    public j(com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity, boolean z17) {
        j62.e.g().i("clicfg_k1k_message_liteapp_android", 0, false, true);
        this.R = new wm4.x();
        this.S = new com.tencent.mm.plugin.topstory.ui.home.w0(this);
        this.T = new com.tencent.mm.plugin.topstory.ui.home.x0(this);
        this.U = new com.tencent.mm.plugin.topstory.ui.home.z0(this);
        this.V = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.Z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TopStoryEvent>(a0Var) { // from class: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUIComponentImpl$18
            {
                this.__eventId = -1497615958;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TopStoryEvent topStoryEvent) {
                com.tencent.mm.autogen.events.TopStoryEvent topStoryEvent2 = topStoryEvent;
                int i17 = topStoryEvent2.f54898g.f6509a;
                am.ez ezVar = topStoryEvent2.f54899h;
                if (i17 != 1) {
                    com.tencent.mm.plugin.topstory.ui.home.j jVar = com.tencent.mm.plugin.topstory.ui.home.j.this;
                    if (i17 == 2) {
                        jVar.f174986d.finish();
                    } else if (i17 == 3) {
                        ezVar.f6618b = jVar.f174988f;
                    } else if (i17 == 4) {
                        jVar.f174986d.finishAndRemoveTask();
                    }
                } else {
                    ezVar.f6617a = true;
                }
                return true;
            }
        };
        this.f174997p0 = ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.tencent.mm.plugin.topstory.ui.home.t(this));
        this.f175007x0 = ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.tencent.mm.plugin.topstory.ui.home.v(this));
        this.f175010y0 = ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.tencent.mm.plugin.topstory.ui.home.x(this));
        this.f174992l1 = ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.tencent.mm.plugin.topstory.ui.home.y(this));
        this.f174998p1 = ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.tencent.mm.plugin.topstory.ui.home.z(this));
        this.f175008x1 = ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.tencent.mm.plugin.topstory.ui.home.a0(this));
        this.f175011y1 = ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.tencent.mm.plugin.topstory.ui.home.b0(this));
        this.f175013z1 = new com.tencent.mm.plugin.topstory.ui.home.l0(this);
        this.A1 = new com.tencent.mm.plugin.topstory.ui.home.m0(this);
        this.f174986d = baseMvvmActivity;
        this.f174987e = z17;
    }

    public static org.json.JSONObject a(com.tencent.mm.plugin.topstory.ui.home.j jVar, java.lang.String str) {
        jVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                jSONObject.put("reddotid", jSONObject2.optString("reddotid", ""));
                jSONObject.put("docid", jSONObject2.optString("docid", ""));
            }
            jSONObject.put("tabInfo", wm4.u.f(jVar.h()));
            jSONObject.put("time", c01.id.c());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "getEnterContentByRedDotInfo error", e17);
        }
        return jSONObject;
    }

    public static void d(com.tencent.mm.plugin.topstory.ui.home.j jVar, com.tencent.mm.plugin.finder.extension.reddot.a aVar, java.lang.String str) {
        jVar.getClass();
        if (aVar.f105331e.equals(str)) {
            java.util.Iterator it = ((java.util.ArrayList) jVar.f174999q).iterator();
            while (it.hasNext()) {
                wm4.y yVar = (wm4.y) it.next();
                if (str.equals(yVar.f447336t)) {
                    jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.w(jVar, aVar, yVar));
                }
            }
        }
    }

    public final void A() {
        if (this.f174988f.K == 1) {
            om4.p wi6 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
            wi6.i();
            wi6.h();
            wi6.j();
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity activity = this.f174986d;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.topstory.ui.home.y1 y1Var = (com.tencent.mm.plugin.topstory.ui.home.y1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.topstory.ui.home.y1.class);
            y1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryTabBubbleUIC", "onTopStoryExit");
            wm4.y yVar = y1Var.f175113d;
            if (yVar != null) {
                yVar.a(0, "", null, null);
            }
        }
        ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).f318216e = false;
    }

    public void C(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "setMaxCacheItemCountLimit = " + i17);
        if (i17 == 50) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193054b, new com.tencent.mm.ipcinvoker.type.IPCString(""), com.tencent.mm.plugin.topstory.ui.home.b1.class, new com.tencent.mm.plugin.topstory.ui.home.q0(this));
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193054b, new com.tencent.mm.ipcinvoker.type.IPCString(""), com.tencent.mm.plugin.topstory.ui.home.a1.class, new com.tencent.mm.plugin.topstory.ui.home.r0(this));
        }
    }

    public final void E() {
        r45.k74 lite_app_info;
        com.tencent.mm.plugin.finder.extension.reddot.jb L0;
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity activity = this.f174986d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.topstory.ui.home.d dVar = (com.tencent.mm.plugin.topstory.ui.home.d) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.topstory.ui.home.d.class);
        dVar.getClass();
        r45.xs2 xs2Var = dVar.f174952g;
        if (xs2Var != null) {
            boolean z17 = this.f174988f.K == 1;
            wm4.y h17 = h();
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(z17);
            objArr[1] = h17 == null ? "null" : java.lang.Integer.valueOf(h17.f447335s);
            objArr[2] = java.lang.Integer.valueOf(xs2Var.getInteger(9));
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tryStartPageByRedDotCtrInfo() called isLastTabStrategy:%s curItem.redDotTabType:%s redDotExtInfo.tab_type:%s", objArr);
            if (!z17 || h17 == null || h17.f447335s == xs2Var.getInteger(9)) {
                if (activity.getIntent().getIntExtra("key_forceEnterTabCategory", -1) == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "newlife force post jump, canel jump new page");
                    return;
                }
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var.getCustom(20);
                java.lang.String str = "";
                java.lang.String str2 = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).f255324d;
                java.lang.String str3 = null;
                try {
                    zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                    if (b6Var != null && (L0 = ((c61.l7) b6Var).nk().L0("NewLife.Entrance")) != null) {
                        r45.ez2 D0 = L0.D0();
                        java.lang.String i17 = (D0 == null || (byteString = D0.getByteString(4)) == null) ? null : byteString.i();
                        if (i17 == null) {
                            i17 = "";
                        }
                        com.tencent.mars.xlog.Log.i(str2, "getRedDotTabTipsByPassInfoJson: jsonString:".concat(i17));
                        str = i17;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(str2, "getRedDotParamsJson " + e17);
                }
                if (finderJumpInfo != null && finderJumpInfo.getHtml5_info() != null && !com.tencent.mm.sdk.platformtools.t8.K0(finderJumpInfo.getHtml5_info().getUrl())) {
                    java.lang.String url = finderJumpInfo.getHtml5_info().getUrl();
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tryStartPageByRedDotCtrInfo:url:%s", url);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("useJs", true);
                    intent.putExtra("vertical_scroll", true);
                    intent.putExtra("rawUrl", url);
                    intent.putExtra("key_enable_fts_quick", true);
                    intent.putExtra("key_enter_content_by_red_dot", true);
                    new android.os.Handler().postDelayed(new com.tencent.mm.plugin.topstory.ui.home.l(this, str, intent), 200L);
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(xs2Var.getString(8))) {
                    if (finderJumpInfo != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tryStartPageByRedDotCtrInfo: jumpinfo_type: %d, business_type: %d", java.lang.Integer.valueOf(finderJumpInfo.getJumpinfo_type()), java.lang.Integer.valueOf(finderJumpInfo.getBusiness_type()));
                        if (finderJumpInfo.getJumpinfo_type() == 6 && (lite_app_info = finderJumpInfo.getLite_app_info()) != null) {
                            new android.os.Handler().postDelayed(new com.tencent.mm.plugin.topstory.ui.home.o(this, str, activity, lite_app_info), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tryStartPageByRedDotCtrInfo: objectId:%s,object_nonce_id:%s", java.lang.Long.valueOf(xs2Var.getLong(3)), xs2Var.getString(8));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    try {
                        str3 = new org.json.JSONObject(str).optString("open_finder_feed_ext_info");
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", th6, "openFinderFeedExtInfo parse err", new java.lang.Object[0]);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tryStartPageByRedDotCtrInfo: openFinderFeedExtInfo:%s", str3);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        new android.os.Handler().postDelayed(new com.tencent.mm.plugin.topstory.ui.home.m(this, str), 200L);
                        return;
                    }
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("feed_object_id", xs2Var.getLong(3));
                intent2.putExtra("key_enter_content_by_red_dot", true);
                new android.os.Handler().postDelayed(new com.tencent.mm.plugin.topstory.ui.home.n(this, str, intent2), 200L);
            }
        }
    }

    @Override // aw4.q
    public android.content.Context H() {
        return this.f174986d;
    }

    @Override // aw4.q
    public aw4.l b() {
        return this.f174993m;
    }

    @Override // aw4.q
    public aw4.a c() {
        return this.f174990h;
    }

    public synchronized void e(int i17, boolean z17) {
        boolean z18;
        android.widget.TextView textView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeView, from ");
        sb6.append(z17 ? "viewpager" : "tab");
        sb6.append(", mLastPos =");
        sb6.append(this.f174985J);
        sb6.append(", pos = ");
        sb6.append(i17);
        sb6.append(", curpos = ");
        sb6.append(this.I);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", sb6.toString());
        if (i17 == this.I) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "changeView return");
            return;
        }
        n(i17);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity context = this.f174986d;
        kotlin.jvm.internal.o.g(context, "context");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(zm4.d.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((zm4.d) a17).O6(false);
        if (this.f174985J == -1) {
            if (i17 == 0) {
                this.f174985J = 1;
            } else if (i17 == 1) {
                this.f174985J = 0;
            } else if (i17 == 2) {
                this.f174985J = 1;
            } else if (i17 == 3) {
                this.f174985J = 2;
            } else if (i17 >= 3) {
                this.f174985J = i17 - 1;
            } else {
                this.f174985J = 0;
            }
        }
        java.util.List list = this.H;
        if (list == null || ((java.util.ArrayList) list).size() <= 1) {
            this.f174985J = 0;
        }
        int i18 = this.f174985J;
        this.I = i17;
        this.f174985J = i17;
        com.tencent.mm.plugin.topstory.ui.home.c1 c1Var = (com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) this.H).get(i18);
        wm4.y yVar = (wm4.y) ((java.util.ArrayList) this.f174999q).get(i18);
        if (this.A.getParent() == ((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) this.H).get(i18)).f174943b) {
            if (c1Var.f174945d <= 0) {
                z18 = true;
            } else {
                c1Var.f174944c.setVisibility(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "changeView cacheworked");
                z18 = false;
            }
            c1Var.f174945d = 2;
        } else {
            if (!pm4.w.k(yVar.f447318b) && (!pm4.w.n(yVar.f447318b) || !this.E)) {
                c1Var.f174944c.setVisibility(0);
                z18 = false;
            }
            c1Var.f174944c.setVisibility(8);
            z18 = false;
        }
        wm4.y h17 = h();
        if (!pm4.w.k(yVar.f447318b) && (!pm4.w.n(yVar.f447318b) || !this.E)) {
            this.V = false;
        }
        java.lang.String str = "";
        if (pm4.w.m(h17.f447318b) && h17.f447322f > 0) {
            str = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346433a.f384113d;
        }
        if (pm4.w.n(h17.f447318b) && h17.f447322f > 0) {
            str = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346435c.f384113d;
        }
        java.lang.String str2 = str;
        if (z18) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.topstory.ui.home.o0(this, c1Var, h17, i18, str2, z17), "CaptureWebViewTask");
        } else {
            j(h17, i18, str2, z17, false);
        }
        su4.k3.k(h17.f447318b, this.f175002t, com.tencent.mm.sdk.platformtools.t8.K0(h17.f447328l) ? h17.f447324h : h17.f447328l, this.f174988f.f377182d, z17);
        java.util.Iterator it = ((java.util.ArrayList) this.f174999q).iterator();
        int i19 = 0;
        while (it.hasNext()) {
            wm4.y yVar2 = (wm4.y) it.next();
            if (yVar2 != null && (textView = yVar2.f447331o) != null) {
                textView.setTypeface(null, i17 == i19 ? 1 : 0);
            }
            i19++;
        }
        pm4.x xVar = new pm4.x(this.I);
        j75.f stateCenter = this.f174986d.getStateCenter();
        if (stateCenter != null) {
            stateCenter.B3(xVar);
        }
        if (this.f175005w && !this.f175006x) {
            o(1, i18, yVar.f447338v, yVar.f447339w, yVar.hashCode(), null, true, yVar.f447340x);
            o(0, i17, h17.f447338v, h17.f447339w, h17.hashCode(), null, true, h17.f447340x);
        }
    }

    public final void f() {
        ra0.y Di;
        if (!((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).wi() || (Di = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di()) == null) {
            return;
        }
        sa0.d dVar = new sa0.d();
        j75.f Ai = ((en3.l0) Di).Ai();
        if (Ai != null) {
            Ai.B3(dVar);
        }
    }

    public final void g(java.lang.String str, long j17) {
        android.view.View view = this.f175001s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "exposeUserProfileRedDot", "(Ljava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "exposeUserProfileRedDot", "(Ljava/lang/String;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.qn6 qn6Var = new r45.qn6();
        qn6Var.f384113d = str;
        qn6Var.f384121o = j17;
        su4.k3.i(qn6Var, 107, 5, 0, 0L, "");
    }

    @Override // av4.j
    public com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView getWebView() {
        return this.f174991i;
    }

    public wm4.y h() {
        if (this.I < 0) {
            return null;
        }
        int size = this.f174999q.size();
        int i17 = this.I;
        if (size > i17) {
            return (wm4.y) this.f174999q.get(i17);
        }
        return null;
    }

    @Override // aw4.q
    public void hideVKB() {
    }

    public void i(int i17, int i18) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = this.f174986d;
        su4.k3.c("", 0, 0, i17);
        java.lang.String f17 = su4.r2.f(i17);
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("topStoryScene", java.lang.String.valueOf(this.f174988f.f377187i));
            hashMap.put("deviceName", java.net.URLEncoder.encode(o45.wf.f343026d, "utf8"));
            hashMap.put("deviceBrand", java.net.URLEncoder.encode(android.os.Build.BRAND, "utf8"));
            hashMap.put("deviceModel", java.net.URLEncoder.encode(wo.w0.m(), "utf8"));
            hashMap.put("from", java.net.URLEncoder.encode(baseMvvmActivity.getString(com.tencent.mm.R.string.jzs), "utf8"));
            hashMap.put("uin", gm0.j1.b().j());
            hashMap.put("timeZone", java.net.URLEncoder.encode("" + com.tencent.mm.sdk.platformtools.t8.k0(), "utf8"));
            hashMap.put("ostype", wo.q.f447784e);
            hashMap.put("subScene", "" + i18);
            hashMap.put("extInfo", ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().y());
            hashMap.put("needCameraIcon", "0");
        } catch (java.lang.Exception unused) {
        }
        su4.a1 a1Var = (su4.a1) i95.n0.c(su4.a1.class);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity2 = this.f174986d;
        ((com.tencent.mm.plugin.websearch.h2) a1Var).Ni(baseMvvmActivity2, i17, "", f17, true, hashMap, baseMvvmActivity2.getResources().getString(com.tencent.mm.R.string.k09), baseMvvmActivity.getResources().getColor(com.tencent.mm.R.color.BW_93), true);
    }

    public final void j(wm4.y yVar, int i17, java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "handleAddItemView curPos:%s lastPos:%s fromViewPager:%s fromCapture:%s", java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        boolean k17 = pm4.w.k(yVar.f447318b);
        java.util.List list = this.H;
        if (k17) {
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity activity = this.f174986d;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.topstory.ui.home.d1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.topstory.ui.home.d1.class)).T6(((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) list).get(this.I)).f174943b);
            return;
        }
        if (pm4.w.n(yVar.f447318b) && this.E) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).bk(this.B);
            k(((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) list).get(this.I)).f174943b);
            q(this.F, yVar.f447321e, yVar.f447322f, yVar.f447323g, str, false);
            return;
        }
        android.widget.FrameLayout frameLayout = ((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) list).get(this.I)).f174943b;
        android.view.ViewParent parent = this.A.getParent();
        if (parent == frameLayout) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "webview parent same, nto need remove and add");
            u();
        } else {
            if (parent != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "remove view from:" + i17 + ", hash:" + parent.hashCode());
                ((android.view.ViewGroup) parent).removeView(this.A);
            }
            frameLayout.addView(this.A, new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "add view to:" + this.I + ",hash:" + frameLayout.hashCode());
        }
        this.f174993m.v(yVar.f447321e, yVar.f447322f, yVar.f447323g, str, z17);
    }

    public final void k(android.widget.FrameLayout frameLayout) {
        frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.tencent.mm.R.color.BW_93, null));
        android.view.View view = this.B;
        if (view == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "[TopStoryLiteApp]video lite app view is null");
            return;
        }
        android.view.ViewParent parent = view.getParent();
        if (parent == frameLayout) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "[TopStoryLiteApp]handleAddVideoLiteAppView parent is ok, do nothing");
        } else {
            if (parent != null) {
                ((android.view.ViewGroup) this.B.getParent()).removeView(this.B);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "[TopStoryLiteApp]remove videoLiteApp from oldParent");
            }
            frameLayout.addView(this.B, new android.widget.FrameLayout.LayoutParams(-1, -1));
            if (!this.C) {
                android.view.View view2 = this.B;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "handleAddVideoLiteAppView", "(Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "handleAddVideoLiteAppView", "(Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "[TopStoryLiteApp]add videoLiteApp view");
    }

    public final void l() {
        com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f174993m;
        if (lVar != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.p(lVar));
            this.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.s(this));
        }
    }

    public final boolean m(wm4.y yVar) {
        if (yVar == null) {
            return false;
        }
        return ((pm4.w.n(yVar.f447318b) && this.E) || pm4.w.k(yVar.f447318b)) ? false : true;
    }

    public final void n(int i17) {
        wm4.y yVar = (i17 < 0 || ((java.util.ArrayList) this.f174999q).size() <= i17) ? null : (wm4.y) ((java.util.ArrayList) this.f174999q).get(i17);
        if (h() == null || yVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("toCategory", yVar.f447318b);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "notifyDidScrollExitPage json exception: " + e17.getMessage());
        }
        java.lang.String str = "didScrollExitPage";
        if (pm4.w.n(h().f447318b) && this.E) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            android.view.View view = this.B;
            ((com.tencent.mm.feature.lite.i) g0Var).getClass();
            if (view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) {
                com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = (com.tencent.liteapp.ui.WxaLiteAppBaseView) view;
                if (!wxaLiteAppBaseView.I) {
                    wxaLiteAppBaseView.onPause();
                    wxaLiteAppBaseView.I = true;
                }
            }
            ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ri(this.F, "didScrollExitPage", jSONObject);
            return;
        }
        if (pm4.w.n(yVar.f447318b) && this.E) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).bk(this.B);
        }
        if (!m(h()) || m(yVar)) {
            return;
        }
        com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f174993m;
        java.lang.String jSONObject2 = jSONObject.toString();
        lVar.getClass();
        com.tencent.mm.plugin.topstory.ui.webview.l$$c l__c = new com.tencent.mm.plugin.topstory.ui.webview.l$$c(lVar, str, jSONObject2);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            l__c.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(l__c);
        }
    }

    public final void o(int i17, int i18, int i19, int i27, int i28, java.util.HashMap hashMap, boolean z17, boolean z18) {
        com.tencent.mm.autogen.events.OnPageChanegeEvent onPageChanegeEvent = new com.tencent.mm.autogen.events.OnPageChanegeEvent();
        am.an anVar = onPageChanegeEvent.f54581g;
        anVar.f6164a = i17;
        anVar.f6165b = "TopStoryTab_" + i18;
        anVar.f6166c = i28;
        anVar.f6167d = i19;
        anVar.f6168e = i27;
        anVar.f6169f = hashMap;
        anVar.f6170g = z17;
        anVar.f6171h = z18;
        onPageChanegeEvent.e();
    }

    @Override // al5.f3
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onCancel() called");
        h();
    }

    @Override // al5.f3
    public void onDrag() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onDrag() called");
    }

    @Override // al5.f3
    public void onSwipeBack() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onSwipeBack() called");
    }

    public final void p(java.lang.String str) {
        if (h() == null) {
            return;
        }
        if (pm4.w.n(h().f447318b) && this.E) {
            ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ri(this.F, str, null);
        } else if (m(h())) {
            com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f174993m;
            lVar.getClass();
            com.tencent.mm.plugin.topstory.ui.webview.l$$c l__c = new com.tencent.mm.plugin.topstory.ui.webview.l$$c(lVar, str, "");
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                l__c.run();
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(l__c);
            }
        }
    }

    public final void q(long j17, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onTabSelected: %s, %s, %s, %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("tabInfo", str);
            jSONObject.put("contentReddot", i17);
            jSONObject.put("numberReddot", i18);
            jSONObject.put("msgId", str2);
            jSONObject.put("isByScroll", z17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onTabSelected json exception: " + e17.getMessage());
        }
        ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ri(j17, "onTabSelected", jSONObject);
    }

    public boolean r() {
        if (this.f175004v) {
            l();
            return true;
        }
        if (this.X) {
            pm4.y.f(this.f174988f, "uiBackBtnClick", c01.id.c());
        } else if (!this.W) {
            pm4.y.f(this.f174988f, "uiBackBtnClickWithoutGetSearchData", c01.id.c());
        } else if (this.Y) {
            pm4.y.f(this.f174988f, "uiBackBtnClickWithoutH5Ready", c01.id.c());
        } else {
            pm4.y.f(this.f174988f, "uiBackBtnClickWithoutDataReady", c01.id.c());
        }
        su4.k3.e(19);
        ((en3.b0) ((ra0.w) i95.n0.c(ra0.w.class))).Ai("OnBackBtnClick");
        boolean q17 = wm4.u.q();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = this.f174986d;
        if (q17 && (baseMvvmActivity instanceof com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI)) {
            baseMvvmActivity.moveTaskToBack(true);
            A();
            baseMvvmActivity.overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
        } else if (this.f174987e) {
            baseMvvmActivity.finish();
        } else {
            baseMvvmActivity.moveTaskToBack(true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onBackBtnClick:isJumpTabFindWhenBack:%s ", java.lang.Boolean.valueOf(this.f174988f.G));
        r45.in6 in6Var = this.f174988f;
        if (in6Var.G) {
            boolean z17 = in6Var.I;
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(baseMvvmActivity, "com.tencent.mm.ui.LauncherUI");
            intent.putExtra("LauncherUI.switch.tab", "tab_find_friend");
            if (z17) {
                intent.putExtra("LauncherUI.FindMore.HighLightPreference", "find_friends_by_look");
            }
            intent.setFlags(67108864);
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity2 = this.f174986d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(baseMvvmActivity2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "jumpToTabFind", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            baseMvvmActivity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(baseMvvmActivity2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl", "jumpToTabFind", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(android.os.Bundle r39) {
        /*
            Method dump skipped, instructions count: 3303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.topstory.ui.home.j.s(android.os.Bundle):void");
    }

    @Override // aw4.q
    public void showVKB() {
    }

    public void t() {
        android.view.View view;
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = this.f174991i;
        if (webSearchWebView != null) {
            webSearchWebView.B = null;
        }
        try {
            h();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onDestroy, homeContext.channelId = %s.", java.lang.Integer.valueOf(this.f174988f.f377194s));
            if (this.f174993m != null) {
                p("onWebCommendLeaveFromFindPage");
                mf0.b0 b0Var = this.f174993m.f175222i;
                if (b0Var != null) {
                    ((aa5.a) b0Var).f2690a.f340889c = null;
                }
            }
            if (this.f174991i.getParent() != null && this.f174991i.getParent().equals(this.f174989g)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "webViewContainer remove topstoryWebview");
                this.f174989g.removeView(this.f174991i);
            }
            if (this.E && (view = this.B) != null && view.getParent() != null && (this.B.getParent() instanceof android.view.ViewGroup)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "container remove videoLiteAppView");
                ((android.view.ViewGroup) this.B.getParent()).removeView(this.B);
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView2 = this.f174991i;
        if (webSearchWebView2 != null) {
            webSearchWebView2.removeJavascriptInterface("topStoryJSApi");
            this.f174991i.setWebChromeClient(null);
            this.f174991i.setWebViewClient(null);
            this.f174991i.destroy();
        }
        r45.in6 in6Var = this.f174988f;
        long activityBrowseTimeMs = this.f174986d.getActivityBrowseTimeMs();
        if (activityBrowseTimeMs > 0) {
            java.lang.String format = java.lang.String.format("%s,%s,%s,%s", java.lang.Integer.valueOf(in6Var.f377187i), java.lang.Long.valueOf(activityBrowseTimeMs), java.lang.Integer.valueOf(in6Var.f377194s), java.lang.Integer.valueOf(in6Var.f377196u));
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomePageBrowseTime 15018 %s", format);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(15018, format);
        }
        pm4.y.f(this.f174988f, "uiOnDestroy", c01.id.c());
        ((en3.b0) ((ra0.w) i95.n0.c(ra0.w.class))).Ai("HomeUIOnDestroy");
        su4.k3.e(18);
        com.tencent.mm.plugin.topstory.ui.webview.j jVar = this.f174990h;
        if (jVar != null) {
            jVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "onUIDestroy");
            jVar.f14844d = null;
            jVar.f175205f.clear();
            jVar.f175204e.clear();
            jVar.f175206g.clear();
            gm0.j1.d().q(1943, jVar);
            gm0.j1.d().q(2582, jVar.f175210n);
            gm0.j1.d().q(2802, jVar.f175209m);
            gm0.j1.d().q(2906, jVar.f175208i);
        }
        this.Z.dead();
        gm0.j1.n().d(this.A1);
        ((wm4.p) ((wm4.o) i95.n0.c(wm4.o.class))).f447300g = null;
        om4.p wi6 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
        if (wi6.f346437e == this.f175013z1) {
            wi6.f346437e = null;
        }
        zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
        androidx.lifecycle.k0 observer = this.f174997p0;
        ((c61.t8) caVar).getClass();
        kotlin.jvm.internal.o.g(observer, "observer");
        com.tencent.mm.plugin.finder.extension.reddot.aa.f105366g0.removeObserver(observer);
        androidx.lifecycle.k0 observer2 = this.f174998p1;
        kotlin.jvm.internal.o.g(observer2, "observer");
        androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.f105360d0;
        j0Var.removeObserver(observer2);
        androidx.lifecycle.k0 observer3 = this.f175007x0;
        kotlin.jvm.internal.o.g(observer3, "observer");
        androidx.lifecycle.j0 j0Var2 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105394u0;
        j0Var2.removeObserver(observer3);
        androidx.lifecycle.k0 observer4 = this.f175010y0;
        kotlin.jvm.internal.o.g(observer4, "observer");
        androidx.lifecycle.j0 j0Var3 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105398w0;
        j0Var3.removeObserver(observer4);
        androidx.lifecycle.k0 observer5 = this.f174992l1;
        kotlin.jvm.internal.o.g(observer5, "observer");
        androidx.lifecycle.j0 j0Var4 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105402y0;
        j0Var4.removeObserver(observer5);
        androidx.lifecycle.k0 observer6 = this.f175011y1;
        kotlin.jvm.internal.o.g(observer6, "observer");
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri()) {
            j0Var2.removeObserver(observer6);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105396v0.removeObserver(observer6);
            j0Var3.removeObserver(observer6);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105400x0.removeObserver(observer6);
            j0Var4.removeObserver(observer6);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105404z0.removeObserver(observer6);
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105392t0.removeObserver(observer6);
            j0Var.removeObserver(observer6);
        }
        C(-1);
        A();
    }

    public void u() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onH5RenderFinished canHideFakeIv:");
        sb6.append(this.V);
        sb6.append(" viewList.size():");
        java.util.List list = this.H;
        sb6.append(((java.util.ArrayList) list).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", sb6.toString());
        if (!this.V || ((java.util.ArrayList) list).size() <= 0) {
            this.V = true;
        } else {
            this.f175012z.postDelayed(new com.tencent.mm.plugin.topstory.ui.home.k(this, this.I), 100L);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:38|(2:40|(7:42|43|44|45|(5:47|(1:49)(1:57)|50|(1:56)(1:54)|55)|58|59))(1:134)|133|43|44|45|(0)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0203, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0204, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "lite app extra data failed" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03a9, code lost:
    
        if (r3 != 20001) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c A[Catch: JSONException -> 0x0203, TryCatch #0 {JSONException -> 0x0203, blocks: (B:45:0x012a, B:47:0x014c, B:50:0x015a, B:52:0x0165, B:54:0x016f, B:55:0x017d, B:58:0x0197), top: B:44:0x012a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(oa.i r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.topstory.ui.home.j.v(oa.i, boolean):void");
    }

    public void w(android.content.Intent intent) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity activity = this.f174986d;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onNewIntent: ");
        ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).f318216e = true;
        r45.in6 in6Var = new r45.in6();
        try {
            in6Var.parseFrom(intent.getByteArrayExtra("key_context"));
        } catch (java.lang.Exception unused) {
            activity.finish();
        }
        r45.in6 in6Var2 = this.f174988f;
        in6Var2.f377183e = in6Var.f377183e;
        in6Var2.f377184f = in6Var.f377184f;
        in6Var2.f377187i = in6Var.f377187i;
        in6Var2.f377189n = in6Var.f377189n;
        in6Var2.f377198w = com.tencent.mm.plugin.websearch.l2.b();
        r45.in6 in6Var3 = this.f174988f;
        in6Var3.H = in6Var.H;
        in6Var3.K = in6Var.K;
        in6Var3.f377181J = in6Var.f377181J;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.topstory.ui.home.d) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.topstory.ui.home.d.class)).O6(this.f174988f);
        pm4.y.f(this.f174988f, "uiOnNewIntent", c01.id.c());
        su4.k3.e(20);
        this.f174993m.t("onNewIntent");
        h();
        c61.t8 t8Var = (c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class));
        t8Var.cj(this.f175007x0);
        t8Var.fj(this.f175010y0);
        t8Var.hj(this.f174992l1);
        if (intent == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "initSelectTab: intent is null");
        } else {
            int intExtra = intent.getIntExtra("key_chosetab", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "initSelectTab: choseTabCategory:%s", java.lang.Integer.valueOf(intExtra));
            com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) activity.findViewById(com.tencent.mm.R.id.nup);
            java.util.Iterator it = ((java.util.ArrayList) this.f174999q).iterator();
            while (it.hasNext()) {
                wm4.y yVar = (wm4.y) it.next();
                int i17 = yVar.f447318b;
                if (i17 == intExtra) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "initSelectTab category %s", java.lang.Integer.valueOf(i17));
                    oa.i iVar = yVar.f447329m;
                    if (iVar != null) {
                        iVar.b();
                        ((com.tencent.mm.plugin.topstory.ui.home.c1) ((java.util.ArrayList) this.H).get(yVar.f447329m.f343782e)).f174944c.setVisibility(8);
                    }
                }
            }
            if (tabLayout.getSelectedTabPosition() < 0) {
                tabLayout.k(0).b();
            }
            if (((java.util.ArrayList) this.f174999q).size() == 1) {
                tabLayout.setSelectedTabIndicator(0);
                tabLayout.setSelectedTabIndicatorColor(0);
            }
        }
        p("onWebCommendEnterFromFindPage");
        E();
        f();
        ((com.tencent.mm.plugin.topstory.ui.home.y1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.topstory.ui.home.y1.class)).O6(intent);
    }

    public void x() {
        pm4.y.f(this.f174988f, "uiOnPause", c01.id.c());
        com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f174993m;
        if (lVar != null) {
            lVar.t("onPause");
        }
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = this.f174991i;
        if (webSearchWebView != null) {
            webSearchWebView.onPause();
        }
        this.f175005w = false;
        this.f175006x = true;
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai() != null) {
            int i17 = this.f175002t;
            if (i17 == 0) {
                i17 = wm4.u.j();
            }
            if (pm4.w.m(i17)) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai().d(104, false, false);
            } else if (pm4.w.l(i17)) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai().d(103, false, false);
            }
        }
        wm4.y h17 = h();
        if (h17 != null) {
            o(1, this.I, h17.f447338v, h17.f447339w, h17.hashCode(), null, true, h17.f447340x);
        }
    }

    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onResume() called ");
        pm4.y.f(this.f174988f, "uiOnResume", c01.id.c());
        com.tencent.mm.plugin.topstory.ui.webview.l lVar = this.f174993m;
        if (lVar != null) {
            lVar.t("onResume");
        }
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = this.f174991i;
        if (webSearchWebView != null) {
            webSearchWebView.onResume();
        }
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        java.util.Iterator it = ((java.util.ArrayList) this.f174999q).iterator();
        while (it.hasNext()) {
            wm4.y yVar = (wm4.y) it.next();
            if (yVar.f447323g > 0) {
                if (pm4.w.l(yVar.f447318b)) {
                    su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r(), 107, 2, yVar.f447323g, 0L, "");
                }
            } else if (yVar.f447322f > 0) {
                if (pm4.w.l(yVar.f447318b)) {
                    su4.k3.i(((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346434b, 107, 1, 0, 0L, "");
                } else if (pm4.w.m(yVar.f447318b)) {
                    r45.qn6 qn6Var = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346433a;
                    qn6Var.f384113d = yVar.f447324h;
                    su4.k3.i(qn6Var, 107, 3, 0, 0L, "");
                }
            }
        }
        this.f175005w = true;
        this.f175006x = false;
        this.L = false;
        final wm4.y h17 = h();
        if (h17 != null) {
            new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.topstory.ui.home.j$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.topstory.ui.home.j jVar = com.tencent.mm.plugin.topstory.ui.home.j.this;
                    int i17 = jVar.I;
                    wm4.y yVar2 = h17;
                    jVar.o(0, i17, yVar2.f447338v, yVar2.f447339w, yVar2.hashCode(), null, true, yVar2.f447340x);
                }
            }, 500L);
        }
    }

    public void z(android.os.Bundle bundle) {
        try {
            bundle.putAll(this.f174986d.getIntent().getExtras());
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onSaveInstanceState %s", this.f174988f.f377191p);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", e17, "onSaveInstanceState", new java.lang.Object[0]);
        }
    }

    @Override // av4.j
    public int z2() {
        return 0;
    }
}
