package vi5;

/* loaded from: classes.dex */
public class f implements si5.c {

    /* renamed from: h, reason: collision with root package name */
    public static final vi5.e f437620h = new vi5.e(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f437621a;

    /* renamed from: b, reason: collision with root package name */
    public final long f437622b;

    /* renamed from: c, reason: collision with root package name */
    public final p13.y f437623c;

    /* renamed from: d, reason: collision with root package name */
    public final p13.r f437624d;

    /* renamed from: e, reason: collision with root package name */
    public final int f437625e;

    /* renamed from: f, reason: collision with root package name */
    public final int f437626f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f437627g;

    public f(long j17, long j18, p13.y yVar, p13.r rVar, int i17, int i18, boolean z17) {
        this.f437621a = j17;
        this.f437622b = j18;
        this.f437623c = yVar;
        this.f437624d = rVar;
        this.f437625e = i17;
        this.f437626f = i18;
        this.f437627g = z17;
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
        if (!(other instanceof vi5.f)) {
            return 0;
        }
        ri5.h hVar = ri5.j.I;
        int i17 = ri5.j.X;
        int i18 = thisItem.f396114i;
        int i19 = otherItem.f396114i;
        int i27 = thisItem.f396110e;
        if (i27 != i17 && i27 != ri5.j.W && i27 != ri5.j.V) {
            int i28 = kotlin.jvm.internal.o.i(i18, i19);
            return i28 != 0 ? i28 : kotlin.jvm.internal.o.j(((vi5.f) other).f437622b, this.f437622b);
        }
        vi5.f fVar = (vi5.f) other;
        int i29 = kotlin.jvm.internal.o.i(this.f437625e, fVar.f437625e);
        if (i29 != 0) {
            return i29;
        }
        int i37 = kotlin.jvm.internal.o.i(i18, i19);
        return i37 != 0 ? i37 : kotlin.jvm.internal.o.i(this.f437626f, fVar.f437626f);
    }

    @Override // si5.c
    public void c(em.o2 uiBinding, in5.s0 holder, ri5.j item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(uiBinding, "uiBinding");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (xg3.b.a(this.f437622b, 4, 0L) != 0) {
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
        if (!(other instanceof vi5.f)) {
            return false;
        }
        vi5.f fVar = (vi5.f) other;
        return this.f437621a == fVar.f437621a && this.f437622b == fVar.f437622b && kotlin.jvm.internal.o.b(this.f437623c, fVar.f437623c) && kotlin.jvm.internal.o.b(this.f437624d, fVar.f437624d) && this.f437625e == fVar.f437625e && this.f437626f == fVar.f437626f;
    }

    public /* synthetic */ f(long j17, long j18, p13.y yVar, p13.r rVar, int i17, int i18, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? 0L : j17, (i19 & 2) == 0 ? j18 : 0L, (i19 & 4) != 0 ? null : yVar, (i19 & 8) == 0 ? rVar : null, (i19 & 16) != 0 ? 0 : i17, (i19 & 32) != 0 ? 0 : i18, (i19 & 64) == 0 ? z17 : false);
    }
}
