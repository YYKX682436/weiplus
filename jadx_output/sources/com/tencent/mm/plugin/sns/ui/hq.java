package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter f168528d;

    public hq(com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter) {
        this.f168528d = snsSightUploadSayFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSightUploadSayFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter.f167388t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter = this.f168528d;
        snsSightUploadSayFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        int visibility = snsSightUploadSayFooter.f167390o.getVisibility();
        com.tencent.mm.ui.MMActivity mMActivity = snsSightUploadSayFooter.f167389n;
        if (visibility == 8) {
            mMActivity.hideVKB();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(hc1.i.NAME, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            snsSightUploadSayFooter.f167390o.i();
            snsSightUploadSayFooter.f167390o.setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(hc1.i.NAME, "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            snsSightUploadSayFooter.f167391p.requestFocus();
            snsSightUploadSayFooter.f167392q.setImageResource(com.tencent.mm.R.raw.sight_icon_keyboard);
        } else {
            snsSightUploadSayFooter.f167391p.requestFocus();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            snsSightUploadSayFooter.f167390o.h();
            snsSightUploadSayFooter.f167390o.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            mMActivity.showVKB();
            snsSightUploadSayFooter.f167392q.setImageResource(com.tencent.mm.R.raw.sight_icon_emoji);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSightUploadSayFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$4");
    }
}
