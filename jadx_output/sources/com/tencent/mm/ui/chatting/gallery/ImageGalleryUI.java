package com.tencent.mm.ui.chatting.gallery;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX)
@gm0.a2
@ul5.d(0)
/* loaded from: classes3.dex */
public class ImageGalleryUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity implements android.view.View.OnClickListener, g04.h, cd0.i {

    /* renamed from: p4, reason: collision with root package name */
    public static final /* synthetic */ int f200588p4 = 0;
    public android.view.View A1;
    public int A3;
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView B1;
    public int B3;
    public android.view.View C1;
    public android.view.View C3;
    public android.widget.Button D1;
    public final wa5.a D3;
    public android.view.View E1;
    public boolean E2;
    public final com.tencent.mm.ui.chatting.gallery.n8 E3;
    public android.view.View F1;
    public java.lang.String F3;
    public android.view.View G1;
    public com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection G3;
    public android.widget.LinearLayout H1;
    public int H2;
    public zh1.z0 H3;
    public android.widget.TextView I1;
    public g04.j I2;
    public com.tencent.mm.ui.chatting.gallery.o8 I3;
    public android.widget.TextView J1;
    public volatile int J2;
    public com.tencent.mm.modelmulti.WxaInfo J3;
    public android.view.View K1;
    public boolean K2;
    public java.lang.String K3;
    public com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar L1;
    public final db5.t4 L3;
    public android.view.View M;
    public android.widget.LinearLayout M1;
    public final db5.t4 M3;
    public android.graphics.drawable.Drawable N;
    public android.widget.LinearLayout N1;
    public android.os.Bundle N2;
    public final com.tencent.mm.sdk.event.IListener N3;
    public android.view.View O1;
    public long O2;
    public int O3;
    public android.widget.Button P;
    public long P1;
    public boolean P3;
    public android.widget.Button Q;
    public long Q1;
    public boolean Q2;
    public boolean Q3;
    public android.widget.TextView R;
    public android.view.View R1;
    public android.widget.ImageView R2;
    public boolean R3;
    public android.view.View S;
    public boolean S1;
    public android.widget.ImageView S2;
    public float S3;
    public android.widget.Button T;
    public android.view.View T1;
    public android.widget.ImageView T2;
    public int T3;
    public android.view.View U;
    public android.view.View U1;
    public android.animation.ValueAnimator U2;
    public final java.util.Map U3;
    public android.view.View V;
    public boolean V1;
    public final androidx.viewpager.widget.ViewPager.OnPageChangeListener V3;
    public android.view.View W;
    public android.widget.ImageView W1;
    public android.view.View W3;
    public android.widget.TextView X;
    public com.tencent.mm.ui.widget.TouchMediaPreviewLayout X1;
    public android.widget.TextView X3;
    public com.tencent.mm.ui.chatting.gallery.view.FullScreenStatusMaskView Y;
    public com.tencent.mm.pluginsdk.model.m2 Y1;
    public android.widget.TextView Y3;
    public int Z1;
    public kd0.p2 Z2;
    public com.tencent.mm.ui.widget.MMNeat7extView Z3;

    /* renamed from: a2, reason: collision with root package name */
    public int f200590a2;

    /* renamed from: a4, reason: collision with root package name */
    public android.view.View f200592a4;

    /* renamed from: b4, reason: collision with root package name */
    public android.view.View f200595b4;

    /* renamed from: c4, reason: collision with root package name */
    public android.widget.ImageView f200598c4;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f200599d;

    /* renamed from: d4, reason: collision with root package name */
    public android.widget.ImageView f200602d4;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f200603e;

    /* renamed from: e3, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.q3 f200605e3;

    /* renamed from: e4, reason: collision with root package name */
    public android.view.View f200606e4;

    /* renamed from: f, reason: collision with root package name */
    public boolean f200607f;

    /* renamed from: f4, reason: collision with root package name */
    public android.view.View f200610f4;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.k1 f200611g;

    /* renamed from: g3, reason: collision with root package name */
    public db5.d8 f200613g3;

    /* renamed from: g4, reason: collision with root package name */
    public boolean f200614g4;

    /* renamed from: h, reason: collision with root package name */
    public long f200615h;

    /* renamed from: h4, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f200618h4;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.media.n0 f200619i;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f200620i2;

    /* renamed from: i4, reason: collision with root package name */
    public final java.util.HashMap f200622i4;

    /* renamed from: j2, reason: collision with root package name */
    public int f200623j2;

    /* renamed from: j4, reason: collision with root package name */
    public final ym5.w1 f200625j4;

    /* renamed from: k4, reason: collision with root package name */
    public boolean f200628k4;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.u f200629l1;

    /* renamed from: l4, reason: collision with root package name */
    public boolean f200632l4;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.f2 f200633m;

    /* renamed from: m2, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f200634m2;

    /* renamed from: m4, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f200636m4;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMViewPager f200637n;

    /* renamed from: n2, reason: collision with root package name */
    public com.tencent.mm.ui.tools.a4 f200638n2;

    /* renamed from: n4, reason: collision with root package name */
    public final java.util.HashSet f200640n4;

    /* renamed from: o, reason: collision with root package name */
    public lc5.p f200641o;

    /* renamed from: o3, reason: collision with root package name */
    public final sy3.d f200643o3;

    /* renamed from: o4, reason: collision with root package name */
    public boolean f200644o4;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f200646p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.view.View f200647p1;

    /* renamed from: p3, reason: collision with root package name */
    public final sy3.e f200649p3;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout f200650q;

    /* renamed from: q2, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f200651q2;

    /* renamed from: q3, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f200652q3;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f200653r;

    /* renamed from: r2, reason: collision with root package name */
    public long f200654r2;

    /* renamed from: r3, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.l8 f200655r3;

    /* renamed from: s, reason: collision with root package name */
    public boolean f200656s;

    /* renamed from: s3, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f200658s3;

    /* renamed from: t, reason: collision with root package name */
    public boolean f200659t;

    /* renamed from: t3, reason: collision with root package name */
    public int f200661t3;

    /* renamed from: u, reason: collision with root package name */
    public boolean f200662u;

    /* renamed from: u3, reason: collision with root package name */
    public android.view.View f200664u3;

    /* renamed from: v3, reason: collision with root package name */
    public android.widget.CheckBox f200667v3;

    /* renamed from: w2, reason: collision with root package name */
    public oc5.g0 f200669w2;

    /* renamed from: w3, reason: collision with root package name */
    public android.view.View f200670w3;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f200672x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f200673x1;

    /* renamed from: x3, reason: collision with root package name */
    public boolean f200675x3;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f200677y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.View f200678y1;

    /* renamed from: y3, reason: collision with root package name */
    public long f200680y3;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f200682z1;

    /* renamed from: z2, reason: collision with root package name */
    public boolean f200683z2;

    /* renamed from: z3, reason: collision with root package name */
    public float f200684z3;

    /* renamed from: p, reason: collision with root package name */
    public boolean f200645p = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f200665v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f200668w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f200671x = true;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.l3 f200676y = new com.tencent.mm.ui.chatting.gallery.l3();

    /* renamed from: z, reason: collision with root package name */
    public int f200681z = 0;
    public int A = 0;
    public int B = 0;
    public int C = 0;
    public long D = 0;
    public java.lang.String E = "";
    public android.graphics.Bitmap F = null;
    public boolean G = false;
    public int H = 0;
    public android.view.View I = null;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f200589J = false;
    public volatile java.lang.String K = null;
    public volatile boolean L = false;
    public boolean Z = false;

    /* renamed from: b2, reason: collision with root package name */
    public int f200593b2 = 0;

    /* renamed from: c2, reason: collision with root package name */
    public int f200596c2 = 0;

    /* renamed from: d2, reason: collision with root package name */
    public int f200600d2 = 0;

    /* renamed from: e2, reason: collision with root package name */
    public int f200604e2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public int f200608f2 = 0;

    /* renamed from: g2, reason: collision with root package name */
    public int f200612g2 = 0;

    /* renamed from: h2, reason: collision with root package name */
    public int f200616h2 = 0;

    /* renamed from: k2, reason: collision with root package name */
    public android.view.View f200626k2 = null;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f200630l2 = false;

    /* renamed from: o2, reason: collision with root package name */
    public boolean f200642o2 = false;

    /* renamed from: p2, reason: collision with root package name */
    public boolean f200648p2 = false;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f200657s2 = false;

    /* renamed from: t2, reason: collision with root package name */
    public long f200660t2 = 0;

    /* renamed from: u2, reason: collision with root package name */
    public final oc5.l0 f200663u2 = new oc5.l0();

    /* renamed from: v2, reason: collision with root package name */
    public java.lang.String f200666v2 = null;

    /* renamed from: x2, reason: collision with root package name */
    public oc5.m f200674x2 = new oc5.m();

    /* renamed from: y2, reason: collision with root package name */
    public int f200679y2 = 0;
    public boolean A2 = false;
    public boolean B2 = false;
    public boolean C2 = false;
    public boolean D2 = false;
    public boolean F2 = false;
    public int G2 = -1;
    public int L2 = 0;
    public int M2 = 0;
    public java.lang.String P2 = null;
    public java.lang.Long V2 = 0L;
    public java.lang.Long W2 = 0L;
    public java.lang.Long X2 = 0L;
    public boolean Y2 = true;

    /* renamed from: a3, reason: collision with root package name */
    public final oc5.d f200591a3 = new oc5.d();

    /* renamed from: b3, reason: collision with root package name */
    public com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest f200594b3 = null;

    /* renamed from: c3, reason: collision with root package name */
    public android.widget.FrameLayout f200597c3 = null;

    /* renamed from: d3, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f200601d3 = null;

    /* renamed from: f3, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.g2 f200609f3 = null;

    /* renamed from: h3, reason: collision with root package name */
    public final java.lang.Runnable f200617h3 = new com.tencent.mm.ui.chatting.gallery.e5(this);

    /* renamed from: i3, reason: collision with root package name */
    public final java.lang.Runnable f200621i3 = new com.tencent.mm.ui.chatting.gallery.p5(this);

    /* renamed from: j3, reason: collision with root package name */
    public final oc5.n f200624j3 = new com.tencent.mm.ui.chatting.gallery.f6(this);

    /* renamed from: k3, reason: collision with root package name */
    public final oc5.o f200627k3 = new com.tencent.mm.ui.chatting.gallery.p6(this);

    /* renamed from: l3, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.fb f200631l3 = new com.tencent.mm.ui.chatting.gallery.b7(this);

    /* renamed from: m3, reason: collision with root package name */
    public long f200635m3 = 0;

    /* renamed from: n3, reason: collision with root package name */
    public sy3.c f200639n3 = null;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$62, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass62 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanTranslationResultEvent> {
        public AnonymousClass62(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1699517927;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
            com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent2 = scanTranslationResultEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "scanTranslationResult %d, %s", java.lang.Integer.valueOf(scanTranslationResultEvent2.f54739g.f6400a), java.lang.Boolean.valueOf(scanTranslationResultEvent2.f54739g.f6402c));
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.gallery.g7(this, scanTranslationResultEvent2));
            return true;
        }
    }

    public ImageGalleryUI() {
        ((yz3.q) ((ty3.e) i95.n0.c(ty3.e.class))).getClass();
        this.f200643o3 = new kz3.o();
        this.f200649p3 = new com.tencent.mm.ui.chatting.gallery.q7(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f200652q3 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.7
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent2 = changeTranslateLanguageEvent;
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this;
                com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = imageGalleryUI.f200594b3;
                java.lang.String str = settingsTranslateLanguageRequest == null ? null : settingsTranslateLanguageRequest.f67822e;
                com.tencent.mm.storage.f9 w17 = imageGalleryUI.f200611g.w();
                java.lang.String valueOf = w17 == null ? null : java.lang.String.valueOf(w17.getMsgId());
                java.lang.String x27 = imageGalleryUI.x2();
                java.lang.String str2 = valueOf + x27;
                java.lang.Boolean A = imageGalleryUI.f200611g.A(w17);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "changeTransLangListener, eventSessionId: " + changeTranslateLanguageEvent2.f54035g.f8502a + ", requestSessionId: " + str + ", currentMsgId: " + valueOf + ", currentImgPath: " + x27 + ", currentMsgTranslateStatus: " + A);
                if (str != null && android.text.TextUtils.equals(str, changeTranslateLanguageEvent2.f54035g.f8502a) && android.text.TextUtils.equals(str, str2) && java.lang.Boolean.TRUE.equals(A)) {
                    imageGalleryUI.f200594b3 = null;
                    if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(imageGalleryUI.getContext(), null)) {
                        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.X6(imageGalleryUI, false);
                    }
                }
                return false;
            }
        };
        this.f200658s3 = new com.tencent.mm.ui.chatting.gallery.i8(this);
        this.f200661t3 = -1;
        this.f200675x3 = true;
        this.f200684z3 = 1.0f;
        this.A3 = 0;
        this.B3 = 0;
        new com.tencent.mm.ui.chatting.gallery.y5(this);
        this.D3 = new com.tencent.mm.ui.chatting.gallery.z5(this);
        this.E3 = new com.tencent.mm.ui.chatting.gallery.n8(this, null);
        this.F3 = null;
        this.G3 = null;
        this.H3 = null;
        this.I3 = null;
        this.J3 = null;
        this.K3 = null;
        this.L3 = new db5.t4() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$m
            @Override // db5.t4
            public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                int i18 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this;
                imageGalleryUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "enhance menu item click %d", java.lang.Integer.valueOf(i17));
                imageGalleryUI.C8(false);
            }
        };
        this.M3 = new com.tencent.mm.ui.chatting.gallery.w6(this);
        this.N3 = new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.AnonymousClass62(a0Var);
        this.O3 = 0;
        this.P3 = false;
        this.Q3 = true;
        this.R3 = false;
        this.S3 = -1.0f;
        this.T3 = 0;
        this.U3 = new java.util.concurrent.ConcurrentHashMap();
        this.V3 = new com.tencent.mm.ui.chatting.gallery.h7(this);
        this.W3 = null;
        this.f200606e4 = null;
        this.f200610f4 = null;
        this.f200614g4 = false;
        this.f200618h4 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.ui.chatting.gallery.p7(this), false);
        this.f200622i4 = new java.util.HashMap();
        this.f200625j4 = new com.tencent.mm.ui.chatting.gallery.r7(this);
        this.f200628k4 = false;
        this.f200632l4 = false;
        this.f200636m4 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f200640n4 = new java.util.HashSet();
        this.f200644o4 = false;
    }

    public static void V6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        if (imageGalleryUI.f200597c3 == null) {
            imageGalleryUI.f200597c3 = (android.widget.FrameLayout) imageGalleryUI.findViewById(com.tencent.mm.R.id.tzh);
        }
        if (imageGalleryUI.f200601d3 == null) {
            imageGalleryUI.f200601d3 = (com.tencent.mm.view.MMPAGView) imageGalleryUI.findViewById(com.tencent.mm.R.id.tzf);
            imageGalleryUI.f200601d3.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxChatSwitch()) == 1);
        }
        try {
            com.tencent.mm.view.MMPAGView mMPAGView = imageGalleryUI.f200601d3;
            if (mMPAGView != null) {
                mMPAGView.i(imageGalleryUI.f200625j4);
                imageGalleryUI.f200601d3.n();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.ui.base.MMViewPager mMViewPager = imageGalleryUI.f200637n;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(true);
            imageGalleryUI.f200671x = true;
        }
        android.widget.FrameLayout frameLayout = imageGalleryUI.f200597c3;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public static void W6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        int i17;
        com.tencent.mm.ui.chatting.gallery.q3 q3Var = imageGalleryUI.f200605e3;
        if (q3Var != null) {
            q3Var.f201296e = true;
            android.util.SparseArray sparseArray = q3Var.f201292a;
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                sparseArray.keyAt(i18);
                ((com.tencent.mm.ui.chatting.gallery.g4) sparseArray.valueAt(i18)).h();
            }
            return;
        }
        int c17 = com.tencent.mm.ui.bl.c(imageGalleryUI);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "%d handleVerticalUI image gallery ui isNavigationBarTint %b navBarHeight %d", java.lang.Integer.valueOf(imageGalleryUI.hashCode()), java.lang.Boolean.valueOf(imageGalleryUI.f200656s), java.lang.Integer.valueOf(c17));
        android.view.View view = imageGalleryUI.W3;
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, 0, 0);
            imageGalleryUI.W3.setLayoutParams(layoutParams);
        }
        int f17 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479738dv);
        int f18 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479688cn);
        int f19 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479688cn);
        int f27 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479672c9);
        boolean H = com.tencent.mm.ui.chatting.gallery.ja.H();
        int f28 = i65.a.f(imageGalleryUI, H ? com.tencent.mm.R.dimen.f479693cs : com.tencent.mm.R.dimen.f479704cz);
        int i19 = f17 * 2;
        imageGalleryUI.f200650q.setPadding(0, i19, 0, i19 + c17);
        imageGalleryUI.f200606e4.setPadding(f18, f17, f18, f17);
        imageGalleryUI.B = f27;
        imageGalleryUI.C = f18;
        imageGalleryUI.V7();
        if (imageGalleryUI.O1 == null) {
            return;
        }
        imageGalleryUI.V7();
        int id6 = imageGalleryUI.O1.getId();
        if (H) {
            imageGalleryUI.U7();
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = imageGalleryUI.L1;
            if (redesignVideoPlayerSeekBar instanceof com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) {
                ((com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) redesignVideoPlayerSeekBar).setVertical(true);
            }
            i17 = 12;
        } else {
            i17 = 15;
        }
        imageGalleryUI.U7();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.L1.getLayoutParams();
        layoutParams2.removeRule(1);
        layoutParams2.removeRule(0);
        int i27 = com.tencent.mm.R.dimen.f479683ci;
        if (H) {
            layoutParams2.removeRule(2);
            layoutParams2.setMargins(0, 0, 0, 0);
            imageGalleryUI.U7();
            imageGalleryUI.L1.setPadding(f18, 0, f18, 0);
            imageGalleryUI.U7();
            imageGalleryUI.L1.setClipToPadding(false);
            imageGalleryUI.U7();
            imageGalleryUI.L1.setClipChildren(false);
            imageGalleryUI.U7();
            imageGalleryUI.L1.setLayoutParams(layoutParams2);
            imageGalleryUI.U7();
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.R1.getLayoutParams();
            layoutParams3.height = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479683ci);
            imageGalleryUI.U7();
            imageGalleryUI.R1.setLayoutParams(layoutParams3);
        } else {
            layoutParams2.setMargins(f18, f28, f18, 0);
            imageGalleryUI.U7();
            imageGalleryUI.L1.setLayoutParams(layoutParams2);
        }
        imageGalleryUI.U7();
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.U1.getLayoutParams();
        if (!H) {
            i27 = com.tencent.mm.R.dimen.f479669c6;
        }
        layoutParams4.height = i65.a.h(imageGalleryUI, i27);
        layoutParams4.bottomMargin = c17;
        imageGalleryUI.U7();
        imageGalleryUI.U1.setLayoutParams(layoutParams4);
        if (H) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) imageGalleryUI.X.getParent();
            if (!viewGroup.equals(imageGalleryUI.f200650q)) {
                viewGroup.removeView(imageGalleryUI.X);
                imageGalleryUI.f200650q.addView(imageGalleryUI.X);
            }
        } else {
            ((android.widget.RelativeLayout.LayoutParams) imageGalleryUI.X.getLayoutParams()).setMargins(0, i19, f18, 0);
        }
        imageGalleryUI.V7();
        android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.O1.getLayoutParams();
        layoutParams5.removeRule(i17);
        layoutParams5.removeRule(2);
        if (H) {
            layoutParams5.addRule(3, com.tencent.mm.R.id.s_i);
        } else {
            layoutParams5.addRule(3, com.tencent.mm.R.id.ozz);
        }
        i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479738dv);
        layoutParams5.setMargins(0, 0, 0, 0);
        imageGalleryUI.V7();
        imageGalleryUI.O1.setLayoutParams(layoutParams5);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.M.getLayoutParams();
        layoutParams6.addRule(3, id6);
        layoutParams6.setMargins(f18, 0, 0, 0);
        layoutParams6.removeRule(i17);
        imageGalleryUI.M.setLayoutParams(layoutParams6);
        if (H) {
            android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.X.getLayoutParams();
            layoutParams7.removeRule(2);
            layoutParams7.removeRule(6);
            layoutParams7.removeRule(12);
            layoutParams7.removeRule(21);
            layoutParams7.addRule(3, id6);
            if (java.lang.Math.round(imageGalleryUI.X.getTextSize()) == 0) {
                imageGalleryUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479673ca);
            }
            layoutParams7.setMargins(f18, 0, 0, 0);
            imageGalleryUI.X.setLayoutParams(layoutParams7);
            imageGalleryUI.X.setPadding(0, 0, 0, 0);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.T.getLayoutParams();
        layoutParams8.addRule(3, id6);
        layoutParams8.setMargins(f27, f28, 0, 0);
        layoutParams8.removeRule(i17);
        imageGalleryUI.T.setLayoutParams(layoutParams8);
        android.widget.RelativeLayout.LayoutParams layoutParams9 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.P.getLayoutParams();
        layoutParams9.addRule(3, id6);
        layoutParams9.setMargins(f18, 0, 0, 0);
        layoutParams9.removeRule(i17);
        imageGalleryUI.P.setLayoutParams(layoutParams9);
        android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.Q.getLayoutParams();
        layoutParams10.addRule(3, id6);
        layoutParams10.setMargins(f18, 0, 0, 0);
        layoutParams10.removeRule(i17);
        imageGalleryUI.Q.setLayoutParams(layoutParams10);
        android.widget.RelativeLayout.LayoutParams layoutParams11 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.S.getLayoutParams();
        layoutParams11.addRule(3, id6);
        layoutParams11.setMargins(f18, 0, 0, 0);
        layoutParams11.removeRule(i17);
        imageGalleryUI.S.setLayoutParams(layoutParams11);
        android.widget.RelativeLayout.LayoutParams layoutParams12 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.U.getLayoutParams();
        layoutParams12.addRule(3, id6);
        layoutParams12.setMargins(f18, 0, 0, 0);
        layoutParams12.removeRule(i17);
        imageGalleryUI.U.setLayoutParams(layoutParams12);
        imageGalleryUI.X7();
        android.widget.RelativeLayout.LayoutParams layoutParams13 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200610f4.getLayoutParams();
        layoutParams13.addRule(3, id6);
        layoutParams13.setMargins(0, 0, f18, 0);
        layoutParams13.removeRule(i17);
        imageGalleryUI.X7();
        imageGalleryUI.f200610f4.setLayoutParams(layoutParams13);
        android.widget.RelativeLayout.LayoutParams layoutParams14 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200677y0.getLayoutParams();
        layoutParams14.addRule(3, id6);
        layoutParams14.setMargins(0, 0, f27, 0);
        layoutParams14.removeRule(i17);
        imageGalleryUI.f200677y0.setLayoutParams(layoutParams14);
        imageGalleryUI.S7();
        android.widget.RelativeLayout.LayoutParams layoutParams15 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200646p0.getLayoutParams();
        layoutParams15.addRule(3, id6);
        layoutParams15.setMargins(0, 0, f27, 0);
        layoutParams15.removeRule(i17);
        imageGalleryUI.S7();
        imageGalleryUI.f200646p0.setLayoutParams(layoutParams15);
        imageGalleryUI.O7();
        android.widget.RelativeLayout.LayoutParams layoutParams16 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200629l1.f201458a.getLayoutParams();
        layoutParams16.addRule(3, id6);
        layoutParams16.setMargins(0, 0, f27, 0);
        layoutParams16.removeRule(i17);
        imageGalleryUI.O7();
        imageGalleryUI.f200629l1.f201458a.setLayoutParams(layoutParams16);
        imageGalleryUI.P7();
        android.widget.RelativeLayout.LayoutParams layoutParams17 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.A1.getLayoutParams();
        layoutParams17.addRule(3, id6);
        layoutParams17.setMargins(0, 0, f27, 0);
        layoutParams17.removeRule(i17);
        imageGalleryUI.P7();
        imageGalleryUI.A1.setLayoutParams(layoutParams17);
        int dimensionPixelSize = imageGalleryUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        if (imageGalleryUI.f200682z1 == null) {
            imageGalleryUI.f200682z1 = imageGalleryUI.findViewById(com.tencent.mm.R.id.tze);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams18 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200682z1.getLayoutParams();
        layoutParams18.addRule(3, id6);
        layoutParams18.setMargins(f19, 0, dimensionPixelSize, 0);
        layoutParams18.removeRule(i17);
        layoutParams18.addRule(20);
        imageGalleryUI.r9();
        if (imageGalleryUI.G) {
            imageGalleryUI.G = false;
        }
    }

    public static void X6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, boolean z17) {
        java.lang.String x27 = imageGalleryUI.x2();
        int i17 = imageGalleryUI.M2;
        if ((i17 == 0 || i17 == 2) && !com.tencent.mm.sdk.platformtools.t8.K0(x27)) {
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f58316d = imageGalleryUI.M2 == 2 ? 1L : 0L;
            galleryTranslateReportStruct.f58317e = 3L;
            galleryTranslateReportStruct.f58318f = z17 ? 10L : 4L;
            m11.b0 v17 = com.tencent.mm.ui.chatting.gallery.t2.v(imageGalleryUI.f200611g.w());
            if (v17 != null) {
                galleryTranslateReportStruct.q(v17.f());
                galleryTranslateReportStruct.p(v17.d());
            }
            galleryTranslateReportStruct.k();
            imageGalleryUI.J2 = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
            dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) i95.n0.c(com.tencent.mm.plugin.scanner.z.class))).bj(x27);
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(imageGalleryUI);
            if (bj6 != null && android.text.TextUtils.equals(bj6.field_toLang, c17) && com.tencent.mm.vfs.w6.j(bj6.field_resultFile)) {
                if (imageGalleryUI.f200611g.y(imageGalleryUI.O3) != null) {
                    com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
                    k1Var.R(k1Var.w(), true, imageGalleryUI.O3);
                    imageGalleryUI.h7(imageGalleryUI.f200611g.w(), true);
                    return;
                }
                return;
            }
            if (gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4) {
                imageGalleryUI.M2 = 1;
                com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = imageGalleryUI.f200611g;
                if (k1Var2 != null) {
                    vh5.s sVar = k1Var2.f201106x;
                    int I7 = imageGalleryUI.I7();
                    wh5.j0 j0Var = new wh5.j0(true);
                    sVar.getClass();
                    vh5.q a17 = sVar.a(I7);
                    if (a17 != null) {
                        a17.c(I7, j0Var);
                    }
                }
                imageGalleryUI.s9();
            } else {
                db5.e1.s(imageGalleryUI, imageGalleryUI.getString(com.tencent.mm.R.string.f490500wu), "");
                imageGalleryUI.y7(false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "try to translate img %s, sessionId %d", x27, java.lang.Integer.valueOf(imageGalleryUI.J2));
            com.tencent.mm.autogen.events.ScanTranslationEvent scanTranslationEvent = new com.tencent.mm.autogen.events.ScanTranslationEvent();
            am.bt btVar = scanTranslationEvent.f54738g;
            btVar.f6282a = z17 ? 7 : 1;
            btVar.f6284c = x27;
            btVar.f6283b = imageGalleryUI.J2;
            scanTranslationEvent.e();
        }
    }

    public static void Y6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        com.tencent.mm.storage.f9 y17 = imageGalleryUI.f200611g.y(imageGalleryUI.f200637n.getCurrentItem());
        g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
        sVar.getClass();
        if (y17 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("view_sys_album_pic", "view_clk", sVar.Ni(y17), 32337);
        }
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        jz5.l Ni = ((g90.u) wVar).Ni(y17, 2, pInt);
        if (pInt.value == 1) {
            pInt.value = -2;
        }
        if (pInt.value == -2) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(imageGalleryUI, "android.permission.READ_EXTERNAL_STORAGE", true)) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).xj(y17, false, 2);
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(145, new com.tencent.mm.ui.chatting.gallery.w7(imageGalleryUI, y17, Ni), "android.permission.READ_EXTERNAL_STORAGE");
                return;
            }
        }
        java.lang.String str = (java.lang.String) Ni.f302833d;
        java.lang.Long l17 = (java.lang.Long) Ni.f302834e;
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y(imageGalleryUI, str, y17, l17));
    }

    public static void Z6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var;
        m11.b0 v17;
        sy3.c cVar = imageGalleryUI.f200639n3;
        if ((cVar != null && ((kz3.l) cVar).c()) || (k1Var = imageGalleryUI.f200611g) == null || imageGalleryUI.M2 == 1) {
            return;
        }
        if (java.lang.Boolean.TRUE.equals(k1Var.A(k1Var.w()))) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) imageGalleryUI, 0, true);
            k0Var.f211872n = new com.tencent.mm.ui.chatting.gallery.h6(imageGalleryUI);
            k0Var.f211881s = imageGalleryUI.M3;
            k0Var.v();
            return;
        }
        imageGalleryUI.f200668w = true;
        int i17 = imageGalleryUI.M2;
        if (i17 == 0 || i17 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f58316d = imageGalleryUI.M2 == 2 ? 1L : 0L;
            galleryTranslateReportStruct.f58317e = 1L;
            galleryTranslateReportStruct.f58318f = 4L;
            com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = imageGalleryUI.f200611g;
            if (k1Var2 != null && (v17 = com.tencent.mm.ui.chatting.gallery.t2.v(k1Var2.w())) != null) {
                galleryTranslateReportStruct.q(v17.f());
                galleryTranslateReportStruct.p(v17.d());
            }
            galleryTranslateReportStruct.k();
        }
        imageGalleryUI.x9(imageGalleryUI.x2(), true, true);
        imageGalleryUI.T3 = 1;
        imageGalleryUI.n9(true);
    }

    public static android.view.View a7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.ui.chatting.gallery.k1 k1Var, com.tencent.mm.ui.base.MMViewPager mMViewPager) {
        imageGalleryUI.getClass();
        if (k1Var == null || mMViewPager == null || k1Var.w() == null) {
            return null;
        }
        if (k1Var.w().J2() || k1Var.w().o2()) {
            return k1Var.f(mMViewPager.getCurrentItem(), false);
        }
        return null;
    }

    public static boolean s8() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryEnabled()) == 1;
    }

    public static boolean t8() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryLocatePreviewEnabled()) == 1;
    }

    public final void A7(int i17, com.tencent.mm.storage.f9 f9Var, int i18) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f200611g.w());
        ((c35.m) i95.n0.c(c35.m.class)).getClass();
        xf0.u uVar = (xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class));
        boolean cj6 = uVar.cj(f9Var);
        boolean hj6 = uVar.hj(f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "check origin video: isC2COriginVideoPathEnabled=%b, isOriginVideoSaved=%b, isThumbExistButOriginNotDownloaded=%b", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(cj6), java.lang.Boolean.valueOf(hj6));
        if (cj6 || hj6) {
            com.tencent.mm.ui.tools.a1.d(this, f9Var, cj6, true, i17, 1, new com.tencent.mm.ui.tools.s0() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$f0
                @Override // com.tencent.mm.ui.tools.s0
                public final void a() {
                    int i19 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                    com.tencent.mm.ui.chatting.gallery.k1.i(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.getContext(), arrayList);
                }
            });
        } else {
            com.tencent.mm.ui.chatting.gallery.k1.i(getContext(), arrayList);
        }
    }

    public final void A8(int i17) {
        java.lang.String d17;
        com.tencent.mm.modelmulti.WxaInfo W8 = W8();
        if (W8 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "launchAppBrandForScreenshotIfCan, wxaInfo is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "launchAppBrandForScreenshotIfCan, scene: %d, wxaInfo: %s", java.lang.Integer.valueOf(i17), W8);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = i17;
        b1Var.f317034l = W8.f71265h;
        b1Var.f317014b = W8.f71261d;
        b1Var.f317022f = W8.f71264g;
        b1Var.f317016c = W8.f71267m;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "resolveWxaInfo, adapter is null");
            d17 = null;
        } else {
            d17 = te5.e2.d(k1Var.w());
        }
        java.lang.String F7 = F7();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            if (te5.e2.a(F7, d17)) {
                b1Var.f317015b0 = d17;
                b1Var.f317043u = F7;
            }
            if (te5.e2.b(F7, d17)) {
                b1Var.f317017c0 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams("subpackage");
            } else if (te5.e2.c(d17)) {
                b1Var.f317017c0 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams("allPage");
            }
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this, b1Var);
    }

    public final void A9() {
        T7();
        if (this.N1 == null) {
            this.N1 = (android.widget.LinearLayout) this.C1.findViewById(com.tencent.mm.R.id.u3r);
        }
        android.widget.LinearLayout linearLayout = this.N1;
        if (linearLayout == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "updateFooterTitleTextForImage, skipped, tvFooterTitle is null.");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        com.tencent.mm.storage.f9 y17 = k1Var == null ? null : k1Var.y(this.O3);
        if (y17 == null || y17.getMsgId() <= 0 || !com.tencent.mm.ui.chatting.gallery.k1.L(y17)) {
            linearLayout.setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "updateFooterTitleTextForImage, hidden, msgInfo is not a valid image, msgInfo: " + y17);
            return;
        }
        int intValue = ((java.lang.Integer) ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(y17).f302833d).intValue();
        if (intValue != -1 && intValue != 1) {
            if (intValue == 3 || intValue == 4) {
                linearLayout.setVisibility(8);
                return;
            }
            if (intValue == 6) {
                linearLayout.setVisibility(8);
                return;
            } else if (intValue != 7) {
                j8();
                c9();
                linearLayout.setVisibility(8);
                return;
            }
        }
        linearLayout.setVisibility(8);
    }

    public final android.view.animation.Animation B7(int i17) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(i17);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator(10.0f));
        return alphaAnimation;
    }

    public final void B8() {
        com.tencent.mm.modelmulti.WxaInfo wxaInfo = this.J3;
        if (wxaInfo != null) {
            I8(com.tencent.mm.plugin.appbrand.service.a0.f88619e, com.tencent.mm.plugin.appbrand.service.z.f88839e, wxaInfo);
        }
        if (this.K3 != null) {
            l81.k0 k0Var = (l81.k0) i95.n0.c(l81.k0.class);
            java.lang.String imgPath = this.K3;
            ((com.tencent.mm.plugin.appbrand.screenshot.b0) k0Var).getClass();
            kotlin.jvm.internal.o.g(imgPath, "imgPath");
            com.tencent.mm.plugin.appbrand.screenshot.a0 a17 = com.tencent.mm.plugin.appbrand.screenshot.a0.f88464e.a();
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "updateOnGuideShown, storage is null");
            } else {
                l75.k0 db6 = a17.f88466d;
                kotlin.jvm.internal.o.g(db6, "db");
                com.tencent.mm.plugin.appbrand.utils.k4 k4Var = new com.tencent.mm.plugin.appbrand.utils.k4(db6, db6.b(), null);
                try {
                    new com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo().field_savedImgPath = imgPath;
                    p75.i0 i17 = dm.f0.f236758r.i();
                    i17.f352657d = dm.f0.f236761u.j(imgPath);
                    i17.f352656c = "MicroMsg.SDK.BaseAppBrandScreenshotInfo";
                    com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo appBrandScreenshotInfo = (com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo) i17.a().o(db6, com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo.class);
                    if (appBrandScreenshotInfo == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "updateOnGuideShown, query for " + imgPath + " fail");
                    } else if (appBrandScreenshotInfo.field_isGuideShown) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "updateOnGuideShown, not need");
                    } else {
                        appBrandScreenshotInfo.field_isGuideShown = true;
                        boolean update = a17.update(appBrandScreenshotInfo, new java.lang.String[0]);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateOnGuideShown, update for ");
                        sb6.append(imgPath);
                        sb6.append(' ');
                        sb6.append(update ? ya.b.SUCCESS : "fail");
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", sb6.toString());
                    }
                    wz5.a.a(k4Var, null);
                } finally {
                }
            }
            I8(com.tencent.mm.plugin.appbrand.service.a0.f88620f, com.tencent.mm.plugin.appbrand.service.z.f88839e, this.J3);
        }
        this.J3 = null;
        this.K3 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B9() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.B9():void");
    }

    public final void C7(int i17, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || !f9Var.M2()) {
            android.view.View view = this.W3;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (this.W3 == null) {
            this.W3 = ((android.view.ViewStub) findViewById(com.tencent.mm.R.id.gi8)).inflate();
            this.f200592a4 = findViewById(com.tencent.mm.R.id.jse);
            this.f200598c4 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jsd);
            this.f200602d4 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jsm);
            this.X3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jsl);
            this.Z3 = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById(com.tencent.mm.R.id.jsp);
            this.Y3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jsr);
            this.X3.getPaint().setFakeBoldText(true);
            this.Y3.getPaint().setFakeBoldText(true);
            this.Z3.getPaint().setFakeBoldText(true);
            this.f200595b4 = findViewById(com.tencent.mm.R.id.jsq);
            this.W3.setOnClickListener(new com.tencent.mm.ui.chatting.gallery.m7(this));
        }
        boolean f17 = com.tencent.mm.ui.bl.f(this);
        int c17 = com.tencent.mm.ui.bl.c(this);
        if (this.f200656s && f17) {
            if (y8(this)) {
                android.view.View view2 = this.W3;
                if (view2 != null) {
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
                    layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, 0, 0);
                    this.W3.setLayoutParams(layoutParams);
                }
            } else {
                android.view.View view3 = this.W3;
                if (view3 != null) {
                    android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view3.getLayoutParams();
                    layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, c17, 0);
                    this.W3.setLayoutParams(layoutParams2);
                }
            }
        }
        ot0.m1 r17 = com.tencent.mm.ui.chatting.gallery.j1.r(f9Var);
        if (r17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "fillMpVideoInfoLayout mpShareVideoInfo is null");
            return;
        }
        this.Z3.b(r17.f373342g);
        ot0.q qVar = new ot0.q();
        qVar.f348726x = r17.f373349q;
        java.lang.String str = r17.f373348p;
        qVar.f348722w = str;
        com.tencent.mm.ui.chatting.viewitems.qg.e(this, str, this.f200598c4, this.X3);
        this.f200592a4.setOnClickListener(new com.tencent.mm.ui.chatting.gallery.n7(this, r17));
        this.f200595b4.setOnClickListener(new com.tencent.mm.ui.chatting.gallery.o7(this, r17));
        com.tencent.mm.ui.tools.d8.a(this.f200592a4);
        com.tencent.mm.ui.tools.d8.a(this.f200595b4);
        if (r17.f373339d != null) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(r17.f373339d, -1, 2, new java.lang.Object[0]);
            android.view.View view4 = this.f200595b4;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = this.f200595b4;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "fillMpVideoInfoLayout", "(ILcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f200602d4.getLayoutParams();
        int textSize = (int) (this.Y3.getTextSize() * 1.45d);
        layoutParams3.height = textSize;
        layoutParams3.width = textSize;
        this.f200602d4.setLayoutParams(layoutParams3);
        if (this.F2) {
            o9(false);
            q9();
        }
    }

    public final void C8(boolean z17) {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var != null) {
            vh5.s sVar = k1Var.f201106x;
            boolean z18 = !z17;
            sVar.getClass();
            com.tencent.mars.xlog.Log.i("MediaGallery.MediaMultiLayerManager", "onFocusChanged hasFocus:" + z18);
            vh5.k kVar = sVar.f437241c;
            if (kVar != null) {
                kVar.b(z18);
            }
        }
    }

    public final void C9(int i17) {
        com.tencent.mm.storage.f9 y17 = this.f200611g.y(i17);
        if (y17 == null || !y17.M2() || this.F2) {
            return;
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(y17.Q0(), "update", y17, 0));
    }

    public void D7() {
        super.finish();
    }

    public final void D8() {
        this.f200671x = true;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f200637n;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(true);
            this.f200637n.setSingleMode(false);
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var != null) {
            vh5.s sVar = k1Var.f201106x;
            int I7 = I7();
            vh5.k kVar = sVar.f437241c;
            if (kVar != null) {
                kVar.a(I7);
            }
            vh5.k kVar2 = sVar.f437241c;
            if (kVar2 != null) {
                kVar2.c(false);
            }
            vh5.q a17 = sVar.a(I7);
            if (a17 != null) {
                a17.c(I7, new wh5.j0(false));
            }
        }
    }

    public final java.lang.Boolean D9() {
        return java.lang.Boolean.valueOf(((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).aj());
    }

    public final boolean E7() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_chat_video_scale, true);
    }

    public java.lang.String E8(long j17) {
        if (j17 < 0) {
            return "";
        }
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(j17);
        float floatValue = bigDecimal.divide(new java.math.BigDecimal(1073741824), 1, 0).floatValue();
        if (floatValue > 1.0f) {
            return ((int) floatValue) + "GB";
        }
        float floatValue2 = bigDecimal.divide(new java.math.BigDecimal(1048576), 0, 0).floatValue();
        if (floatValue2 > 1.0f) {
            return ((int) floatValue2) + "MB";
        }
        return ((int) bigDecimal.divide(new java.math.BigDecimal(1024), 0, 0).floatValue()) + "KB";
    }

    public final void E9(android.view.View view, java.lang.String str) {
        int i17 = yd5.p.f461128r;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        int i18 = this.B2 ? 1 : this.A2 ? 3 : 0;
        yd5.p.f461128r = i18;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "chat_username", this.f200599d);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "chat_type", java.lang.Integer.valueOf(this.f200607f ? 2 : 1));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "report_scene", java.lang.Integer.valueOf(i18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 8, 31762);
        H8(view);
    }

    public final java.lang.String F7() {
        java.lang.String str = this.f200603e;
        return (str == null || str.isEmpty()) ? this.f200599d : this.f200603e;
    }

    public final void F8() {
        com.tencent.mm.storage.f9 y17 = this.f200611g.y(this.f200637n.getCurrentItem());
        g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
        sVar.getClass();
        if (y17 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("view_sys_album_pic", "view_clk", sVar.Ni(y17), 32337);
        }
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        jz5.l Ni = ((g90.u) wVar).Ni(y17, 1, pInt);
        if (pInt.value == 1) {
            pInt.value = -2;
        }
        if (pInt.value == -2) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(this, "android.permission.READ_EXTERNAL_STORAGE", true)) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).xj(y17, false, 2);
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(145, new com.tencent.mm.ui.chatting.gallery.y7(this, y17, Ni), "android.permission.READ_EXTERNAL_STORAGE");
                return;
            }
        }
        d8(y17, (java.lang.String) Ni.f302833d, (java.lang.Long) Ni.f302834e);
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI G7() {
        if (this.f200606e4 == null) {
            this.f200606e4 = findViewById(com.tencent.mm.R.id.t1f);
        }
        return this;
    }

    public final void G8(int i17) {
        com.tencent.mm.modelmulti.BizScreenshotMsgInfo S8 = S8();
        if (S8 == null && !com.tencent.mm.sdk.platformtools.t8.K0(S8.f71252e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "readArticleOnScreenshot, bizScreenshotMsgInfo is null");
            return;
        }
        ((qv.s) ((qk.r6) i95.n0.c(qk.r6.class))).Di(S8, this.f200607f ? 2 : 1, i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", S8.f71252e);
        j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final java.lang.String H7() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var == null) {
            return null;
        }
        com.tencent.mm.storage.f9 y17 = k1Var.y(this.O3);
        if (y17 == null) {
            y17 = this.f200611g.w();
        }
        com.tencent.mm.modelmulti.SourceImgInfo a17 = com.tencent.mm.modelmulti.SourceImgInfo.a(y17);
        return (a17 == null || a17.f71259e != 11) ? m11.p0.c(y17) : a17.f71258d;
    }

    public final void H8(android.view.View view) {
        java.lang.Object valueOf;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        long j17 = this.Q1;
        if (j17 == 0) {
            com.tencent.mm.storage.f9 y17 = this.f200611g.y(this.O3);
            valueOf = y17 != null ? java.lang.String.valueOf(y17.I0()) : null;
        } else {
            valueOf = java.lang.Long.valueOf(j17);
        }
        ((cy1.a) rVar).fk(view, "msgid", valueOf);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "playeridentifier", java.lang.Long.valueOf(yd5.p.f461127q));
    }

    public final int I7() {
        return this.f200637n.getCurrentItem();
    }

    public final void I8(com.tencent.mm.plugin.appbrand.service.a0 scene, com.tencent.mm.plugin.appbrand.service.z action, com.tencent.mm.modelmulti.WxaInfo wxaInfo) {
        if (wxaInfo == null) {
            wxaInfo = W8();
        }
        if (wxaInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "reportAppBrandScreenshotForwardExposeClick, wxaInfo is null");
            return;
        }
        if (wxaInfo.f71266i == 1) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.screenshot.j) ((com.tencent.mm.plugin.appbrand.service.m5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.m5.class))).getClass();
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(action, "action");
        java.lang.String appId = wxaInfo.f71261d;
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.autogen.mmdata.rpt.WeAppScreenshotForwardExposeClickStruct weAppScreenshotForwardExposeClickStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppScreenshotForwardExposeClickStruct();
        weAppScreenshotForwardExposeClickStruct.f62868d = scene.f88623d;
        weAppScreenshotForwardExposeClickStruct.f62869e = action.f88842d;
        weAppScreenshotForwardExposeClickStruct.f62870f = weAppScreenshotForwardExposeClickStruct.b("AppId", com.tencent.mm.plugin.appbrand.utils.i1.a(appId), true);
        java.lang.String str = wxaInfo.f71264g;
        weAppScreenshotForwardExposeClickStruct.f62871g = weAppScreenshotForwardExposeClickStruct.b("EnterPath", str != null ? com.tencent.mm.plugin.appbrand.utils.i1.a(str) : null, true);
        weAppScreenshotForwardExposeClickStruct.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String J7() {
        /*
            r5 = this;
            com.tencent.mm.ui.chatting.gallery.k1 r0 = r5.f200611g
            if (r0 == 0) goto L26
            int r1 = r5.O3
            com.tencent.mm.storage.f9 r0 = r0.y(r1)
            boolean r1 = com.tencent.mm.ui.chatting.gallery.k1.N(r0)
            if (r1 == 0) goto L26
            java.lang.Class<tg3.u0> r1 = tg3.u0.class
            i95.m r1 = i95.n0.c(r1)
            tg3.u0 r1 = (tg3.u0) r1
            bm5.f0 r2 = bm5.f0.f22571s
            java.lang.String r3 = r0.z0()
            r4 = 0
            k90.b r1 = (k90.b) r1
            java.lang.String r0 = r1.rj(r0, r2, r3, r4)
            goto L27
        L26:
            r0 = 0
        L27:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r0 != 0) goto L2d
            java.lang.String r0 = ""
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.J7():java.lang.String");
    }

    public final void J8(java.lang.String str) {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var == null || k1Var.U(I7())) {
            return;
        }
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ri(this, this.f200611g.w(), 1, str);
    }

    public final android.view.View K7(com.tencent.mm.ui.chatting.gallery.k1 k1Var, com.tencent.mm.ui.base.MMViewPager mMViewPager) {
        if (k1Var == null || mMViewPager == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "%d get current view but adapter or gallery is null", java.lang.Integer.valueOf(hashCode()));
            return null;
        }
        if (k1Var.w() == null) {
            return null;
        }
        if (k1Var.w().J2() || k1Var.w().o2()) {
            com.tencent.mm.ui.base.MultiTouchImageView c17 = k1Var.c(mMViewPager.getCurrentItem(), true);
            return c17 == null ? k1Var.f(mMViewPager.getCurrentItem(), true) : c17;
        }
        if (k1Var.w().isVideo() || k1Var.w().Y2() || k1Var.w().M2()) {
            return k1Var.C(mMViewPager.getCurrentItem());
        }
        return null;
    }

    public final void K8() {
        com.tencent.mm.ui.chatting.gallery.q3 q3Var = this.f200605e3;
        if (q3Var != null) {
            q3Var.d(new yz5.l() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$l
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                    return com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.L8((java.lang.String) obj);
                }
            });
            return;
        }
        android.view.View view = this.f200673x1;
        if (view != null && view.getVisibility() == 0) {
            L8("pic_video_read_origin");
        }
        android.widget.Button button = this.D1;
        if (button != null && button.getVisibility() == 0) {
            L8("pic_video_full_image");
        }
        android.widget.Button button2 = this.P;
        if (button2 != null && button2.getVisibility() == 0) {
            L8("pic_video_full_image");
        }
        android.view.View view2 = this.f200610f4;
        if (view2 != null && view2.getVisibility() == 0) {
            L8("pic_video_three_dot");
        }
        android.view.View view3 = this.f200606e4;
        if (view3 != null && view3.getVisibility() == 0) {
            L8("pic_video_close");
        }
        com.tencent.mm.ui.chatting.gallery.u uVar = this.f200629l1;
        if (uVar != null && uVar.f201458a.getVisibility() == 0) {
            L8("pic_video_save");
        }
        android.view.View view4 = this.G1;
        if (view4 != null && view4.getVisibility() == 0) {
            L8("pic_video_save");
        }
        android.view.View view5 = this.f200677y0;
        if (view5 != null && view5.getVisibility() == 0) {
            L8("pic_video_forward");
        }
        if (this.f200646p0 != null) {
            L8("pic_video_wall");
        }
        if (com.tencent.mm.ui.chatting.gallery.ja.H() && o8()) {
            L8("video_speed");
            L8("video_play_btn");
        }
    }

    public final android.view.View L7(com.tencent.mm.ui.chatting.gallery.k1 k1Var, com.tencent.mm.ui.base.MMViewPager mMViewPager) {
        mf3.p pVar;
        cg3.a aVar;
        cg3.c U3;
        android.view.View K7 = K7(k1Var, mMViewPager);
        if (K7 != null) {
            return K7;
        }
        if (k1Var != null && mMViewPager != null) {
            vh5.q a17 = k1Var.f201106x.a(mMViewPager.getCurrentItem());
            K7 = (a17 == null || (pVar = a17.f437237n) == null || (aVar = (cg3.a) pVar.b(kotlin.jvm.internal.i0.a(cg3.a.class))) == null || (U3 = aVar.U3()) == null) ? null : U3.getView();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "findOCRTargetView: " + K7);
        }
        if (K7 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "%d getCurrentViewForOCR null", java.lang.Integer.valueOf(hashCode()));
        }
        return K7;
    }

    public final jz5.f0 L8(java.lang.String str) {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (k1Var == null || k1Var.U(I7())) {
            return f0Var;
        }
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ui(this, this.f200611g.w(), 1, str);
        return f0Var;
    }

    public int M7(long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.P2)) {
            return 0;
        }
        try {
            int x17 = t21.d3.x(j17, this.P2, -1);
            if (x17 != -1) {
                return x17;
            }
            this.P2 = null;
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "get enter video op code error : " + e17.toString());
            return 0;
        }
    }

    public final void M8() {
        com.tencent.mm.ui.chatting.gallery.q3 q3Var = this.f200605e3;
        if (q3Var != null) {
            q3Var.d(new yz5.l() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$o
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                    return com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.N8((java.lang.String) obj);
                }
            });
            return;
        }
        if (this.D1 != null) {
            N8("pic_video_full_image");
        }
        if (this.P != null) {
            N8("pic_video_full_image");
        }
        if (this.f200610f4 != null) {
            N8("pic_video_three_dot");
        }
        if (this.f200606e4 != null) {
            N8("pic_video_close");
        }
        if (this.f200629l1 != null) {
            N8("pic_video_save");
        }
        if (this.G1 != null) {
            N8("pic_video_save");
        }
        if (this.f200677y0 != null) {
            N8("pic_video_forward");
        }
        if (this.f200646p0 != null) {
            N8("pic_video_wall");
        }
        N8("pic_video_read_origin");
        N8("pic_video_miniapp");
        if (com.tencent.mm.ui.chatting.gallery.ja.H() && o8()) {
            N8("video_speed");
            N8("video_play_btn");
        }
    }

    public final kd0.f2 N7(java.lang.String str) {
        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(this.f200603e) || com.tencent.mm.storage.z3.R4(this.f200599d))) {
            java.lang.String str2 = this.f200599d;
            kd0.f2 f2Var = new kd0.f2(str);
            f2Var.f306635b = 1;
            f2Var.f306636c = str2;
            f2Var.f306638e = str2;
            return f2Var;
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(this.f200603e) ? this.f200599d : this.f200603e;
        java.lang.String str4 = this.f200599d;
        kd0.f2 f2Var2 = new kd0.f2(str);
        f2Var2.f306635b = 2;
        f2Var2.f306636c = str3;
        f2Var2.f306638e = str4;
        return f2Var2;
    }

    public final jz5.f0 N8(java.lang.String str) {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (k1Var == null || k1Var.U(I7())) {
            return f0Var;
        }
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Vi(this, this.f200611g.w(), 1, str);
        return f0Var;
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI O7() {
        if (this.f200629l1 == null) {
            this.f200629l1 = new com.tencent.mm.ui.chatting.gallery.u(findViewById(com.tencent.mm.R.id.d2y));
        }
        return this;
    }

    public final void O8() {
        int i17 = 1;
        boolean g86 = g8(1);
        boolean g87 = g8(2);
        if (g86 && g87) {
            i17 = 4;
        } else if (g86) {
            i17 = 3;
        } else if (g87) {
            i17 = 2;
        }
        com.tencent.mm.autogen.mmdata.rpt.ImageFastEntryDetectStruct imageFastEntryDetectStruct = this.f200591a3.f344394a;
        if (imageFastEntryDetectStruct != null) {
            imageFastEntryDetectStruct.f58458g = i17;
        }
        if (imageFastEntryDetectStruct != null) {
            imageFastEntryDetectStruct.k();
        }
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI P7() {
        if (this.A1 == null) {
            this.A1 = findViewById(com.tencent.mm.R.id.r_9);
        }
        return this;
    }

    public final void P8(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (c01.ia.M(f9Var)) {
            com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct();
            spamMediaToEmojiOPStruct.f60853d = f9Var.I0();
            spamMediaToEmojiOPStruct.f60854e = f9Var.getType();
            spamMediaToEmojiOPStruct.f60855f = c01.ia.l(f9Var);
            spamMediaToEmojiOPStruct.f60856g = i17;
            spamMediaToEmojiOPStruct.k();
        }
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI Q7() {
        if (this.f200678y1 == null) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485093gi1);
            this.f200678y1 = findViewById;
            android.widget.Button button = (android.widget.Button) findViewById.findViewById(com.tencent.mm.R.id.tzm);
            button.getPaint().setFakeBoldText(true);
            button.setTextSize(1, java.lang.Math.min(1.125f, i65.a.q(this)) * 12.0f);
        }
        return this;
    }

    public void Q8(long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.P2) || j17 == 0) {
            return;
        }
        if (this.Q2) {
            this.P2 = t21.d3.d(j17, 3);
        } else if (t21.d3.x(j17, this.P2, -1) == -1) {
            this.P2 = null;
        }
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI R7() {
        if (this.f200673x1 == null) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.tzc);
            this.f200673x1 = findViewById;
            if (findViewById != null) {
                android.widget.Button button = (android.widget.Button) findViewById.findViewById(com.tencent.mm.R.id.tzd);
                this.f200673x1.setOutlineProvider(new com.tencent.mm.ui.chatting.gallery.y4(this));
                android.text.TextPaint paint = button.getPaint();
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                paint.setStrokeWidth(0.8f);
                button.setGravity(16);
            }
        }
        return this;
    }

    public void R8(int i17) {
        if (I7() == i17) {
            com.tencent.mm.ui.chatting.gallery.q3 q3Var = this.f200605e3;
            if (q3Var != null) {
                com.tencent.mm.ui.chatting.gallery.q3.a(q3Var, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$r());
                return;
            }
            O7();
            com.tencent.mm.ui.chatting.gallery.u uVar = this.f200629l1;
            uVar.getClass();
            uVar.a(com.tencent.mm.ui.chatting.gallery.s.f201346d);
        }
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI S7() {
        if (this.f200646p0 == null) {
            this.f200646p0 = findViewById(com.tencent.mm.R.id.dgu);
        }
        return this;
    }

    public final com.tencent.mm.modelmulti.BizScreenshotMsgInfo S8() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "resolveBizScreenshotMsgInfo, adapter is null");
            return null;
        }
        com.tencent.mm.storage.f9 w17 = k1Var.w();
        if (w17 != null) {
            return T8(w17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "resolveBizScreenshotMsgInfo, msgInfo is null");
        return null;
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI T7() {
        if (this.C1 == null) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.h9b);
            this.C1 = findViewById;
            this.D1 = (android.widget.Button) findViewById.findViewById(com.tencent.mm.R.id.cnb);
            this.E1 = this.C1.findViewById(com.tencent.mm.R.id.cnc);
            this.F1 = this.C1.findViewById(com.tencent.mm.R.id.cnd);
            this.G1 = this.C1.findViewById(com.tencent.mm.R.id.t1m);
            this.J1 = (android.widget.TextView) this.C1.findViewById(com.tencent.mm.R.id.t1h);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.C1.findViewById(com.tencent.mm.R.id.t1o);
            this.H1 = linearLayout;
            this.I1 = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.t1p);
            android.widget.TextView textView = (android.widget.TextView) this.G1.findViewById(com.tencent.mm.R.id.t1n);
            android.widget.TextView textView2 = (android.widget.TextView) this.E1.findViewById(com.tencent.mm.R.id.t1i);
            this.D1.getPaint().setFakeBoldText(true);
            textView2.getPaint().setFakeBoldText(true);
            this.I1.getPaint().setFakeBoldText(true);
            this.J1.getPaint().setFakeBoldText(true);
            textView.getPaint().setFakeBoldText(true);
            float min = java.lang.Math.min(1.125f, i65.a.q(this));
            float f17 = 12.0f * min;
            this.D1.setTextSize(1, f17);
            textView2.setTextSize(1, f17);
            textView.setTextSize(1, f17);
            this.J1.setTextSize(1, min * 14.0f);
            this.I1.setTextSize(1, f17);
        }
        return this;
    }

    public final com.tencent.mm.modelmulti.BizScreenshotMsgInfo T8(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.modelmulti.BizScreenshotMsgInfo c17 = com.tencent.mm.modelmulti.BizScreenshotMsgInfo.f71250m.c(f9Var.j());
        if (c17 == null || !c17.a()) {
            return null;
        }
        return c17;
    }

    public com.tencent.mm.ui.chatting.gallery.ImageGalleryUI U7() {
        if (this.L1 == null) {
            if (com.tencent.mm.ui.chatting.gallery.ja.H()) {
                com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = (com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar) com.tencent.mm.ui.chatting.gallery.q3.a(this.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$j0());
                this.L1 = redesignVideoPlayerSeekBar;
                if (redesignVideoPlayerSeekBar == null) {
                    this.L1 = (com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar) findViewById(com.tencent.mm.R.id.s_i);
                }
                com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation redesignVideoPlayerSeekBarWithAnimation = (com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) this.L1;
                android.widget.TextView textView = redesignVideoPlayerSeekBarWithAnimation.speedRatioTextView;
                if (textView != null) {
                    E9(textView, "video_speed_select");
                }
                ((c35.m) i95.n0.c(c35.m.class)).getClass();
                redesignVideoPlayerSeekBarWithAnimation.C(redesignVideoPlayerSeekBarWithAnimation.getLightStyle());
                redesignVideoPlayerSeekBarWithAnimation.setExtendPlayBtnClick(true);
                redesignVideoPlayerSeekBarWithAnimation.setPlayerUIReporter(new com.tencent.mm.ui.chatting.gallery.j8(this));
            } else {
                this.L1 = (com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar) findViewById(com.tencent.mm.R.id.ozz);
            }
            this.U1 = findViewById(com.tencent.mm.R.id.oeq);
            this.L1.setPlayBtnOnClickListener(this);
        }
        if (com.tencent.mm.ui.chatting.gallery.ja.H()) {
            if (this.R1 == null) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.s_g);
                this.R1 = findViewById;
                E9(findViewById, "video_perator_panel");
                if (this.f200605e3 != null) {
                    android.view.View view = this.R1;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "getFooterRootVideo", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryUI;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "getFooterRootVideo", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryUI;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.R1.setOnTouchListener(new com.tencent.mm.ui.chatting.gallery.u4(this));
            }
            H8(this.R1);
            if (this.T1 == null) {
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487544oy4);
                this.T1 = findViewById2;
                E9(findViewById2, "video_play_pause_area");
                if (this.f200605e3 != null) {
                    android.view.View view2 = this.T1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "getFooterRootVideo", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryUI;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "getFooterRootVideo", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryUI;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.T1.setOnClickListener(new com.tencent.mm.ui.chatting.gallery.v4(this));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.T1, new com.tencent.mm.ui.chatting.gallery.w4(this));
                this.T1.setClickable(false);
            }
            H8(this.T1);
        }
        return this;
    }

    public final com.tencent.mm.modelmulti.SourceImgInfo U8() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "resolveImgSrcInfo, adapter is null");
            return null;
        }
        com.tencent.mm.storage.f9 w17 = k1Var.w();
        if (w17 != null) {
            return V8(w17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "resolveImgSrcInfo, msgInfo is null");
        return null;
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI V7() {
        if (this.O1 == null) {
            this.O1 = findViewById(com.tencent.mm.R.id.u3o);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.modelmulti.SourceImgInfo V8(com.tencent.mm.storage.f9 r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.j()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L11
            int r2 = r6.length()
            if (r2 != 0) goto Lf
            goto L11
        Lf:
            r2 = r0
            goto L12
        L11:
            r2 = r1
        L12:
            r3 = 0
            if (r2 == 0) goto L16
            goto L2b
        L16:
            p15.m r2 = new p15.m
            r2.<init>()
            r2.fromXml(r6)
            java.lang.String r6 = r2.k()
            if (r6 != 0) goto L2d
            java.lang.String r6 = "from, ImgSourceUrl is null"
            java.lang.String r2 = "MicroMsg.SourceImgInfo"
            com.tencent.mars.xlog.Log.i(r2, r6)
        L2b:
            r4 = r3
            goto L36
        L2d:
            int r2 = r2.j()
            com.tencent.mm.modelmulti.SourceImgInfo r4 = new com.tencent.mm.modelmulti.SourceImgInfo
            r4.<init>(r6, r2)
        L36:
            if (r4 == 0) goto L4c
            int r6 = r4.f71259e
            if (r6 == 0) goto L41
            java.lang.String r6 = r4.f71258d
            if (r6 == 0) goto L41
            r0 = r1
        L41:
            if (r0 != 0) goto L4b
            java.lang.String r6 = "MicroMsg.ImageGalleryUI"
            java.lang.String r0 = "resolveImgSrcInfo, not valid"
            com.tencent.mars.xlog.Log.i(r6, r0)
            return r3
        L4b:
            return r4
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.V8(com.tencent.mm.storage.f9):com.tencent.mm.modelmulti.SourceImgInfo");
    }

    public final int W7(m11.b0 b0Var) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(b0Var.f322652t, "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "parse cdnInfo failed. [%s]", b0Var.f322652t);
            return -1;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.img.$hdlength"), 0);
        return P == 0 ? com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.img.$tphdlength"), 0) : P;
    }

    public final com.tencent.mm.modelmulti.WxaInfo W8() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "resolveWxaInfo, adapter is null");
            return null;
        }
        com.tencent.mm.storage.f9 w17 = k1Var.w();
        if (w17 != null) {
            return X8(w17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "resolveWxaInfo, msgInfo is null");
        return null;
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI X7() {
        if (this.f200610f4 == null) {
            this.f200610f4 = findViewById(com.tencent.mm.R.id.t1l);
        }
        return this;
    }

    public final com.tencent.mm.modelmulti.WxaInfo X8(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String j17 = f9Var.j();
        w11.m2 m2Var = com.tencent.mm.modelmulti.WxaInfo.f71260n;
        com.tencent.mm.modelmulti.WxaInfo b17 = m2Var.b(j17);
        if (b17 != null) {
            if (b17.f71266i != 1) {
                ((com.tencent.mm.plugin.appbrand.screenshot.j) ((com.tencent.mm.plugin.appbrand.service.m5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.m5.class))).getClass();
                if (!((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.screenshot.i.f88495a).getValue()).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "resolveWxaInfo, AppBrandScreenshotForwardService has disabled");
                    return null;
                }
            }
            return b17;
        }
        java.lang.String str = f9Var.G;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "resolveWxaInfo, msgSrcStr is null");
            return null;
        }
        p15.e eVar = new p15.e();
        eVar.fromXml(str);
        if (eVar.t() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "resolveWxaInfo, get null");
            return null;
        }
        if (eVar.t().n() != 1) {
            ((com.tencent.mm.plugin.appbrand.screenshot.j) ((com.tencent.mm.plugin.appbrand.service.m5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.m5.class))).getClass();
            if (!((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.appbrand.screenshot.i.f88495a).getValue()).booleanValue()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "resolveWxaInfo, AppBrandScreenshotForwardService has disabled");
                return null;
            }
        }
        return m2Var.a(eVar.t());
    }

    public final int Y7() {
        int i17 = this.G2;
        if (i17 == 0) {
            return 2;
        }
        return i17 == 1 ? 4 : 1;
    }

    public final void Y8() {
        int i17;
        android.view.View view;
        int i18;
        int i19;
        float f17;
        int i27;
        android.view.View view2;
        int i28;
        int i29;
        android.view.View view3;
        if (this.f200665v || this.f200611g == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "isRunningExitAnimation");
            return;
        }
        y7(true);
        g7();
        if (this.f200659t) {
            finish();
            db5.f.j(getContext());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "runExitAnimation");
        int width = this.f200637n.getWidth() / 2;
        int height = this.f200637n.getHeight() / 2;
        this.f200611g.f201093h.f200855f = false;
        float f18 = 0.0f;
        if ((this.f200623j2 == 1) && (this.f200605e3 == null || I7() == com.tencent.mm.ui.chatting.gallery.d2.f200849o)) {
            i27 = this.f200612g2;
            i29 = this.f200616h2;
            i19 = this.f200608f2;
            i28 = this.f200604e2;
            f17 = 0.0f;
            view2 = null;
        } else if (this.A2) {
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent = new com.tencent.mm.autogen.events.GalleryPhotoInfoEvent();
            galleryPhotoInfoEvent.f54355g.f6947c = this.f200611g.y(this.f200637n.getCurrentItem()).getMsgId();
            galleryPhotoInfoEvent.e();
            am.je jeVar = galleryPhotoInfoEvent.f54356h;
            int i37 = jeVar.f7027a;
            int i38 = jeVar.f7028b;
            int i39 = jeVar.f7029c;
            int i47 = jeVar.f7030d;
            if (i37 == 0 && i38 == 0) {
                i37 = this.f200637n.getWidth() / 2;
                i38 = this.f200637n.getHeight() / 2;
            }
            int i48 = i38;
            i19 = i37;
            f17 = 0.0f;
            view2 = null;
            i29 = i47;
            i27 = i39;
            i28 = i48;
        } else {
            com.tencent.mm.storage.f9 y17 = this.f200611g.y(this.f200637n.getCurrentItem());
            if (y17 != null) {
                com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent = new com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent();
                chattingUIPhotoInfoEvent.f54044g.f6895a = y17;
                chattingUIPhotoInfoEvent.e();
                am.j2 j2Var = chattingUIPhotoInfoEvent.f54045h;
                int i49 = j2Var.f6999a;
                int i57 = j2Var.f7000b;
                i18 = j2Var.f7001c;
                i17 = j2Var.f7002d;
                float f19 = j2Var.f7003e;
                view = j2Var.f7004f;
                width = i49;
                height = i57;
                f18 = f19;
            } else {
                i17 = 0;
                view = null;
                i18 = 0;
            }
            if (width == 0 && height == 0) {
                width = this.f200637n.getWidth() / 2;
                height = this.f200637n.getHeight() / 2;
            } else if (y17 != null) {
                if (y17.A0() == 0) {
                    this.f200596c2 = i65.a.b(getContext(), 5);
                }
                if (y17.A0() == 1) {
                    this.f200600d2 = i65.a.b(getContext(), 5);
                }
            }
            i19 = width;
            f17 = f18;
            i27 = i18;
            view2 = view;
            int i58 = i17;
            i28 = height;
            i29 = i58;
        }
        this.Z1 = this.f200637n.getWidth();
        this.f200590a2 = this.f200637n.getHeight();
        if (this.f200611g.w() != null) {
            if (this.f200611g.w().Y2() || this.f200611g.w().isVideo() || this.f200611g.w().M2()) {
                java.lang.String J7 = J7();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.U3;
                if (concurrentHashMap.containsKey(J7)) {
                    this.f200590a2 = (int) (this.Z1 / ((java.lang.Float) concurrentHashMap.get(J7)).floatValue());
                } else {
                    this.f200590a2 = (int) ((this.Z1 / i27) * i29);
                }
            }
            if (this.f200611g.w().J2() || this.f200611g.w().o2()) {
                db5.f0 f0Var = (db5.f0) K7(this.f200611g, this.f200637n);
                if (com.tencent.mm.ui.chatting.gallery.k1.K(this.f200611g.w())) {
                    android.view.KeyEvent.Callback L7 = L7(this.f200611g, this.f200637n);
                    if (L7 instanceof db5.f0) {
                        f0Var = (db5.f0) L7;
                    }
                }
                if (f0Var != null) {
                    int imageWidth = (int) ((this.Z1 / f0Var.getImageWidth()) * f0Var.getImageHeight());
                    this.f200590a2 = imageWidth;
                    if (imageWidth > this.f200637n.getHeight()) {
                        if (this.f200590a2 < this.f200637n.getHeight() * 1.5d) {
                            if (this.A2) {
                                this.f200593b2 = this.f200590a2 - this.f200637n.getHeight();
                            } else {
                                i29 = (this.f200637n.getHeight() * i29) / this.f200590a2;
                            }
                        }
                        this.f200590a2 = this.f200637n.getHeight();
                    }
                    if (f0Var instanceof com.tencent.mm.ui.base.WxImageView) {
                        ((com.tencent.mm.ui.base.WxImageView) f0Var).setDrawFullSampleSizeBitmap(true);
                    }
                }
            }
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f200634m2;
        int i59 = this.f200596c2;
        int i66 = this.f200600d2;
        s4Var.f210712s = i59;
        s4Var.f210713t = i66;
        s4Var.f210714u = 0;
        s4Var.f210715v = 0;
        s4Var.f210711r = this.f200593b2;
        int i67 = this.Z1;
        int i68 = this.f200590a2;
        s4Var.f210699f = i67;
        s4Var.f210700g = i68;
        s4Var.e(i19, i28, i27, i29);
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f200637n;
        android.view.View K7 = K7(this.f200611g, mMViewPager);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var != null && com.tencent.mm.ui.chatting.gallery.k1.K(k1Var.w())) {
            K7 = this.f200626k2;
        }
        if (K7 != null) {
            float f27 = this.f200684z3;
            if (f27 != 1.0d) {
                this.f200634m2.f210707n = 1.0f / f27;
                if (this.A3 != 0 || this.B3 != 0) {
                    int width2 = ((int) ((this.f200637n.getWidth() / 2) * (1.0f - this.f200684z3))) + this.A3;
                    int height2 = (int) (((this.f200637n.getHeight() / 2) + this.B3) - ((this.f200590a2 / 2) * this.f200684z3));
                    com.tencent.mm.ui.tools.s4 s4Var2 = this.f200634m2;
                    s4Var2.f210708o = width2;
                    s4Var2.f210709p = height2;
                }
            }
            view3 = K7;
        } else {
            view3 = mMViewPager;
        }
        if (x8()) {
            l8();
        }
        ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).getClass();
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupDragAnimRefactor()) == 1)) {
            this.f200634m2.d(view3, this.W1, false, new com.tencent.mm.ui.chatting.gallery.c6(this), null);
            return;
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = this.f200611g;
        k1Var2.f201098p.z();
        k1Var2.f201099q.s();
        this.f200638n2.b(view3, this.W1, new com.tencent.mm.ui.tools.q3(i19, i28, i27, i29, f17, this.Z1, this.f200590a2), view2, new com.tencent.mm.ui.chatting.gallery.e6(this));
    }

    public final int Z7() {
        return this.f200668w ? 3 : 4;
    }

    public final boolean Z8(final com.tencent.mm.storage.f9 f9Var, int i17, final java.lang.Runnable runnable, java.lang.Runnable runnable2, java.lang.Runnable runnable3) {
        jz5.l hj6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(f9Var);
        java.lang.Object obj = hj6.f302833d;
        final boolean z17 = ((java.lang.Integer) obj).intValue() == 3 || ((java.lang.Integer) obj).intValue() == 2 || ((java.lang.Integer) obj).intValue() == 4;
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        boolean z18 = ((g90.u) wVar).Bi(f9Var, 1) == 3;
        boolean z19 = ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ai(f9Var, 1) == 4;
        h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr2 = h90.a.f279671d;
        boolean z27 = ((g90.u) wVar2).Bi(f9Var, 4) == 3;
        boolean z28 = ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ai(f9Var, 4) == 4;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "image status: " + hj6 + ", originExist: " + z18 + ", originSaved: " + z19 + ", midExist: " + z27 + ", midSaved: " + z28);
        if ((z17 && z18 && z19) || (!z17 && z27 && z28)) {
            com.tencent.mm.ui.tools.a1.e(this, f9Var, z17 && z18 && z19, false, i17, 1, new com.tencent.mm.ui.tools.s0() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$b0
                @Override // com.tencent.mm.ui.tools.s0
                public final void a() {
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this;
                    if (imageGalleryUI.f200611g == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "[saveImageWithRepeatSaveTip] receive onMMMenuItemSelected but adapter is null");
                    } else {
                        imageGalleryUI.s7(f9Var, z17, runnable);
                    }
                }
            }, runnable2);
            return true;
        }
        if (runnable3 != null) {
            runnable3.run();
        }
        s7(f9Var, z17, runnable);
        k7(7);
        i7(7);
        return false;
    }

    public final java.lang.String a8(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        return f9Var.A0() == 1 ? c01.z1.r() : z17 ? c01.w9.s(f9Var.j()) : f9Var.Q0();
    }

    public void a9(boolean z17, int i17) {
        com.tencent.mm.ui.chatting.gallery.q3 q3Var;
        if (I7() != i17 || (q3Var = this.f200605e3) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.q3.b(q3Var, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$x(), java.lang.Boolean.valueOf(z17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x011a, code lost:
    
        if (r6.intValue() == 1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x08e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b7(int r49) {
        /*
            Method dump skipped, instructions count: 2427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.b7(int):void");
    }

    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI b8() {
        if (this.B1 == null) {
            com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = (com.tencent.mm.plugin.scanner.MultiCodeMaskView) findViewById(com.tencent.mm.R.id.jun);
            this.B1 = multiCodeMaskView;
            multiCodeMaskView.setOnMultiCodeMaskViewListener(new com.tencent.mm.ui.chatting.gallery.x4(this));
        }
        return this;
    }

    public void b9(boolean z17) {
        android.widget.RelativeLayout relativeLayout = this.f200650q;
        if (relativeLayout == null) {
            return;
        }
        if (z17 && relativeLayout.getVisibility() == 0) {
            return;
        }
        if (z17 || this.f200650q.getVisibility() != 8) {
            this.f200650q.setVisibility(z17 ? 0 : 8);
            this.f200650q.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), z17 ? com.tencent.mm.R.anim.f477723k : com.tencent.mm.R.anim.f477724l));
        }
    }

    public java.util.Map c7(com.tencent.mm.storage.f9 f9Var) {
        java.lang.Object m521constructorimpl;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (f9Var == null) {
            return hashMap;
        }
        ic5.b bVar = (ic5.b) component(ic5.b.class);
        bVar.getClass();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            jz5.l[] lVarArr = new jz5.l[11];
            lVarArr[0] = new jz5.l("ChatPicVideoPageSessionid", bVar.f290432h);
            ic5.h hVar = ic5.h.f290441a;
            int i17 = 1;
            lVarArr[1] = new jz5.l("is_live_picture", java.lang.Integer.valueOf(hVar.e(f9Var) ? 1 : 0));
            lVarArr[2] = new jz5.l("is_news_jump", java.lang.Integer.valueOf(bVar.f290429e ? 1 : 0));
            lVarArr[3] = new jz5.l("send_svr_id", java.lang.Long.valueOf(f9Var.I0()));
            lVarArr[4] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(bVar.f290431g));
            lVarArr[5] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(hVar.b(f9Var)));
            lVarArr[6] = new jz5.l("oper_user_type", java.lang.Integer.valueOf(g95.e0.i(f9Var) ? 2 : 1));
            if (!f9Var.J2()) {
                i17 = 2;
            }
            lVarArr[7] = new jz5.l("chat_pic_video_type", java.lang.Integer.valueOf(i17));
            java.lang.String str = bVar.f290428d;
            lVarArr[8] = new jz5.l("chat_username", str == null ? "" : str);
            lVarArr[9] = new jz5.l("chat_type", java.lang.Integer.valueOf(hVar.a(str)));
            lVarArr[10] = new jz5.l("collection_id", ic5.f.f290437c.b(f9Var));
            m521constructorimpl = kotlin.Result.m521constructorimpl(kz5.c1.l(lVarArr));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        java.util.Map map = (java.util.Map) m521constructorimpl;
        java.util.Map map2 = map;
        if (map == null) {
            map2 = kz5.q0.f314001d;
        }
        hashMap.putAll(map2);
        return hashMap;
    }

    public final android.view.View c8() {
        if (this.f200611g == null) {
            return null;
        }
        com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent = new com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent();
        chattingUIPhotoInfoEvent.f54044g.f6895a = this.f200611g.w();
        chattingUIPhotoInfoEvent.e();
        return chattingUIPhotoInfoEvent.f54045h.f7004f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0196, code lost:
    
        if (((java.lang.Integer) r5).intValue() != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a4, code lost:
    
        if (r2.z2() != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c9() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.c9():void");
    }

    public java.util.Map d7(com.tencent.mm.storage.f9 f9Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (f9Var != null && this.f200611g != null) {
            hashMap.put("msgid", java.lang.Long.valueOf(f9Var.getMsgId()));
            hashMap.put("chat_name", this.f200599d);
            if (com.tencent.mm.ui.chatting.gallery.k1.K(f9Var)) {
                hashMap.put("source_page_type", java.lang.Integer.valueOf(vh5.a.f437199e ? 1 : 2));
                hashMap.put("has_live_button", 1);
                hashMap.put("live_play_cnt", java.lang.Integer.valueOf(vh5.a.f437197c));
            } else {
                m11.b0 x17 = this.f200611g.x(f9Var, true);
                if (x17 == null) {
                    return hashMap;
                }
                hashMap.put("source_page_type", java.lang.Integer.valueOf((x17.j() && (x17.f322649q > 0L ? 1 : (x17.f322649q == 0L ? 0 : -1)) > 0) && !f7(f9Var, x17) && !f9Var.z2() ? 1 : 2));
                hashMap.put("has_live_button", 0);
            }
            hashMap.put("message_source", java.lang.Integer.valueOf(f9Var.A0() != 1 ? 1 : 2));
            vh5.a.f437197c = 0;
            bm5.j0.a(hashMap, c7(f9Var));
        }
        return hashMap;
    }

    public final void d8(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.Long l17) {
        if (this.V1 || isFinishing() || isDestroyed()) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f279671d;
            ((g90.u) wVar).Vi(f9Var, 1);
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
            e4Var.f211776c = getText(com.tencent.mm.R.string.ncp);
            e4Var.c();
            A9();
            c9();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).xj(f9Var, false, 1);
            return;
        }
        m11.b0 v17 = com.tencent.mm.ui.chatting.gallery.t2.v(f9Var);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.tools.ShowImageUI.class);
        intent.putExtra("key_image_path", str);
        intent.putExtra("key_image_uri_id", l17);
        intent.putExtra("key_placeholder_image_path", com.tencent.mm.ui.chatting.gallery.t2.z(f9Var, v17));
        intent.putExtra("key_message_id", f9Var.getMsgId());
        intent.putExtra("key_message_talker", f9Var.Q0());
        intent.putExtra("key_favorite", true);
        intent.putExtra("show_menu", true);
        intent.putExtra("key_title", getText(com.tencent.mm.R.string.ncs));
        intent.putExtra("key_compress_type", 1);
        intent.putExtra("key_scene", 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "goToPreviewExternalImage", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/Long;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "goToPreviewExternalImage", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;Ljava/lang/Long;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1);
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).xj(f9Var, true, 0);
    }

    public final void d9(int i17) {
        if (m7(1, true)) {
            return;
        }
        T7();
        android.view.View view = this.C1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T7();
        h9(this.D1, 8);
        T7();
        android.view.View view2 = this.E1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T7();
        android.view.View view3 = this.F1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T7();
        h9(this.G1, 8);
        T7();
        this.H1.setVisibility(8);
        T7();
        this.J1.setVisibility(8);
        int min = java.lang.Math.min(100, java.lang.Math.max(0, i17));
        T7();
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.t1i)).setText(min + "%");
        com.tencent.mm.ui.chatting.gallery.q3.c(this.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$a(), java.lang.Integer.valueOf(min), java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 82 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f200651q2;
        if (k0Var != null) {
            k0Var.u();
            this.f200651q2 = null;
        } else {
            int i17 = this.M2;
            if (i17 == 0 || i17 == 2) {
                n9(false);
            } else {
                n9(false);
            }
        }
        return true;
    }

    public java.lang.String e7(long j17) {
        if (j17 < 0) {
            return "";
        }
        java.math.BigDecimal bigDecimal = new java.math.BigDecimal(j17);
        float floatValue = bigDecimal.divide(new java.math.BigDecimal(1048576), 2, 0).floatValue();
        if (floatValue > 1.0f) {
            return ((int) floatValue) + "MB";
        }
        return ((int) bigDecimal.divide(new java.math.BigDecimal(1024), 2, 0).floatValue()) + "K";
    }

    public final void e8() {
        com.tencent.mm.storage.f9 w17 = this.f200611g.w();
        final java.lang.String x17 = com.tencent.mm.ui.chatting.gallery.t2.x(w17, com.tencent.mm.ui.chatting.gallery.t2.v(w17), false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "edit image path:%s msgId:%s", x17, java.lang.Long.valueOf(w17.getMsgId()));
        if (!com.tencent.mm.ui.chatting.gallery.k1.K(w17)) {
            f8(x17);
        } else {
            db5.e1.C(this, i65.a.r(this, com.tencent.mm.R.string.mef), "", i65.a.r(this, com.tencent.mm.R.string.mee), i65.a.r(this, com.tencent.mm.R.string.f490347sg), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    int i18 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this;
                    imageGalleryUI.getClass();
                    dialogInterface.dismiss();
                    java.lang.String str = x17;
                    imageGalleryUI.f8(str);
                    ke4.a.f307025a.a(kk.k.g(str.getBytes()), ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi());
                }
            }, p23.b.f351427d);
        }
    }

    public final void e9() {
        m11.b0 x17;
        if (m7(1, true)) {
            return;
        }
        T7();
        android.view.View view = this.C1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionSavable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionSavable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T7();
        h9(this.D1, 8);
        T7();
        android.view.View view2 = this.E1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionSavable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionSavable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T7();
        android.view.View view3 = this.F1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionSavable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionSavable", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T7();
        h9(this.G1, 8);
        T7();
        this.H1.setVisibility(8);
        T7();
        this.J1.setVisibility(8);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        com.tencent.mm.storage.f9 y17 = k1Var == null ? null : k1Var.y(this.O3);
        if (y17 == null || y17.getMsgId() <= 0 || !com.tencent.mm.ui.chatting.gallery.k1.L(y17) || (x17 = this.f200611g.x(y17, true)) == null || !x17.j() || x17.f322649q <= 0) {
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(x17.f322649q));
        if (C1.f322633a <= 0) {
            return;
        }
        java.lang.String hj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).hj(C1.f322637e, "", "", true);
        if (C1.k() && com.tencent.mm.vfs.w6.j(hj6)) {
            return;
        }
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(y17, bm5.f0.f22562g, C1.f322637e, "", "");
        jz5.l hj7 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(y17);
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        int Bi = ((g90.u) wVar).Bi(y17, 1);
        java.lang.Object obj = hj7.f302833d;
        if ((Bi == 3 && (((java.lang.Integer) obj).intValue() == 6 || ((java.lang.Integer) obj).intValue() == 7)) || y17.z2() || ((java.lang.Integer) obj).intValue() == 4) {
            return;
        }
        if (!(C1.k() && com.tencent.mm.vfs.w6.j(aj6) && y17.A0() != 1) && ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).fj(y17) <= 0 && C1.k()) {
            g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
            sVar.getClass();
            if (y17.getMsgId() > 0 && sVar.Di(y17.getMsgId(), "chat_visual_origin_outdate")) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.HashMap i17 = kz5.c1.i(new jz5.l("pic_video_is_ori", 0));
                i17.putAll(sVar.Ni(y17));
                ((cy1.a) rVar).Hj("chat_visual_origin_outdate", "view_exp", i17, 32337);
            }
        }
    }

    public final boolean f7(com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var) {
        if (b0Var == null) {
            return false;
        }
        try {
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "error:" + e17);
        }
        if (((java.lang.Integer) ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(f9Var).f302833d).intValue() == 7) {
            return false;
        }
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        if (((g90.u) wVar).Bi(f9Var, 1) != 3 && this.f200611g.t(f9Var, b0Var) == 0 && b0Var.j()) {
            if (!f9Var.z2()) {
                return true;
            }
        }
        return false;
    }

    public final void f8(java.lang.String str) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(str, "");
        b17.F = this.H2;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        b17.f155677o = uICustomParam;
        fu3.e.f266880a.b(b17);
        ut3.m.f431182a.f(getContext(), 4369, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 2);
        k7(8);
    }

    public final void f9(int i17) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.t1k);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setMaskVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setMaskVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.t1j);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setMaskVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setMaskVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        this.f200640n4.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "finish isVASValid():%s", java.lang.Boolean.valueOf(isVASValid()));
        lc5.p pVar = this.f200641o;
        if (pVar == null) {
            super.finish();
            return;
        }
        pVar.p();
        if (this.f200641o.s0()) {
            this.f200641o.g0(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$w
                @Override // java.lang.Runnable
                public final void run() {
                    super/*com.tencent.mm.ui.vas.VASActivity*/.finish();
                }
            });
        } else {
            super.finish();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void finishAfterTransition() {
        if (getIntent().getBooleanExtra("img_gallery_enter_use_share_element_anim", false)) {
            super.finishAfterTransition();
        } else {
            finish();
        }
    }

    public final boolean g7() {
        D8();
        sy3.c cVar = this.f200639n3;
        if (cVar == null) {
            return false;
        }
        if (!((kz3.l) cVar).b(this.f200635m3)) {
            return false;
        }
        this.f200635m3 = 0L;
        return true;
    }

    public final boolean g8(int i17) {
        int d17 = this.f200674x2.d(i17, 2);
        return d17 == 1 || d17 == 3 || d17 == 7;
    }

    public void g9(boolean z17) {
        try {
            U7();
            this.L1.setIsPlay(!z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "set video state iv error : " + e17.toString());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bk6;
    }

    public final void h7(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeTranslateStatus() called with: msg = [");
        sb6.append(f9Var == null ? "null" : java.lang.Long.valueOf(f9Var.getMsgId()));
        sb6.append("], enableTrans = [");
        sb6.append(z17);
        sb6.append("]");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "hasTranslated:" + ((java.util.HashMap) this.f200611g.A).containsKey(f9Var) + "");
        this.f200644o4 = z17;
        if (!z17) {
            c9();
            com.tencent.mm.ui.chatting.gallery.q3.b(this.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$l0(), java.lang.Boolean.FALSE);
            android.view.View view = this.f200677y0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S7();
            android.view.View view2 = this.f200646p0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S7();
            this.f200646p0.setEnabled(true);
            if (this.f200672x0 == null) {
                this.f200672x0 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.bhi);
            }
            this.f200672x0.setAlpha(1.0f);
            j7();
            return;
        }
        j8();
        com.tencent.mm.ui.chatting.gallery.q3.b(this.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$l0(), java.lang.Boolean.TRUE);
        android.view.View view3 = this.f200677y0;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S7();
        android.view.View view4 = this.f200646p0;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S7();
        this.f200646p0.setEnabled(false);
        if (this.f200672x0 == null) {
            this.f200672x0 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.bhi);
        }
        this.f200672x0.setAlpha(0.15f);
        O7();
        android.view.View view5 = this.f200629l1.f201458a;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "changeTranslateStatus", "(Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean h8() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        com.tencent.mm.storage.f9 w17 = k1Var == null ? null : k1Var.w();
        if (w17 == null) {
            return false;
        }
        com.tencent.mm.modelmulti.BizScreenshotMsgInfo T8 = T8(w17);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(T8 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowReadSourceScreenshot, bizScreenshotMsgInfo exists: %b", objArr);
        return T8 != null && T8.a();
    }

    public final void h9(android.view.View view, int i17) {
        if (view != null) {
            com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(view.getId());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setVisiblity", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setVisiblity", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (view.getVisibility() == 0 && view.getId() == com.tencent.mm.R.id.f485093gi1) {
                int i18 = this.f200661t3;
                int i19 = this.O3;
                if (i18 != i19) {
                    this.f200661t3 = i19;
                    L8("pic_video_miniapp");
                }
            }
        }
    }

    public final void i7(int i17) {
        com.tencent.mm.modelmulti.BizScreenshotMsgInfo S8 = S8();
        if (S8 == null || com.tencent.mm.sdk.platformtools.t8.K0(S8.f71252e)) {
            return;
        }
        ((qv.s) ((qk.r6) i95.n0.c(qk.r6.class))).Di(S8, this.f200607f ? 2 : 1, i17);
    }

    public final void i8(android.view.View view, boolean z17) {
        if (view == null) {
            return;
        }
        if (z17) {
            if (view.getVisibility() == 0) {
                oc5.k0.f344445a.a(view, false);
                return;
            }
            return;
        }
        h9(view, 8);
        oc5.k0.f344446b.remove(java.lang.Integer.valueOf(view.hashCode()));
        java.util.HashMap hashMap = oc5.k0.f344448d;
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) hashMap.get(java.lang.Integer.valueOf(view.hashCode()));
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        oc5.k0 k0Var = oc5.k0.f344445a;
        android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) hashMap.get(java.lang.Integer.valueOf(view.hashCode()));
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.removeAllListeners();
        }
    }

    public final boolean i9() {
        return (this.E2 || this.H2 == 1 || this.F2 || this.f200642o2 || this.f200648p2 || com.tencent.mm.ui.chatting.gallery.p4.f201265a.f201334b) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x071c  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.initView():void");
    }

    public final void j7() {
        if ((this.f200623j2 == 1) || r8()) {
            P7();
            h9(this.A1, 8);
        }
        if (r8()) {
            h9(this.f200677y0, 8);
            S7();
            h9(this.f200646p0, 8);
            O7();
            h9(this.f200629l1.f201458a, 8);
            R7();
            h9(this.f200673x1, 8);
            Q7();
            h9(this.f200678y1, 8);
        }
    }

    public final void j8() {
        T7();
        android.view.View view = this.C1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hideHdImageAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hideHdImageAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j9(java.util.ArrayList r8) {
        /*
            r7 = this;
            int r0 = r7.H2
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7
            return r1
        L7:
            java.lang.String r0 = r7.f200599d
            boolean r0 = com.tencent.mm.storage.z3.V3(r0)
            if (r0 == 0) goto L10
            return r1
        L10:
            oc5.l0 r0 = r7.f200663u2
            if (r0 == 0) goto Lb0
            java.util.ArrayList r0 = r0.f344451a
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.L0(r0)
            if (r0 == 0) goto L1e
            goto Lb0
        L1e:
            int r0 = r8.size()
            if (r0 > 0) goto L25
            return r1
        L25:
            int r0 = r8.size()
            if (r0 <= r2) goto L2c
            return r2
        L2c:
            java.lang.String r0 = r7.H7()
            if (r0 == 0) goto L60
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L39
            goto L60
        L39:
            rv.d r0 = rv.d.a(r0)
            rv.c r3 = rv.d.f399832e
            r3.getClass()
            r3 = 312(0x138, float:4.37E-43)
            int r0 = r0.f399839d
            if (r0 == r3) goto L57
            r3 = 313(0x139, float:4.39E-43)
            if (r0 == r3) goto L57
            r3 = 314(0x13a, float:4.4E-43)
            if (r0 == r3) goto L57
            r3 = 320(0x140, float:4.48E-43)
            if (r0 != r3) goto L55
            goto L57
        L55:
            r0 = r1
            goto L58
        L57:
            r0 = r2
        L58:
            boolean r3 = r7.B2
            if (r3 == 0) goto L60
            if (r0 == 0) goto L60
            r0 = r2
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 == 0) goto L64
            return r1
        L64:
            java.lang.Object r8 = r8.get(r1)
            com.tencent.mm.plugin.scanner.ImageQBarDataBean r8 = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) r8
            java.lang.String r8 = r8.f158619d
            boolean r0 = r7.E2
            if (r0 != 0) goto L71
            return r2
        L71:
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r3 = com.tencent.mm.storage.u3.APPBRAND_BLOCK_QRCODE_PREFIX_STRING_SYNC
            java.lang.String r4 = ""
            java.lang.Object r0 = r0.m(r3, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "\\|"
            java.lang.String[] r0 = r0.split(r3)
            if (r0 == 0) goto Laf
            int r3 = r0.length
            if (r3 <= 0) goto Laf
            int r3 = r0.length
            r4 = r1
        L90:
            if (r4 >= r3) goto Laf
            r5 = r0[r4]
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r6 != 0) goto Lac
            boolean r6 = r8.startsWith(r5)
            if (r6 == 0) goto Lac
            java.lang.String r0 = "curDealQBarStr:%s, blockQrcodeStr:%s"
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r5}
            java.lang.String r2 = "MicroMsg.ImageGalleryUI"
            com.tencent.mars.xlog.Log.i(r2, r0, r8)
            return r1
        Lac:
            int r4 = r4 + 1
            goto L90
        Laf:
            return r2
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.j9(java.util.ArrayList):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    @Override // g04.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k5(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            java.lang.String r10 = (java.lang.String) r10
            g04.l r11 = (g04.l) r11
            java.lang.String r0 = r9.x2()
            boolean r10 = r10.equals(r0)
            java.lang.String r1 = "MicroMsg.ImageGalleryUI"
            if (r10 != 0) goto L17
            java.lang.String r10 = "scanTranslate onEnd, not the same image"
            com.tencent.mars.xlog.Log.i(r1, r10)
            goto Le9
        L17:
            java.lang.Class<ry3.j> r10 = ry3.j.class
            i95.m r10 = i95.n0.c(r10)
            ry3.j r10 = (ry3.j) r10
            int r2 = r11.f267470b
            java.util.List r11 = r11.f267469a
            yz3.w r10 = (yz3.w) r10
            boolean r10 = r10.Di(r2, r11)
            r2 = 0
            r3 = 1
            if (r10 == 0) goto L31
            r9.K2 = r3
            r9.L2 = r2
        L31:
            boolean r10 = com.tencent.mm.plugin.scanner.k1.e()
            r4 = 2
            java.lang.String r5 = "MicroMsg.ScannerHelper"
            if (r10 != 0) goto L40
            java.lang.String r10 = "Word Detect Closed"
            com.tencent.mars.xlog.Log.i(r5, r10)
            goto La6
        L40:
            java.lang.Class<c25.e> r10 = c25.e.class
            lm0.a r6 = gm0.j1.s(r10)
            c25.e r6 = (c25.e) r6
            com.tencent.mm.plugin.zero.a r6 = (com.tencent.mm.plugin.zero.a) r6
            ip.j r6 = r6.b()
            java.lang.String r7 = "EnableSessionPicTranslation"
            int r6 = r6.b(r7, r2)
            lm0.a r10 = gm0.j1.s(r10)
            c25.e r10 = (c25.e) r10
            com.tencent.mm.plugin.zero.a r10 = (com.tencent.mm.plugin.zero.a) r10
            ip.j r10 = r10.b()
            java.lang.String r7 = "PicTranslationSupportUserLanguage"
            java.lang.String r10 = r10.d(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            if (r6 != r3) goto L6d
            r8 = r3
            goto L6e
        L6d:
            r8 = r2
        L6e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7[r2] = r8
            r7[r3] = r10
            java.lang.String r8 = com.tencent.mm.sdk.platformtools.m2.d()
            r7[r4] = r8
            java.lang.String r8 = "enable %s, support lang %s, current lang %s"
            com.tencent.mars.xlog.Log.i(r5, r8, r7)
            if (r6 != r3) goto La0
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r10)
            if (r5 != 0) goto La0
            java.lang.String r5 = ";"
            java.lang.String[] r10 = r10.split(r5)
            if (r10 == 0) goto La0
            java.util.List r10 = java.util.Arrays.asList(r10)
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.m2.d()
            boolean r10 = r10.contains(r5)
            if (r10 == 0) goto La0
            goto La4
        La0:
            boolean r10 = o45.wf.f343034l
            if (r10 == 0) goto La6
        La4:
            r10 = r3
            goto La7
        La6:
            r10 = r2
        La7:
            if (r10 == 0) goto Lc9
            int r10 = com.tencent.mm.plugin.scanner.k1.b(r11)
            boolean r4 = com.tencent.mm.plugin.scanner.k1.f(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r5 = r9.K2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r10 = new java.lang.Object[]{r0, r11, r10, r5, r6}
            java.lang.String r11 = "scanTranslate onEnd, img %s, ratioList %s, ratio %d, showOcrMenu: %b, showTranslateMenu: %s"
            com.tencent.mars.xlog.Log.i(r1, r11, r10)
            goto Lcf
        Lc9:
            oc5.m r10 = r9.f200674x2
            r10.g(r3, r4)
            r4 = r2
        Lcf:
            boolean r10 = r9.K2
            if (r4 == 0) goto Ld8
            oc5.m r11 = r9.f200674x2
            r11.g(r3, r3)
        Ld8:
            if (r10 != 0) goto Ldc
            if (r4 == 0) goto Le9
        Ldc:
            com.tencent.mm.ui.widget.dialog.k0 r10 = r9.f200651q2
            if (r10 == 0) goto Le9
            boolean r10 = r10.i()
            if (r10 == 0) goto Le9
            r9.n9(r2)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.k5(java.lang.Object, java.lang.Object):void");
    }

    public final void k7(int i17) {
        java.lang.String H7 = H7();
        if (com.tencent.mm.sdk.platformtools.t8.K0(H7)) {
            return;
        }
        yd5.f.m0(i17, this.f200607f, H7);
    }

    public void k8() {
        com.tencent.mm.ui.chatting.gallery.q3 q3Var;
        int i17;
        com.tencent.mm.ui.chatting.gallery.g4 g4Var;
        com.tencent.mm.ui.chatting.gallery.q3 q3Var2 = this.f200605e3;
        boolean z17 = true;
        if (q3Var2 != null) {
            com.tencent.mm.ui.chatting.gallery.g4 g4Var2 = (com.tencent.mm.ui.chatting.gallery.g4) q3Var2.f201292a.get(q3Var2.f201293b);
            if ((g4Var2 != null ? g4Var2.f200951f : false) && (i17 = (q3Var = this.f200605e3).f201293b) >= 0 && (g4Var = (com.tencent.mm.ui.chatting.gallery.g4) q3Var.f201292a.get(i17)) != null) {
                g4Var.d(true);
            }
            this.f200614g4 = false;
            G7();
            android.view.View view = this.f200606e4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hideOpLayer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "hideOpLayer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            M8();
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!isDestroyed() && !isFinishing()) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "hideOpLayer return, isPageInvalid");
            return;
        }
        if (this.f200614g4) {
            this.f200614g4 = false;
            this.f200653r.getVisibility();
            android.view.animation.Animation B7 = B7(150);
            B7.setFillAfter(false);
            B7.setAnimationListener(new com.tencent.mm.ui.chatting.gallery.a8(this));
            this.f200653r.clearAnimation();
            this.f200653r.startAnimation(B7);
        }
    }

    public final void k9(android.view.View view, boolean z17) {
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showButton", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        oc5.k0 k0Var = oc5.k0.f344445a;
        oc5.k0.f344445a.a(view, true);
    }

    public final void l7(int i17, boolean z17) {
        android.view.View view;
        int i18;
        if ((this.f200623j2 == 1) || r8()) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var == null || k1Var.y(this.O3) == null || isFinishing() || !c01.ia.e(this.f200611g.y(this.O3))) {
            if (m7(1, z17)) {
                R7();
                view = this.f200673x1;
                i18 = 6;
            } else {
                view = null;
                i18 = 0;
            }
            if (view == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "checkShowQuickButton target view null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowQuickButton showType: %d, currentQuickButtonType: %d, targetView: %s, targetView.alpha: %s, targetView.visibility: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.H), view, java.lang.Float.valueOf(view.getAlpha()), java.lang.Integer.valueOf(view.getVisibility()));
            if (i18 == 0) {
                oc5.m mVar = this.f200674x2;
                if (mVar.f(mVar.f344469e)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowQuickButton isAllValid and hideQuickButton");
                    android.view.View view2 = this.I;
                    i8(view2, (this.H == 0 || view2 == null) ? false : true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowQuickButton, hide, updateLaunchAppBrandBubbleView");
                    this.H = 0;
                    this.I = null;
                    return;
                }
                return;
            }
            int i19 = this.H;
            if (i18 != i19) {
                boolean z18 = i19 == 0;
                this.f200679y2 = 0;
                m8(i18, false);
                if (i18 == 6) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowQuickButton, show, TYPE_DETECT_READ_SOURCE_TEXT");
                    T7();
                    if (this.C1 != null) {
                        T7();
                        if (this.C1.getVisibility() != 8) {
                            T7();
                            h9(this.C1, 8);
                        }
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view3 = view;
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkShowQuickButton", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkShowQuickButton", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    k9(view, z18);
                }
                this.H = i18;
                this.I = view;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowQuickButton, show, updateLaunchAppBrandBubbleView");
        }
    }

    public void l8() {
        android.widget.ImageView imageView;
        t9();
        n8();
        h9(this.f200677y0, 8);
        if (com.tencent.mm.ui.chatting.gallery.ja.H()) {
            this.X.setTextColor(i65.a.d(this, com.tencent.mm.R.color.adi));
            com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
            com.tencent.mm.ui.chatting.gallery.ta v17 = k1Var != null ? k1Var.v() : null;
            if (!z8() && o8() && v17 != null && (imageView = v17.f201437o) != null) {
                imageView.setVisibility(8);
            }
        } else {
            this.X.setTextColor(i65.a.d(this, com.tencent.mm.R.color.BW_100_Alpha_0_6_5));
        }
        S7();
        this.f200646p0.clearAnimation();
        S7();
        h9(this.f200646p0, 8);
        O7();
        h9(this.f200629l1.f201458a, 8);
        X7();
        h9(this.f200610f4, 8);
        Q7();
        h9(this.f200678y1, 8);
        R7();
        h9(this.f200673x1, 8);
        B8();
        b9(false);
        j8();
        this.f200653r.setVisibility(8);
        M8();
    }

    public void l9(boolean z17, int i17) {
        com.tencent.mm.ui.chatting.gallery.q3 q3Var;
        if (I7() != i17 || (q3Var = this.f200605e3) == null) {
            return;
        }
        if (z17) {
            com.tencent.mm.ui.chatting.gallery.q3.b(q3Var, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s(), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490893n84));
        } else {
            com.tencent.mm.ui.chatting.gallery.q3.a(q3Var, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$t());
        }
    }

    public final boolean m7(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowReadSourceNew, scene = %s", java.lang.Integer.valueOf(i17));
        if (i17 != 1) {
            if (i17 != 2) {
                return false;
            }
            com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
            com.tencent.mm.storage.f9 w17 = k1Var == null ? null : k1Var.w();
            if (w17 == null) {
                return false;
            }
            return n7(w17);
        }
        boolean z18 = !r8() && this.f200674x2.f(6);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowReadSourceTextButton isValid: %s", java.lang.Boolean.valueOf(z18));
        if (z18 && this.f200674x2.a(6)) {
            R7();
            h9(this.f200673x1, 0);
            return true;
        }
        if (!z17 || h8()) {
            return false;
        }
        R7();
        if (this.f200673x1 == null) {
            return false;
        }
        R7();
        if (this.f200673x1.getVisibility() != 0) {
            return false;
        }
        R7();
        h9(this.f200673x1, 8);
        return false;
    }

    public final void m8(int i17, boolean z17) {
        if ((this.f200623j2 == 1) || r8()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "hideQuickButton showType: %d, withAnimation: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (i17 != 6) {
            R7();
            i8(this.f200673x1, z17);
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "hideQuickButton, hide, updateLaunchAppBrandBubbleView");
        } else {
            this.H = 0;
            this.I = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9(boolean r19, com.tencent.mm.ui.chatting.gallery.m8 r20) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.m9(boolean, com.tencent.mm.ui.chatting.gallery.m8):void");
    }

    public final boolean n7(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.modelmulti.BizScreenshotMsgInfo T8 = T8(f9Var);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(T8 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowReadSourceScreenshot, bizScreenshotMsgInfo exists: %b", objArr);
        if (T8 != null && T8.a() && ((qv.s) ((qk.r6) i95.n0.c(qk.r6.class))).Ai()) {
            R7();
            h9(this.f200673x1, 0);
            return true;
        }
        com.tencent.mm.modelmulti.SourceImgInfo a17 = com.tencent.mm.modelmulti.SourceImgInfo.a(f9Var);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Boolean.valueOf(a17 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkShowReadSourceScreenshot, sourceImgInfo exists: %b", objArr2);
        if (a17 == null || a17.f71259e != 11) {
            R7();
            h9(this.f200673x1, 8);
            return false;
        }
        R7();
        h9(this.f200673x1, 0);
        return true;
    }

    public void n8() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "hide video tool bar");
        U7();
        h9(this.L1, 8);
        U7();
        h9(this.U1, 8);
        h9(this.M, 8);
        h9(this.T, 8);
        h9(this.W3, 8);
        h9(this.P, 8);
        B9();
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x05e4, code lost:
    
        if (r0.intValue() != 2) goto L248;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023e  */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.tencent.mm.ui.widget.dialog.k0] */
    /* JADX WARN: Type inference failed for: r1v43, types: [com.tencent.mm.ui.widget.dialog.k0] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [int] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n9(boolean r22) {
        /*
            Method dump skipped, instructions count: 1897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.n9(boolean):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return !r8();
    }

    public final void o7(int i17) {
        boolean z17;
        java.lang.String H7 = H7();
        rv.d a17 = rv.d.a(H7 == null ? "" : H7);
        com.tencent.mm.storage.f9 w17 = this.f200611g.w();
        android.content.Intent intent = new android.content.Intent();
        if (w17 != null) {
            z17 = com.tencent.mm.storage.z3.R4(w17.Q0());
            intent.putExtra("msgUsername", a8(w17, z17));
        } else {
            z17 = false;
        }
        int intExtra = getIntent().getIntExtra("KOpenArticleSceneFromScene", z17 ? qf1.f.CTRL_INDEX : qf1.j.CTRL_INDEX);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i18 = a17.f399839d;
        java.lang.String a18 = ot0.g0.a(H7, i18, intExtra, currentTimeMillis);
        intent.putExtra("geta8key_scene", 101);
        intent.putExtra("geta8key_username", F7());
        m11.p0.b(this, a18, intent, new com.tencent.mm.ui.chatting.gallery.s7(this, i18, intExtra, intent));
        yd5.f.m0(i17, this.f200607f, H7);
    }

    public final boolean o8() {
        return this.f200633m == com.tencent.mm.ui.chatting.gallery.f2.video;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o9(boolean z17) {
        boolean z18;
        int visibility;
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout;
        com.tencent.mm.ui.chatting.gallery.q3 q3Var;
        int i17;
        com.tencent.mm.ui.chatting.gallery.g4 g4Var;
        com.tencent.mm.ui.chatting.gallery.q3 q3Var2 = this.f200605e3;
        if (q3Var2 != null) {
            com.tencent.mm.ui.chatting.gallery.g4 g4Var2 = (com.tencent.mm.ui.chatting.gallery.g4) q3Var2.f201292a.get(q3Var2.f201293b);
            if (!(g4Var2 != null ? g4Var2.f200951f : false) && (i17 = (q3Var = this.f200605e3).f201293b) >= 0 && (g4Var = (com.tencent.mm.ui.chatting.gallery.g4) q3Var.f201292a.get(i17)) != null) {
                g4Var.j(true);
            }
            this.f200614g4 = true;
            G7();
            android.view.View view = this.f200606e4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showOpLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showOpLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            K8();
            return;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if ((isDestroyed() || isFinishing()) == true) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "showOpLayer return, isPageInvalid");
            return;
        }
        if (E7() && z17 && (touchMediaPreviewLayout = this.X1) != null && touchMediaPreviewLayout.getAddTouchView()) {
            this.X1.f();
        }
        if (this.f200659t) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        com.tencent.mm.storage.f9 w17 = k1Var != null ? k1Var.w() : null;
        if (w17 == null) {
            return;
        }
        if (c01.ia.z(w17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "ignore show opLayer");
            return;
        }
        if (this.f200614g4) {
            z18 = true;
        } else {
            this.f200653r.getVisibility();
            this.f200653r.clearAnimation();
            android.widget.RelativeLayout relativeLayout = this.f200653r;
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150L);
            alphaAnimation.setFillAfter(true);
            relativeLayout.startAnimation(alphaAnimation);
            z18 = false;
        }
        this.f200681z = 0;
        this.f200614g4 = true;
        this.f200653r.setVisibility(0);
        this.Y2 = true;
        X7();
        android.view.View view2 = this.f200610f4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showOpLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showOpLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!r8()) {
            h9(this.f200677y0, this.Z ? 8 : 0);
            h9(this.f200677y0, q8() ? 4 : this.f200677y0.getVisibility());
            S7();
            h9(this.f200646p0, (!this.f200683z2 || this.Z) ? 8 : 0);
            S7();
            android.view.View view3 = this.f200646p0;
            if (q8()) {
                visibility = 0;
            } else {
                S7();
                visibility = this.f200646p0.getVisibility();
            }
            h9(view3, visibility);
            int i18 = this.f200681z;
            boolean z19 = this.Z;
            this.f200681z = i18 + (!z19 ? 1 : 0) + ((!this.f200683z2 || z19) ? 0 : 1);
        }
        com.tencent.mm.ui.chatting.gallery.f2 f2Var = this.f200633m;
        int i19 = f2Var != com.tencent.mm.ui.chatting.gallery.f2.image ? 0 : 1;
        if (f2Var == com.tencent.mm.ui.chatting.gallery.f2.video) {
            i19 = 1;
        }
        if ((((w17.F & 1048576) != 0) != false ? true : c01.ia.B(w17)) || c01.ia.y(w17) || c01.ia.C(w17) || c01.ia.e(w17)) {
            i19 = 0;
        }
        if (r8()) {
            i19 = 0;
        }
        O7();
        android.view.View view4 = this.f200629l1.f201458a;
        if (!z17) {
            h9(view4, i19 != 0 ? 0 : 8);
        } else if (i19 != 0) {
            k9(view4, view4.getVisibility() != 0);
        } else {
            i8(view4, true);
        }
        this.f200681z += i19;
        c9();
        if (!z17) {
            l7(0, true);
        } else if (!p8()) {
            m8(0, z18);
        }
        com.tencent.mm.modelmulti.WxaInfo X8 = X8(w17);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(X8 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "showLaunchAppBrandButtonIfNeed, wxaInfo exists: %b", objArr);
        if (X8 == null || !this.Y2) {
            Q7();
            h9(this.f200678y1, 8);
        } else {
            Q7();
            h9(this.f200678y1, 0);
            Q7();
            this.f200678y1.setContentDescription(getString(com.tencent.mm.R.string.a4m, X8.f71262e));
            this.J3 = X8;
            m9(true, com.tencent.mm.ui.chatting.gallery.m8.Stable);
        }
        r9();
        com.tencent.mm.modelmulti.SourceImgInfo V8 = V8(w17);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = java.lang.Boolean.valueOf(V8 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "showLaunchImgSrcInfoButtonIfNeed, imgSrcInfo exists: %b", objArr2);
        if (V8 != null) {
            int i27 = V8.f71259e;
            if (i27 == 0 || i27 == 1) {
                P7();
                android.view.View view5 = this.A1;
                if ((view5 != null ? view5.getVisibility() : 8) != 0) {
                    ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).Di(2, V8.f71258d);
                }
                P7();
                h9(this.A1, 0);
                P7();
                this.A1.setContentDescription(getString(com.tencent.mm.R.string.d3u));
            } else if (i27 == 15) {
                P7();
                h9(this.A1, 0);
                P7();
                this.A1.setContentDescription(getString(com.tencent.mm.R.string.nit));
            }
        } else {
            P7();
            h9(this.A1, 8);
        }
        m7(2, false);
        if (o8()) {
            q9();
            G7();
            android.view.View view6 = this.f200606e4;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showOpLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showOpLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f9(0);
        } else {
            if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_click_image_close_gallery_enable, 0) == 1) != false) {
                n8();
                G7();
                android.view.View view7 = this.f200606e4;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showOpLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showOpLayer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f9(4);
            }
        }
        b9(true);
        K8();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.webview.ui.tools.media.n0 n0Var = this.f200619i;
        if (n0Var != null) {
            n0Var.a(this, i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "onBackPressed");
        if (g7()) {
            return;
        }
        b8();
        if (this.B1.getVisibility() == 0) {
            b8();
            this.B1.d(this.V2.longValue(), this.f200663u2.f344455e);
            return;
        }
        this.Z = false;
        this.Y.setVisibility(8);
        if (this.A2 && !s8()) {
            x7(1);
            return;
        }
        try {
            com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
            r4Var.f201335c.clear();
            r4Var.b();
            r4Var.f201334b = false;
            Y8();
            k8();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", e17.getMessage());
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v130, types: [g90.s] */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v89, types: [g90.s] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.Object obj;
        android.view.Display display;
        int i17;
        java.lang.String str2;
        boolean z17;
        boolean z18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f200611g == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.dgu) {
            this.f200611g.w();
            J8("pic_video_wall");
            x7(0);
        }
        int id6 = view.getId();
        com.tencent.mm.ui.report.i0 i0Var = com.tencent.mm.ui.report.i0.Click3DotBtn;
        if (id6 == com.tencent.mm.R.id.ozx) {
            com.tencent.mm.ui.report.KV17560Reporter.c(this).b(i0Var);
            final com.tencent.mm.storage.f9 w17 = this.f200611g.w();
            com.tencent.mm.ui.chatting.manager.t.a(w17, getContext(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$u
                @Override // java.lang.Runnable
                public final void run() {
                    int i18 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this;
                    imageGalleryUI.t7(w17, imageGalleryUI.D9().booleanValue());
                    imageGalleryUI.k7(6);
                    imageGalleryUI.J8("pic_video_forward");
                    imageGalleryUI.i7(6);
                }
            });
        } else if (view.getId() == com.tencent.mm.R.id.t1l) {
            com.tencent.mm.ui.report.KV17560Reporter.c(this).b(i0Var);
            if (q8()) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 0, true);
                k0Var.f211872n = new com.tencent.mm.ui.chatting.gallery.h6(this);
                k0Var.f211881s = this.M3;
                k0Var.v();
                yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f200668w = false;
            this.T3 = 2;
            u7(2, L7(this.f200611g, this.f200637n), com.tencent.mm.vfs.w6.i(x2(), false), this.F, false, this.f200624j3);
            p7(x2(), true);
            n9(false);
            if (g8(2) && j9(this.f200663u2.f344451a)) {
                if (this.f200663u2.f344451a.size() == 1) {
                    com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) this.f200663u2.f344451a.get(0);
                    oc5.l0 l0Var = this.f200663u2;
                    l0Var.f344453c = imageQBarDataBean;
                    l0Var.f344452b = null;
                    ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) this.Z2).j(imageQBarDataBean.f158620e, N7(imageQBarDataBean.f158619d), 1000L);
                } else {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) com.tencent.mm.plugin.scanner.c0.a(this, L7(this.f200611g, this.f200637n), this.f200663u2.f344451a, 0).f302833d;
                    if (arrayList2.size() == 1) {
                        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean2 = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList2.get(0);
                        oc5.l0 l0Var2 = this.f200663u2;
                        l0Var2.f344452b = imageQBarDataBean2;
                        l0Var2.f344453c = imageQBarDataBean2;
                        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) this.Z2).j(imageQBarDataBean2.f158620e, N7(imageQBarDataBean2.f158619d), 1000L);
                    } else {
                        oc5.l0 l0Var3 = this.f200663u2;
                        l0Var3.f344452b = null;
                        l0Var3.f344453c = null;
                    }
                }
            }
            J8("pic_video_three_dot");
        } else {
            int id7 = view.getId();
            com.tencent.mm.ui.report.i0 i0Var2 = com.tencent.mm.ui.report.i0.ClickSaveBtn;
            if (id7 == com.tencent.mm.R.id.d2y) {
                com.tencent.mm.ui.report.KV17560Reporter.c(this).b(i0Var2);
                if (this.f200611g.w().isVideo()) {
                    com.tencent.mm.storage.f9 w18 = this.f200611g.w();
                    if (!D9().booleanValue()) {
                        this.V.performClick();
                    } else if (v8(w18)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "is downloading origin video,will mark auto save origin video[%s]", w18.z0());
                        v9(com.tencent.mm.ui.chatting.gallery.s.f201347e, this.f200637n.getCurrentItem());
                        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
                        e4Var.f211776c = getText(com.tencent.mm.R.string.obl);
                        e4Var.c();
                        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
                        java.lang.Long valueOf = java.lang.Long.valueOf(w18.getMsgId());
                        k1Var.getClass();
                        com.tencent.mm.ui.chatting.gallery.l lVar = com.tencent.mm.ui.chatting.gallery.l.f201163a;
                        com.tencent.mm.ui.chatting.gallery.l.f201165c.put(java.lang.Long.valueOf(valueOf.longValue()), java.lang.Boolean.TRUE);
                    } else {
                        this.V.performClick();
                    }
                } else {
                    q7();
                    if (this.f200611g.w() != null && this.f200611g.w().J2()) {
                        ?? r27 = this.A2 ? 3 : this.f200611g.w().getMsgId() != this.O2 ? 2 : this.B2;
                        J8("pic_video_save");
                        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).nj(this.f200611g.w(), 2, r27, 1);
                    }
                }
            } else if (view.getId() == com.tencent.mm.R.id.cnb) {
                com.tencent.mm.storage.f9 w19 = this.f200611g.w();
                J8("pic_video_full_image");
                if (w19 != null && ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).fj(w19) <= 0) {
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(this);
                    e4Var2.f211776c = getText(com.tencent.mm.R.string.ncx);
                    e4Var2.c();
                    c9();
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                this.M2 = 2;
                this.J2 = 0;
                this.f200611g.V(this.f200637n.getCurrentItem(), false);
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).wj(this.f200611g.w());
            } else if (view.getId() == com.tencent.mm.R.id.cnc) {
                com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = this.f200611g;
                com.tencent.mm.storage.f9 y17 = k1Var2.y(I7());
                if (y17 != null && com.tencent.mm.ui.chatting.gallery.k1.L(y17)) {
                    com.tencent.mm.ui.chatting.gallery.t2 t2Var = k1Var2.f201097o;
                    t2Var.getClass();
                    m11.b0 v17 = com.tencent.mm.ui.chatting.gallery.t2.v(y17);
                    if (v17 != null) {
                        com.tencent.mm.ui.chatting.gallery.k1 k1Var3 = t2Var.f200886d;
                        if (k1Var3 != null) {
                            k1Var3.T(y17, null, 1, cm.b.cancel);
                        }
                        if (com.tencent.mm.ui.chatting.gallery.ua.a().f201497d.contains(tg3.l1.a(y17))) {
                            com.tencent.mm.ui.chatting.gallery.ua a17 = com.tencent.mm.ui.chatting.gallery.ua.a();
                            a17.f201497d.remove(tg3.l1.a(y17));
                            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).g(v17.f322633a, tg3.l1.a(y17), 1, a17);
                            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).e(v17.f322633a, tg3.l1.a(y17), 1);
                        } else {
                            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).g(v17.f322633a, tg3.l1.a(y17), 1, t2Var);
                            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).e(v17.f322633a, tg3.l1.a(y17), 1);
                        }
                    }
                }
                com.tencent.mm.ui.chatting.gallery.q3.c(this.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$a(), null, java.lang.Boolean.FALSE);
                int I7 = I7();
                y9(I7, this.f200611g.y(I7), false);
            } else if (view.getId() == com.tencent.mm.R.id.t1m) {
                com.tencent.mm.ui.report.KV17560Reporter.c(this).b(i0Var2);
                q7();
                if (this.f200611g.w() != null && (this.f200611g.w().isVideo() || this.f200611g.w().J2())) {
                    ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).nj(this.f200611g.w(), 1, this.A2 ? 3 : this.f200611g.w().getMsgId() != this.O2 ? 2 : this.B2, 1);
                    J8("pic_video_save");
                }
            } else if (view.getId() == com.tencent.mm.R.id.t1o) {
                F8();
            } else if (view.getId() == com.tencent.mm.R.id.actionbar_up_indicator) {
                onBackPressed();
            } else if (view.getId() == com.tencent.mm.R.id.f487545oy5) {
                onBackPressed();
            } else if (view.getId() == com.tencent.mm.R.id.jdi) {
                boolean isChecked = this.f200667v3.isChecked();
                if (!isChecked && com.tencent.mm.ui.chatting.gallery.p4.f201265a.f() >= 9) {
                    dp.a.makeText(this, getResources().getString(com.tencent.mm.R.string.fjk, 9), 1).show();
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else {
                    this.f200667v3.setChecked(!isChecked);
                    if (this.f200667v3.isChecked()) {
                        com.tencent.mm.ui.chatting.gallery.p4.f201265a.a(this.f200611g.w());
                    } else {
                        com.tencent.mm.ui.chatting.gallery.p4.f201265a.e(this.f200611g.w());
                    }
                }
            } else {
                if (view.getId() != com.tencent.mm.R.id.kwj) {
                    if (view.getId() == com.tencent.mm.R.id.p1o) {
                        com.tencent.mm.storage.f9 w27 = this.f200611g.w();
                        if (w27 != null) {
                            t21.v2 h17 = t21.d3.h(w27.z0());
                            ((c35.m) i95.n0.c(c35.m.class)).getClass();
                            if (((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Zi(w27) <= 0) {
                                int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                                com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(this);
                                e4Var3.f211776c = getText(com.tencent.mm.R.string.obm);
                                e4Var3.c();
                            } else if (w8(h17, w27)) {
                                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                                java.lang.String z07 = w27.z0();
                                ((vf0.y1) x1Var).getClass();
                                int i28 = t21.d3.h(z07).f415011i;
                                if (i28 == 112) {
                                    z17 = true;
                                } else {
                                    z17 = ((i28 == 121 || i28 == 122 || i28 == 120 || i28 == 123) && this.f200611g.w().getMsgId() == w27.getMsgId()) ? ((com.tencent.mm.ui.chatting.gallery.ja) this.f200611g.f201098p).f201081v : false;
                                }
                                if (z17 && D9().booleanValue()) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "save origin video,will cancel save thumb video(just clear flag,not stop online task)");
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "cancelSaveThumbVideo msgInfo:%s", java.lang.Long.valueOf(w27.getMsgId()));
                                    this.f200611g.f201098p.n(w27);
                                    v9(com.tencent.mm.ui.chatting.gallery.s.f201347e, this.f200637n.getCurrentItem());
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                com.tencent.mm.ui.chatting.gallery.k1 k1Var4 = this.f200611g;
                                int I72 = I7();
                                com.tencent.mm.ui.chatting.gallery.j1 j1Var = k1Var4.f201098p;
                                str = "(Landroid/view/View;)V";
                                if (j1Var != null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "viewOriginVideo, pos = " + I72);
                                    com.tencent.mm.storage.f9 y18 = j1Var.f200886d.y(I72);
                                    if (y18 == null || y18.getMsgId() == 0) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.Imagegallery.handler.video", "msg is null");
                                    } else if (com.tencent.mm.ui.chatting.gallery.k1.N(y18)) {
                                        t21.v2 s17 = com.tencent.mm.ui.chatting.gallery.j1.s(y18);
                                        if (s17 == null) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "no video info for download origin video");
                                        } else {
                                            t21.j3 d17 = t21.j3.f414800h.d(s17.g());
                                            if (d17 == null || com.tencent.mm.sdk.platformtools.t8.K0(d17.f414806d)) {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "no origin video cdn url");
                                            } else {
                                                com.tencent.mm.ui.chatting.gallery.g gVar = new com.tencent.mm.ui.chatting.gallery.g(y18, s17, new ok4.c(java.lang.System.currentTimeMillis()), d17);
                                                com.tencent.mm.ui.chatting.gallery.f fVar = new com.tencent.mm.ui.chatting.gallery.f(y18, s17.d(), true);
                                                fk4.k kVar = new fk4.k(gVar);
                                                kVar.b(fVar);
                                                kVar.f263624l = j1Var;
                                                if (kVar.o()) {
                                                    com.tencent.mm.ui.chatting.gallery.l.f201163a.c(y18, kVar);
                                                    j1Var.f201043f = new yd5.p(y18, s17.d(), false, 4);
                                                    if (z18) {
                                                        com.tencent.mm.ui.chatting.gallery.p pVar = com.tencent.mm.ui.chatting.gallery.p.f201254a;
                                                        long msgId = y18.getMsgId();
                                                        java.util.HashMap hashMap = com.tencent.mm.ui.chatting.gallery.p.f201257d;
                                                        if (pVar.a(msgId)) {
                                                            hashMap.remove(java.lang.Long.valueOf(msgId));
                                                        }
                                                        com.tencent.mm.ui.chatting.gallery.l.f201165c.put(java.lang.Long.valueOf(y18.getMsgId()), java.lang.Boolean.TRUE);
                                                    }
                                                    yd5.p pVar2 = j1Var.f201043f;
                                                    pVar2.getClass();
                                                    pVar2.f461134f = java.lang.System.currentTimeMillis();
                                                }
                                            }
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.Imagegallery.handler.video", "not video can't download origin");
                                    }
                                }
                                t23.p0.n().c(new com.tencent.mm.ui.chatting.gallery.b8(this, t21.d3.l(w27.z0())));
                                J8("pic_video_full_image");
                                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).wj(this.f200611g.w());
                            }
                        }
                        str = "(Landroid/view/View;)V";
                        J8("pic_video_full_image");
                        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).wj(this.f200611g.w());
                    } else {
                        str = "(Landroid/view/View;)V";
                        if (view.getId() == com.tencent.mm.R.id.p1r || view.getId() == com.tencent.mm.R.id.f487576vn5) {
                            com.tencent.mm.ui.chatting.gallery.k1 k1Var5 = this.f200611g;
                            int I73 = I7();
                            com.tencent.mm.ui.chatting.gallery.j1 j1Var2 = k1Var5.f201098p;
                            if (j1Var2 != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "viewOriginVideo, pos = " + I73);
                                com.tencent.mm.storage.f9 y19 = j1Var2.f200886d.y(I73);
                                if (y19 == null || y19.getMsgId() == 0) {
                                    obj = null;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.Imagegallery.handler.video", "msg is null");
                                } else if (com.tencent.mm.ui.chatting.gallery.k1.N(y19)) {
                                    t21.v2 s18 = com.tencent.mm.ui.chatting.gallery.j1.s(y19);
                                    if (s18 == null) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video", "no video info for download origin video");
                                    } else {
                                        fk4.k d18 = com.tencent.mm.ui.chatting.gallery.l.f201163a.d(y19.getMsgId());
                                        if (d18 != null) {
                                            d18.p();
                                            yd5.p pVar3 = j1Var2.f201043f;
                                            if (pVar3 != null) {
                                                pVar3.f461135g.f61602l = a06.d.c(((float) (java.lang.System.currentTimeMillis() - pVar3.f461134f)) / 1000.0f);
                                                j1Var2.f201043f.a();
                                            }
                                            yd5.p pVar4 = new yd5.p(y19, s18.d(), false, 5);
                                            j1Var2.f201043f = pVar4;
                                            pVar4.a();
                                            obj = null;
                                            j1Var2.f201043f = null;
                                        }
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.Imagegallery.handler.video", "not video can't download origin");
                                }
                                com.tencent.mm.ui.chatting.gallery.q3.c(this.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$c0(), obj, java.lang.Boolean.FALSE);
                                h9(this.Q, 8);
                                h9(this.S, 8);
                                R8(I7());
                                display = getContentView().getDisplay();
                                if (display != null && display.getRotation() != 0 && display.getRotation() != 2) {
                                    ((c35.m) i95.n0.c(c35.m.class)).getClass();
                                }
                                o9(false);
                            }
                            obj = null;
                            com.tencent.mm.ui.chatting.gallery.q3.c(this.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$c0(), obj, java.lang.Boolean.FALSE);
                            h9(this.Q, 8);
                            h9(this.S, 8);
                            R8(I7());
                            display = getContentView().getDisplay();
                            if (display != null) {
                                ((c35.m) i95.n0.c(c35.m.class)).getClass();
                            }
                            o9(false);
                        } else if (view.getId() == com.tencent.mm.R.id.tzc) {
                            if (h8()) {
                                G8(4);
                            } else {
                                com.tencent.mm.ui.report.KV17560Reporter.c(this).b(com.tencent.mm.ui.report.i0.ClickReadOrigBtn);
                                o7(4);
                                J8("pic_video_read_origin");
                            }
                        } else if (view.getId() == com.tencent.mm.R.id.f485093gi1) {
                            A8(1265);
                            com.tencent.mm.ui.report.KV17560Reporter.c(this).b(com.tencent.mm.ui.report.i0.ClickWXABtn);
                            com.tencent.mm.modelmulti.WxaInfo W8 = W8();
                            if (W8 == null || W8.f71266i != 1) {
                                I8(com.tencent.mm.plugin.appbrand.service.a0.f88619e, com.tencent.mm.plugin.appbrand.service.z.f88840f, null);
                            } else {
                                java.lang.String F7 = F7();
                                int a18 = k01.d.a(F7);
                                int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(F7);
                                com.tencent.mm.plugin.appbrand.service.e5 e5Var = (com.tencent.mm.plugin.appbrand.service.e5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.e5.class);
                                java.lang.String b17 = W8.b();
                                int h18 = gm0.j1.b().h();
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                java.lang.String str3 = W8.f71261d;
                                java.lang.String str4 = W8.f71264g;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                ((com.tencent.mm.plugin.appbrand.report.h0) e5Var).wi(b17, h18, a18, F7, wi6, "", currentTimeMillis, 3, str3, str4, W8.a());
                            }
                            J8("pic_video_miniapp");
                        } else if (view.getId() == com.tencent.mm.R.id.r_9) {
                            android.content.Context context = view.getContext();
                            try {
                                com.tencent.mm.modelmulti.SourceImgInfo U8 = U8();
                                if (U8 != null) {
                                    int i29 = U8.f71259e;
                                    com.tencent.mm.ui.chatting.gallery.b3 b3Var = com.tencent.mm.ui.chatting.gallery.b3.f200810a;
                                    if (i29 == 15) {
                                        b3Var.a(U8, this.f200607f);
                                    } else {
                                        java.lang.String str5 = U8.f71258d;
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                                            ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).Di(4, str5);
                                            if (str5.startsWith("liteapp://")) {
                                                android.net.Uri parse = android.net.Uri.parse(str5);
                                                java.lang.String host = parse.getHost();
                                                java.lang.String queryParameter = parse.getQueryParameter(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                                                java.lang.String queryParameter2 = parse.getQueryParameter("query");
                                                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "url: " + str5 + ", host: " + parse.getHost() + ", path: " + queryParameter + ", query: " + queryParameter2);
                                                q80.d0 d0Var = new q80.d0();
                                                d0Var.f360649a = host;
                                                d0Var.f360650b = queryParameter;
                                                d0Var.f360651c = queryParameter2;
                                                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new com.tencent.mm.ui.chatting.gallery.t7(this, d0Var));
                                            } else if (!b3Var.a(U8, this.f200607f)) {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "dealImgSourceInfo, fallback to origin url");
                                                android.content.Intent intent = new android.content.Intent();
                                                intent.putExtra("rawUrl", str5);
                                                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                                            }
                                        }
                                    }
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "dealImgSourceInfo handle Exception, " + e17.getMessage());
                            }
                        } else if (view.getId() == com.tencent.mm.R.id.t1f) {
                            com.tencent.mm.storage.f9 w28 = this.f200611g.w();
                            if (w28 != null && (w28.isVideo() || w28.J2())) {
                                boolean z19 = this.B2;
                                if (this.A2) {
                                    i17 = 3;
                                } else {
                                    i17 = z19;
                                    if (w28.getMsgId() != this.O2) {
                                        i17 = 2;
                                    }
                                }
                                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(this, w28, 1, 2, i17, d7(w28));
                                J8("pic_video_close");
                            }
                            com.tencent.mm.ui.report.KV17560Reporter.c(this).b(com.tencent.mm.ui.report.i0.ClickCrossBtnToClose);
                            onBackPressed();
                        }
                    }
                    str2 = str;
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "android/view/View$OnClickListener", "onClick", str2);
                }
                boolean z86 = z8();
                if (this.f200611g != null) {
                    ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).rj(this, this.f200611g.w(), 2, "video_play_btn", z86 ? 2 : 1);
                }
                com.tencent.mm.ui.chatting.gallery.k1 k1Var6 = this.f200611g;
                int currentItem = this.f200637n.getCurrentItem();
                k1Var6.f201098p.A(k1Var6.y(currentItem), currentItem);
            }
        }
        str2 = "(Landroid/view/View;)V";
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "android/view/View$OnClickListener", "onClick", str2);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sy3.c cVar = this.f200639n3;
        if (cVar != null) {
            ((kz3.l) cVar).d(configuration);
        }
        boolean z17 = com.tencent.mm.ui.bk.N(getTaskId()) || com.tencent.mm.ui.bk.P(this);
        hashCode();
        int i17 = configuration.orientation;
        if (i17 == 1 || z17) {
            hashCode();
            this.G = true;
            android.view.View decorView = getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.ui.chatting.gallery.g8(this, decorView));
            return;
        }
        if (i17 == 2) {
            hashCode();
            this.G = true;
            android.view.View decorView2 = getWindow().getDecorView();
            decorView2.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.ui.chatting.gallery.h8(this, decorView2));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.storage.f9 y17;
        this.f200623j2 = getIntent().getIntExtra("msg_type", 0);
        this.f200630l2 = getIntent().getIntExtra("key_quote_msg_wait_send", 0) == 1;
        if (getIntent().getBooleanExtra("img_gallery_enter_use_share_element_anim", false)) {
            ((wa5.j) component(wa5.j.class)).f444323d.a(this.D3);
        }
        if (!isVASValid()) {
            requestWindowFeature(1);
        }
        com.tencent.mm.ui.bk.u0(this);
        if (r8()) {
            setTheme(com.tencent.mm.R.style.f494383ll);
        }
        this.f200680y3 = java.lang.System.currentTimeMillis();
        this.f200675x3 = true;
        super.onCreate(bundle);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigImageGalleryUIViewPager()) == 1) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "onCreate: enable viewpager new");
            this.f200605e3 = new com.tencent.mm.ui.chatting.gallery.q3(this);
        }
        this.f200662u = getIntent().getBooleanExtra("img_enter_from_float_ball", false);
        if (r8()) {
            setMMTitle("");
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.ui.chatting.gallery.z4(this));
            setBackBtn(new com.tencent.mm.ui.chatting.gallery.a5(this));
        } else {
            if (isVASValid()) {
                android.view.Window window = getWindow();
                if (fp.e0.d() || fp.e0.b()) {
                    getWindow().setFlags(201327616, 201327616);
                } else if (fp.e0.c() || fp.e0.i() || fp.e0.e()) {
                    window.setFlags(134218752, 134218752);
                } else {
                    window.setFlags(134217728, 134217728);
                }
                setActionbarColor(0);
                android.view.View decorView = getWindow().getDecorView();
                decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(1028);
                getSupportActionBar().o();
            } else {
                if (fp.h.c(19)) {
                    getWindow().setFlags(201327616, 201327616);
                    this.f200656s = true;
                } else {
                    getWindow().setFlags(1024, 1024);
                    this.f200656s = false;
                }
                setLightNavigationbarIcon();
            }
            getController().I();
        }
        ((ic5.b) component(ic5.b.class)).f290428d = getIntent().getStringExtra("img_gallery_talker");
        ic5.b bVar = (ic5.b) component(ic5.b.class);
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_from_news_jump", false);
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUIMediaGroupReportUIC", "setIsFromNewsJump, " + booleanExtra);
        bVar.f290429e = booleanExtra;
        ((ic5.b) component(ic5.b.class)).f290431g = getIntent().getIntExtra("key_enter_scene", 0);
        initView();
        ic5.b bVar2 = (ic5.b) component(ic5.b.class);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        bVar2.f290430f = k1Var;
        lc5.p pVar = new lc5.p(new lc5.u(this, k1Var, this.f200637n, this.W1, this.f200653r));
        this.f200641o = pVar;
        pVar.u0(51, this.O2, this.Q1, this.f200599d);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = this.f200611g;
        if (k1Var2 != null) {
            this.f200591a3.c(1, com.tencent.mm.ui.chatting.gallery.t2.v(k1Var2.w()));
            if (this.A2) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).fj(this, this.f200611g.w(), 1, 0, 3, new yz5.l() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$h0
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                        return ((ic5.b) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.component(ic5.b.class)).T6((java.lang.String) obj);
                    }
                });
            } else if (this.B2) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).fj(this, this.f200611g.w(), 1, 0, 1, new yz5.l() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$i0
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                        return ((ic5.b) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.component(ic5.b.class)).T6((java.lang.String) obj);
                    }
                });
            }
        }
        this.N2 = bundle;
        this.N3.alive();
        this.f200652q3.alive();
        this.f200665v = false;
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.ui.chatting.gallery.b5 b5Var = new com.tencent.mm.ui.chatting.gallery.b5(this);
        ((jd0.q2) x2Var).getClass();
        this.Z2 = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(context, b5Var, this);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var3 = this.f200611g;
        if (k1Var3 != null && (y17 = k1Var3.y(this.O3)) != null) {
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(y17.getMsgId()), y17.Q0());
            v02.f0 f0Var = (v02.f0) ((a00.j) i95.n0.c(a00.j.class));
            f0Var.getClass();
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                kotlinx.coroutines.l.d(f0Var.qj(), null, null, new v02.r(f0Var, y17, null), 3, null);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.DupCheckReportFeatureService", "reportBeforeMenuExp with MsgInfo is not supported in non-main process");
            }
        }
        java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.chatting.gallery.n4 n4Var = (com.tencent.mm.ui.chatting.gallery.n4) component(com.tencent.mm.ui.chatting.gallery.n4.class);
        java.lang.String str = this.f200599d;
        java.lang.String str2 = str != null ? str : "";
        n4Var.getClass();
        if ((j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigImageGalleryRevokeEnabled()) == 1) && !n4Var.f201212e) {
            n4Var.f201213f = str2;
            n4Var.f201212e = true;
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(n4Var, android.os.Looper.getMainLooper());
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryRevokeUIC", "startListening for talker=".concat(str2));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.app.Dialog dialog;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "%d image gallery ui on destroy", java.lang.Integer.valueOf(hashCode()));
        this.V1 = true;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f200651q2;
        if (k0Var != null && k0Var.i() && isVASValid() && (dialog = this.f200651q2.f211864i) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", " hide mBottomSheet!!");
            dialog.dismiss();
        }
        yd5.q.f461145a.b(this.f200607f ? 2 : 1);
        try {
            if (this.f200611g != null) {
                C9(this.O3);
                this.f200676y.d(this, this.O3, 0);
                com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
                com.tencent.mm.ui.chatting.gallery.t2 t2Var = k1Var.f201097o;
                t2Var.f200886d = null;
                t2Var.f201383e.dead();
                java.util.HashMap hashMap = t2Var.f201387i;
                if (hashMap != null) {
                    java.util.Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.lang.ref.WeakReference) hashMap.get(it.next())).get();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryHolderImage", "recycle bitmap:%s", bitmap.toString());
                            bitmap.recycle();
                        }
                    }
                }
                com.tencent.mm.ui.chatting.gallery.k3 k3Var = t2Var.f201386h;
                k3Var.f201129m = null;
                k3Var.f201124e.clear();
                k3Var.f201127h.clear();
                k3Var.f201126g.clear();
                k3Var.f201125f.clear();
                k3Var.f201128i.clear();
                ((lt0.f) k3Var.f201132p).c(new com.tencent.mm.ui.chatting.gallery.e3(k3Var));
                ((lt0.f) k3Var.f201133q).c(new com.tencent.mm.ui.chatting.gallery.f3(k3Var));
                android.graphics.Bitmap bitmap2 = k3Var.f201138v;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryLazyLoader", "bitmap recycle %s", k3Var.f201138v.toString());
                    k3Var.f201138v.recycle();
                    k3Var.f201138v = null;
                }
                ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).d(t2Var);
                com.tencent.mm.ui.chatting.gallery.ua a17 = com.tencent.mm.ui.chatting.gallery.ua.a();
                if (t2Var.equals(a17.f201498e)) {
                    a17.f201498e = null;
                }
                kotlinx.coroutines.z0.e(t2Var.f201390o.f201184a, null, 1, null);
                k1Var.f201098p.p();
                com.tencent.mm.ui.chatting.gallery.t4 t4Var = k1Var.f201099q;
                t4Var.s();
                t4Var.f200886d.f201092g.getContext().getWindow().clearFlags(128);
                t4Var.f201401g = true;
                t4Var.f200886d = null;
                t4Var.f201399e.clear();
                t4Var.f201399e = null;
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(t4Var);
                t4Var.f201400f.b(true);
                wh5.f.f446054c.clear();
                com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct = k1Var.f201108z;
                if (c2CImgWaitingTimeStruct != null) {
                    c2CImgWaitingTimeStruct.f55493m = c2CImgWaitingTimeStruct.i();
                    c2CImgWaitingTimeStruct.f55494n = cm.b.cancel;
                    c2CImgWaitingTimeStruct.k();
                }
                ((java.util.HashMap) k1Var.A).clear();
                ((java.util.HashSet) com.tencent.mm.ui.chatting.gallery.k1.F).clear();
                android.util.SparseArray sparseArray = k1Var.f201106x.f437243e;
                int size = sparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    sparseArray.keyAt(i17);
                    ((vh5.q) sparseArray.valueAt(i17)).recycle();
                }
                com.tencent.mm.ui.chatting.gallery.k1.E.clear();
                k1Var.h();
                this.f200611g = null;
            }
            t9();
            u9(false);
            this.U2.removeAllUpdateListeners();
            this.N3.dead();
            this.f200652q3.dead();
            gm0.j1.n().d(this.f200658s3);
            com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent releaseDealQBarStrEvent = new com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent();
            releaseDealQBarStrEvent.f54672g.f7446a = this;
            releaseDealQBarStrEvent.e();
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = this.L1;
            if (redesignVideoPlayerSeekBar != null) {
                redesignVideoPlayerSeekBar.setPlayBtnOnClickListener(null);
            }
            this.L1 = null;
            O8();
            oc5.g0 g0Var = this.f200669w2;
            if (g0Var != null) {
                g0Var.f();
            }
            sy3.c cVar = this.f200639n3;
            if (cVar != null) {
                ((kz3.l) cVar).g();
            }
            com.tencent.mm.view.MMPAGView mMPAGView = this.f200601d3;
            if (mMPAGView != null) {
                mMPAGView.i(this.f200625j4);
                this.f200601d3.h();
            }
            oc5.k0.c();
            b8();
            this.B1.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImageGalleryUI", e17, "", new java.lang.Object[0]);
        }
        sj0.e eVar = sj0.e.INSTANCE;
        if (eVar.f408353g) {
            eVar.i();
        }
        ((v02.f0) ((a00.j) i95.n0.c(a00.j.class))).ij();
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.storage.f9 w17;
        int i18;
        if (i17 == 82) {
            return true;
        }
        if (i17 == 4 && (w17 = this.f200611g.w()) != null && (w17.isVideo() || w17.J2())) {
            boolean z17 = this.B2;
            if (this.A2) {
                i18 = 3;
            } else {
                i18 = z17;
                if (w17.getMsgId() != this.O2) {
                    i18 = 2;
                }
            }
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(this, w17, 1, 3, i18, d7(w17));
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var;
        pk4.d dVar;
        fk4.u uVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "on pause");
        this.L = false;
        super.onPause();
        lc5.p pVar = this.f200641o;
        if (pVar != null) {
            pVar.z();
        }
        android.view.View c86 = c8();
        if (c86 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c86, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c86.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c86, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!r8()) {
            getWindow().setFlags(2048, 2048);
        }
        if (!isFinishing() && (k1Var = this.f200611g) != null) {
            com.tencent.mm.ui.chatting.gallery.ja jaVar = (com.tencent.mm.ui.chatting.gallery.ja) k1Var.f201098p;
            jaVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "pauseVideo");
            com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = jaVar.f200886d;
            com.tencent.mm.ui.chatting.gallery.ta v17 = k1Var2 != null ? k1Var2.v() : null;
            if (v17 != null && (dVar = (pk4.d) v17.f201438p) != null) {
                if (!jaVar.f201078s) {
                    t21.d3.w(jaVar.f201079t, dVar.getCurrentPosition(), dVar.getIsOnlineVideo());
                }
                if (dVar.isPlaying()) {
                    dVar.pause();
                    kotlinx.coroutines.l.d(jaVar.f201072m, null, null, new com.tencent.mm.ui.chatting.gallery.l9(jaVar, v17, null), 3, null);
                }
                if (dVar.getIsOnlineVideo() && (uVar = jaVar.f201082w) != null) {
                    ((fk4.k) uVar).p();
                }
            }
            k1Var.f201099q.s();
            android.util.SparseArray sparseArray = k1Var.f201106x.f437243e;
            int size = sparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                sparseArray.keyAt(i17);
                ((vh5.q) sparseArray.valueAt(i17)).onPause();
            }
        }
        qp1.h0.b();
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().r0();
        com.tencent.mm.ui.chatting.gallery.l lVar = com.tencent.mm.ui.chatting.gallery.l.f201163a;
        com.tencent.mm.ui.chatting.gallery.l.f201166d = null;
        com.tencent.mm.ui.chatting.gallery.p pVar2 = com.tencent.mm.ui.chatting.gallery.p.f201254a;
        R7();
        if (this.f200673x1 != null) {
            R7();
            this.f200673x1.setOnClickListener(this);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var;
        com.tencent.mm.ui.chatting.gallery.t2 t2Var;
        m11.b0 w17;
        m11.b0 x17;
        com.tencent.mm.ui.chatting.gallery.ta k17;
        com.tencent.mm.ui.chatting.gallery.ta k18;
        t21.v2 h17;
        super.onResume();
        this.L = true;
        if (this.f200589J) {
            this.f200589J = false;
            java.lang.String str = this.K;
            this.K = null;
            finish();
            if (str == null || str.isEmpty()) {
                return;
            }
            db5.e1.s(this, getContext().getString(com.tencent.mm.R.string.b5p), "");
            return;
        }
        lc5.p pVar = this.f200641o;
        if (pVar != null) {
            pVar.x();
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = this.f200611g;
        if (k1Var2 != null) {
            com.tencent.mm.ui.chatting.gallery.d2.f200849o = k1Var2.f201101s ? 0 : 100000;
        }
        if (!r8()) {
            getWindow().clearFlags(2048);
        }
        if (!this.f200675x3 && (k1Var = this.f200611g) != null) {
            com.tencent.mm.storage.f9 w18 = k1Var.w();
            if (w18 != null) {
                boolean L = com.tencent.mm.ui.chatting.gallery.k1.L(w18);
                java.util.HashMap hashMap = this.f200622i4;
                if (L || com.tencent.mm.ui.chatting.gallery.k1.K(w18)) {
                    com.tencent.mm.ui.chatting.gallery.k1 k1Var3 = this.f200611g;
                    if (k1Var3 != null && (t2Var = k1Var3.f201097o) != null && (w17 = t2Var.w(w18, true)) != null) {
                        hashMap.remove(java.lang.Long.valueOf(w17.f322633a));
                    }
                } else if (com.tencent.mm.ui.chatting.gallery.k1.N(w18) && (h17 = t21.d3.h(w18.z0())) != null) {
                    hashMap.remove(java.lang.Long.valueOf(h17.f415016n));
                }
                com.tencent.mm.ui.chatting.gallery.q3 q3Var = this.f200605e3;
                if (q3Var != null) {
                    q3Var.f201293b = I7();
                    b7(I7());
                }
                if (com.tencent.mm.ui.chatting.gallery.k1.L(w18) || com.tencent.mm.ui.chatting.gallery.k1.K(w18)) {
                    com.tencent.mm.ui.chatting.gallery.t2 t2Var2 = this.f200611g.f201097o;
                    if (t2Var2 != null) {
                        m11.b0 w19 = t2Var2.w(w18, false);
                        if ((w19 == null || !w19.j()) ? false : !f7(w18, w19)) {
                            com.tencent.mm.ui.chatting.gallery.t2 t2Var3 = this.f200611g.f201097o;
                            int i17 = this.O3;
                            com.tencent.mm.storage.f9 y17 = t2Var3.f200886d.y(i17);
                            if (y17 != null && com.tencent.mm.ui.chatting.gallery.k1.L(y17) && (x17 = t2Var3.f200886d.x(y17, false)) != null && (k17 = t2Var3.k(i17)) != null) {
                                t2Var3.f201388m.remove(y17);
                                t2Var3.f201389n.remove(y17);
                                t2Var3.A(false, k17.C, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(y17, y17.z0(), true), com.tencent.mm.ui.chatting.gallery.t2.x(y17, x17, true), true, i17, y17, k17, x17, t2Var3.f200886d.t(y17, x17), false);
                            }
                        }
                    }
                } else if (o8() && this.f200611g.f201098p != null) {
                    t21.v2 h18 = t21.d3.h(w18.z0());
                    if ((h18 == null || v8(w18) || w8(h18, w18)) ? false : true) {
                        com.tencent.mm.ui.chatting.gallery.j1 j1Var = this.f200611g.f201098p;
                        int i18 = this.O3;
                        com.tencent.mm.ui.chatting.gallery.ja jaVar = (com.tencent.mm.ui.chatting.gallery.ja) j1Var;
                        com.tencent.mm.storage.f9 y18 = jaVar.f200886d.y(i18);
                        if (y18 != null && (k18 = jaVar.k(i18)) != null) {
                            jaVar.y(k18);
                            jaVar.A(y18, i18);
                        }
                    }
                }
            }
            int I7 = I7();
            y9(I7, this.f200611g.y(I7), false);
            r7();
            if (this.f200611g.w() != null && this.f200611g.w().isVideo()) {
                com.tencent.mm.ui.chatting.gallery.l lVar = com.tencent.mm.ui.chatting.gallery.l.f201163a;
                com.tencent.mm.ui.chatting.gallery.l.f201166d = java.lang.Long.valueOf(this.f200611g.w().getMsgId());
                com.tencent.mm.ui.chatting.gallery.p pVar2 = com.tencent.mm.ui.chatting.gallery.p.f201254a;
                this.f200611g.w().getClass();
            }
        }
        this.f200675x3 = false;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var4 = this.f200611g;
        if (k1Var4 != null) {
            ((com.tencent.mm.ui.chatting.gallery.ja) k1Var4.f201098p).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onResume");
            android.util.SparseArray sparseArray = k1Var4.f201106x.f437243e;
            int size = sparseArray.size();
            for (int i19 = 0; i19 < size; i19++) {
                sparseArray.keyAt(i19);
                ((vh5.q) sparseArray.valueAt(i19)).onResume();
            }
        }
        gm0.j1.n().a(this.f200658s3);
        qp1.h0.a(true, true, true);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().k0();
        this.f200594b3 = null;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        this.C2 = getIntent().getBooleanExtra("img_gallery_back_from_grid", false);
        if (!this.f200659t && !r8() && !getIntent().getBooleanExtra("img_gallery_enter_use_share_element_anim", false)) {
            android.os.Bundle bundle = this.N2;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "[handleAnimation] isAnimated:" + this.D2);
            if (!this.D2) {
                this.D2 = true;
                this.f200604e2 = getIntent().getIntExtra("img_gallery_top", 0);
                this.f200608f2 = getIntent().getIntExtra("img_gallery_left", 0);
                this.f200612g2 = getIntent().getIntExtra("img_gallery_width", 0);
                this.f200616h2 = getIntent().getIntExtra("img_gallery_height", 0);
                com.tencent.mm.storage.f9 y17 = this.f200611g.y(this.f200637n.getCurrentItem());
                if (this.f200604e2 == 0 && this.f200608f2 == 0 && this.f200612g2 == 0 && this.f200616h2 == 0 && y17 != null) {
                    com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent = new com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent();
                    chattingUIPhotoInfoEvent.f54044g.f6895a = y17;
                    chattingUIPhotoInfoEvent.e();
                    am.j2 j2Var = chattingUIPhotoInfoEvent.f54045h;
                    this.f200612g2 = j2Var.f7001c;
                    this.f200616h2 = j2Var.f7002d;
                    this.f200608f2 = j2Var.f6999a;
                    this.f200604e2 = j2Var.f7000b;
                }
                this.f200634m2.e(this.f200608f2, this.f200604e2, this.f200612g2, this.f200616h2);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(bundle == null);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "[handleAnimation] savedInstanceState is null?%s", objArr);
                if (bundle == null) {
                    this.f200637n.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.ui.chatting.gallery.w5(this, y17));
                }
            }
        }
        super.onStart();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        sj0.g.INSTANCE.h();
        sj0.e eVar = sj0.e.INSTANCE;
        if (eVar.f408353g) {
            eVar.i();
        }
        if (this.f200647p1 == null) {
            this.f200647p1 = findViewById(com.tencent.mm.R.id.f486733ma3);
        }
        h9(this.f200647p1, 8);
    }

    public final void p7(java.lang.String str, boolean z17) {
        android.graphics.Point point;
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "dealWithWordDetectImage imagePath: %s, fromLongClick: %s", str, java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "dealWithWordDetectImage imagePath not valid or not exist");
            return;
        }
        if (!com.tencent.mm.plugin.scanner.k1.e()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "dealWithWordDetectImage wordDetect not enable");
            return;
        }
        if (z17) {
            if (this.I2 == null) {
                ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
                this.I2 = new com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine(this, false);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f200674x2.g(1, 2);
                return;
            }
            if (!(str == null || str.length() == 0) && com.tencent.mm.vfs.w6.j(str)) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.tencent.mm.graphics.e.d(str, options);
                point = new android.graphics.Point(options.outWidth, options.outHeight);
            } else {
                point = null;
            }
            if (point != null) {
                if (((jd0.u2) ((kd0.z2) i95.n0.c(kd0.z2.class))).wi(point.x, point.y)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "doScanWordDetectImage image overRatioLimit: %s", point);
                    ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).getClass();
                    boolean z18 = bz3.h.f36777d;
                    this.K2 = z18;
                    this.L2 = 1;
                    if (z18 && (k0Var = this.f200651q2) != null && k0Var.i()) {
                        n9(false);
                        return;
                    }
                    return;
                }
            }
            ((com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine) this.I2).b(str, this);
        }
    }

    public final boolean p8() {
        com.tencent.mm.ui.chatting.gallery.f2 f2Var = this.f200633m;
        return f2Var == com.tencent.mm.ui.chatting.gallery.f2.image || f2Var == com.tencent.mm.ui.chatting.gallery.f2.appimage || f2Var == com.tencent.mm.ui.chatting.gallery.f2.liveImage;
    }

    public void p9(java.lang.String str) {
        this.Z = true;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.Y.setMessage(str);
            com.tencent.mm.ui.chatting.gallery.view.FullScreenStatusMaskView fullScreenStatusMaskView = this.Y;
            fullScreenStatusMaskView.f201515g.setVisibility(8);
            fullScreenStatusMaskView.f201516h.setVisibility(0);
        }
        this.Y.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "[oreh download_and_save] hdImg suc, curPos:%d", java.lang.Integer.valueOf(this.f200637n.getCurrentItem()));
        com.tencent.mm.storage.f9 y17 = this.f200611g.y(this.f200637n.getCurrentItem());
        m11.b0 x17 = this.f200611g.x(y17, false);
        boolean z17 = this.B2;
        int i17 = z17;
        if (this.A2) {
            i17 = 3;
        } else if (y17 != null) {
            i17 = z17;
            if (y17.getMsgId() != this.O2) {
                i17 = 2;
            }
        }
        int i18 = i17;
        jz5.l hj6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(y17);
        if (y17 == null || !f7(y17, x17) || y17.z2() || !x17.k() || q8() || ((java.lang.Integer) hj6.f302833d).intValue() == 1) {
            Z8(y17, i18, new com.tencent.mm.ui.chatting.gallery.u7(this), null, null);
            return;
        }
        this.f200611g.V(I7(), true);
        k7(7);
        i7(7);
    }

    public final boolean q8() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var == null) {
            return this.f200644o4;
        }
        if (k1Var.A(k1Var.w()) != null) {
            com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = this.f200611g;
            if (k1Var2.A(k1Var2.w()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public void q9() {
        com.tencent.mm.storage.f9 w17;
        java.lang.String[] stringArray;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "show video tool bar");
        if (com.tencent.mm.ui.chatting.gallery.ja.H() && o8() && !z8() && this.f200611g.v() != null) {
            android.widget.ImageView imageView = this.f200611g.v().f201437o;
            android.widget.ProgressBar progressBar = this.f200611g.v().f201447y;
            if (progressBar != null && progressBar.getVisibility() != 0 && imageView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(imageView, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((vf0.c) i95.n0.c(vf0.c.class)).getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(imageView, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "showVideoToolbar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        j8();
        U7();
        h9(this.L1, 0);
        U7();
        h9(this.U1, 0);
        h9(this.M, 8);
        com.tencent.mm.storage.f9 w18 = this.f200611g.w();
        if (tg3.s1.a(w18)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "checkNeedShowOriginVideoBtn: msg is expired");
        } else {
            t21.v2 h17 = t21.d3.h(w18.z0());
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
            this.P.setBackground(getDrawable(com.tencent.mm.R.drawable.ah8));
            this.P.getPaint().setFakeBoldText(true);
            this.P.setTextColor(i65.a.d(this, com.tencent.mm.R.color.f479549ab0));
            if (h17 != null && this.Q.getVisibility() != 0 && this.S.getVisibility() != 0) {
                t21.j3 d17 = t21.j3.f414800h.d(h17.g());
                boolean w86 = w8(h17, w18);
                if (d17 == null || com.tencent.mm.sdk.platformtools.t8.K0(d17.f414806d) || d17.f414806d.equals("null") || !w86) {
                    t21.v2 h18 = t21.d3.h(h17.S);
                    if (h18 != null && h18.f415011i == 143) {
                        this.P.setText(getString(com.tencent.mm.R.string.hfs));
                        this.P.setEnabled(false);
                        if (this.N != null) {
                            this.P.setGravity(16);
                            this.P.setCompoundDrawables(this.N, null, null, null);
                        }
                        h9(this.P, 0);
                        if (this.U.getVisibility() == 0) {
                            this.U.clearAnimation();
                            android.view.View view = this.U;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList3.add(8);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkNeedShowOriginVideoBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "checkNeedShowOriginVideoBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        h9(this.P, 8);
                    }
                } else {
                    long a17 = c01.id.a() - w18.getCreateTime();
                    java.util.HashMap hashMap = this.f200622i4;
                    if (a17 > 432000000) {
                        java.lang.String str = (java.lang.String) hashMap.get(java.lang.Long.valueOf(h17.f415016n));
                        if (str == null) {
                            str = E8(d17.f414809g);
                            hashMap.put(java.lang.Long.valueOf(h17.f415016n), str);
                        }
                        this.P.setGravity(17);
                        this.P.setCompoundDrawables(null, null, null, null);
                        this.P.setEnabled(true);
                        this.P.setText(getString(com.tencent.mm.R.string.k8n));
                        android.text.SpannableString spannableString = new android.text.SpannableString(str);
                        spannableString.setSpan(new android.text.style.ForegroundColorSpan(getColor(com.tencent.mm.R.color.adi)), 0, str.length(), 33);
                        this.P.append(" ");
                        this.P.append(spannableString);
                    } else {
                        java.lang.String str2 = (java.lang.String) hashMap.get(java.lang.Long.valueOf(h17.f415016n));
                        if (str2 == null) {
                            str2 = E8(d17.f414809g);
                            hashMap.put(java.lang.Long.valueOf(h17.f415016n), str2);
                        }
                        this.P.setGravity(17);
                        this.P.setCompoundDrawables(null, null, null, null);
                        this.P.setEnabled(true);
                        this.P.setText(getString(com.tencent.mm.R.string.k8n));
                        android.text.SpannableString spannableString2 = new android.text.SpannableString(str2);
                        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(getColor(com.tencent.mm.R.color.adi)), 0, str2.length(), 33);
                        this.P.append(" ");
                        this.P.append(spannableString2);
                    }
                    h9(this.P, 0);
                }
            }
        }
        if (this.U.getVisibility() != 0) {
            B9();
        }
        final android.os.Bundle bundleExtra = getIntent().getBundleExtra("jumpChat");
        if (bundleExtra != null && (stringArray = bundleExtra.getStringArray("u")) != null && stringArray.length != 0) {
            c01.f8 f8Var = (c01.f8) i95.n0.c(c01.f8.class);
            h9(this.P, 8);
            this.Q.setVisibility(8);
            this.T.setVisibility(0);
            android.widget.Button button = this.T;
            final yv1.b1 b1Var = (yv1.b1) f8Var;
            button.setText(b1Var.Ri(this, bundleExtra, button.getTextSize()));
            this.T.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$g0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this;
                    imageGalleryUI.getClass();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    c01.f8 f8Var2 = b1Var;
                    arrayList4.add(f8Var2);
                    android.os.Bundle bundle = bundleExtra;
                    arrayList4.add(bundle);
                    arrayList4.add(view2);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", imageGalleryUI, array);
                    ((yv1.b1) f8Var2).Ai(imageGalleryUI, bundle);
                    yj0.a.h(imageGalleryUI, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        if (this.f200659t) {
            k8();
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if (k1Var == null || (w17 = k1Var.w()) == null || !w17.M2()) {
            return;
        }
        h9(this.W3, 0);
    }

    public final void r7() {
        java.util.HashSet hashSet = com.tencent.mm.sdk.platformtools.b.f192466a;
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f200636m4;
        java.lang.Runnable runnable = this.f200621i3;
        n3Var.removeCallbacks(runnable);
        if (p8()) {
            o9(false);
            n3Var.postDelayed(runnable, 5000L);
        }
    }

    public final boolean r8() {
        int intExtra = getIntent().getIntExtra("msg_type", 0);
        this.f200623j2 = intExtra;
        return intExtra == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r9() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.r9():void");
    }

    public final void s7(com.tencent.mm.storage.f9 f9Var, boolean z17, java.lang.Runnable runnable) {
        if (this.f200611g == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "[doExportAndMarkSaved] adapter is null, skip");
        } else {
            com.tencent.mm.ui.chatting.gallery.k1.k(getContext(), this.f200611g.w(), true, new com.tencent.mm.ui.chatting.gallery.a7(this, f9Var, z17, runnable));
        }
    }

    public final void s9() {
        this.R2.setVisibility(0);
        this.S2.setVisibility(0);
        this.T2.setVisibility(0);
        k8();
        this.U2.setRepeatMode(1);
        this.U2.setRepeatCount(-1);
        this.U2.start();
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(wa5.j.class);
        hashSet.add(la5.z.class);
        hashSet.add(ic5.b.class);
        hashSet.add(com.tencent.mm.ui.chatting.gallery.n4.class);
        pf5.a0.b(vh5.c.class, mf3.m.class);
        hashSet.add(vh5.c.class);
        pf5.a0.b(xh5.a.class, dg3.m.class);
        hashSet.add(xh5.a.class);
        pf5.a0.b(wh5.g0.class, vf3.a.class);
        hashSet.add(wh5.g0.class);
        pf5.a0.b(uh5.a.class, sf3.e.class);
        hashSet.add(uh5.a.class);
        hashSet.add(vh5.e.class);
        pf5.a0.b(xh5.b.class, cg3.a.class);
        hashSet.add(xh5.b.class);
        pf5.a0.b(vh5.e.class, lf3.j.class);
        pf5.a0.b(vh5.e.class, vh5.n.class);
        this.f200599d = getIntent().getStringExtra("img_gallery_talker");
        this.f200603e = getIntent().getStringExtra("img_gallery_chatroom_name");
    }

    public final void t7(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        int i17;
        if (f9Var == null || !f9Var.isVideo()) {
            this.f200611g.o(this.f200637n.getCurrentItem());
        } else {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(z07);
            if (com.tencent.mm.ui.chatting.gallery.ja.N.b(f9Var, h17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "doRetransmit, video expired and not even download, msgInfo: %s", f9Var);
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
                e4Var.f211776c = getText(com.tencent.mm.R.string.c_z);
                e4Var.c();
                return;
            }
            if (z17) {
                this.f200611g.o(this.f200637n.getCurrentItem());
            } else if (h17 == null || (i17 = h17.f415011i) == 199 || i17 == 199) {
                this.f200611g.o(this.f200637n.getCurrentItem());
            } else {
                this.P2 = t21.d3.d(f9Var.getMsgId(), 1);
                com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
                int currentItem = this.f200637n.getCurrentItem();
                k1Var.f201098p.B(k1Var.y(currentItem), currentItem, true);
            }
        }
        if (f9Var != null && f9Var.M2()) {
            com.tencent.mm.plugin.webview.ui.tools.media.a.f185739a.a(1, Z7(), Y7());
            ot0.m1 r17 = com.tencent.mm.ui.chatting.gallery.j1.r(f9Var);
            if (r17 != null) {
                com.tencent.mm.plugin.webview.ui.tools.media.y0.f185834k.d(1, 101, r17.f373341f, r17.f373339d, 0, this.f200676y.f201173m);
            }
        }
        if (c01.ia.M(f9Var)) {
            com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct();
            spamMediaToEmojiOPStruct.f60853d = f9Var.I0();
            spamMediaToEmojiOPStruct.f60854e = f9Var.getType();
            spamMediaToEmojiOPStruct.f60855f = c01.ia.l(f9Var);
            spamMediaToEmojiOPStruct.f60856g = 5L;
            spamMediaToEmojiOPStruct.k();
        }
    }

    public void t9() {
        this.f200618h4.d();
    }

    public final void u7(int i17, android.view.View view, java.lang.String str, android.graphics.Bitmap bitmap, boolean z17, oc5.n nVar) {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        if ((k1Var == null || !c01.ia.e(k1Var.y(this.O3))) && this.f200669w2 != null) {
            this.X2 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            this.V2 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            if (i17 == 2) {
                this.f200669w2.h(view, this.D, this.E, str, bitmap, true, i17, z17, nVar);
            }
        }
    }

    public final boolean u8() {
        int i17 = this.E3.f201220a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "get#ScanState, state: " + i17);
        if (2 != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "isNeedHideAppBrandEntrance, not scanned");
            return true;
        }
        if (!g8(2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "isNeedHideAppBrandEntrance, code not found");
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
        if (k5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "isNeedHideAppBrandEntrance, openMaterialService is null");
            return true;
        }
        boolean wi6 = ((zh1.p) k5Var).wi(this.f200663u2.f344451a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "isNeedHideAppBrandEntrance, canShowOnImageScene: " + wi6);
        return !wi6;
    }

    public final void u9(boolean z17) {
        this.R2.setVisibility(8);
        this.S2.setVisibility(8);
        this.T2.setVisibility(8);
        if (!z17) {
            o9(false);
        }
        this.U2.setRepeatMode(1);
        this.U2.setRepeatCount(0);
        this.U2.end();
    }

    public void v7(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        this.P2 = t21.d3.d(f9Var.getMsgId(), 2);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        int currentItem = this.f200637n.getCurrentItem();
        k1Var.f201098p.B(k1Var.y(currentItem), currentItem, z17);
    }

    public final boolean v8(com.tencent.mm.storage.f9 f9Var) {
        fk4.k a17 = com.tencent.mm.ui.chatting.gallery.l.f201163a.a(f9Var.getMsgId());
        return a17 != null && a17.i();
    }

    public void v9(com.tencent.mm.ui.chatting.gallery.s sVar, int i17) {
        if (I7() == i17) {
            com.tencent.mm.ui.chatting.gallery.q3 q3Var = this.f200605e3;
            if (q3Var != null) {
                com.tencent.mm.ui.chatting.gallery.q3.b(q3Var, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$z(), sVar);
            } else if (M7(this.f200611g.w().getMsgId()) == 2 || M7(this.f200611g.w().getMsgId()) == 1) {
                O7();
                this.f200629l1.a(sVar);
            }
        }
    }

    public void w7() {
        o9(false);
        n8();
        if (!m7(1, true)) {
            T7();
            android.view.View view = this.C1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloadDone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloadDone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            T7();
            h9(this.D1, 8);
            T7();
            android.view.View view2 = this.E1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloadDone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloadDone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            T7();
            android.view.View view3 = this.F1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloadDone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "setHdImageActionDownloadDone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            T7();
            h9(this.G1, 8);
            T7();
            this.H1.setVisibility(8);
            T7();
            this.J1.setVisibility(8);
            android.view.animation.Animation B7 = B7(1000);
            B7.setAnimationListener(new com.tencent.mm.ui.chatting.gallery.l7(this));
            T7();
            this.F1.startAnimation(B7);
            com.tencent.mm.ui.chatting.gallery.q3.c(this.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$a(), 100, java.lang.Boolean.TRUE);
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        com.tencent.mm.storage.f9 y17 = k1Var == null ? null : k1Var.y(this.O3);
        if (!com.tencent.mm.ui.chatting.gallery.k1.L(y17)) {
            z9();
            return;
        }
        A9();
        g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
        sVar.getClass();
        if (y17 == null) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_msg_witch_to_original", sVar.Ni(y17), 32337);
    }

    public final boolean w8(t21.v2 v2Var, com.tencent.mm.storage.f9 f9Var) {
        t21.v2 h17;
        int i17;
        if (v2Var == null || f9Var == null) {
            return false;
        }
        java.lang.String str = v2Var.S;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (h17 = t21.d3.h(str)) == null) {
            return true;
        }
        fk4.k a17 = com.tencent.mm.ui.chatting.gallery.l.f201163a.a(f9Var.getMsgId());
        if ((a17 != null && !a17.f263618f) || (i17 = h17.f415011i) == 143) {
            return false;
        }
        if (i17 != 199) {
            return true;
        }
        int intValue = ((java.lang.Integer) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(f9Var).f302833d).intValue();
        if (intValue != 0) {
            switch (intValue) {
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                    break;
                case 4:
                    if (com.tencent.mm.vfs.w6.j(((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, false))) {
                        return false;
                    }
                default:
                    return true;
            }
        }
        return false;
    }

    public final void w9(boolean z17) {
        bi1.g gVar;
        com.tencent.mm.pluginsdk.model.g2 g2Var;
        java.lang.ref.WeakReference weakReference;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.pluginsdk.model.g2 g2Var2;
        if (this.f200651q2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, bottomSheet is null");
            return;
        }
        if (c01.ia.C(this.f200611g.y(this.O3)) || c01.ia.e(this.f200611g.y(this.O3))) {
            return;
        }
        java.lang.String x27 = x2();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(x27);
        bi1.g gVar2 = bi1.g.IMAGE;
        bi1.g gVar3 = bi1.g.VIDEO;
        if (K0) {
            x27 = J7();
            gVar = gVar3;
        } else {
            gVar = gVar2;
        }
        if (com.tencent.mm.sdk.platformtools.y1.g(x27)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            x27 = m11.b1.Di().P0(x27);
        }
        java.lang.String str = x27;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, curMaterialPath is empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, curMaterialPath: %s, scene: %s", str, gVar);
        if (gVar == gVar2) {
            ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).getClass();
            if (str == null || str.length() == 0) {
                g2Var2 = null;
            } else {
                java.lang.String n17 = com.tencent.mm.vfs.w6.n(str);
                if (n17 == null || n17.length() == 0) {
                    android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
                    if (n07 != null) {
                        java.lang.String str2 = n07.outMimeType;
                        java.lang.String str3 = str2 == null ? "" : str2;
                        java.lang.String a17 = q75.g.a(str2);
                        java.lang.String str4 = a17 != null ? a17 : "";
                        com.tencent.mm.pluginsdk.model.g2 g2Var3 = new com.tencent.mm.pluginsdk.model.g2(str3, str);
                        g2Var3.f189311d = str4;
                        g2Var2 = g2Var3;
                    } else {
                        g2Var2 = new com.tencent.mm.pluginsdk.model.g2("image/*", str);
                    }
                } else {
                    g2Var2 = new com.tencent.mm.pluginsdk.model.g2(com.tencent.mm.pluginsdk.ui.tools.f.e(n17), str);
                    g2Var2.f189311d = n17;
                }
            }
            this.f200609f3 = g2Var2;
        } else if (gVar == gVar3) {
            ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).getClass();
            if (str == null || str.length() == 0) {
                g2Var = null;
            } else {
                java.lang.String n18 = com.tencent.mm.vfs.w6.n(str);
                if (n18 == null || n18.length() == 0) {
                    g2Var = new com.tencent.mm.pluginsdk.model.g2("video/*", str);
                } else {
                    g2Var = new com.tencent.mm.pluginsdk.model.g2(com.tencent.mm.pluginsdk.ui.tools.f.e(n18), str);
                    g2Var.f189311d = n18;
                }
            }
            this.f200609f3 = g2Var;
        }
        com.tencent.mm.pluginsdk.model.g2 g2Var4 = this.f200609f3;
        if (g2Var4 != null) {
            if (gVar == gVar2) {
                g2Var4.f189315h = 1;
            } else if (gVar == gVar3) {
                g2Var4.f189315h = 2;
            }
            g2Var4.f189312e = this.D;
            g2Var4.f189313f = this.E;
        }
        if (g2Var4 != null) {
            com.tencent.mm.pluginsdk.model.m2 m2Var = this.Y1;
            db5.t4 t4Var = this.L3;
            if (m2Var == null) {
                com.tencent.mm.pluginsdk.model.m2 wi6 = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).wi(getContext(), this.f200609f3);
                this.Y1 = wi6;
                if (wi6 != null) {
                    com.tencent.mm.pluginsdk.ui.otherway.v vVar = (com.tencent.mm.pluginsdk.ui.otherway.v) wi6;
                    vVar.f191011l = t4Var;
                    vVar.e(this.f200651q2);
                    return;
                }
                return;
            }
            if (this.f200651q2.f211861g2 && java.util.Objects.equals(((com.tencent.mm.pluginsdk.ui.otherway.v) m2Var).f191001b.f189309b, str)) {
                return;
            }
            com.tencent.mm.pluginsdk.model.m2 m2Var2 = this.Y1;
            com.tencent.mm.pluginsdk.model.g2 g2Var5 = this.f200609f3;
            com.tencent.mm.pluginsdk.ui.otherway.v vVar2 = (com.tencent.mm.pluginsdk.ui.otherway.v) m2Var2;
            if (g2Var5 == null) {
                com.tencent.mars.xlog.Log.e(vVar2.h(), "reset params is null");
            } else {
                vVar2.f191004e.clear();
                vVar2.f191005f.clear();
                kb0.b bVar = vVar2.f191009j;
                if (bVar != null && (weakReference = bVar.f306191e) != null && (recyclerView = (androidx.recyclerview.widget.RecyclerView) weakReference.get()) != null) {
                    recyclerView.V0(bVar.f306192f);
                }
                vVar2.f191009j = null;
                vVar2.f191010k = null;
                vVar2.f191001b = g2Var5;
                vVar2.f191003d = g2Var5.f189308a;
                vVar2.i();
            }
            com.tencent.mm.pluginsdk.ui.otherway.v vVar3 = (com.tencent.mm.pluginsdk.ui.otherway.v) this.Y1;
            vVar3.f191011l = t4Var;
            vVar3.e(this.f200651q2);
            return;
        }
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
        if (k5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, openMaterialService is null");
            return;
        }
        zh1.p pVar = (zh1.p) k5Var;
        if (!pVar.Vi(gVar)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, openMaterialService is not enabled");
            return;
        }
        if (gVar2 == gVar) {
            int i17 = this.E3.f201220a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "get#ScanState, state: " + i17);
            if (2 == i17 && u8()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, can not enhance bottomSheet");
                return;
            }
        }
        if (!str.equals(this.F3)) {
            pVar.Ni(gVar == gVar2 ? com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel.c(str) : com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel.a(str), new com.tencent.mm.ui.chatting.gallery.k8(this, str, pVar, gVar, z17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, already fetchOpenMaterials");
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = this.G3;
        if (appBrandOpenMaterialCollection == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, cachedOpenMaterialCollection is null");
            return;
        }
        if (!pVar.Zi(this.f200651q2, appBrandOpenMaterialCollection)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, not need enhance");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.gb u17 = this.f200611g.u();
        if (u17 == null || com.tencent.mm.ui.chatting.gallery.gb.f200965d == u17) {
            return;
        }
        zh1.z0 z0Var = this.H3;
        if (z0Var != null) {
            z0Var.dead();
        }
        if (z17) {
            com.tencent.mm.ui.widget.dialog.k0 bottomSheet = this.f200651q2;
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection = this.G3;
            if (this.I3 == null) {
                this.I3 = new com.tencent.mm.ui.chatting.gallery.o8(this);
            }
            com.tencent.mm.ui.chatting.gallery.o8 o8Var = this.I3;
            kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
            kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
            openMaterialCollection.toString();
            zh1.z0 a18 = zh1.v.f472945n.a(1L, gVar, this, bottomSheet, openMaterialCollection, null, o8Var);
            a18.o(zh1.y0.ENABLE);
            this.H3 = a18;
        } else {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f200651q2;
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection2 = this.G3;
            if (this.I3 == null) {
                this.I3 = new com.tencent.mm.ui.chatting.gallery.o8(this);
            }
            this.H3 = pVar.Ai(gVar, this, k0Var, appBrandOpenMaterialCollection2, null, this.I3);
        }
        if (gVar2 == gVar && u8()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryEnhanceBottomSheet, hide enhance bottomSheet");
            this.H3.o(zh1.y0.HIDE);
        }
    }

    public final java.lang.String x2() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        java.lang.String str = null;
        if (k1Var != null) {
            com.tencent.mm.storage.f9 y17 = k1Var.y(this.O3);
            if (com.tencent.mm.ui.chatting.gallery.k1.L(y17) || com.tencent.mm.ui.chatting.gallery.k1.K(y17)) {
                m11.b0 x17 = this.f200611g.x(y17, true);
                if (x17 != null) {
                    str = com.tencent.mm.ui.chatting.gallery.t2.x(y17, x17, false);
                }
            } else if (com.tencent.mm.ui.chatting.gallery.k1.G(y17)) {
                str = com.tencent.mm.ui.chatting.gallery.k1.s(y17);
            }
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    public final void x7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "enterGrid source : " + i17);
        if (this.f200611g == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "try to enterGrid, but adapter is NULL");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 13L, 1L, true);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200611g;
        int i18 = k1Var.f201093h.f200852c;
        com.tencent.mm.storage.f9 w17 = k1Var.w();
        if (w17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "msgInfo is null");
            return;
        }
        int I7 = (I7() - com.tencent.mm.ui.chatting.gallery.d2.f200849o) + this.f200611g.f201093h.f200854e;
        if (this.A2) {
            if (!t8()) {
                Y8();
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", this.f200599d);
            intent.putExtra("finish_direct", true);
            intent.putExtra("from_global_search", true);
            intent.putExtra("msg_local_id", w17.getMsgId());
            j45.l.u(getContext(), ".ui.chatting.ChattingUI", intent, null);
            return;
        }
        if (s8()) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("kTalker", this.f200599d);
            intent2.putExtra("kMsgId", w17.getMsgId());
            intent2.setClass(getContext(), com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "enterGrid", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "enterGrid", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.content.Intent intent3 = new android.content.Intent();
        intent3.setClass(getContext(), com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI.class);
        intent3.addFlags(67108864);
        intent3.putExtra("kintent_intent_source", i17);
        intent3.putExtra("kintent_talker", F7());
        intent3.putExtra("kintent_image_count", i18);
        intent3.putExtra("kintent_image_index", I7);
        intent3.putExtra("key_biz_chat_id", this.f200615h);
        intent3.putExtra("key_is_biz_chat", this.f200648p2);
        intent3.putExtra("key_gallery_enter_scene", 1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent3);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "enterGrid", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI", "enterGrid", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean x8() {
        java.lang.Boolean bool = (java.lang.Boolean) com.tencent.mm.ui.chatting.gallery.q3.a(this.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$c());
        return bool != null ? bool.booleanValue() : this.f200614g4;
    }

    public void x9(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "tryScanImageWhenLongPress %s, doScanCode: %s, doWordDetect: %s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17) {
            u7(2, L7(this.f200611g, this.f200637n), com.tencent.mm.vfs.w6.i(str, false), this.F, false, this.f200624j3);
        }
        if (z18) {
            p7(str, true);
        }
    }

    public final void y7(boolean z17) {
        this.M2 = 0;
        u9(z17);
    }

    public boolean y8(android.app.Activity activity) {
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        boolean z17 = defaultDisplay.getWidth() < defaultDisplay.getHeight();
        hashCode();
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[Catch: all -> 0x0196, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0025, B:7:0x0029, B:8:0x0030, B:13:0x0040, B:17:0x0048, B:18:0x0053, B:19:0x006c, B:21:0x0071, B:22:0x0074, B:26:0x007f, B:29:0x008b, B:31:0x0093, B:33:0x009d, B:36:0x00ab, B:38:0x00af, B:40:0x00c7, B:42:0x00d5, B:44:0x00de, B:46:0x00ec, B:47:0x00fd, B:51:0x00bc, B:55:0x0102, B:57:0x0113, B:60:0x011d, B:62:0x0121, B:64:0x0127, B:66:0x012f, B:68:0x0141, B:69:0x015a, B:72:0x0185, B:73:0x017d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void y9(int r11, com.tencent.mm.storage.f9 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.y9(int, com.tencent.mm.storage.f9, boolean):void");
    }

    public final void z7(final com.tencent.mm.storage.f9 f9Var, int i17) {
        wf0.y1 y1Var = (wf0.y1) i95.n0.c(wf0.y1.class);
        ((c35.m) i95.n0.c(c35.m.class)).getClass();
        xf0.u uVar = (xf0.u) y1Var;
        boolean cj6 = uVar.cj(f9Var);
        boolean hj6 = uVar.hj(f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "check origin video: isC2COriginVideoPathEnabled=%b, isOriginVideoSaved=%b, isThumbExistButOriginNotDownloaded=%b", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(cj6), java.lang.Boolean.valueOf(hj6));
        if (cj6 || hj6) {
            com.tencent.mm.ui.tools.a1.d(this, f9Var, cj6, true, i17, 1, new com.tencent.mm.ui.tools.s0() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$d0
                @Override // com.tencent.mm.ui.tools.s0
                public final void a() {
                    int i18 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this;
                    com.tencent.mm.ui.chatting.gallery.k1.m(imageGalleryUI.getContext(), f9Var, true, new com.tencent.mm.ui.chatting.gallery.d7(imageGalleryUI));
                }
            });
        } else {
            com.tencent.mm.ui.chatting.gallery.k1.m(getContext(), f9Var, true, new com.tencent.mm.ui.chatting.gallery.f7(this));
        }
    }

    public boolean z8() {
        U7();
        return this.L1.f191446z;
    }

    public final void z9() {
        T7();
        if (this.N1 == null) {
            this.N1 = (android.widget.LinearLayout) this.C1.findViewById(com.tencent.mm.R.id.u3r);
        }
        android.widget.LinearLayout linearLayout = this.N1;
        if (linearLayout == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "updateFooterTitleTextForDefault, skipped, tvFooterTitleContainer is null.");
            return;
        }
        linearLayout.setVisibility(8);
        j8();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "updateFooterTitleTextForDefault, hidden.");
    }
}
