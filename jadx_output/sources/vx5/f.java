package vx5;

/* loaded from: classes13.dex */
public class f implements com.tencent.xweb.w {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.xweb.pinus.PSCoreWrapper f441339a;

    /* renamed from: b, reason: collision with root package name */
    public final by5.i0 f441340b = new by5.i0((java.lang.Class) null, "setValue", new java.lang.Class[0]);

    /* renamed from: c, reason: collision with root package name */
    public final by5.i0 f441341c = new by5.i0((java.lang.Class) null, "setValue", new java.lang.Class[0]);

    /* renamed from: d, reason: collision with root package name */
    public final by5.i0 f441342d = new by5.i0((java.lang.Class) null, "setValue", new java.lang.Class[0]);

    /* renamed from: e, reason: collision with root package name */
    public final by5.i0 f441343e = new by5.i0((java.lang.Class) null, "getValue", new java.lang.Class[0]);

    /* renamed from: f, reason: collision with root package name */
    public final by5.i0 f441344f = new by5.i0((java.lang.Class) null, "getBooleanValue", new java.lang.Class[0]);

    /* renamed from: g, reason: collision with root package name */
    public final by5.i0 f441345g = new by5.i0((java.lang.Class) null, "getIntegerValue", new java.lang.Class[0]);

    /* renamed from: h, reason: collision with root package name */
    public final by5.i0 f441346h = new by5.i0((java.lang.Class) null, "getStringValue", new java.lang.Class[0]);

    public final void a() {
        if (this.f441339a != null) {
            return;
        }
        if (com.tencent.xweb.pinus.PSCoreWrapper.getInstance() == null) {
            by5.c4.g("PinusPreferences", "reflectionInit, pinus core wrapper is null");
            return;
        }
        com.tencent.xweb.pinus.PSCoreWrapper pSCoreWrapper = com.tencent.xweb.pinus.PSCoreWrapper.getInstance();
        this.f441339a = pSCoreWrapper;
        java.lang.Class<?> cls = pSCoreWrapper.getClass("org.xwalk.core.internal.XWalkPreferencesBridge");
        this.f441340b.a(null, cls, "setValue", java.lang.String.class, java.lang.Boolean.TYPE);
        this.f441341c.a(null, cls, "setValue", java.lang.String.class, java.lang.Integer.TYPE);
        this.f441342d.a(null, cls, "setValue", java.lang.String.class, java.lang.String.class);
        this.f441343e.a(null, cls, "getValue", java.lang.String.class);
        this.f441344f.a(null, cls, "getBooleanValue", java.lang.String.class);
        this.f441345g.a(null, cls, "getIntegerValue", java.lang.String.class);
        this.f441346h.a(null, cls, "getStringValue", java.lang.String.class);
    }
}
