package ha3;

/* loaded from: classes15.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f279799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f279802g;

    public b0(ha3.d0 d0Var, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f279799d = d0Var;
        this.f279800e = str;
        this.f279801f = str2;
        this.f279802g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279799d.f279821k;
        if (eventSink != null) {
            eventSink.error(this.f279800e, this.f279801f, this.f279802g);
        }
    }
}
