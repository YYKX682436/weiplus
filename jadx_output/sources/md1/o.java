package md1;

/* loaded from: classes7.dex */
public class o implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.s f325772b;

    public o(md1.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325772b = sVar;
        this.f325771a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on room video member changed!");
        map.put("errCode", 0);
        md1.g1 g1Var = this.f325772b.f325791n;
        g1Var.u(this.f325771a);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.onVoIPVideoMembersChanged", "hy: video member changed.");
        g1Var.t(map);
        g1Var.m();
    }
}
