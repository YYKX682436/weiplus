package l44;

/* loaded from: classes4.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.k4 f316220a = new l44.k4();

    public static w64.x c(l44.k4 k4Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, com.tencent.mm.plugin.sns.ui.listener.i iVar, android.view.View view, java.util.List list, java.util.List list2, w64.w wVar, w64.u uVar, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createAdLandingPageJumpAnimInfo$default", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        android.view.View view2 = (i18 & 8) != 0 ? null : view;
        java.util.List list3 = (i18 & 16) != 0 ? null : list;
        java.util.List list4 = (i18 & 32) != 0 ? null : list2;
        w64.w wVar2 = (i18 & 64) != 0 ? null : wVar;
        w64.u uVar2 = (i18 & 128) != 0 ? null : uVar;
        k4Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        l44.g4 g4Var = new l44.g4(snsInfo, i17, view2, list3, list4, wVar2, iVar, uVar2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createAdLandingPageJumpAnimInfo", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createAdLandingPageJumpAnimInfo$default", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        return g4Var;
    }

    public final void a(android.view.View v17, java.lang.String str, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.model.k4 k4Var, int i17, i64.b1 b1Var, w64.n nVar, boolean z17) {
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.statistics.l a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickAdAction", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.i("ClickActionHelper", "onsight click but info is null localid %s", str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickAdAction", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        if (k4Var != null && (a17 = k4Var.a()) != null) {
            a17.e(k17);
        }
        if (k17.field_type == 18) {
            dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
            java.lang.String t07 = ca4.z0.t0(k17.field_snsId);
            kotlin.jvm.internal.o.f(t07, "longToString(...)");
            ((zy1.f) sVar).Di(12076, "ClickStreamVideoCount", t07);
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ni(12076, "BrowseForwardAdLongVideoTime");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        java.lang.String userName = k17.getUserName();
        kotlin.jvm.internal.o.f(userName, "getUserName(...)");
        java.lang.String snsId = k17.getSnsId();
        kotlin.jvm.internal.o.f(snsId, "getSnsId(...)");
        int typeFlag = k17.getTypeFlag();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        el0.i.d(userName, snsId, typeFlag);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publicClickEvent", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
        boolean isAd = k17.isAd();
        if (((timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null) ? null : a90Var.f369840h) == null || timeLineObject.ContentObj.f369840h.size() == 0) {
            com.tencent.mars.xlog.Log.e("ClickActionHelper", "the obj.ContentObj.MediaObjList is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickAdAction", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
            return;
        }
        boolean z18 = false;
        r45.jj4 jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
        if (z17) {
            if (isAd && !com.tencent.mm.plugin.sns.model.l4.hj().D(jj4Var)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1910, 3);
            }
            if (k17.isAd() && k17.getAdXml().isLandingPagesAd() && za4.z0.u(k17.getAdSnsInfo().field_adxml)) {
                z18 = true;
            }
            if (!z18 && isAd && com.tencent.mm.plugin.sns.model.l4.hj().E(jj4Var)) {
                com.tencent.mm.plugin.sns.model.l4.hj().p0(jj4Var);
                if (isAd) {
                    i64.s1.a(i64.o1.Sight, i64.n1.PlayIcon, k17, i17);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1910, 6);
            }
            if (i17 == 0) {
                m21.w.d(717);
            } else {
                m21.w.c(717);
            }
            ca4.z0.T(k17);
            k17.isAd();
            k17.getUxinfo();
            java.lang.String str2 = jj4Var.f377855d;
            if (i17 == 0) {
                m21.w.d(745);
            } else {
                m21.w.c(745);
            }
            ca4.z0.T(k17);
            k17.isAd();
            if (isAd && (!k17.getAdXml().isLandingPagesAd() || !za4.z0.u(k17.getAdSnsInfo().field_adxml))) {
                i64.s1.a(i64.o1.Sight, i64.n1.EnterFullScreen, k17, i17);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11444, 3);
        }
        if (i17 == 2) {
            k17.getAtAdInfo();
        } else {
            k17.getAdInfo();
        }
        if (nVar != null) {
            nVar.k(v17);
        } else {
            com.tencent.mars.xlog.Log.e("ClickActionHelper", "click cannot jump！！！");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickAdAction", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.View r24, android.app.Activity r25, com.tencent.mm.plugin.sns.storage.SnsInfo r26, int r27, com.tencent.mm.plugin.sns.storage.ADXml r28, i64.b1 r29, v64.d r30) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.k4.b(android.view.View, android.app.Activity, com.tencent.mm.plugin.sns.storage.SnsInfo, int, com.tencent.mm.plugin.sns.storage.ADXml, i64.b1, v64.d):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r1.getId() == com.tencent.mm.R.id.f486309kv3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149 A[EDGE_INSN: B:63:0x0149->B:26:0x0149 BREAK  A[LOOP:1: B:44:0x00db->B:60:0x0144], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r17, com.tencent.mm.plugin.sns.storage.SnsInfo r18, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r19, int r20) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.k4.d(android.view.View, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, int):void");
    }
}
