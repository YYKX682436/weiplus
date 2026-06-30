package vd2;

/* loaded from: classes3.dex */
public final class z0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f436037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f436039c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f436040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wk0 f436041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f436042f;

    public z0(ss5.d0 d0Var, android.content.Context context, vd2.f1 f1Var, android.content.Intent intent, r45.wk0 wk0Var, android.content.Intent intent2) {
        this.f436037a = d0Var;
        this.f436038b = context;
        this.f436039c = f1Var;
        this.f436040d = intent;
        this.f436041e = wk0Var;
        this.f436042f = intent2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ss5.d0 d0Var = this.f436037a;
        if (d0Var != null) {
            kotlin.jvm.internal.o.d(fVar);
            d0Var.d(fVar);
        }
        r45.z61 z61Var = (r45.z61) fVar.f70618d;
        pm0.v.X(new vd2.y0(z61Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) z61Var.getCustom(1) : null, ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode(), this.f436038b, this.f436039c, this.f436040d, this.f436041e, this.f436042f, this.f436037a, fVar));
        return jz5.f0.f302826a;
    }
}
