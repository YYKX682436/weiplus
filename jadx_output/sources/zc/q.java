package zc;

/* loaded from: classes14.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471365e;

    public q(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, int i17) {
        this.f471364d = wxaLiteAppWidgetAdapter;
        this.f471365e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471364d;
        if (i17 == 26) {
            wxaLiteAppWidgetAdapter.getClass();
            kd.c.e("LiteApp.WxaLiteAppWidgetAdapter", "avoid setRequestedOrientation when Oreo", new java.lang.Object[0]);
            return;
        }
        int i18 = this.f471365e;
        wxaLiteAppWidgetAdapter.f45980v = i18;
        android.app.Activity activity = wxaLiteAppWidgetAdapter.f45975q;
        if (i18 == 0) {
            activity.setRequestedOrientation(1);
            return;
        }
        if (i18 == 1) {
            if (android.provider.Settings.System.getInt(activity.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                activity.setRequestedOrientation(10);
                return;
            } else {
                activity.setRequestedOrientation(1);
                return;
            }
        }
        if (i18 == 2) {
            activity.setRequestedOrientation(1);
        } else {
            if (i18 != 3) {
                return;
            }
            activity.setRequestedOrientation(6);
        }
    }
}
