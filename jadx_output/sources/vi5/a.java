package vi5;

/* loaded from: classes.dex */
public final class a implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f437612a;

    /* renamed from: b, reason: collision with root package name */
    public final long f437613b;

    public a(boolean z17, long j17) {
        this.f437612a = z17;
        this.f437613b = j17;
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
        if (!(other instanceof vi5.a)) {
            return 0;
        }
        vi5.a aVar = (vi5.a) other;
        int j17 = kotlin.jvm.internal.o.j(aVar.f437613b, this.f437613b);
        return j17 == 0 ? java.lang.Boolean.compare(aVar.f437612a, this.f437612a) : j17;
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        return false;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof vi5.a)) {
            return false;
        }
        vi5.a aVar = (vi5.a) other;
        return this.f437612a == aVar.f437612a && this.f437613b == aVar.f437613b;
    }
}
