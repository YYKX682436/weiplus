package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class d1 implements com.tencent.mm.plugin.sns.ui.dg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.l1 f168150a;

    public d1(com.tencent.mm.plugin.sns.ui.l1 l1Var) {
        this.f168150a = l1Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.dg
    public void a(zb4.a aVar) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$4");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) this.f168150a.f169710k.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLine", "onCommentSend click type: %d", java.lang.Integer.valueOf(aVar.a()));
        java.lang.String d17 = aVar.d();
        if (!aVar.f()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseTimeLine", "onCommentSend tosendText is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$4");
            return;
        }
        r45.e86 commentInfo = this.f168150a.f169710k.getCommentInfo();
        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
        if (m21.w.d((commentInfo.f373132m == 0 && commentInfo.f373137r == 0) ? 708 : 709).f323005c == 708) {
            ca4.z0.T(snsInfo);
            int i17 = snsInfo.field_type;
            snsInfo.isAd();
            snsInfo.getUxinfo();
            int i18 = e17.LikeCount;
        } else {
            ca4.z0.T(snsInfo);
            int i19 = snsInfo.field_type;
            snsInfo.isAd();
            snsInfo.getUxinfo();
            int i27 = e17.LikeCount;
        }
        com.tencent.mm.plugin.sns.model.l7 l7Var = this.f168150a.f169703d;
        if (l7Var != null) {
            com.tencent.mm.plugin.sns.statistics.l a18 = l7Var.a();
            a18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentSendEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            if (snsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSendEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            } else {
                a18.f164871c.add(snsInfo.getLocalid());
                a18.f164870b.size();
                a18.f(snsInfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSendEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            }
        }
        int commentFlag = this.f168150a.f169710k.getCommentFlag();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLine", "onCommentSend click %s", java.lang.Integer.valueOf(commentFlag));
        if (com.tencent.mm.plugin.sns.ui.widget.t2.i(commentFlag, 8)) {
            aVar.i(d17.substring(this.f168150a.f169710k.getCommentAtPrefix().length()));
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLine", "send atFriend ad timeline comment");
            com.tencent.mm.plugin.sns.model.d6.q(snsInfo, 16, aVar, this.f168150a.f169710k.getCommentInfo(), commentFlag, 0);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLine", "send timeline comment");
            com.tencent.mm.plugin.sns.model.d6.q(snsInfo, snsInfo.isAd() ? 8 : 2, aVar, this.f168150a.f169710k.getCommentInfo(), commentFlag, 0);
        }
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f168150a;
        com.tencent.mm.plugin.sns.ui.bs bsVar = l1Var.f169709j;
        com.tencent.mm.plugin.sns.ui.zx zxVar = l1Var.f169712m;
        java.lang.Runnable runnable = zxVar != null ? zxVar.f171729j : null;
        bsVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhileSendComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        bsVar.f168035a.w3("");
        if (runnable != null) {
            ((com.tencent.mm.plugin.sns.ui.wx) runnable).run();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhileSendComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        this.f168150a.g();
        com.tencent.mm.plugin.sns.ui.l1 l1Var2 = this.f168150a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        java.lang.String str = l1Var2.f169715p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.Iterator it = com.tencent.mm.plugin.sns.ui.l1.A.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.sns.ui.t1 t1Var = (com.tencent.mm.plugin.sns.ui.t1) it.next();
                com.tencent.mm.plugin.sns.ui.l1 l1Var3 = this.f168150a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                java.lang.String str2 = l1Var3.f169715p;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
                if (str2.equals(t1Var.f170493a)) {
                    ((java.util.LinkedList) com.tencent.mm.plugin.sns.ui.l1.A).remove(t1Var);
                    break;
                }
            }
        }
        if (snsInfo.isAd()) {
            l44.b3.f316041a.d(snsInfo);
            if (snsInfo.isAdIpInteractVideo() && !ca4.m0.o()) {
                ca4.m0.w0();
            }
            if (snsInfo.isAdIpInteractVideo()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
                gd4.c2.f270650w.c(snsInfo, 3, 1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController");
            }
        }
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.k(ca4.z0.t0(snsInfo.field_snsId));
        snsInfo.field_withTa = java.lang.System.currentTimeMillis() + "";
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).f7(snsInfo, o75.b.f343583d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentSend", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$4");
    }
}
