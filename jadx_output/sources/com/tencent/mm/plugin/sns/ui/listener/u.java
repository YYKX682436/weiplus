package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169854d;

    public u(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169854d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$1");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo a17 = com.tencent.mm.plugin.sns.ui.listener.i.a(this.f169854d, view);
        if (a17 == null || !a17.isAd()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$1");
            return;
        }
        if (a17.getAdSnsInfo().getAdXml().hasVoteInfo()) {
            int b17 = com.tencent.mm.plugin.sns.storage.w2.b(a17.getAdSnsInfo().getAdXml().getAdVoteComponentUrl(), a17.getUxinfo());
            int i17 = b17 > 0 ? 1 : 0;
            com.tencent.mm.plugin.sns.storage.w2.l(a17.getAdSnsInfo().getAdXml().getAdVoteComponentUrl(), a17.getUxinfo(), gm0.j1.b().j(), i17 != 0 ? b17 : 1, i17 ^ 1, "");
            z17 = (i17 ^ 1) == true ? 1 : 0;
        } else {
            z17 = false;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = a17.getTimeLine();
        if (timeLine.ContentObj.f369837e == 15 && timeLine.sightFolded != 1) {
            com.tencent.mm.plugin.sns.ui.listener.i.b(this.f169854d, view, a17, 1001, a17.getAdSnsInfo().getAdXml().getLeftCanvasInfo(), z17);
        } else if ((a17.isPhoto() && timeLine.ContentObj.f369840h.size() == 1) || timeLine.ContentObj.f369837e == 7) {
            com.tencent.mm.plugin.sns.ui.listener.i.k(this.f169854d, view, a17, 1001, a17.getAdSnsInfo().getAdXml().getLeftCanvasInfo(), z17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$1");
    }
}
