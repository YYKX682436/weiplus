package md1;

/* loaded from: classes7.dex */
public class m0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f325768b;

    public m0(md1.n0 n0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325768b = n0Var;
        this.f325767a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "on receiveCmdMsg callback!");
        this.f325768b.f325794q.x(this.f325767a, (java.util.Map) obj);
    }
}
