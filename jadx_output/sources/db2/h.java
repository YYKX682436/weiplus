package db2;

/* loaded from: classes2.dex */
public final class h extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final long f227996t;

    /* renamed from: u, reason: collision with root package name */
    public final long f227997u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j17, long j18, java.lang.String str, java.lang.String objectNonceId, int i17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        r45.sy0 sy0Var = new r45.sy0();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = sy0Var;
        r45.ty0 ty0Var = new r45.ty0();
        ty0Var.set(0, new r45.ie());
        lVar.f70665b = ty0Var;
        lVar.f70672i = 2000;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercomment";
        lVar.f70667d = 3906;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.CgiDeleteFinderComment", "CgiReplyFinderComment init");
        this.f227996t = j17;
        this.f227997u = j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.CgiDeleteFinderComment", "[CgiDeleteFinderComment] commentId=" + j17 + ')');
        r45.sy0 sy0Var2 = new r45.sy0();
        sy0Var2.set(4, java.lang.Long.valueOf(j17));
        sy0Var2.set(7, 1);
        sy0Var2.set(2, java.lang.Long.valueOf(j18));
        sy0Var2.set(11, objectNonceId);
        sy0Var2.set(10, java.lang.Integer.valueOf(i17));
        db2.t4 t4Var = db2.t4.f228171a;
        sy0Var2.set(12, t4Var.b(3906, qt2Var));
        sy0Var2.set(13, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j18, str, qt2Var != null ? qt2Var.getInteger(5) : 0));
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = sy0Var2;
        r45.ty0 ty0Var2 = new r45.ty0();
        ty0Var2.set(0, new r45.ie());
        lVar2.f70665b = ty0Var2;
        lVar2.f70672i = 2000;
        t4Var.h((r45.kv0) sy0Var2.getCustom(12), qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0), java.lang.Long.valueOf(j18), str)));
        lVar2.f70666c = "/cgi-bin/micromsg-bin/findercomment";
        lVar2.f70667d = 3906;
        p(lVar2.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.CgiDeleteFinderComment", "CgiReplyFinderComment init");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        bu2.j jVar;
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        r45.ty0 resp = (r45.ty0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.CgiDeleteFinderComment", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp + " thread=" + java.lang.Thread.currentThread() + " commentId=" + this.f227996t);
        if (i17 == 0 && i18 == 0 && (h17 = (jVar = bu2.j.f24534a).h(this.f227997u)) != null) {
            h17.setCommentCount(h17.getCommentCount() - 1);
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent finderExposeInfoChangeEvent = new com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent();
            long j17 = h17.field_id;
            am.cb cbVar = finderExposeInfoChangeEvent.f54272g;
            cbVar.f6343a = j17;
            cbVar.f6345c = h17.getCommentCount();
            java.util.LinkedList list = resp.getList(4);
            if (list != null && list.size() > 0) {
                h17.getCommentList().clear();
                h17.getCommentList().addAll(list);
                r45.yl2 yl2Var = new r45.yl2();
                yl2Var.set(0, h17.getCommentList());
                cbVar.f6344b = yl2Var;
            }
            finderExposeInfoChangeEvent.e();
            hc2.a0.e(h17.getCommentList(), h17.getId(), this.f227996t, "");
            jVar.n(h17, bu2.i.f24525f);
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            feedUpdateEvent.f54252g.f6918a = h17.field_id;
            feedUpdateEvent.e();
        }
    }
}
