package o26;

/* loaded from: classes16.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f342617a;

    public w(java.lang.Throwable th6, o26.v vVar) {
        if (th6 != null) {
            this.f342617a = th6;
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = i17 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 1 ? 3 : 2];
        if (i17 != 1) {
            objArr[0] = "throwable";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        }
        if (i17 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        } else {
            objArr[1] = "getThrowable";
        }
        if (i17 != 1) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 1) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    public java.lang.String toString() {
        return this.f342617a.toString();
    }
}
