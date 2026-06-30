package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class r7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.o7 f164653d;

    public r7(com.tencent.mm.plugin.sns.model.o7 o7Var) {
        this.f164653d = o7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean z17;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.mm.plugin.sns.model.o7 o7Var = this.f164653d;
        o7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkTLE", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "checkTLE: ");
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        Fj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str2 = "select *,rowid from SnsInfo  where ";
        android.database.Cursor B = Fj.f165994d.B("select *,rowid from SnsInfo  where " + com.tencent.mm.plugin.sns.storage.f2.f165986s + " order by SnsInfo.rowid asc ", null);
        if (B.getCount() == 0) {
            B.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            B = null;
        } else {
            B.moveToFirst();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        if (B == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTLE", "com.tencent.mm.plugin.sns.model.UploadManager");
            str = "select *,rowid from SnsInfo  where ";
        } else {
            B.moveToFirst();
            while (true) {
                snsInfo.convertFrom(B);
                try {
                    r45.kj4 kj4Var = (r45.kj4) new r45.kj4().parseFrom(snsInfo.getPostBuf());
                    str = str2;
                    if (snsInfo.isTimeLimit(kj4Var.f378748n, kj4Var.f378749o)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanUploadAndPost", "com.tencent.mm.plugin.sns.model.UploadManager");
                        java.util.Iterator it = kj4Var.f378745h.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.sns.model.l4.xj().A(((r45.ec4) it.next()).f373266d);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanUploadAndPost", "com.tencent.mm.plugin.sns.model.UploadManager");
                        o7Var.m(snsInfo, 6, "snsinfo is tle");
                        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "checkTLE snsinfo localId it time limit " + snsInfo.getLocalid() + " is die ");
                    }
                } catch (java.lang.Exception unused) {
                    str = str2;
                    com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "startPost parseFrom MediaPostInfo Exception");
                    o7Var.m(snsInfo, 2, "MediaPostInfo parser error");
                }
                if (!B.moveToNext()) {
                    break;
                } else {
                    str2 = str;
                }
            }
            B.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkTLE", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "is invalid after checkTLE");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        com.tencent.mm.plugin.sns.storage.f2 Fj2 = com.tencent.mm.plugin.sns.model.l4.Fj();
        Fj2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        android.database.Cursor f17 = Fj2.f165994d.f(str + com.tencent.mm.plugin.sns.storage.f2.f165986s + " order by SnsInfo.rowid asc ", null, 2);
        if (f17.moveToFirst()) {
            snsInfo2.convertFrom(f17);
            f17.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        } else {
            f17.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            snsInfo2 = null;
        }
        if (snsInfo2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "All has post");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        if (com.tencent.mm.plugin.sns.model.l4.xj().q(snsInfo2.localid)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "checking isPosting " + snsInfo2.localid);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo2.getTimeLine();
        java.util.LinkedList linkedList = (timeLine == null || (a90Var = timeLine.ContentObj) == null) ? null : a90Var.f369840h;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
            z17 = false;
        } else {
            z17 = ((r45.jj4) linkedList.get(0)).f377856e == 8;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "checking startPost " + snsInfo2.getLocalid());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.UploadManager");
            boolean z18 = o7Var.f164558c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.UploadManager");
            if (z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.model.UploadManager");
                o7Var.f164558c = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.model.UploadManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.UploadManager");
                o7Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sdkReportShare", "com.tencent.mm.plugin.sns.model.UploadManager");
                com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
                long j17 = snsInfo2.localid;
                am.xz xzVar = updateForwardMsgIdEvent.f54918g;
                xzVar.f8409a = j17;
                xzVar.f8410b = 1;
                xzVar.f8411c = snsInfo2.getUserName();
                updateForwardMsgIdEvent.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sdkReportShare", "com.tencent.mm.plugin.sns.model.UploadManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.UploadManager");
            }
            com.tencent.mm.plugin.sns.model.o7.a(o7Var, snsInfo2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "feed is fake video " + snsInfo2.localid);
        int createTime = snsInfo2.getCreateTime();
        com.tencent.mm.plugin.sns.model.r7$$a r7__a = new com.tencent.mm.plugin.sns.model.r7$$a(this, snsInfo2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFakeVideoIsError", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        int i17 = snsInfo2.localid;
        boolean z19 = snsInfo2.getTimeLine().videoTemplate != null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkFakeVideoIsError >> localId: ");
        sb6.append(i17);
        sb6.append(", isTemplateVideo:");
        sb6.append(z19);
        sb6.append(", templateId:");
        r45.ib6 ib6Var = snsInfo2.getTimeLine().videoTemplate;
        sb6.append(ib6Var != null ? ib6Var.f376910e : null);
        sb6.append(", createTime: ");
        sb6.append(createTime);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", sb6.toString());
        com.tencent.mm.plugin.sns.model.o6 o6Var = new com.tencent.mm.plugin.sns.model.o6(r7__a, i17, createTime, z19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundVideoBasicInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        if (z19) {
            yy0.g8 g8Var = (yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class));
            g8Var.getClass();
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new yy0.a8(i17, createTime, g8Var, o6Var, null), 2, null);
        } else {
            wp4.x xVar = (wp4.x) ((n55.f) i95.n0.c(n55.f.class));
            xVar.getClass();
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new wp4.r(i17, createTime, xVar, o6Var, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundVideoBasicInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFakeVideoIsError", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
    }
}
