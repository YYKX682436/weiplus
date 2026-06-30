package io.clipworks.displaysys;

/* loaded from: classes5.dex */
public abstract class DSViewProxy {
    private final com.facebook.jni.HybridData mHybridData = initHybrid();

    private native com.facebook.jni.HybridData initHybrid();

    private native void nativeOnDidAttachToWindow();

    private native void nativeOnDidDetachFromWindow();

    private native void nativeOnSizeDidChange(int i17, int i18, int i19, int i27);

    private native void nativeOnSurfaceDidChange(int i17, int i18, int i19);

    private native void nativeOnSurfaceDidCreate(android.view.Surface surface);

    private native void nativeOnSurfaceDidDestroy();

    private native void nativeOnTouchesBegin(int i17, float f17, float f18, long j17);

    private native void nativeOnTouchesCancel(int[] iArr, float[] fArr, float[] fArr2, long j17);

    private native void nativeOnTouchesEnd(int i17, float f17, float f18, long j17);

    private native void nativeOnTouchesMove(int[] iArr, float[] fArr, float[] fArr2, long j17);

    private native void nativeOnVisibilityDidChange(boolean z17);

    public abstract int getHeight();

    public abstract float getScaleFactor();

    public abstract int getVisibility();

    public abstract int getWidth();

    public abstract float getX();

    public abstract float getY();

    public void notifyOnDidAttachToWindow() {
        nativeOnDidAttachToWindow();
    }

    public void notifyOnDidDetachFromWindow() {
        nativeOnDidDetachFromWindow();
    }

    public void notifyOnSizeDidChange(int i17, int i18, int i19, int i27) {
        nativeOnSizeDidChange(i17, i18, i19, i27);
    }

    public boolean notifyOnTouchEvent(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        long eventTime = motionEvent.getEventTime();
        int[] iArr = new int[pointerCount];
        float[] fArr = new float[pointerCount];
        float[] fArr2 = new float[pointerCount];
        for (int i17 = 0; i17 < pointerCount; i17++) {
            iArr[i17] = motionEvent.getPointerId(i17);
            fArr[i17] = motionEvent.getX(i17);
            fArr2[i17] = motionEvent.getY(i17);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            nativeOnTouchesBegin(motionEvent.getPointerId(0), fArr[0], fArr2[0], eventTime);
        } else if (action == 1) {
            nativeOnTouchesEnd(motionEvent.getPointerId(0), fArr[0], fArr2[0], eventTime);
        } else if (action == 2) {
            nativeOnTouchesMove(iArr, fArr, fArr2, eventTime);
        } else if (action == 3) {
            nativeOnTouchesCancel(iArr, fArr, fArr2, eventTime);
        } else if (action == 5) {
            int action2 = motionEvent.getAction() >> 8;
            nativeOnTouchesBegin(motionEvent.getPointerId(action2), motionEvent.getX(action2), motionEvent.getY(action2), eventTime);
        } else if (action == 6) {
            int action3 = motionEvent.getAction() >> 8;
            nativeOnTouchesEnd(motionEvent.getPointerId(action3), motionEvent.getX(action3), motionEvent.getY(action3), eventTime);
        }
        return true;
    }

    public void notifyOnVisibilityDidChange(boolean z17) {
        nativeOnVisibilityDidChange(z17);
    }

    public void notifySurfaceChanged(int i17, int i18, int i19) {
        nativeOnSurfaceDidChange(i17, i18, i19);
    }

    public void notifySurfaceCreated(android.view.Surface surface) {
        nativeOnSurfaceDidCreate(surface);
    }

    public void notifySurfaceDidDestroy() {
        nativeOnSurfaceDidDestroy();
    }
}
