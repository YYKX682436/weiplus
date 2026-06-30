package e26;

/* loaded from: classes16.dex */
public final class j implements e26.k {
    public java.lang.RuntimeException a(java.lang.Throwable e17) {
        if (e17 == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
        }
        kotlin.jvm.internal.o.g(e17, "e");
        throw e17;
    }
}
