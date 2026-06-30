package pi0;

/* loaded from: classes11.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final pi0.i0 f354629c = new pi0.i0(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f354630d = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BasicMessageChannel f354631a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f354632b;

    public k0(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        kotlin.jvm.internal.o.g(dartExecutor, "dartExecutor");
        this.f354632b = "";
        io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(dartExecutor, "mmflutter/hybrid_nav_page_state", io.flutter.plugin.common.StringCodec.INSTANCE);
        this.f354631a = basicMessageChannel;
        basicMessageChannel.resizeChannelBuffer(10);
    }

    public final void a(java.lang.String str) {
        io.flutter.Log.i("MicroMsg.HybridNavPageStateChannel", "onMessage " + str + ' ' + this.f354632b);
        this.f354631a.send(str);
    }
}
