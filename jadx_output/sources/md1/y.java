package md1;

/* loaded from: classes7.dex */
public class y implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f325819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md1.c0 f325820c;

    public y(md1.c0 c0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var2, int i17) {
        this.f325820c = c0Var;
        this.f325818a = c0Var2;
        this.f325819b = i17;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: earphone done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        md1.c0 c0Var = this.f325820c;
        int i19 = this.f325819b;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = this.f325818a;
        if (i17 != 0 || i18 != 0) {
            c0Var2.a(i19, c0Var.o("fail: " + str));
        } else {
            c0Var.f325723m = true;
            if (c0Var.f325722i) {
                c0Var2.a(i19, c0Var.o("ok"));
            }
        }
    }
}
