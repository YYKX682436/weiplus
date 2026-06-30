package sv2;

/* loaded from: classes10.dex */
public final class q extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413343h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f413344i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f413345m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f413346n;

    /* renamed from: o, reason: collision with root package name */
    public pv2.g f413347o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f413348p;

    public /* synthetic */ q(com.tencent.mm.plugin.finder.storage.x80 x80Var, byte[] bArr, int i17, kotlin.jvm.internal.i iVar) {
        this(x80Var, (i17 & 2) != 0 ? null : bArr);
    }

    @Override // pv2.g
    public int a() {
        return 4;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // ov2.e
    public pv2.g j() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        r45.zw0 client_draft_ext_info;
        r45.q23 video_tmpl_info;
        r45.ko6 ko6Var;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413346n;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        com.tencent.mars.xlog.Log.i(this.f413345m, "start localId:" + finderItem.getLocalId() + " checkSum:" + ((objectDesc == null || (video_tmpl_info = objectDesc.getVideo_tmpl_info()) == null || (ko6Var = video_tmpl_info.f383601w) == null) ? null : ko6Var.f378884i));
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413343h;
        if (!(((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.field_localId) != null)) {
            return new sv2.c(x80Var, 1);
        }
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 23L, 1L);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 23L, 1L);
            }
        }
        finderItem.trackDraftPost("doPostScene");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(4);
        }
        cu2.o.f222430a.b(x80Var);
        java.lang.String string4 = finderItem.getPostInfo().getString(0);
        if (string4 == null || string4.length() == 0) {
            finderItem.getPostInfo().set(0, "FinderLocal_feed_" + java.lang.System.nanoTime());
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderItem.getFeedObject().getObjectDesc();
        if (((objectDesc2 == null || (client_draft_ext_info = objectDesc2.getClient_draft_ext_info()) == null) ? 0 : client_draft_ext_info.getInteger(0)) == 0) {
            r45.qo5 qo5Var = (r45.qo5) finderItem.getPostInfo().getCustom(12);
            java.lang.String string5 = qo5Var != null ? qo5Var.getString(2) : null;
            if (!(string5 == null || string5.length() == 0)) {
                r45.qo5 qo5Var2 = (r45.qo5) finderItem.getPostInfo().getCustom(12);
                java.lang.String field_username = finderItem.field_username;
                kotlin.jvm.internal.o.f(field_username, "field_username");
                new db2.k0(field_username, finderItem.getClientId(), (qo5Var2 == null || (string3 = qo5Var2.getString(2)) == null) ? "" : string3, (qo5Var2 == null || (string2 = qo5Var2.getString(0)) == null) ? "" : string2, (qo5Var2 == null || (string = qo5Var2.getString(1)) == null) ? "" : string).l().K(new sv2.o(finderItem, this));
                this.f413348p.await();
                return this.f413347o;
            }
        }
        k();
        this.f413348p.await();
        return this.f413347o;
    }

    public final boolean k() {
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue();
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413343h;
        if (intValue == 3) {
            this.f413347o = new sv2.c(x80Var, 2);
            this.f413348p.countDown();
            return false;
        }
        ov2.e.i(this, "andr_Cgi_Draft_Begin", this.f413346n, 0, null, 12, null);
        new db2.w4(x80Var.t0(), null, this.f413344i, null, 10, null).l().q(new sv2.p(this));
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.storage.x80 draftItem, byte[] bArr) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413343h = draftItem;
        this.f413344i = bArr;
        this.f413345m = "LogPost.FinderDraftPostCgiStage";
        this.f413346n = draftItem.t0();
        this.f413347o = new sv2.c(draftItem, 2);
        this.f413348p = new java.util.concurrent.CountDownLatch(1);
    }
}
