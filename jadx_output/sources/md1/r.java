package md1;

/* loaded from: classes7.dex */
public class r implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.s f325788b;

    public r(md1.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325788b = sVar;
        this.f325787a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "on receiveCmdMsg callback!");
        this.f325788b.f325794q.x(this.f325787a, (java.util.Map) obj);
    }
}
