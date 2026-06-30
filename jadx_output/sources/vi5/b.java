package vi5;

/* loaded from: classes.dex */
public final class b implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f437614a;

    /* renamed from: b, reason: collision with root package name */
    public final long f437615b;

    public b(long j17, long j18) {
        this.f437614a = j17;
        this.f437615b = j18;
    }

    @Override // si5.c
    public int a() {
        return 0;
    }

    @Override // si5.c
    public int b(ri5.j thisItem, ri5.j otherItem, si5.c other) {
        kotlin.jvm.internal.o.g(thisItem, "thisItem");
        kotlin.jvm.internal.o.g(otherItem, "otherItem");
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof vi5.b)) {
            return 0;
        }
        vi5.b bVar = (vi5.b) other;
        int j17 = kotlin.jvm.internal.o.j(bVar.f437615b, this.f437615b);
        return j17 == 0 ? kotlin.jvm.internal.o.j(bVar.f437614a, this.f437614a) : j17;
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        return false;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof vi5.b)) {
            return false;
        }
        vi5.b bVar = (vi5.b) other;
        return this.f437614a == bVar.f437614a && this.f437615b == bVar.f437615b;
    }
}
