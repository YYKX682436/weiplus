package nd2;

/* loaded from: classes10.dex */
public final class q extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f336466a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f336467b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f336468c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f336469d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi f336470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(io.flutter.plugin.common.BinaryMessenger binaryMessenger, android.content.Context context) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        this.f336466a = binaryMessenger;
        this.f336467b = context;
        this.f336468c = new java.util.concurrent.ConcurrentHashMap();
        this.f336469d = new java.util.concurrent.ConcurrentHashMap();
        this.f336470e = new nd2.p(this);
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "create viewId=" + i17 + " args=" + obj);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f336468c;
        long j17 = (long) i17;
        nd2.o oVar = (nd2.o) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            return oVar;
        }
        com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEventCallback liveCDNPlayerEventCallback = new com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEventCallback(this.f336466a, java.lang.String.valueOf(i17));
        this.f336469d.put(java.lang.Long.valueOf(j17), liveCDNPlayerEventCallback);
        if (context == null && (context = this.f336467b) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context2 = context;
        kotlin.jvm.internal.o.d(context2);
        nd2.o oVar2 = new nd2.o(context2, j17, obj, liveCDNPlayerEventCallback);
        concurrentHashMap.put(java.lang.Long.valueOf(j17), oVar2);
        return oVar2;
    }
}
