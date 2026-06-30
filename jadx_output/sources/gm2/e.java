package gm2;

/* loaded from: classes3.dex */
public class e implements gm2.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.c2 f273355a;

    /* renamed from: b, reason: collision with root package name */
    public final gm2.e2 f273356b;

    static {
        new gm2.d(null);
    }

    public e(gm2.c2 spanMode, gm2.e2 sizeMode) {
        kotlin.jvm.internal.o.g(spanMode, "spanMode");
        kotlin.jvm.internal.o.g(sizeMode, "sizeMode");
        this.f273355a = spanMode;
        this.f273356b = sizeMode;
    }

    @Override // gm2.z1
    public int a(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479549ab0);
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int b(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int c(java.lang.Object obj) {
        return i(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int d(java.lang.Object obj) {
        return k(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int[] e(java.lang.Object obj) {
        return l(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int f(java.lang.Object obj) {
        return j(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public gm2.u1 g(int i17) {
        return null;
    }

    @Override // gm2.z1
    public gm2.v1 h(int i17) {
        return null;
    }

    public int i(int i17) {
        gm2.c2 c2Var = gm2.c2.f273350i;
        gm2.c2 c2Var2 = this.f273355a;
        return c2Var2 == c2Var ? com.tencent.mm.ui.bk.C() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_5) : (c2Var2 == gm2.c2.f273348g || c2Var2 == gm2.c2.f273351m) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_5);
    }

    public int j(int i17) {
        return 0;
    }

    public int k(int i17) {
        if (1 <= i17 && i17 < 7) {
            return com.tencent.mm.R.drawable.c4e;
        }
        if (7 <= i17 && i17 < 13) {
            return com.tencent.mm.R.drawable.c4f;
        }
        if (!(13 <= i17 && i17 < 18)) {
            if (!(18 <= i17 && i17 <= Integer.MAX_VALUE)) {
                return 0;
            }
        }
        return com.tencent.mm.R.drawable.c4g;
    }

    public int[] l(int i17) {
        gm2.c1 c1Var = gm2.c1.f273320a;
        int h17 = c1Var.h();
        int intValue = ((java.lang.Number) ((jz5.n) gm2.c1.f273342w).getValue()).intValue();
        int f17 = c1Var.f();
        int ordinal = this.f273356b.ordinal();
        return ordinal != 0 ? ordinal != 2 ? new int[]{intValue, intValue} : new int[]{f17, f17} : new int[]{h17, h17};
    }
}
