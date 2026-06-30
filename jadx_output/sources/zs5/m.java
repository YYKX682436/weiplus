package zs5;

/* loaded from: classes15.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zs5.y yVar) {
        super(0);
        this.f475447d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doInitQBar inited: ");
        zs5.y yVar = this.f475447d;
        sb6.append(yVar.f475505f);
        sb6.append(", initStatus: ");
        sb6.append(yVar.f475506g);
        sb6.append(", qbarId: ");
        sb6.append(yVar.f475507h);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanDecodeQueue", sb6.toString());
        if (yVar.f475506g != zs5.b.f475321f) {
            et5.e eVar = yVar.f475517r;
            if (eVar != null) {
                eVar.a(com.tencent.wechat.aff.iam_scan.a0.InitFromNative);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ry3.s wi6 = ((jd0.l2) ((kd0.w2) i95.n0.c(kd0.w2.class))).wi(0, false);
            zs5.e0 e0Var = yVar.f475501b;
            wi6.f401557c = e0Var.f475345a;
            wi6.f401562h = e0Var.f475346b;
            wi6.f401558d = e0Var.f475347c;
            wi6.f401560f = zs5.f0.a();
            wi6.f401561g = zs5.f0.f475357d;
            zs5.e0 e0Var2 = yVar.f475501b;
            wi6.f401563i = e0Var2.f475350f;
            wi6.f401564j = e0Var2.f475349e;
            int[] readers = e0Var2.f475348d;
            kotlin.jvm.internal.o.f(readers, "readers");
            if (!(readers.length == 0)) {
                wi6.f401559e = yVar.f475501b.f475348d;
            } else {
                wi6.f401559e = new int[]{0};
            }
            com.tencent.wechat.aff.iam_scan.b1 a17 = et5.f.a(wi6);
            com.tencent.wechat.aff.iam_scan.h0 h0Var = com.tencent.wechat.aff.iam_scan.h0.f217048b;
            h0Var.c(yVar.f475507h, a17, new zs5.k(currentTimeMillis, yVar));
            h0Var.h(((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi());
        }
        return jz5.f0.f302826a;
    }
}
