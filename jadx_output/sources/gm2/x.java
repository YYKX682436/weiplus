package gm2;

/* loaded from: classes3.dex */
public final class x implements gm2.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.c2 f273523a;

    public x(gm2.c2 spanMode, gm2.e2 sizeMode, int i17, kotlin.jvm.internal.i iVar) {
        spanMode = (i17 & 1) != 0 ? gm2.c2.f273348g : spanMode;
        sizeMode = (i17 & 2) != 0 ? gm2.e2.f273361g : sizeMode;
        kotlin.jvm.internal.o.g(spanMode, "spanMode");
        kotlin.jvm.internal.o.g(sizeMode, "sizeMode");
        this.f273523a = spanMode;
    }

    @Override // gm2.z1
    public int a(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8);
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int b(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public int c(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        gm2.c2 c2Var = gm2.c2.f273350i;
        gm2.c2 c2Var2 = this.f273523a;
        return c2Var2 == c2Var ? com.tencent.mm.ui.bk.C() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_5) : (c2Var2 == gm2.c2.f273348g || c2Var2 == gm2.c2.f273351m) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_5);
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int d(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public int[] e(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return new int[2];
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int f(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public gm2.u1 g(int i17) {
        return null;
    }

    @Override // gm2.z1
    public gm2.v1 h(int i17) {
        return null;
    }
}
