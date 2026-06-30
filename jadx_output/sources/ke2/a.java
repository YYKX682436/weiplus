package ke2;

/* loaded from: classes3.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306927t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f306928u;

    /* renamed from: v, reason: collision with root package name */
    public final int f306929v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f306930w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String userName, java.lang.String noticeId, int i17, r45.qt2 qt2Var, java.lang.Integer num) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        this.f306927t = userName;
        this.f306928u = noticeId;
        this.f306929v = i17;
        this.f306930w = "Finder.CgiFinderAudienceReserveLive";
        r45.ru0 ru0Var = new r45.ru0();
        db2.r4.a(ru0Var, userName, noticeId, i17, 0L, null, null, num != null ? num.intValue() : -1, 0, null, null, 0, null, null, null, 16312, null);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ru0Var;
        r45.su0 su0Var = new r45.su0();
        su0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) su0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = su0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderaudiencereservelive";
        lVar.f70667d = 6276;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderAudienceReserveLive", "init userName:" + userName + ", noticeId:" + noticeId + " ,optype:" + i17 + ", scene:" + num);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.su0 resp = (r45.su0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306930w, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        if (i17 == 0 && i18 == 0) {
            ((vd2.j1) i95.n0.c(vd2.j1.class)).wi(this.f306927t, this.f306928u, this.f306929v == 1);
            com.tencent.mm.autogen.events.FinderLiveNoticeStateEvent finderLiveNoticeStateEvent = new com.tencent.mm.autogen.events.FinderLiveNoticeStateEvent();
            finderLiveNoticeStateEvent.f54287g.getClass();
            finderLiveNoticeStateEvent.e();
        }
    }
}
