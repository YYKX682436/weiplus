package k03;

/* loaded from: classes10.dex */
public final class c implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel f303113d;

    public c(io.flutter.plugin.common.MethodChannel methodChannel) {
        this.f303113d = methodChannel;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f303113d;
        if (methodChannel != null) {
            methodChannel.invokeMethod("platformViewEvent", kz5.b1.e(new jz5.l("event", "pagAnimationCancel")));
        }
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f303113d;
        if (methodChannel != null) {
            methodChannel.invokeMethod("platformViewEvent", kz5.b1.e(new jz5.l("event", "pagAnimationStart")));
        }
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f303113d;
        if (methodChannel != null) {
            methodChannel.invokeMethod("platformViewEvent", kz5.b1.e(new jz5.l("event", "pagAnimationEnd")));
        }
    }

    @Override // ym5.w1
    public void d(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f303113d;
        if (methodChannel != null) {
            methodChannel.invokeMethod("platformViewEvent", kz5.b1.e(new jz5.l("event", "pagAnimationRepeat")));
        }
    }
}
