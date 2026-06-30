package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169775d;

    public e1(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169775d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.storage.ADInfo s17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof java.lang.String)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1((java.lang.String) view.getTag());
        if (k17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
        r45.ed4 ed4Var = timeLine.Location;
        boolean isAd = k17.isAd();
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169775d;
        if (!isAd) {
            if (com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0) {
                m21.w.d(724);
            } else {
                m21.w.c(724);
            }
            ca4.z0.T(k17);
            k17.isAd();
            k17.getUxinfo();
            java.lang.String str = ed4Var.f373316i;
            android.content.Intent intent = new android.content.Intent();
            r45.f96 f96Var = new r45.f96();
            f96Var.set(0, java.lang.Float.valueOf(ed4Var.f373311d));
            f96Var.set(1, java.lang.Float.valueOf(ed4Var.f373312e));
            f96Var.set(2, ed4Var.f373313f);
            f96Var.set(3, ed4Var.f373314g);
            f96Var.set(4, ed4Var.f373315h);
            f96Var.set(5, ed4Var.f373316i);
            f96Var.set(6, java.lang.Integer.valueOf(ed4Var.f373317m));
            f96Var.set(7, ed4Var.f373318n);
            f96Var.set(8, java.lang.Integer.valueOf(ed4Var.f373319o));
            f96Var.set(9, java.lang.Integer.valueOf(ed4Var.f373320p));
            f96Var.set(10, java.lang.Integer.valueOf(ed4Var.f373321q));
            f96Var.set(15, ed4Var.f373326v);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            g0Var.B(1663L, 0L);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.plugin.finder.service.p3.f126174a.b(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar), f96Var, zy2.o9.f477516d, 7, timeLine.Id, new com.tencent.mm.plugin.sns.ui.listener.d1(this, ed4Var, intent, timeLine));
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "click the ad poi button");
        com.tencent.mm.plugin.sns.storage.ADInfo s18 = com.tencent.mm.plugin.sns.ui.listener.i.s(iVar, k17);
        if (s18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "the adInfo is null");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
            return;
        }
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0 ? 1 : 2, k17.field_snsId, 19, 0);
        ca4.m0.f(snsAdClick, iVar.f169805h, k17, 19);
        ca4.z0.x0(snsAdClick);
        if (com.tencent.mm.sdk.platformtools.t8.K0(s18.adActionPOILink)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "the adActionPOILink is null");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
            return;
        }
        if (com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0) {
            m21.w.d(724);
        } else {
            m21.w.c(724);
        }
        ca4.z0.T(k17);
        k17.isAd();
        k17.getUxinfo();
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "open webview url : " + s18.adActionPOILink);
        android.content.Intent intent2 = new android.content.Intent();
        if (k17.isAd() && (s17 = com.tencent.mm.plugin.sns.ui.listener.i.s(iVar, k17)) != null) {
            intent2.putExtra("KsnsViewId", s17.viewId);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("KSnsAdTag", snsAdClick);
        intent2.putExtra("jsapiargs", bundle);
        intent2.putExtra("useJs", true);
        intent2.putExtra("KPublisherId", "sns_" + ca4.z0.t0(k17.field_snsId));
        intent2.putExtra("pre_username", k17.field_userName);
        intent2.putExtra("prePublishId", "sns_" + ca4.z0.t0(k17.field_snsId));
        intent2.putExtra("preUsername", k17.field_userName);
        intent2.putExtra("rawUrl", ca4.z0.b(s18.adActionPOILink, s18.uxInfo));
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent2, com.tencent.mm.plugin.sns.ui.listener.i.e(iVar));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7");
    }
}
