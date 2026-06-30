package wq4;

/* loaded from: classes13.dex */
public class m extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public boolean f448664d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f448665e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f448666f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f448667g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f448668h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f448669i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f448670m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f448671n;

    /* renamed from: s, reason: collision with root package name */
    public boolean f448676s;

    /* renamed from: v, reason: collision with root package name */
    public wq4.l f448679v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.ref.WeakReference f448680w;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f448677t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f448678u = true;

    /* renamed from: o, reason: collision with root package name */
    public int f448672o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f448673p = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f448675r = true;

    /* renamed from: q, reason: collision with root package name */
    public int f448674q = 1;

    public m(java.lang.ref.WeakReference weakReference) {
        this.f448680w = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0206  */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wq4.m.a():void");
    }

    public final boolean b() {
        return this.f448666f && !this.f448667g && this.f448672o > 0 && this.f448673p > 0 && (this.f448675r || this.f448674q == 1);
    }

    public void c() {
        wq4.n nVar = com.tencent.mm.plugin.voip.video.GLTextureView.f177029r;
        synchronized (nVar) {
            this.f448664d = true;
            nVar.notifyAll();
            while (!this.f448665e) {
                try {
                    com.tencent.mm.plugin.voip.video.GLTextureView.f177029r.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void d() {
        if (this.f448669i) {
            wq4.l lVar = this.f448679v;
            lVar.getClass();
            java.lang.Thread.currentThread().getId();
            if (lVar.f448662f != null) {
                com.tencent.mm.plugin.voip.video.GLTextureView gLTextureView = (com.tencent.mm.plugin.voip.video.GLTextureView) lVar.f448657a.get();
                if (gLTextureView != null) {
                    gLTextureView.f177035i.destroyContext(lVar.f448658b, lVar.f448659c, lVar.f448662f);
                }
                lVar.f448662f = null;
            }
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = lVar.f448659c;
            if (eGLDisplay != null) {
                lVar.f448658b.eglTerminate(eGLDisplay);
                lVar.f448659c = null;
            }
            this.f448669i = false;
            wq4.n nVar = com.tencent.mm.plugin.voip.video.GLTextureView.f177029r;
            if (nVar.f448684d == this) {
                nVar.f448684d = null;
            }
            nVar.notifyAll();
        }
    }

    public final void e() {
        if (this.f448670m) {
            this.f448670m = false;
            wq4.l lVar = this.f448679v;
            lVar.getClass();
            java.lang.Thread.currentThread().getId();
            lVar.b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("GLThread " + getId());
        getId();
        try {
            a();
        } catch (java.lang.InterruptedException | java.lang.RuntimeException unused) {
        } catch (java.lang.Throwable th6) {
            wq4.n nVar = com.tencent.mm.plugin.voip.video.GLTextureView.f177029r;
            com.tencent.mm.plugin.voip.video.GLTextureView.f177029r.b(this);
            throw th6;
        }
        com.tencent.mm.plugin.voip.video.GLTextureView.f177029r.b(this);
    }
}
