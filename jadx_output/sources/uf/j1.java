package uf;

/* loaded from: classes7.dex */
public final class j1 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f427037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.Object obj, uf.o1 o1Var) {
        super(obj);
        this.f427037b = o1Var;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        if (uf.g1.f427026a[((uf.b) obj2).ordinal()] == 1) {
            uf.o1 o1Var = this.f427037b;
            if (o1Var.f427082q) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = o1Var.f427075g;
                if (appBrandRuntime != null) {
                    appBrandRuntime.P(25, -1, o1Var.f427083r);
                }
                if (appBrandRuntime != null) {
                    appBrandRuntime.P(24, -1, o1Var.f427084s);
                }
                o1Var.getClass();
                com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, o1Var.f427085t);
                return;
            }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = o1Var.f427075g;
            if (appBrandRuntime2 != null) {
                appBrandRuntime2.B1(o1Var.f427083r);
            }
            if (appBrandRuntime2 != null) {
                appBrandRuntime2.B1(o1Var.f427084s);
            }
            o1Var.getClass();
            com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().unregisterContentObserver(o1Var.f427085t);
        }
    }
}
