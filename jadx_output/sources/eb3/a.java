package eb3;

/* loaded from: classes.dex */
public final class a implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f250871a;

    /* renamed from: b, reason: collision with root package name */
    public final long f250872b;

    /* renamed from: c, reason: collision with root package name */
    public final p13.y f250873c;

    /* renamed from: d, reason: collision with root package name */
    public final p13.r f250874d;

    /* renamed from: e, reason: collision with root package name */
    public final int f250875e;

    /* renamed from: f, reason: collision with root package name */
    public final int f250876f;

    public a(long j17, long j18, p13.y yVar, p13.r rVar, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        j17 = (i19 & 1) != 0 ? 0L : j17;
        j18 = (i19 & 2) != 0 ? 0L : j18;
        yVar = (i19 & 4) != 0 ? null : yVar;
        rVar = (i19 & 8) != 0 ? null : rVar;
        i17 = (i19 & 16) != 0 ? 0 : i17;
        i18 = (i19 & 32) != 0 ? 0 : i18;
        this.f250871a = j17;
        this.f250872b = j18;
        this.f250873c = yVar;
        this.f250874d = rVar;
        this.f250875e = i17;
        this.f250876f = i18;
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
        if (!(other instanceof eb3.a)) {
            return 0;
        }
        ri5.h hVar = ri5.j.I;
        int i17 = ri5.j.X;
        int i18 = thisItem.f396110e;
        int i19 = otherItem.f396110e;
        if (i18 == i17 || i18 == ri5.j.W) {
            eb3.a aVar = (eb3.a) other;
            int i27 = kotlin.jvm.internal.o.i(this.f250875e, aVar.f250875e);
            if (i27 != 0) {
                return i27;
            }
            int i28 = kotlin.jvm.internal.o.i(i18, i19);
            return i28 != 0 ? i28 : kotlin.jvm.internal.o.i(this.f250876f, aVar.f250876f);
        }
        int i29 = kotlin.jvm.internal.o.i(i18, i19);
        if (i29 != 0) {
            return i29;
        }
        eb3.a aVar2 = (eb3.a) other;
        int j17 = kotlin.jvm.internal.o.j(aVar2.f250872b, this.f250872b);
        return j17 == 0 ? kotlin.jvm.internal.o.j(aVar2.f250871a, this.f250871a) : j17;
    }

    @Override // si5.c
    public void c(em.o2 uiBinding, in5.s0 holder, ri5.j item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(uiBinding, "uiBinding");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (xg3.b.a(this.f250872b, 4, 0L) != 0) {
            uiBinding.k().setBackgroundResource(com.tencent.mm.R.drawable.f481311q7);
        } else {
            uiBinding.k().setBackgroundResource(com.tencent.mm.R.drawable.f481312q8);
        }
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        ri5.h hVar = ri5.j.I;
        return item.f396110e == ri5.j.W;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof eb3.a)) {
            return false;
        }
        eb3.a aVar = (eb3.a) other;
        return this.f250871a == aVar.f250871a && this.f250872b == aVar.f250872b && kotlin.jvm.internal.o.b(this.f250873c, aVar.f250873c) && kotlin.jvm.internal.o.b(this.f250874d, aVar.f250874d) && this.f250875e == aVar.f250875e && this.f250876f == aVar.f250876f;
    }
}
