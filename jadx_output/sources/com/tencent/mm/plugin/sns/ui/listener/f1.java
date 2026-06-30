package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169779d;

    public f1(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169779d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof java.lang.String)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1((java.lang.String) view.getTag());
        if (k17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
            return;
        }
        if (!k17.isAd()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "click the ad tailLink button");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169779d;
        com.tencent.mm.plugin.sns.storage.ADInfo s17 = com.tencent.mm.plugin.sns.ui.listener.i.s(iVar, k17);
        if (s17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "the adInfo is null");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(s17.adActionExtTailLink)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "the adActionExtTailLink is null");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "open webview url : " + s17.adActionExtTailLink);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("jsapiargs", new android.os.Bundle());
        intent.putExtra("useJs", true);
        java.lang.String b17 = ca4.z0.b(s17.adActionExtTailLink, s17.uxInfo);
        ca4.z0.c(intent, s17.uxInfo);
        intent.putExtra("rawUrl", b17);
        iVar.u(intent);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, com.tencent.mm.plugin.sns.ui.listener.i.e(iVar));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
    }
}
