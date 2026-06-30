package uc4;

/* loaded from: classes4.dex */
public final class a0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc4.p f426374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc4.c0 f426375b;

    public a0(xc4.p pVar, uc4.c0 c0Var) {
        this.f426374a = pVar;
        this.f426375b = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        boolean z18;
        r45.a90 a90Var;
        r45.kv2 kv2Var;
        r45.a90 a90Var2;
        r45.kv2 kv2Var2;
        r45.a90 a90Var3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
        xc4.p pVar = this.f426374a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DeleteClick", "onItemDelClick:" + pVar.W0() + ", snsId:" + pVar.y0());
        if (pVar.isDieItem()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DeleteClick", "dead item");
            m21.w.d(739);
            pVar.a1();
            pVar.isDieItem();
            if (pVar.getType() == 21) {
                ha4.h.a().d();
            }
            this.f426375b.n(pVar.U0(), pVar.y0(), pVar.getCreateTime());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = pVar.h1();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        java.util.LinkedList linkedList = (h17 == null || (a90Var3 = h17.ContentObj) == null) ? null : a90Var3.f369840h;
        boolean z19 = false;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
            z18 = false;
        } else {
            z18 = ((r45.jj4) linkedList.get(0)).f377856e == 8;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DeleteClick", "delete video is fake video");
            com.tencent.mm.plugin.sns.model.l4.Fj().L0((int) pVar.U0());
            if (com.tencent.mm.sdk.platformtools.t8.H1(pVar.getCreateTime()) < com.tencent.mm.plugin.sns.model.k6.f164361k) {
                com.tencent.mm.plugin.sns.model.l4.Jj().c(pVar.c1());
            }
            com.tencent.mm.plugin.sns.model.p6.f164581a.a((int) pVar.U0(), pVar.getCreateTime());
            this.f426375b.n(pVar.U0(), pVar.y0(), pVar.getCreateTime());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
            return;
        }
        if (pVar.isInValid()) {
            dx1.g.f244489a.j("SnsPublishProcess", "opresult_", 5, bx1.u.f36309d);
            com.tencent.mm.plugin.sns.statistics.j0.f164861a.d(pVar.U0() + "");
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Ni(16, java.lang.String.valueOf(pVar.U0()), null);
            com.tencent.mm.plugin.sns.model.l4.Nj().c(pVar.c1());
            com.tencent.mm.protocal.protobuf.TimeLineObject h18 = pVar.h1();
            if (h18 != null && (a90Var2 = h18.ContentObj) != null && (kv2Var2 = a90Var2.f369844o) != null && kv2Var2.getLong(9) != 0) {
                z19 = true;
            }
            if (com.tencent.mm.sdk.platformtools.t8.H1(pVar.getCreateTime()) < com.tencent.mm.plugin.sns.model.k6.f164361k && !z19) {
                com.tencent.mm.plugin.sns.model.l4.Jj().c(pVar.c1());
            }
            this.f426375b.n(pVar.U0(), pVar.y0(), pVar.getCreateTime());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
            return;
        }
        ad4.g gVar = ad4.g.f3183a;
        uc4.c0 c0Var = this.f426375b;
        c0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        in5.s0 s0Var = c0Var.f426407d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        android.view.View view = s0Var != null ? s0Var.itemView : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        gVar.a(view, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DeleteClick", "delete by server");
        com.tencent.mm.plugin.sns.model.l4.xj().c(pVar.y0());
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q2(pVar.y0(), 1));
        com.tencent.mm.protocal.protobuf.TimeLineObject h19 = pVar.h1();
        boolean z27 = (h19 == null || (a90Var = h19.ContentObj) == null || (kv2Var = a90Var.f369844o) == null || kv2Var.getLong(9) == 0) ? false : true;
        if (com.tencent.mm.sdk.platformtools.t8.H1(pVar.getCreateTime()) < com.tencent.mm.plugin.sns.model.k6.f164361k && !z27) {
            com.tencent.mm.plugin.sns.model.l4.Jj().c(pVar.c1());
        }
        com.tencent.mm.plugin.sns.model.l4.Aj().y0(pVar.y0());
        com.tencent.mm.plugin.sns.storage.u1.a(pVar.y0());
        if (h19 != null) {
            r45.y8 y8Var = h19.AppInfo;
            java.lang.String str2 = y8Var != null ? y8Var.f390846d : null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Di(str2)) {
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(str2, false);
                com.tencent.mm.autogen.events.ReportDelGameMsgEvent reportDelGameMsgEvent = new com.tencent.mm.autogen.events.ReportDelGameMsgEvent();
                reportDelGameMsgEvent.f54684g.getClass();
                reportDelGameMsgEvent.e();
            }
        }
        this.f426375b.n(pVar.U0(), pVar.y0(), pVar.getCreateTime());
        m21.w.d(739);
        pVar.a1();
        pVar.isDieItem();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick$click$1");
    }
}
