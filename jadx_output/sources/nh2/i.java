package nh2;

/* loaded from: classes10.dex */
public final class i implements nh2.c, android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.SurfaceHolder f337111d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.SurfaceView f337112e;

    /* renamed from: f, reason: collision with root package name */
    public nh2.b f337113f;

    public i(android.view.SurfaceView surfaceView) {
        kotlin.jvm.internal.o.g(surfaceView, "surfaceView");
        this.f337112e = surfaceView;
        android.view.SurfaceHolder holder = surfaceView.getHolder();
        this.f337111d = holder;
        if (holder != null) {
            holder.addCallback(this);
        }
        if (holder != null) {
            holder.setFormat(-2);
        }
    }

    @Override // nh2.c
    public void a(nh2.b bVar) {
        this.f337113f = bVar;
    }

    @Override // nh2.c
    public android.graphics.Canvas lockCanvas() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.view.SurfaceHolder surfaceHolder = this.f337111d;
        if (i17 >= 26) {
            if (surfaceHolder != null) {
                return surfaceHolder.lockHardwareCanvas();
            }
            return null;
        }
        if (surfaceHolder != null) {
            return surfaceHolder.lockCanvas();
        }
        return null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
        nh2.b bVar = this.f337113f;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        nh2.b bVar = this.f337113f;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        nh2.b bVar = this.f337113f;
        if (bVar != null) {
            bVar.d();
        }
    }

    @Override // nh2.c
    public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
        android.view.SurfaceHolder surfaceHolder = this.f337111d;
        if (surfaceHolder != null) {
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }
}
