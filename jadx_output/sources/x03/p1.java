package x03;

/* loaded from: classes15.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f451088a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f451089b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f451090c;

    /* renamed from: f, reason: collision with root package name */
    public x03.r1 f451093f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f451094g;

    /* renamed from: h, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry.SurfaceTextureEntry f451095h;

    /* renamed from: j, reason: collision with root package name */
    public final io.flutter.plugin.common.EventChannel f451097j;

    /* renamed from: k, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel.Result f451098k;

    /* renamed from: d, reason: collision with root package name */
    public boolean f451091d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451092e = "";

    /* renamed from: i, reason: collision with root package name */
    public final x03.d2 f451096i = new x03.d2();

    /* renamed from: l, reason: collision with root package name */
    public boolean f451099l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f451100m = false;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f451101n = new x03.f1(this);

    public p1(android.content.Context context, io.flutter.plugin.common.EventChannel eventChannel, io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, java.lang.String str, io.flutter.plugin.common.MethodChannel.Result result) {
        this.f451089b = "";
        this.f451090c = "";
        this.f451088a = context;
        this.f451097j = eventChannel;
        this.f451095h = surfaceTextureEntry;
        this.f451098k = result;
        this.f451089b = str;
        this.f451090c = str;
        eventChannel.setStreamHandler(new x03.g1(this));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("textureId", java.lang.Long.valueOf(surfaceTextureEntry.id()));
        result.success(hashMap);
    }

    public void a() {
        if (this.f451099l) {
            this.f451093f.stop();
        }
        this.f451095h.release();
        this.f451097j.setStreamHandler(null);
        android.view.Surface surface = this.f451094g;
        if (surface != null && surface.isValid()) {
            this.f451094g.release();
        }
        x03.r1 r1Var = this.f451093f;
        if (r1Var != null) {
            r1Var.release();
        }
    }

    public java.lang.String b() {
        x03.r1 r1Var = this.f451093f;
        return r1Var != null ? r1Var.getVideoPath() : "";
    }
}
