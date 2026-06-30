package np3;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f338801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f338802e;

    public i(np3.j jVar, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        this.f338801d = map;
        this.f338802e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f338801d;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.pat.fromusername");
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.pat.chatusername");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.pat.pattedusername");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.pat.template");
        com.tencent.mars.xlog.Log.i("PatMsgListener", "fromUser: %s, chatUser: %s, pattedUser: %s, template:%s", str, str2, str3, str4);
        if (((lp3.r) i95.n0.c(lp3.r.class)).Di()) {
            com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            com.tencent.mm.modelbase.p0 p0Var = this.f338802e;
            if (cj6.X9(p0Var.f70726a.f377568r)) {
                com.tencent.mars.xlog.Log.w("PatMsgListener", "ignore insert, msg %d should be deleted!", java.lang.Long.valueOf(p0Var.f70726a.f377568r));
                return;
            }
            lp3.l lVar = (lp3.l) i95.n0.c(lp3.l.class);
            r45.j4 j4Var = p0Var.f70726a;
            lVar.fj(str2, str, str3, str4, j4Var.f377565o, j4Var.f377568r);
        }
    }
}
