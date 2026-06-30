package db2;

/* loaded from: classes2.dex */
public final class n4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final long f228099t;

    public /* synthetic */ n4(long j17, java.lang.String str, java.lang.String str2, int i17, r45.qt2 qt2Var, int i18, kotlin.jvm.internal.i iVar) {
        this(j17, str, str2, (i18 & 8) != 0 ? 0 : i17, qt2Var);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.tj4 resp = (r45.tj4) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(long j17, java.lang.String username, java.lang.String videoNonceId, int i17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(videoNonceId, "videoNonceId");
        this.f228099t = j17;
        r45.sj4 sj4Var = new r45.sj4();
        r45.pj4 pj4Var = new r45.pj4();
        pj4Var.set(0, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0)));
        if (qt2Var != null) {
            pj4Var.set(1, java.lang.Integer.valueOf(qt2Var.getInteger(5)));
        }
        sj4Var.set(1, pj4Var);
        sj4Var.set(2, java.lang.Long.valueOf(j17));
        sj4Var.set(3, username);
        sj4Var.set(4, videoNonceId);
        sj4Var.set(6, java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/megavideodetail";
        lVar.f70667d = 4195;
        lVar.f70664a = sj4Var;
        lVar.f70665b = new r45.tj4();
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiMegaVideoGetDetail", "videoId " + j17 + " username " + username);
    }
}
