package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class n2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164482d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164483e;

    /* renamed from: f, reason: collision with root package name */
    public final int f164484f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.l76 f164485g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164486h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f164487i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f164488m;

    /* renamed from: n, reason: collision with root package name */
    public final int f164489n;

    /* renamed from: o, reason: collision with root package name */
    public final ta4.x0 f164490o;

    /* renamed from: p, reason: collision with root package name */
    public int f164491p;

    public n2(r45.l76 l76Var, java.lang.String str, int i17) {
        java.lang.String str2;
        int i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.f86();
        lVar.f70665b = new r45.g86();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnscomment";
        lVar.f70667d = 213;
        lVar.f70668e = 100;
        lVar.f70669f = 1000000100;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164482d = a17;
        r45.f86 f86Var = (r45.f86) a17.f70710a.f70684a;
        f86Var.f374100d = l76Var;
        r45.k76 k76Var = l76Var.f379205f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildClientCtxReportBuffer", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        try {
            cl0.g gVar = new cl0.g();
            gVar.o("comment_scene", i17 == 0 ? 1 : i17 == 1 ? 2 : 0);
            if (k76Var != null) {
                int i19 = k76Var.f378466o;
                if (i19 > 0) {
                    gVar.o("replytoCommentId", i19);
                } else {
                    long j17 = k76Var.f378469r;
                    if (j17 > 0) {
                        gVar.p("replytoCommentId", j17);
                    }
                }
            }
            str2 = gVar.toString().replace(",", ";");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildClientCtxReportBuffer", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        } catch (cl0.f unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildClientCtxReportBuffer", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            str2 = "";
        }
        f86Var.f374105i = str2;
        java.util.HashMap hashMap = ya4.b.f460608a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        java.util.HashMap hashMap2 = ya4.b.f460608a;
        ya4.a aVar = (ya4.a) hashMap2.get(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentState", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        if (aVar != null) {
            int i27 = aVar.f460606a;
            int i28 = i27 & 4;
            if (i28 == 0 && (i27 & 8) == 0) {
                int i29 = i27 & 16;
                if (i29 == 0 && (i27 & 32) == 0) {
                    i18 = 0;
                } else {
                    i18 = i29 != 0 ? 4 : 5;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsComment", "has paste similar change flag, %d", java.lang.Integer.valueOf(i18));
                }
            } else {
                i18 = i28 != 0 ? 2 : 3;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsComment", "has paste fully flag, %d", java.lang.Integer.valueOf(i18));
            }
            f86Var.f374103g = ca4.z0.i(i18, aVar.f460607b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
            hashMap2.remove(2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetStateByScene", "com.tencent.mm.plugin.sns.statesave.SnsCopyStateSave");
        }
        int i37 = l76Var.f379205f.f378462h;
        this.f164484f = i37;
        this.f164485g = l76Var;
        this.f164489n = i17;
        f86Var.f374101e = str;
        this.f164483e = str;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.NetSceneSnsComment", "from:" + l76Var.f379205f.f378458d + " to:" + l76Var.f379205f.f378459e + " type:" + l76Var.f379205f.f378462h, new java.lang.Object[0]);
        this.f164490o = ta4.x0.f416851j.a();
        if (i37 == 1) {
            yc4.b0 b0Var = yc4.b0.f460839a;
            java.lang.String feedId = ca4.z0.t0(l76Var.f379203d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFeedLike", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            kotlin.jvm.internal.o.g(feedId, "feedId");
            yc4.v vVar = yc4.b0.f460842d;
            if (vVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedLikeMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedLikeMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                java.util.HashMap hashMap3 = vVar.f460877d;
                if (hashMap3 != null) {
                    java.lang.Integer num = (java.lang.Integer) hashMap3.get(feedId);
                    hashMap3.put(feedId, java.lang.Integer.valueOf((num == null ? 0 : num).intValue() + 1));
                    java.util.Objects.toString(hashMap3.get(feedId));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedLike", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    return;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedLike", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            return;
        }
        if (i37 == 2) {
            yc4.b0 b0Var2 = yc4.b0.f460839a;
            java.lang.String feedId2 = ca4.z0.t0(l76Var.f379203d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFeedComment", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            kotlin.jvm.internal.o.g(feedId2, "feedId");
            yc4.v vVar2 = yc4.b0.f460842d;
            if (vVar2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedCommentMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedCommentMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
                java.util.HashMap hashMap4 = vVar2.f460878e;
                if (hashMap4 != null) {
                    java.lang.Integer num2 = (java.lang.Integer) hashMap4.get(feedId2);
                    hashMap4.put(feedId2, java.lang.Integer.valueOf((num2 == null ? 0 : num2).intValue() + 1));
                    java.util.Objects.toString(hashMap4.get(feedId2));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedComment", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    return;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedComment", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        }
    }

    public final void H(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mergeGroupData", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = this.f164488m;
        if (snsObject2 != null) {
            snsObject.GroupCount = snsObject2.GroupCount;
            snsObject.GroupList = snsObject2.GroupList;
            snsObject.GroupContactTagIdListCount = snsObject2.GroupContactTagIdListCount;
            snsObject.GroupContactTagIdList = snsObject2.GroupContactTagIdList;
            snsObject.BlackListCount = snsObject2.BlackListCount;
            snsObject.BlackList = snsObject2.BlackList;
            snsObject.BlackContactTagIdListCount = snsObject2.BlackContactTagIdListCount;
            snsObject.BlackContactTagIdList = snsObject2.BlackContactTagIdList;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mergeGroupData", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
    }

    public final void I(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report27790", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        ta4.x0 x0Var = this.f164490o;
        if (x0Var != null) {
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            x0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            kotlin.jvm.internal.o.g(valueOf, "<set-?>");
            x0Var.f416855c = valueOf;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            x0Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report27790", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        r45.l76 l76Var = this.f164485g;
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = Fj.W0(l76Var.f379203d);
        if (W0 == null && (y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(l76Var.f379203d)) != null) {
            W0 = y07.convertToSnsInfo();
        }
        com.tencent.mm.modelbase.o oVar = this.f164482d;
        if (W0 != null) {
            try {
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(W0.field_attrBuf);
                r45.cu5 cu5Var = snsObject.ObjectOperations;
                if (cu5Var != null && cu5Var.f371842g) {
                    r45.u96 u96Var = (r45.u96) new r45.u96().parseFrom(snsObject.ObjectOperations.f371841f.f192156a);
                    r45.f86 f86Var = (r45.f86) oVar.f70710a.f70684a;
                    r45.xb5 xb5Var = u96Var.f387162h;
                    if (xb5Var != null) {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, "preloadLayerId=%d&preloadExpId=%d", java.lang.Integer.valueOf(xb5Var.f389945d), java.lang.Integer.valueOf(u96Var.f387162h.f389946e));
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsComment", "doScene(sight_autodownload) snsStatExt:%s", format);
                        r45.du5 du5Var = new r45.du5();
                        du5Var.f372756d = format;
                        du5Var.f372757e = true;
                        f86Var.f374102f = du5Var;
                    }
                }
                this.f164488m = snsObject;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsComment", e17, "", new java.lang.Object[0]);
            }
        }
        this.f164487i = W0;
        this.f164486h = u0Var;
        int dispatch = dispatch(sVar, oVar, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        return 213;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0240 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r17, int r18, int r19, java.lang.String r20, com.tencent.mm.network.v0 r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.n2.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
