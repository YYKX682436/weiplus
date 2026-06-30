package io.flutter.util;

/* loaded from: classes13.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> T checkNotNull(T t17) {
        t17.getClass();
        return t17;
    }

    public static void checkState(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void checkState(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
