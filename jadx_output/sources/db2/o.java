package db2;

/* loaded from: classes.dex */
public final class o extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228103t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String userName, java.lang.String noticeId, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        this.f228103t = "Finder.CgiFinderAdLiveNotice";
        r45.rt0 rt0Var = new r45.rt0();
        rt0Var.set(2, userName);
        rt0Var.set(1, noticeId);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = rt0Var;
        r45.st0 st0Var = new r45.st0();
        st0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) st0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = st0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderadlivenotice";
        lVar.f70667d = 4164;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderAdLiveNotice", "init userName:" + userName + ", noticeId:" + noticeId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.st0 resp = (r45.st0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ';
        java.lang.String str3 = this.f228103t;
        com.tencent.mars.xlog.Log.i(str3, str2);
        if (i17 == 0 && i18 == 0 && resp.getInteger(2) > 0) {
            ((vd2.j1) ((zy2.x7) i95.n0.c(zy2.x7.class))).f435770d = resp.getInteger(2);
            com.tencent.mars.xlog.Log.i(str3, "requestInterval " + resp.getInteger(2));
        }
    }
}
