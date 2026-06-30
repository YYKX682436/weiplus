package t26;

/* loaded from: classes14.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f415354a = 0;
    private static volatile android.view.Choreographer choreographer;

    static {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(new t26.a(a(android.os.Looper.getMainLooper(), true), null, 2, null));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    public static final android.os.Handler a(android.os.Looper looper, boolean z17) {
        if (!z17) {
            return new android.os.Handler(looper);
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            try {
                return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
            } catch (java.lang.NoSuchMethodException unused) {
                return new android.os.Handler(looper);
            }
        }
        java.lang.Object invoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (android.os.Handler) invoke;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }

    public static t26.d b(android.os.Handler handler, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = null;
        }
        return new t26.a(handler, str, false);
    }
}
