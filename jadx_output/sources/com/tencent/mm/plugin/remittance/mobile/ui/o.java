package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI f156699d;

    public o(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI) {
        this.f156699d = mobileRemitHistoryRecodUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = this.f156699d;
        if (mobileRemitHistoryRecodUI.f156563d.getScrollState() == 0 && !mobileRemitHistoryRecodUI.f156570n.f156724d && mobileRemitHistoryRecodUI.f156569m.y() + 1 == mobileRemitHistoryRecodUI.f156570n.getItemCount()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "first screen refresh data!");
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "doFetchHistoryRecord() mLastId:%s", mobileRemitHistoryRecodUI.f156566g);
            mobileRemitHistoryRecodUI.doSceneProgress(new sw3.f(mobileRemitHistoryRecodUI.f156566g, mobileRemitHistoryRecodUI.f156565f), false);
        }
    }
}
