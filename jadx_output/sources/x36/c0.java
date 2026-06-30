package x36;

/* loaded from: classes16.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f451657a;

    /* renamed from: b, reason: collision with root package name */
    public int f451658b;

    /* renamed from: c, reason: collision with root package name */
    public int f451659c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f451660d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f451661e;

    /* renamed from: f, reason: collision with root package name */
    public x36.c0 f451662f;

    /* renamed from: g, reason: collision with root package name */
    public x36.c0 f451663g;

    public c0() {
        this.f451657a = new byte[8192];
        this.f451661e = true;
        this.f451660d = false;
    }

    public final x36.c0 a() {
        x36.c0 c0Var = this.f451662f;
        if (c0Var == this) {
            c0Var = null;
        }
        x36.c0 c0Var2 = this.f451663g;
        kotlin.jvm.internal.o.d(c0Var2);
        c0Var2.f451662f = this.f451662f;
        x36.c0 c0Var3 = this.f451662f;
        kotlin.jvm.internal.o.d(c0Var3);
        c0Var3.f451663g = this.f451663g;
        this.f451662f = null;
        this.f451663g = null;
        return c0Var;
    }

    public final x36.c0 b(x36.c0 segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        segment.f451663g = this;
        segment.f451662f = this.f451662f;
        x36.c0 c0Var = this.f451662f;
        kotlin.jvm.internal.o.d(c0Var);
        c0Var.f451663g = segment;
        this.f451662f = segment;
        return segment;
    }

    public final x36.c0 c() {
        this.f451660d = true;
        return new x36.c0(this.f451657a, this.f451658b, this.f451659c, true, false);
    }

    public final void d(x36.c0 sink, int i17) {
        kotlin.jvm.internal.o.g(sink, "sink");
        if (!sink.f451661e) {
            throw new java.lang.IllegalStateException("only owner can write".toString());
        }
        int i18 = sink.f451659c;
        if (i18 + i17 > 8192) {
            if (sink.f451660d) {
                throw new java.lang.IllegalArgumentException();
            }
            int i19 = sink.f451658b;
            if ((i18 + i17) - i19 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = sink.f451657a;
            kz5.v.l(bArr, bArr, 0, i19, i18, 2, null);
            sink.f451659c -= sink.f451658b;
            sink.f451658b = 0;
        }
        int i27 = sink.f451659c;
        int i28 = this.f451658b;
        kz5.v.h(this.f451657a, sink.f451657a, i27, i28, i28 + i17);
        sink.f451659c += i17;
        this.f451658b += i17;
    }

    public c0(byte[] data, int i17, int i18, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f451657a = data;
        this.f451658b = i17;
        this.f451659c = i18;
        this.f451660d = z17;
        this.f451661e = z18;
    }
}
