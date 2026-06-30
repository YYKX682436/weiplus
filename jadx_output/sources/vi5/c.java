package vi5;

/* loaded from: classes.dex */
public final class c implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f437616a;

    /* renamed from: b, reason: collision with root package name */
    public final long f437617b;

    public c(long j17, long j18) {
        this.f437616a = j17;
        this.f437617b = j18;
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
        if (!(other instanceof vi5.c)) {
            return 0;
        }
        vi5.c cVar = (vi5.c) other;
        int j17 = kotlin.jvm.internal.o.j(cVar.f437617b, this.f437617b);
        return j17 == 0 ? kotlin.jvm.internal.o.j(cVar.f437616a, this.f437616a) : j17;
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        return false;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof vi5.c)) {
            return false;
        }
        vi5.c cVar = (vi5.c) other;
        return this.f437616a == cVar.f437616a && this.f437617b == cVar.f437617b;
    }
}
