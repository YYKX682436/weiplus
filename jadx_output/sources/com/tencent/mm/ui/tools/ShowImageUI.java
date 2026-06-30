package com.tencent.mm.ui.tools;

@db5.a(2179)
@ul5.d(0)
/* loaded from: classes3.dex */
public class ShowImageUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f210190u = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f210191d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMViewPager f210192e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.ub f210193f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f210194g;

    /* renamed from: h, reason: collision with root package name */
    public int f210195h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f210196i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f210197m;
    private vj5.k mStatusBarHeightCallback;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f210198n;

    /* renamed from: o, reason: collision with root package name */
    public long f210199o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f210200p = true;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout f210201q = null;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.RelativeLayout f210202r = null;

    /* renamed from: s, reason: collision with root package name */
    public int f210203s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f210204t = true;

    public static void T6(com.tencent.mm.ui.tools.ShowImageUI showImageUI) {
        android.widget.FrameLayout frameLayout;
        showImageUI.getClass();
        int f17 = i65.a.f(showImageUI, com.tencent.mm.R.dimen.f479688cn);
        if (showImageUI.f210195h != 1 || (frameLayout = (android.widget.FrameLayout) showImageUI.f210202r.findViewById(com.tencent.mm.R.id.hbf)) == null) {
            return;
        }
        frameLayout.setPadding(f17, 0, f17, 0);
    }

    public final void U6(android.view.Window window, boolean z17, boolean z18) {
        int i17;
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if (z17) {
            int i18 = systemUiVisibility | 1024 | 256;
            i17 = (z18 ? i18 | 4 : i18 & (-5)) | 4096;
        } else {
            int i19 = systemUiVisibility & (-1025) & (-257);
            i17 = (z18 ? i19 | 4 : i19 & (-5)) & (-4097);
        }
        window.getDecorView().setSystemUiVisibility(i17);
    }

    public android.graphics.Bitmap V6(java.lang.String str) {
        android.graphics.Bitmap d17;
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
        if (n07 == null) {
            java.util.Vector vector = x51.w0.f452103a;
            d17 = x51.v0.b(str);
        } else {
            double min = java.lang.Math.min(1.0E7d, (((java.lang.Runtime.getRuntime().maxMemory() * 0.95d) - java.lang.Runtime.getRuntime().totalMemory()) + java.lang.Runtime.getRuntime().freeMemory()) / 4.0d);
            int i17 = n07.outWidth;
            int i18 = n07.outHeight;
            double d18 = min / (i17 * i18);
            if (d18 > 1.0d) {
                d17 = x51.w0.c(str);
            } else {
                int i19 = (int) (i17 * d18);
                int i27 = (int) (i18 * d18);
                java.util.Vector vector2 = x51.w0.f452103a;
                d17 = x51.v0.d(str, i19, i27);
            }
        }
        return com.tencent.mm.sdk.platformtools.x.w0(d17, com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6() {
        /*
            r13 = this;
            java.lang.Class<xs.w0> r0 = xs.w0.class
            i95.m r0 = i95.n0.c(r0)
            xs.w0 r0 = (xs.w0) r0
            com.tencent.mm.storage.f9 r1 = r13.f210197m
            a80.b r0 = (a80.b) r0
            jz5.l r0 = r0.hj(r1)
            java.lang.Class<h90.w> r1 = h90.w.class
            i95.m r2 = i95.n0.c(r1)
            h90.w r2 = (h90.w) r2
            com.tencent.mm.storage.f9 r3 = r13.f210197m
            h90.a[] r4 = h90.a.f279671d
            g90.u r2 = (g90.u) r2
            r4 = 1
            int r2 = r2.Bi(r3, r4)
            r3 = 4
            r5 = 3
            if (r2 != r5) goto L39
            i95.m r2 = i95.n0.c(r1)
            h90.w r2 = (h90.w) r2
            com.tencent.mm.storage.f9 r6 = r13.f210197m
            g90.u r2 = (g90.u) r2
            int r2 = r2.Ai(r6, r4)
            if (r2 != r3) goto L39
            r8 = r4
            goto L3b
        L39:
            r2 = 0
            r8 = r2
        L3b:
            if (r8 != 0) goto L60
            i95.m r1 = i95.n0.c(r1)
            h90.w r1 = (h90.w) r1
            com.tencent.mm.storage.f9 r2 = r13.f210197m
            h90.a[] r6 = h90.a.f279671d
            g90.u r1 = (g90.u) r1
            int r1 = r1.Bi(r2, r3)
            if (r1 != r5) goto L5a
            java.lang.Object r0 = r0.f302833d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == r5) goto L5a
            goto L60
        L5a:
            com.tencent.mm.storage.f9 r0 = r13.f210197m
            r13.X6(r0)
            goto L6e
        L60:
            com.tencent.mm.storage.f9 r7 = r13.f210197m
            r9 = 0
            r10 = 4
            r11 = 2
            com.tencent.mm.ui.tools.ShowImageUI$$g r12 = new com.tencent.mm.ui.tools.ShowImageUI$$g
            r12.<init>()
            r6 = r13
            com.tencent.mm.ui.tools.a1.d(r6, r7, r8, r9, r10, r11, r12)
        L6e:
            int r0 = r13.f210195h
            if (r0 != r4) goto L88
            java.lang.Class<h90.v> r0 = h90.v.class
            i95.m r0 = i95.n0.c(r0)
            h90.v r0 = (h90.v) r0
            com.tencent.mm.storage.f9 r3 = r13.f210197m
            int r4 = r13.f210203s
            r5 = 2
            r6 = 4
            r7 = 4
            r1 = r0
            g90.s r1 = (g90.s) r1
            r2 = r13
            r1.Zi(r2, r3, r4, r5, r6, r7)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShowImageUI.W6():void");
    }

    public final void X6(com.tencent.mm.storage.f9 f9Var) {
        zb0.a0 dbVar = ((j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigImgExportPrivacyOpt()) == 1) && this.f210195h == 2) ? new com.tencent.mm.ui.tools.db(this) : new com.tencent.mm.ui.tools.gb(this);
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String str = this.f210196i;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.a(str, this, dbVar);
        if (getIntent().hasExtra("jumpChat")) {
            jx3.f.INSTANCE.d(25464, 27, 0, 4);
            return;
        }
        if (this.f210195h == 1) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).oj(3);
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            java.lang.String Q0 = f9Var.Q0();
            long msgId = f9Var.getMsgId();
            h90.a[] aVarArr = h90.a.f279671d;
            ((g90.u) wVar).Zi(Q0, msgId, 1);
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).nj(f9Var, 3, 4, 2);
        }
    }

    public final boolean Y6(android.app.Activity activity) {
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        boolean z17 = defaultDisplay.getWidth() < defaultDisplay.getHeight();
        hashCode();
        return z17;
    }

    public final void Z6() {
        if (this.f210195h == 3) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), 0, false);
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        final com.tencent.mm.pluginsdk.forward.m mVar = new com.tencent.mm.pluginsdk.forward.m();
        k0Var.f211876p = new db5.o4() { // from class: com.tencent.mm.ui.tools.ShowImageUI$$a
            @Override // db5.o4
            public final void onCreateMMMenu(db5.g4 g4Var) {
                int i17 = com.tencent.mm.ui.tools.ShowImageUI.f210190u;
                ((com.tencent.mm.pluginsdk.forward.m) mVar).wi(com.tencent.mm.ui.tools.ShowImageUI.this.getContext(), g4Var, k0Var);
            }
        };
        k0Var.f211885w = new db5.t4() { // from class: com.tencent.mm.ui.tools.ShowImageUI$$b
            @Override // db5.t4
            public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                int i18 = com.tencent.mm.ui.tools.ShowImageUI.f210190u;
                final com.tencent.mm.ui.tools.ShowImageUI showImageUI = com.tencent.mm.ui.tools.ShowImageUI.this;
                showImageUI.getClass();
                yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.tools.ShowImageUI$$h
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        java.lang.String str = (java.lang.String) obj;
                        com.tencent.mm.ui.tools.ShowImageUI showImageUI2 = com.tencent.mm.ui.tools.ShowImageUI.this;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(showImageUI2.f210196i)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ShowImageUI", "doRestransmitMsg fail, imgPath is null");
                            return null;
                        }
                        com.tencent.mm.ui.tools.wa waVar = new com.tencent.mm.ui.tools.wa(showImageUI2, str);
                        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                        jd5.a aVar = new jd5.a();
                        aVar.p(showImageUI2.f210196i);
                        n13.t tVar = new n13.t();
                        tVar.f334133a = waVar;
                        tVar.f334138f.f334139a = 9;
                        ((dk5.y) i95.n0.c(dk5.y.class)).wi(showImageUI2.getContext(), aVar, str, tVar);
                        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Zi(showImageUI2, showImageUI2.f210197m, showImageUI2.f210203s, 2, 4, 1);
                        return null;
                    }
                };
                ((com.tencent.mm.pluginsdk.forward.m) mVar).aj((db5.h4) menuItem, lVar);
            }
        };
        k0Var.f211872n = new com.tencent.mm.ui.tools.ya(this, arrayList);
        k0Var.f211874o = new com.tencent.mm.ui.tools.za(this, arrayList);
        k0Var.f211884v = new com.tencent.mm.ui.tools.ab(this);
        k0Var.f211881s = new com.tencent.mm.ui.tools.bb(this);
        k0Var.C = new com.tencent.mm.ui.tools.cb(this);
        k0Var.v();
        if (this.f210195h == 1) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).pj();
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).aj(this, this.f210197m, this.f210203s, 2, 4, arrayList);
        }
    }

    public final void a7(boolean z17) {
        int i17 = z17 ? 2 : 1;
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.storage.f9 f9Var = this.f210197m;
        g90.s sVar = (g90.s) vVar;
        sVar.getClass();
        sVar.hj(this, f9Var, 2, i17, kz5.q0.f314001d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("pic_video_close");
        arrayList.add("pic_video_three_dot");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (z17) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ui(this, this.f210197m, 2, str);
            } else {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Vi(this, this.f210197m, 2, str);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cnc;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f210195h == 1) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(this, this.f210197m, 2, 3, 4, new java.util.HashMap());
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = configuration.orientation;
        if (i17 == 1) {
            hashCode();
            android.view.View decorView = getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.ui.tools.ua(this, decorView));
        } else if (i17 == 2) {
            hashCode();
            android.view.View decorView2 = getWindow().getDecorView();
            decorView2.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.ui.tools.va(this, decorView2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShowImageUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a7(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f210195h != 1) {
            getWindow().setFlags(2048, 2048);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f210195h != 1) {
            getWindow().clearFlags(2048);
        }
    }
}
