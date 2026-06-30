package gg1;

/* loaded from: classes7.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f271617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(boolean z17, gg1.c1 c1Var) {
        super(1);
        this.f271617d = z17;
        this.f271618e = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = this.f271617d ? 4 : 2;
        gg1.g gVar = this.f271618e.f271541g;
        if (gVar != null) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.report.g1((com.tencent.mm.plugin.appbrand.report.j1) gVar, i17, intValue));
        }
        this.f271618e.f271539e.f271594g.d();
        return jz5.f0.f302826a;
    }
}
