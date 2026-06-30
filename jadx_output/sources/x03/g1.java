package x03;

/* loaded from: classes15.dex */
public class g1 implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f451031d;

    public g1(x03.p1 p1Var) {
        this.f451031d = p1Var;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        x03.d2 d2Var = this.f451031d.f451096i;
        d2Var.f451003a = null;
        d2Var.a();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        x03.d2 d2Var = this.f451031d.f451096i;
        d2Var.f451003a = eventSink;
        d2Var.a();
    }
}
