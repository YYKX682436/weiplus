package zs1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs1.d f475240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475243g;

    public f(zs1.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f475240d = dVar;
        this.f475241e = str;
        this.f475242f = str2;
        this.f475243g = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f475241e;
        zs1.d dVar = this.f475240d;
        java.lang.String str2 = dVar.f475236a;
        nu4.b bVar = nu4.b0.Q;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a;
        ts1.o oVar = new ts1.o(str2, str, bVar, com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94448d, null, null, null, null, false, null, null, 2032, null);
        ws1.d.a(t2Var.c(dVar.f475236a, oVar), new zs1.e(this.f475242f, this.f475243g, oVar));
    }
}
