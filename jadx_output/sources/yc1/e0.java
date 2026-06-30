package yc1;

/* loaded from: classes7.dex */
public class e0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h45.r f460781a;

    public e0(yc1.f0 f0Var, h45.r rVar) {
        this.f460781a = rVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSecureTunnel", "onGYNetEnd errType :" + i17 + " errCode: " + i18 + " errMsg :" + str);
        h45.r rVar = this.f460781a;
        if (i17 == 0 && i18 == 0 && oVar.f70711b.f70700a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel cgi success");
            rVar.onSuccess(((r45.hy5) oVar.f70711b.f70700a).f376556d);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSecureTunnel", "secureTunnel cgi failed");
            rVar.a(str);
        }
    }
}
