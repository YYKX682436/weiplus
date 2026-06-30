package kc2;

/* loaded from: classes12.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f306549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f306550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f306551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kc2.a2 f306552g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(int i17, long j17, boolean z17, kc2.a2 a2Var) {
        super(1);
        this.f306549d = i17;
        this.f306550e = j17;
        this.f306551f = z17;
        this.f306552g = a2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = this.f306549d - intValue;
        long j17 = i17;
        long j18 = this.f306550e;
        boolean z17 = j17 >= j18;
        if (z17) {
            boolean z18 = this.f306551f;
            kc2.a2 a2Var = this.f306552g;
            if (z18) {
                c66.q qVar = c66.q.f39493a;
                int i18 = a2Var.f306315b.f306539d;
                if (i18 > 0) {
                    try {
                        ((com.tencent.wcdb.core.Table) ((jz5.n) c66.q.f39504l).getValue()).deleteObjects(ni0.f.f337221d.eq(i18).and(ni0.f.f337222e.eq(intValue)));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w("Finder.WCFinderWCDB", "deleteTimeItem actionType=" + i18 + " time=" + intValue + " fail, " + e17.getMessage());
                    }
                }
            }
            if (((java.lang.Boolean) ((jz5.n) a2Var.f306317d).getValue()).booleanValue()) {
                com.tencent.mars.xlog.Log.i(a2Var.f306316c, "(debug) drop out of date item " + a2Var.f306315b + ",time pass=" + i17 + ",dropDuration=" + j18);
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
