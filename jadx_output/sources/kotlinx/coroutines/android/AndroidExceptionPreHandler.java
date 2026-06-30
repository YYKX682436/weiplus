package kotlinx.coroutines.android;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Loz5/a;", "Lkotlinx/coroutines/r0;", "Ljava/lang/reflect/Method;", "preHandler", "Loz5/l;", "context", "", "exception", "Ljz5/f0;", "handleException", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes12.dex */
public final class AndroidExceptionPreHandler extends oz5.a implements kotlinx.coroutines.r0 {
    private volatile java.lang.Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(kotlinx.coroutines.q0.f310567d);
        this._preHandler = this;
    }

    private final java.lang.reflect.Method preHandler() {
        java.lang.Object obj = this._preHandler;
        if (obj != this) {
            return (java.lang.reflect.Method) obj;
        }
        java.lang.reflect.Method method = null;
        try {
            boolean z17 = false;
            java.lang.reflect.Method declaredMethod = java.lang.Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new java.lang.Class[0]);
            if (java.lang.reflect.Modifier.isPublic(declaredMethod.getModifiers())) {
                if (java.lang.reflect.Modifier.isStatic(declaredMethod.getModifiers())) {
                    z17 = true;
                }
            }
            if (z17) {
                method = declaredMethod;
            }
        } catch (java.lang.Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (26 <= i17 && i17 < 28) {
            java.lang.reflect.Method preHandler = preHandler();
            java.lang.Object invoke = preHandler != null ? preHandler.invoke(null, new java.lang.Object[0]) : null;
            java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof java.lang.Thread.UncaughtExceptionHandler ? (java.lang.Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), th6);
            }
        }
    }
}
