package md1;

/* loaded from: classes7.dex */
public class j0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f325749b;

    public j0(md1.n0 n0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325749b = n0Var;
        this.f325748a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on room video member changed!");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on room video member changed!， data：%s", map.toString());
        map.put("errCode", 0);
        md1.g1 g1Var = this.f325749b.f325791n;
        g1Var.u(this.f325748a);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.onVoIPVideoMembersChanged", "hy: video member changed.");
        g1Var.t(map);
        g1Var.m();
    }
}
