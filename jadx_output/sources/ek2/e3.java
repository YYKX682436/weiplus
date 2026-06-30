package ek2;

/* loaded from: classes.dex */
public final class e3 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253444u;

    public e3(long j17) {
        super(null, 1, null);
        this.f253444u = "Finder.CgiGetProductReplayUrl";
        r45.qu1 qu1Var = new r45.qu1();
        qu1Var.set(1, db2.t4.f228171a.a(6613));
        qu1Var.set(2, java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = qu1Var;
        r45.ru1 ru1Var = new r45.ru1();
        ru1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ru1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ru1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetreplayurl";
        lVar.f70667d = 6613;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiGetProductReplayUrl", "init " + qu1Var.getLong(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ru1 resp = (r45.ru1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253444u, "errcode " + i18 + " , errType:" + i17);
    }
}
