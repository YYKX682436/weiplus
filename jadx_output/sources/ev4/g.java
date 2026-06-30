package ev4;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev4.j f256948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256949e;

    public g(ev4.j jVar, java.lang.String str) {
        this.f256948d = jVar;
        this.f256949e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.MethodChannel methodChannel;
        ev4.d dVar = this.f256948d.f256953a.f267012f;
        if (dVar == null || (methodChannel = dVar.f256943a) == null) {
            return;
        }
        methodChannel.invokeMethod("onSetSearchInputWord", this.f256949e);
    }
}
