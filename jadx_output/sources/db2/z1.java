package db2;

/* loaded from: classes.dex */
public final class z1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228257t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(long j17, long j18, com.tencent.mm.protobuf.g liveCookies, java.lang.String nonceId, int i17) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(liveCookies, "liveCookies");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.f228257t = "Finder.CgiFinderLiveJoinGameTeamPrepare";
        r45.tw1 tw1Var = new r45.tw1();
        tw1Var.set(1, db2.t4.f228171a.a(6235));
        tw1Var.set(2, java.lang.Long.valueOf(j17));
        tw1Var.set(3, java.lang.Long.valueOf(j18));
        tw1Var.set(5, liveCookies);
        tw1Var.set(4, nonceId);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        tw1Var.set(6, xy2.c.e(context));
        gk2.e eVar = dk2.ef.I;
        tw1Var.set(7, java.lang.Integer.valueOf(eVar != null && ((mm2.n0) eVar.a(mm2.n0.class)).f329273r ? 16 : 2));
        tw1Var.set(8, java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = tw1Var;
        r45.uw1 uw1Var = new r45.uw1();
        uw1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) uw1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = uw1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivejoingameteamprepare";
        lVar.f70667d = 6235;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveJoinGameTeamPrepare", "init feedId:" + j17 + ", liveId:" + j18 + ", nonceId:" + nonceId + ", liveCookies size:" + liveCookies.f192156a.length);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.uw1 resp = (r45.uw1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228257t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
