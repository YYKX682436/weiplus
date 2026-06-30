package io.clipworks.displaysys;

/* loaded from: classes5.dex */
public class DSProxySurfaceHolder extends io.clipworks.displaysys.DSViewProxy implements android.view.SurfaceHolder.Callback {
    private final android.view.SurfaceHolder holder;

    public DSProxySurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        this.holder = surfaceHolder;
        surfaceHolder.addCallback(this);
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public int getHeight() {
        android.view.SurfaceHolder surfaceHolder = this.holder;
        if (surfaceHolder != null) {
            return surfaceHolder.getSurfaceFrame().height();
        }
        return 0;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public float getScaleFactor() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    public android.view.SurfaceHolder getSurfaceHolder() {
        return this.holder;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public int getVisibility() {
        return 0;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public int getWidth() {
        android.view.SurfaceHolder surfaceHolder = this.holder;
        if (surfaceHolder != null) {
            return surfaceHolder.getSurfaceFrame().width();
        }
        return 0;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public float getX() {
        if (this.holder != null) {
            return r0.getSurfaceFrame().left;
        }
        return 0.0f;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public float getY() {
        if (this.holder != null) {
            return r0.getSurfaceFrame().top;
        }
        return 0.0f;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        notifySurfaceChanged(i17, i18, i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        notifySurfaceCreated(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        notifySurfaceDidDestroy();
    }
}
