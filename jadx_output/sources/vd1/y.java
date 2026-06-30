package vd1;

/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f435622a;

    /* renamed from: b, reason: collision with root package name */
    public final int f435623b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f435624c;

    /* renamed from: d, reason: collision with root package name */
    public final vd1.l f435625d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f435626e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f435627f;

    /* renamed from: g, reason: collision with root package name */
    public int f435628g;

    public y(int i17, int i18, java.lang.String content, vd1.l priority, com.tencent.mm.plugin.appbrand.y component) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(priority, "priority");
        kotlin.jvm.internal.o.g(component, "component");
        this.f435622a = i17;
        this.f435623b = i18;
        this.f435624c = content;
        this.f435625d = priority;
        this.f435626e = new java.lang.ref.WeakReference(component);
        java.lang.String appId = component.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        this.f435627f = appId;
    }
}
