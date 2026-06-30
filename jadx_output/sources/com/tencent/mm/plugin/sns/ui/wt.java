package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wt implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.yt f171462d;

    public wt(com.tencent.mm.plugin.sns.ui.yt ytVar) {
        this.f171462d = ytVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$1");
        com.tencent.mm.plugin.sns.ui.yt ytVar = this.f171462d;
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = ytVar.f171648d.f166810o;
        snsInfoFlip.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.ui.base.MMViewPager mMViewPager = snsInfoFlip.W;
        if (mMViewPager == null || snsInfoFlip.f167202p0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            i18 = -1;
        } else {
            int currentItem = mMViewPager.getCurrentItem();
            if (currentItem >= 0 && snsInfoFlip.J1.size() > currentItem) {
                snsInfoFlip.J1.remove(currentItem);
                snsInfoFlip.f167202p0.notifyDataSetChanged();
                snsInfoFlip.d0();
            }
            i18 = snsInfoFlip.f167202p0.getCount();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        if (i18 == 0) {
            ytVar.f171648d.r7();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2$1");
    }
}
