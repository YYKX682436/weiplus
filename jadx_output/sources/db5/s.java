package db5;

/* loaded from: classes10.dex */
public abstract class s {
    public static float a(android.view.MotionEvent motionEvent) {
        float b17 = b(motionEvent, 0) - b(motionEvent, 1);
        float c17 = c(motionEvent, 0) - c(motionEvent, 1);
        return (float) java.lang.Math.sqrt((b17 * b17) + (c17 * c17));
    }

    public static float b(android.view.MotionEvent motionEvent, int i17) {
        return motionEvent.getPointerCount() >= 2 ? motionEvent.getX(i17) : motionEvent.getX();
    }

    public static float c(android.view.MotionEvent motionEvent, int i17) {
        return motionEvent.getPointerCount() >= 2 ? motionEvent.getY(i17) : motionEvent.getY();
    }

    public static void d(android.graphics.PointF pointF, android.view.MotionEvent motionEvent) {
        if (pointF == null || motionEvent == null) {
            return;
        }
        pointF.set((b(motionEvent, 0) + b(motionEvent, 1)) / 2.0f, (c(motionEvent, 0) + c(motionEvent, 1)) / 2.0f);
    }
}
