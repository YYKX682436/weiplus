package kw2;

/* loaded from: classes15.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw2.e f313082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, kw2.e eVar) {
        super(1);
        this.f313081d = str;
        this.f313082e = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kw2.g result = (kw2.g) obj;
        kotlin.jvm.internal.o.g(result, "result");
        pm0.v.O("FinderNetworkFlowReport_Thread", new kw2.q(result, this.f313081d, this.f313082e));
        return jz5.f0.f302826a;
    }
}
