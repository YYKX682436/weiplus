package vd2;

/* loaded from: classes3.dex */
public final class b1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f435656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f435658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f435660e;

    public b1(ss5.d0 d0Var, android.content.Context context, vd2.f1 f1Var, android.content.Intent intent, java.lang.Object obj) {
        this.f435656a = d0Var;
        this.f435657b = context;
        this.f435658c = f1Var;
        this.f435659d = intent;
        this.f435660e = obj;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ss5.d0 d0Var = this.f435656a;
        if (d0Var != null) {
            kotlin.jvm.internal.o.d(fVar);
            d0Var.d(fVar);
        }
        r45.z61 z61Var = (r45.z61) fVar.f70618d;
        pm0.v.X(new vd2.a1(z61Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) z61Var.getCustom(1) : null, ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode(), this.f435657b, this.f435658c, this.f435659d, this.f435660e, this.f435656a, fVar));
        return jz5.f0.f302826a;
    }
}
