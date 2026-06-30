package fe1;

/* loaded from: classes15.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f261501b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f261502a;

    public v(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f261502a = appId;
        com.tencent.mm.plugin.appbrand.x0.a(appId, new fe1.u(this));
    }
}
