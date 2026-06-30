package ms4;

/* loaded from: classes8.dex */
public class v implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ js4.o f331127a;

    public v(ms4.z zVar, js4.o oVar) {
        this.f331127a = oVar;
    }

    @Override // wd0.p1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinManagerImplement", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
        js4.o oVar = this.f331127a;
        if (oVar != null) {
            oVar.a(3, -3, "授权微信豆失败");
        }
    }

    @Override // wd0.p1
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinManagerImplement", "changeSwitchWechatForStatus2CommonTips onPositionBtn.");
        js4.o oVar = this.f331127a;
        if (oVar != null) {
            oVar.onSuccess(null);
        }
    }
}
