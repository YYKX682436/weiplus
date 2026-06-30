package yp;

/* loaded from: classes10.dex */
public class m implements yp.j, android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.SurfaceView f464387d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.SurfaceHolder f464388e;

    /* renamed from: f, reason: collision with root package name */
    public yp.i f464389f;

    public m(android.view.SurfaceView surfaceView, yp.i iVar, boolean z17) {
        this.f464389f = iVar;
        this.f464387d = surfaceView;
        surfaceView.setWillNotCacheDrawing(true);
        surfaceView.setDrawingCacheEnabled(false);
        surfaceView.setWillNotDraw(true);
        if (z17) {
            surfaceView.setZOrderOnTop(true);
        } else {
            surfaceView.setZOrderMediaOverlay(true);
        }
        android.view.SurfaceHolder holder = surfaceView.getHolder();
        this.f464388e = holder;
        holder.addCallback(this);
        holder.setFormat(-2);
    }

    @Override // yp.j
    public void a(yp.i iVar) {
        this.f464389f = iVar;
    }

    @Override // yp.j
    public float b() {
        return this.f464387d.getY();
    }

    @Override // yp.j
    public android.view.View getView() {
        return this.f464387d;
    }

    @Override // yp.j
    public android.graphics.Canvas lockCanvas() {
        return this.f464388e.lockCanvas();
    }

    @Override // yp.j
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f464387d.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        yp.i iVar = this.f464389f;
        if (iVar != null) {
            iVar.c();
        }
        com.tencent.mars.xlog.Log.i("SurfaceDanmakuView", "surfaceChanged, width = " + i18 + ", height = " + i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        yp.i iVar = this.f464389f;
        if (iVar != null) {
            iVar.b();
        }
        com.tencent.mars.xlog.Log.i("SurfaceDanmakuView", "surfaceCreated, isHardwareAccelerateEnable = false");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        yp.i iVar = this.f464389f;
        if (iVar != null) {
            iVar.a();
        }
        com.tencent.mars.xlog.Log.i("SurfaceDanmakuView", "surfaceDestroyed");
    }

    @Override // yp.j
    public void unlock() {
        java.lang.Object obj;
        android.view.SurfaceView surfaceView = this.f464387d;
        try {
            java.lang.reflect.Field declaredField = android.view.SurfaceView.class.getDeclaredField("mSurfaceLock");
            declaredField.setAccessible(true);
            obj = declaredField.get(surfaceView);
        } catch (java.lang.Exception unused) {
            obj = null;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = (java.util.concurrent.locks.ReentrantLock) obj;
        android.view.Surface surface = surfaceView.getHolder().getSurface();
        try {
            try {
                java.lang.reflect.Method declaredMethod = android.view.Surface.class.getDeclaredMethod("nativeRelease", java.lang.Long.TYPE);
                declaredMethod.setAccessible(true);
                java.lang.reflect.Field declaredField2 = android.view.Surface.class.getDeclaredField("mLockedObject");
                declaredField2.setAccessible(true);
                java.lang.Long l17 = (java.lang.Long) declaredField2.get(surface);
                com.tencent.mars.xlog.Log.i("surface_lock", "SurfaceDanmakuView unlock lockObjectValue = " + l17);
                if (l17.longValue() != 0) {
                    declaredMethod.invoke(null, l17);
                }
                declaredField2.setLong(surface, 0L);
                com.tencent.mars.xlog.Log.i("surface_lock", "SurfaceDanmakuView unlock surfaceLock = " + reentrantLock);
                if (reentrantLock == null || !reentrantLock.isLocked()) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("surface_lock", "SurfaceDanmakuView unlock:release failed" + e17);
                com.tencent.mars.xlog.Log.i("surface_lock", "SurfaceDanmakuView unlock surfaceLock = " + reentrantLock);
                if (reentrantLock == null || !reentrantLock.isLocked()) {
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("surface_lock", "SurfaceDanmakuView unlock");
            reentrantLock.unlock();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("surface_lock", "SurfaceDanmakuView unlock surfaceLock = " + reentrantLock);
            if (reentrantLock != null && reentrantLock.isLocked()) {
                com.tencent.mars.xlog.Log.i("surface_lock", "SurfaceDanmakuView unlock");
                reentrantLock.unlock();
            }
            throw th6;
        }
    }

    @Override // yp.j
    public void unlockCanvasAndPost(android.graphics.Canvas canvas) {
        this.f464388e.unlockCanvasAndPost(canvas);
    }
}
