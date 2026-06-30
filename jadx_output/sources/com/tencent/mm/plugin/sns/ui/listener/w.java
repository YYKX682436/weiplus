package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class w implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f169858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.x f169859b;

    public w(com.tencent.mm.plugin.sns.ui.listener.x xVar, android.view.View view) {
        this.f169859b = xVar;
        this.f169858a = view;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        boolean z18;
        boolean z19;
        r45.a90 a90Var;
        r45.kv2 kv2Var;
        r45.a90 a90Var2;
        r45.kv2 kv2Var2;
        r45.a90 a90Var3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
        android.view.View view = this.f169858a;
        if (!(view.getTag() instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        java.lang.String str2 = (java.lang.String) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "onItemDelClick:" + str2);
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str2);
        if (k17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        boolean isDieItem = k17.isDieItem();
        com.tencent.mm.plugin.sns.ui.listener.x xVar = this.f169859b;
        if (isDieItem) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "dead item");
            com.tencent.mm.plugin.sns.model.l4.Fj().L0(k17.localid);
            com.tencent.mm.plugin.sns.ui.listener.i iVar = xVar.f169861d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            iVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            if (com.tencent.mm.plugin.sns.ui.listener.i.n(xVar.f169861d) == 0) {
                m21.w.d(739);
            } else {
                m21.w.c(739);
            }
            ca4.z0.T(k17);
            k17.isDieItem();
            if (k17.getTypeFlag() == 21) {
                ha4.h.a().d();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        com.tencent.mm.plugin.sns.model.p6 p6Var = com.tencent.mm.plugin.sns.model.p6.f164581a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
        java.util.LinkedList linkedList = (timeLine == null || (a90Var3 = timeLine.ContentObj) == null) ? null : a90Var3.f369840h;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
            z18 = false;
        } else {
            z18 = ((r45.jj4) linkedList.get(0)).f377856e == 8;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "delete video is fake video");
            com.tencent.mm.plugin.sns.model.l4.Fj().L0(k17.localid);
            if (com.tencent.mm.sdk.platformtools.t8.H1(k17.getCreateTime()) < com.tencent.mm.plugin.sns.model.k6.f164361k) {
                com.tencent.mm.plugin.sns.model.l4.Jj().c(k17);
            }
            xVar.f169861d.B();
            p6Var.a(k17.localid, k17.getCreateTime());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        if (k17.isInValid()) {
            dx1.g.f244489a.j("SnsPublishProcess", "opresult_", 5, bx1.u.f36309d);
            com.tencent.mm.plugin.sns.statistics.j0.f164861a.d(k17.localid + "");
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Ni(16, k17.localid + "", null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel item ");
            sb6.append(k17.getLocalid());
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", sb6.toString());
            com.tencent.mm.plugin.sns.model.l4.Nj().c(k17);
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine2 = k17.getTimeLine();
            z19 = (timeLine2 == null || (a90Var2 = timeLine2.ContentObj) == null || (kv2Var2 = a90Var2.f369844o) == null || kv2Var2.getLong(9) == 0) ? false : true;
            if (com.tencent.mm.sdk.platformtools.t8.H1(k17.getCreateTime()) < com.tencent.mm.plugin.sns.model.k6.f164361k && !z19) {
                com.tencent.mm.plugin.sns.model.l4.Jj().c(k17);
            }
            xVar.f169861d.B();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "delete by server");
        java.lang.String snsId = k17.getSnsId();
        com.tencent.mm.plugin.sns.model.l4.xj().c(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q2(com.tencent.mm.plugin.sns.storage.w2.n(snsId), 1));
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine3 = k17.getTimeLine();
        z19 = (timeLine3 == null || (a90Var = timeLine3.ContentObj) == null || (kv2Var = a90Var.f369844o) == null || kv2Var.getLong(9) == 0) ? false : true;
        if (com.tencent.mm.sdk.platformtools.t8.H1(k17.getCreateTime()) < com.tencent.mm.plugin.sns.model.k6.f164361k && !z19) {
            com.tencent.mm.plugin.sns.model.l4.Jj().c(k17);
        }
        com.tencent.mm.plugin.sns.model.l4.Fj().delete(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
        com.tencent.mm.plugin.sns.model.l4.Aj().y0(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
        com.tencent.mm.plugin.sns.storage.u1.a(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
        xVar.f169861d.B();
        if (timeLine3 != null) {
            r45.y8 y8Var = timeLine3.AppInfo;
            java.lang.String str3 = y8Var != null ? y8Var.f390846d : null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Di(str3)) {
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(str3, false);
                com.tencent.mm.autogen.events.ReportDelGameMsgEvent reportDelGameMsgEvent = new com.tencent.mm.autogen.events.ReportDelGameMsgEvent();
                reportDelGameMsgEvent.f54684g.getClass();
                reportDelGameMsgEvent.e();
            }
        }
        if (com.tencent.mm.plugin.sns.ui.listener.i.n(xVar.f169861d) == 0) {
            m21.w.d(739);
        } else {
            m21.w.c(739);
        }
        ca4.z0.T(k17);
        k17.isDieItem();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$20$2");
    }
}
