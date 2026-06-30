package ty0;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f423031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f423032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f423033g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String str, n0.e5 e5Var, yz5.a aVar, int i17) {
        super(2);
        this.f423030d = str;
        this.f423031e = e5Var;
        this.f423032f = aVar;
        this.f423033g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f423033g | 1;
        n0.e5 e5Var = this.f423031e;
        yz5.a aVar = this.f423032f;
        ty0.z0.a(this.f423030d, e5Var, aVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
