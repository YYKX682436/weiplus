package q01;

/* loaded from: classes5.dex */
public final class g0 {
    public g0(kotlin.jvm.internal.i iVar) {
    }

    public static final java.lang.String a(q01.g0 g0Var, long j17, java.lang.String str) {
        g0Var.getClass();
        if (j17 > 0) {
            java.lang.String format = new java.text.SimpleDateFormat(str, java.util.Locale.getDefault()).format(new java.util.Date(j17));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        }
        return j17 + "ms";
    }
}
