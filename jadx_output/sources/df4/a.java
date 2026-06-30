package df4;

/* loaded from: classes4.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.Integer num) {
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date((num != null ? num.intValue() : 0L) * 1000));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
