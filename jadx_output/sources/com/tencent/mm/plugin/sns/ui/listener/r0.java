package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169848d;

    public r0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169848d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo a17 = com.tencent.mm.plugin.sns.ui.listener.i.a(this.f169848d, view);
        if (a17 == null || !a17.isAd()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
            return;
        }
        if (a17.getAdSnsInfo().getAdXml().hasVoteInfo()) {
            int b17 = com.tencent.mm.plugin.sns.storage.w2.b(a17.getAdSnsInfo().getAdXml().getAdVoteComponentUrl(), a17.getUxinfo());
            int i17 = b17 > 0 ? 1 : 0;
            java.lang.String adVoteComponentUrl = a17.getAdSnsInfo().getAdXml().getAdVoteComponentUrl();
            java.lang.String uxinfo = a17.getUxinfo();
            java.lang.String j17 = gm0.j1.b().j();
            if (i17 == 0) {
                b17 = 2;
            }
            com.tencent.mm.plugin.sns.storage.w2.l(adVoteComponentUrl, uxinfo, j17, b17, i17 ^ 1, "");
            z17 = (i17 ^ 1) == true ? 1 : 0;
        } else {
            z17 = false;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = a17.getTimeLine();
        if (timeLine.ContentObj.f369837e == 15 && timeLine.sightFolded != 1) {
            com.tencent.mm.plugin.sns.ui.listener.i.b(this.f169848d, view, a17, 1002, a17.getAdSnsInfo().getAdXml().getRightCanvasInfo(), z17);
        } else if ((a17.isPhoto() && timeLine.ContentObj.f369840h.size() == 1) || timeLine.ContentObj.f369837e == 7) {
            com.tencent.mm.plugin.sns.ui.listener.i.k(this.f169848d, view, a17, 1002, a17.getAdSnsInfo().getAdXml().getRightCanvasInfo(), z17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
    }
}
