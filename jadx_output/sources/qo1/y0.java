package qo1;

/* loaded from: classes5.dex */
public final class y0 implements com.tencent.wechat.aff.affroam.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f365563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qo1.c1 f365564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f365565c;

    public y0(kotlin.jvm.internal.f0 f0Var, qo1.c1 c1Var, yz5.a aVar) {
        this.f365563a = f0Var;
        this.f365564b = c1Var;
        this.f365565c = aVar;
    }

    @Override // com.tencent.wechat.aff.affroam.f1
    public final void a(int i17, com.tencent.wechat.aff.affroam.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamRestoreTask", "Get backed-up list complete. error=" + i17 + ", convList.siz=" + fVar.f215824d.size());
        this.f365563a.f310116d = i17 == 0 ? 0 : com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE;
        qo1.c1 c1Var = this.f365564b;
        c1Var.f365492r = fVar;
        c1Var.f365491q = this.f365565c;
        ku5.u0 u0Var = ku5.t0.f312615d;
        final qo1.c1 c1Var2 = this.f365564b;
        ((ku5.t0) u0Var).h(new java.lang.Runnable() { // from class: qo1.x0
            @Override // java.lang.Runnable
            public final void run() {
                qo1.c1.this.i();
            }
        }, c1Var2.f365458x);
    }
}
