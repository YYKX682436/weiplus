package u85;

/* loaded from: classes10.dex */
public final class f implements fp0.p {
    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        java.lang.String a17 = task.f425719f.a();
        boolean z17 = status == fp0.u.f265290f;
        u85.i iVar = u85.i.f425707a;
        com.tencent.mars.xlog.Log.i("MicroMsg.StickerFileManager", "onLoaderFin: " + a17 + ", " + z17);
        if (((u85.o) u85.i.f425714h.remove(a17)) == null || !((km0.c) gm0.j1.p().a()).a()) {
            return;
        }
        new android.content.Intent();
    }
}
