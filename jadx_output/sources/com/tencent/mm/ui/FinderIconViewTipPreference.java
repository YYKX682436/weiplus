package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class FinderIconViewTipPreference extends com.tencent.mm.plugin.newtips.NormalIconNewTipPreference {
    public java.util.ArrayList A2;
    public android.widget.TextView B2;
    public android.view.View C2;
    public android.widget.ImageView D2;
    public android.widget.ImageView E2;
    public android.widget.ImageView F2;
    public android.widget.ImageView G2;
    public m40.q0 H2;
    public m40.q0 I2;
    public int J2;
    public boolean K2;
    public int L2;
    public r45.pm6 M2;
    public boolean N2;
    public boolean O2;
    public boolean P2;
    public boolean Q2;
    public boolean R2;
    public final oc2.k S2;
    public r45.f03 T2;
    public r45.fz2 U2;
    public android.widget.RelativeLayout V2;
    public com.tencent.mm.ui.widget.imageview.WeImageView W2;
    public android.widget.LinearLayout X2;
    public android.widget.RelativeLayout Y2;
    public android.widget.LinearLayout.LayoutParams Z2;

    /* renamed from: a3, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f196687a3;

    /* renamed from: b3, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f196688b3;

    /* renamed from: c3, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f196689c3;

    /* renamed from: d3, reason: collision with root package name */
    public final java.lang.Boolean f196690d3;

    /* renamed from: e3, reason: collision with root package name */
    public final java.lang.Float f196691e3;

    /* renamed from: f3, reason: collision with root package name */
    public final java.lang.Float f196692f3;

    /* renamed from: g3, reason: collision with root package name */
    public final java.lang.Boolean f196693g3;

    /* renamed from: h3, reason: collision with root package name */
    public java.lang.CharSequence f196694h3;

    /* renamed from: i2, reason: collision with root package name */
    public final java.lang.String f196695i2;

    /* renamed from: i3, reason: collision with root package name */
    public r45.f03 f196696i3;

    /* renamed from: j2, reason: collision with root package name */
    public final android.content.Context f196697j2;

    /* renamed from: j3, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f196698j3;

    /* renamed from: k2, reason: collision with root package name */
    public android.view.ViewGroup f196699k2;

    /* renamed from: k3, reason: collision with root package name */
    public r45.f03 f196700k3;

    /* renamed from: l2, reason: collision with root package name */
    public android.view.View f196701l2;

    /* renamed from: l3, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f196702l3;

    /* renamed from: m2, reason: collision with root package name */
    public android.view.View f196703m2;

    /* renamed from: n2, reason: collision with root package name */
    public android.view.View f196704n2;

    /* renamed from: o2, reason: collision with root package name */
    public android.view.View f196705o2;

    /* renamed from: p2, reason: collision with root package name */
    public android.widget.ImageView f196706p2;

    /* renamed from: q2, reason: collision with root package name */
    public android.widget.ImageView f196707q2;

    /* renamed from: r2, reason: collision with root package name */
    public android.widget.ImageView f196708r2;

    /* renamed from: s2, reason: collision with root package name */
    public android.widget.ImageView f196709s2;

    /* renamed from: t2, reason: collision with root package name */
    public android.widget.ImageView f196710t2;

    /* renamed from: u2, reason: collision with root package name */
    public android.widget.ImageView f196711u2;

    /* renamed from: v2, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f196712v2;

    /* renamed from: w2, reason: collision with root package name */
    public android.widget.TextView f196713w2;

    /* renamed from: x2, reason: collision with root package name */
    public android.widget.TextView f196714x2;

    /* renamed from: y2, reason: collision with root package name */
    public android.widget.ImageView f196715y2;

    /* renamed from: z2, reason: collision with root package name */
    public java.util.ArrayList f196716z2;

    public FinderIconViewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int A0(java.lang.String str) {
        int parseColor;
        java.lang.String str2 = this.f196695i2;
        int i17 = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        if (!str.startsWith("#")) {
            str = "#".concat(str);
        }
        try {
            if (str.length() == 9) {
                parseColor = android.graphics.Color.parseColor(str.charAt(0) + str.substring(7, 9) + str.substring(1, 7));
            } else {
                parseColor = android.graphics.Color.parseColor(str);
            }
            i17 = parseColor;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str2, e17, "getColor", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i(str2, "getColor  color:" + str + " colorInt:" + i17);
        return i17;
    }

    public int B0() {
        m40.q0 q0Var = this.H2;
        if (q0Var != null && q0Var.getView().getVisibility() == 0) {
            return this.H2.getDropStat();
        }
        m40.q0 q0Var2 = this.I2;
        if (q0Var2 == null || q0Var2.getView().getVisibility() != 0) {
            return 0;
        }
        return this.I2.getDropStat();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ae, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3839p0).getValue()).r()).intValue() == 1) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zy2.na C0() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.FinderIconViewTipPreference.C0():zy2.na");
    }

    public final android.widget.ImageView E0(int i17) {
        if (i17 == 0) {
            return this.D2;
        }
        if (i17 == 1) {
            return this.E2;
        }
        if (i17 != 2) {
            return null;
        }
        return this.F2;
    }

    public java.lang.String F0() {
        java.lang.String str = this.f197780q;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -822443309:
                if (str.equals("find_friends_by_finder_live_above_look")) {
                    c17 = 0;
                    break;
                }
                break;
            case -497456467:
                if (str.equals("find_friends_by_finder_live")) {
                    c17 = 1;
                    break;
                }
                break;
            case 886691415:
                if (str.equals("find_friends_by_look")) {
                    c17 = 2;
                    break;
                }
                break;
            case 974172121:
                if (str.equals("find_live_friends_by_near")) {
                    c17 = 3;
                    break;
                }
                break;
            case 1529575902:
                if (str.equals("find_friends_by_finder")) {
                    c17 = 4;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
            case 1:
                return "FinderLiveEntrance";
            case 2:
                return "NewLife.Entrance";
            case 3:
                return "NearbyEntrance";
            case 4:
            default:
                return "FinderEntrance";
        }
    }

    public final java.lang.String G0(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -58348260:
                if (str.equals("FinderEntrance")) {
                    c17 = 0;
                    break;
                }
                break;
            case 691368744:
                if (str.equals("FinderLiveEntrance")) {
                    c17 = 1;
                    break;
                }
                break;
            case 935133594:
                if (str.equals("FinderMentionEntrance")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1122432629:
                if (str.equals("NearbyEntrance")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return "finder_entrance";
            case 1:
                return "finder_live_entrance";
            case 2:
                return "finder_mention_entrance";
            case 3:
                return "nearby_entrance";
            default:
                return null;
        }
    }

    public int H0() {
        m40.q0 q0Var = this.H2;
        if (q0Var == null || q0Var.getView().getVisibility() != 0) {
            return 1;
        }
        return this.H2.getRowCount();
    }

    public final int I0(com.tencent.mm.ui.m6 m6Var) {
        int x07;
        android.view.View findViewById;
        android.widget.TextView textView;
        int i17;
        android.view.View view;
        android.view.View view2;
        com.tencent.mm.ui.m6 m6Var2 = com.tencent.mm.ui.m6.ORIGINAL;
        android.content.Context context = this.Y1;
        java.lang.Boolean bool = this.f196693g3;
        java.lang.String str = this.f196695i2;
        if (m6Var != m6Var2) {
            int width = this.Z1.getWidth();
            if (width <= 0) {
                com.tencent.mars.xlog.Log.w(str, "[getDslMaxWidth] screenWidth=%s", java.lang.Integer.valueOf(width));
                width = this.Z1.getContext().getResources().getDisplayMetrics().widthPixels;
            }
            android.widget.TextView textView2 = (android.widget.TextView) this.Z1.findViewById(android.R.id.title);
            android.content.res.Resources resources = textView2.getResources();
            android.graphics.Rect rect = new android.graphics.Rect();
            textView2.getGlobalVisibleRect(rect);
            oc2.n nVar = (oc2.n) this.S2;
            int width2 = (!nVar.b() || (findViewById = this.Z1.findViewById(com.tencent.mm.R.id.o58)) == null) ? 0 : findViewById.getWidth();
            int i18 = rect.right;
            if (width > 0 && i18 > width) {
                com.tencent.mm.sdk.platformtools.Log.c(str, "[getDslMaxWidth] error thread:%s", java.lang.Thread.currentThread().getName());
                i18 %= width;
            }
            int dimension = (int) resources.getDimension(com.tencent.mm.R.dimen.f479738dv);
            x07 = (!nVar.b() || width2 <= 0) ? x0() : 0;
            int dimension2 = (int) resources.getDimension(com.tencent.mm.R.dimen.f479693cs);
            int dimension3 = (int) resources.getDimension(com.tencent.mm.R.dimen.f479688cn);
            int round = java.lang.Math.round(this.f196691e3.floatValue());
            if (bool.booleanValue()) {
                float b17 = j65.c.b(context);
                if (b17 > 0.0f) {
                    round = (int) (round / b17);
                } else {
                    com.tencent.mars.xlog.Log.i(str, "[getDslMaxWidth] fontSize:%s", java.lang.Float.valueOf(b17));
                }
            }
            int i19 = ((((((width - i18) - dimension) - x07) - round) - dimension2) - dimension3) - width2;
            com.tencent.mars.xlog.Log.i(str, "[getDslMaxWidth] screenWidth=%s availableWidth=%s occupiedWidth=%s titleText=%s textSize=%s titleTextEnd=%s titleTextEndPadding=%s countRedDotWidth=%s mentionReddotWidth=%s rightArrowArea=%s endPadding=%s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(round), textView2.getText(), java.lang.Float.valueOf(textView2.getTextSize()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(dimension), java.lang.Integer.valueOf(x07), java.lang.Integer.valueOf(width2), java.lang.Integer.valueOf(dimension2), java.lang.Integer.valueOf(dimension3));
            return i19;
        }
        android.content.res.Resources resources2 = this.f196714x2.getResources();
        int dimension4 = (int) resources2.getDimension(com.tencent.mm.R.dimen.f479716d9);
        android.widget.RelativeLayout relativeLayout = this.V2;
        int i27 = (relativeLayout == null || relativeLayout.getVisibility() != 0 || (((view = this.f196701l2) == null || view.getVisibility() != 0) && ((view2 = this.f196703m2) == null || view2.getVisibility() != 0))) ? 0 : 0 + dimension4;
        android.view.View view3 = this.C2;
        if (view3 != null && view3.getVisibility() == 0) {
            android.widget.ImageView imageView = this.D2;
            if (imageView != null && imageView.getVisibility() == 0) {
                i27 += dimension4;
            }
            android.widget.ImageView imageView2 = this.E2;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                i27 += dimension4;
            }
            android.widget.ImageView imageView3 = this.F2;
            if (imageView3 != null && imageView3.getVisibility() == 0) {
                i27 += dimension4;
            }
        }
        android.widget.ImageView imageView4 = this.f196711u2;
        if (imageView4 != null && imageView4.getVisibility() == 0) {
            i27 += (int) resources2.getDimension(com.tencent.mm.R.dimen.f479738dv);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f196712v2;
        if (weImageView != null && weImageView.getVisibility() == 0) {
            i27 += (int) resources2.getDimension(com.tencent.mm.R.dimen.f479693cs);
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        java.lang.System.nanoTime();
        x07 = (com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) ? 1 : 0;
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i28 = a17.f197135a;
        if (x07 == 0 && i28 > (i17 = a17.f197136b)) {
            i28 = i17;
        }
        int measureText = (int) ((android.widget.TextView) this.Z1.findViewById(android.R.id.title)).getPaint().measureText(this.f197774h.toString());
        int round2 = java.lang.Math.round(this.f196692f3.floatValue());
        if (bool.booleanValue()) {
            float b18 = j65.c.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (b18 > 0.0f) {
                round2 = java.lang.Math.round(round2 / b18);
            } else {
                com.tencent.mars.xlog.Log.i(str, "[getNewTitleMaxWidth] fontSize:%s", java.lang.Float.valueOf(b18));
            }
        }
        int dimension5 = (int) resources2.getDimension(com.tencent.mm.R.dimen.f479667c4);
        java.lang.Boolean bool2 = this.f196690d3;
        if (bool2.booleanValue()) {
            dimension5 = ((int) resources2.getDimension(com.tencent.mm.R.dimen.f479660bx)) + round2;
        }
        android.widget.TextView textView3 = this.f196713w2;
        if ((textView3 != null && textView3.getVisibility() == 0) || ((textView = this.B2) != null && textView.getVisibility() == 0)) {
            dimension5 = (int) resources2.getDimension(com.tencent.mm.R.dimen.f479664c2);
            if (bool2.booleanValue()) {
                dimension5 = ((int) resources2.getDimension(com.tencent.mm.R.dimen.f479658bv)) + round2;
            }
        }
        return (((i28 - dimension5) - measureText) - i27) - x0();
    }

    public final void J0(int i17) {
        if (i17 > 0) {
            a0(0);
            g0(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().G0(i17), com.tencent.mm.ui.tools.pd.b(this.f197770d, i17));
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
    }

    public final void K0(m40.q0 q0Var) {
        if (q0Var != null && q0Var.getView().getVisibility() == 0 && q0Var.getDropStat() == 2) {
            java.lang.String str = this.f196695i2;
            com.tencent.mars.xlog.Log.i(str, "handleDropAll: " + q0Var);
            a1(q0Var.getView(), 8);
            if ("find_friends_by_finder".equals(this.f197780q)) {
                w0(true);
                return;
            }
            if ("find_friends_by_look".equals(this.f197780q)) {
                w0(true);
                nn3.f fVar = (nn3.f) ((ra0.x) i95.n0.c(ra0.x.class));
                fVar.getClass();
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("NewLife.Entrance");
                if (L0 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "report render failed, invalid params, redDotCtrInfo is null.");
                    return;
                }
                java.util.HashSet hashSet = fVar.f338684g;
                if (hashSet.contains(L0.field_tipsId)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "reportExposeFailed, duplicated, path: NewLife.Entrance");
                    return;
                }
                java.lang.String str2 = L0.field_tipsId;
                if (str2 != null) {
                    hashSet.add(str2);
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("show_path", "NewLife.Entrance");
                hashMap.put("tipsid", str2);
                fVar.Ri("red_dot_render_failed", L0, I0, 99);
                return;
            }
            if ("find_friends_by_search".equals(this.f197780q)) {
                w0(true);
                wg0.a aVar = (wg0.a) ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).aj();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) aVar.f445709b;
                if (((java.lang.String) concurrentHashMap.get("Search.Entrance")) != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchRedDotReporter", "reportExposeFailed, duplicated, path: ".concat("Search.Entrance"));
                    return;
                }
                com.tencent.mm.plugin.finder.extension.reddot.jb L02 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Search.Entrance");
                java.lang.String str3 = L02 != null ? L02.field_tipsId : null;
                if (str3 != null) {
                    concurrentHashMap.put("Search.Entrance", str3);
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("show_path", "Search.Entrance");
                aVar.a("red_dot_render_failed", null, null, hashMap2);
                return;
            }
            java.lang.String key = this.f197780q;
            java.util.ArrayList arrayList = rg5.x.f395285i;
            kotlin.jvm.internal.o.g(key, "key");
            if (kotlin.jvm.internal.o.b(key, "find_friends_by_ting") || kotlin.jvm.internal.o.b(key, "find_friends_by_ting_play_state")) {
                w0(true);
                return;
            }
            if (this instanceof com.tencent.mm.ui.mmec.NewCardPackageTipPreference) {
                r45.pm6 pm6Var = this.M2;
                java.lang.String str4 = pm6Var == null ? "" : pm6Var.f383187e;
                java.lang.String str5 = pm6Var != null ? pm6Var.f383199t : "";
                com.tencent.mars.xlog.Log.i(str, "handleDropAll cardPackage title:%s, tipsId:%s", str4, str5);
                w0(true);
                ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).wi("cardPackageExposeFail", 0, str5);
                return;
            }
            this.M2.f383187e = this.f196697j2.getString(com.tencent.mm.R.string.esk);
            r45.pm6 pm6Var2 = this.M2;
            pm6Var2.f383190h = "";
            pm6Var2.f383192m = "";
            W0(q0Var);
            e1(true, this.M2, this.J2, true, this.P2, this.Q2, this.R2, this.L2);
        }
    }

    public void L0() {
        android.widget.LinearLayout linearLayout;
        android.view.ViewGroup viewGroup;
        com.tencent.mars.xlog.Log.i(this.f196695i2, "initContentLayoutParam mThirdLayoutContainer：" + this.Y2);
        android.view.View view = this.Z1;
        if (view != null) {
            if (this.f196688b3 == null && (viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cgi)) != null) {
                this.f196688b3 = (android.widget.LinearLayout.LayoutParams) viewGroup.getLayoutParams();
            }
            if (this.f196689c3 == null && this.f196688b3 != null) {
                this.f196689c3 = new android.widget.LinearLayout.LayoutParams(-2, this.f196688b3.height, 0.0f);
            }
            if (this.Z2 == null && (linearLayout = this.X2) != null) {
                this.Z2 = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            }
            if (this.f196687a3 == null) {
                this.f196687a3 = new android.widget.LinearLayout.LayoutParams(-1, -1, 0.0f);
            }
        }
    }

    public final boolean M0(int i17, r45.fz2 fz2Var, boolean z17) {
        r45.f03 f03Var;
        android.view.View view = this.W1;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) (view == null ? null : view.findViewById(android.R.id.widget_frame));
        L0();
        java.lang.String str = this.f196695i2;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.i(str, "[initWidgetFrame] fail,WidgetFrame has child!");
            return false;
        }
        this.f196699k2 = viewGroup;
        android.content.Context context = this.f197770d;
        if (i17 == 2 || i17 == 5 || i17 == 1 || i17 == 4 || i17 == 6 || i17 == 7 || i17 == 10 || i17 == 11 || i17 == 12 || i17 == 14 || i17 == 15) {
            if (viewGroup.getChildCount() != 1 || !"singleAvatar".equals(viewGroup.getChildAt(0).getTag())) {
                viewGroup.removeAllViews();
                android.view.View.inflate(context, com.tencent.mm.R.layout.c0y, viewGroup).findViewById(com.tencent.mm.R.id.fwo).setTag("singleAvatar");
            }
            this.f196701l2 = viewGroup.findViewById(com.tencent.mm.R.id.ge6);
            this.f196703m2 = viewGroup.findViewById(com.tencent.mm.R.id.geg);
            this.f196706p2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f485060ge5);
            this.f196707q2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.gex);
            this.f196710t2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.m47);
            V(8);
            this.f196715y2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.m4e);
            this.f196713w2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.m4j);
            this.f196714x2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.i0j);
            this.f196711u2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.kdj);
            this.f196712v2 = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.m4l);
            this.V2 = (android.widget.RelativeLayout) viewGroup.findViewById(com.tencent.mm.R.id.a9w);
            this.C2 = viewGroup.findViewById(com.tencent.mm.R.id.juj);
            this.D2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f485061gf0);
            this.G2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.m4d);
            this.E2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f485062gf1);
            this.F2 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f485063gf2);
            this.H2 = (m40.q0) viewGroup.findViewById(com.tencent.mm.R.id.k9n);
            this.I2 = (m40.q0) viewGroup.findViewById(com.tencent.mm.R.id.k9y);
            this.B2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.g5b);
        } else if (i17 == 3) {
            viewGroup.removeAllViews();
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c0o, viewGroup);
            this.f196701l2 = inflate.findViewById(com.tencent.mm.R.id.ge6);
            this.f196704n2 = inflate.findViewById(com.tencent.mm.R.id.ge8);
            this.f196705o2 = inflate.findViewById(com.tencent.mm.R.id.ge_);
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            this.f196716z2 = arrayList;
            arrayList.add(this.f196701l2);
            this.f196716z2.add(this.f196704n2);
            this.f196716z2.add(this.f196705o2);
            this.f196706p2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485060ge5);
            this.f196708r2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ge7);
            this.f196709s2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ge9);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
            this.A2 = arrayList2;
            arrayList2.add(this.f196706p2);
            this.A2.add(this.f196708r2);
            this.A2.add(this.f196709s2);
            this.f196710t2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.m47);
        } else {
            boolean z18 = this.K2;
            oc2.k kVar = this.S2;
            if (!z18) {
                viewGroup.removeAllViews();
                if (kVar != null) {
                    oc2.n nVar = (oc2.n) kVar;
                    com.tencent.mars.xlog.Log.i("Finder.Renderer", "initDslView".concat(" resetDslRenderViewInfo"));
                    nVar.f344228c = null;
                    nVar.f344229d = null;
                    nVar.f344230e = null;
                    nVar.f344231f = null;
                }
            } else if (fz2Var != null) {
                oc2.n nVar2 = (oc2.n) kVar;
                java.util.List a17 = nVar2.a(fz2Var);
                oc2.h hVar = new oc2.h(I0(com.tencent.mm.ui.m6.DSL), false, true);
                if (com.tencent.mm.plugin.finder.extension.reddot.c3.f105437b.contains(this.f197780q)) {
                    hVar.f344192d = oc2.f.f344165d;
                }
                hVar.f344191c = F0() == "FinderLiveEntrance";
                android.widget.TextView textView = (android.widget.TextView) this.Z1.findViewById(android.R.id.title);
                if (textView != null) {
                    this.f196694h3 = textView.getText();
                }
                viewGroup.removeAllViews();
                java.lang.String str2 = this.f197780q;
                if (str2 != null) {
                    java.lang.String str3 = (java.lang.String) com.tencent.mm.plugin.finder.extension.reddot.c3.f105436a.get(str2);
                    if (str3 != null) {
                        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f196698j3;
                        if (jbVar == null || !jbVar.y0(str3) || (f03Var = this.f196696i3) == null || !com.tencent.mm.sdk.platformtools.t8.m(f03Var.f373892i, str3)) {
                            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str3);
                            if (L0 != null) {
                                hVar.f344193e = L0;
                                hVar.f344194f = L0.I0(str3);
                            } else {
                                com.tencent.mars.xlog.Log.i(str, "fillDslRenderCtrlInfo key=%s but ctrlInfo is null!", str2);
                            }
                        } else {
                            hVar.f344193e = this.f196698j3;
                            hVar.f344194f = this.f196696i3;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "fillDslRenderCtrlInfo key=%s but path is null!", str2);
                    }
                }
                android.view.ViewGroup d17 = nVar2.d(this.f196694h3, hVar, a17, fz2Var, new com.tencent.mm.ui.l6(this, z17));
                if (d17.getParent() != null && (d17.getParent() instanceof android.view.ViewGroup)) {
                    ((android.view.ViewGroup) d17.getParent()).removeView(d17);
                }
                viewGroup.addView(d17);
                com.tencent.mars.xlog.Log.i(str, "dslView shown:%s", java.lang.Boolean.valueOf(d17.isShown()));
                w0(false);
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (z65.c.a()) {
                    int childCount = viewGroup.getChildCount();
                    for (int i18 = 0; i18 < childCount; i18++) {
                        android.view.View childAt = viewGroup.getChildAt(i18);
                        java.lang.Object[] objArr = new java.lang.Object[4];
                        objArr[0] = childAt;
                        objArr[1] = java.lang.Boolean.valueOf(childAt.getVisibility() == 0);
                        objArr[2] = java.lang.Integer.valueOf(childAt.getWidth());
                        objArr[3] = java.lang.Integer.valueOf(childAt.getHeight());
                        com.tencent.mars.xlog.Log.i(str, "view %s,visible:%s,size:%s*%s", objArr);
                    }
                }
            }
        }
        return true;
    }

    public boolean N0() {
        android.view.View childAt;
        android.view.ViewGroup viewGroup = this.f196699k2;
        if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null) {
            return false;
        }
        return (viewGroup.getVisibility() == 0) && (viewGroup.getChildCount() == 1 && "DSL_VIEW_TAG".equals(childAt.getTag()) && childAt.getVisibility() == 0) && C0().f477487c;
    }

    public final boolean O0(r45.pm6 pm6Var) {
        if (pm6Var != null) {
            return (android.text.TextUtils.isEmpty(pm6Var.f383190h) && android.text.TextUtils.isEmpty(pm6Var.f383192m)) ? false : true;
        }
        return false;
    }

    public final boolean P0(r45.pm6 pm6Var) {
        return android.text.TextUtils.isEmpty(pm6Var.f383187e) && android.text.TextUtils.isEmpty(pm6Var.f383190h) && android.text.TextUtils.isEmpty(pm6Var.f383192m);
    }

    public final boolean Q0() {
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.H2).getValue()).r()).intValue();
        com.tencent.mars.xlog.Log.i(this.f196695i2, "isZh language:" + f17 + " testValue:" + intValue);
        return (!android.text.TextUtils.isEmpty(f17) && f17.startsWith("zh")) || intValue == 1;
    }

    public void S0(int i17) {
        android.widget.RelativeLayout relativeLayout;
        r45.f03 f03Var;
        java.lang.String F0 = F0();
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(F0);
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(F0);
        if (com.tencent.mm.ui.LauncherUI.getCurrentTabIndex() == 2 && (relativeLayout = this.Y2) != null && relativeLayout.getVisibility() == 0) {
            android.content.Context context = this.f197770d;
            if ((context instanceof com.tencent.mm.ui.LauncherUI) && ((com.tencent.mm.ui.LauncherUI) context).mo133getLifecycle().b().a(androidx.lifecycle.n.RESUMED) && (f03Var = this.f196696i3) != I0 && f03Var != null) {
                com.tencent.mars.xlog.Log.i(this.f196695i2, "onChangeRedDotInfo");
                this.f196700k3 = this.f196696i3;
                this.f196702l3 = this.f196698j3;
                this.f196696i3 = I0;
                this.f196698j3 = L0;
                dy1.u uVar = (dy1.u) i95.n0.c(dy1.u.class);
                final android.widget.RelativeLayout relativeLayout2 = this.Y2;
                final jz1.e eVar = (jz1.e) uVar;
                eVar.getClass();
                if (relativeLayout2 != null) {
                    final boolean z17 = false;
                    sz1.i.a(new java.lang.Runnable() { // from class: jz1.e$$o
                        @Override // java.lang.Runnable
                        public final void run() {
                            final jz1.e eVar2 = jz1.e.this;
                            final android.view.View view = relativeLayout2;
                            long Ni = eVar2.Ni(view);
                            boolean z18 = z17;
                            if (Ni <= 0) {
                                uz1.a aVar = eVar2.f302639f;
                                boolean contains = aVar.contains(view);
                                if (contains && !z18) {
                                    eVar2.ij(view, 0);
                                    aVar.e(view);
                                    return;
                                } else {
                                    if (contains || !z18) {
                                        return;
                                    }
                                    sz1.i.c(new java.lang.Runnable() { // from class: jz1.e$$d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            jz1.e.this.hj(view, 0);
                                        }
                                    });
                                    aVar.add(view);
                                    return;
                                }
                            }
                            uz1.a aVar2 = eVar2.f302647q;
                            boolean contains2 = aVar2.contains(view);
                            if (contains2 && !z18) {
                                eVar2.ij(view, 0);
                                aVar2.e(view);
                            } else if (!contains2 && z18) {
                                sz1.i.c(new java.lang.Runnable() { // from class: jz1.e$$e
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        jz1.e.this.hj(view, 0);
                                    }
                                });
                                aVar2.add(view);
                            }
                            if (view == null) {
                                return;
                            }
                            ((java.util.WeakHashMap) eVar2.f302648r).remove(view);
                        }
                    });
                }
                dy1.u uVar2 = (dy1.u) i95.n0.c(dy1.u.class);
                final android.widget.RelativeLayout relativeLayout3 = this.Y2;
                final jz1.e eVar2 = (jz1.e) uVar2;
                eVar2.getClass();
                if (relativeLayout3 == null) {
                    return;
                }
                final boolean z18 = true;
                sz1.i.a(new java.lang.Runnable() { // from class: jz1.e$$o
                    @Override // java.lang.Runnable
                    public final void run() {
                        final jz1.e eVar22 = jz1.e.this;
                        final android.view.View view = relativeLayout3;
                        long Ni = eVar22.Ni(view);
                        boolean z182 = z18;
                        if (Ni <= 0) {
                            uz1.a aVar = eVar22.f302639f;
                            boolean contains = aVar.contains(view);
                            if (contains && !z182) {
                                eVar22.ij(view, 0);
                                aVar.e(view);
                                return;
                            } else {
                                if (contains || !z182) {
                                    return;
                                }
                                sz1.i.c(new java.lang.Runnable() { // from class: jz1.e$$d
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        jz1.e.this.hj(view, 0);
                                    }
                                });
                                aVar.add(view);
                                return;
                            }
                        }
                        uz1.a aVar2 = eVar22.f302647q;
                        boolean contains2 = aVar2.contains(view);
                        if (contains2 && !z182) {
                            eVar22.ij(view, 0);
                            aVar2.e(view);
                        } else if (!contains2 && z182) {
                            sz1.i.c(new java.lang.Runnable() { // from class: jz1.e$$e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    jz1.e.this.hj(view, 0);
                                }
                            });
                            aVar2.add(view);
                        }
                        if (view == null) {
                            return;
                        }
                        ((java.util.WeakHashMap) eVar22.f302648r).remove(view);
                    }
                });
                return;
            }
        }
        this.f196696i3 = I0;
        this.f196698j3 = L0;
    }

    public final void T0(android.view.View view, final java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str);
        if (L0 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tk(view, L0.field_tipsId);
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str2);
        ((cy1.a) aVar.ik(view, 128, 27166)).Ai(view, new ly1.a() { // from class: com.tencent.mm.ui.FinderIconViewTipPreference$$a
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str3) {
                r45.f03 f03Var;
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
                java.lang.String str4;
                java.lang.String str5;
                java.lang.String str6;
                java.lang.String string;
                r45.ya0 ya0Var;
                com.tencent.mm.ui.FinderIconViewTipPreference finderIconViewTipPreference = com.tencent.mm.ui.FinderIconViewTipPreference.this;
                finderIconViewTipPreference.getClass();
                java.lang.String str7 = str;
                java.lang.Integer num = null;
                if (str7.equals("FinderMentionEntrance")) {
                    f03Var = null;
                    jbVar = null;
                } else {
                    f03Var = finderIconViewTipPreference.f196700k3;
                    if (f03Var == null || (jbVar = finderIconViewTipPreference.f196702l3) == null) {
                        f03Var = finderIconViewTipPreference.f196696i3;
                        jbVar = finderIconViewTipPreference.f196698j3;
                    }
                    finderIconViewTipPreference.f196700k3 = null;
                    finderIconViewTipPreference.f196702l3 = null;
                }
                if (f03Var == null || jbVar == null) {
                    r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(str7);
                    jbVar = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str7);
                    f03Var = I0;
                }
                java.lang.String str8 = finderIconViewTipPreference.f196695i2;
                if (f03Var == null) {
                    com.tencent.mars.xlog.Log.e(str8, "no showInfo %s", str7);
                    return null;
                }
                if (jbVar == null) {
                    com.tencent.mars.xlog.Log.e(str8, "no ctrInfo %s", str7);
                    return null;
                }
                int i17 = (f03Var.f373887d != 999 || (ya0Var = f03Var.B) == null || ya0Var.f390918d == null) ? 0 : finderIconViewTipPreference.C0().f477485a.f391856d;
                zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
                zy2.na C0 = finderIconViewTipPreference.C0();
                ((c61.w8) paVar).getClass();
                com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("reddot_show_info_type", java.lang.Integer.valueOf(f03Var.f373887d));
                hashMap.put("reddot_showinfo_count_num", java.lang.Long.valueOf(f03Var.f373888e));
                java.lang.String a17 = x2Var.a(f03Var, C0, null);
                java.lang.String str9 = "";
                if (a17 == null) {
                    a17 = "";
                }
                hashMap.put("reddot_showinfo_title", a17);
                hashMap.put("reddot_count_num_detail", x2Var.b(jbVar, f03Var));
                hashMap.put("showtitle_completetype", java.lang.Integer.valueOf(i17));
                r45.q40 q40Var = f03Var.f373897q;
                hashMap.put("expose_order", java.lang.Integer.valueOf(q40Var != null ? q40Var.f383656d : 0));
                hashMap.put("reddot_ctrltype", java.lang.Long.valueOf(jbVar.getType()));
                java.lang.String field_tipsId = jbVar.field_tipsId;
                kotlin.jvm.internal.o.f(field_tipsId, "field_tipsId");
                hashMap.put("reddot_tipsid", field_tipsId);
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                if (Ri == null) {
                    Ri = "";
                }
                hashMap.put("behaviour_session_id", Ri);
                n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                long j17 = jbVar.W0().getLong(0);
                ((m30.m) rVar).getClass();
                java.lang.String q17 = b52.b.q(j17);
                kotlin.jvm.internal.o.f(q17, "long2UnsignedString(...)");
                hashMap.put("feed_id", q17);
                java.lang.String str10 = f03Var.f373892i;
                if (str10 == null) {
                    str10 = "";
                }
                hashMap.put("reddot_path", str10);
                java.lang.Object[] objArr = new java.lang.Object[1];
                com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = jbVar.field_tipsShowEntranceExtInfo;
                objArr[0] = (finderTipsShowEntranceExtInfo == null || (string = finderTipsShowEntranceExtInfo.getString(5)) == null) ? null : java.lang.Integer.valueOf(string.length());
                com.tencent.mars.xlog.Log.i("FinderRedDotReporter", "old ext %d", objArr);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                r45.vs2 vs2Var = jbVar.field_ctrInfo;
                if (vs2Var != null && (str6 = vs2Var.f388499t) != null) {
                    num = java.lang.Integer.valueOf(str6.length());
                }
                objArr2[0] = num;
                com.tencent.mars.xlog.Log.i("FinderRedDotReporter", "new ext %d", objArr2);
                r45.vs2 vs2Var2 = jbVar.field_ctrInfo;
                if (vs2Var2 == null || (str4 = vs2Var2.f388499t) == null) {
                    str4 = "";
                }
                hashMap.put("reddot_report_exinfo", str4);
                r45.vs2 vs2Var3 = jbVar.field_ctrInfo;
                if (vs2Var3 != null && (str5 = vs2Var3.f388503x) != null) {
                    str9 = str5;
                }
                hashMap.put("reddot_tipsuuid", str9);
                return hashMap;
            }
        });
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        z0();
        Y0(8);
        super.T1(z17, pm6Var);
        return true;
    }

    public final void U0(r45.pm6 pm6Var, int i17) {
        for (int size = pm6Var.f383189g.size(); size > i17; size--) {
            pm6Var.f383189g.removeLast();
        }
    }

    public boolean V0(java.lang.String str) {
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo;
        oc2.k kVar = this.S2;
        if (kVar != null) {
            oc2.n nVar = (oc2.n) kVar;
            com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = nVar.f344229d;
            if (kotlin.jvm.internal.o.b((renderView == null || (ctrlInfo = renderView.getCtrlInfo()) == null) ? null : ctrlInfo.field_tips_uuid, str)) {
                java.lang.String source = "resetDslRenderInfo " + str;
                kotlin.jvm.internal.o.g(source, "source");
                com.tencent.mars.xlog.Log.i("Finder.Renderer", source.concat(" resetDslRenderViewInfo"));
                nVar.f344228c = null;
                nVar.f344229d = null;
                nVar.f344230e = null;
                nVar.f344231f = null;
                return true;
            }
        }
        return false;
    }

    public final void W0(m40.q0 q0Var) {
        if (q0Var == null || q0Var.getView().getVisibility() != 0) {
            return;
        }
        q0Var.setDropStat(0);
    }

    public final void X0(r45.pm6 pm6Var, boolean z17, boolean z18) {
        android.widget.TextView textView;
        m40.q0 q0Var;
        int i17;
        int i18;
        if (z18) {
            a1(this.f196712v2, 0);
        } else {
            a1(this.f196712v2, 8);
        }
        if (P0(pm6Var)) {
            a1(this.f196713w2, 8);
            a1(this.f196714x2, 8);
            a1(this.H2.getView(), 8);
            a1(this.I2.getView(), 8);
            return;
        }
        if (z17) {
            a1(this.f196714x2, 8);
            a1(this.H2.getView(), 8);
        } else {
            a1(this.f196713w2, 8);
            a1(this.I2.getView(), 8);
        }
        boolean z19 = pm6Var.f383194o;
        m40.q0 q0Var2 = this.H2;
        m40.q0 q0Var3 = this.I2;
        if (!z17) {
            q0Var3 = q0Var2;
            q0Var2 = q0Var3;
        }
        com.tencent.mars.xlog.Log.i(this.f196695i2, "setNewTitleView: isZh" + Q0());
        if (z17) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f196713w2.getLayoutParams();
            if (layoutParams.width != -2) {
                layoutParams.width = -2;
                this.f196713w2.setLayoutParams(layoutParams);
            }
            textView = this.f196713w2;
        } else if (Q0()) {
            android.view.View view = this.f196714x2;
            if (view != null) {
                a1(view, 8);
            }
            textView = null;
        } else {
            textView = this.f196714x2;
        }
        if (P0(pm6Var)) {
            a1(textView, 8);
            a1(this.H2.getView(), 8);
            a1(this.I2.getView(), 8);
        } else if (textView != null) {
            a1(textView, 0);
            a1(this.H2.getView(), 8);
            a1(this.I2.getView(), 8);
            textView.setText(pm6Var.f383187e);
        } else {
            a1(q0Var2.getView(), 8);
            a1(q0Var3.getView(), 0);
            java.lang.String str = pm6Var.f383191i;
            if (com.tencent.mm.ui.bk.C()) {
                str = pm6Var.f383193n;
            }
            java.lang.String str2 = pm6Var.f383197r;
            if (com.tencent.mm.ui.bk.C()) {
                str2 = pm6Var.f383198s;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = str;
            }
            int A0 = A0(str);
            int A02 = A0(str2);
            if (z19) {
                i17 = A0;
                i18 = A02;
            } else {
                android.content.Context context = this.f196697j2;
                int color = context.getResources().getColor(com.tencent.mm.R.color.FG_1);
                i18 = context.getResources().getColor(com.tencent.mm.R.color.FG_1);
                i17 = color;
            }
            if (pm6Var.f383187e == null) {
                pm6Var.f383187e = "";
            }
            if (pm6Var.f383190h == null) {
                pm6Var.f383190h = "";
            }
            if (pm6Var.f383192m == null) {
                pm6Var.f383192m = "";
            }
            ((com.tencent.mm.plugin.finder.view.FinderRedDotTextView) q0Var3).m(I0(com.tencent.mm.ui.m6.ORIGINAL), pm6Var.f383187e, pm6Var.f383190h, com.tencent.mm.R.dimen.f479930ja, i17, i18, pm6Var.f383192m, true);
        }
        m40.q0 q0Var4 = this.H2;
        if ((q0Var4 != null && q0Var4.getView().getVisibility() == 0 && this.H2.getDropStat() == 1) || ((q0Var = this.I2) != null && q0Var.getView().getVisibility() == 0 && this.I2.getDropStat() == 1 && O0(pm6Var))) {
            pm6Var.f383190h = "";
            pm6Var.f383192m = "";
            W0(this.H2);
            W0(this.I2);
            e1(this.K2, pm6Var, this.J2, true, this.P2, this.Q2, this.R2, this.L2);
        }
        if (z17) {
            K0(this.I2);
        } else {
            K0(this.H2);
        }
    }

    public final void Y0(int i17) {
        if (i17 != this.J2) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                com.tencent.mm.sdk.platformtools.Log.c(this.f196695i2, "style from %s to %s", java.lang.Integer.valueOf(this.J2), java.lang.Integer.valueOf(i17));
            }
        }
        this.J2 = i17;
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        z0();
        Y0(8);
        if (z17) {
            c0(4);
        }
        super.Y3(z17);
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        z0();
        com.tencent.mars.xlog.Log.i(this.f196695i2, "showCounter() show:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            a0(0);
            g0(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().G0(pm6Var.f383186d), com.tencent.mm.ui.tools.pd.b(this.f197770d, pm6Var.f383186d));
        } else {
            c0(8);
            b0(8);
            Y(8);
            a0(8);
        }
        this.K2 = z17;
        Y0(9);
        this.M2 = pm6Var;
        k0();
        return true;
    }

    public void a1(android.view.View view, int i17) {
        if (view != null && view.getVisibility() != i17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/FinderIconViewTipPreference", "setViewVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/FinderIconViewTipPreference", "setViewVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = view;
                objArr[1] = java.lang.Boolean.valueOf(i17 == 0);
                com.tencent.mars.xlog.Log.i(this.f196695i2, "%s visibility=%s", objArr);
            }
        }
        if (view != null && view == this.f196699k2 && i17 == 8) {
            w0(true);
        }
    }

    public void b1(boolean z17, boolean z18, r45.f03 f03Var, int i17, int i18) {
        r45.fz2 fz2Var;
        java.lang.String str = this.f196695i2;
        if (f03Var == null) {
            com.tencent.mars.xlog.Log.e(str, "[showDslView] fail,show info is null!");
            return;
        }
        if (f03Var.B == null) {
            com.tencent.mars.xlog.Log.e(str, "[showDslView] fail,show info 's dslRender is null!");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "[showDslView] show=%s, infoPath=%s, redDotCount:%s", java.lang.Boolean.valueOf(z17), f03Var.f373892i, java.lang.Integer.valueOf(i18));
        this.K2 = z17;
        this.T2 = f03Var;
        Y0(i17);
        if (!com.tencent.mm.ui.bk.C() || (fz2Var = f03Var.B.f390919e) == null || fz2Var.f374741d.size() <= 0) {
            this.U2 = f03Var.B.f390918d;
        } else {
            this.U2 = f03Var.B.f390919e;
        }
        this.L2 = i18;
        if (M0(i17, this.U2, z18)) {
            J0(i18);
        } else {
            com.tencent.mars.xlog.Log.w(str, "showDslView return for initWidgetFrame");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x05a8, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05af, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05ab, code lost:
    
        if (r3 > r5) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e1(boolean r28, r45.pm6 r29, int r30, boolean r31, boolean r32, boolean r33, boolean r34, int r35) {
        /*
            Method dump skipped, instructions count: 1861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.FinderIconViewTipPreference.e1(boolean, r45.pm6, int, boolean, boolean, boolean, boolean, int):void");
    }

    public final void p0(boolean z17, r45.pm6 pm6Var, boolean z18, boolean z19, boolean z27, boolean z28) {
        c0(8);
        b0(8);
        Y(8);
        a0(8);
        a1(this.B2, 8);
        e0(false);
        if (z17) {
            q0(pm6Var, true, z18, z19, z27, z28);
        } else {
            a1(this.f196699k2, 8);
        }
        k0();
    }

    public final void q0(r45.pm6 pm6Var, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        int i17;
        m40.q0 q0Var;
        int i18;
        android.content.Context context = this.Y1;
        boolean z29 = true;
        if (z17) {
            android.widget.TextView textView = this.f196714x2;
            if (textView != null) {
                textView.setMaxLines(2);
                if (context == null) {
                    context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
                java.lang.System.nanoTime();
                boolean z37 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                int i19 = a17.f197135a;
                if (!z37 && i19 > (i18 = a17.f197136b)) {
                    i19 = i18;
                }
                this.f196714x2.setMaxWidth((int) (i19 * 0.4d));
            }
        } else {
            this.f196714x2.setMaxLines(1);
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(context);
            java.lang.System.nanoTime();
            boolean z38 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i27 = a18.f197135a;
            if (!z38 && i27 > (i17 = a18.f197136b)) {
                i27 = i17;
            }
            this.f196714x2.setMaxWidth(i27);
        }
        a1(this.f196714x2, 8);
        if (z28) {
            a1(this.H2.getView(), 8);
            a1(this.I2.getView(), 0);
        } else {
            a1(this.H2.getView(), 0);
            a1(this.I2.getView(), 8);
        }
        a1(this.f196711u2, 8);
        a1(this.f196713w2, 8);
        a1(this.f196712v2, 8);
        if (!z27) {
            a1(this.V2, 8);
            a1(this.C2, 8);
        }
        a1(this.B2, 8);
        m40.q0 q0Var2 = this.H2;
        if (z28) {
            q0Var2 = this.I2;
        }
        java.lang.String str3 = pm6Var.f383197r;
        if (com.tencent.mm.ui.bk.C()) {
            str3 = pm6Var.f383198s;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = pm6Var.f383191i;
        }
        int A0 = A0(str3);
        if (q0Var2 != null) {
            boolean isEmpty = android.text.TextUtils.isEmpty(pm6Var.f383190h);
            com.tencent.mm.ui.m6 m6Var = com.tencent.mm.ui.m6.ORIGINAL;
            if (isEmpty && android.text.TextUtils.isEmpty(pm6Var.f383192m)) {
                if (z18) {
                    a1(this.f196711u2, 0);
                }
                if (z19) {
                    android.view.View view = this.C2;
                    if (view == null || view.getVisibility() != 0) {
                        a1(this.f196715y2, 0);
                    } else {
                        a1(this.G2, 0);
                    }
                }
                com.tencent.mm.plugin.finder.view.FinderRedDotTextView finderRedDotTextView = (com.tencent.mm.plugin.finder.view.FinderRedDotTextView) q0Var2;
                finderRedDotTextView.m(I0(m6Var), pm6Var.f383187e, "", com.tencent.mm.R.dimen.f479930ja, A0(pm6Var.f383191i), A0, "", !z28);
                K0(finderRedDotTextView);
                return;
            }
            com.tencent.mm.plugin.finder.view.FinderRedDotTextView finderRedDotTextView2 = (com.tencent.mm.plugin.finder.view.FinderRedDotTextView) q0Var2;
            finderRedDotTextView2.m(I0(m6Var), pm6Var.f383187e, pm6Var.f383190h, com.tencent.mm.R.dimen.f479930ja, A0(pm6Var.f383191i), A0, pm6Var.f383192m, !z28);
            if (finderRedDotTextView2.getDropStat() == 1 && O0(pm6Var)) {
                pm6Var.f383190h = "";
                pm6Var.f383192m = "";
                q0Var = finderRedDotTextView2;
                q0(pm6Var, z17, !z27, this.O2, z27, z28);
            } else {
                q0Var = finderRedDotTextView2;
                K0(q0Var);
                z29 = false;
            }
            com.tencent.mars.xlog.Log.i(this.f196695i2, "getDropStat:" + B0() + " checkResult:" + z29);
            if (z29) {
                return;
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) q0Var.getView().getLayoutParams();
            marginLayoutParams.setMarginEnd(0);
            q0Var.getView().setLayoutParams(marginLayoutParams);
        }
    }

    public final void r0(boolean z17, r45.pm6 pm6Var, boolean z18, boolean z19, boolean z27, java.lang.Boolean bool, java.lang.Boolean bool2, boolean z28) {
        c0(8);
        b0(8);
        Y(8);
        a0(8);
        e0(false);
        a1(this.f196712v2, 8);
        a1(this.C2, 8);
        if (z17) {
            boolean booleanValue = bool.booleanValue();
            if (this.f196706p2 != null && this.f196701l2 != null) {
                a1(this.V2, 0);
                a1(this.f196711u2, 8);
                if (z18) {
                    android.view.ViewGroup.LayoutParams layoutParams = this.f196706p2.getLayoutParams();
                    if (bool2.booleanValue()) {
                        int dimension = (int) this.f196706p2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480445y4);
                        layoutParams.width = dimension;
                        layoutParams.height = dimension;
                        int dimensionPixelOffset = this.f196706p2.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl);
                        this.f196706p2.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                        android.view.ViewGroup.LayoutParams layoutParams2 = this.f196701l2.getLayoutParams();
                        if (layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams) {
                            ((android.widget.RelativeLayout.LayoutParams) layoutParams2).rightMargin = this.f196706p2.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480418xd) + 1;
                        }
                        android.widget.TextView textView = this.f196714x2;
                        if (textView != null) {
                            android.view.ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                            if (layoutParams3 instanceof android.widget.LinearLayout.LayoutParams) {
                                ((android.widget.LinearLayout.LayoutParams) layoutParams3).rightMargin = this.f196706p2.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl) + this.f196706p2.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480418xd) + 1;
                            }
                        }
                        this.f196706p2.setBackground(this.f196706p2.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481509v5));
                    } else {
                        int dimension2 = (int) this.f196706p2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
                        layoutParams.width = dimension2;
                        layoutParams.height = dimension2;
                        this.f196706p2.setPadding(0, 0, 0, 0);
                        android.view.ViewGroup.LayoutParams layoutParams4 = this.f196701l2.getLayoutParams();
                        if (layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams) {
                            ((android.widget.RelativeLayout.LayoutParams) layoutParams4).rightMargin = this.f196706p2.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl) + 1;
                        }
                        android.widget.TextView textView2 = this.f196714x2;
                        if (textView2 != null) {
                            android.view.ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
                            if (layoutParams5 instanceof android.widget.LinearLayout.LayoutParams) {
                                ((android.widget.LinearLayout.LayoutParams) layoutParams5).rightMargin = this.f196706p2.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
                            }
                        }
                        this.f196706p2.setBackground(null);
                    }
                    this.f196706p2.setLayoutParams(layoutParams);
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams6 = this.f196706p2.getLayoutParams();
                    int dimension3 = (int) this.f196706p2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
                    layoutParams6.width = dimension3;
                    layoutParams6.height = dimension3;
                    this.f196706p2.setLayoutParams(layoutParams6);
                }
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(pm6Var.f383188f);
                java.lang.String str = this.f196695i2;
                if (K0) {
                    try {
                        this.f196706p2.setImageBitmap(com.tencent.mm.sdk.platformtools.j.c(this.f196697j2.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null)));
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.w(str, "[bindSingleAvatarTask] e:" + e17.toString());
                    }
                    com.tencent.mars.xlog.Log.w(str, "[bindSingleAvatarTask] tipsInfo.url is null.");
                } else {
                    com.tencent.mars.xlog.Log.i(str, "[bindSingleAvatarTask] load=%s isBigAvatar=%s isWithRedDot=%s", pm6Var.f383188f, java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f460502a.g(this.f196706p2, pm6Var.f383188f, com.tencent.mm.plugin.finder.storage.y90.W);
                    this.f196706p2.setVisibility(0);
                }
                a1(this.f196701l2, 0);
                a1(this.f196703m2, 8);
                a1(this.f196707q2, 8);
                a1(this.f196715y2, 8);
                a1(this.f196699k2, 0);
                if (z19) {
                    a1(this.f196710t2, 0);
                    if (!booleanValue) {
                        android.view.ViewGroup.LayoutParams layoutParams7 = this.f196710t2.getLayoutParams();
                        layoutParams7.width = -2;
                        layoutParams7.height = -2;
                        this.f196710t2.setLayoutParams(layoutParams7);
                        this.f196710t2.setImageResource(com.tencent.mm.R.drawable.b8i);
                    } else if (bool2.booleanValue()) {
                        this.f196710t2.setVisibility(8);
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams8 = this.f196710t2.getLayoutParams();
                        int a17 = (int) (ym5.x.a(this.f196710t2.getContext(), 11.1f) * i65.a.q(this.f197770d));
                        layoutParams8.width = a17;
                        layoutParams8.height = a17;
                        this.f196710t2.setLayoutParams(layoutParams8);
                        this.f196710t2.setImageResource(com.tencent.mm.R.raw.finder_live_icon);
                    }
                } else {
                    a1(this.f196710t2, 8);
                }
                int i17 = pm6Var.f383196q;
                boolean z29 = i17 == 2;
                boolean z37 = i17 == 1;
                if (z29) {
                    a1(this.f196710t2, 0);
                }
                if (z37) {
                    a1(this.f196710t2, 8);
                }
                X0(pm6Var, z27, z28);
            }
        } else {
            a1(this.f196699k2, 8);
        }
        k0();
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.Z1 = view;
        this.W2 = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.m3d);
        this.X2 = (android.widget.LinearLayout) this.Z1.findViewById(com.tencent.mm.R.id.f486778mg2);
        this.Y2 = (android.widget.RelativeLayout) this.Z1.findViewById(com.tencent.mm.R.id.o66);
        L0();
        com.tencent.mars.xlog.Log.i(this.f196695i2, "onBindView mStyle:" + this.J2 + " mTipsInfo:" + this.M2);
        r45.pm6 pm6Var = this.M2;
        if (pm6Var == null) {
            int i17 = this.J2;
            if (i17 == 999) {
                b1(this.K2, false, this.T2, i17, this.L2);
                return;
            }
            return;
        }
        int i18 = this.J2;
        if (i18 == 9) {
            Z3(this.K2, pm6Var);
            return;
        }
        if (i18 > 0 && i18 <= 7) {
            e1(this.K2, pm6Var, i18, this.N2, this.P2, this.Q2, this.R2, this.L2);
            return;
        }
        if (i18 == 10 || ((i18 >= 11 && i18 < 12) || i18 == 14)) {
            e1(this.K2, pm6Var, i18, this.N2, this.P2, this.Q2, this.R2, this.L2);
        } else if (i18 == 999) {
            b1(this.K2, false, this.T2, i18, this.L2);
        }
    }

    public final void t0(boolean z17, r45.pm6 pm6Var, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        r45.om6 om6Var;
        c0(8);
        b0(8);
        Y(8);
        a0(8);
        e0(false);
        a1(this.f196712v2, 8);
        a1(this.B2, 8);
        a1(this.C2, 8);
        if (!z17) {
            a1(this.f196699k2, 8);
        } else if (this.f196707q2 != null && this.f196703m2 != null) {
            a1(this.V2, 0);
            a1(this.f196711u2, 8);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(pm6Var.f383202w == 29 && (om6Var = pm6Var.f383203x) != null && om6Var.f382362d > 0 && om6Var.f382363e > 0);
            if (valueOf.booleanValue()) {
                android.view.ViewGroup.LayoutParams layoutParams = this.f196707q2.getLayoutParams();
                layoutParams.width = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, pm6Var.f383203x.f382362d);
                layoutParams.height = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, pm6Var.f383203x.f382363e);
                this.f196707q2.setLayoutParams(layoutParams);
            } else if (z18) {
                android.view.ViewGroup.LayoutParams layoutParams2 = this.f196707q2.getLayoutParams();
                int dimension = (int) this.f196707q2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
                layoutParams2.width = dimension;
                layoutParams2.height = dimension;
                this.f196707q2.setLayoutParams(layoutParams2);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams3 = this.f196707q2.getLayoutParams();
                int dimension2 = (int) this.f196707q2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
                layoutParams3.width = dimension2;
                layoutParams3.height = dimension2;
                this.f196707q2.setLayoutParams(layoutParams3);
            }
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(pm6Var.f383188f);
            java.lang.String str = this.f196695i2;
            if (K0) {
                try {
                    this.f196707q2.setImageBitmap(com.tencent.mm.sdk.platformtools.j.c(this.f196697j2.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null)));
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.w(str, "[bindSingleSquareAvatarTask] e:" + e17.toString());
                }
                com.tencent.mars.xlog.Log.w(str, "[bindSingleSquareAvatarTask] tipsInfo.url is null.");
            } else {
                com.tencent.mars.xlog.Log.i(str, "[bindSingleSquareAvatarTask] load=%s isBigAvatar=%s isCustomIcon=%s isWithRedDot=%s", pm6Var.f383188f, java.lang.Boolean.valueOf(z18), valueOf, java.lang.Boolean.valueOf(z19));
                boolean booleanValue = valueOf.booleanValue();
                mn2.g1 g1Var = mn2.g1.f329975a;
                if (booleanValue) {
                    vo0.d e18 = g1Var.e();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l lVar = ya2.l.f460502a;
                    e18.c(new mn2.n(pm6Var.f383188f, com.tencent.mm.plugin.finder.storage.y90.V), this.f196707q2, g1Var.h(mn2.f1.f329961o));
                } else {
                    vo0.d l17 = g1Var.l();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l lVar2 = ya2.l.f460502a;
                    l17.c(new mn2.n(pm6Var.f383188f, com.tencent.mm.plugin.finder.storage.y90.W), this.f196707q2, g1Var.h(mn2.f1.f329961o));
                }
            }
            a1(this.f196701l2, 8);
            a1(this.f196703m2, 0);
            a1(this.f196707q2, 0);
            a1(this.f196710t2, 8);
            a1(this.f196699k2, 0);
            if (z19) {
                a1(this.f196715y2, 0);
                if (z28) {
                    android.view.ViewGroup.LayoutParams layoutParams4 = this.f196710t2.getLayoutParams();
                    int a17 = (int) (ym5.x.a(this.f196710t2.getContext(), 11.1f) * i65.a.q(this.f197770d));
                    layoutParams4.width = a17;
                    layoutParams4.height = a17;
                    this.f196715y2.setLayoutParams(layoutParams4);
                    this.f196715y2.setImageResource(com.tencent.mm.R.raw.finder_live_icon);
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams5 = this.f196715y2.getLayoutParams();
                    layoutParams5.width = -2;
                    layoutParams5.height = -2;
                    this.f196715y2.setLayoutParams(layoutParams5);
                    this.f196715y2.setImageResource(com.tencent.mm.R.drawable.b8i);
                }
            } else {
                a1(this.f196715y2, 8);
            }
            int i17 = pm6Var.f383196q;
            boolean z37 = i17 == 2;
            boolean z38 = i17 == 1;
            if (z37) {
                this.O2 = true;
                a1(this.f196715y2, 0);
            }
            if (z38) {
                this.O2 = false;
                a1(this.f196715y2, 8);
            }
            X0(pm6Var, z27, z29);
        }
        k0();
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.ui.base.preference.NormalIconPreference, com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        com.tencent.mars.xlog.Log.i(this.f196695i2, "onCreateView title:" + ((java.lang.Object) this.f197774h) + " hashCode:" + hashCode() + " view:" + u17);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) this.Z1.findViewById(com.tencent.mm.R.id.o66);
        android.widget.TextView textView = (android.widget.TextView) u17.findViewById(com.tencent.mm.R.id.o58);
        java.lang.String F0 = F0();
        if (relativeLayout != null && (F0.equals("FinderEntrance") || F0.equals("FinderLiveEntrance") || F0.equals("NearbyEntrance"))) {
            T0(relativeLayout, F0, G0(F0));
        }
        if (textView != null && F0.equals("FinderEntrance")) {
            T0(textView, "FinderMentionEntrance", G0("FinderMentionEntrance"));
        }
        return u17;
    }

    public final void v0(boolean z17, r45.pm6 pm6Var) {
        c0(8);
        b0(8);
        Y(8);
        a0(8);
        e0(false);
        if (this.B2 == null || !z17 || com.tencent.mm.sdk.platformtools.t8.K0(pm6Var.f383195p)) {
            a1(this.B2, 8);
        } else {
            com.tencent.mm.ui.bk.r0(this.B2.getPaint(), 0.8f);
            this.B2.setText(pm6Var.f383195p);
            this.B2.setBackgroundResource(com.tencent.mm.R.drawable.asx);
            a1(this.B2, 0);
        }
        k0();
    }

    public void w0(boolean z17) {
        android.view.View view = this.Z1;
        if (view != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cgi);
            if (z17) {
                if (viewGroup != null) {
                    viewGroup.setLayoutParams(this.f196688b3);
                }
                android.widget.LinearLayout linearLayout = this.X2;
                if (linearLayout != null) {
                    linearLayout.setLayoutParams(this.Z2);
                }
                a1(this.Y2, 8);
                a1(this.W2, 0);
            } else {
                if (viewGroup != null) {
                    viewGroup.setLayoutParams(this.f196689c3);
                }
                android.widget.LinearLayout linearLayout2 = this.X2;
                if (linearLayout2 != null) {
                    linearLayout2.setLayoutParams(this.f196687a3);
                }
                a1(this.Y2, 0);
                a1(this.f196699k2, 0);
                a1(this.W2, 8);
                android.view.ViewGroup viewGroup2 = this.f196699k2;
                if (viewGroup2 != null) {
                    a1(viewGroup2.findViewById(com.tencent.mm.R.id.fwo), 0);
                }
            }
            android.widget.RelativeLayout relativeLayout = this.Y2;
            if (relativeLayout != null) {
                relativeLayout.requestLayout();
            }
        }
    }

    public final int x0() {
        float dimension;
        float dimension2;
        int i17;
        if (this.L2 <= 0) {
            return 0;
        }
        java.lang.String G0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().G0(this.L2);
        android.content.Context context = this.Z1.getContext();
        int i18 = this.L2;
        if (java.lang.Float.compare(i65.a.q(context), i65.a.z(context)) > 0) {
            if (i18 < 10) {
                dimension2 = context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
                i17 = (int) dimension2;
            } else {
                dimension = context.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn);
                i17 = ((int) dimension) * 2;
            }
        } else if (i18 < 10) {
            dimension2 = context.getResources().getDimension(com.tencent.mm.R.dimen.f480435xu);
            i17 = (int) dimension2;
        } else {
            dimension = context.getResources().getDimension(com.tencent.mm.R.dimen.f480421xg);
            i17 = ((int) dimension) * 2;
        }
        if (this.L2 >= 10) {
            i17 += (int) this.K1.getPaint().measureText(G0);
        }
        com.tencent.mars.xlog.Log.i(this.f196695i2, "countWidth :" + i17 + " mRedDotCount:" + this.L2);
        return i17;
    }

    @Override // com.tencent.mm.plugin.newtips.NormalIconNewTipPreference, com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        if (z17) {
            z0();
        } else {
            w0(true);
        }
        Y0(8);
        super.y(z17);
        return true;
    }

    public final void z0() {
        com.tencent.mars.xlog.Log.i(this.f196695i2, "dismissWidgetFrame");
        a1(this.f196699k2, 8);
    }

    public FinderIconViewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int intValue;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderIconViewTipPreference_");
        java.lang.String str = this.f197780q;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        } else {
            try {
                java.lang.String str2 = (java.lang.String) com.tencent.mm.plugin.finder.extension.reddot.c3.f105436a.get(str);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    str = str2;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f196695i2, e17, "getTagPostfix", new java.lang.Object[0]);
            }
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        this.f196695i2 = sb7;
        this.f196697j2 = context;
        ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        this.S2 = new oc2.n(context);
        this.V1 = true;
        this.G = com.tencent.mm.R.layout.b3d;
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.K()) {
            intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "发现页右侧红点最大宽度是否使用DSL宽度", e42.c0.clicfg_finder_entrance_using_dsl_title_max_width, 1, false, com.tencent.mm.plugin.finder.storage.pe0.f127368d, 8, null)).intValue();
        } else {
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126465s).getValue()).r()).intValue();
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(intValue == 1);
        this.f196690d3 = valueOf;
        java.lang.Float valueOf2 = java.lang.Float.valueOf(((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ai(context.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn)));
        this.f196691e3 = valueOf2;
        java.lang.Float valueOf3 = java.lang.Float.valueOf(((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ai(context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv)));
        this.f196692f3 = valueOf3;
        java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).oj());
        this.f196693g3 = valueOf4;
        com.tencent.mars.xlog.Log.i(sb7, "init mUsingDslTitleMaxWidth:%s, mDslRedDotSafeSpaceWidth:%s, mStyleRedDotSafeSpaceWidth:%s, mOccupiedWidthNotChangeWithFont:%s", valueOf, valueOf2, valueOf3, valueOf4);
    }
}
