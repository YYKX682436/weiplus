package zc;

/* loaded from: classes14.dex */
public final class l extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, android.os.Handler handler) {
        super(handler);
        this.f471354a = wxaLiteAppWidgetAdapter;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        super.onChange(z17);
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = this.f471354a;
        if (wxaLiteAppWidgetAdapter.f45980v == 1) {
            android.app.Activity activity = wxaLiteAppWidgetAdapter.f45975q;
            if (android.provider.Settings.System.getInt(activity.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                activity.setRequestedOrientation(10);
            } else {
                activity.setRequestedOrientation(1);
            }
        }
    }
}
