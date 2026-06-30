package io.clipworks.displaysys;

/* loaded from: classes5.dex */
final class SurfaceUtils {
    public static int a(android.view.Surface surface) {
        return nativeQuerySurfaceFormat(surface);
    }

    public static int b(android.view.Surface surface) {
        return nativeQuerySurfaceHeight(surface);
    }

    public static int c(android.view.Surface surface) {
        return nativeQuerySurfaceWidth(surface);
    }

    private static native int nativeQuerySurfaceFormat(android.view.Surface surface);

    private static native int nativeQuerySurfaceHeight(android.view.Surface surface);

    private static native int nativeQuerySurfaceWidth(android.view.Surface surface);
}
