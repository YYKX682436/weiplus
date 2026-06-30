package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class i2 implements mv2.w0 {
    @Override // mv2.w0
    public void onPostErr(long j17, boolean z17) {
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.plugin.finder.storage.FinderItem f17 = cu2.u.f222441a.f(j17);
        if (f17 != null) {
            p2Var.F(f17, false);
        }
        com.tencent.mm.autogen.events.FinderPostStatusEvent finderPostStatusEvent = new com.tencent.mm.autogen.events.FinderPostStatusEvent();
        am.vc vcVar = finderPostStatusEvent.f54316g;
        vcVar.f8188a = j17;
        vcVar.f8189b = false;
        finderPostStatusEvent.e();
    }

    @Override // mv2.w0
    public void onPostFakeOk(long j17) {
    }

    @Override // mv2.w0
    public void onPostNotify(long j17, boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mm.autogen.events.FinderPostStatusEvent finderPostStatusEvent = new com.tencent.mm.autogen.events.FinderPostStatusEvent();
        am.vc vcVar = finderPostStatusEvent.f54316g;
        vcVar.f8188a = j17;
        vcVar.f8189b = false;
        finderPostStatusEvent.e();
    }

    @Override // mv2.w0
    public void onPostOk(long j17, long j18) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j18);
        if (h17 != null) {
            bg0.u uVar = (bg0.u) i95.n0.c(bg0.u.class);
            long uploadCost = h17.field_reportObject != null ? r6.getUploadCost() : 0L;
            ((ag0.m) uVar).getClass();
            com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markCdnUploadCost");
            if (com.tencent.mm.plugin.vlog.model.b0.f175562p <= 0) {
                com.tencent.mm.plugin.vlog.model.b0.f175562p = uploadCost;
            }
            ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).Bi();
            p2Var.F(h17, true);
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            o3Var.getClass();
            if (!h17.isQAFeed() && (finderFeedReportObject = h17.field_reportObject) != null) {
                com.tencent.mm.autogen.mmdata.rpt.FinderPostMentionInfoStruct finderPostMentionInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPostMentionInfoStruct();
                finderPostMentionInfoStruct.f57535d = finderPostMentionInfoStruct.b("FeedId", o3Var.Ui(h17.getId()), true);
                finderPostMentionInfoStruct.f57536e = finderPostMentionInfoStruct.b("SessionId", finderFeedReportObject.getSessionId(), true);
                finderPostMentionInfoStruct.f57537f = finderPostMentionInfoStruct.b("PostUsername", h17.getFeedObject().getUsername(), true);
                java.util.LinkedList list = h17.field_postinfo.getList(11);
                cl0.g gVar = new cl0.g();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    r45.gb4 gb4Var = (r45.gb4) it.next();
                    cl0.g gVar2 = new cl0.g();
                    gVar2.o(ya.b.INDEX, gb4Var.getInteger(6));
                    gVar2.o("type", gb4Var.getInteger(5));
                    jSONArray.put(gVar2);
                }
                gVar.h("atcontent", jSONArray);
                gVar.o("num", list.size());
                java.lang.String gVar3 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar3, "toString(...)");
                finderPostMentionInfoStruct.f57538g = finderPostMentionInfoStruct.b("mentionedDetailInfo", r26.i0.t(gVar3, ",", ";", false), true);
                finderPostMentionInfoStruct.k();
                o3Var.Zk(finderPostMentionInfoStruct);
            }
        }
        com.tencent.mm.plugin.finder.report.p2.t(p2Var, null, null, new com.tencent.mm.plugin.finder.report.j2("postSucc", null), 3, null);
        com.tencent.mm.plugin.finder.storage.FinderItem h18 = bu2.j.f24534a.h(j18);
        if (h18 != null) {
            com.tencent.mm.autogen.events.FinderPostStatusEvent finderPostStatusEvent = new com.tencent.mm.autogen.events.FinderPostStatusEvent();
            am.vc vcVar = finderPostStatusEvent.f54316g;
            vcVar.f8188a = j17;
            vcVar.f8189b = true;
            vcVar.f8190c = com.tencent.mm.plugin.finder.assist.n7.j(com.tencent.mm.plugin.finder.assist.n7.f102406a, h18, true, null, 4, null);
            finderPostStatusEvent.e();
        }
    }

    @Override // mv2.w0
    public void onPostStart(long j17) {
    }
}
