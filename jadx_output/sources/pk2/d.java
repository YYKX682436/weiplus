package pk2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f355641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f355642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f355643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f355644h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pk2.o9 o9Var, long j17, v65.n nVar, yz5.l lVar, boolean z17) {
        super(2);
        this.f355640d = o9Var;
        this.f355641e = j17;
        this.f355642f = nVar;
        this.f355643g = lVar;
        this.f355644h = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f355640d.f356072a, "modifyAnchorStatusFlagLong: succ=" + booleanValue + ", flag=" + this.f355641e);
        if (booleanValue) {
            pm0.v.X(new pk2.c(this.f355643g, this.f355644h));
        }
        this.f355642f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
