package xj4;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity f454877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f454878e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity, java.lang.Object obj) {
        super(0);
        this.f454877d = statusFlutterPublishActivity;
        this.f454878e = obj;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f454877d.D = false;
        if (this.f454877d.f173888z || this.f454877d.isFinishing() || this.f454877d.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: activity already finishing, drop result=" + ((java.lang.Object) kotlin.Result.m529toStringimpl(this.f454878e)));
        } else {
            java.lang.Object obj = this.f454878e;
            com.tencent.mm.plugin.textstatus.ui.flutter.StatusFlutterPublishActivity statusFlutterPublishActivity = this.f454877d;
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
            if (m524exceptionOrNullimpl == null) {
                com.tencent.pigeon.status.FLTStatusActionResponse fLTStatusActionResponse = (com.tencent.pigeon.status.FLTStatusActionResponse) obj;
                if (fLTStatusActionResponse.getErrCode() != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: Flutter intercepted, errCode=" + fLTStatusActionResponse.getErrCode() + ", errMsg=" + fLTStatusActionResponse.getErrMsg() + ", skip dismiss");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: Flutter allows dismiss, super.onBackPressed()");
                    super/*com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity*/.finish();
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: send callback failed, fallback to super, err=" + m524exceptionOrNullimpl.getMessage());
                super/*com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity*/.finish();
            }
        }
        return jz5.f0.f302826a;
    }
}
