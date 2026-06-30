package ld0;

/* loaded from: classes.dex */
public final class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        am.r2 r2Var = event.f54053g;
        if (r2Var.f7759a != 97) {
            return false;
        }
        wz3.h hVar = (wz3.h) i95.n0.c(wz3.h.class);
        hVar.getClass();
        if (r2Var.f7759a != 97 || r2Var.f7760b != 1) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductModelResLogic", "download res finish, path: " + r2Var.f7761c + ", fileVersion: " + r2Var.f7762d + ", fileUpdated: " + r2Var.f7763e);
        gm0.j1.e().j(new wz3.g(hVar, event));
        hVar.f450785d.a(4);
        return false;
    }
}
