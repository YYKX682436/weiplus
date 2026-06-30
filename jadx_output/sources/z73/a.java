package z73;

/* loaded from: classes11.dex */
public abstract class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f470567d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f470568e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470569f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470570g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470572i;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f470571h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f470573m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f470574n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f470575o = 0;

    public a() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.f35();
        lVar.f70665b = new r45.g35();
        lVar.f70666c = "/cgi-bin/micromsg-bin/prconfig";
        lVar.f70667d = 3899;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f470567d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f470568e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f470567d;
        r45.f35 f35Var = (r45.f35) oVar.f70710a.f70684a;
        f35Var.f373987d = this.f470569f;
        f35Var.f373988e = this.f470570g;
        f35Var.f373989f = this.f470571h;
        f35Var.f373991h = this.f470572i;
        f35Var.f373992i = this.f470573m;
        f35Var.f373993m = this.f470574n;
        f35Var.f373994n = this.f470575o;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3899;
    }
}
