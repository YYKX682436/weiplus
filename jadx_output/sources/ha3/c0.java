package ha3;

/* loaded from: classes15.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f279804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f279805e;

    public c0(ha3.d0 d0Var, java.lang.Object obj) {
        this.f279804d = d0Var;
        this.f279805e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279804d.f279821k;
        if (eventSink != null) {
            eventSink.success(this.f279805e);
        }
    }
}
