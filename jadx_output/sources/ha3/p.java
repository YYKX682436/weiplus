package ha3;

/* loaded from: classes15.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f279917g;

    public p(ha3.v vVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f279914d = vVar;
        this.f279915e = str;
        this.f279916f = str2;
        this.f279917g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279914d.f279951m;
        if (eventSink != null) {
            eventSink.error(this.f279915e, this.f279916f, this.f279917g);
        }
    }
}
