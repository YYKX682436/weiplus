package ev2;

/* loaded from: classes10.dex */
public final class f implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ev2.h f256908a;

    public f(ev2.h hVar) {
        this.f256908a = hVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        ev2.i task = (ev2.i) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        ev2.h hVar = ev2.h.f256910c;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.ActionManager", "task callback " + status);
        if (status != fp0.u.f265290f) {
            ev2.h hVar2 = this.f256908a;
            com.tencent.mm.sdk.platformtools.u3.l(hVar2.f256912b);
            com.tencent.mm.sdk.platformtools.u3.i(hVar2.f256912b, nv2.a.f340431a);
        }
    }
}
