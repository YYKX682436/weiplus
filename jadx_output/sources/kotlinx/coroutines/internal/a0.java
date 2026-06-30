package kotlinx.coroutines.internal;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a0 {
    public static /* synthetic */ java.util.Iterator a() {
        try {
            return java.util.Arrays.asList(new kotlinx.coroutines.android.AndroidDispatcherFactory()).iterator();
        } catch (java.lang.Throwable th6) {
            throw new java.util.ServiceConfigurationError(th6.getMessage(), th6);
        }
    }
}
