package gp2;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f274307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f274309f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.p pVar, gp2.l0 l0Var, so2.h1 h1Var) {
        super(2);
        this.f274307d = pVar;
        this.f274308e = l0Var;
        this.f274309f = h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        yz5.p pVar = this.f274307d;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
        }
        boolean z17 = gp2.l0.N;
        com.tencent.mars.xlog.Log.i(this.f274308e.t(), "checkAutoPlayByOutside: videoSizeChangeCallback feed=" + this.f274309f + " w=" + intValue + " h=" + intValue2);
        return jz5.f0.f302826a;
    }
}
