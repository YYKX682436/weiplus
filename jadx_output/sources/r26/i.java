package r26;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final r26.i f368894d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f368895a;

    /* renamed from: b, reason: collision with root package name */
    public final r26.g f368896b;

    /* renamed from: c, reason: collision with root package name */
    public final r26.h f368897c;

    static {
        r26.g gVar = r26.g.f368880i;
        r26.h hVar = r26.h.f368889e;
        f368894d = new r26.i(false, gVar, hVar);
        new r26.i(true, gVar, hVar);
    }

    public i(boolean z17, r26.g bytes, r26.h number) {
        kotlin.jvm.internal.o.g(bytes, "bytes");
        kotlin.jvm.internal.o.g(number, "number");
        this.f368895a = z17;
        this.f368896b = bytes;
        this.f368897c = number;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("HexFormat(\n    upperCase = ");
        sb6.append(this.f368895a);
        sb6.append(",\n    bytes = BytesHexFormat(\n");
        this.f368896b.a(sb6, "        ");
        sb6.append('\n');
        sb6.append("    ),");
        sb6.append('\n');
        sb6.append("    number = NumberHexFormat(");
        sb6.append('\n');
        this.f368897c.a(sb6, "        ");
        sb6.append('\n');
        sb6.append("    )");
        sb6.append('\n');
        sb6.append(")");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
