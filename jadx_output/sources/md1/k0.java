package md1;

/* loaded from: classes7.dex */
public class k0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f325757b;

    public k0(md1.n0 n0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325757b = n0Var;
        this.f325756a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on talk member changed! %s", arrayList);
        md1.n0 n0Var = this.f325757b;
        java.util.Map H = n0Var.H(arrayList);
        ((java.util.HashMap) H).put("errCode", 0);
        md1.e1 e1Var = n0Var.f325792o;
        e1Var.u(this.f325756a);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: speaker changed.");
        e1Var.t(H);
        e1Var.m();
    }
}
