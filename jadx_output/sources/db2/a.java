package db2;

/* loaded from: classes.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f227881t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, long j18, com.tencent.mm.protobuf.g liveCookies, java.lang.String comment_msg, java.lang.String finderUsername) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(liveCookies, "liveCookies");
        kotlin.jvm.internal.o.g(comment_msg, "comment_msg");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f227881t = "Finder.CgiAudienceSendCommentToReserveGame";
        r45.pb pbVar = new r45.pb();
        pbVar.set(1, db2.t4.f228171a.a(4226));
        pbVar.set(3, java.lang.Long.valueOf(j17));
        pbVar.set(4, java.lang.Long.valueOf(j18));
        pbVar.set(6, liveCookies);
        pbVar.set(5, comment_msg);
        pbVar.set(2, finderUsername);
        gk2.e eVar = dk2.ef.I;
        pbVar.set(7, java.lang.Integer.valueOf(eVar != null && ((mm2.n0) eVar.a(mm2.n0.class)).f329273r ? 16 : 2));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = pbVar;
        r45.qb qbVar = new r45.qb();
        qbVar.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) qbVar.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = qbVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/audiencesendcommenttoreservegame";
        lVar.f70667d = 4226;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiAudienceSendCommentToReserveGame", "init feedId:" + j17 + ", liveId:" + j18 + ", comment_msg:" + comment_msg + ", liveCookies size:" + liveCookies.f192156a.length);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.qb resp = (r45.qb) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227881t, "ljd [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
