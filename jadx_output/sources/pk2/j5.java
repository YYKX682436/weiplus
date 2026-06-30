package pk2;

/* loaded from: classes3.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.l5 f355875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f355876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(pk2.o9 o9Var, pk2.l5 l5Var, v65.n nVar) {
        super(2);
        this.f355874d = o9Var;
        this.f355875e = l5Var;
        this.f355876f = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.jc jcVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = this.f355874d.f356072a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyAnchorStatusFlag: succ=");
        sb6.append(booleanValue);
        sb6.append(", isAnchorLiving=");
        pk2.l5 l5Var = this.f355875e;
        sb6.append(l5Var.n());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (booleanValue && (jcVar = (df2.jc) l5Var.f364427a.e(df2.jc.class)) != null) {
            jcVar.b7();
        }
        this.f355876f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
