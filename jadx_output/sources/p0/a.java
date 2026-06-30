package p0;

/* loaded from: classes14.dex */
public final class a extends kz5.h implements p0.b {

    /* renamed from: e, reason: collision with root package name */
    public final p0.b f350343e;

    /* renamed from: f, reason: collision with root package name */
    public final int f350344f;

    /* renamed from: g, reason: collision with root package name */
    public final int f350345g;

    /* JADX WARN: Multi-variable type inference failed */
    public a(p0.b source, int i17, int i18) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f350343e = source;
        this.f350344f = i17;
        t0.c.c(i17, i18, ((kz5.b) source).d());
        this.f350345g = i18 - i17;
    }

    @Override // kz5.b
    public int d() {
        return this.f350345g;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        t0.c.a(i17, this.f350345g);
        return this.f350343e.get(this.f350344f + i17);
    }

    @Override // kz5.h, java.util.List
    public java.util.List subList(int i17, int i18) {
        t0.c.c(i17, i18, this.f350345g);
        int i19 = this.f350344f;
        return new p0.a(this.f350343e, i17 + i19, i19 + i18);
    }
}
