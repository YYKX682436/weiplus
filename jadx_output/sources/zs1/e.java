package zs1;

/* loaded from: classes7.dex */
public final class e extends xs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ts1.o f475239c;

    public e(java.lang.String str, java.lang.String str2, ts1.o oVar) {
        this.f475237a = str;
        this.f475238b = str2;
        this.f475239c = oVar;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        com.tencent.mm.network.j2 connection = (com.tencent.mm.network.j2) obj;
        kotlin.jvm.internal.o.g(connection, "connection");
        kotlin.jvm.internal.o.g(headers, "headers");
        com.tencent.mm.plugin.brandservice.webprefetcher.debug.b.c(headers, "fetchRes");
        if (i17 != 200) {
            return false;
        }
        ts1.o oVar = this.f475239c;
        oVar.l().putAll(headers);
        oVar.l().put("status", kz5.b0.c(java.lang.String.valueOf(i17)));
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2 f17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f(headers);
        if (f17 == com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94225m) {
            f17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.e2.f94220e;
        }
        oVar.z(f17, this.f475237a);
        return true;
    }

    @Override // xs1.b
    public void c(java.lang.Object obj) {
        com.tencent.mm.network.j2 connection = (com.tencent.mm.network.j2) obj;
        kotlin.jvm.internal.o.g(connection, "connection");
        java.lang.String str = this.f475237a;
        if (str.length() > 0) {
            java.lang.String str2 = this.f475238b;
            if (str2.length() > 0) {
                connection.h(ya.b.ORIGIN, r26.i0.y(str2, "https", false) ? "https://".concat(str) : "http://".concat(str));
                connection.h("referer", str2);
            }
        }
    }
}
