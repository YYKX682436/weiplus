package ek2;

/* loaded from: classes.dex */
public final class t2 extends ek2.g0 {
    public t2(ek2.s2 s2Var) {
        super(null, 1, null);
        r45.ae2 ae2Var = new r45.ae2();
        ae2Var.set(1, db2.t4.f228171a.a(5231));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ae2Var;
        r45.be2 be2Var = new r45.be2();
        be2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) be2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = be2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveverify";
        lVar.f70667d = 5231;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveVerify", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.be2 resp = (r45.be2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveVerify", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_VERIFY_BOOLEAN_SYNC, java.lang.Boolean.valueOf(resp.getBoolean(1)));
    }
}
