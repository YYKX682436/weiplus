package k8;

/* loaded from: classes15.dex */
public class b implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f304851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k8.c f304852e;

    public b(k8.c cVar, android.app.Activity activity) {
        this.f304852e = cVar;
        this.f304851d = activity;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        k8.c cVar = this.f304852e;
        android.view.OrientationEventListener orientationEventListener = cVar.f304856g;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            cVar.f304856g = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        k8.a aVar = new k8.a(this, this.f304851d, eventSink);
        k8.c cVar = this.f304852e;
        cVar.f304856g = aVar;
        if (cVar.f304856g.canDetectOrientation()) {
            cVar.f304856g.enable();
        } else {
            eventSink.error("SensorError", "Cannot detect sensors. Not enabled", null);
        }
    }
}
