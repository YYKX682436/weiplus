package fa3;

/* loaded from: classes8.dex */
public final class p implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f260776d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260777e;

    /* renamed from: f, reason: collision with root package name */
    public long f260778f;

    /* renamed from: g, reason: collision with root package name */
    public long f260779g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f260780h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f260781i;

    /* renamed from: m, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f260782m;

    /* renamed from: n, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry f260783n;

    public p(android.content.Context context, int i17, java.util.Map map, io.flutter.plugin.common.MethodChannel methodChannel, io.flutter.view.TextureRegistry registry) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(registry, "registry");
        this.f260777e = "";
        this.f260778f = -1L;
        this.f260779g = -1L;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f260780h = context;
        this.f260781i = map;
        this.f260782m = methodChannel;
        this.f260783n = registry;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dp8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f260776d = (android.view.ViewGroup) inflate;
        a();
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(this);
        }
    }

    public final void a() {
        java.util.Map map = this.f260781i;
        if (map != null) {
            if (map.containsKey("appId")) {
                this.f260777e = java.lang.String.valueOf(map.get("appId"));
            }
            if (map.containsKey("appUuid")) {
                this.f260778f = java.lang.Long.parseLong(java.lang.String.valueOf(map.get("appUuid")));
            }
            if (map.containsKey("pageId")) {
                this.f260779g = java.lang.Long.parseLong(java.lang.String.valueOf(map.get("pageId")));
            }
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.content.Context context = this.f260780h;
        if (context == null) {
            kotlin.jvm.internal.o.o("mContext");
            throw null;
        }
        java.lang.String str = this.f260777e;
        long j17 = this.f260778f;
        long j18 = this.f260779g;
        android.view.ViewGroup viewGroup = this.f260776d;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("view");
            throw null;
        }
        io.flutter.view.TextureRegistry textureRegistry = this.f260783n;
        if (textureRegistry == null) {
            kotlin.jvm.internal.o.o("mRegistry");
            throw null;
        }
        java.util.Map map2 = this.f260781i;
        fa3.o oVar = new fa3.o(this);
        com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) g0Var;
        iVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.feature.lite.y0(iVar, false, j17, str, j18, context, viewGroup, textureRegistry, map2, oVar));
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraView", "dispose");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f260776d;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("view");
        throw null;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewAttached(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraView", "onFlutterViewAttached");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewDetached() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraView", "onFlutterViewDetached");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onInputConnectionLocked() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraView", "onInputConnectionLocked");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onInputConnectionUnlocked() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraView", "onInputConnectionUnlocked");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(result, "result");
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.lang.String str = methodCall.method;
        java.util.Map map = (java.util.Map) methodCall.arguments;
        if (kotlin.jvm.internal.o.b(str, "resumeCamera")) {
            a();
            return;
        }
        com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) g0Var;
        iVar.Ri(this.f260778f, this.f260779g, str, map, new fa3.n(new kotlin.jvm.internal.c0(), result, this));
    }
}
