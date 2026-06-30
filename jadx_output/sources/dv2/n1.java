package dv2;

/* loaded from: classes8.dex */
public final class n1 implements com.tencent.mm.plugin.finder.assist.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.o1 f243909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f243910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.m8 f243911c;

    public n1(dv2.o1 o1Var, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.assist.m8 m8Var) {
        this.f243909a = o1Var;
        this.f243910b = c0Var;
        this.f243911c = m8Var;
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void a(com.tencent.mm.modelbase.f cgiBack) {
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        java.lang.String str = cgiBack.f70617c;
        dv2.o1 o1Var = this.f243909a;
        if (str != null) {
            o1Var.f243925o.getClass();
            int i17 = 0;
            try {
                int optInt = new cl0.g(str).optInt("appera_times", 0);
                com.tencent.mars.xlog.Log.i("FinderSafePreCheckHelper", "[getJumpAppearTimes] appearTimes:" + optInt);
                i17 = optInt;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FinderSafePreCheckHelper", "[getJumpAppearTimes] catch exception:" + e17.getMessage());
            }
            o1Var.f243919f = i17;
        }
        o1Var.f243923m = ((r45.l23) cgiBack.f70618d).getByteString(5);
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void b() {
        this.f243910b.f310112d = true;
        dv2.o1 o1Var = this.f243909a;
        o1Var.f243917d++;
        this.f243911c.b();
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", "[preCheckInner] onShowTipsDialog showCount:" + o1Var.f243917d);
    }

    @Override // com.tencent.mm.plugin.finder.assist.m8
    public void c(com.tencent.mm.plugin.finder.assist.h9 result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", "[preCheckInner] onEndCheck confirm:" + result.f102233a + " fromDialog:" + result.f102234b);
        this.f243910b.f310112d = true;
        dv2.o1.O6(this.f243909a, this.f243911c, result);
    }
}
