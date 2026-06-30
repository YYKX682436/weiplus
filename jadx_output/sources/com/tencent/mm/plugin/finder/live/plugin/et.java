package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class et extends com.tencent.mm.plugin.finder.live.plugin.l {
    public static final long H1;
    public static final long I1;
    public static final int J1;
    public static final float K1;
    public final android.widget.ImageView A;
    public int A1;
    public final android.widget.TextView B;
    public boolean B1;
    public final com.tencent.mm.ui.widget.imageview.WeImageView C;
    public boolean C1;
    public final android.widget.ImageView D;
    public java.lang.CharSequence D1;
    public final android.view.View E;
    public final jz5.g E1;
    public final android.view.View F;
    public boolean F1;
    public final android.view.View G;
    public boolean G1;
    public final android.view.View H;
    public final android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.g8 f112446J;
    public final androidx.recyclerview.widget.RecyclerView K;
    public bm2.m3 L;
    public ol2.b M;
    public com.tencent.mm.plugin.finder.live.plugin.mg N;
    public final com.tencent.mm.api.SmileyPanel P;
    public final com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel Q;
    public final android.content.Context R;
    public com.tencent.mm.plugin.finder.live.plugin.rt S;
    public boolean T;
    public int U;
    public java.lang.String V;
    public r45.xn1 W;
    public long X;
    public int Y;
    public boolean Z;

    /* renamed from: l1, reason: collision with root package name */
    public r45.ze2 f112447l1;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f112448p;

    /* renamed from: p0, reason: collision with root package name */
    public long f112449p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f112450p1;

    /* renamed from: q, reason: collision with root package name */
    public final int f112451q;

    /* renamed from: r, reason: collision with root package name */
    public final int f112452r;

    /* renamed from: s, reason: collision with root package name */
    public final int f112453s;

    /* renamed from: t, reason: collision with root package name */
    public int f112454t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveInputLayout f112455u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.LinearLayout f112456v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.LinearLayout f112457w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f112458x;

    /* renamed from: x0, reason: collision with root package name */
    public int f112459x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.util.ArrayList f112460x1;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMEditText f112461y;

    /* renamed from: y0, reason: collision with root package name */
    public long f112462y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f112463y1;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f112464z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f112465z1;

    static {
        ae2.in inVar = ae2.in.f3688a;
        long longValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3862r3).getValue()).r()).longValue();
        H1 = longValue;
        I1 = longValue;
        J1 = com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX;
        K1 = j65.f.f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        bm2.m3 m3Var;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112448p = statusMonitor;
        this.f112451q = 1;
        this.f112452r = 2;
        this.f112453s = 3;
        this.f112454t = 120;
        com.tencent.mm.plugin.finder.live.view.FinderLiveInputLayout finderLiveInputLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveInputLayout) root.findViewById(com.tencent.mm.R.id.ruk);
        this.f112455u = finderLiveInputLayout;
        this.f112456v = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.i9x);
        this.f112457w = (android.widget.LinearLayout) root.findViewById(com.tencent.mm.R.id.ubr);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f485601ia5);
        findViewById.setOnClickListener(com.tencent.mm.plugin.finder.live.plugin.xr.f115126d);
        this.f112458x = findViewById;
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) root.findViewById(com.tencent.mm.R.id.ia7);
        this.f112461y = mMEditText;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.iel);
        this.f112464z = textView;
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.i_z);
        this.A = imageView;
        this.B = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f485600ia4);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.ubq);
        this.C = weImageView;
        this.D = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.rul);
        this.E = root.findViewById(com.tencent.mm.R.id.rum);
        this.F = root.findViewById(com.tencent.mm.R.id.rn7);
        this.G = root.findViewById(com.tencent.mm.R.id.f484802rn5);
        this.H = root.findViewById(com.tencent.mm.R.id.rn6);
        this.I = root.findViewById(com.tencent.mm.R.id.ia8);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.iaa);
        this.K = recyclerView;
        this.P = qk.w9.c(root.getContext(), true);
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.Q = new com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel(context, null);
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.R = context2;
        this.V = "";
        this.U = 0;
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.kq(this));
        com.tencent.mm.feature.emoji.api.x6 x6Var = (com.tencent.mm.feature.emoji.api.x6) i95.n0.c(com.tencent.mm.feature.emoji.api.x6.class);
        android.content.res.Configuration configuration = new android.content.res.Configuration(context2.getResources().getConfiguration());
        configuration.uiMode = (configuration.uiMode & (-49)) | 32;
        android.content.Context createConfigurationContext = context2.createConfigurationContext(configuration);
        kotlin.jvm.internal.o.f(createConfigurationContext, "createConfigurationContext(...)");
        ((com.tencent.mm.feature.emoji.cb) x6Var).getClass();
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = new com.tencent.mm.pluginsdk.ui.chat.ra(createConfigurationContext, null, null, null);
        this.f112446J = raVar;
        com.tencent.mm.plugin.finder.live.plugin.kr krVar = new com.tencent.mm.plugin.finder.live.plugin.kr(new com.tencent.mm.plugin.finder.live.plugin.at(this));
        com.tencent.mm.plugin.finder.live.plugin.zs zsVar = com.tencent.mm.plugin.finder.live.plugin.zs.f115376a;
        raVar.f190615f = imageView;
        raVar.f190616g = krVar;
        raVar.f190617h = zsVar;
        raVar.f190633x = com.tencent.mm.pluginsdk.ui.chat.d8.kLive;
        raVar.f190628s = new com.tencent.mm.plugin.finder.live.plugin.ys(this);
        bm2.m3 m3Var2 = new bm2.m3(context2, bm2.h3.f21938d);
        this.L = m3Var2;
        recyclerView.setAdapter(m3Var2);
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = new com.google.android.flexbox.FlexboxLayoutManager(context2);
        flexboxLayoutManager.F(1);
        flexboxLayoutManager.E(0);
        flexboxLayoutManager.D(4);
        if (flexboxLayoutManager.f44201f != 0) {
            flexboxLayoutManager.f44201f = 0;
            flexboxLayoutManager.requestLayout();
        }
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.z());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(recyclerView, "finder_live_room_fast_comment");
        bm2.m3 m3Var3 = this.L;
        if (m3Var3 != null) {
            m3Var3.f22098g = new com.tencent.mm.plugin.finder.live.plugin.rr(m3Var3, this);
            m3Var3.notifyDataSetChanged();
        }
        if (!c01.e2.a0() && (m3Var = this.L) != null) {
            java.util.ArrayList arrayList = m3Var.f22097f;
            java.lang.String string = m3Var.f22095d.getResources().getString(com.tencent.mm.R.string.deu);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            arrayList.add(new bm2.j3(string, 0, 0L, 0, null, 20, null));
            m3Var.notifyDataSetChanged();
        }
        a2(((mm2.u0) S0().a(mm2.u0.class)).f329448n);
        int i17 = (int) (J1 * K1);
        int i18 = com.tencent.mm.ui.bl.b(this.f365323d.getContext()).y / 2;
        this.f112459x0 = i17 > i18 ? i18 : i17;
        W1(this.f112454t);
        mMEditText.setOnKeyListener(new com.tencent.mm.plugin.finder.live.plugin.lq(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.live.plugin.nq(this));
        mMEditText.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.oq(this));
        if (x0()) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(com.tencent.mm.ui.bl.c(root.getContext()));
            com.tencent.mm.ui.a4.f197117a.m(findViewById, new com.tencent.mm.ui.t3(false, findViewById), null);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(textView, "finder_live_room_reply_btn");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(textView, 8, 25561);
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.pq(this));
        finderLiveInputLayout.setOnSingleTouListener(new com.tencent.mm.plugin.finder.live.plugin.qq(this));
        weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.sq(this));
        zl2.r4.o3(zl2.r4.f473950a, root, "Finder.LiveInputPlugin", true, false, 8, null);
        J1();
        this.D1 = "";
        this.E1 = jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.pr.f113928d);
    }

    public static final void A1(com.tencent.mm.plugin.finder.live.plugin.et etVar, com.tencent.mm.api.IEmojiInfo emoji, com.tencent.mm.plugin.finder.live.plugin.uq uqVar) {
        r45.ch1 b17;
        int i17;
        dk2.zf a8Var;
        jz5.f0 f0Var;
        km2.r rVar;
        km2.r rVar2;
        if (etVar.L1()) {
            int i18 = 0;
            if (etVar.W != null) {
                ke2.p0 p0Var = ke2.q0.f306981w;
                gk2.e liveData = etVar.S0();
                r45.xn1 xn1Var = etVar.W;
                kotlin.jvm.internal.o.d(xn1Var);
                long j17 = etVar.X;
                int i19 = etVar.Y;
                kn0.e a17 = hn0.v.f282440a.a();
                java.lang.String str = a17 != null ? a17.B : null;
                kotlin.jvm.internal.o.g(liveData, "liveData");
                kotlin.jvm.internal.o.g(emoji, "emojiInfo");
                b17 = new r45.ch1();
                b17.set(0, xn1Var);
                r45.xn1 xn1Var2 = new r45.xn1();
                zl2.r4 r4Var = zl2.r4.f473950a;
                xn1Var2.set(0, r4Var.m0(liveData));
                xn1Var2.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).f328812h);
                xn1Var2.set(7, java.lang.Integer.valueOf(r4Var.g0()));
                b17.set(13, xn1Var2);
                r45.xj1 xj1Var = new r45.xj1();
                r45.up2 up2Var = new r45.up2();
                up2Var.set(0, str);
                xj1Var.set(1, up2Var);
                xj1Var.set(6, emoji.getMd5());
                xj1Var.set(7, ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class))).Ai(emoji));
                xj1Var.set(5, 1);
                xj1Var.set(8, java.lang.Integer.valueOf(i19));
                b17.set(4, com.tencent.mm.protobuf.g.b(xj1Var.toByteArray()));
                b17.set(1, 20002);
                b17.set(2, zl2.q4.f473933a.m());
                b17.set(3, java.lang.Long.valueOf(j17));
            } else {
                b17 = ke2.q0.f306981w.b(etVar.S0(), emoji, false);
            }
            r45.qt2 qt2Var = new r45.qt2();
            km2.n nVar = dk2.ef.H;
            qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f309151c) == null) ? 0 : rVar2.f309206k));
            km2.n nVar2 = dk2.ef.H;
            if (nVar2 != null && (rVar = nVar2.f309151c) != null) {
                i18 = rVar.f309206k;
            }
            qt2Var.set(5, java.lang.Integer.valueOf(i18));
            new ke2.q0(b17, etVar.S0(), qt2Var, new com.tencent.mm.plugin.finder.live.plugin.os(etVar)).l();
            etVar.f112461y.setText((java.lang.CharSequence) null);
            zl2.r4 r4Var2 = zl2.r4.f473950a;
            gk2.e liveData2 = etVar.S0();
            kotlin.jvm.internal.o.g(emoji, "emoji");
            kotlin.jvm.internal.o.g(liveData2, "liveData");
            if (b17.getInteger(1) == 20124) {
                r45.ch1 b18 = ke2.q0.f306981w.b(liveData2, emoji, true);
                i17 = 2;
                b18.set(2, b17.getString(2));
                a8Var = new dk2.v5(b18);
            } else {
                i17 = 2;
                a8Var = new dk2.a8(b17);
            }
            r4Var2.a(b17.getString(i17), etVar.S0());
            r4Var2.k3(a8Var, etVar.S0());
            qo0.c.a(etVar.f112448p, qo0.b.N, null, i17, null);
            r45.xn1 xn1Var3 = etVar.W;
            com.tencent.mm.plugin.finder.live.util.d0 d0Var = com.tencent.mm.plugin.finder.live.util.d0.f115473a;
            if (xn1Var3 != null) {
                gk2.e S0 = etVar.S0();
                java.lang.String j18 = a8Var.j();
                if (j18 == null) {
                    j18 = "";
                }
                dk2.zf zfVar = ((mm2.x4) etVar.P0(mm2.x4.class)).f329535p;
                java.util.HashMap hashMap = new java.util.HashMap();
                if (uqVar != com.tencent.mm.plugin.finder.live.plugin.uq.f114611e) {
                    hashMap.put("recommend_source", java.lang.String.valueOf(uqVar.f114615d));
                }
                d0Var.d(S0, j18, zfVar, hashMap);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                gk2.e S02 = etVar.S0();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                if (uqVar != com.tencent.mm.plugin.finder.live.plugin.uq.f114611e) {
                    hashMap2.put("recommend_source", java.lang.String.valueOf(uqVar.f114615d));
                }
                d0Var.c(S02, a8Var, hashMap2);
            }
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.P7).getValue()).r()).booleanValue()) {
                pm0.v.V(5000L, new com.tencent.mm.plugin.finder.live.plugin.ps(etVar, b17));
            }
        }
        etVar.F1();
    }

    public static final void B1(com.tencent.mm.plugin.finder.live.plugin.et etVar, float f17, float f18) {
        etVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "getPoiCityInfo: longitude:" + f17 + ", latitude:" + f18);
        r45.d64 d64Var = new r45.d64();
        d64Var.f372174d = f17;
        d64Var.f372175e = f18;
        d64Var.f372179i = 0;
        d64Var.f372176f = 1;
        ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, new com.tencent.mm.plugin.finder.live.plugin.ts(etVar, f17, f18));
    }

    public static void G1(com.tencent.mm.plugin.finder.live.plugin.et etVar, int i17, int i18, java.lang.String content, java.lang.String str, yz5.a aVar, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            aVar = null;
        }
        etVar.getClass();
        kotlin.jvm.internal.o.g(content, "content");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.mr(i17, i18, etVar, content, str, aVar));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.String, still in use, count: 2, list:
          (r3v4 java.lang.String) from 0x0150: IF  (r3v4 java.lang.String) == (null java.lang.String)  -> B:65:0x0152 A[HIDDEN]
          (r3v4 java.lang.String) from 0x0056: PHI (r3v17 java.lang.String) = 
          (r3v4 java.lang.String)
          (r3v5 java.lang.String)
          (r3v10 java.lang.String)
          (r3v11 java.lang.String)
          (r3v16 java.lang.String)
          (r3v28 java.lang.String)
          (r3v32 java.lang.String)
          (r3v34 java.lang.String)
          (r3v36 java.lang.String)
          (r3v37 java.lang.String)
         binds: [B:77:0x0150, B:75:0x013c, B:72:0x012c, B:65:0x0152, B:64:0x0101, B:52:0x00ad, B:38:0x008d, B:46:0x00a1, B:28:0x006d, B:22:0x004f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:26:0x0059, B:28:0x006d, B:29:0x007a, B:31:0x007e, B:35:0x0088, B:39:0x008f, B:42:0x009a, B:46:0x00a1), top: B:25:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String I1(com.tencent.mm.plugin.finder.live.plugin.et r3, java.lang.Boolean r4, int r5, java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.et.I1(com.tencent.mm.plugin.finder.live.plugin.et, java.lang.Boolean, int, java.lang.Object):java.lang.String");
    }

    public static final jz5.l t1(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        df2.ih ihVar = (df2.ih) etVar.U0(df2.ih.class);
        boolean z17 = ihVar != null && ihVar.f230401r;
        android.content.Context context = etVar.R;
        if (!z17) {
            return new jz5.l(java.lang.Boolean.FALSE, context.getString(com.tencent.mm.R.string.npe));
        }
        df2.ih ihVar2 = (df2.ih) etVar.U0(df2.ih.class);
        if (!(ihVar2 != null && ihVar2.f230400q)) {
            return new jz5.l(java.lang.Boolean.FALSE, context.getString(com.tencent.mm.R.string.npf));
        }
        if (!etVar.L1()) {
            return new jz5.l(java.lang.Boolean.FALSE, context.getString(com.tencent.mm.R.string.npg));
        }
        df2.d4 d4Var = (df2.d4) etVar.U0(df2.d4.class);
        return d4Var != null && d4Var.d7() ? new jz5.l(java.lang.Boolean.FALSE, context.getString(com.tencent.mm.R.string.nph)) : new jz5.l(java.lang.Boolean.TRUE, "");
    }

    public static final void u1(com.tencent.mm.plugin.finder.live.plugin.et etVar, r45.ze2 ze2Var) {
        java.lang.String str;
        java.lang.String l17;
        km2.r rVar;
        km2.r rVar2;
        java.lang.String str2;
        java.lang.String str3;
        if (!etVar.f112450p1) {
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "doSendLocationMsg: mounted = false");
            return;
        }
        if (ze2Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "doSendLocationMsg: finderLocation is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "doSendLocationMsg: longitude:" + ze2Var.getFloat(0) + ", latitude:" + ze2Var.getFloat(1) + ", city:" + ze2Var.getString(2));
        if (etVar.M1()) {
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "shop box can not send loc");
            return;
        }
        bm2.m3 m3Var = etVar.L;
        if (m3Var != null) {
            m3Var.y(ze2Var);
        }
        bm2.m3 m3Var2 = etVar.L;
        java.lang.String t17 = (m3Var2 == null || (str2 = m3Var2.f22100i) == null || (str3 = m3Var2.f22099h) == null) ? null : r26.i0.t(str3, "<%@>", str2, false);
        boolean L1 = etVar.L1();
        com.tencent.mm.plugin.finder.live.util.d0 d0Var = com.tencent.mm.plugin.finder.live.util.d0.f115473a;
        if (!L1) {
            if (etVar.K1()) {
                mm2.e0 e0Var = (mm2.e0) etVar.P0(mm2.e0.class);
                r45.qm1 qm1Var = (r45.qm1) e0Var.f328970m.getValue();
                if (qm1Var == null || (str = qm1Var.getString(1)) == null) {
                    str = "";
                }
                r45.qm1 qm1Var2 = new r45.qm1();
                int i17 = qs5.v.f366472a;
                qm1Var2.set(0, 1);
                qm1Var2.set(1, str);
                kotlin.jvm.internal.o.g(etVar.S0(), "liveData");
                r45.ch1 ch1Var = new r45.ch1();
                r45.gj1 gj1Var = new r45.gj1();
                gj1Var.set(0, ze2Var);
                gj1Var.set(1, t17);
                ch1Var.set(4, com.tencent.mm.protobuf.g.b(gj1Var.toByteArray()));
                ch1Var.set(1, 20035);
                ch1Var.set(2, zl2.q4.f473933a.m());
                qm1Var2.getString(1);
                r45.xn1 xn1Var = new r45.xn1();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
                finderContact.setUsername(c01.z1.r());
                gk2.e eVar = gk2.e.f272471n;
                if (eVar == null || (l17 = ((mm2.c1) eVar.a(mm2.c1.class)).B7()) == null) {
                    l17 = c01.z1.l();
                }
                finderContact.setNickname(l17);
                finderContact.setHeadUrl("");
                xn1Var.set(0, finderContact);
                ch1Var.set(13, xn1Var);
                ch1Var.set(8, qm1Var2);
                e0Var.S6(str, ch1Var);
                gk2.e S0 = etVar.S0();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("recommend_comment_type", "3");
                d0Var.b(S0, 20035, t17, hashMap);
                return;
            }
            return;
        }
        ke2.p0 p0Var = ke2.q0.f306981w;
        gk2.e liveData = etVar.S0();
        int S6 = ((mm2.j2) etVar.P0(mm2.j2.class)).S6();
        kotlin.jvm.internal.o.g(liveData, "liveData");
        r45.ch1 ch1Var2 = new r45.ch1();
        r45.gj1 gj1Var2 = new r45.gj1();
        gj1Var2.set(0, ze2Var);
        gj1Var2.set(1, t17);
        ch1Var2.set(4, com.tencent.mm.protobuf.g.b(gj1Var2.toByteArray()));
        ch1Var2.set(10, java.lang.Integer.valueOf(S6));
        ch1Var2.set(9, java.lang.Integer.valueOf(S6 > 0 ? 1 : 0));
        ch1Var2.set(1, 20035);
        ch1Var2.set(2, zl2.q4.f473933a.m());
        r45.xn1 xn1Var2 = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f473950a;
        xn1Var2.set(0, r4Var.m0(liveData));
        xn1Var2.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).f328812h);
        xn1Var2.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var2.set(13, xn1Var2);
        r45.qt2 qt2Var = new r45.qt2();
        km2.n nVar = dk2.ef.H;
        qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f309151c) == null) ? 0 : rVar2.f309206k));
        km2.n nVar2 = dk2.ef.H;
        qt2Var.set(5, java.lang.Integer.valueOf((nVar2 == null || (rVar = nVar2.f309151c) == null) ? 0 : rVar.f309206k));
        new ke2.q0(ch1Var2, etVar.S0(), qt2Var, new com.tencent.mm.plugin.finder.live.plugin.or(etVar)).l();
        etVar.F1 = false;
        dk2.ab abVar = new dk2.ab(ch1Var2);
        r4Var.a(ch1Var2.getString(2), etVar.S0());
        r4Var.k3(abVar, etVar.S0());
        qo0.c.a(etVar.f112448p, qo0.b.N, null, 2, null);
        gk2.e S02 = etVar.S0();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("recommend_comment_type", "3");
        d0Var.c(S02, abVar, hashMap2);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        java.lang.String string = ze2Var.getString(5);
        java.lang.String string2 = ze2Var.getString(3);
        java.lang.String string3 = ze2Var.getString(2);
        r0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (string == null) {
            string = "";
        }
        jSONObject.put("poi_id", string);
        if (string2 == null) {
            string2 = "";
        }
        jSONObject.put("poi_name", string2);
        jSONObject.put("city_name", string3 != null ? string3 : "");
        ml2.r0.hj(r0Var, ml2.b4.f327251n3, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public static final void v1(com.tencent.mm.plugin.finder.live.plugin.et etVar, float f17, float f18) {
        etVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "getPoiCityInfo: longitude:" + f17 + ", latitude:" + f18);
        r45.d64 d64Var = new r45.d64();
        d64Var.f372174d = f17;
        d64Var.f372175e = f18;
        d64Var.f372179i = 0;
        d64Var.f372176f = 1;
        ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, new com.tencent.mm.plugin.finder.live.plugin.qr(etVar, f17, f18));
    }

    public static final void w1(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        etVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "getPoiInfoError");
        android.content.Context context = etVar.R;
        db5.t7.g(context, context.getString(com.tencent.mm.R.string.dle));
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        r0Var.getClass();
        ml2.r0.hj(r0Var, ml2.b4.f327254o3, null, 0L, null, null, null, null, null, 252, null);
    }

    public static final void x1(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        etVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "handlePoiNoPermission");
        ya2.o1 o1Var = (ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class);
        android.content.Context context = etVar.R;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ya2.o1.F2(o1Var, (com.tencent.mm.ui.MMActivity) context, false, 2, null);
        etVar.F1 = true;
    }

    public static final void y1(com.tencent.mm.plugin.finder.live.plugin.et etVar, boolean z17, long j17, java.lang.String str) {
        etVar.getClass();
        if (z17) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.bs(j17, str, etVar));
            etVar.Z = false;
        }
    }

    public static final void z1(com.tencent.mm.plugin.finder.live.plugin.et etVar, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = etVar.f112461y;
        java.lang.String obj = mMEditText.getText().toString();
        int selectionEnd = mMEditText.getSelectionEnd();
        int length = obj.length();
        if (selectionEnd > length) {
            selectionEnd = length;
        }
        int i17 = selectionEnd - 1;
        if (i17 < 0) {
            i17 = 0;
        }
        java.lang.String str3 = kotlin.jvm.internal.o.b(obj.subSequence(i17, selectionEnd).toString(), "@") ? "" : "@";
        if (selectionEnd > obj.length()) {
            selectionEnd = obj.length();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String substring = obj.substring(0, selectionEnd);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append(str3);
        sb6.append(str2);
        sb6.append((char) 8197);
        java.lang.String substring2 = obj.substring(selectionEnd, obj.length());
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        java.lang.String sb7 = sb6.toString();
        int length2 = str3.length() + str2.length() + selectionEnd + 1;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        mMEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(etVar.R, sb7));
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "[inputEt.setText-v3] " + ((java.lang.Object) mMEditText.getText()));
        mMEditText.setSelection(length2);
        if (etVar.f112460x1 == null) {
            etVar.f112460x1 = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = etVar.f112460x1;
        if (arrayList != null) {
            r45.xn1 xn1Var = new r45.xn1();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.setUsername(str);
            finderContact.setNickname(str2);
            xn1Var.set(0, finderContact);
            arrayList.add(new com.tencent.mm.plugin.finder.live.plugin.tq(xn1Var, selectionEnd, length2));
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        if (this.U == this.f112452r) {
            this.P.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 0));
            this.U = 0;
            N1(0);
        } else {
            D1(true);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if ((r0.w0() == 0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.et.C1():void");
    }

    public final void D1(boolean z17) {
        if2.d0 d0Var;
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "changeToPreviewMode: notify=" + z17);
        this.U = 0;
        K0(4);
        com.tencent.mm.plugin.finder.live.plugin.rt rtVar = this.S;
        if (rtVar != null) {
            if (rtVar.f114190i) {
                com.tencent.mm.plugin.finder.live.plugin.mg c17 = rtVar.c();
                if (c17 != null) {
                    c17.K0(0);
                }
                rtVar.f114190i = false;
            }
            df2.ug ugVar = (df2.ug) rtVar.f114185d.U0(df2.ug.class);
            if (ugVar != null && (d0Var = ugVar.f231525p) != null) {
                d0Var.d(0);
            }
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f112461y;
        mMEditText.clearFocus();
        android.view.ViewGroup viewGroup = this.f365323d;
        java.lang.Object systemService = viewGroup.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(mMEditText.getWindowToken(), 0);
        H1(false);
        if (z17) {
            viewGroup.post(new com.tencent.mm.plugin.finder.live.plugin.br(this));
        }
        this.f112465z1 = false;
        this.A1 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.ui.widget.MMEditText, android.widget.TextView] */
    public final void E1() {
        ?? r07;
        mm2.u0 u0Var = (mm2.u0) P0(mm2.u0.class);
        if (u0Var.f329444g) {
            r45.i60 i60Var = u0Var.f329443f;
            if (i60Var != null) {
                r07 = i60Var.getString(1);
            }
            r07 = 0;
        } else {
            r45.i60 i60Var2 = u0Var.f329443f;
            if (i60Var2 != null) {
                r07 = i60Var2.getString(0);
            }
            r07 = 0;
        }
        if (r07 == 0 || r07.length() == 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String concat = I1(this, null, 1, null).concat(":");
            ((ke0.e) xVar).getClass();
            r07 = com.tencent.mm.pluginsdk.ui.span.c0.i(this.R, concat);
        }
        ?? r17 = this.f112461y;
        r17.setHint(r07);
        r17.setText(null);
    }

    public final void F1() {
        if (((mm2.e0) P0(mm2.e0.class)).P6()) {
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "inBox, keep show keyboard");
            E1();
            return;
        }
        P1();
        R1();
        android.content.Context context = this.R;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context).hideVKB();
        D1(true);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void G0(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.G0(i17, permissions, grantResults);
        if (i17 == 80) {
            if (!(!(grantResults.length == 0)) || grantResults[0] == 0) {
                return;
            }
            android.content.Context context = this.R;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (z2.h.b((com.tencent.mm.ui.MMActivity) context, "android.permission.RECORD_AUDIO")) {
                return;
            }
            android.view.ViewGroup viewGroup = this.f365323d;
            db5.e1.C(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.hhn), viewGroup.getContext().getString(com.tencent.mm.R.string.hht), viewGroup.getContext().getString(com.tencent.mm.R.string.g6z), viewGroup.getContext().getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.finder.live.plugin.ds(this), null);
        }
    }

    public final void H1(boolean z17) {
        ((mm2.c1) P0(mm2.c1.class)).N1 = z17;
        qo0.b bVar = qo0.b.Z2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) P0(mm2.c1.class)).N1);
        this.f112448p.statusChange(bVar, bundle);
    }

    public final void J1() {
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = this.Q;
        finderLiveVoiceInputPanel.c();
        com.tencent.mm.ui.widget.MMEditText inputEt = this.f112461y;
        kotlin.jvm.internal.o.f(inputEt, "inputEt");
        finderLiveVoiceInputPanel.setTextArea(inputEt);
        finderLiveVoiceInputPanel.setCloseBtnListener(new com.tencent.mm.plugin.finder.live.plugin.ur(this));
        finderLiveVoiceInputPanel.setCallback(new com.tencent.mm.plugin.finder.live.plugin.wr(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        android.view.ViewGroup viewGroup = this.f365323d;
        if (i17 == 0 && viewGroup.getVisibility() != 0) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            int i18 = this.A1;
            r0Var.ak(1, 1, i18 != 0 ? kz5.b1.e(new jz5.l(ya.b.SOURCE, java.lang.String.valueOf(i18))) : null);
            ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(1, 2, kz5.b1.e(new jz5.l(ya.b.SOURCE, "0")));
            ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(1, 6, kz5.b1.e(new jz5.l(ya.b.SOURCE, "0")));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ml2.r0) c17).ak(1, 11, null);
            Z1();
        }
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            viewGroup.setVisibility(8);
            com.tencent.mars.xlog.Log.w("Finder.LiveInputPlugin", "setVisible return for isTeenMode");
            return;
        }
        android.view.ViewParent parent = viewGroup.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            android.content.Context context = this.R;
            viewGroup2.setBackgroundColor(i17 == 0 ? context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_6) : context.getResources().getColor(com.tencent.mm.R.color.a9e));
        }
        super.K0(i17);
    }

    public final boolean K1() {
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) P0(mm2.e0.class)).f328970m.getValue();
        if (qm1Var == null) {
            return false;
        }
        int integer = qm1Var.getInteger(0);
        int i17 = qs5.v.f366472a;
        return integer == 1;
    }

    public final boolean L1() {
        return (K1() || M1()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x0375, code lost:
    
        if (r3 == null) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06bf  */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r41, android.os.Bundle r42) {
        /*
            Method dump skipped, instructions count: 2715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.et.M0(qo0.b, android.os.Bundle):void");
    }

    public final boolean M1() {
        df2.xw xwVar = (df2.xw) U0(df2.xw.class);
        if (xwVar != null) {
            return xwVar.f231815s;
        }
        return false;
    }

    public final void N1(int i17) {
        android.content.Context context = this.R;
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "[layoutInputView] isLandscape=" + x0() + " height=" + i17 + " navBarHeight=" + com.tencent.mm.ui.bl.c(context));
        if (this.f365323d.getContext() instanceof android.app.Activity) {
            android.view.View view = this.f112458x;
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = k0Var instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) k0Var : null;
            boolean isPresentedInTimeLineUI = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getIsPresentedInTimeLineUI() : false;
            if (x0()) {
                layoutParams2.bottomMargin = i17;
            } else {
                layoutParams2.bottomMargin = !isPresentedInTimeLineUI ? com.tencent.mm.ui.bl.c(context) + i17 : i17;
            }
            view.setLayoutParams(layoutParams);
            C1();
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, i17);
            if (x0()) {
                layoutParams3.setMarginEnd(com.tencent.mm.ui.bl.c(context));
            } else {
                layoutParams3.bottomMargin = isPresentedInTimeLineUI ? 0 : com.tencent.mm.ui.bl.c(context);
            }
            com.tencent.mm.api.SmileyPanel smileyPanel = this.P;
            smileyPanel.setLayoutParams(layoutParams3);
            if (smileyPanel.getParent() == null) {
                this.f112456v.addView(smileyPanel, layoutParams3);
            }
            com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = this.Q;
            finderLiveVoiceInputPanel.setLayoutParams(layoutParams3);
            if (finderLiveVoiceInputPanel.getParent() == null) {
                this.f112457w.addView(finderLiveVoiceInputPanel, layoutParams3);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        androidx.lifecycle.o mo133getLifecycle;
        super.O0();
        this.P.setOnTextOperationListener(null);
        android.view.ViewParent viewParent = this.P;
        androidx.lifecycle.v vVar = viewParent instanceof androidx.lifecycle.v ? (androidx.lifecycle.v) viewParent : null;
        if (vVar != null) {
            android.content.Context context = this.R;
            androidx.fragment.app.FragmentActivity fragmentActivity = context instanceof androidx.fragment.app.FragmentActivity ? (androidx.fragment.app.FragmentActivity) context : null;
            if (fragmentActivity != null && (mo133getLifecycle = fragmentActivity.mo133getLifecycle()) != null) {
                mo133getLifecycle.c(vVar);
                com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "removeObserver");
            }
        }
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = this.Q;
        com.tencent.mars.xlog.Log.i(finderLiveVoiceInputPanel.f136763d, "destroy");
        finderLiveVoiceInputPanel.d();
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = finderLiveVoiceInputPanel.f136764e;
        if (finderLiveVoiceInputLayout != null) {
            finderLiveVoiceInputLayout.setVoiceDetectListener(null);
        }
        finderLiveVoiceInputPanel.f136764e = null;
        if (finderLiveVoiceInputPanel.f136782z != null && finderLiveVoiceInputPanel.mPhoneStateListener != null) {
            ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).Di(finderLiveVoiceInputPanel.mPhoneStateListener);
            iy2.t tVar = finderLiveVoiceInputPanel.mPhoneStateListener;
            if (tVar != null) {
                tVar.f295908a = null;
            }
            finderLiveVoiceInputPanel.mPhoneStateListener = null;
        }
        finderLiveVoiceInputPanel.f136782z = null;
        java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(finderLiveVoiceInputPanel.C, finderLiveVoiceInputPanel.A);
        if (num != null) {
            int intValue = num.intValue();
            iy2.c cVar = finderLiveVoiceInputPanel.f136781y;
            if (cVar != null) {
                synchronized (cVar) {
                    iy2.c.f295883j = intValue;
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINOF_FINDER_LIVE_VOICE_INPUT_DEF_LANG_HISTORY_INT_SYNC, java.lang.Integer.valueOf(iy2.c.f295883j));
                }
            }
        }
        android.view.View findViewById = finderLiveVoiceInputPanel.findViewById(com.tencent.mm.R.id.p5x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl finderLiveVoiceInputLayoutImpl = (com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl) findViewById;
        com.tencent.mars.xlog.Log.i(finderLiveVoiceInputPanel.f136763d, "voiceInputLayout do stop!");
        finderLiveVoiceInputLayoutImpl.b();
        com.tencent.mm.sdk.platformtools.n3 mmHandler = finderLiveVoiceInputLayoutImpl.getMmHandler();
        if (mmHandler != null) {
            mmHandler.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.n3 callUiHandler = finderLiveVoiceInputLayoutImpl.getCallUiHandler();
        if (callUiHandler != null) {
            callUiHandler.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.b4 amplitudeTimer = finderLiveVoiceInputLayoutImpl.getAmplitudeTimer();
        if (amplitudeTimer != null) {
            amplitudeTimer.d();
        }
        this.f112450p1 = false;
    }

    public final void P1() {
        Q1(this.P);
        android.graphics.drawable.Drawable drawable = this.f365323d.getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_sticker);
        com.tencent.mm.ui.uk.f(drawable, -1);
        this.A.setImageDrawable(drawable);
        this.U = 0;
    }

    public final void Q1(android.view.View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        view.animate().alpha(0.0f).setDuration(220L).setListener(new com.tencent.mm.plugin.finder.live.plugin.cs(view)).start();
    }

    public final void R1() {
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputPanel finderLiveVoiceInputPanel = this.Q;
        Q1(finderLiveVoiceInputPanel);
        iy2.r rVar = finderLiveVoiceInputPanel.f136770n;
        java.lang.String str = finderLiveVoiceInputPanel.f136763d;
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i(str, "closePanel onClearBtnDown");
            if (finderLiveVoiceInputPanel.f136774r != 0) {
                finderLiveVoiceInputPanel.f136774r = 0L;
            }
        }
        android.widget.TextView textView = finderLiveVoiceInputPanel.f136768i;
        if (textView != null) {
            textView.setVisibility(finderLiveVoiceInputPanel.C.size() < 2 ? 8 : 0);
        }
        com.tencent.mars.xlog.Log.i(str, "pause");
        com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayout finderLiveVoiceInputLayout = finderLiveVoiceInputPanel.f136764e;
        if (finderLiveVoiceInputLayout != null) {
            finderLiveVoiceInputLayout.a();
        }
        android.graphics.drawable.Drawable drawable = this.f365323d.getContext().getResources().getDrawable(com.tencent.mm.R.raw.voice_input_filled);
        com.tencent.mm.ui.uk.f(drawable, -1);
        this.C.setImageDrawable(drawable);
        this.U = 0;
    }

    public final void T1(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "onShowPanel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "onShowPanel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "onShowPanel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin", "onShowPanel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.animate().alpha(1.0f).setDuration(220L).setListener(null).start();
    }

    public final void U1() {
        if (c01.e2.a0()) {
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "ignore getLocation as wechat user");
            return;
        }
        if (this.C1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "preloadLocationForFastCommentItem");
        this.C1 = true;
        com.tencent.mm.plugin.finder.live.plugin.hs hsVar = new com.tencent.mm.plugin.finder.live.plugin.hs(this);
        com.tencent.mm.plugin.finder.live.plugin.ks ksVar = new com.tencent.mm.plugin.finder.live.plugin.ks(this);
        com.tencent.mm.plugin.finder.live.plugin.ls lsVar = new com.tencent.mm.plugin.finder.live.plugin.ls(this);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            hsVar.invoke();
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            lsVar.invoke();
        } else {
            ksVar.invoke();
        }
    }

    public final void V1(bm2.j3 j3Var, int i17) {
        java.lang.String str;
        if (M1()) {
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "shop box can not send loc");
            return;
        }
        if (j3Var != null) {
            java.lang.String str2 = j3Var.f22005a;
            long a17 = c01.id.a();
            if (a17 - j3Var.f22007c <= I1) {
                com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "checkIfCanSendLocationMsg: too fast, currentTime:" + a17 + ", lastPoiSendTime:" + j3Var.f22007c);
                android.content.Context context = this.R;
                db5.t7.g(context, context.getString(com.tencent.mm.R.string.dld));
                return;
            }
            j3Var.f22007c = a17;
            boolean L1 = L1();
            com.tencent.mm.plugin.finder.live.util.d0 d0Var = com.tencent.mm.plugin.finder.live.util.d0.f115473a;
            int i18 = j3Var.f22008d;
            if (L1) {
                long j17 = this.f112449p0;
                boolean z17 = this.Z;
                java.lang.String m17 = zl2.q4.f473933a.m();
                dk2.q4.f233938a.e(this.R, S0(), ek2.r0.f253519y.a(str2, 1, i17), m17, new com.tencent.mm.plugin.finder.live.plugin.qs(this, str2, z17, j17, m17));
                zl2.r4 r4Var = zl2.r4.f473950a;
                java.lang.String I12 = I1(this, null, 1, null);
                gk2.e liveData = S0();
                kotlin.jvm.internal.o.g(liveData, "liveData");
                r45.t12 t12Var = new r45.t12();
                r45.xn1 xn1Var = new r45.xn1();
                xn1Var.set(0, r4Var.m0(liveData));
                xn1Var.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).e7());
                xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
                t12Var.set(8, xn1Var);
                t12Var.set(2, str2);
                t12Var.set(3, 1000066);
                t12Var.set(13, java.lang.Integer.valueOf(i17));
                t12Var.set(12, java.lang.Integer.valueOf(t12Var.getInteger(13) > 0 ? 1 : 0));
                t12Var.set(6, t12Var.getString(6));
                t12Var.set(0, I12);
                dk2.mf mfVar = new dk2.mf(t12Var);
                r4Var.k3(mfVar, S0());
                qo0.c.a(this.f112448p, qo0.b.N, null, 2, null);
                gk2.e S0 = S0();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("recommend_comment_type", java.lang.String.valueOf(j3Var.d()));
                hashMap.put("quick_comment_type", java.lang.String.valueOf(i18));
                d0Var.c(S0, mfVar, hashMap);
            } else if (K1()) {
                mm2.e0 e0Var = (mm2.e0) P0(mm2.e0.class);
                r45.qm1 qm1Var = (r45.qm1) e0Var.f328970m.getValue();
                if (qm1Var == null || (str = qm1Var.getString(1)) == null) {
                    str = "";
                }
                r45.qm1 qm1Var2 = new r45.qm1();
                int i19 = qs5.v.f366472a;
                qm1Var2.set(0, 1);
                qm1Var2.set(1, str);
                e0Var.S6(str, com.tencent.mm.plugin.finder.live.util.x.f115742a.d(qm1Var2, str2));
                gk2.e S02 = S0();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("recommend_comment_type", java.lang.String.valueOf(j3Var.d()));
                hashMap2.put("quick_comment_type", java.lang.String.valueOf(i18));
                d0Var.b(S02, 1000066, str2, hashMap2);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_room_fastcomment_event", this.K, null, 25561);
    }

    public final void W1(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "setInputEtFilter maxTextNum:" + i17);
        this.f112461y.setFilters(new android.text.InputFilter[]{com.tencent.mm.plugin.finder.live.plugin.us.f114617d, new com.tencent.mm.plugin.finder.live.plugin.vs(i17, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2)});
    }

    public final void X1() {
        T1(this.P);
        R1();
        android.content.Context context = this.R;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context).hideVKB();
        N1(this.f112459x0);
        android.graphics.drawable.Drawable drawable = this.f365323d.getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_keyboard);
        com.tencent.mm.ui.uk.f(drawable, -1);
        this.A.setImageDrawable(drawable);
        this.U = this.f112453s;
    }

    public final void Y1(long j17, java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        pm0.v.V(j17, new com.tencent.mm.plugin.finder.live.plugin.ct(this, scene));
    }

    public final void Z1() {
        java.util.ArrayList arrayList;
        ol2.b bVar = this.M;
        if (bVar == null || (arrayList = bVar.f346143a) == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (z17) {
                    arrayList.removeAll(kz5.n0.X0(arrayList2));
                } else {
                    bm2.m3 m3Var = this.L;
                    if (m3Var != null) {
                        m3Var.x(null);
                    }
                }
                bm2.m3 m3Var2 = this.L;
                if (m3Var2 != null) {
                    ol2.b bVar2 = this.M;
                    m3Var2.z(arrayList, bVar2 != null ? bVar2.f346144b : null);
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = this.K;
                if (recyclerView != null) {
                    recyclerView.post(new com.tencent.mm.plugin.finder.live.plugin.dt(this));
                    return;
                }
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ol2.c cVar = (ol2.c) next;
            java.lang.String str = cVar.f346145a;
            if ((str != null ? r26.n0.B(str, "<%@>", false) : false) && i17 == arrayList.size() - 1) {
                bm2.m3 m3Var3 = this.L;
                if (m3Var3 != null) {
                    m3Var3.x(cVar.f346145a);
                }
                arrayList2.add(cVar);
                z17 = true;
            }
            i17 = i18;
        }
    }

    public final void a2(r45.o92 o92Var) {
        java.util.ArrayList arrayList;
        ol2.b a17 = ol2.b.f346142c.a(o92Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("quickReplyInfo pre models:");
        ol2.b bVar = this.M;
        sb6.append((bVar == null || (arrayList = bVar.f346143a) == null) ? null : java.lang.Integer.valueOf(arrayList.size()));
        sb6.append(", new models:");
        java.util.ArrayList arrayList2 = a17.f346143a;
        sb6.append(arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", sb6.toString());
        this.M = a17;
        if (w0() == 0) {
            Z1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    @Override // qo0.a
    public void y0(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "show:" + z17 + ", height:" + i17 + ", curMode:" + this.U);
        if (i17 > 0 && i17 != this.f112459x0) {
            this.f112459x0 = i17;
        }
        int i18 = this.f112451q;
        if (z17) {
            R1();
            P1();
            N1(i17);
            this.U = i18;
            return;
        }
        int i19 = this.U;
        if (i19 == i18 || i19 == 0) {
            this.U = 0;
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
            this.P.setLayoutParams(layoutParams);
            this.Q.setLayoutParams(layoutParams);
            N1(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.o mo133getLifecycle;
        super.z0();
        com.tencent.mm.api.SmileyPanel smileyPanel = this.P;
        smileyPanel.setOnTextOperationListener(new com.tencent.mm.plugin.finder.live.plugin.sr(this));
        androidx.lifecycle.v vVar = smileyPanel instanceof androidx.lifecycle.v ? (androidx.lifecycle.v) smileyPanel : null;
        android.content.Context context = this.R;
        if (vVar != null) {
            androidx.fragment.app.FragmentActivity fragmentActivity = context instanceof androidx.fragment.app.FragmentActivity ? (androidx.fragment.app.FragmentActivity) context : null;
            if (fragmentActivity != null && (mo133getLifecycle = fragmentActivity.mo133getLifecycle()) != null) {
                mo133getLifecycle.a(vVar);
                com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "addObserver");
            }
        }
        this.f112450p1 = true;
        android.widget.TextView textView = this.f112464z;
        android.text.Layout.getDesiredWidth(textView.getText(), textView.getPaint());
        com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479727dj);
        textView.getPaddingStart();
        textView.getPaddingEnd();
        df2.d4 d4Var = (df2.d4) U0(df2.d4.class);
        if (d4Var != null && (j0Var = d4Var.f229941p) != null) {
            j0Var.observe(this, new com.tencent.mm.plugin.finder.live.plugin.yr(this));
        }
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((mm2.u0) P0(mm2.u0.class)).f329446i;
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.zr(this));
        J1();
    }
}
