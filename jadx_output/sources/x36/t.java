package x36;

/* loaded from: classes16.dex */
public final class t implements x36.h0 {

    /* renamed from: d, reason: collision with root package name */
    public int f451708d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f451709e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.m f451710f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.zip.Inflater f451711g;

    public t(x36.m source, java.util.zip.Inflater inflater) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(inflater, "inflater");
        this.f451710f = source;
        this.f451711g = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[SYNTHETIC] */
    @Override // x36.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long B(x36.k r10, long r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.t.B(x36.k, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f451709e) {
            return;
        }
        this.f451711g.end();
        this.f451709e = true;
        this.f451710f.close();
    }

    @Override // x36.h0
    public x36.j0 h() {
        return this.f451710f.h();
    }
}
