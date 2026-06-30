package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class q5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.r5 f170313d;

    public q5(com.tencent.mm.plugin.sns.ui.r5 r5Var) {
        this.f170313d = r5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MPVideoWidget$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/MPVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        com.tencent.mm.plugin.sns.ui.r5 r5Var = this.f170313d;
        r45.ee eeVar = r5Var.f170388s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
        if (eeVar != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            int[] iArr = new int[2];
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = r5Var.f170386q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            cdnImageView.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = r5Var.f170386q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            int measuredWidth = cdnImageView2.getMeasuredWidth() + i17;
            int i19 = iArr[1];
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView3 = r5Var.f170386q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            rect.set(i17, i18, measuredWidth, i19 + cdnImageView3.getMeasuredHeight());
            android.content.Context context = view.getContext();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            r45.ee eeVar2 = r5Var.f170388s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MPVideoWidget");
            m21.q.b(context, eeVar2, rect);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/MPVideoWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.MPVideoWidget$1");
    }
}
