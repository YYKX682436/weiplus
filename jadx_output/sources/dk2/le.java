package dk2;

/* loaded from: classes3.dex */
public final class le extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.t f233736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(gk2.e eVar, boolean z17, yz5.t tVar) {
        super(1);
        this.f233735d = eVar;
        this.f233736e = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.k6 k6Var = dk2.ef.f233390j;
        dk2.xf xfVar = dk2.ef.A;
        k6Var.getClass();
        gk2.e liveData = this.f233735d;
        kotlin.jvm.internal.o.g(liveData, "liveData");
        yz5.t callback = this.f233736e;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (xfVar != null) {
            ((dk2.r4) xfVar).v(new dk2.g6(liveData, xfVar, k6Var, callback));
        }
        return jz5.f0.f302826a;
    }
}
