package x36;

/* loaded from: classes16.dex */
public abstract class v {
    public static final x36.l a(x36.f0 buffer) {
        kotlin.jvm.internal.o.g(buffer, "$this$buffer");
        return new x36.z(buffer);
    }

    public static final x36.m b(x36.h0 buffer) {
        kotlin.jvm.internal.o.g(buffer, "$this$buffer");
        return new x36.b0(buffer);
    }

    public static final boolean c(java.lang.AssertionError isAndroidGetsocknameError) {
        java.util.logging.Logger logger = x36.w.f451714a;
        kotlin.jvm.internal.o.g(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        if (isAndroidGetsocknameError.getCause() == null) {
            return false;
        }
        java.lang.String message = isAndroidGetsocknameError.getMessage();
        return message != null ? r26.n0.B(message, "getsockname failed", false) : false;
    }

    public static final x36.f0 d(java.net.Socket sink) {
        java.util.logging.Logger logger = x36.w.f451714a;
        kotlin.jvm.internal.o.g(sink, "$this$sink");
        x36.g0 g0Var = new x36.g0(sink);
        java.io.OutputStream outputStream = sink.getOutputStream();
        kotlin.jvm.internal.o.f(outputStream, "getOutputStream()");
        return new x36.e(g0Var, new x36.x(outputStream, g0Var));
    }

    public static final x36.h0 e(java.io.File source) {
        java.util.logging.Logger logger = x36.w.f451714a;
        kotlin.jvm.internal.o.g(source, "$this$source");
        return f(new java.io.FileInputStream(source));
    }

    public static final x36.h0 f(java.io.InputStream source) {
        java.util.logging.Logger logger = x36.w.f451714a;
        kotlin.jvm.internal.o.g(source, "$this$source");
        return new x36.u(source, new x36.j0());
    }

    public static final x36.h0 g(java.net.Socket source) {
        java.util.logging.Logger logger = x36.w.f451714a;
        kotlin.jvm.internal.o.g(source, "$this$source");
        x36.g0 g0Var = new x36.g0(source);
        java.io.InputStream inputStream = source.getInputStream();
        kotlin.jvm.internal.o.f(inputStream, "getInputStream()");
        return new x36.f(g0Var, new x36.u(inputStream, g0Var));
    }
}
