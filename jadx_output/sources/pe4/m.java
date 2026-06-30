package pe4;

/* loaded from: classes15.dex */
public class m extends pe4.o {

    /* renamed from: j, reason: collision with root package name */
    public boolean f353708j;

    /* renamed from: k, reason: collision with root package name */
    public gu5.c f353709k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f353710l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f353711m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f353712n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.animation.Animation f353713o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.animation.Animation f353714p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Handler f353715q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f353716r;

    public m(java.lang.ref.WeakReference weakReference, re4.c0 c0Var, re4.d0 d0Var, android.os.Handler handler) {
        super(weakReference, c0Var, d0Var, handler);
        this.f353708j = false;
        this.f353709k = null;
        this.f353710l = null;
        this.f353711m = null;
        this.f353712n = null;
        this.f353713o = null;
        this.f353714p = null;
        this.f353715q = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f353716r = new pe4.l(this);
        this.f353720d = handler;
    }

    public static void g(pe4.m mVar, boolean z17) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = mVar.f353710l;
        if (j0Var == null || !j0Var.isShowing()) {
            java.lang.ref.WeakReference weakReference = mVar.f353719c;
            if (weakReference == null || weakReference.get() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterControllerFingerprint", "hy: ui released.");
                re4.d0 d0Var = mVar.f353718b;
                d0Var.f394526a = 90007;
                d0Var.f394527b = "internal error occurred: ui released";
                mVar.b();
            } else {
                re4.c0 c0Var = mVar.f353717a;
                if (!c0Var.f394522d.booleanValue()) {
                    if (mVar.f353710l == null) {
                        android.app.Activity activity = (android.app.Activity) weakReference.get();
                        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                        android.view.View inflate = activity.getLayoutInflater().inflate(com.tencent.mm.R.layout.bag, (android.view.ViewGroup) null, false);
                        mVar.f353711m = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.g5z);
                        mVar.f353712n = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484996g64);
                        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g5y)).setText(c0Var.f394521c);
                        aVar.L = inflate;
                        aVar.A = true;
                        aVar.f211733w = of5.b.a(activity).getString(com.tencent.mm.R.string.jic);
                        aVar.F = new pe4.i(mVar);
                        aVar.G = new pe4.j(mVar);
                        com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(activity, com.tencent.mm.R.style.f494791wd);
                        j0Var2.e(aVar);
                        com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar.f211723m;
                        if (d0Var2 != null) {
                            d0Var2.a(j0Var2.f211837r);
                        }
                        mVar.f353710l = j0Var2;
                        j0Var2.setOnShowListener(new pe4.h(mVar));
                        com.tencent.mm.ui.widget.dialog.j0 j0Var3 = mVar.f353710l;
                        if (j0Var3 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: dialog is null.");
                        } else if (mVar.f353720d != null) {
                            mVar.a();
                            mVar.f353720d.obtainMessage(6, j0Var3).sendToTarget();
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
                        }
                        mVar.f353710l.setCanceledOnTouchOutside(false);
                    }
                    if (!mVar.f353710l.isShowing() && weakReference.get() != null && !((android.app.Activity) weakReference.get()).isFinishing() && !((android.app.Activity) weakReference.get()).isDestroyed()) {
                        mVar.f353710l.show();
                    }
                }
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: req restart after fail, but no need");
            return;
        }
        if (mVar.f353709k == null) {
            mVar.j();
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SoterControllerFingerprint", "mFingerprintCanceller not null, cancel and start auth by delaying 500ms.");
        gu5.c cVar = mVar.f353709k;
        cVar.getClass();
        zt5.h.e("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", java.lang.Boolean.TRUE);
        if (cVar.f275961a.isCanceled()) {
            zt5.h.c("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new java.lang.Object[0]);
        } else {
            ju5.o.a().c(new gu5.a(cVar));
            ju5.o a17 = ju5.o.a();
            a17.f302136b.postDelayed(new gu5.b(cVar), 350L);
        }
        mVar.f353715q.postDelayed(new pe4.c(mVar), 500L);
    }

    public static android.view.animation.Animation h(android.content.Context context, long j17) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterControllerFingerprint", "hy: context is null.");
            return null;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477727o);
        if (j17 > 0) {
            loadAnimation.setDuration(j17);
        }
        loadAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
        return loadAnimation;
    }

    @Override // pe4.o
    public void c(android.os.Bundle bundle) {
        if (!wt5.a.p(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            re4.d0 d0Var = this.f353718b;
            d0Var.f394526a = 90011;
            d0Var.f394527b = "no fingerprint enrolled";
            b();
        }
        try {
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.checkSelfPermission("android.permission.USE_FINGERPRINT") != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(new java.lang.String[]{"android.permission.USE_FINGERPRINT"});
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreate", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                f((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(this, "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreate", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
            } else {
                this.f353708j = true;
            }
        } catch (java.lang.NoSuchMethodError unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: not implements the checkSelfPermission. permission already given");
            this.f353708j = true;
        }
    }

    @Override // pe4.o
    public void d(android.os.Bundle bundle) {
        if (!wt5.a.p(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            re4.d0 d0Var = this.f353718b;
            d0Var.f394526a = 90011;
            d0Var.f394527b = "no fingerprint enrolled, inform fail and return";
            b();
            return;
        }
        try {
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.checkSelfPermission("android.permission.USE_FINGERPRINT") != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(new java.lang.String[]{"android.permission.USE_FINGERPRINT"});
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreateAndAutoStartVerify", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                f((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(this, "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreateAndAutoStartVerify", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
            } else {
                this.f353708j = true;
            }
        } catch (java.lang.NoSuchMethodError unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: not implements the checkSelfPermission. permission already given");
            this.f353708j = true;
        }
        if (this.f353708j) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "mIsRequestingFingerprintAuthen true, start prepareAuthKey");
            i();
        }
    }

    @Override // pe4.o
    public void e(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 0) {
            if (strArr.length >= 1 && iArr.length >= 1 && "android.permission.USE_FINGERPRINT".equals(strArr[0]) && iArr[0] == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: permission granted");
                i();
                this.f353708j = true;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.SoterControllerFingerprint", "hy: permission not granted");
                re4.d0 d0Var = this.f353718b;
                d0Var.f394526a = 90002;
                d0Var.f394527b = "user not grant to use fingerprint";
                b();
            }
        }
    }

    public final boolean i() {
        android.os.Handler handler = this.f353720d;
        if (handler != null) {
            handler.obtainMessage(4).sendToTarget();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: auth key not valid or auth key not valid");
        pe4.b bVar = new pe4.b(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy:mscene:" + this.f353724h);
        cu5.b.e(bVar, false, true, this.f353724h, this.f353722f, this.f353723g);
        return false;
    }

    public final void j() {
        this.f353721e = false;
        this.f353709k = new gu5.c();
        pe4.e eVar = new pe4.e(this);
        pe4.g gVar = new pe4.g(this);
        ju5.c cVar = new ju5.c(null);
        cVar.f302066a = this.f353724h;
        cVar.f302068c = com.tencent.mm.sdk.platformtools.x2.f193071a;
        cVar.f302075j = this.f353709k;
        cVar.f302067b = this.f353717a.f394520b;
        cVar.f302076k = gVar;
        cu5.b.g(eVar, cVar);
    }
}
