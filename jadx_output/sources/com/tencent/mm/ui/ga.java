package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public abstract class ga {

    /* renamed from: v0, reason: collision with root package name */
    public static boolean f208628v0;

    /* renamed from: w0, reason: collision with root package name */
    public static android.os.PowerManager.WakeLock f208629w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final byte[] f208630x0 = {0};
    public boolean A;
    public com.tencent.mm.ui.tools.c9 B;
    public com.tencent.mm.ui.tools.e E;
    public java.util.ArrayList F;
    public androidx.appcompat.app.b G;
    public android.widget.TextView H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f208631J;
    public com.tencent.mm.ui.widget.imageview.WeImageView K;
    public android.widget.TextView L;
    public android.widget.ProgressBar M;
    public android.widget.TextView N;
    public com.tencent.mm.ui.widget.imageview.WeImageView U;
    public android.widget.TextView V;
    public android.widget.Button W;
    public android.view.ViewGroup.LayoutParams X;
    public int Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f208632a;

    /* renamed from: a0, reason: collision with root package name */
    public android.view.View f208633a0;
    private android.view.View actionbarView;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f208634b;

    /* renamed from: b0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.AlbumChooserView f208635b0;

    /* renamed from: c, reason: collision with root package name */
    public android.view.LayoutInflater f208636c;

    /* renamed from: c0, reason: collision with root package name */
    public android.view.View f208637c0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f208638d;

    /* renamed from: d0, reason: collision with root package name */
    public android.view.View f208639d0;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f208640e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f208642f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f208644g;

    /* renamed from: h, reason: collision with root package name */
    public vj5.h f208646h;

    /* renamed from: i, reason: collision with root package name */
    public android.media.AudioManager f208648i;

    /* renamed from: i0, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f208649i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f208651j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f208653k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f208655l0;

    /* renamed from: m0, reason: collision with root package name */
    public com.tencent.mm.ui.eb f208657m0;

    /* renamed from: n0, reason: collision with root package name */
    public android.view.MenuItem f208659n0;

    /* renamed from: o0, reason: collision with root package name */
    public final java.lang.Runnable f208661o0;

    /* renamed from: p0, reason: collision with root package name */
    public final java.lang.Runnable f208663p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f208665q0;

    /* renamed from: r0, reason: collision with root package name */
    public long f208667r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f208669s0;

    /* renamed from: t, reason: collision with root package name */
    public androidx.appcompat.app.AppCompatActivity f208670t;

    /* renamed from: t0, reason: collision with root package name */
    public int f208671t0;

    /* renamed from: u, reason: collision with root package name */
    public android.content.Context f208672u;

    /* renamed from: u0, reason: collision with root package name */
    public int f208673u0;

    /* renamed from: v, reason: collision with root package name */
    public ul5.k f208674v;

    /* renamed from: j, reason: collision with root package name */
    public boolean f208650j = true;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f208652k = " ";

    /* renamed from: l, reason: collision with root package name */
    public int f208654l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f208656m = 0;

    /* renamed from: n, reason: collision with root package name */
    public al5.w f208658n = null;

    /* renamed from: o, reason: collision with root package name */
    public al5.w f208660o = null;

    /* renamed from: p, reason: collision with root package name */
    public al5.w f208662p = null;

    /* renamed from: q, reason: collision with root package name */
    public al5.w f208664q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f208666r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f208668s = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f208675w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f208676x = false;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f208677y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    public boolean f208678z = false;
    public final com.tencent.mm.ui.eb C = new com.tencent.mm.ui.eb();
    public final java.util.LinkedList D = new java.util.LinkedList();
    public int O = 0;
    public boolean P = false;
    public int Q = 0;
    public boolean R = false;
    public boolean S = false;
    public boolean T = false;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f208641e0 = true;

    /* renamed from: f0, reason: collision with root package name */
    public int f208643f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public int f208645g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f208647h0 = false;

    public ga() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f208649i0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UINotifyEvent>(a0Var) { // from class: com.tencent.mm.ui.MMActivityController$1
            {
                this.__eventId = 2021095821;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent) {
                am.lz lzVar = uINotifyEvent.f54906g;
                if (lzVar.f7281d != 2) {
                    return false;
                }
                java.lang.String str = lzVar.f7283f;
                int i17 = lzVar.f7284g;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE callback position[%d] noticeId[%s]", java.lang.Integer.valueOf(i17), str);
                if (i17 > 0) {
                    com.tencent.mm.ui.ga gaVar = com.tencent.mm.ui.ga.this;
                    if (i17 != gaVar.f208643f0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE callback position not match[%d, %d] ignore display", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(gaVar.f208643f0));
                        return false;
                    }
                }
                com.tencent.mm.ui.ga.this.R(lzVar.f7282e, lzVar.f7278a, lzVar.f7279b, lzVar.f7280c, str, i17, false);
                return false;
            }
        };
        this.f208651j0 = com.tencent.mm.R.layout.f487918bk;
        this.f208653k0 = -1;
        this.f208655l0 = 0;
        this.f208661o0 = new com.tencent.mm.ui.ma(this);
        this.f208663p0 = new com.tencent.mm.ui.na(this);
        this.f208665q0 = 0;
        this.f208667r0 = android.os.SystemClock.elapsedRealtime();
        this.f208669s0 = 0;
        this.f208671t0 = this.Y;
        this.f208673u0 = -1;
    }

    public static boolean L(android.app.Activity activity) {
        android.view.Window window;
        android.view.View decorView;
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.os.IBinder windowToken;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method")) == null || (windowToken = decorView.getWindowToken()) == null) {
            return false;
        }
        try {
            boolean hideSoftInputFromWindow = inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "hideVKB status:%s", java.lang.Boolean.valueOf(hideSoftInputFromWindow));
            return hideSoftInputFromWindow;
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMActivityController", "hide VKB(View) exception %s", e17);
            return false;
        }
    }

    public static void M0(android.app.Activity activity) {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    public static java.util.Locale Q(android.content.Context context) {
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
        if (o17.equals("language_default")) {
            com.tencent.mm.sdk.platformtools.m2.u(context, java.util.Locale.ENGLISH);
            return java.util.Locale.getDefault();
        }
        java.util.Locale s17 = com.tencent.mm.sdk.platformtools.m2.s(o17);
        com.tencent.mm.sdk.platformtools.m2.u(context, s17);
        return s17;
    }

    public static boolean a0(java.lang.String str) {
        java.lang.String m17 = wo.w0.m();
        java.lang.String str2 = android.os.Build.DEVICE;
        if (str == null ? false : com.tencent.mm.sdk.platformtools.t8.D0(m17.toLowerCase(), str.toLowerCase())) {
            return true;
        }
        return (str2 == null || str == null) ? false : com.tencent.mm.sdk.platformtools.t8.D0(str2.toLowerCase(), str.toLowerCase());
    }

    public static /* synthetic */ void c(com.tencent.mm.ui.ga gaVar, int i17, int i18, int i19) {
        android.widget.FrameLayout frameLayout;
        int height = gaVar.actionbarView.getHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "Edge2Edge enable after post, heightOfActionBar=%d", java.lang.Integer.valueOf(height));
        if (height <= 0 || (frameLayout = gaVar.f208644g) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "Edge2Edge cannot set ActionBar frosted, heightOfActionBar is 0");
            gaVar.n();
            return;
        }
        com.tencent.mm.ui.FrostedContentView frostedContentView = (com.tencent.mm.ui.FrostedContentView) frameLayout;
        frostedContentView.setBlurRadius(i17);
        frostedContentView.setTopBlurAreaHeight(height);
        frostedContentView.setFrostedColor(com.tencent.mm.ui.uk.a(gaVar.f208672u.getResources().getColor(i18), i19));
        frostedContentView.setFrostedEnabled(true);
        frostedContentView.postInvalidate();
    }

    public static boolean q() {
        return a0("y83a") || a0("y83") || a0("v1732a") || a0("v1732t");
    }

    public int A() {
        return -1;
    }

    public void A0(java.lang.String str) {
        if (this.G == null) {
            return;
        }
        if (str == null) {
            this.N.setVisibility(8);
            return;
        }
        this.N.setText(str);
        if (i65.a.D(x())) {
            this.N.setTextSize(1, 14.0f);
            this.H.setTextSize(1, 18.0f);
        }
        this.N.setVisibility(0);
        R0(str);
    }

    public abstract s75.b B();

    public void B0(java.lang.CharSequence charSequence) {
        if (this.G == null) {
            return;
        }
        this.f208652k = charSequence.toString();
        this.H.setText(charSequence);
        if (com.tencent.mm.ui.f.a()) {
            com.tencent.mm.ui.f.b(this.H, com.tencent.mm.R.dimen.f479559b);
        } else if (i65.a.D(x())) {
            this.H.setTextSize(0, i65.a.f(x(), com.tencent.mm.R.dimen.f479559b) * i65.a.m(x()));
        }
        R0(charSequence.toString());
    }

    public abstract int C();

    public void C0(java.lang.String str) {
        if (this.G == null) {
            return;
        }
        this.f208652k = str;
        if (com.tencent.mm.ui.f.a()) {
            com.tencent.mm.ui.f.b(this.H, com.tencent.mm.R.dimen.f479559b);
        } else if (i65.a.D(x())) {
            this.H.setTextSize(0, i65.a.f(x(), com.tencent.mm.R.dimen.f479559b) * i65.a.m(x()));
        }
        Y0();
        R0(str);
    }

    public abstract android.view.View D();

    public void D0(int i17) {
        this.H.setVisibility(i17);
    }

    public com.tencent.mm.ui.eb E(int i17) {
        java.util.Iterator it = this.D.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.eb ebVar = (com.tencent.mm.ui.eb) it.next();
            if (ebVar.f208375a == i17) {
                return ebVar;
            }
        }
        return null;
    }

    public void E0(int i17) {
        try {
            if (com.tencent.mm.ui.b4.c(this.f208670t)) {
                if (this.f208646h == null) {
                    this.f208646h = (vj5.h) this.f208670t.getWindow().getDecorView().findViewById(com.tencent.mm.R.id.twm);
                }
                vj5.h hVar = this.f208646h;
                if (hVar != null && (hVar instanceof com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout)) {
                    ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) hVar).setNavigationBarBackgroundColor(i17);
                }
            }
            if (android.os.Build.VERSION.SDK_INT < 26 || q()) {
                return;
            }
            this.f208670t.getWindow().setNavigationBarColor(i17);
            boolean g17 = com.tencent.mm.ui.uk.g(i17);
            android.view.View decorView = this.f208670t.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(g17 ? systemUiVisibility & (-17) : systemUiVisibility | 16);
            this.f208669s0 = i17;
            if (y() != -1 || this.f208674v == null || V()) {
                return;
            }
            this.f208674v.setEnd2StartBgColorByNavigationBar(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMActivityController", th6, "setNavigationbarColor err", new java.lang.Object[0]);
        }
    }

    public androidx.appcompat.app.b F() {
        return this.f208670t.getSupportActionBar();
    }

    public void F0(boolean z17) {
        android.view.View view;
        this.f208650j = z17;
        if (this.f208632a == null && (view = this.f208638d) != null) {
            this.f208632a = view.findViewById(com.tencent.mm.R.id.jmd);
        }
        android.view.View view2 = this.f208632a;
        if (view2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMActivityController", "jacks error npe translayer !");
            return;
        }
        view2.setFocusable(!z17);
        this.f208632a.setFocusableInTouchMode(!z17);
        if (z17) {
            synchronized (f208630x0) {
                android.os.PowerManager.WakeLock wakeLock = f208629w0;
                if (wakeLock == null || !wakeLock.isHeld()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "repeatedly release screen off wakelock from object: %s, drop this call.", toString());
                } else {
                    android.os.PowerManager.WakeLock wakeLock2 = f208629w0;
                    yj0.a.c(wakeLock2, "com/tencent/mm/ui/MMActivityController", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    yj0.a.f(wakeLock2, "com/tencent/mm/ui/MMActivityController", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "after release screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(f208629w0.isHeld()));
                    f208629w0 = null;
                }
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity x17 = x();
        synchronized (f208630x0) {
            if (f208629w0 == null) {
                f208629w0 = ((android.os.PowerManager) x17.getSystemService("power")).newWakeLock(32, "screen Lock");
            }
            if (f208629w0.isHeld()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", toString());
            } else {
                android.os.PowerManager.WakeLock wakeLock3 = f208629w0;
                yj0.a.c(wakeLock3, "com/tencent/mm/ui/MMActivityController", "acquireWakeLock", "(Landroid/content/Context;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock3.acquire();
                yj0.a.f(wakeLock3, "com/tencent/mm/ui/MMActivityController", "acquireWakeLock", "(Landroid/content/Context;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "after acquire screen off wakelock from object: %s, isHeld: %s", toString(), java.lang.Boolean.valueOf(f208629w0.isHeld()));
            }
        }
    }

    public void G() {
        android.view.View view = this.f208633a0;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "hideActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "hideActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.I;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MMActivityController", "hideActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/MMActivityController", "hideActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void G0(int i17) {
        W0(this.f208670t, i17);
        O0(com.tencent.mm.ui.uk.g(i17));
    }

    public void H() {
        java.util.ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                android.app.Dialog dialog = (android.app.Dialog) this.F.get(i17);
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss();
                }
            }
            this.F.clear();
            this.F = null;
        }
    }

    public void H0(int i17) {
        try {
            if (this.f208646h == null) {
                this.f208646h = (vj5.h) this.f208670t.getWindow().getDecorView().findViewById(com.tencent.mm.R.id.twm);
            }
            vj5.h hVar = this.f208646h;
            if (hVar != null) {
                hVar.setStatusBarColor(i17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMActivityController", th6, "setStatusBarDrawColor err", new java.lang.Object[0]);
        }
    }

    public void I() {
    }

    public void I0(int i17, int i18) {
        if (this.G == null) {
            return;
        }
        if (i17 == 0) {
            this.f208654l = 0;
            this.f208658n = null;
        } else if (this.f208654l != i17) {
            this.f208654l = i17;
            this.f208658n = z(this.f208672u.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479568k), this.f208654l);
        }
        if (i18 == 0) {
            this.f208656m = 0;
            this.f208660o = null;
        } else if (this.f208656m != i18) {
            this.f208656m = i18;
            this.f208660o = z(this.f208672u.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479568k), this.f208656m);
        }
        Y0();
    }

    public void J() {
        androidx.appcompat.app.b bVar = this.G;
        if (bVar == null) {
            return;
        }
        bVar.o();
    }

    public void J0(int i17) {
        androidx.appcompat.app.b bVar = this.G;
        if (bVar == null) {
            return;
        }
        if (i17 == 0) {
            bVar.L();
            W0(this.f208670t, this.O);
        } else {
            bVar.o();
            W0(this.f208670t, x().getResources().getColor(com.tencent.mm.R.color.f478712f3));
        }
    }

    public boolean K() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f208670t;
        if (appCompatActivity != null) {
            android.view.View currentFocus = appCompatActivity.getCurrentFocus();
            return currentFocus == null ? M(this.f208638d) : M(currentFocus);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "hideVKB error, mAppCompatActivity is null");
        return M(this.f208638d);
    }

    public void K0(boolean z17) {
        androidx.appcompat.app.b bVar = this.G;
        if (bVar == null) {
            return;
        }
        bVar.B(z17);
        android.view.View view = this.f208631J;
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "showHomeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "showHomeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void L0(boolean z17, int i17, boolean z18) {
        boolean z19;
        java.util.LinkedList linkedList = this.D;
        if (z17) {
            java.util.Iterator it = linkedList.iterator();
            z19 = false;
            while (it.hasNext()) {
                com.tencent.mm.ui.eb ebVar = (com.tencent.mm.ui.eb) it.next();
                if (ebVar.f208381g != z18) {
                    ebVar.f208381g = z18;
                    z19 = true;
                }
            }
        } else {
            java.util.Iterator it6 = linkedList.iterator();
            z19 = false;
            while (it6.hasNext()) {
                com.tencent.mm.ui.eb ebVar2 = (com.tencent.mm.ui.eb) it6.next();
                if (ebVar2.f208375a == i17 && ebVar2.f208381g != z18) {
                    ebVar2.f208381g = z18;
                    z19 = true;
                }
            }
        }
        com.tencent.mm.ui.tools.c9 c9Var = this.B;
        boolean z27 = c9Var != null ? c9Var.f210318c : false;
        if (z19 && !z27) {
            N0();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "show option menu, target id %d, changed %B, searching %B", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
    }

    public boolean M(android.view.View view) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.os.IBinder windowToken;
        if (view == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f208672u.getSystemService("input_method")) == null || (windowToken = view.getWindowToken()) == null) {
            return false;
        }
        try {
            boolean hideSoftInputFromWindow = inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "hideVKB status:%s", java.lang.Boolean.valueOf(hideSoftInputFromWindow));
            return hideSoftInputFromWindow;
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMActivityController", "hide VKB(View) exception %s", e17);
            return false;
        }
    }

    public final void N(android.app.Activity activity) {
        if (this.G == null || d0()) {
            return;
        }
        if (!this.P) {
            this.O = u();
        }
        this.R = com.tencent.mm.ui.uk.g(this.O);
        p0(this.O);
        this.G.I(new android.graphics.drawable.ColorDrawable(x().getResources().getColor(android.R.color.transparent)));
        this.G.F(false);
        this.G.B(false);
        this.G.E(false);
        this.G.D(true);
        this.G.H(com.tencent.mm.R.drawable.f482190b84);
        if (this.f208653k0 == -1) {
            this.G.y(com.tencent.mm.ui.id.b(x()).inflate(this.f208651j0, (android.view.ViewGroup) new android.widget.LinearLayout(x()), false));
        } else {
            this.G.y(com.tencent.mm.ui.id.b(x()).inflate(this.f208653k0, (android.view.ViewGroup) new android.widget.LinearLayout(x()), false));
        }
        this.H = (android.widget.TextView) r(android.R.id.text1);
        this.N = (android.widget.TextView) r(android.R.id.text2);
        com.tencent.mm.ui.f.b(this.H, com.tencent.mm.R.dimen.f479559b);
        this.I = r(com.tencent.mm.R.id.oct);
        this.M = (android.widget.ProgressBar) r(com.tencent.mm.R.id.lbl);
        this.f208631J = r(com.tencent.mm.R.id.actionbar_up_indicator);
        this.K = (com.tencent.mm.ui.widget.imageview.WeImageView) r(com.tencent.mm.R.id.actionbar_up_indicator_btn);
        this.f208645g0 = i65.a.f(x(), com.tencent.mm.R.dimen.ajt);
        android.view.View view = this.f208631J;
        if (view != null) {
            view.post(new com.tencent.mm.ui.bb(this));
            this.f208631J.setOnTouchListener(new com.tencent.mm.ui.cb(this));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.K;
        if (weImageView != null) {
            weImageView.setContentDescription(x().getString(com.tencent.mm.R.string.f490012ig));
        }
        android.widget.TextView textView = (android.widget.TextView) r(com.tencent.mm.R.id.i0i);
        this.L = textView;
        com.tencent.mm.ui.f.b(textView, com.tencent.mm.R.dimen.f479559b);
        android.widget.TextView textView2 = this.H;
        if (textView2 != null) {
            textView2.setText(com.tencent.mm.R.string.pk7);
        }
        this.f208633a0 = r(com.tencent.mm.R.id.f482535h1);
        this.f208635b0 = (com.tencent.mm.ui.widget.AlbumChooserView) r(com.tencent.mm.R.id.f482508gg);
        if (activity.getClass().getName() == "WebViewUI") {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.K;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            android.view.View view2 = this.f208631J;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (activity instanceof com.tencent.mm.ui.MMActivity) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.K;
            if (weImageView3 != null) {
                weImageView3.setVisibility(0);
            }
            android.view.View view3 = this.f208631J;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView3 = this.H;
            if (textView3 != null) {
                textView3.setVisibility(0);
                com.tencent.mm.ui.bk.r0(this.H.getPaint(), 0.8f);
            }
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.K;
            if (weImageView4 != null) {
                weImageView4.setVisibility(8);
            }
            android.view.View view4 = this.f208631J;
            if (view4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/MMActivityController", "initActionBar", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        P0();
    }

    public void N0() {
        this.f208670t.supportInvalidateOptionsMenu();
    }

    public final void O() {
        if (this.actionbarView == null) {
            android.view.View findViewById = this.f208670t.getWindow().getDecorView().findViewById(com.tencent.mm.R.id.f482435ei);
            this.actionbarView = findViewById;
            if (findViewById != null) {
                this.X = findViewById.getLayoutParams();
            }
        }
    }

    public void O0(boolean z17) {
        android.view.View decorView = this.f208670t.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z17 ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
    }

    public final void P() {
        if (this.E == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "initCustomMenuHelper, init, mAppCompatActivity:%s", this.f208670t);
            new al5.n4();
            new al5.n4();
            al5.n4.f5969a.f5977a = T();
            al5.n4.f5969a.f5978b = U();
            int max = java.lang.Math.max(this.Y, com.tencent.mm.ui.zk.e(this.f208672u, com.tencent.mm.R.dimen.f479623ay));
            al5.o4 o4Var = al5.n4.f5969a;
            o4Var.f5979c = max;
            this.E = new com.tencent.mm.ui.tools.e(this.f208670t, o4Var);
        }
        if (this.E != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "initCustomMenuHelper has init.");
        }
    }

    public void P0() {
        if (!this.R) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.K;
            if (weImageView != null) {
                weImageView.setIconColor(this.f208672u.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            }
            android.widget.TextView textView = this.H;
            if (textView != null) {
                textView.setTextColor(this.f208672u.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            }
            if (this.N != null) {
                int i17 = this.f208665q0;
                if (i17 == 0) {
                    i17 = this.f208672u.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9);
                }
                this.N.setTextColor(i17);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.U;
            if (weImageView2 != null && weImageView2.getVisibility() == 0) {
                this.U.setIconColor(this.f208672u.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                return;
            }
            android.widget.TextView textView2 = this.V;
            if (textView2 == null || textView2.getVisibility() != 0) {
                return;
            }
            this.V.setTextColor(i65.a.e(this.f208672u, com.tencent.mm.R.color.a0e));
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.K;
        if (weImageView3 != null) {
            w0(weImageView3, -1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        android.widget.TextView textView3 = this.H;
        if (textView3 != null) {
            textView3.setTextColor(this.f208672u.getResources().getColor(com.tencent.mm.R.color.by));
        }
        if (this.N != null) {
            int i18 = this.f208665q0;
            if (i18 == 0) {
                i18 = this.f208672u.getResources().getColor(com.tencent.mm.R.color.by);
            }
            this.N.setTextColor(i18);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.U;
        if (weImageView4 == null || weImageView4.getVisibility() != 0) {
            android.widget.TextView textView4 = this.V;
            if (textView4 == null || textView4.getVisibility() != 0) {
                return;
            }
            this.V.setTextColor(i65.a.e(this.f208672u, com.tencent.mm.R.color.f478600bz));
            return;
        }
        if (this.U.getDrawable() == null) {
            w0(this.U, -1, android.graphics.PorterDuff.Mode.SRC_ATOP);
            return;
        }
        android.graphics.drawable.Drawable drawable = this.U.getDrawable();
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_ATOP;
        if (this.f208641e0) {
            drawable.setColorFilter(-1, mode);
        } else {
            drawable.clearColorFilter();
        }
    }

    public void Q0(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        if (this.G == null || (weImageView = this.K) == null || drawable == null) {
            return;
        }
        weImageView.setImageDrawable(drawable);
        drawable.invalidateSelf();
    }

    public final void R(int i17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "initNotifyView viewid[%d], visible[%b], uithread[%b], noticeid[%s], position[%d], notifyView[%s]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), str3, java.lang.Integer.valueOf(i18), this.f208640e);
        if (c0()) {
            if (z17 || this.f208640e != null) {
                androidx.appcompat.app.b bVar = this.G;
                if (bVar != null && !bVar.q()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "initNotifyView mActionBar not showing");
                    return;
                }
                if (this.f208644g == null) {
                    this.f208644g = (android.widget.FrameLayout) this.f208638d.findViewById(com.tencent.mm.R.id.jlt);
                }
                android.view.View view = this.f208640e;
                if (view != null) {
                    this.f208644g.removeView(view);
                }
                android.view.View inflate = this.f208636c.inflate(i17 > 0 ? i17 : com.tencent.mm.R.layout.c1s, (android.view.ViewGroup) null);
                this.f208640e = inflate;
                this.f208642f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kgh);
                this.f208640e.findViewById(com.tencent.mm.R.id.kg_).setOnClickListener(new com.tencent.mm.ui.wa(this, str3, i18));
                this.f208640e.setOnClickListener(new com.tencent.mm.ui.xa(this, str));
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
                if (this.f208647h0) {
                    layoutParams.setMargins(0, com.tencent.mm.sdk.platformtools.j.d(this.f208670t, 48.0f), 0, 0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "summerdiz initNotifyView [%d, %d]", java.lang.Integer.valueOf(layoutParams.height), java.lang.Integer.valueOf(layoutParams.topMargin));
                }
                android.widget.FrameLayout frameLayout = this.f208644g;
                frameLayout.addView(this.f208640e, frameLayout.getChildCount(), layoutParams);
                android.view.View view2 = this.f208640e;
                if (view2 != null) {
                    if (!z18) {
                        view2.post(new com.tencent.mm.ui.ya(this, z17, str2, str));
                        return;
                    }
                    int i19 = z17 ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "initNotifyView", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/MMActivityController", "initNotifyView", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    java.lang.String string = this.f208672u.getString(com.tencent.mm.R.string.f492297fz3);
                    java.lang.String string2 = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? this.f208672u.getString(com.tencent.mm.R.string.f491052bq2) : str2;
                    if (str != null) {
                        android.text.SpannableString spannableString = new android.text.SpannableString(string2 + string);
                        spannableString.setSpan(new android.text.style.ForegroundColorSpan(-10119449), string2.length(), string2.length() + string.length(), 33);
                        this.f208642f.setText(spannableString);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "summerdiz url is null 1");
                        this.f208642f.setText(string2);
                    }
                    this.f208640e.invalidate();
                    this.f208644g.invalidate();
                }
            }
        }
    }

    public void R0(java.lang.String str) {
        la5.b.f317600a.getClass();
    }

    public boolean S() {
        return this instanceof com.tencent.mm.ui.yb;
    }

    public final void S0() {
        if (this.T && this.O == 0) {
            this.R = this.S;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "[updateIsDarkActionBar] : isDarkActionBar = isDarkMode");
        } else {
            boolean g17 = com.tencent.mm.ui.uk.g(this.O);
            this.R = g17;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "[updateIsDarkActionBar] : isDarkActionBar = %s of ActionBarColor 0x%08X", java.lang.Boolean.valueOf(g17), java.lang.Integer.valueOf(this.O));
        }
    }

    public boolean T() {
        return true;
    }

    public void T0(int i17, int i18) {
        com.tencent.mm.ui.eb E = E(i17);
        if (E == null || E.f208376b == i18) {
            return;
        }
        E.f208376b = i18;
        N0();
    }

    public boolean U() {
        return false;
    }

    public void U0(int i17, boolean z17) {
        com.tencent.mm.ui.eb E = E(i17);
        if (E == null || E.f208387m == z17) {
            return;
        }
        E.f208387m = z17;
        N0();
    }

    public abstract boolean V();

    public void V0(int i17, java.lang.String str) {
        com.tencent.mm.ui.eb E = E(i17);
        if (E != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if ((str == null ? "" : str).equals(E.f208382h)) {
                return;
            }
            E.f208382h = str;
            N0();
        }
    }

    public final boolean W(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        activity.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478455kc, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        return charSequence != null && charSequence.equals(activity.getString(com.tencent.mm.R.string.fhd));
    }

    public void W0(android.app.Activity activity, int i17) {
        fp.m.e();
        boolean z17 = activity instanceof com.tencent.mm.ui.MMActivity;
        if (z17) {
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            if (mMActivity.fixStatusbar && mMActivity.getF65848t()) {
                vj5.a.a(w(), i17, vj5.o.h(activity.getWindow()));
                if (z17 && com.tencent.mm.ui.b4.c(activity)) {
                    vj5.a.a(w(), i17, vj5.o.h(activity.getWindow()));
                }
                this.f208673u0 = i17;
            }
        }
        activity.getWindow().setStatusBarColor(i17);
        if (z17) {
            vj5.a.a(w(), i17, vj5.o.h(activity.getWindow()));
        }
        this.f208673u0 = i17;
    }

    public final boolean X(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        activity.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478455kc, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        return charSequence != null && charSequence.equals(activity.getString(com.tencent.mm.R.string.hdl));
    }

    public void X0(android.app.Activity activity, int i17) {
        this.R = com.tencent.mm.ui.uk.g(i17);
        W0(activity, i17);
        O0(this.R);
    }

    public boolean Y() {
        return false;
    }

    public final void Y0() {
        int i17;
        int i18;
        int i19;
        int dimensionPixelSize = this.f208672u.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479559b);
        java.lang.String str = this.f208654l != 0 ? "# %s" : "%s";
        if (this.f208656m != 0) {
            str = str + " #";
            i17 = 1;
        } else {
            i17 = 0;
        }
        if (this.f208666r) {
            str = str + " #";
            i17 += 2;
            i18 = 1;
        } else {
            i18 = 0;
        }
        if (this.f208668s) {
            str = str + " #";
            i18 += 2;
            i17 += 2;
            i19 = 1;
        } else {
            i19 = 0;
        }
        java.lang.CharSequence a17 = pg5.d.a(this.f208672u, java.lang.String.format(str, this.f208652k));
        if (a17 instanceof android.text.SpannableString) {
            android.text.SpannableString spannableString = (android.text.SpannableString) a17;
            if (this.f208654l != 0) {
                spannableString.setSpan(this.f208658n, 0, 1, 33);
            }
            if (this.f208656m != 0) {
                int length = spannableString.length() - i17;
                spannableString.setSpan(this.f208660o, length, length + 1, 33);
            }
            if (this.f208666r) {
                if (this.f208662p == null) {
                    android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(x(), com.tencent.mm.R.raw.icons_outlined_bellring_off, x().getResources().getColor(com.tencent.mm.R.color.f478694eb));
                    if (this.R) {
                        com.tencent.mm.ui.uk.f(e17, -1);
                    }
                    e17.setBounds(0, 0, com.tencent.mm.ui.zk.e(x(), com.tencent.mm.R.dimen.f479688cn), com.tencent.mm.ui.zk.e(x(), com.tencent.mm.R.dimen.f479688cn));
                    al5.w wVar = new al5.w(e17, 1);
                    int intrinsicHeight = (e17.getIntrinsicHeight() - dimensionPixelSize) / 2;
                    this.f208662p = wVar;
                }
                int length2 = spannableString.length() - i18;
                spannableString.setSpan(this.f208662p, length2, length2 + 1, 33);
            }
            if (this.f208668s) {
                if (this.f208664q == null) {
                    this.f208664q = z(dimensionPixelSize, com.tencent.mm.R.raw.chat_phone_notify_title_icon);
                }
                int length3 = spannableString.length() - i19;
                spannableString.setSpan(this.f208664q, length3, length3 + 1, 33);
            }
        }
        android.widget.TextView textView = this.H;
        if (textView != null) {
            textView.setText(a17);
        }
    }

    public final boolean Z(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        activity.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478455kc, typedValue, true);
        java.lang.CharSequence charSequence = typedValue.string;
        return charSequence != null && charSequence.equals(activity.getString(com.tencent.mm.R.string.k1z));
    }

    public boolean b0() {
        return !(this instanceof lk5.g0);
    }

    public boolean c0() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void d(android.view.Menu menu) {
        java.lang.String str;
        int i17;
        boolean z17;
        db5.g4 g4Var;
        android.view.View view;
        android.view.View inflate;
        int i18;
        int i19;
        android.view.View findViewById;
        com.tencent.mm.ui.ga gaVar = this;
        android.view.Menu menu2 = menu;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "actionBarTitleCenter isActionbarMenuUseOriginalSys: %s.", java.lang.Boolean.valueOf(U()));
        java.lang.String str2 = "MicroMsg.ActionBarMenuViewHelper";
        if (U()) {
            com.tencent.mm.ui.tools.e eVar = gaVar.E;
            if (eVar != null) {
                androidx.appcompat.app.b F = F();
                com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "resetStatus, actionBar is %s.", F);
                eVar.f210364c = false;
                ((java.util.ArrayList) eVar.f210365d.f228344d).clear();
                if (F == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "resetStatus, actionBar is null");
                } else {
                    android.view.View j17 = F.j();
                    if (j17 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "resetStatus, customView is null");
                    } else {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) j17.findViewById(com.tencent.mm.R.id.coy);
                        if (viewGroup == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "resetStatus, WXMenus is null");
                        } else {
                            viewGroup.removeAllViews();
                        }
                    }
                }
            }
            androidx.appcompat.app.b F2 = F();
            boolean T = T();
            android.view.View j18 = F2.j();
            if (j18 == null || (findViewById = j18.findViewById(com.tencent.mm.R.id.f482523gp)) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView measuredWidth outside is %s, isActionbarCenterLayoutMode is %s, customView: %s， context: %s.", java.lang.Integer.valueOf(j18.getMeasuredWidth()), java.lang.Boolean.valueOf(T), j18, j18.getContext());
            j18.post(new com.tencent.mm.ui.e(j18, F2, this, menu, findViewById, T));
            return;
        }
        P();
        com.tencent.mm.ui.tools.e eVar2 = gaVar.E;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = gaVar.f208670t;
        eVar2.f210364c = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu");
        if (appCompatActivity == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, activity is null | mActionBar is null.");
            return;
        }
        if (menu2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, menu = null");
            return;
        }
        al5.o4 o4Var = eVar2.f210363b;
        if (o4Var.f5978b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, useOrginalSysMode.");
            return;
        }
        int i27 = 0;
        for (int i28 = 0; i28 < menu.size(); i28++) {
            android.view.MenuItem item = menu2.getItem(i28);
            if (item != null && item.isVisible()) {
                i27++;
            }
        }
        if (i27 >= 4 && o4Var.f5977a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, menu is null visibleItemCount: %s", java.lang.Integer.valueOf(i27));
            return;
        }
        androidx.appcompat.app.b F3 = F();
        if (F3 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, actionBar is null");
            return;
        }
        android.view.View j19 = F3.j();
        if (j19 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, customView is null");
            return;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) j19.findViewById(com.tencent.mm.R.id.coy);
        if (viewGroup2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, WXMenus is null");
            return;
        }
        boolean V = V();
        db5.g4 g4Var2 = eVar2.f210365d;
        if (!V) {
            ((java.util.ArrayList) g4Var2.f228344d).clear();
            viewGroup2.removeAllViews();
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, is no FromFragment.");
        }
        if (menu.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, menu size is 0");
            return;
        }
        ((java.util.ArrayList) g4Var2.f228344d).clear();
        viewGroup2.removeAllViews();
        boolean z18 = true;
        eVar2.f210364c = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarMenuViewHelper", "on create options menu, menu = " + menu.size());
        int i29 = 0;
        while (i29 < menu.size()) {
            android.view.MenuItem item2 = menu2.getItem(i29);
            if (item2 != null) {
                g4Var2.v(item2);
                if (item2.isVisible()) {
                    com.tencent.mars.xlog.Log.i(str2, "on create options menu, menuItem is %s, searchViewHelper: %s.,", item2, gaVar.B);
                    if (item2.getItemId() != com.tencent.mm.R.id.jha || gaVar.B == null) {
                        str = str2;
                        i17 = i29;
                        z17 = z18;
                        g4Var = g4Var2;
                        view = j19;
                        com.tencent.mm.ui.tools.d dVar = new com.tencent.mm.ui.tools.d(eVar2);
                        int i37 = com.tencent.mm.ui.widget.WXActionMenuView.f211486q;
                        if (item2.getActionView() != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "makeMMActionMenuView : getActionView.");
                            if (item2.getActionView().getParent() instanceof android.view.ViewGroup) {
                                ((android.view.ViewGroup) item2.getActionView().getParent()).removeView(item2.getActionView());
                            }
                            inflate = item2.getActionView();
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "makeMMActionMenuView : icon.");
                            inflate = android.view.LayoutInflater.from(appCompatActivity).inflate(com.tencent.mm.R.layout.f487910bc, (android.view.ViewGroup) null);
                            ((com.tencent.mm.ui.widget.WXActionMenuView) inflate.findViewById(com.tencent.mm.R.id.f482477fl)).a(appCompatActivity, item2, o4Var, dVar);
                            inflate.setTag(item2);
                        }
                    } else {
                        com.tencent.mm.ui.tools.c cVar = new com.tencent.mm.ui.tools.c(eVar2);
                        int i38 = com.tencent.mm.ui.widget.WXActionMenuView.f211486q;
                        try {
                            java.lang.reflect.Field declaredField = item2.getClass().getDeclaredField("mShowAsAction");
                            declaredField.setAccessible(true);
                            i19 = ((java.lang.Integer) declaredField.get(item2)).intValue();
                            i18 = i29;
                            try {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "makeMMActionSearchMenuView : showAsAction: %s.", java.lang.Integer.valueOf(i19));
                            } catch (java.lang.Exception unused) {
                            }
                        } catch (java.lang.Exception unused2) {
                            i18 = i29;
                            i19 = 2;
                        }
                        com.tencent.mm.ui.tools.c9 c9Var = gaVar.B;
                        com.tencent.mm.ui.tools.z8 z8Var = c9Var.f210332q;
                        boolean z19 = c9Var.f210317b;
                        boolean z27 = c9Var.f210318c;
                        str = str2;
                        g4Var = g4Var2;
                        java.lang.Object[] objArr = new java.lang.Object[4];
                        objArr[0] = c9Var;
                        z17 = true;
                        objArr[1] = java.lang.Boolean.valueOf(z27);
                        objArr[2] = java.lang.Boolean.valueOf(item2.isActionViewExpanded());
                        objArr[3] = java.lang.Boolean.valueOf((i19 & 8) == 8);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction, searchViewHelper: %s, isActionViewExpanded: %s, menuItem.isActionViewExpanded %s, showAsAction: %s.", objArr);
                        if (z27) {
                            view = j19;
                            i17 = i18;
                            if (item2.getActionView() != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "makeMMActionSearchMenuView, getActionView.");
                                if (item2.getActionView().getParent() instanceof android.view.ViewGroup) {
                                    ((android.view.ViewGroup) item2.getActionView().getParent()).removeView(item2.getActionView());
                                }
                                item2.getActionView().setTag(com.tencent.mm.R.id.jha, item2);
                                inflate = item2.getActionView();
                            } else {
                                inflate = new android.view.View(appCompatActivity);
                            }
                        } else {
                            inflate = android.view.LayoutInflater.from(appCompatActivity).inflate(com.tencent.mm.R.layout.f487910bc, (android.view.ViewGroup) null);
                            com.tencent.mm.ui.widget.WXActionMenuView wXActionMenuView = (com.tencent.mm.ui.widget.WXActionMenuView) inflate.findViewById(com.tencent.mm.R.id.f482477fl);
                            wXActionMenuView.a(appCompatActivity, item2, o4Var, cVar);
                            i17 = i18;
                            view = j19;
                            wXActionMenuView.setOnClickListener(new al5.m4(z19, z8Var, cVar, appCompatActivity, item2));
                            inflate.setTag(com.tencent.mm.R.id.jha, item2);
                            if (item2.getIcon() == null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(8);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/ui/widget/WXActionMenuView", "makeMMActionSearchMenuView", "(Landroid/app/Activity;Landroid/view/MenuItem;Lcom/tencent/mm/ui/widget/WXActionMenuView$MenuCustomParam;Lcom/tencent/mm/ui/widget/WXActionMenuView$OnMenuItemClickListener;Lcom/tencent/mm/ui/MMActivityController;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(inflate, "com/tencent/mm/ui/widget/WXActionMenuView", "makeMMActionSearchMenuView", "(Landroid/app/Activity;Landroid/view/MenuItem;Lcom/tencent/mm/ui/widget/WXActionMenuView$MenuCustomParam;Lcom/tencent/mm/ui/widget/WXActionMenuView$OnMenuItemClickListener;Lcom/tencent/mm/ui/MMActivityController;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                    viewGroup2.addView(inflate);
                    i29 = i17 + 1;
                    gaVar = this;
                    menu2 = menu;
                    j19 = view;
                    g4Var2 = g4Var;
                    z18 = z17;
                    str2 = str;
                } else {
                    com.tencent.mars.xlog.Log.i(str2, "on create options menuItem is unenble.");
                }
            }
            str = str2;
            i17 = i29;
            z17 = z18;
            g4Var = g4Var2;
            view = j19;
            i29 = i17 + 1;
            gaVar = this;
            menu2 = menu;
            j19 = view;
            g4Var2 = g4Var;
            z18 = z17;
            str2 = str;
        }
        java.lang.String str3 = str2;
        boolean z28 = z18;
        android.view.View view2 = j19;
        int measuredWidth = viewGroup2.getMeasuredWidth();
        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.actionbar_up_indicator);
        int dimension = (int) view2.getResources().getDimension(com.tencent.mm.R.dimen.f480124op);
        if (findViewById2 != null) {
            dimension = findViewById2.getMeasuredWidth();
        }
        int i39 = eVar2.f210367f;
        if (dimension <= i39) {
            dimension = i39;
        }
        com.tencent.mars.xlog.Log.i(str3, "getAvailableWidth, padding is %s, maxPadding: %s, minPadding: %s, backWidth:%s, visibleItemCount:%s.", java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(eVar2.f210366e), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(dimension), java.lang.Integer.valueOf(i27));
        if (eVar2.f210366e == 0) {
            int dimension2 = (int) appCompatActivity.getResources().getDimension(appCompatActivity.getResources().getConfiguration().orientation == 2 ? z28 : false ? com.tencent.mm.R.dimen.f479622ax : com.tencent.mm.R.dimen.f479623ay);
            eVar2.f210362a = dimension2;
            eVar2.f210366e = dimension2 * 3;
        }
        if (measuredWidth > eVar2.f210366e) {
            measuredWidth = eVar2.f210362a * i27;
        }
        if (measuredWidth >= i39) {
            i39 = measuredWidth;
        }
        if (dimension <= i39) {
            dimension = i39;
        }
        if (V()) {
            com.tencent.mars.xlog.Log.i(str3, "clearMenu, isFromFragment");
            menu.clear();
        } else {
            java.util.List<androidx.fragment.app.Fragment> fragments = appCompatActivity.getSupportFragmentManager().getFragments();
            if (fragments == null || fragments.size() <= 0) {
                com.tencent.mars.xlog.Log.i(str3, "clearMenu, iFragment no has size");
                menu.clear();
            } else {
                com.tencent.mars.xlog.Log.i(str3, "clearMenu, fragments.size(): %s.", java.lang.Integer.valueOf(fragments.size()));
                boolean z29 = false;
                for (int i47 = 0; i47 < fragments.size(); i47++) {
                    androidx.fragment.app.Fragment fragment = fragments.get(i47);
                    if (fragment instanceof com.tencent.mm.ui.MMFragment) {
                        com.tencent.mm.ui.MMFragment mMFragment = (com.tencent.mm.ui.MMFragment) fragment;
                        try {
                            z29 = ((java.lang.Boolean) mMFragment.getClass().getMethod("hasOptionsMenu", new java.lang.Class[0]).invoke(mMFragment.getClass().newInstance(), new java.lang.Object[0])).booleanValue();
                        } catch (java.lang.Exception unused3) {
                            z29 = false;
                        }
                        com.tencent.mars.xlog.Log.i(str3, "clearMenu, getHasOptionMenu: %s.", java.lang.Boolean.valueOf(z29));
                        if (z29) {
                            break;
                        }
                    }
                }
                if (!z29) {
                    menu.clear();
                }
                com.tencent.mars.xlog.Log.i(str3, "clearMenu, iFragment has size, noNeedClear: %s.", java.lang.Boolean.valueOf(z29));
            }
        }
        if (!o4Var.f5977a) {
            com.tencent.mars.xlog.Log.i(str3, "checkTitleSize, no need TitleCenterMode.");
            return;
        }
        android.view.View findViewById3 = F3.j().findViewById(com.tencent.mm.R.id.f482523gp);
        android.widget.TextView textView = (android.widget.TextView) F3.j().findViewById(android.R.id.text1);
        if (findViewById3 == null) {
            com.tencent.mars.xlog.Log.i(str3, "checkTitleSize, centerLayout is null");
            return;
        }
        com.tencent.mars.xlog.Log.i(str3, "checkTitleSize, padding = %s.", java.lang.Integer.valueOf(dimension));
        int min = java.lang.Math.min(eVar2.f210366e, dimension);
        com.tencent.mars.xlog.Log.i(str3, "checkTitleSize, min padding = %s.", java.lang.Integer.valueOf(min));
        findViewById3.setPadding(min, 0, min, 0);
        if (textView == null || textView.getVisibility() != 4) {
            return;
        }
        textView.setVisibility(0);
    }

    public boolean d0() {
        return false;
    }

    public void e(boolean z17) {
        s75.b B = B();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.ha(this, z17, B), "ActivateBroadcast-Thread");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0(android.content.Context r12, androidx.appcompat.app.AppCompatActivity r13) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.ga.e0(android.content.Context, androidx.appcompat.app.AppCompatActivity):void");
    }

    public void f(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        i(i17, i19, this.f208672u.getString(i18), false, onMenuItemClickListener, null, com.tencent.mm.ui.fb.NORMAL);
    }

    public abstract void f0();

    public void g(int i17, java.lang.String str, int i18, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        i(i17, i18, str, false, onMenuItemClickListener, null, com.tencent.mm.ui.fb.NORMAL);
    }

    public boolean g0(android.view.Menu menu) {
        com.tencent.mm.ui.tools.c9 c9Var;
        boolean z17;
        boolean z18;
        boolean z19;
        java.util.LinkedList linkedList = this.D;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "on create option menu, menuCache size:%d", java.lang.Integer.valueOf(linkedList.size()));
        if (this.G == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "error, mActionBar is null or cache size:%d", java.lang.Integer.valueOf(linkedList.size()));
            d(menu);
            return false;
        }
        android.view.ViewGroup viewGroup = null;
        this.f208657m0 = null;
        this.f208659n0 = null;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.eb ebVar = (com.tencent.mm.ui.eb) it.next();
            int i17 = ebVar.f208375a;
            if (i17 != 16908332) {
                if (i17 != com.tencent.mm.R.id.jha) {
                    android.view.MenuItem add = menu.add(0, i17, 0, ebVar.f208382h);
                    java.lang.String name = getClass().getName();
                    if (add == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MenuItemUtil", "fixTitleCondensed fail, item is null");
                    } else if (add.getTitleCondensed() == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MenuItemUtil", "%s title condensed is null, fix it", name);
                        add.setTitleCondensed("");
                    } else if (!(add.getTitleCondensed() instanceof java.lang.String)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MenuItemUtil", "%s title condensed is not String type, cur type[%s], cur value[%s], fix it", name, add.getTitleCondensed().getClass().getName(), add.getTitleCondensed());
                        add.setTitleCondensed(add.getTitleCondensed().toString());
                    }
                    com.tencent.mm.ui.ia iaVar = new com.tencent.mm.ui.ia(this, add, ebVar);
                    com.tencent.mm.ui.ja jaVar = new com.tencent.mm.ui.ja(this, ebVar);
                    com.tencent.mm.ui.ka kaVar = new com.tencent.mm.ui.ka(this, ebVar);
                    if (ebVar.f208376b == 0 && ebVar.f208379e == null) {
                        if (ebVar.f208384j == null) {
                            ebVar.f208384j = android.view.View.inflate(this.f208672u, com.tencent.mm.R.layout.f487907b9, viewGroup);
                        }
                        android.widget.TextView textView = (android.widget.TextView) ebVar.f208384j.findViewById(com.tencent.mm.R.id.f482486fu);
                        this.V = textView;
                        textView.setVisibility(0);
                        ((android.widget.ImageView) ebVar.f208384j.findViewById(com.tencent.mm.R.id.s89)).setVisibility(ebVar.f208387m ? 0 : 8);
                        android.widget.Button button = (android.widget.Button) ebVar.f208384j.findViewById(com.tencent.mm.R.id.f482481fp);
                        this.W = button;
                        button.setVisibility(8);
                        com.tencent.mm.ui.f.b(this.W, com.tencent.mm.R.dimen.f479628b3);
                        com.tencent.mm.ui.f.b(this.V, com.tencent.mm.R.dimen.f479559b);
                        android.view.View findViewById = ebVar.f208384j.findViewById(com.tencent.mm.R.id.f482895r3);
                        this.f208637c0 = findViewById;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.tencent.mm.ui.fb fbVar = ebVar.f208386l;
                        if (fbVar == com.tencent.mm.ui.fb.RED || fbVar == com.tencent.mm.ui.fb.TRANSPARENT_RED_TEXT) {
                            this.V.setTextColor(i65.a.e(x(), com.tencent.mm.R.color.f479483a32));
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.abr));
                            this.V.setVisibility(8);
                        } else if (fbVar == com.tencent.mm.ui.fb.TRANSPARENT_GREEN_TEXT) {
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.abt));
                            this.W.setTextColor(x().getResources().getColor(com.tencent.mm.R.color.abu));
                            this.V.setVisibility(8);
                        } else if (fbVar == com.tencent.mm.ui.fb.GREEN) {
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.abr));
                            this.W.setTextColor(x().getResources().getColor(com.tencent.mm.R.color.abs));
                            this.V.setVisibility(8);
                        } else if (fbVar == com.tencent.mm.ui.fb.BLACK) {
                            this.V.setTextColor(i65.a.e(x(), com.tencent.mm.R.color.a0e));
                        } else if (fbVar == com.tencent.mm.ui.fb.TRANSPARENT_GOLD_TEXT) {
                            this.V.setTextColor(x().getResources().getColor(com.tencent.mm.R.color.x_));
                        } else if (fbVar == com.tencent.mm.ui.fb.GOLDEN) {
                            this.V.setTextColor(x().getResources().getColor(com.tencent.mm.R.color.f479482a31));
                        } else if (fbVar == com.tencent.mm.ui.fb.YELLOW) {
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.Yellow_100));
                            this.V.setTextColor(i65.a.e(x(), com.tencent.mm.R.color.f478838io));
                            this.V.setVisibility(8);
                        } else if (com.tencent.mm.ui.fb.DARK_GREEN_MODE == fbVar) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "dark green mode.");
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.abr));
                            this.W.setTextColor(x().getResources().getColor(com.tencent.mm.R.color.abs));
                            this.V.setVisibility(8);
                        } else if (fbVar == com.tencent.mm.ui.fb.ORANGE) {
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.abr));
                            this.W.setTextColor(x().getResources().getColor(com.tencent.mm.R.color.abs));
                            this.V.setVisibility(8);
                        } else if (com.tencent.mm.ui.fb.SMART_GALLERY_SEARCH_ENTRY == fbVar) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "smart gallery entry %s.", java.lang.Boolean.valueOf(this.f208678z));
                            this.V.setVisibility(8);
                            if (this.f208678z) {
                                android.view.View view = this.f208637c0;
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(0);
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                this.f208637c0.setOnClickListener(iaVar);
                            } else {
                                if (8 == this.f208637c0.getVisibility()) {
                                    android.view.View view2 = this.f208637c0;
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    arrayList3.add(4);
                                    java.util.Collections.reverse(arrayList3);
                                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                    yj0.a.f(view2, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                } else if (this.f208637c0.getVisibility() == 0) {
                                    this.f208637c0.animate().alpha(0.0f).setDuration(200L).withEndAction(new com.tencent.mm.ui.la(this));
                                }
                                this.f208637c0.setOnClickListener(null);
                            }
                        } else if (com.tencent.mm.ui.fb.FEED_FOLLOW == fbVar) {
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.abr));
                            this.W.setTextColor(x().getResources().getColor(com.tencent.mm.R.color.abs));
                            this.V.setVisibility(8);
                        } else if (com.tencent.mm.ui.fb.FEED_UNFOLLOW == fbVar) {
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.f478492d));
                            this.W.setTextColor(i65.a.d(x(), com.tencent.mm.R.color.BW_0_Alpha_0_9));
                            this.V.setVisibility(8);
                        } else if (com.tencent.mm.ui.fb.FINDER_LIVE == fbVar) {
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.abr));
                            this.W.setTextColor(x().getResources().getColor(com.tencent.mm.R.color.abs));
                            this.V.setVisibility(8);
                        } else if (com.tencent.mm.ui.fb.ALTER_BTN_BACKGROUND == ebVar.f208386l) {
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.a9e));
                            this.W.setTextColor(i65.a.d(x(), com.tencent.mm.R.color.f478774gu));
                            this.V.setVisibility(8);
                        } else if (com.tencent.mm.ui.fb.TIGER2022 == ebVar.f208386l) {
                            this.W.setVisibility(0);
                            this.W.setBackgroundColor(x().getResources().getColor(com.tencent.mm.R.color.a6h));
                            this.W.setTextColor(i65.a.e(x(), com.tencent.mm.R.color.f478838io));
                            this.V.setVisibility(8);
                        } else if (com.tencent.mm.ui.fb.SELECT == ebVar.f208386l) {
                            this.V.setVisibility(8);
                            this.f208639d0 = ebVar.f208384j.findViewById(com.tencent.mm.R.id.f482485ft);
                            android.view.View view3 = this.f208639d0;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            arrayList4.add(0);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            this.f208639d0.setOnClickListener(iaVar);
                        } else if (com.tencent.mm.ui.fb.BLUE_TEXT_MEDIUM == ebVar.f208386l) {
                            this.V.setTextColor(i65.a.e(x(), com.tencent.mm.R.color.Link_100));
                            com.tencent.mm.ui.bk.s0(this.V.getPaint());
                        } else if (this.Q != 0) {
                            this.V.setTextColor(this.Q);
                        } else if (this.R) {
                            this.V.setTextColor(i65.a.e(x(), com.tencent.mm.R.color.f478600bz));
                        } else {
                            this.V.setTextColor(i65.a.e(x(), com.tencent.mm.R.color.a0e));
                        }
                        this.V.setText(ebVar.f208382h);
                        int i18 = ebVar.f208383i;
                        if (i18 != 0) {
                            this.V.setTextColor(i18);
                        }
                        if (ebVar.f208395u) {
                            this.V.setTextColor(ebVar.f208391q);
                            this.W.setBackgroundColor(ebVar.f208393s);
                            this.W.setTextColor(ebVar.f208391q);
                            android.widget.Button button2 = this.W;
                            float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
                            if (button2 == null) {
                                z19 = true;
                            } else {
                                z19 = true;
                                button2.setOutlineProvider(new zl5.a(true, true, b17));
                            }
                            if (button2 != null) {
                                button2.setClipToOutline(z19);
                            }
                        } else if (ebVar.f208393s != 0) {
                            if (com.tencent.mm.ui.bk.C()) {
                                this.V.setTextColor(ebVar.f208392r);
                                this.W.setBackgroundColor(ebVar.f208394t);
                                this.W.setTextColor(ebVar.f208392r);
                                android.widget.Button button3 = this.W;
                                float b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
                                if (button3 == null) {
                                    z18 = true;
                                } else {
                                    z18 = true;
                                    button3.setOutlineProvider(new zl5.a(true, true, b18));
                                }
                                if (button3 != null) {
                                    button3.setClipToOutline(z18);
                                }
                            } else {
                                this.V.setTextColor(ebVar.f208391q);
                                this.W.setBackgroundColor(ebVar.f208393s);
                                this.W.setTextColor(ebVar.f208391q);
                                android.widget.Button button4 = this.W;
                                float b19 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
                                if (button4 == null) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                    button4.setOutlineProvider(new zl5.a(true, true, b19));
                                }
                                if (button4 != null) {
                                    button4.setClipToOutline(z17);
                                }
                            }
                        }
                        this.V.setOnClickListener(iaVar);
                        this.V.setOnLongClickListener(jaVar);
                        this.V.setEnabled(ebVar.f208380f);
                        this.V.setOnTouchListener(kaVar);
                        this.W.setText(ebVar.f208382h);
                        this.W.setOnClickListener(iaVar);
                        this.W.setOnLongClickListener(jaVar);
                        this.W.setOnTouchListener(kaVar);
                        this.W.setEnabled(ebVar.f208380f);
                        add.setActionView(ebVar.f208384j);
                    } else {
                        if (ebVar.f208385k == null) {
                            ebVar.f208385k = android.view.View.inflate(this.f208672u, com.tencent.mm.R.layout.f487907b9, null);
                        }
                        android.widget.ImageView imageView = (android.widget.ImageView) ebVar.f208385k.findViewById(com.tencent.mm.R.id.d0v);
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        if (linkedList.size() <= 1) {
                            this.U = (com.tencent.mm.ui.widget.imageview.WeImageView) ebVar.f208385k.findViewById(com.tencent.mm.R.id.f482482fq);
                            ((android.widget.ImageView) ebVar.f208385k.findViewById(com.tencent.mm.R.id.d2h)).setVisibility(ebVar.f208387m ? 0 : 8);
                            android.view.View findViewById2 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.f482483fr);
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList5.add(8);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(findViewById2, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById3 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.f482484fs);
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            arrayList6.add(8);
                            java.util.Collections.reverse(arrayList6);
                            yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                            yj0.a.f(findViewById3, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById4 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.d2i);
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            arrayList7.add(8);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(findViewById4, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById5 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.d2j);
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            arrayList8.add(8);
                            java.util.Collections.reverse(arrayList8);
                            yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                            yj0.a.f(findViewById5, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else if (((com.tencent.mm.ui.eb) linkedList.get(linkedList.size() - 1)).equals(ebVar)) {
                            this.U = (com.tencent.mm.ui.widget.imageview.WeImageView) ebVar.f208385k.findViewById(com.tencent.mm.R.id.f482484fs);
                            ((android.widget.ImageView) ebVar.f208385k.findViewById(com.tencent.mm.R.id.d2j)).setVisibility(ebVar.f208387m ? 0 : 8);
                            android.view.View findViewById6 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.f482483fr);
                            java.util.ArrayList arrayList9 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList9.add(8);
                            java.util.Collections.reverse(arrayList9);
                            yj0.a.d(findViewById6, arrayList9.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                            yj0.a.f(findViewById6, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById7 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.f482482fq);
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            arrayList10.add(8);
                            java.util.Collections.reverse(arrayList10);
                            yj0.a.d(findViewById7, arrayList10.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById7.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                            yj0.a.f(findViewById7, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById8 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.d2i);
                            java.util.ArrayList arrayList11 = new java.util.ArrayList();
                            arrayList11.add(8);
                            java.util.Collections.reverse(arrayList11);
                            yj0.a.d(findViewById8, arrayList11.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById8.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                            yj0.a.f(findViewById8, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById9 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.d2h);
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            arrayList12.add(8);
                            java.util.Collections.reverse(arrayList12);
                            yj0.a.d(findViewById9, arrayList12.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById9.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                            yj0.a.f(findViewById9, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            this.U = (com.tencent.mm.ui.widget.imageview.WeImageView) ebVar.f208385k.findViewById(com.tencent.mm.R.id.f482483fr);
                            ((android.widget.ImageView) ebVar.f208385k.findViewById(com.tencent.mm.R.id.d2i)).setVisibility(ebVar.f208387m ? 0 : 8);
                            android.view.View findViewById10 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.f482484fs);
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                            arrayList13.add(8);
                            java.util.Collections.reverse(arrayList13);
                            yj0.a.d(findViewById10, arrayList13.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById10.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                            yj0.a.f(findViewById10, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById11 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.f482482fq);
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            arrayList14.add(8);
                            java.util.Collections.reverse(arrayList14);
                            yj0.a.d(findViewById11, arrayList14.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById11.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                            yj0.a.f(findViewById11, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById12 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.d2j);
                            java.util.ArrayList arrayList15 = new java.util.ArrayList();
                            arrayList15.add(8);
                            java.util.Collections.reverse(arrayList15);
                            yj0.a.d(findViewById12, arrayList15.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById12.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                            yj0.a.f(findViewById12, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.View findViewById13 = ebVar.f208385k.findViewById(com.tencent.mm.R.id.d2h);
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            arrayList16.add(8);
                            java.util.Collections.reverse(arrayList16);
                            yj0.a.d(findViewById13, arrayList16.toArray(), "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById13.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                            yj0.a.f(findViewById13, "com/tencent/mm/ui/MMActivityController", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        this.U.setVisibility(0);
                        android.graphics.drawable.Drawable drawable = ebVar.f208379e;
                        if (drawable != null) {
                            this.U.setImageDrawable(drawable);
                        } else {
                            this.U.setImageResource(ebVar.f208376b);
                        }
                        int i19 = this.Q;
                        if (i19 != 0) {
                            w0(this.U, i19, android.graphics.PorterDuff.Mode.SRC_ATOP);
                        } else {
                            int i27 = ebVar.f208377c;
                            if (i27 != 0) {
                                if (ebVar.f208378d) {
                                    w0(this.U, i27, android.graphics.PorterDuff.Mode.SRC_ATOP);
                                }
                            } else if (this.R) {
                                w0(this.U, -1, android.graphics.PorterDuff.Mode.SRC_ATOP);
                            } else {
                                this.U.setIconColor(this.f208672u.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                            }
                        }
                        this.U.setOnClickListener(iaVar);
                        this.U.setEnabled(ebVar.f208380f);
                        this.U.setContentDescription(ebVar.f208382h);
                        this.U.setTag(com.tencent.mm.R.id.nwr, java.lang.Integer.valueOf(ebVar.f208376b));
                        if (ebVar.f208389o != null) {
                            this.U.setOnLongClickListener(jaVar);
                        }
                        add.setActionView(ebVar.f208385k);
                    }
                    add.setEnabled(ebVar.f208380f);
                    add.setVisible(ebVar.f208381g);
                    add.setShowAsAction(2);
                    if (ebVar.f208376b == com.tencent.mm.R.drawable.f481980ap2) {
                        this.f208657m0 = ebVar;
                        this.f208659n0 = add;
                    }
                    viewGroup = null;
                } else if (this.A && (c9Var = this.B) != null) {
                    c9Var.j(this.f208670t, menu);
                }
            }
        }
        d(menu);
        return true;
    }

    public void h(int i17, java.lang.String str, android.graphics.drawable.Drawable drawable, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.NORMAL;
        com.tencent.mm.ui.eb ebVar = new com.tencent.mm.ui.eb();
        ebVar.f208375a = i17;
        ebVar.f208379e = drawable;
        ebVar.f208382h = str;
        ebVar.f208388n = onMenuItemClickListener;
        ebVar.f208389o = null;
        ebVar.f208386l = fbVar;
        o0(i17);
        this.D.add(ebVar);
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.ui.ta(this), 200L);
    }

    public boolean h0(int i17, android.view.KeyEvent keyEvent) {
        boolean z17;
        com.tencent.mm.ui.tools.c9 c9Var;
        if (keyEvent.getAction() == 0) {
            if (i17 == 24) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "dancy onKeyDown ++");
            } else if (i17 == 25) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "dancy onKeyDown --");
            }
        }
        boolean z18 = com.tencent.mm.ui.tools.ld.f210556a;
        if (com.tencent.mm.ui.tools.ld.f210556a) {
            java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.ui.tools.ld.f210557b).iterator();
            while (it.hasNext()) {
                if (((com.tencent.mm.ui.tools.kd) it.next()).onKeyDown(keyEvent.getKeyCode(), keyEvent)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            return true;
        }
        int i18 = to.f.f420891a;
        if (!this.A || (c9Var = this.B) == null || !c9Var.l(i17, keyEvent)) {
            return false;
        }
        if (this.R) {
            p0(x().getResources().getColor(com.tencent.mm.R.color.f478861j7));
        } else {
            p0(x().getResources().getColor(com.tencent.mm.R.color.a07));
        }
        return true;
    }

    public final void i(int i17, int i18, java.lang.String str, boolean z17, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, android.view.View.OnLongClickListener onLongClickListener, com.tencent.mm.ui.fb fbVar) {
        com.tencent.mm.ui.eb ebVar = new com.tencent.mm.ui.eb();
        ebVar.f208375a = i17;
        ebVar.f208376b = i18;
        ebVar.f208382h = str;
        ebVar.f208388n = onMenuItemClickListener;
        ebVar.f208389o = onLongClickListener;
        ebVar.f208386l = fbVar;
        ebVar.f208387m = z17;
        if (i18 == com.tencent.mm.R.drawable.f481980ap2 || i18 == com.tencent.mm.R.raw.icons_outlined_more || i18 == com.tencent.mm.R.raw.actionbar_icon_dark_more || (i18 == com.tencent.mm.R.raw.icons_outlined_help && com.tencent.mm.sdk.platformtools.t8.K0(str))) {
            ebVar.f208382h = this.f208672u.getString(com.tencent.mm.R.string.w_);
        }
        o0(ebVar.f208375a);
        this.D.add(ebVar);
        N0();
    }

    public abstract void i0();

    public void j(boolean z17, com.tencent.mm.ui.tools.c9 c9Var) {
        com.tencent.mm.ui.eb ebVar = new com.tencent.mm.ui.eb();
        ebVar.f208375a = com.tencent.mm.R.id.jha;
        ebVar.f208382h = this.f208672u.getString(com.tencent.mm.R.string.f490549y8);
        ebVar.f208376b = com.tencent.mm.R.raw.actionbar_icon_dark_search;
        ebVar.f208388n = null;
        ebVar.f208389o = null;
        n0(ebVar.f208375a);
        this.D.add(0, ebVar);
        this.A = z17;
        this.B = c9Var;
        c9Var.f210331p = this;
        N0();
    }

    public boolean j0(android.view.MenuItem menuItem) {
        if (!this.f208650j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "onOptionsItemSelected screen not enable.");
            return true;
        }
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.eb ebVar = this.C;
        if (itemId == ebVar.f208375a && ebVar.f208380f) {
            l(menuItem, ebVar);
            return true;
        }
        java.util.Iterator it = this.D.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.eb ebVar2 = (com.tencent.mm.ui.eb) it.next();
            if (menuItem.getItemId() == ebVar2.f208375a) {
                menuItem.getItemId();
                l(menuItem, ebVar2);
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        com.tencent.mm.ui.eb ebVar = this.C;
        if (ebVar == null || !ebVar.f208380f) {
            return false;
        }
        l(new db5.h4(this.f208672u, 0, 0), ebVar);
        return true;
    }

    public boolean k0(android.view.Menu menu) {
        com.tencent.mm.ui.tools.c9 c9Var;
        if (!this.A || (c9Var = this.B) == null) {
            return true;
        }
        c9Var.m(this.f208670t, menu);
        return true;
    }

    public final void l(android.view.MenuItem menuItem, com.tencent.mm.ui.eb ebVar) {
        if (!this.f208650j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "callMenuCallback screen not enable.");
            return;
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = ebVar.f208388n;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(menuItem);
        }
    }

    public void l0() {
        e(true);
        this.f208649i0.alive();
        com.tencent.mm.autogen.events.BroadcastEvent broadcastEvent = new com.tencent.mm.autogen.events.BroadcastEvent();
        am.c1 c1Var = broadcastEvent.f54012g;
        c1Var.f6298a = 2;
        c1Var.f6300c = this.f208643f0;
        broadcastEvent.e();
        if (broadcastEvent.f54013h.f6423d == 2) {
            java.lang.System.currentTimeMillis();
            am.d1 d1Var = broadcastEvent.f54013h;
            java.lang.String str = d1Var.f6425f;
            int i17 = d1Var.f6426g;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position[%d], noticeId[%s]", java.lang.Integer.valueOf(i17), str);
            if (i17 <= 0 || i17 == this.f208643f0) {
                am.d1 d1Var2 = broadcastEvent.f54013h;
                R(d1Var2.f6424e, d1Var2.f6420a, d1Var2.f6421b, d1Var2.f6422c, str, i17, true);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position not match[%d, %d] ignore display", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f208643f0));
            }
            java.lang.System.currentTimeMillis();
        }
        if (hq.e.f282964a) {
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_fontScaleTip", 0).getBoolean("font_scale_tip", true)) {
                return;
            }
            if (1.0f != i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_fontScaleTip", 0).edit().putBoolean("font_scale_tip", true).apply();
                return;
            }
            if (1.0f != com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration().fontScale) {
                jx3.f.INSTANCE.d(15181, 1);
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                u1Var.u(x().getResources().getString(com.tencent.mm.R.string.fed));
                u1Var.g(x().getResources().getString(com.tencent.mm.R.string.fea));
                u1Var.n(x().getResources().getString(com.tencent.mm.R.string.fec));
                u1Var.j(x().getResources().getString(com.tencent.mm.R.string.feb));
                u1Var.b(new com.tencent.mm.ui.db(this));
                u1Var.q(false);
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_fontScaleTip", 0).edit().putBoolean("font_scale_tip", true).apply();
            }
        }
    }

    public abstract void m(android.view.View view);

    public android.view.View m0() {
        return null;
    }

    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "Edge2Edge disable ActionBar frosted");
        this.T = false;
        android.widget.FrameLayout frameLayout = this.f208644g;
        if (frameLayout instanceof com.tencent.mm.ui.FrostedContentView) {
            final com.tencent.mm.ui.FrostedContentView frostedContentView = (com.tencent.mm.ui.FrostedContentView) frameLayout;
            frostedContentView.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.ga$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.FrostedContentView frostedContentView2 = com.tencent.mm.ui.FrostedContentView.this;
                    frostedContentView2.setFrostedEnabled(false);
                    frostedContentView2.postInvalidate();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "Edge2Edge after post, frosted disable");
                }
            });
        }
    }

    public boolean n0(int i17) {
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.D;
            if (i18 >= linkedList.size()) {
                return false;
            }
            if (((com.tencent.mm.ui.eb) linkedList.get(i18)).f208375a == i17) {
                linkedList.remove(i18);
                N0();
                return true;
            }
            i18++;
        }
    }

    public void o(final int i17, final int i18, final int i19) {
        android.widget.FrameLayout frameLayout = this.f208644g;
        if (frameLayout == null || !(frameLayout instanceof com.tencent.mm.ui.FrostedContentView)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "Edge2Edge Frosted content view not initialized");
            this.T = false;
            return;
        }
        int i27 = android.os.Build.VERSION.SDK_INT;
        if (i27 < 31) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "Edge2Edge Frosted content view not supported on this Android version %d", java.lang.Integer.valueOf(i27));
            this.T = false;
            return;
        }
        O();
        if (this.actionbarView == null || this.X == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "Edge2Edge cannot set ActionBar frosted, actionbarView or actionbarParams is null");
            n();
        } else {
            this.T = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "Edge2Edge enable ActionBar frosted, blurRadius=%d, blurColorResId=%d, blurAlpha=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            this.actionbarView.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.ga$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.ga.c(com.tencent.mm.ui.ga.this, i17, i18, i19);
                }
            });
        }
    }

    public final boolean o0(int i17) {
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.D;
            if (i18 >= linkedList.size()) {
                return false;
            }
            if (((com.tencent.mm.ui.eb) linkedList.get(i18)).f208375a == i17) {
                linkedList.remove(i18);
                return true;
            }
            i18++;
        }
    }

    public final void p(boolean z17, int i17, boolean z18) {
        java.util.LinkedList linkedList = this.D;
        if (z17) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.eb ebVar = (com.tencent.mm.ui.eb) it.next();
                if (ebVar.f208380f != z18) {
                    ebVar.f208380f = z18;
                }
            }
        } else {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.ui.eb ebVar2 = (com.tencent.mm.ui.eb) it6.next();
                if (ebVar2.f208375a == i17 && ebVar2.f208380f != z18) {
                    ebVar2.f208380f = z18;
                }
            }
        }
        com.tencent.mm.ui.tools.c9 c9Var = this.B;
        if (c9Var == null ? false : c9Var.f210318c) {
            return;
        }
        N0();
    }

    public void p0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "setActionbarColor: 0x%08X", java.lang.Integer.valueOf(i17));
        if (this.G == null) {
            return;
        }
        this.O = i17;
        this.P = true;
        S0();
        this.G.w(new android.graphics.drawable.ColorDrawable(this.O));
        W0(this.f208670t, this.O);
        O0(this.R);
        P0();
        if (this.O == this.f208672u.getResources().getColor(com.tencent.mm.R.color.aaw)) {
            int i18 = this.O;
            this.f208669s0 = i18;
            E0(i18);
        } else if (this.f208669s0 == 0) {
            E0(this.f208672u.getResources().getColor(com.tencent.mm.R.color.f478489a));
        }
    }

    public void q0(int i17) {
        this.Q = i17;
        this.f208641e0 = true;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.K;
        if (weImageView != null) {
            weImageView.setIconColor(i17);
        }
        android.widget.TextView textView = this.H;
        if (textView != null && textView.getVisibility() == 0) {
            this.H.setTextColor(i17);
        }
        android.widget.TextView textView2 = this.N;
        if (textView2 != null && textView2.getVisibility() == 0) {
            this.N.setTextColor(i17);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.U;
        if (weImageView2 != null && weImageView2.getVisibility() == 0) {
            this.U.setIconColor(i17);
            return;
        }
        android.widget.TextView textView3 = this.V;
        if (textView3 == null || textView3.getVisibility() != 0) {
            return;
        }
        this.V.setTextColor(i17);
    }

    public android.view.View r(int i17) {
        android.view.View findViewById = this.f208638d.findViewById(i17);
        return findViewById != null ? findViewById : this.f208670t.findViewById(i17);
    }

    public void r0(int i17, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (d0()) {
            return;
        }
        if (!z17) {
            int i18 = this.Y;
            if (i17 > i18) {
                i17 = i18;
            }
            int i19 = this.Z;
            if (i17 < i19) {
                i17 = i19;
            }
        }
        this.f208671t0 = i17;
        O();
        android.view.View view = this.actionbarView;
        if (view == null || (layoutParams = this.X) == null) {
            return;
        }
        layoutParams.height = view.getPaddingTop() + i17 + this.actionbarView.getPaddingBottom();
        this.actionbarView.setLayoutParams(this.X);
        android.view.View findViewById = this.actionbarView.findViewById(com.tencent.mm.R.id.f482432ef);
        if (findViewById == null || !(findViewById instanceof androidx.appcompat.widget.Toolbar)) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = i17;
        }
        findViewById.setLayoutParams(layoutParams2);
    }

    public abstract boolean s();

    public void s0(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i17) {
        androidx.appcompat.app.b bVar = this.G;
        if (bVar == null) {
            return;
        }
        if (onMenuItemClickListener == null) {
            bVar.B(false);
        } else {
            bVar.B(false);
            android.view.View view = this.f208631J;
            if (view != null) {
                view.setOnClickListener(new com.tencent.mm.ui.sa(this, onMenuItemClickListener));
            }
        }
        if (i17 == 0 && this.K.getDrawable() == null) {
            i17 = com.tencent.mm.R.raw.actionbar_icon_dark_back;
        }
        if (this.K != null && i17 != 0) {
            this.f208631J.setTag(com.tencent.mm.R.id.nwr, java.lang.Integer.valueOf(i17));
            this.K.setImageResource(i17);
        }
        com.tencent.mm.ui.eb ebVar = this.C;
        ebVar.f208375a = android.R.id.home;
        ebVar.f208388n = onMenuItemClickListener;
    }

    public void t(boolean z17) {
        java.lang.Runnable runnable = this.f208663p0;
        java.lang.Runnable runnable2 = this.f208661o0;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f208677y;
        if (!z17) {
            this.f208670t.getWindow().clearFlags(1024);
            n3Var.removeCallbacks(runnable2);
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, 256L);
            return;
        }
        androidx.appcompat.app.b bVar = this.G;
        if (bVar != null) {
            bVar.o();
        }
        n3Var.removeCallbacks(runnable);
        n3Var.removeCallbacks(runnable2);
        n3Var.postDelayed(runnable2, 256L);
    }

    public void t0(boolean z17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.K;
        if (weImageView == null || this.f208631J == null) {
            return;
        }
        if (!z17) {
            weImageView.setVisibility(8);
            android.view.View view = this.f208631J;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController", "setBackBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/MMActivityController", "setBackBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        weImageView.setVisibility(0);
        android.view.View view2 = this.f208631J;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/MMActivityController", "setBackBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/MMActivityController", "setBackBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public int u() {
        if (!this.P) {
            int color = this.f208672u.getResources().getColor(com.tencent.mm.R.color.a07);
            this.O = color;
            this.R = com.tencent.mm.ui.uk.g(color);
        }
        return this.O;
    }

    public void u0(int i17) {
        android.view.View view = this.f208638d;
        if (view == null) {
            return;
        }
        if (this.f208644g == null) {
            this.f208644g = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.jlt);
        }
        this.f208644g.setBackgroundResource(i17);
        this.f208634b.setBackgroundResource(i17);
    }

    public abstract java.lang.String v();

    public void v0(int i17) {
        if (this.f208644g == null) {
            this.f208644g = (android.widget.FrameLayout) this.f208638d.findViewById(com.tencent.mm.R.id.jlt);
        }
        android.view.View view = this.f208640e;
        if (view != null) {
            this.f208644g.removeView(view);
        }
        this.f208644g.removeView(this.f208634b);
        android.view.View inflate = ((android.view.LayoutInflater) this.f208672u.getSystemService("layout_inflater")).inflate(i17, (android.view.ViewGroup) null);
        this.f208634b = inflate;
        this.f208644g.addView(inflate, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (this.f208640e != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, com.tencent.mm.sdk.platformtools.j.d(this.f208672u, 47.0f));
            android.widget.FrameLayout frameLayout = this.f208644g;
            frameLayout.addView(this.f208640e, frameLayout.getChildCount(), layoutParams);
        }
        this.f208644g.invalidate();
    }

    public android.view.View w() {
        return this.f208638d;
    }

    public final void w0(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17, android.graphics.PorterDuff.Mode mode) {
        if (this.f208641e0) {
            weImageView.setIconColor(i17);
        } else {
            weImageView.setClearColorFilter(true);
            weImageView.clearColorFilter();
        }
    }

    public androidx.appcompat.app.AppCompatActivity x() {
        return this.f208670t;
    }

    public void x0(java.lang.String str, java.lang.Runnable runnable) {
        android.widget.TextView textView;
        if (this.G == null || (textView = this.L) == null) {
            return;
        }
        textView.setVisibility(0);
        this.L.setText(str);
        this.L.setOnClickListener(new com.tencent.mm.ui.qa(this, runnable));
    }

    public abstract int y();

    public void y0(java.lang.String str, android.view.animation.Animation animation) {
        androidx.appcompat.app.b bVar = this.G;
        if (bVar == null) {
            return;
        }
        bVar.x(com.tencent.mm.R.layout.f487922bo);
        android.widget.TextView textView = (android.widget.TextView) this.G.j().findViewById(com.tencent.mm.R.id.f482439em);
        if (textView == null) {
            return;
        }
        textView.clearAnimation();
        if (animation != null) {
            textView.startAnimation(animation);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        textView.setText(str);
    }

    public final al5.w z(int i17, int i18) {
        android.graphics.drawable.Drawable drawable = this.f208672u.getResources().getDrawable(i18);
        if (this.R) {
            drawable = com.tencent.mm.ui.uk.e(x(), i18, -1);
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        al5.w wVar = new al5.w(drawable, 1);
        int intrinsicHeight = (drawable.getIntrinsicHeight() - i17) / 2;
        return wVar;
    }

    public void z0(int i17) {
        if (this.G == null) {
            return;
        }
        this.N.setText(this.f208672u.getString(i17));
        if (i65.a.D(x())) {
            this.N.setTextSize(1, 14.0f);
            this.H.setTextSize(1, 18.0f);
        }
        this.N.setVisibility(0);
        R0(this.f208672u.getString(i17));
    }
}
