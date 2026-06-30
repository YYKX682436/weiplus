package io.clipworks.displaysys;

/* loaded from: classes5.dex */
public class DSRenderView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    private io.clipworks.displaysys.DSRenderView.Proxy proxy;

    /* loaded from: classes5.dex */
    public static class Proxy extends io.clipworks.displaysys.DSViewProxy {
        private final java.lang.ref.WeakReference<io.clipworks.displaysys.DSRenderView> dsRenderViewWeakRef;

        public Proxy(java.lang.ref.WeakReference<io.clipworks.displaysys.DSRenderView> weakReference) {
            this.dsRenderViewWeakRef = weakReference;
        }

        @Override // io.clipworks.displaysys.DSViewProxy
        public int getHeight() {
            io.clipworks.displaysys.DSRenderView dSRenderView = this.dsRenderViewWeakRef.get();
            if (dSRenderView != null) {
                return dSRenderView.getHeight();
            }
            return 0;
        }

        @Override // io.clipworks.displaysys.DSViewProxy
        public float getScaleFactor() {
            io.clipworks.displaysys.DSRenderView dSRenderView = this.dsRenderViewWeakRef.get();
            if (dSRenderView != null) {
                return dSRenderView.getResources().getDisplayMetrics().density;
            }
            return 0.0f;
        }

        @Override // io.clipworks.displaysys.DSViewProxy
        public int getVisibility() {
            io.clipworks.displaysys.DSRenderView dSRenderView = this.dsRenderViewWeakRef.get();
            if (dSRenderView != null) {
                return dSRenderView.getVisibility();
            }
            return 8;
        }

        @Override // io.clipworks.displaysys.DSViewProxy
        public int getWidth() {
            io.clipworks.displaysys.DSRenderView dSRenderView = this.dsRenderViewWeakRef.get();
            if (dSRenderView != null) {
                return dSRenderView.getWidth();
            }
            return 0;
        }

        @Override // io.clipworks.displaysys.DSViewProxy
        public float getX() {
            io.clipworks.displaysys.DSRenderView dSRenderView = this.dsRenderViewWeakRef.get();
            if (dSRenderView != null) {
                return dSRenderView.getX();
            }
            return 0.0f;
        }

        @Override // io.clipworks.displaysys.DSViewProxy
        public float getY() {
            io.clipworks.displaysys.DSRenderView dSRenderView = this.dsRenderViewWeakRef.get();
            if (dSRenderView != null) {
                return dSRenderView.getY();
            }
            return 0.0f;
        }
    }

    public DSRenderView(android.content.Context context) {
        this(context, null, 0, 0);
    }

    public io.clipworks.displaysys.DSViewProxy getDSViewProxy() {
        return this.proxy;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.proxy.notifyOnDidAttachToWindow();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.proxy.notifyOnDidDetachFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.proxy.notifyOnSizeDidChange(i17, i18, i19, i27);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return this.proxy.notifyOnTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        this.proxy.notifyOnVisibilityDidChange(z17);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        this.proxy.notifySurfaceChanged(i17, i18, i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.proxy.notifySurfaceCreated(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.proxy.notifySurfaceDidDestroy();
    }

    public void teardown() {
    }

    public DSRenderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DSRenderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public DSRenderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.proxy = new io.clipworks.displaysys.DSRenderView.Proxy(new java.lang.ref.WeakReference(this));
        getHolder().addCallback(this);
    }
}
