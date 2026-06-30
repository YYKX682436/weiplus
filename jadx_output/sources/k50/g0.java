package k50;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k50.g0 f304214a = new k50.g0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f304215b = jz5.h.b(k50.d0.f304201d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f304216c = kz5.c1.k(new jz5.l(k50.o0.f304243d, 1), new jz5.l(k50.o0.f304245f, 2), new jz5.l(k50.o0.f304244e, 3));

    public final long a(k50.o0 o0Var) {
        java.lang.String str = "forward_other_apps_last_used_" + o0Var.name();
        java.lang.Object value = ((jz5.n) f304215b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return ((com.tencent.mm.sdk.platformtools.o4) value).q(str, 0L);
    }

    public final void b(k50.o0 app) {
        kotlin.jvm.internal.o.g(app, "app");
        java.lang.String str = "forward_other_apps_last_used_" + app.name();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object value = ((jz5.n) f304215b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.sdk.platformtools.o4) value).B(str, currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.Forward.OtherAppsOrder", "recordUsage: " + app.name() + ", time=" + currentTimeMillis);
    }

    public final void c(java.util.List list, yz5.l appSelector) {
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(appSelector, "appSelector");
        java.util.Collection collection = k50.o0.f304248i;
        boolean z17 = false;
        if (!(collection instanceof java.util.Collection) || !((kz5.b) collection).isEmpty()) {
            java.util.Iterator it = ((kz5.h) collection).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (f304214a.a((k50.o0) it.next()) > 0) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            kz5.g0.t(list, new k50.f0(appSelector));
        } else if (list.size() > 1) {
            kz5.g0.t(list, new k50.e0(appSelector));
        }
    }
}
