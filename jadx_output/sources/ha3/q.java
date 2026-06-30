package ha3;

/* loaded from: classes15.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f279922e;

    public q(ha3.v vVar, java.lang.Object obj) {
        this.f279921d = vVar;
        this.f279922e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279921d.f279951m;
        if (eventSink != null) {
            eventSink.success(this.f279922e);
        }
    }
}
