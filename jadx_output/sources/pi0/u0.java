package pi0;

/* loaded from: classes11.dex */
public final class u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final pi0.t0 f354729f = new pi0.t0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f354730a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.FlutterEngine f354731b;

    /* renamed from: c, reason: collision with root package name */
    public long f354732c;

    /* renamed from: d, reason: collision with root package name */
    public long f354733d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f354734e;

    public u0(java.lang.String engineKey, io.flutter.embedding.engine.FlutterEngine engine) {
        kotlin.jvm.internal.o.g(engineKey, "engineKey");
        kotlin.jvm.internal.o.g(engine, "engine");
        this.f354730a = engineKey;
        this.f354731b = engine;
        io.flutter.embedding.engine.dart.DartExecutor dartExecutor = engine.getDartExecutor();
        kotlin.jvm.internal.o.f(dartExecutor, "getDartExecutor(...)");
        new io.flutter.plugin.common.BasicMessageChannel(dartExecutor, "mmflutter/app_foreground_state", io.flutter.plugin.common.StringCodec.INSTANCE);
    }
}
