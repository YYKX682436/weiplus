package h0;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f277776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f277777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n0.v2 v2Var, yz5.a aVar) {
        super(0);
        this.f277776d = v2Var;
        this.f277777e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(((java.lang.Boolean) this.f277776d.getValue()).booleanValue() || ((java.lang.Boolean) this.f277777e.invoke()).booleanValue());
    }
}
