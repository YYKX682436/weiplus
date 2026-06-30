package tv2;

/* loaded from: classes10.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tv2.o f422321a;

    public n(tv2.o oVar) {
        this.f422321a = oVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostConfirmStage", "[postConfirm] errType=" + fVar.f70615a + " errCode=" + fVar.f70616b + " errMsg=" + fVar.f70617c);
        int i17 = fVar.f70615a;
        tv2.o oVar = this.f422321a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.report.p2.f125237a.c(oVar.f422322h);
            mv2.f0 f0Var = mv2.f0.f331561a;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.np2) fVar.f70618d).getCustom(1);
            java.lang.String string = ((r45.np2) fVar.f70618d).getString(3);
            if (string == null) {
                string = "";
            }
            f0Var.q(oVar.f422322h, finderObject, string, 1);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.np2) fVar.f70618d).getCustom(1);
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(finderObject2 != null ? finderObject2.getId() : 0L);
            if (h17 != null && (finderFeedReportObject2 = h17.field_reportObject) != null) {
                finderFeedReportObject2.setPostTaskCost(finderFeedReportObject2.getPostTaskCost() + ((int) oVar.g()));
            }
            if (h17 != null && (finderFeedReportObject = h17.field_reportObject) != null) {
                hc2.p0.b(finderFeedReportObject, "postSuccess");
            }
            ov2.e.i(oVar, "andr_Cgi_Confirm_Suc", oVar.f422322h, 0, null, 12, null);
        } else {
            int i18 = fVar.f70616b;
            if (i18 == -4302 || i18 == -4301) {
                cu2.u.f222441a.c(oVar.f422322h.getLocalId());
                com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = new com.tencent.mm.autogen.events.FeedDeleteEvent();
                feedDeleteEvent.f54247g.f6438b = oVar.f422322h.getLocalId();
                feedDeleteEvent.e();
            }
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            long localId = oVar.f422322h.getLocalId();
            int i19 = fVar.f70615a;
            int i27 = fVar.f70616b;
            com.tencent.mars.xlog.Log.i("Finder.FinderPostReportLogic", "savePostConfirmError " + localId + ", " + i19 + ", " + i27);
            cu2.t tVar = cu2.u.f222441a;
            com.tencent.mm.plugin.finder.storage.FinderItem f17 = tVar.f(localId);
            if (f17 != null) {
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject3 = f17.field_reportObject;
                if (finderFeedReportObject3 != null) {
                    finderFeedReportObject3.setConfirmCgiErrorType(i19);
                }
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject4 = f17.field_reportObject;
                if (finderFeedReportObject4 != null) {
                    finderFeedReportObject4.setConfirmCgiErrorCode(i27);
                }
                tVar.l(f17);
            }
            oVar.h("andr_Cgi_Confirm_Fail", oVar.f422322h, fVar.f70616b, fVar.f70617c);
        }
        oVar.f422322h.trackPost("doPostConfirmEnd");
        oVar.f422323i = new tv2.q(oVar.f422322h);
        oVar.f422324m.countDown();
        return jz5.f0.f302826a;
    }
}
