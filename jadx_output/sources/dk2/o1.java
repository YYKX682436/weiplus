package dk2;

/* loaded from: classes3.dex */
public final class o1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f233825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.u f233826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233827d;

    public o1(dk2.r4 r4Var, long j17, yz5.u uVar, int i17) {
        this.f233824a = r4Var;
        this.f233825b = j17;
        this.f233826c = uVar;
        this.f233827d = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        pm0.v.X(new dk2.n1(this.f233824a, this.f233825b, (r45.hc1) fVar.f70618d, this.f233826c, i17, str, i18, this.f233827d));
        return jz5.f0.f302826a;
    }
}
