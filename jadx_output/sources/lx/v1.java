package lx;

/* loaded from: classes.dex */
public final class v1 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f321976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321977b;

    public v1(boolean z17, java.lang.ref.WeakReference weakReference) {
        this.f321976a = z17;
        this.f321977b = weakReference;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        com.tencent.pigeon.biz.BizMeTabNativeToFlutterApi bizMeTabNativeToFlutterApi;
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openPublish success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (!this.f321976a || (bizMeTabNativeToFlutterApi = (com.tencent.pigeon.biz.BizMeTabNativeToFlutterApi) this.f321977b.get()) == null) {
            return;
        }
        bizMeTabNativeToFlutterApi.requestAcct(lx.u1.f321966d);
    }
}
