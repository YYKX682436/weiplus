package vs1;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ us1.b f439863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ us1.a f439864e;

    public c(us1.b bVar, us1.a aVar) {
        this.f439863d = bVar;
        this.f439864e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a;
        us1.b bVar = this.f439863d;
        ws1.d.a(t2Var.c(bVar.f430460a, bVar.f430461b), new vs1.b(bVar, this.f439864e));
    }
}
