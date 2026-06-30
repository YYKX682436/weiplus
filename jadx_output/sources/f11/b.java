package f11;

/* loaded from: classes.dex */
public class b extends com.tencent.mm.sdk.event.n {
    public b() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FontResLogic", "received CheckResUpdateCacheFileEvent when account was not ready, resType: %s, subType: %s", java.lang.Integer.valueOf(checkResUpdateCacheFileEvent.f54053g.f7759a), java.lang.Integer.valueOf(checkResUpdateCacheFileEvent.f54053g.f7760b));
            return false;
        }
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        if (r2Var.f7759a != 57 || r2Var.f7760b != 1) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FontResLogic", "download res finish, path: %s, fileVersion: %s, fileUpdated: %s", r2Var.f7761c, java.lang.Integer.valueOf(r2Var.f7762d), java.lang.Boolean.valueOf(checkResUpdateCacheFileEvent.f54053g.f7763e));
        gm0.j1.e().j(new f11.a(this, checkResUpdateCacheFileEvent));
        return false;
    }
}
