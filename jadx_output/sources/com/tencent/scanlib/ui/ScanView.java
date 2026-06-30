package com.tencent.scanlib.ui;

/* loaded from: classes14.dex */
public abstract class ScanView extends android.widget.FrameLayout implements android.hardware.Camera.PreviewCallback, android.hardware.Camera.AutoFocusCallback, android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.TextureView f215301d;

    /* renamed from: e, reason: collision with root package name */
    public qt5.i0 f215302e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.SurfaceTexture f215303f;

    /* renamed from: g, reason: collision with root package name */
    public int f215304g;

    /* renamed from: h, reason: collision with root package name */
    public long f215305h;

    /* renamed from: i, reason: collision with root package name */
    public long f215306i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f215307m;

    /* renamed from: n, reason: collision with root package name */
    public final tt5.h f215308n;

    /* renamed from: o, reason: collision with root package name */
    public final tt5.g f215309o;

    public ScanView(android.content.Context context) {
        super(context);
        this.f215307m = false;
        this.f215308n = new tt5.h(this, android.os.Looper.myLooper());
        this.f215309o = new tt5.g(this, android.os.Looper.myLooper());
    }

    public void a() {
        com.tencent.stubs.logger.Log.i("ScanView", "try close camera");
        if (((qt5.c) this.f215302e).f366657b) {
            qt5.f0 a17 = qt5.f0.a();
            qt5.q qVar = new qt5.q(this.f215302e);
            a17.getClass();
            a17.f366686a.submit(new qt5.c0(a17, qVar));
        }
    }

    public void b() {
        this.f215302e = new qt5.c();
    }

    public void c(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f215306i;
        long j18 = 1000;
        tt5.g gVar = this.f215309o;
        if (currentTimeMillis > j18) {
            gVar.removeMessages(0);
            gVar.sendEmptyMessageDelayed(0, j17);
        } else {
            gVar.removeMessages(0);
            gVar.sendEmptyMessageDelayed(0, j17 + (j18 - currentTimeMillis));
        }
    }

    public void d() {
        android.view.TextureView textureView = new android.view.TextureView(getContext());
        this.f215301d = textureView;
        textureView.setSurfaceTextureListener(this);
        addView(this.f215301d, new android.widget.FrameLayout.LayoutParams(-1, -1));
        b();
        this.f215304g = getResources().getConfiguration().orientation;
        g(null);
    }

    public void e() {
        com.tencent.stubs.logger.Log.i("ScanView", "onPause");
    }

    public void f() {
        com.tencent.stubs.logger.Log.i("ScanView", "onResume");
    }

    public void g(qt5.f fVar) {
        com.tencent.stubs.logger.Log.i("ScanView", "try open camera");
        if (((qt5.c) this.f215302e).f366657b) {
            com.tencent.stubs.logger.Log.i("ScanView", "camera is already open!");
            if (fVar != null) {
                fVar.a();
                return;
            }
            return;
        }
        com.tencent.stubs.logger.Log.i("ScanView", "camera is not open");
        int rotation = ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation();
        qt5.f0 a17 = qt5.f0.a();
        qt5.s sVar = new qt5.s(this.f215302e, rotation);
        a17.getClass();
        if (fVar != null) {
            fVar.e();
        }
        a17.f366686a.submit(new qt5.y(a17, fVar, sVar));
    }

    public void h(qt5.i iVar) {
        int rotation = ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation();
        com.tencent.stubs.logger.Log.i("ScanView", "try reopen camera " + rotation);
        qt5.f0 a17 = qt5.f0.a();
        qt5.u uVar = new qt5.u(this.f215302e, rotation);
        a17.getClass();
        if (iVar != null) {
            iVar.e();
        }
        a17.f366686a.submit(new qt5.e0(a17, iVar, uVar));
    }

    public void i(qt5.l lVar) {
        com.tencent.stubs.logger.Log.i("ScanView", "try start preview");
        if (!((qt5.c) this.f215302e).f366657b || ((qt5.c) this.f215302e).f366658c || this.f215303f == null) {
            return;
        }
        qt5.f0 a17 = qt5.f0.a();
        qt5.v vVar = new qt5.v(this.f215302e, this.f215303f);
        tt5.a aVar = new tt5.a(this, lVar);
        a17.getClass();
        aVar.e();
        a17.f366686a.submit(new qt5.a0(a17, aVar, vVar));
    }

    public void j() {
        com.tencent.stubs.logger.Log.i("ScanView", "try stop preview");
        if (((qt5.c) this.f215302e).f366657b) {
            qt5.f0 a17 = qt5.f0.a();
            qt5.w wVar = new qt5.w(this.f215302e);
            a17.getClass();
            a17.f366686a.submit(new qt5.b0(a17, wVar));
        }
    }

    public void k(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f215305h;
        long j18 = 80;
        tt5.h hVar = this.f215308n;
        if (currentTimeMillis > j18) {
            hVar.removeMessages(0);
            hVar.sendEmptyMessageDelayed(0, j17);
        } else {
            hVar.removeMessages(0);
            hVar.sendEmptyMessageDelayed(0, j17 + (j18 - currentTimeMillis));
        }
    }

    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.tencent.stubs.logger.Log.i("ScanView", "onAutoFocus %s", java.lang.Boolean.valueOf(z17));
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.stubs.logger.Log.i("ScanView", "onConfigurationChanged %d,%d", java.lang.Integer.valueOf(configuration.orientation), java.lang.Integer.valueOf(this.f215304g));
        int i17 = configuration.orientation;
        if (i17 == this.f215304g || this.f215302e == null) {
            return;
        }
        this.f215304g = i17;
        h(new tt5.f(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        a();
    }

    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        this.f215305h = 0L;
    }

    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.stubs.logger.Log.i("ScanView", "surface available, %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f215303f = surfaceTexture;
        if (!((qt5.c) this.f215302e).f366657b) {
            g(new tt5.d(this, i17, i18));
            return;
        }
        ((qt5.c) this.f215302e).l(new android.graphics.Point(i17, i18));
        i(new tt5.b(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.stubs.logger.Log.i("ScanView", "surface destroyed");
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.stubs.logger.Log.i("ScanView", "surface size changed, %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public ScanView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f215307m = false;
        this.f215308n = new tt5.h(this, android.os.Looper.myLooper());
        this.f215309o = new tt5.g(this, android.os.Looper.myLooper());
    }

    public ScanView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f215307m = false;
        this.f215308n = new tt5.h(this, android.os.Looper.myLooper());
        this.f215309o = new tt5.g(this, android.os.Looper.myLooper());
    }
}
