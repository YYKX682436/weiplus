package db2;

/* loaded from: classes.dex */
public final class e2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f227955t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(long j17, long j18, java.lang.String nonceId, java.lang.String invitation_id, int i17) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(invitation_id, "invitation_id");
        this.f227955t = "Finder.CgiFinderLiveRespondGameInvitation";
        r45.v72 v72Var = new r45.v72();
        v72Var.set(1, db2.t4.f228171a.a(6625));
        v72Var.set(3, java.lang.Long.valueOf(j17));
        v72Var.set(2, java.lang.Long.valueOf(j18));
        v72Var.set(4, nonceId);
        v72Var.set(6, invitation_id);
        v72Var.set(5, java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = v72Var;
        r45.w72 w72Var = new r45.w72();
        w72Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) w72Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = w72Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliverespondgameinvitation";
        lVar.f70667d = 6625;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveRespondGameInvitation", "init feedId:" + j17 + ", liveId:" + j18 + ", object_nonce_id:" + nonceId + ", linvitation_id:" + invitation_id);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.w72 resp = (r45.w72) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227955t, "ljd [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
