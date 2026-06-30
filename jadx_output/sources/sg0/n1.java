package sg0;

/* loaded from: classes8.dex */
public final class n1 implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f407758d;

    public n1(sg0.a2 a2Var) {
        this.f407758d = a2Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onAppBackground");
        sg0.a2 a2Var = this.f407758d;
        a2Var.oj(1);
        a2Var.Zi(true);
        a2Var.f407673n.sendEmptyMessageDelayed(101, 5000L);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onAppBackground, start check release store!");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        sg0.a2 a2Var = this.f407758d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onAppForeground ".concat(a2Var.f407670h ? "cool start" : "hot start"));
        if (a2Var.f407670h) {
            a2Var.f407673n.sendEmptyMessageDelayed(1, 2000L);
        } else {
            a2Var.Zi(false);
        }
        a2Var.oj(101);
    }
}
