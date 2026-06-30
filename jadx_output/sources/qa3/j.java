package qa3;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final qa3.j f361048a = new qa3.j();

    public final java.lang.String a(java.lang.String str, java.lang.String find) {
        kotlin.jvm.internal.o.g(find, "find");
        if (str == null) {
            return null;
        }
        if (kotlin.jvm.internal.o.b(str, find)) {
            return str;
        }
        java.lang.String format = java.lang.String.format("%s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{str, find}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
