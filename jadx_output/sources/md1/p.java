package md1;

/* loaded from: classes7.dex */
public class p implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.s f325778b;

    public p(md1.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325778b = sVar;
        this.f325777a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on talk member changed! %s", arrayList);
        md1.s sVar = this.f325778b;
        java.util.Map H = sVar.H(arrayList);
        ((java.util.HashMap) H).put("errCode", 0);
        md1.e1 e1Var = sVar.f325792o;
        e1Var.u(this.f325777a);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: speaker changed.");
        e1Var.t(H);
        e1Var.m();
    }
}
