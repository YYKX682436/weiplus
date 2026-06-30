package h71;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI f279409d;

    public t(com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI) {
        this.f279409d = mySafeDeviceListUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI = this.f279409d;
        android.view.View findViewById = mySafeDeviceListUI.getListView().findViewById(com.tencent.mm.R.id.m9_);
        if (findViewById == null) {
            findViewById = mySafeDeviceListUI.getListView().findViewById(com.tencent.mm.R.id.mq8);
        }
        if (findViewById != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            findViewById.getHitRect(rect);
            if (mySafeDeviceListUI.f73219p == 0) {
                mySafeDeviceListUI.f73219p = mySafeDeviceListUI.f73218o;
            }
            int max = java.lang.Math.max(mySafeDeviceListUI.f73218o, (mySafeDeviceListUI.getListView().getHeight() - rect.bottom) + mySafeDeviceListUI.f73219p);
            com.tencent.mars.xlog.Log.i("MicroMsg.MySafeDeviceListUI", "marginTop:" + max + " minTopPadding:" + mySafeDeviceListUI.f73218o + " getListView().getHeight():" + mySafeDeviceListUI.getListView().getHeight() + " out.bottom:" + rect.bottom + " curTopPadding:" + mySafeDeviceListUI.f73219p);
            findViewById.setPadding(0, max, 0, findViewById.getPaddingBottom());
            if (mySafeDeviceListUI.f73219p != max) {
                mySafeDeviceListUI.f73219p = max;
                mySafeDeviceListUI.getListView().requestLayout();
            }
        }
    }
}
