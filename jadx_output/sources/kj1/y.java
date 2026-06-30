package kj1;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final kj1.y f308382d = new kj1.y();

    public y() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        kotlin.jvm.internal.o.d(a17);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17.getBoolean("last_appbrand_switch_short_link_highlight", false));
        valueOf.booleanValue();
        return valueOf;
    }
}
