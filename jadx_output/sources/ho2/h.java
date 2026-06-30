package ho2;

/* loaded from: classes2.dex */
public final class h extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final int f282869t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f282870u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, java.lang.String myUsername, java.lang.String authorFinderUsername, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.lang.String clientId) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(myUsername, "myUsername");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        kotlin.jvm.internal.o.g(clientId, "clientId");
        this.f282869t = i17;
        this.f282870u = finderItem;
        new r45.eg2();
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
        r45.eg2 eg2Var = new r45.eg2();
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        fo3.s sVar = fo3.s.INSTANCE;
        cu5Var.d(sVar.Ci("ce_feed_publish"));
        k57Var.f378395e = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.h());
        k57Var.f378396f = cu5Var2;
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 b17 = t4Var.b(7945, this.f16135n);
        eg2Var.f373429d = b17;
        b17.set(2, new com.tencent.mm.protobuf.g(k57Var.toByteArray()));
        eg2Var.f373439q = clientId;
        eg2Var.f373430e = finderItem.getFeedObject().getObjectDesc();
        eg2Var.f373431f = myUsername;
        eg2Var.f373433h = feedObject.getId();
        eg2Var.f373432g = authorFinderUsername;
        eg2Var.f373429d = t4Var.a(7945);
        eg2Var.f373438p = i17;
        eg2Var.f373440r = java.lang.System.currentTimeMillis();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = eg2Var;
        r45.fg2 fg2Var = new r45.fg2();
        fg2Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = fg2Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = fg2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findermemberqaoprqa";
        lVar.f70667d = 7945;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.fg2 resp = (r45.fg2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f282870u;
            int i19 = this.f282869t;
            if (i19 == 101 || i19 == 102 || i19 == 104) {
                cu2.u.f222441a.b(finderItem.getId());
                long id6 = finderItem.getId();
                if (id6 != 0) {
                    com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = new com.tencent.mm.autogen.events.FeedDeleteEvent();
                    feedDeleteEvent.f54247g.f6437a = id6;
                    feedDeleteEvent.e();
                }
            } else if (i19 == 5) {
                finderItem.getFeedObject().setStickyTime(c01.id.e());
            } else if (i19 == 105) {
                finderItem.getFeedObject().setStickyTime(0);
            }
        }
        com.tencent.mars.xlog.Log.i("Cgi.FinderMemberQAOprQACgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
