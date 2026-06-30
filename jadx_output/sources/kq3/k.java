package kq3;

/* loaded from: classes12.dex */
public class k extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kq3.l f311277a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kq3.l lVar, java.lang.String str) {
        super(str);
        this.f311277a = lVar;
        setLogging(false);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        try {
            int i17 = message.what;
            if (i17 != 0) {
                if (i17 == 1) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    tq3.a aVar = (tq3.a) message.obj;
                    try {
                        aVar.run();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Priority.PriorityTaskRunner", e17, "MESSAGE_ONCE_RUN_TASK %s", aVar.a());
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityTaskRunner", "Once Run Task %s Use Time %d", aVar.a(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    return;
                }
                if (i17 != 2) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Priority.PriorityTaskRunner", "msg.what = " + message.what);
                    return;
                } else {
                    kq3.k kVar = this.f311277a.f311279b;
                    if (kVar != null) {
                        kVar.removeMessages(2);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityTaskRunner", "MESSAGE_PRE_DOWNLOAD_CHECK");
                    ((ku5.t0) ku5.t0.f312615d).g(new oq3.f(((fq3.n) i95.n0.c(fq3.n.class)).bj()));
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityTaskRunner", "priority runner tick");
            kq3.k kVar2 = this.f311277a.f311279b;
            if (kVar2 != null) {
                kVar2.removeMessages(0);
            }
            kq3.k kVar3 = this.f311277a.f311279b;
            if (kVar3 != null) {
                kVar3.sendEmptyMessageDelayed(0, u04.d.f423477c);
            }
            if (!((fq3.n) i95.n0.c(fq3.n.class)).f265540y.c() && ((fq3.n) i95.n0.c(fq3.n.class)).f265540y.b()) {
                ((fq3.n) i95.n0.c(fq3.n.class)).f265540y.d();
            }
            ((fq3.n) i95.n0.c(fq3.n.class)).requireAccountInitialized();
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(r11.f265541z.f338992d))) {
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.requireAccountInitialized();
                if (nVar.f265541z.a()) {
                    fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar2.requireAccountInitialized();
                    nVar2.f265541z.c();
                }
            }
            if (tq3.c.c()) {
                this.f311277a.a(new tq3.c());
            }
            ((yk.h) ((pt0.p) i95.n0.c(pt0.p.class))).wi(null, false);
            kq3.l lVar = this.f311277a;
            lVar.getClass();
            ((ku5.t0) ku5.t0.f312615d).g(new kq3.j(lVar));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Priority.PriorityTaskRunner", e18, "handle priority msg", new java.lang.Object[0]);
        }
    }
}
