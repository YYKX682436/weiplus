package rp0;

/* loaded from: classes7.dex */
public final class e implements qp0.b {

    /* renamed from: a, reason: collision with root package name */
    public final qp0.a f398341a;

    /* renamed from: b, reason: collision with root package name */
    public final long f398342b;

    /* renamed from: c, reason: collision with root package name */
    public final double f398343c;

    /* renamed from: d, reason: collision with root package name */
    public final int f398344d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f398345e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f398346f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f398347g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f398348h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f398349i;

    /* renamed from: j, reason: collision with root package name */
    public int f398350j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f398351k;

    public e(qp0.a delegate, long j17, double d17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        j17 = (i18 & 2) != 0 ? com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT : j17;
        d17 = (i18 & 4) != 0 ? 0.0d : d17;
        i17 = (i18 & 8) != 0 ? 5 : i17;
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f398341a = delegate;
        this.f398342b = j17;
        this.f398343c = d17;
        this.f398344d = i17;
        this.f398345e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f398346f = true;
        this.f398348h = new rp0.c(this);
    }

    public final void b(boolean z17) {
        mc3.f fVar = (mc3.f) this.f398341a;
        java.util.Set set = fVar.f325630i;
        if (z17) {
            java.util.Iterator it = ((java.util.HashSet) set).iterator();
            while (it.hasNext()) {
                ((jc3.l0) it.next()).i1();
            }
        } else {
            java.util.Iterator it6 = ((java.util.HashSet) set).iterator();
            while (it6.hasNext()) {
                ((jc3.l0) it6.next()).onDestroy();
            }
        }
        fVar.destroy();
        this.f398349i = null;
    }

    public final void c(boolean z17, long j17) {
        long e17 = s26.a.e(j17);
        if (0 == e17) {
            com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "try destroy, destroy right now");
            b(z17);
            return;
        }
        if (this.f398349i != null) {
            com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "try destroy, but already post destroy task");
            return;
        }
        com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "try destroy, cacheTime: " + ((java.lang.Object) s26.a.h(j17)) + ", isPreload: " + z17);
        rp0.b bVar = new rp0.b(this, z17);
        this.f398349i = bVar;
        this.f398345e.postDelayed(bVar, e17);
    }

    public void d() {
        jz5.f0 f0Var;
        if (this.f398347g != null) {
            com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "try pause, but waiting for pause now");
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "post delay pause task");
            rp0.a aVar = new rp0.a(this);
            this.f398347g = aVar;
            this.f398345e.postDelayed(aVar, this.f398342b);
        }
    }

    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "try resume, isTemp: " + z17);
        boolean z18 = this.f398346f;
        java.lang.Runnable runnable = this.f398348h;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f398345e;
        if (z18) {
            qp0.a aVar = this.f398341a;
            if (((mc3.f) aVar).f325628g) {
                aVar.getClass();
                com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "try resume, is foreground, resume");
                com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "post resume task");
                java.lang.Runnable runnable2 = this.f398347g;
                if (runnable2 != null) {
                    n3Var.removeCallbacks(runnable2);
                }
                n3Var.post(runnable);
                return;
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "try resume, is not foreground, try pause");
            d();
            return;
        }
        com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "try resume, temp resume");
        com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "post resume task");
        java.lang.Runnable runnable3 = this.f398347g;
        if (runnable3 != null) {
            n3Var.removeCallbacks(runnable3);
        }
        n3Var.post(runnable);
        com.tencent.mars.xlog.Log.i("MagicAutoLifecycleExt", "post delay pause task");
        rp0.a aVar2 = new rp0.a(this);
        this.f398347g = aVar2;
        n3Var.postDelayed(aVar2, this.f398342b);
    }
}
