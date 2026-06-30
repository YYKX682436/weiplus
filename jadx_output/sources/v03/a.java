package v03;

/* loaded from: classes11.dex */
public final class a implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v03.b f432298d;

    public a(v03.b bVar) {
        this.f432298d = bVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        this.f432298d.f432303h = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        kotlin.jvm.internal.o.g(eventSink, "eventSink");
        this.f432298d.f432303h = eventSink;
    }
}
