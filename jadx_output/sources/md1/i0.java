package md1;

/* loaded from: classes7.dex */
public class i0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f325745b;

    public i0(md1.n0 n0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325745b = n0Var;
        this.f325744a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on room member changed! %s", arrayList);
        md1.n0 n0Var = this.f325745b;
        if (arrayList != null) {
            n0Var.f325801x = java.lang.Math.max(n0Var.f325801x, arrayList.size());
        }
        java.util.Map H = n0Var.H(arrayList);
        ((java.util.HashMap) H).put("errCode", 0);
        md1.d1 d1Var = n0Var.f325790m;
        d1Var.u(this.f325744a);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: dispatch member change");
        d1Var.t(H);
        d1Var.m();
    }
}
