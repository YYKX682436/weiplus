package kw2;

/* loaded from: classes15.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw2.e f313069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, kw2.e eVar) {
        super(1);
        this.f313068d = str;
        this.f313069e = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kw2.g it = (kw2.g) obj;
        kotlin.jvm.internal.o.g(it, "it");
        pm0.v.O("FinderNetworkFlowReport_Thread", new kw2.m(it, this.f313068d, this.f313069e));
        return jz5.f0.f302826a;
    }
}
