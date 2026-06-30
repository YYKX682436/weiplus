package com.tencent.mm.plugin.voip.video;

/* loaded from: classes13.dex */
public class GLTextureView extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, android.view.View.OnLayoutChangeListener {

    /* renamed from: r, reason: collision with root package name */
    public static final wq4.n f177029r = new wq4.n(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f177030d;

    /* renamed from: e, reason: collision with root package name */
    public wq4.m f177031e;

    /* renamed from: f, reason: collision with root package name */
    public wq4.q f177032f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f177033g;

    /* renamed from: h, reason: collision with root package name */
    public wq4.i f177034h;

    /* renamed from: i, reason: collision with root package name */
    public wq4.j f177035i;

    /* renamed from: m, reason: collision with root package name */
    public wq4.k f177036m;

    /* renamed from: n, reason: collision with root package name */
    public int f177037n;

    /* renamed from: o, reason: collision with root package name */
    public int f177038o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f177039p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f177040q;

    public GLTextureView(android.content.Context context) {
        super(context);
        this.f177030d = new java.lang.ref.WeakReference(this);
        this.f177040q = new java.util.ArrayList();
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.f177031e != null) {
            throw new java.lang.IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void b(java.lang.Runnable runnable) {
        wq4.m mVar = this.f177031e;
        mVar.getClass();
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException("r must not be null");
        }
        wq4.n nVar = f177029r;
        synchronized (nVar) {
            mVar.f448677t.add(runnable);
            nVar.notifyAll();
        }
    }

    public void c(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19) {
        wq4.m mVar = this.f177031e;
        mVar.getClass();
        wq4.n nVar = f177029r;
        synchronized (nVar) {
            mVar.f448672o = i18;
            mVar.f448673p = i19;
            mVar.f448678u = true;
            mVar.f448675r = true;
            mVar.f448676s = false;
            nVar.notifyAll();
            while (!mVar.f448665e && !mVar.f448676s) {
                if (!(mVar.f448669i && mVar.f448670m && mVar.b())) {
                    break;
                }
                mVar.getId();
                try {
                    f177029r.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void d(android.graphics.SurfaceTexture surfaceTexture) {
        wq4.m mVar = this.f177031e;
        mVar.getClass();
        wq4.n nVar = f177029r;
        synchronized (nVar) {
            mVar.getId();
            mVar.f448666f = true;
            nVar.notifyAll();
            while (mVar.f448668h && !mVar.f448665e) {
                try {
                    f177029r.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void e(android.graphics.SurfaceTexture surfaceTexture) {
        wq4.m mVar = this.f177031e;
        mVar.getClass();
        wq4.n nVar = f177029r;
        synchronized (nVar) {
            mVar.getId();
            mVar.f448666f = false;
            nVar.notifyAll();
            while (!mVar.f448668h && !mVar.f448665e) {
                try {
                    f177029r.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void finalize() {
        try {
            wq4.m mVar = this.f177031e;
            if (mVar != null) {
                mVar.c();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f177037n;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f177039p;
    }

    public int getRenderMode() {
        int i17;
        wq4.m mVar = this.f177031e;
        mVar.getClass();
        synchronized (f177029r) {
            i17 = mVar.f448674q;
        }
        return i17;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        int i17;
        super.onAttachedToWindow();
        if (this.f177033g && this.f177032f != null) {
            wq4.m mVar = this.f177031e;
            if (mVar != null) {
                synchronized (f177029r) {
                    i17 = mVar.f448674q;
                }
            } else {
                i17 = 1;
            }
            wq4.m mVar2 = new wq4.m(this.f177030d);
            this.f177031e = mVar2;
            if (i17 != 1) {
                if (i17 < 0 || i17 > 1) {
                    throw new java.lang.IllegalArgumentException("renderMode");
                }
                wq4.n nVar = f177029r;
                synchronized (nVar) {
                    mVar2.f448674q = i17;
                    nVar.notifyAll();
                }
            }
            this.f177031e.start();
        }
        this.f177033g = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        e(getSurfaceTexture());
        wq4.m mVar = this.f177031e;
        if (mVar != null) {
            mVar.c();
        }
        this.f177033g = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        c(getSurfaceTexture(), 0, i19 - i17, i27 - i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        d(surfaceTexture);
        c(surfaceTexture, 0, i17, i18);
        java.util.Iterator it = ((java.util.ArrayList) this.f177040q).iterator();
        while (it.hasNext()) {
            ((android.view.TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        java.util.Iterator it = this.f177040q.iterator();
        while (it.hasNext()) {
            ((android.view.TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        c(surfaceTexture, 0, i17, i18);
        java.util.Iterator it = ((java.util.ArrayList) this.f177040q).iterator();
        while (it.hasNext()) {
            ((android.view.TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        java.util.Iterator it = this.f177040q.iterator();
        while (it.hasNext()) {
            ((android.view.TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void setDebugFlags(int i17) {
        this.f177037n = i17;
    }

    public void setEGLConfigChooser(wq4.i iVar) {
        a();
        this.f177034h = iVar;
    }

    public void setEGLContextClientVersion(int i17) {
        a();
        this.f177038o = i17;
    }

    public void setEGLContextFactory(wq4.j jVar) {
        a();
        this.f177035i = jVar;
    }

    public void setEGLWindowSurfaceFactory(wq4.k kVar) {
        a();
        this.f177036m = kVar;
    }

    public void setGLWrapper(wq4.o oVar) {
    }

    public void setPreserveEGLContextOnPause(boolean z17) {
        this.f177039p = z17;
    }

    public void setRenderMode(int i17) {
        wq4.m mVar = this.f177031e;
        mVar.getClass();
        if (i17 < 0 || i17 > 1) {
            throw new java.lang.IllegalArgumentException("renderMode");
        }
        wq4.n nVar = f177029r;
        synchronized (nVar) {
            mVar.f448674q = i17;
            nVar.notifyAll();
        }
    }

    public void setRenderer(wq4.q qVar) {
        a();
        if (this.f177034h == null) {
            this.f177034h = new wq4.r(this, true);
        }
        if (this.f177035i == null) {
            this.f177035i = new wq4.g(this, null);
        }
        if (this.f177036m == null) {
            this.f177036m = new wq4.h(null);
        }
        this.f177032f = qVar;
        wq4.m mVar = new wq4.m(this.f177030d);
        this.f177031e = mVar;
        mVar.start();
    }

    public void setEGLConfigChooser(boolean z17) {
        setEGLConfigChooser(new wq4.r(this, z17));
    }

    public GLTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177030d = new java.lang.ref.WeakReference(this);
        this.f177040q = new java.util.ArrayList();
        setSurfaceTextureListener(this);
    }
}
