package io.flutter.embedding.engine.renderer;

/* loaded from: classes14.dex */
public class SurfaceTextureWrapper {
    private boolean attached;
    private boolean newFrameAvailable;
    private java.lang.Runnable onFrameConsumed;
    private boolean released;
    private android.graphics.SurfaceTexture surfaceTexture;

    public SurfaceTextureWrapper(android.graphics.SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }

    public void attachToGLContext(int i17) {
        synchronized (this) {
            if (this.released) {
                return;
            }
            if (this.attached) {
                this.surfaceTexture.detachFromGLContext();
            }
            io.flutter.Log.i("SurfaceTextureWrapper", "attachToGLContext " + this.surfaceTexture);
            try {
                this.surfaceTexture.attachToGLContext(i17);
            } catch (java.lang.Exception e17) {
                io.flutter.Log.w("SurfaceTextureWrapper", "attachToGLContext with exception: " + e17);
            }
            this.attached = true;
        }
    }

    public void detachFromGLContext() {
        synchronized (this) {
            io.flutter.Log.i("SurfaceTextureWrapper", "detachFromGLContext " + this.surfaceTexture);
            if (this.attached && !this.released) {
                try {
                    this.surfaceTexture.detachFromGLContext();
                } catch (java.lang.Exception e17) {
                    io.flutter.Log.w("SurfaceTextureWrapper", "detachFromGLContext with exception " + e17);
                }
                this.attached = false;
            }
        }
    }

    public void getTransformMatrix(float[] fArr) {
        this.surfaceTexture.getTransformMatrix(fArr);
    }

    public void markDirty() {
        synchronized (this) {
            this.newFrameAvailable = true;
        }
    }

    public void release() {
        synchronized (this) {
            if (!this.released) {
                io.flutter.Log.i("SurfaceTextureWrapper", "release " + this.surfaceTexture);
                this.surfaceTexture.release();
                this.released = true;
                this.attached = false;
            }
        }
    }

    public boolean shouldUpdate() {
        boolean z17;
        synchronized (this) {
            z17 = this.newFrameAvailable;
        }
        return z17;
    }

    public android.graphics.SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }

    public void updateTexImage() {
        synchronized (this) {
            this.newFrameAvailable = false;
            if (!this.released) {
                try {
                    this.surfaceTexture.updateTexImage();
                    java.lang.Runnable runnable = this.onFrameConsumed;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (java.lang.Exception e17) {
                    io.flutter.Log.e("SurfaceTextureWrapper", "updateTexImage with exception" + e17);
                }
            }
        }
    }

    public SurfaceTextureWrapper(android.graphics.SurfaceTexture surfaceTexture, java.lang.Runnable runnable) {
        this.newFrameAvailable = false;
        this.surfaceTexture = surfaceTexture;
        this.released = false;
        this.onFrameConsumed = runnable;
    }
}
