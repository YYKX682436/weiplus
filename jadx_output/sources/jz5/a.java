package jz5;

/* loaded from: classes7.dex */
public abstract class a {
    public static final void a(java.lang.Throwable th6, java.lang.Throwable exception) {
        kotlin.jvm.internal.o.g(th6, "<this>");
        kotlin.jvm.internal.o.g(exception, "exception");
        if (th6 != exception) {
            java.lang.Integer num = tz5.a.f423389a;
            if (num == null || num.intValue() >= 19) {
                th6.addSuppressed(exception);
                return;
            }
            java.lang.reflect.Method method = sz5.a.f414250a;
            if (method != null) {
                method.invoke(th6, exception);
            }
        }
    }

    public static final java.lang.String b(java.lang.Throwable th6) {
        kotlin.jvm.internal.o.g(th6, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.o.f(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
