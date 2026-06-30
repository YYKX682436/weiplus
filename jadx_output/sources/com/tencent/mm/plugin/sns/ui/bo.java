package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bo implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.co f168029d;

    public bo(com.tencent.mm.plugin.sns.ui.co coVar) {
        this.f168029d = coVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8$2");
        if (!pc4.d.f353410a.w()) {
            com.tencent.mm.plugin.sns.ui.co coVar = this.f168029d;
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = coVar.f168139e;
            int i18 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            android.widget.LinearLayout linearLayout = snsOnlineVideoActivity.R;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            linearLayout.setBackground(i65.a.i(coVar.f168139e.getContext(), com.tencent.mm.R.drawable.d9c));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8$2");
    }
}
