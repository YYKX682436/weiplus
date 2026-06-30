package sv2;

/* loaded from: classes10.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sv2.q f413342a;

    public p(sv2.q qVar) {
        this.f413342a = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        com.tencent.mm.protobuf.f resp = fVar.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        sv2.q qVar = this.f413342a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = qVar.f413346n;
        finderItem.trackDraftPost("doPostSceneEnd");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.pp2) resp).getCustom(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svrFinderObj id:");
        sb6.append(pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
        sb6.append(", localId:");
        com.tencent.mm.plugin.finder.storage.x80 x80Var = qVar.f413343h;
        sb6.append(x80Var.field_localId);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = qVar.f413345m;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
            com.tencent.mars.xlog.Log.i(str2, "full_cover_url:" + finderMedia.getFull_cover_url() + " full_cover_url_token:" + finderMedia.getFull_cover_url_token());
        }
        cu2.o oVar = cu2.o.f222430a;
        java.util.concurrent.CountDownLatch countDownLatch = qVar.f413348p;
        if (i17 == 0 && i18 == 0 && finderObject != null) {
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.setPostTaskCost(finderFeedReportObject.getPostTaskCost() + ((int) qVar.g()));
            }
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = finderItem.field_reportObject;
            if (finderFeedReportObject2 != null) {
                hc2.p0.b(finderFeedReportObject2, "postSuccess");
            }
            com.tencent.mm.plugin.finder.report.b0.f124961a.a(x80Var);
            oVar.c(x80Var, finderObject);
            mv2.f0 f0Var = mv2.f0.f331561a;
            pm0.v.X(new mv2.u(x80Var.field_localId, finderObject.getId(), true));
            if (finderItem.getPostInfo().getLong(6) > 0) {
                long a17 = c01.id.a() - finderItem.getPostInfo().getLong(6);
                boolean isLongVideo = finderItem.isLongVideo();
                com.tencent.mm.plugin.finder.report.f0 f0Var2 = com.tencent.mm.plugin.finder.report.f0.f125015a;
                f0Var2.d(1718L, 11L, 1L, isLongVideo);
                f0Var2.d(1718L, 12L, a17, isLongVideo);
            }
            qVar.f413347o = new sv2.b(x80Var);
            countDownLatch.countDown();
            ov2.e.i(qVar, "andr_Cgi_Draft_Suc", qVar.f413346n, 0, null, 12, null);
        } else {
            com.tencent.mm.plugin.finder.report.e0 e0Var = com.tencent.mm.plugin.finder.report.e0.f125003a;
            e0Var.f(finderItem.isLongVideo());
            if (((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.field_localId) != null) {
                if (i17 == 4) {
                    x80Var.field_localFlag = (x80Var.field_localFlag | 2) & (-2);
                    oVar.b(x80Var);
                    e0Var.e(finderItem.isLongVideo());
                }
                if ((x80Var.field_localFlag & 2) != 0) {
                    com.tencent.mm.plugin.finder.report.p2.f125237a.P(x80Var.field_localId, i17, i18);
                    com.tencent.mm.plugin.finder.report.b0.f124961a.a(x80Var);
                    mv2.f0 f0Var3 = mv2.f0.f331561a;
                    pm0.v.X(new mv2.t(x80Var.field_localId, false));
                }
            } else {
                com.tencent.mars.xlog.Log.i(str2, "deleted when scene end.");
            }
            qVar.f413347o = new sv2.c(x80Var, 2);
            countDownLatch.countDown();
            qVar.h("andr_Cgi_Draft_Fail", finderItem, i18, str);
        }
        return jz5.f0.f302826a;
    }
}
