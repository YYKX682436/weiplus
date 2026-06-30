package j8;

/* loaded from: classes15.dex */
public class f implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j8.g f298096d;

    public f(j8.g gVar) {
        this.f298096d = gVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        j8.g gVar = this.f298096d;
        gVar.f298103m.b();
        gVar.f298103m = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        java.lang.Boolean bool;
        boolean z17 = false;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (map.containsKey("useSensor") && (bool = (java.lang.Boolean) map.get("useSensor")) != null && bool.booleanValue()) {
                z17 = true;
            }
        }
        j8.e eVar = new j8.e(this, eventSink);
        j8.g gVar = this.f298096d;
        if (z17) {
            io.flutter.Log.i("NDOP", "listening using sensor listener");
            gVar.f298103m = new j8.n(gVar.f298104n, eVar, j8.m.normal);
        } else {
            io.flutter.Log.i("NDOP", "listening using window listener");
            gVar.f298103m = new j8.j(gVar.f298099f, gVar.f298104n, eVar);
        }
        gVar.f298103m.a();
    }
}
