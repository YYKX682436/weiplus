package rk4;

/* loaded from: classes11.dex */
public final class h2 implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396685d;

    public h2(rk4.l3 l3Var) {
        this.f396685d = l3Var;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        this.f396685d.f396820h = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        kotlin.jvm.internal.o.g(eventSink, "eventSink");
        if (obj != null && (obj instanceof java.lang.String) && kotlin.jvm.internal.o.b(obj, "interruptEvent")) {
            this.f396685d.f396820h = eventSink;
        }
    }
}
