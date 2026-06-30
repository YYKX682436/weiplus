package md1;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.s f325770b;

    public n(md1.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325770b = sVar;
        this.f325769a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on room member changed! %s", arrayList);
        md1.s sVar = this.f325770b;
        if (arrayList != null) {
            sVar.f325801x = java.lang.Math.max(sVar.f325801x, arrayList.size());
        }
        java.util.Map H = sVar.H(arrayList);
        ((java.util.HashMap) H).put("errCode", 0);
        md1.d1 d1Var = sVar.f325790m;
        d1Var.u(this.f325769a);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: dispatch member change");
        d1Var.t(H);
        d1Var.m();
    }
}
