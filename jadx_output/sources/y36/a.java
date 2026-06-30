package y36;

/* loaded from: classes16.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f459270a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "(this as java.lang.String).getBytes(charset)");
        f459270a = bytes;
    }

    public static final java.lang.String a(x36.k readUtf8Line, long j17) {
        kotlin.jvm.internal.o.g(readUtf8Line, "$this$readUtf8Line");
        if (j17 > 0) {
            long j18 = j17 - 1;
            if (readUtf8Line.c(j18) == ((byte) 13)) {
                java.lang.String p17 = readUtf8Line.p(j18, r26.c.f368865a);
                readUtf8Line.skip(2L);
                return p17;
            }
        }
        java.lang.String p18 = readUtf8Line.p(j17, r26.c.f368865a);
        readUtf8Line.skip(1L);
        return p18;
    }
}
