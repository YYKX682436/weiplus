package df2;

/* loaded from: classes3.dex */
public final class m0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f230737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f230738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f230739c;

    public m0(v65.n nVar, df2.v0 v0Var, boolean z17) {
        this.f230737a = nVar;
        this.f230738b = v0Var;
        this.f230739c = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17 = this.f230739c;
        pm0.v.X(new df2.l0(this.f230737a, (com.tencent.mm.modelbase.f) obj, this.f230738b, z17));
        return jz5.f0.f302826a;
    }
}
