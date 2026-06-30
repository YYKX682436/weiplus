package j8;

/* loaded from: classes15.dex */
public class d implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j8.g f298094d;

    public d(j8.g gVar) {
        this.f298094d = gVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        java.lang.String str = methodCall.method;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -2079769446:
                if (str.equals("getOrientation")) {
                    c17 = 0;
                    break;
                }
                break;
            case -934426579:
                if (str.equals("resume")) {
                    c17 = 1;
                    break;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        j8.g gVar = this.f298094d;
        switch (c17) {
            case 0:
                java.lang.Boolean bool = (java.lang.Boolean) methodCall.argument("useSensor");
                if (bool == null || !bool.booleanValue()) {
                    result.success(gVar.f298099f.a().name());
                    return;
                }
                j8.o oVar = gVar.f298100g;
                ((java.util.LinkedList) oVar.f298130b).add(new j8.c(this, result));
                if (oVar.f298131c != null) {
                    return;
                }
                j8.n nVar = new j8.n(oVar.f298129a, oVar, j8.m.fastest);
                oVar.f298131c = nVar;
                nVar.a();
                return;
            case 1:
                j8.b bVar = gVar.f298103m;
                if (bVar != null) {
                    bVar.a();
                }
                result.success(null);
                return;
            case 2:
                j8.b bVar2 = gVar.f298103m;
                if (bVar2 != null) {
                    bVar2.b();
                }
                result.success(null);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
