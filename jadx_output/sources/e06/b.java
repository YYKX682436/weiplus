package e06;

/* loaded from: classes13.dex */
public final class b extends kz5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f246201d;

    /* renamed from: e, reason: collision with root package name */
    public final int f246202e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f246203f;

    /* renamed from: g, reason: collision with root package name */
    public int f246204g;

    public b(char c17, char c18, int i17) {
        this.f246201d = i17;
        this.f246202e = c18;
        boolean z17 = true;
        if (i17 <= 0 ? kotlin.jvm.internal.o.i(c17, c18) < 0 : kotlin.jvm.internal.o.i(c17, c18) > 0) {
            z17 = false;
        }
        this.f246203f = z17;
        this.f246204g = z17 ? c17 : c18;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f246203f;
    }
}
