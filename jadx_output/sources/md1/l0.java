package md1;

/* loaded from: classes7.dex */
public class l0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f325763b;

    public l0(md1.n0 n0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325763b = n0Var;
        this.f325762a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "on event callback!");
        map.put("errCode", 0);
        md1.f1 f1Var = this.f325763b.f325793p;
        f1Var.u(this.f325762a);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.onVoIPChatStateChangedJsEvent", "hy: event callback");
        f1Var.t(map);
        f1Var.m();
    }
}
