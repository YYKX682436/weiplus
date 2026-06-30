package fv4;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv4.f f266986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f266987e;

    public d(fv4.f fVar, java.util.Map map) {
        this.f266986d = fVar;
        this.f266987e = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ev4.d dVar;
        fv4.i iVar = this.f266986d.f267005a;
        if (iVar == null || (dVar = iVar.f267012f) == null) {
            return;
        }
        java.util.Map args = this.f266987e;
        kotlin.jvm.internal.o.g(args, "args");
        io.flutter.plugin.common.MethodChannel methodChannel = dVar.f256943a;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onWebViewSizeChanged", args);
        }
    }
}
