package ev0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev0.t f256867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f256868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ev0.t tVar, yz5.a aVar) {
        super(2);
        this.f256867d = tVar;
        this.f256868e = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj2).intValue();
        ev0.t.a(this.f256867d, (java.lang.String) obj, intValue);
        this.f256868e.invoke();
        return jz5.f0.f302826a;
    }
}
