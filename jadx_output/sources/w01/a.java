package w01;

/* loaded from: classes4.dex */
public class a implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f441871b;

    public a(java.lang.String str, java.lang.ref.WeakReference weakReference) {
        this.f441870a = str;
        this.f441871b = weakReference;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object... objArr) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str = this.f441870a;
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenSdkBridge", "doSendImage onImageDownload success? %s=%b", str, valueOf);
        if (z17) {
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
            android.app.Activity activity = (android.app.Activity) this.f441871b.get();
            if (J2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenSdkBridge", "doSendImage null bitmap");
            }
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenSdkBridge", "doSendImage null or finished context");
                return;
            }
            com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject = new com.tencent.mm.opensdk.modelmsg.WXImageObject(J2);
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
            wXMediaMessage.mediaObject = wXImageObject;
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
            req.transaction = "com.tencent.wework.img";
            req.message = wXMediaMessage;
            req.scene = 0;
            w01.b.b(activity, req);
        }
    }
}
