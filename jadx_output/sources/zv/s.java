package zv;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476100d;

    public s(java.lang.String str) {
        this.f476100d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.aff.brand_service.v b17;
        if (zv.e0.f475938b) {
            zv.e0.f475938b = false;
            zv.e0.f475939c = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceFlutterInstantsHelper", "killFlutterInstants from = " + this.f476100d);
            zv.e2 e2Var = (zv.e2) ((bw.k) i95.n0.c(bw.k.class));
            kotlinx.coroutines.l.d(e2Var.f475947e, null, null, new zv.p1(e2Var, null), 3, null);
            if (!zv.q.f476079a.g() || (b17 = yw.a3.f466266a.b()) == null) {
                return;
            }
            b17.u(false, zv.r.f476094a);
        }
    }
}
