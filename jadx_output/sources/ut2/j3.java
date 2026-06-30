package ut2;

/* loaded from: classes3.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f430931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f430932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f430933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f430934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(cm2.m0 m0Var, ut2.s3 s3Var, gk2.e eVar, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        super(0);
        this.f430931d = m0Var;
        this.f430932e = s3Var;
        this.f430933f = eVar;
        this.f430934g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open product from sku:");
        cm2.m0 m0Var = this.f430931d;
        r45.ce0 ce0Var = m0Var.F;
        sb6.append(ce0Var != null ? ce0Var.getString(0) : null);
        sb6.append(" ,path:");
        r45.ce0 ce0Var2 = m0Var.F;
        sb6.append(ce0Var2 != null ? ce0Var2.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingViewHolder", sb6.toString());
        ut2.s3 s3Var = this.f430932e;
        kotlinx.coroutines.y0 y0Var = s3Var.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new ut2.i3(s3Var, this.f430933f, this.f430931d, this.f430934g, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
