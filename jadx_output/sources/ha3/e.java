package ha3;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.g f279829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f279832g;

    public e(ha3.g gVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f279829d = gVar;
        this.f279830e = str;
        this.f279831f = str2;
        this.f279832g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f279829d.f279861l;
        if (eventSink != null) {
            eventSink.error(this.f279830e, this.f279831f, this.f279832g);
        }
    }
}
