package db2;

/* loaded from: classes.dex */
public final class d4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f227943t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(long j17, long j18, com.tencent.mm.protobuf.g liveCookies, java.lang.String nonceId, java.lang.String str) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(liveCookies, "liveCookies");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.f227943t = "Finder.CgiFinderliveGetTeamupGiftPrepare";
        r45.ev1 ev1Var = new r45.ev1();
        ev1Var.set(1, db2.t4.f228171a.a(6863));
        ev1Var.set(2, java.lang.Long.valueOf(j17));
        ev1Var.set(3, java.lang.Long.valueOf(j18));
        ev1Var.set(4, liveCookies);
        ev1Var.set(5, nonceId);
        ev1Var.set(8, str == null ? "" : str);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ev1Var.set(6, xy2.c.e(context));
        gk2.e eVar = dk2.ef.I;
        ev1Var.set(7, java.lang.Integer.valueOf(eVar != null && ((mm2.n0) eVar.a(mm2.n0.class)).f329273r ? 16 : 2));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ev1Var;
        r45.fv1 fv1Var = new r45.fv1();
        fv1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fv1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = fv1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetteamupgiftprepare";
        lVar.f70667d = 6863;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderliveGetTeamupGiftPrepare", "init feedId:" + j17 + ", liveId:" + j18 + ", object_nonce_id:" + nonceId + ", reddot_id:" + str);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.fv1 resp = (r45.fv1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227943t, "ljd [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
