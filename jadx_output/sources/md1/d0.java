package md1;

/* loaded from: classes7.dex */
public class d0 implements gp1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f325725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md1.e0 f325726c;

    public d0(md1.e0 e0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f325726c = e0Var;
        this.f325724a = c0Var;
        this.f325725b = i17;
    }

    @Override // gp1.d0
    public void a(java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        boolean z17 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.T;
        md1.e0 e0Var = this.f325726c;
        int i17 = this.f325725b;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325724a;
        if (z17) {
            hashMap.put("join", java.lang.Boolean.TRUE);
            c0Var.a(i17, e0Var.p("ok", hashMap));
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "hasVoIPChat:%b, now is voip talking", java.lang.Boolean.valueOf(z17));
            return;
        }
        if (list == null || list.size() == 0) {
            hashMap.put("join", java.lang.Boolean.FALSE);
            c0Var.a(i17, e0Var.p("ok", hashMap));
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "ballInfoList is empty, hasVoIPChat false!");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int i18 = ((com.tencent.mm.plugin.ball.model.BallInfo) it.next()).f93046d;
            if (i18 == 17 || i18 == 19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "has appbrand doing voip");
                z17 = true;
                break;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "hasVoIPChat:%b", java.lang.Boolean.valueOf(z17));
        hashMap.put("join", java.lang.Boolean.valueOf(z17));
        c0Var.a(i17, e0Var.p("ok", hashMap));
    }
}
