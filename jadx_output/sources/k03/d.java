package k03;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k03.e f303114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel f303115e;

    public d(k03.e eVar, io.flutter.plugin.common.MethodChannel methodChannel) {
        this.f303114d = eVar;
        this.f303115e = methodChannel;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f303114d.f303117d;
        io.flutter.plugin.common.MethodChannel methodChannel = this.f303115e;
        if (mMPAGView != null) {
            if (methodChannel != null) {
                methodChannel.invokeMethod("platformViewEvent", kz5.b1.e(new jz5.l("event", "pagResourceLoadSuccess")));
            }
        } else if (methodChannel != null) {
            methodChannel.invokeMethod("platformViewEvent", kz5.b1.e(new jz5.l("event", "pagResourceLoadFail")));
        }
    }
}
