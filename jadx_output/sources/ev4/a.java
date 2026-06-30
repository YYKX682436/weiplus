package ev4;

/* loaded from: classes8.dex */
public final class a implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f256939d;

    /* renamed from: e, reason: collision with root package name */
    public final fv4.i f256940e;

    /* renamed from: f, reason: collision with root package name */
    public final ev4.l f256941f;

    public a(android.content.Context context, int i17, java.util.Map map, io.flutter.plugin.common.MethodChannel methodChannel) {
        this.f256939d = methodChannel;
        fv4.i iVar = new fv4.i(context, i17, map, methodChannel);
        this.f256940e = iVar;
        this.f256941f = new ev4.l(iVar);
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "init finish");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "dispose");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f256939d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        ev4.l lVar = this.f256941f;
        tg0.z1 z1Var = lVar.f256958b;
        if (z1Var != null) {
            ((ev4.k) z1Var).a();
        }
        lVar.f256958b = null;
        fv4.i iVar = this.f256940e;
        boolean z17 = iVar.f267013g;
        ev4.d dVar = iVar.f267012f;
        if (!z17) {
            fv4.i iVar2 = dVar.f256944b;
            if (iVar2 != null && (c2Var = iVar2.f267009c) != null && (h2Var = c2Var.f419053h) != null) {
                ((ch0.h0) h2Var).b("clearSearchResultInFlutter", new org.json.JSONObject());
            }
            tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
            if (l1Var != null) {
                tg0.c2 c2Var2 = iVar.f267009c;
                ((yg0.o3) l1Var).hj(c2Var2 != null ? c2Var2.f419056k : 0, false, c2Var2 != null ? c2Var2.f419050e : null, c2Var2 != null ? c2Var2.f419054i : null);
            }
        }
        iVar.f267008b.a();
        dVar.f256944b = null;
        iVar.f267009c = null;
        iVar.f267010d = null;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f256940e.f267008b.b();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewAttached(android.view.View flutterView) {
        kotlin.jvm.internal.o.g(flutterView, "flutterView");
        fv4.i iVar = this.f256940e;
        iVar.getClass();
        iVar.f267011e = flutterView;
        iVar.f267008b.h(flutterView);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        fv4.i iVar;
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        ev4.d dVar = this.f256940e.f267012f;
        if (dVar == null || (iVar = dVar.f256944b) == null) {
            return;
        }
        iVar.f267008b.c(call, result);
    }
}
