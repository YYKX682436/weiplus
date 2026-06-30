package fa3;

/* loaded from: classes8.dex */
public final class o implements com.tencent.mm.plugin.lite.api.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fa3.p f260775a;

    public o(fa3.p pVar) {
        this.f260775a = pVar;
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void a(java.util.Map map) {
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void b(java.util.Map map) {
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void c(java.util.Map map) {
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void d(java.util.Map map) {
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void e(java.util.Map map) {
    }

    @Override // com.tencent.mm.plugin.lite.api.g
    public void f(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraView", "LiteAppCamera channel invokeMethod cameraInitEvent");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f260775a.f260782m;
        if (methodChannel != null) {
            methodChannel.invokeMethod("cameraInitEvent", map);
        }
    }
}
