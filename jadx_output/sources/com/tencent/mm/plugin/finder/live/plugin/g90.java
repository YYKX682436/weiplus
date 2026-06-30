package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g90 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f112651a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f112652b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.RelativeLayout f112653c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f112654d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.TextureView f112655e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f112656f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer f112657g;

    /* renamed from: h, reason: collision with root package name */
    public final int f112658h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112659i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f112660j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f112661k;

    /* renamed from: l, reason: collision with root package name */
    public final int f112662l;

    /* renamed from: m, reason: collision with root package name */
    public int f112663m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedHashMap f112664n;

    public g90(android.view.ViewGroup root, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f112651a = root;
        this.f112652b = basePlugin;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f484618ex2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f112653c = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f484617ex1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f112654d = (android.widget.RelativeLayout) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f484616ex0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f112655e = (android.view.TextureView) findViewById3;
        this.f112656f = root.getRootView().findViewById(com.tencent.mm.R.id.ejw);
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f484620ex4);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = (com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer) findViewById4;
        this.f112657g = finderLiveFloatContainer;
        this.f112662l = com.tencent.mm.ui.zk.a(root.getContext(), 16);
        int e17 = e();
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f112658h = r4Var.Y1(context) ? com.tencent.mm.ui.zk.a(root.getContext(), 8) : (int) ((com.tencent.mm.ui.bl.b(root.getContext()).x - e17) - com.tencent.mm.ui.zk.a(root.getContext(), 16));
        finderLiveFloatContainer.setTranslationX(0.0f);
        finderLiveFloatContainer.setRadius(i65.a.b(root.getContext(), 8));
        finderLiveFloatContainer.setOnTouchCallback(new com.tencent.mm.plugin.finder.live.plugin.y80(this));
        finderLiveFloatContainer.setOnAnimCallback(new com.tencent.mm.plugin.finder.live.plugin.z80(this));
        this.f112664n = new java.util.LinkedHashMap();
    }

    public final void a(android.view.View view) {
        android.util.Size size;
        kn0.p pVar;
        kn0.p pVar2;
        android.view.ViewGroup viewGroup = this.f112651a;
        viewGroup.setVisibility(0);
        int a17 = com.tencent.mm.ui.zk.a(viewGroup.getContext(), 160);
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean Y1 = r4Var.Y1(context);
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = this.f112657g;
        int i17 = this.f112658h;
        java.lang.Boolean bool = null;
        if (Y1) {
            a17 = (com.tencent.mm.ui.bl.b(viewGroup.getContext()).y - finderLiveFloatContainer.getHeight()) / 2;
            android.view.ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = a17;
                marginLayoutParams.setMarginEnd(i17);
            }
            int h17 = com.tencent.mm.ui.bl.h(viewGroup.getContext());
            finderLiveFloatContainer.f115867u = h17;
            finderLiveFloatContainer.f115868v = h17;
            finderLiveFloatContainer.f115869w = i17;
            finderLiveFloatContainer.f115870x = i17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = finderLiveFloatContainer.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = a17;
                marginLayoutParams2.setMarginEnd(i17);
            }
            int c17 = c();
            finderLiveFloatContainer.f115867u = a17;
            finderLiveFloatContainer.f115868v = c17;
            int i18 = this.f112662l;
            finderLiveFloatContainer.f115869w = i18;
            finderLiveFloatContainer.f115870x = i18;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = finderLiveFloatContainer.getLayoutParams();
        if (layoutParams3 != null) {
            size = new android.util.Size(layoutParams3.width, layoutParams3.height);
        } else {
            jz5.g gVar = tn0.j1.f420696p;
            size = new android.util.Size(((java.lang.Number) ((jz5.n) tn0.j1.f420696p).getValue()).intValue(), ((java.lang.Number) ((jz5.n) tn0.j1.f420697q).getValue()).intValue());
        }
        tn0.w0 d17 = d();
        if (d17 != null) {
            d17.K0(true, this.f112655e, size, view);
        }
        h();
        tn0.w0 d18 = d();
        if ((d18 == null || (pVar2 = d18.D) == null || !pVar2.e()) ? false : true) {
            b();
        } else {
            finderLiveFloatContainer.setVisibility(0);
            finderLiveFloatContainer.post(new com.tencent.mm.plugin.finder.live.plugin.a90(this));
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        if (y4Var.f328297f0 == 0) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.f328297f0 = java.lang.System.currentTimeMillis();
            cl0.g gVar2 = new cl0.g();
            ml2.v2[] v2VarArr = ml2.v2.f328147d;
            gVar2.s("type", 3);
            java.lang.String str = this.f112661k;
            if (str == null) {
                str = "other";
            }
            gVar2.s("result", str);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.H, gVar2.toString(), null, 4, null);
        }
        if (r4Var.x1()) {
            qo0.c cVar = this.f112652b.f113325g;
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) cVar;
            tn0.w0 d19 = d();
            cl0.g gVar3 = d19 != null ? ((in0.q) d19).T1 : null;
            tn0.w0 d27 = d();
            org.json.JSONObject J2 = d27 != null ? d27.J() : null;
            tn0.w0 d28 = d();
            com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(k0Var, gVar3, J2, d28 != null ? ((in0.q) d28).W0() : null, false, null, 24, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startScreenShare isAudioMode:");
        tn0.w0 d29 = d();
        if (d29 != null && (pVar = d29.D) != null) {
            bool = java.lang.Boolean.valueOf(pVar.e());
        }
        sb6.append(bool);
        sb6.append(" topBoundary:");
        sb6.append(a17);
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShareWidget", sb6.toString());
    }

    public final void b() {
        mm2.c1 c1Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        java.lang.String string = (c1Var2 == null || (finderObject2 = c1Var2.f328846n) == null || (objectDesc2 = finderObject2.getObjectDesc()) == null || (liveDesc = objectDesc2.getLiveDesc()) == null) ? null : liveDesc.getString(0);
        if ((string == null || string.length() == 0) && ((c1Var = (mm2.c1) efVar.i(mm2.c1.class)) == null || (finderObject = c1Var.f328846n) == null || (objectDesc = finderObject.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null || (string = finderMedia.getUrl()) == null)) {
            string = "";
        }
        this.f112657g.setVisibility(8);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveCoverUrl:");
        sb6.append(string);
        sb6.append(", liveData.audioModeHolderBm:");
        mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
        sb6.append(c1Var3 != null ? c1Var3.I4 : null);
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShareWidget", sb6.toString());
    }

    public final int c() {
        android.view.ViewGroup viewGroup = this.f112651a;
        int a17 = com.tencent.mm.ui.zk.a(viewGroup.getContext(), 90) + com.tencent.mm.ui.bl.c(viewGroup.getContext());
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) this.f112652b.X0(com.tencent.mm.plugin.finder.live.plugin.mg.class);
        return a17 + (mgVar != null ? mgVar.f113510w.getF116124g() : 0);
    }

    public final tn0.w0 d() {
        return dk2.ef.f233372a.e();
    }

    public final int e() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f112657g.getLayoutParams();
        if (layoutParams != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(layoutParams.width);
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return com.tencent.mm.ui.zk.a(this.f112651a.getContext(), 72);
    }

    public final void f(boolean z17) {
        int i17;
        boolean z18;
        ts0.r rVar;
        kn0.f fVar;
        kn0.f fVar2;
        kn0.p pVar;
        tn0.w0 d17 = d();
        if ((d17 == null || (pVar = d17.D) == null || !pVar.f309589i) ? false : true) {
            if (z17) {
                b();
                return;
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = this.f112657g;
            finderLiveFloatContainer.setVisibility(0);
            finderLiveFloatContainer.post(new com.tencent.mm.plugin.finder.live.plugin.a90(this));
            tn0.w0 d18 = d();
            if (d18 != null) {
                dk2.ef efVar = dk2.ef.f233372a;
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var != null && c1Var.O7()) {
                    in0.q e17 = efVar.e();
                    i17 = e17 != null && !e17.W() ? 3 : 1;
                } else {
                    i17 = 0;
                }
                kn0.i iVar = d18.C;
                if (iVar == null || (fVar2 = iVar.f309560d) == null) {
                    z18 = !(d18.f420776w != null && !ts0.c.f421548h);
                } else {
                    z18 = fVar2.f309530b;
                }
                d18.V(z18);
                kn0.i iVar2 = d18.C;
                boolean z19 = (iVar2 == null || (fVar = iVar2.f309560d) == null || !fVar.f309531c) ? false : true;
                go0.f0 f0Var = d18.f420771r;
                if (z19 && (rVar = d18.f420775v) != null) {
                    rVar.k(f0Var.getFrameDataCallback());
                }
                vn0.c cVar = vn0.b.f438174a;
                cVar.a().getClass();
                cVar.d().getClass();
                xn0.b b17 = cVar.b();
                ts0.r rVar2 = d18.f420775v;
                b17.f455410a = rVar2 != null ? rVar2.e() : 0;
                f0Var.getClass();
                f0Var.l(new go0.p(f0Var));
                f0Var.l(new go0.b0(f0Var, null));
                f0Var.u(new tn0.q(d18, i17));
            }
            h();
        }
    }

    public final void g(int i17, java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        this.f112663m = i17;
        java.util.LinkedHashMap linkedHashMap = this.f112664n;
        linkedHashMap.clear();
        linkedHashMap.putAll(micUserMap);
        this.f112657g.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.live.plugin.e90(this, i17, micUserMap));
    }

    public final void h() {
        android.view.TextureView textureView = this.f112655e;
        android.view.ViewParent parent = textureView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(textureView);
        }
        if (viewGroup != null) {
            viewGroup.addView(textureView);
        }
        java.util.LinkedHashMap linkedHashMap = this.f112664n;
        if (!linkedHashMap.isEmpty()) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.putAll(linkedHashMap);
            g(this.f112663m, linkedHashMap2);
        }
    }

    public final void i() {
        cl0.g gVar = new cl0.g();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        long j17 = (currentTimeMillis - y4Var.f328297f0) / 1000;
        ml2.v2[] v2VarArr = ml2.v2.f328147d;
        gVar.s("type", 4);
        gVar.s("result", java.lang.Long.valueOf(j17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.H, gVar.toString(), null, 4, null);
        cl0.d dVar = new cl0.d();
        dVar.e("type", this.f112661k);
        dVar.e("time", java.lang.Long.valueOf(j17));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        y4Var.f328299g0.q(dVar);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        y4Var.f328297f0 = 0L;
    }

    public final void j() {
        tn0.w0 d17;
        android.graphics.Point a17;
        android.graphics.Point a18;
        android.graphics.Point a19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restoreScreenShare floatPosition:");
        tn0.w0 d18 = d();
        sb6.append(d18 != null ? d18.Q().a() : null);
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShareWidget", sb6.toString());
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = this.f112651a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (r4Var.Y1(context) || (d17 = d()) == null || (a17 = d17.Q().a()) == null) {
            return;
        }
        if (a17.x == 0 && a17.y == 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f112657g.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            tn0.w0 d19 = d();
            int i17 = 0;
            marginLayoutParams.setMarginEnd((d19 == null || (a19 = d19.Q().a()) == null) ? 0 : a19.x);
            tn0.w0 d27 = d();
            if (d27 != null && (a18 = d27.Q().a()) != null) {
                i17 = a18.y;
            }
            marginLayoutParams.topMargin = i17;
        }
    }

    public final void k(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f112661k = "public_word";
        zg0.r2 r2Var = (zg0.r2) i95.n0.c(zg0.r2.class);
        android.content.Context context = this.f112651a.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 wi6 = ((yg0.a) r2Var).wi((android.app.Activity) context, url, null, new com.tencent.mm.plugin.webview.ui.tools.widget.e0(0.0f, null, false, 0, null, true, null, null, null, false, 991, null));
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var != null) {
            c1Var.f328876r5 = url;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.z1.B6(wi6, null, 1, null);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.finder.live.plugin.f90(((com.tencent.mm.plugin.webview.ui.tools.widget.o4) wi6).f187467i, this, wi6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        if (((java.util.HashSet) o35.a.f342751a).contains(r17.f112661k.toLowerCase()) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r18) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.g90.l(int):void");
    }
}
