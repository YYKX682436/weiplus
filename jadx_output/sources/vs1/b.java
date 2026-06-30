package vs1;

/* loaded from: classes7.dex */
public final class b extends xs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ us1.b f439861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ us1.a f439862b;

    public b(us1.b bVar, us1.a aVar) {
        this.f439861a = bVar;
        this.f439862b = aVar;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        com.tencent.mm.network.j2 connection = (com.tencent.mm.network.j2) obj;
        kotlin.jvm.internal.o.g(connection, "connection");
        kotlin.jvm.internal.o.g(headers, "headers");
        us1.b bVar = this.f439861a;
        bVar.f430461b.l().putAll(headers);
        boolean c17 = vs1.d.f439865a.c(bVar.f430460a, bVar.f430461b, bVar.f430462c, i17);
        ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.h2) this.f439862b).a(c17, i17, headers);
        return c17;
    }

    @Override // xs1.b
    public void c(java.lang.Object obj) {
        com.tencent.mm.network.j2 connection = (com.tencent.mm.network.j2) obj;
        kotlin.jvm.internal.o.g(connection, "connection");
        java.util.Map map = this.f439861a.f430463d;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (((java.lang.CharSequence) entry.getKey()).length() > 0) {
                    entry.getKey();
                    entry.getValue();
                    connection.h((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
            }
        }
    }
}
