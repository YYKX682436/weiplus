package pk2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f355930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pk2.o9 o9Var, boolean z17, v65.n nVar) {
        super(2);
        this.f355928d = o9Var;
        this.f355929e = z17;
        this.f355930f = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f355928d.f356072a, "check: " + this.f355929e + ", succ: " + booleanValue);
        this.f355930f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
