package oq3;

/* loaded from: classes12.dex */
public final class c extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final int f347376f;

    /* renamed from: g, reason: collision with root package name */
    public final int f347377g;

    /* renamed from: h, reason: collision with root package name */
    public final int f347378h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jm0.o plugin) {
        super(plugin);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f347376f = -10041;
        this.f347377g = -5103059;
        this.f347378h = com.tenpay.tsm.TSMException.ERR_ARG_IN;
    }

    public final void T6(java.lang.String msgId) {
        kotlin.jvm.internal.o.g(msgId, "msgId");
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        nVar.A.b7(msgId, 5);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: downloaded by other way, msgSvrId_type:".concat(msgId));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(com.tencent.mm.storage.f9 r32) {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq3.c.U6(com.tencent.mm.storage.f9):void");
    }

    public final void V6(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        sq3.b bVar = nVar.A;
        long msgId = msg.getMsgId();
        bVar.getClass();
        p75.m0 i17 = dm.n1.f238603w.i(java.lang.Long.valueOf(msgId));
        p75.i0 i18 = dm.n1.f238601u.i();
        i18.f352656c = "MicroMsg.C2CPreDownloadStorage";
        i18.f352657d = i17;
        for (sq3.a aVar : i18.a().k(bVar.f193147g.Q4(), sq3.a.class)) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.requireAccountInitialized();
            nVar2.B.d(msg.getMsgId(), aVar.D0(), msg.I0());
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.requireAccountInitialized();
            sq3.b bVar2 = nVar3.A;
            java.lang.String A0 = aVar.A0();
            kotlin.jvm.internal.o.f(A0, "getMsgItemId(...)");
            bVar2.X6(A0);
        }
    }

    public final void W6() {
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        pq3.j jVar = nVar.B;
        kotlin.jvm.internal.o.f(jVar, "getC2CMsgPreDownloader(...)");
        jVar.h(false);
    }

    public final void X6(java.lang.String msgItemId) {
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        pq3.j jVar = nVar.B;
        jVar.getClass();
        kotlin.jvm.internal.o.g(msgItemId, "msgItemId");
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) jVar.f357643h).getValue(), null, new pq3.g(msgItemId, jVar, null), 1, null);
    }
}
