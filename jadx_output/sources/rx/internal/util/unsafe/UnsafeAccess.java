package rx.internal.util.unsafe;

/* loaded from: classes16.dex */
public final class UnsafeAccess {
    private static final boolean DISABLED_BY_USER;
    public static final sun.misc.Unsafe UNSAFE;

    static {
        DISABLED_BY_USER = java.lang.System.getProperty("rx.unsafe-disable") != null;
        sun.misc.Unsafe unsafe = null;
        try {
            java.lang.reflect.Field declaredField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (sun.misc.Unsafe) declaredField.get(null);
        } catch (java.lang.Throwable unused) {
        }
        UNSAFE = unsafe;
    }

    private UnsafeAccess() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static long addressOf(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return UNSAFE.objectFieldOffset(cls.getDeclaredField(str));
        } catch (java.lang.NoSuchFieldException e17) {
            java.lang.InternalError internalError = new java.lang.InternalError();
            internalError.initCause(e17);
            throw internalError;
        }
    }

    public static boolean compareAndSwapInt(java.lang.Object obj, long j17, int i17, int i18) {
        return UNSAFE.compareAndSwapInt(obj, j17, i17, i18);
    }

    public static int getAndAddInt(java.lang.Object obj, long j17, int i17) {
        sun.misc.Unsafe unsafe;
        int intVolatile;
        do {
            unsafe = UNSAFE;
            intVolatile = unsafe.getIntVolatile(obj, j17);
        } while (!unsafe.compareAndSwapInt(obj, j17, intVolatile, intVolatile + i17));
        return intVolatile;
    }

    public static int getAndIncrementInt(java.lang.Object obj, long j17) {
        sun.misc.Unsafe unsafe;
        int intVolatile;
        do {
            unsafe = UNSAFE;
            intVolatile = unsafe.getIntVolatile(obj, j17);
        } while (!unsafe.compareAndSwapInt(obj, j17, intVolatile, intVolatile + 1));
        return intVolatile;
    }

    public static int getAndSetInt(java.lang.Object obj, long j17, int i17) {
        sun.misc.Unsafe unsafe;
        int intVolatile;
        do {
            unsafe = UNSAFE;
            intVolatile = unsafe.getIntVolatile(obj, j17);
        } while (!unsafe.compareAndSwapInt(obj, j17, intVolatile, i17));
        return intVolatile;
    }

    public static boolean isUnsafeAvailable() {
        return (UNSAFE == null || DISABLED_BY_USER) ? false : true;
    }
}
