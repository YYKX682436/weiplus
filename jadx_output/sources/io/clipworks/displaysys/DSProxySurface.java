package io.clipworks.displaysys;

/* loaded from: classes5.dex */
public class DSProxySurface extends io.clipworks.displaysys.DSViewProxy {
    private int format;
    private int height;
    private android.view.Surface surface;
    private int width;

    public DSProxySurface(android.view.Surface surface) {
        updateSurface(surface);
    }

    public int getFormat() {
        return this.format;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public int getHeight() {
        return this.height;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public float getScaleFactor() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    public android.view.Surface getSurface() {
        return this.surface;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public int getVisibility() {
        return 0;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public int getWidth() {
        return this.width;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public float getX() {
        return 0.0f;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public float getY() {
        return 0.0f;
    }

    @Override // io.clipworks.displaysys.DSViewProxy
    public void notifySurfaceChanged(int i17, int i18, int i19) {
        this.format = i17;
        this.width = i18;
        this.height = i19;
        super.notifySurfaceChanged(i17, i18, i19);
    }

    public void updateSurface(android.view.Surface surface) {
        this.surface = surface;
        if (surface != null) {
            this.width = io.clipworks.displaysys.SurfaceUtils.c(surface);
            this.height = io.clipworks.displaysys.SurfaceUtils.b(surface);
            this.format = io.clipworks.displaysys.SurfaceUtils.a(surface);
        } else {
            this.width = 0;
            this.height = 0;
            this.format = 0;
        }
    }
}
