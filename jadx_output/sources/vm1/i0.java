package vm1;

/* loaded from: classes11.dex */
public final class i0 implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438016d;

    public i0(vm1.x0 x0Var) {
        this.f438016d = x0Var;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        this.f438016d.f438071g = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        kotlin.jvm.internal.o.g(eventSink, "eventSink");
        if (obj != null && (obj instanceof java.lang.String) && kotlin.jvm.internal.o.b(obj, "interruptEvent")) {
            this.f438016d.f438071g = eventSink;
        }
    }
}
