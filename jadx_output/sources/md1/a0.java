package md1;

/* loaded from: classes7.dex */
public class a0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f325711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325713c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md1.c0 f325714d;

    public a0(md1.c0 c0Var, boolean z17, com.tencent.mm.plugin.appbrand.service.c0 c0Var2, int i17) {
        this.f325714d = c0Var;
        this.f325711a = z17;
        this.f325712b = c0Var2;
        this.f325713c = i17;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: microphone done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int i19 = this.f325713c;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325712b;
        md1.c0 c0Var2 = this.f325714d;
        if (i17 != 0 || i18 != 0) {
            c0Var.a(i19, c0Var2.o("fail: " + str));
        } else {
            c0Var2.f325722i = true;
            com.tencent.mm.sdk.platformtools.u3.i(new md1.z(this), 500L);
            if (c0Var2.f325722i && c0Var2.f325723m) {
                c0Var.a(i19, c0Var2.o("ok"));
            }
        }
    }
}
