package ev2;

/* loaded from: classes10.dex */
public final class a implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ev2.c f256898a;

    public a(ev2.c cVar) {
        this.f256898a = cVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        ev2.d task = (ev2.d) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        ev2.c cVar = ev2.c.f256900c;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusActionManager", "task callback " + status);
        if (status != fp0.u.f265290f) {
            ev2.c cVar2 = this.f256898a;
            com.tencent.mm.sdk.platformtools.u3.l(cVar2.f256902b);
            com.tencent.mm.sdk.platformtools.u3.i(cVar2.f256902b, u04.d.f423477c);
        }
    }
}
