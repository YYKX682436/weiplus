package sf2;

/* loaded from: classes3.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f407147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn2.d f407148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f407149f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(kotlin.jvm.internal.f0 f0Var, hn2.d dVar, yz5.a aVar) {
        super(2);
        this.f407147d = f0Var;
        this.f407148e = dVar;
        this.f407149f = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int longValue = (int) ((((float) ((java.lang.Number) obj2).longValue()) / ((float) ((java.lang.Number) obj).longValue())) * 100);
        this.f407147d.f310116d = longValue;
        this.f407148e.f282515k = longValue / 2;
        pm0.v.X(new sf2.f2(this.f407149f));
        return jz5.f0.f302826a;
    }
}
