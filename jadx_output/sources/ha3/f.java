package ha3;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.g f279843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f279844e;

    public f(ha3.g gVar, java.lang.Object obj) {
        this.f279843d = gVar;
        this.f279844e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279843d.f279861l;
        if (eventSink != null) {
            eventSink.success(this.f279844e);
        }
    }
}
