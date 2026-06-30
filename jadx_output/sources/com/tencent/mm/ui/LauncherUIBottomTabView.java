package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class LauncherUIBottomTabView extends android.widget.RelativeLayout implements com.tencent.mm.ui.t1 {
    public static final int L = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
    public static final int M = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f480435xu);
    public static final java.lang.Long N = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
    public final android.content.Context A;
    public final android.view.View.OnClickListener B;
    public final com.tencent.mm.sdk.platformtools.n3 C;
    public final android.view.View.OnLongClickListener D;
    public android.widget.LinearLayout E;
    public int F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f196843J;
    public boolean K;

    /* renamed from: d, reason: collision with root package name */
    public int f196844d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.s1 f196845e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.t8 f196846f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.t8 f196847g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.t8 f196848h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.t8 f196849i;

    /* renamed from: m, reason: collision with root package name */
    public int f196850m;

    /* renamed from: n, reason: collision with root package name */
    public int f196851n;

    /* renamed from: o, reason: collision with root package name */
    public int f196852o;

    /* renamed from: p, reason: collision with root package name */
    public int f196853p;

    /* renamed from: q, reason: collision with root package name */
    public int f196854q;

    /* renamed from: r, reason: collision with root package name */
    public int f196855r;

    /* renamed from: s, reason: collision with root package name */
    public int f196856s;

    /* renamed from: t, reason: collision with root package name */
    public int f196857t;

    /* renamed from: u, reason: collision with root package name */
    public int f196858u;

    /* renamed from: v, reason: collision with root package name */
    public int f196859v;

    /* renamed from: w, reason: collision with root package name */
    public int f196860w;

    /* renamed from: x, reason: collision with root package name */
    public long f196861x;

    /* renamed from: y, reason: collision with root package name */
    public int f196862y;

    /* renamed from: z, reason: collision with root package name */
    public int f196863z;

    public LauncherUIBottomTabView(android.content.Context context) {
        super(context);
        this.f196844d = 0;
        this.f196850m = 0;
        this.f196854q = 0;
        this.f196861x = 0L;
        this.f196862y = -1;
        this.f196863z = 0;
        this.B = new com.tencent.mm.ui.q8(this);
        this.C = new com.tencent.mm.ui.r8(this);
        this.D = new com.tencent.mm.ui.s8(this);
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = false;
        this.f196843J = 0;
        this.K = false;
        this.A = context;
        c();
    }

    private void setFriendUnreadMargin(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUITabView", "setFriendUnreadMargin: leftMargin:" + i17);
        android.widget.TextView textView = this.f196847g.f209887g;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.leftMargin != i17) {
                    marginLayoutParams.leftMargin = i17;
                    this.f196847g.f209887g.setLayoutParams(layoutParams);
                }
            }
        }
    }

    private void setTextBold(boolean z17) {
        android.widget.TextView textView;
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUITabView", "setTextBold: isBold:" + z17);
        com.tencent.mm.ui.t8 t8Var = this.f196847g;
        if (t8Var == null || (textView = t8Var.f209887g) == null) {
            return;
        }
        if (z17) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            com.tencent.mm.ui.bk.t0(textView.getPaint());
        }
    }

    public final void a(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "tab_red_dot_" + i17);
        boolean z17 = view instanceof android.widget.TextView;
        java.lang.Long l17 = N;
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "red_dot_shape", 1);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tk(view, l17 + "_tab_red_dot_unreaad_" + i17);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "red_dot_shape", 0);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).tk(view, l17 + "_tab_red_dot_" + i17);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).getClass();
        uy1.a.q(view, "link4TabPage", java.lang.Boolean.TRUE);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 160, 0);
    }

    public final com.tencent.mm.ui.t8 b(int i17, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.t8 t8Var = new com.tencent.mm.ui.t8(this);
        if (i65.a.E(getContext())) {
            t8Var.f209884d = android.view.LayoutInflater.from((android.app.Activity) getContext()).inflate(com.tencent.mm.R.layout.by6, (android.view.ViewGroup) null);
        } else {
            t8Var.f209884d = android.view.LayoutInflater.from((android.app.Activity) getContext()).inflate(com.tencent.mm.R.layout.f489274by5, (android.view.ViewGroup) null);
        }
        t8Var.f209885e = (com.tencent.mm.ui.TabIconView) t8Var.f209884d.findViewById(com.tencent.mm.R.id.h6y);
        t8Var.f209886f = (android.widget.TextView) t8Var.f209884d.findViewById(com.tencent.mm.R.id.icon_tv);
        android.widget.TextView textView = (android.widget.TextView) t8Var.f209884d.findViewById(com.tencent.mm.R.id.osw);
        t8Var.f209887g = textView;
        textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.a(getContext()));
        t8Var.f209888h = (android.widget.ImageView) t8Var.f209884d.findViewById(com.tencent.mm.R.id.d2h);
        t8Var.f209884d.setTag(java.lang.Integer.valueOf(i17));
        t8Var.f209884d.setOnClickListener(this.B);
        t8Var.f209884d.setOnLongClickListener(this.D);
        t8Var.f209886f.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479930ja) * i65.a.m(getContext()));
        t8Var.f209885e.setImportantForAccessibility(2);
        t8Var.f209888h.setImportantForAccessibility(2);
        a(t8Var.f209887g, i17);
        a(t8Var.f209888h, i17);
        return t8Var;
    }

    public final void c() {
        this.E = new android.widget.LinearLayout(getContext());
        if (com.tencent.mm.ui.a4.f197117a.h(this.A)) {
            this.E.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        } else {
            this.E.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478490b));
        }
        this.E.setOrientation(0);
        addView(this.E, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        this.f196863z = (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479627b2) * i65.a.m(getContext()));
        android.view.ViewGroup viewGroup = this.E;
        com.tencent.mm.ui.t8 b17 = b(0, viewGroup);
        b17.f209886f.setText(com.tencent.mm.R.string.gqz);
        b17.f209886f.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        b17.f209885e.a(com.tencent.mm.R.raw.icons_filled_chats_hl, com.tencent.mm.R.raw.icons_outlined_chats_middle, com.tencent.mm.R.raw.icons_outlined_chats, i65.a.E(getContext()));
        b17.f209887g.setVisibility(4);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, this.f196863z);
        layoutParams.weight = 1.0f;
        viewGroup.addView(b17.f209884d, layoutParams);
        this.f196846f = b17;
        android.view.ViewGroup viewGroup2 = this.E;
        com.tencent.mm.ui.t8 b18 = b(1, viewGroup2);
        b18.f209886f.setText(com.tencent.mm.R.string.gpx);
        b18.f209886f.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        b18.f209885e.a(com.tencent.mm.R.raw.icons_filled_contacts_hl, com.tencent.mm.R.raw.icons_outlined_contacts_middle, com.tencent.mm.R.raw.icons_outlined_contacts, i65.a.E(getContext()));
        b18.f209887g.setVisibility(4);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, this.f196863z);
        layoutParams2.weight = 1.0f;
        viewGroup2.addView(b18.f209884d, layoutParams2);
        this.f196848h = b18;
        android.view.ViewGroup viewGroup3 = this.E;
        com.tencent.mm.ui.t8 b19 = b(2, viewGroup3);
        b19.f209886f.setText(com.tencent.mm.R.string.gpv);
        b19.f209886f.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        b19.f209885e.a(com.tencent.mm.R.raw.icons_filled_discover_hl, com.tencent.mm.R.raw.icons_outlined_discover_middle, com.tencent.mm.R.raw.icons_outlined_discover, i65.a.E(getContext()));
        b19.f209887g.setVisibility(4);
        b19.f209889i = "discovery";
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(b19);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, this.f196863z);
        layoutParams3.weight = 1.0f;
        viewGroup3.addView(b19.f209884d, layoutParams3);
        this.f196847g = b19;
        android.view.ViewGroup viewGroup4 = this.E;
        com.tencent.mm.ui.t8 b27 = b(3, viewGroup4);
        b27.f209886f.setText(com.tencent.mm.R.string.gqv);
        b27.f209886f.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        b27.f209885e.a(com.tencent.mm.R.raw.icons_filled_me_hl, com.tencent.mm.R.raw.icons_outlined_me, com.tencent.mm.R.raw.icons_outlined_me, i65.a.E(getContext()));
        b27.f209887g.setVisibility(4);
        b27.f209889i = "me";
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(b27);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(0, this.f196863z);
        layoutParams4.weight = 1.0f;
        viewGroup4.addView(b27.f209884d, layoutParams4);
        this.f196849i = b27;
        int color = getResources().getColor(com.tencent.mm.R.color.f479459zw);
        this.f196850m = color;
        this.f196851n = (color & 16711680) >> 16;
        this.f196852o = (color & 65280) >> 8;
        this.f196853p = color & 255;
        int color2 = getResources().getColor(com.tencent.mm.R.color.FG_0);
        this.f196854q = color2;
        int i17 = (16711680 & color2) >> 16;
        this.f196855r = i17;
        int i18 = (65280 & color2) >> 8;
        this.f196856s = i18;
        int i19 = color2 & 255;
        this.f196857t = i19;
        this.f196858u = this.f196851n - i17;
        this.f196859v = this.f196852o - i18;
        this.f196860w = this.f196853p - i19;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:11:0x0024, B:13:0x0038, B:16:0x0041, B:19:0x004c, B:24:0x005f, B:26:0x0063, B:31:0x006b), top: B:10:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L1e
            if (r10 == r0) goto L19
            r2 = 2
            if (r10 == r2) goto L14
            r2 = 3
            if (r10 == r2) goto Lf
            r2 = 0
            r3 = r1
            goto L22
        Lf:
            com.tencent.mm.ui.t8 r2 = r9.f196849i
            int r3 = r9.f196843J
            goto L22
        L14:
            com.tencent.mm.ui.t8 r2 = r9.f196847g
            int r3 = r9.H
            goto L22
        L19:
            com.tencent.mm.ui.t8 r2 = r9.f196848h
            int r3 = r9.G
            goto L22
        L1e:
            com.tencent.mm.ui.t8 r2 = r9.f196846f
            int r3 = r9.F
        L22:
            if (r2 == 0) goto L83
            android.widget.TextView r4 = r2.f209887g     // Catch: java.lang.Exception -> L73
            java.lang.CharSequence r4 = r4.getText()     // Catch: java.lang.Exception -> L73
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L73
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Exception -> L73
            int r5 = com.tencent.mm.sdk.platformtools.t8.P(r4, r1)     // Catch: java.lang.Exception -> L73
            if (r5 != 0) goto L40
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)     // Catch: java.lang.Exception -> L73
            if (r5 != 0) goto L40
            r5 = r0
            goto L41
        L40:
            r5 = r1
        L41:
            android.widget.ImageView r2 = r2.f209888h     // Catch: java.lang.Exception -> L73
            int r2 = r2.getVisibility()     // Catch: java.lang.Exception -> L73
            if (r2 != 0) goto L4b
            r2 = r0
            goto L4c
        L4b:
            r2 = r1
        L4c:
            com.tencent.mm.autogen.events.WeChatTabRedDotEvent r6 = new com.tencent.mm.autogen.events.WeChatTabRedDotEvent     // Catch: java.lang.Exception -> L73
            r6.<init>()     // Catch: java.lang.Exception -> L73
            am.g20 r7 = r6.f54979g     // Catch: java.lang.Exception -> L73
            r7.f6731a = r10     // Catch: java.lang.Exception -> L73
            r7.f6733c = r3     // Catch: java.lang.Exception -> L73
            if (r2 != 0) goto L5e
            if (r5 == 0) goto L5c
            goto L5e
        L5c:
            r8 = r1
            goto L5f
        L5e:
            r8 = r0
        L5f:
            r7.f6732b = r8     // Catch: java.lang.Exception -> L73
            if (r3 != 0) goto L65
            r7.f6734d = r4     // Catch: java.lang.Exception -> L73
        L65:
            if (r2 != 0) goto L6b
            if (r5 == 0) goto L6a
            goto L6b
        L6a:
            r0 = r1
        L6b:
            zs.c.f475223a = r0     // Catch: java.lang.Exception -> L73
            zs.c.f475227e = r3     // Catch: java.lang.Exception -> L73
            r6.e()     // Catch: java.lang.Exception -> L73
            goto L83
        L73:
            r0 = move-exception
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r1 = "MicroMsg.LauncherUITabView"
            java.lang.String r2 = "notify tab reddot tabIndex [%d]"
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r0, r2, r10)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.LauncherUIBottomTabView.d(int):void");
    }

    public final void e() {
        android.view.View view = this.f196846f.f209884d;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        view.setTag(com.tencent.mm.R.id.hui, bool);
        this.f196846f.f209884d.setSelected(false);
        this.f196847g.f209884d.setTag(com.tencent.mm.R.id.hui, bool);
        this.f196847g.f209884d.setSelected(false);
        this.f196848h.f209884d.setTag(com.tencent.mm.R.id.hui, bool);
        this.f196848h.f209884d.setSelected(false);
        this.f196849i.f209884d.setTag(com.tencent.mm.R.id.hui, bool);
        this.f196849i.f209884d.setSelected(false);
    }

    public void f(boolean z17) {
        com.tencent.mm.ui.t8 t8Var = this.f196847g;
        t8Var.getClass();
        if (com.tencent.mm.plugin.newtips.model.i.l(z17, t8Var)) {
            return;
        }
        if (z17 && this.f196847g.f209887g.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUITabView", "unreadTV is VISIBLE just return!");
            return;
        }
        if (this.I != z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TRDTemp", "[showFriendPoint] show : " + z17);
        }
        this.I = z17;
        setFriendUnreadMargin(-L);
        setTextBold(false);
        this.f196847g.f209887g.setVisibility(4);
        this.f196847g.f209888h.setVisibility(z17 ? 0 : 4);
        com.tencent.mm.ui.t8 t8Var2 = this.f196847g;
        com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
        t8Var2.getClass();
        com.tencent.mm.plugin.newtips.model.i.b(t8Var2, rVar, z17);
        d(2);
    }

    public void g(boolean z17, java.lang.String str) {
        com.tencent.mm.ui.t8 t8Var = this.f196847g;
        t8Var.getClass();
        if (com.tencent.mm.plugin.newtips.model.i.l(z17, t8Var)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUITabView", "showFriendTextPoint show:" + z17 + " text:" + str);
        com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_COUNTER;
        if (!z17 || android.text.TextUtils.isEmpty(str)) {
            setTextBold(false);
            this.f196847g.f209887g.setText("");
            this.f196847g.f209887g.setVisibility(4);
            int i17 = this.H;
            if (i17 > 0) {
                j(i17);
            } else {
                com.tencent.mm.ui.t8 t8Var2 = this.f196847g;
                t8Var2.getClass();
                com.tencent.mm.plugin.newtips.model.i.b(t8Var2, rVar, false);
                boolean z18 = this.I;
                if (z18) {
                    f(z18);
                }
            }
        } else {
            this.f196847g.f209887g.setText(str);
            this.f196847g.f209887g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(getContext()));
            this.f196847g.f209887g.setVisibility(0);
            this.f196847g.f209887g.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getContext(), 20));
            this.f196847g.f209888h.setVisibility(4);
            if (i65.a.E(this.A)) {
                setFriendUnreadMargin(-M);
            } else {
                setFriendUnreadMargin(-L);
            }
            setTextBold(true);
            com.tencent.mm.ui.t8 t8Var3 = this.f196847g;
            t8Var3.getClass();
            com.tencent.mm.plugin.newtips.model.i.b(t8Var3, rVar, true);
        }
        if (!u46.l.e(this.f196847g.f209887g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f196847g.f209887g, "red_dot_content", str);
        }
        d(2);
    }

    @Override // com.tencent.mm.ui.t1
    public int getContactTabUnread() {
        return this.G;
    }

    @Override // com.tencent.mm.ui.t1
    public int getCurIdx() {
        return this.f196844d;
    }

    @Override // com.tencent.mm.ui.t1
    public int getFriendTabUnread() {
        return this.H;
    }

    public android.widget.TextView getFriendUnreadCountView() {
        return this.f196847g.f209887g;
    }

    @Override // com.tencent.mm.ui.t1
    public int getMainTabUnread() {
        return this.F;
    }

    @Override // com.tencent.mm.ui.t1
    public boolean getSettingsPoint() {
        return this.K;
    }

    public android.view.View getSettingsPointView() {
        com.tencent.mm.ui.t8 t8Var = this.f196849i;
        if (t8Var != null) {
            return t8Var.f209888h;
        }
        return null;
    }

    @Override // com.tencent.mm.ui.t1
    public int getSettingsTabUnread() {
        return this.f196843J;
    }

    @Override // com.tencent.mm.ui.t1
    public boolean getShowFriendPoint() {
        return this.I;
    }

    public void h(boolean z17) {
        com.tencent.mm.ui.t8 t8Var = this.f196849i;
        t8Var.getClass();
        if (com.tencent.mm.plugin.newtips.model.i.l(z17, t8Var)) {
            return;
        }
        mf4.d dVar = mf4.d.f326160a;
        mf4.d.f326174o = z17 ? 1L : 0L;
        this.K = z17;
        this.f196849i.f209887g.setVisibility(4);
        this.f196849i.f209888h.setVisibility(z17 ? 0 : 4);
        com.tencent.mm.ui.t8 t8Var2 = this.f196849i;
        com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
        t8Var2.getClass();
        com.tencent.mm.plugin.newtips.model.i.b(t8Var2, rVar, z17);
        d(3);
    }

    public void i(int i17) {
        if (this.G != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TRDTemp", "[updateContactTabUnread] unread : " + i17);
        }
        this.G = i17;
        if (i17 <= 0) {
            this.f196848h.f209887g.setText("");
            this.f196848h.f209887g.setVisibility(4);
        } else if (i17 > 99) {
            this.f196848h.f209887g.setText("");
            this.f196848h.f209887g.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
            this.f196848h.f209887g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3));
            this.f196848h.f209887g.setVisibility(0);
            this.f196848h.f209888h.setVisibility(4);
        } else {
            this.f196848h.f209887g.setText(java.lang.String.valueOf(i17));
            this.f196848h.f209887g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(getContext()));
            this.f196848h.f209887g.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getContext(), i17));
            this.f196848h.f209887g.setVisibility(0);
            this.f196848h.f209888h.setVisibility(4);
        }
        if (!u46.l.e(this.f196848h.f209887g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f196848h.f209887g, "red_dot_content", java.lang.Integer.valueOf(i17));
        }
        d(1);
    }

    public void j(int i17) {
        if (this.H != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TRDTemp", "[updateFriendTabUnread] unread : " + i17);
        }
        this.H = i17;
        com.tencent.mm.ui.t8 t8Var = this.f196847g;
        boolean z17 = i17 > 0;
        t8Var.getClass();
        if (com.tencent.mm.plugin.newtips.model.i.l(z17, t8Var)) {
            return;
        }
        setFriendUnreadMargin(-L);
        setTextBold(false);
        com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_COUNTER;
        if (i17 > 0) {
            if (i17 > 99) {
                this.f196847g.f209887g.setText("");
                this.f196847g.f209887g.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
                this.f196847g.f209887g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3));
                this.f196847g.f209887g.setVisibility(0);
                this.f196847g.f209888h.setVisibility(4);
            } else {
                this.f196847g.f209887g.setText(java.lang.String.valueOf(i17));
                this.f196847g.f209887g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(getContext()));
                this.f196847g.f209887g.setVisibility(0);
                this.f196847g.f209887g.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getContext(), i17));
                this.f196847g.f209888h.setVisibility(4);
            }
            com.tencent.mm.ui.t8 t8Var2 = this.f196847g;
            t8Var2.getClass();
            com.tencent.mm.plugin.newtips.model.i.b(t8Var2, rVar, true);
        } else {
            this.f196847g.f209887g.setText("");
            this.f196847g.f209887g.setVisibility(4);
            com.tencent.mm.ui.t8 t8Var3 = this.f196847g;
            t8Var3.getClass();
            com.tencent.mm.plugin.newtips.model.i.b(t8Var3, rVar, false);
        }
        if (!u46.l.e(this.f196847g.f209887g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f196847g.f209887g, "red_dot_content", java.lang.Integer.valueOf(i17));
        }
        d(2);
    }

    public void k(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUITabView", "updateMainTabUnread %d", java.lang.Integer.valueOf(i17));
        if (this.F != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TRDTemp", "[updateMainTabUnread] unread : " + i17);
        }
        this.F = i17;
        if (i17 <= 0) {
            this.f196846f.f209887g.setText("");
            this.f196846f.f209887g.setVisibility(4);
        } else if (i17 > 99) {
            this.f196846f.f209887g.setText("");
            this.f196846f.f209887g.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
            this.f196846f.f209887g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3));
            this.f196846f.f209887g.setVisibility(0);
            this.f196846f.f209887g.setContentDescription(getContext().getString(com.tencent.mm.R.string.f493414k31));
            this.f196846f.f209888h.setVisibility(4);
        } else {
            this.f196846f.f209887g.setText(java.lang.String.valueOf(i17));
            this.f196846f.f209887g.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getContext(), i17));
            this.f196846f.f209887g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(getContext()));
            this.f196846f.f209887g.setVisibility(0);
            this.f196846f.f209887g.setContentDescription(null);
            this.f196846f.f209888h.setVisibility(4);
        }
        if (!u46.l.e(this.f196846f.f209887g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f196846f.f209887g, "red_dot_content", java.lang.Integer.valueOf(i17));
        }
        d(0);
    }

    public void l(int i17) {
        if (this.f196843J != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TRDTemp", "[updateSettingsTabUnread] unread : " + i17);
        }
        this.f196843J = i17;
        com.tencent.mm.ui.t8 t8Var = this.f196849i;
        boolean z17 = i17 > 0;
        t8Var.getClass();
        if (com.tencent.mm.plugin.newtips.model.i.l(z17, t8Var)) {
            return;
        }
        com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_COUNTER;
        if (i17 > 0) {
            if (i17 > 99) {
                this.f196849i.f209887g.setText("");
                this.f196849i.f209887g.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
                this.f196849i.f209887g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3));
                this.f196849i.f209887g.setVisibility(0);
                this.f196849i.f209888h.setVisibility(4);
            } else {
                this.f196849i.f209887g.setText(java.lang.String.valueOf(i17));
                this.f196849i.f209887g.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(getContext()));
                this.f196849i.f209887g.setVisibility(0);
                this.f196849i.f209887g.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(getContext(), i17));
                this.f196849i.f209888h.setVisibility(4);
            }
            com.tencent.mm.ui.t8 t8Var2 = this.f196849i;
            t8Var2.getClass();
            com.tencent.mm.plugin.newtips.model.i.b(t8Var2, rVar, true);
        } else {
            this.f196849i.f209887g.setText("");
            this.f196849i.f209887g.setVisibility(4);
            com.tencent.mm.ui.t8 t8Var3 = this.f196849i;
            t8Var3.getClass();
            com.tencent.mm.plugin.newtips.model.i.b(t8Var3, rVar, false);
        }
        if (!u46.l.e(this.f196849i.f209887g.getText().toString())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f196849i.f209887g, "red_dot_content", java.lang.Integer.valueOf(i17));
        }
        d(3);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View rootView = getRootView();
        if (rootView != null) {
            android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.kod);
            if (findViewById instanceof com.tencent.mm.ui.base.CustomViewPager) {
                com.tencent.mm.ui.base.CustomViewPager customViewPager = (com.tencent.mm.ui.base.CustomViewPager) findViewById;
                int childCount = customViewPager.getChildCount();
                for (int i28 = 0; i28 < childCount; i28++) {
                    android.view.View childAt = customViewPager.getChildAt(i28);
                    if (childAt instanceof com.tencent.mm.ui.FrostedContentView) {
                        com.tencent.mm.ui.FrostedContentView frostedContentView = (com.tencent.mm.ui.FrostedContentView) childAt;
                        frostedContentView.a(frostedContentView.getFrostedEnabled(), i27 - i18, getTranslationY());
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.t1
    public void setOnTabClickListener(com.tencent.mm.ui.s1 s1Var) {
        this.f196845e = s1Var;
    }

    @Override // com.tencent.mm.ui.t1
    public void setTo(int i17) {
        this.f196844d = i17;
        if (i17 == 0) {
            this.f196846f.f209885e.setFocusAlpha(255);
            this.f196847g.f209885e.setFocusAlpha(0);
            this.f196848h.f209885e.setFocusAlpha(0);
            this.f196849i.f209885e.setFocusAlpha(0);
            this.f196846f.f209886f.setTextColor(this.f196850m);
            this.f196847g.f209886f.setTextColor(this.f196854q);
            this.f196848h.f209886f.setTextColor(this.f196854q);
            this.f196849i.f209886f.setTextColor(this.f196854q);
            e();
            this.f196846f.f209884d.setTag(com.tencent.mm.R.id.hui, java.lang.Boolean.TRUE);
            this.f196846f.f209884d.setSelected(true);
        } else if (i17 == 1) {
            this.f196846f.f209885e.setFocusAlpha(0);
            this.f196847g.f209885e.setFocusAlpha(0);
            this.f196848h.f209885e.setFocusAlpha(255);
            this.f196849i.f209885e.setFocusAlpha(0);
            this.f196846f.f209886f.setTextColor(this.f196854q);
            this.f196847g.f209886f.setTextColor(this.f196854q);
            this.f196848h.f209886f.setTextColor(this.f196850m);
            this.f196849i.f209886f.setTextColor(this.f196854q);
            e();
            this.f196848h.f209884d.setTag(com.tencent.mm.R.id.hui, java.lang.Boolean.TRUE);
            this.f196848h.f209884d.setSelected(true);
        } else if (i17 == 2) {
            this.f196846f.f209885e.setFocusAlpha(0);
            this.f196847g.f209885e.setFocusAlpha(255);
            this.f196848h.f209885e.setFocusAlpha(0);
            this.f196849i.f209885e.setFocusAlpha(0);
            this.f196846f.f209886f.setTextColor(this.f196854q);
            this.f196847g.f209886f.setTextColor(this.f196850m);
            this.f196848h.f209886f.setTextColor(this.f196854q);
            this.f196849i.f209886f.setTextColor(this.f196854q);
            e();
            this.f196847g.f209884d.setTag(com.tencent.mm.R.id.hui, java.lang.Boolean.TRUE);
            this.f196847g.f209884d.setSelected(true);
        } else if (i17 == 3) {
            this.f196846f.f209885e.setFocusAlpha(0);
            this.f196847g.f209885e.setFocusAlpha(0);
            this.f196848h.f209885e.setFocusAlpha(0);
            this.f196849i.f209885e.setFocusAlpha(255);
            this.f196846f.f209886f.setTextColor(this.f196854q);
            this.f196847g.f209886f.setTextColor(this.f196854q);
            this.f196848h.f209886f.setTextColor(this.f196854q);
            this.f196849i.f209886f.setTextColor(this.f196850m);
            e();
            this.f196849i.f209884d.setTag(com.tencent.mm.R.id.hui, java.lang.Boolean.TRUE);
            this.f196849i.f209884d.setSelected(true);
        }
        this.f196861x = java.lang.System.currentTimeMillis();
        this.f196862y = this.f196844d;
    }

    public LauncherUIBottomTabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f196844d = 0;
        this.f196850m = 0;
        this.f196854q = 0;
        this.f196861x = 0L;
        this.f196862y = -1;
        this.f196863z = 0;
        this.B = new com.tencent.mm.ui.q8(this);
        this.C = new com.tencent.mm.ui.r8(this);
        this.D = new com.tencent.mm.ui.s8(this);
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = false;
        this.f196843J = 0;
        this.K = false;
        this.A = context;
        c();
    }

    public LauncherUIBottomTabView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f196844d = 0;
        this.f196850m = 0;
        this.f196854q = 0;
        this.f196861x = 0L;
        this.f196862y = -1;
        this.f196863z = 0;
        this.B = new com.tencent.mm.ui.q8(this);
        this.C = new com.tencent.mm.ui.r8(this);
        this.D = new com.tencent.mm.ui.s8(this);
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = false;
        this.f196843J = 0;
        this.K = false;
        this.A = context;
        c();
    }
}
