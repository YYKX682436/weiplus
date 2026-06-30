package tx2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.s f422622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m70 f422623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422624f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tx2.s sVar, r45.m70 m70Var, java.lang.String str) {
        super(0);
        this.f422622d = sVar;
        this.f422623e = m70Var;
        this.f422624f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        tx2.s sVar = this.f422622d;
        s40.w0.z5(w0Var, sVar.f422647c, this.f422623e, null, this.f422624f, sVar.f422651g, 4, null);
        return jz5.f0.f302826a;
    }
}
