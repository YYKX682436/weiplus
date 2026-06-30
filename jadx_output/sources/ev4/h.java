package ev4;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev4.j f256950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256951e;

    public h(ev4.j jVar, java.lang.String str) {
        this.f256950d = jVar;
        this.f256951e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.flutter.plugin.common.MethodChannel methodChannel;
        ev4.d dVar = this.f256950d.f256953a.f267012f;
        if (dVar == null || (methodChannel = dVar.f256943a) == null) {
            return;
        }
        methodChannel.invokeMethod("onMoreClick", this.f256951e);
    }
}
