package sm2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f409385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.b f409386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sm2.f f409387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f409388g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, km2.b bVar, sm2.f fVar, int i17) {
        super(0);
        this.f409385d = z17;
        this.f409386e = bVar;
        this.f409387f = fVar;
        this.f409388g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.b bVar;
        if (this.f409385d && (bVar = this.f409386e) != null) {
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f409387f.f409449g;
            if (v3Var != null) {
                v3Var.M1(bVar);
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.T.f327661h = bVar.f309052b;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            long j17 = bVar.f309053c;
            ml2.k5 k5Var = y4Var.T;
            k5Var.f327662i = j17;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            k5Var.f327663j = bVar.f309054d;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            k5Var.f327660g = bVar.f309051a;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var2 = ml2.j0.f327583i;
        y4Var2.p();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.k5 k5Var2 = y4Var2.T;
        int i17 = this.f409388g;
        k5Var2.f327664k = i17;
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        k5Var2.f327658e = java.lang.System.currentTimeMillis();
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328368p, java.lang.String.valueOf(i17), null, 4, null);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Hj();
        return jz5.f0.f302826a;
    }
}
