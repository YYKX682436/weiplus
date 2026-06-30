package zc;

/* loaded from: classes.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f471374e;

    public v(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, long j17) {
        this.f471373d = wxaLiteAppWidgetAdapter;
        this.f471374e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f471373d.f45975q.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(this.f471374e);
    }
}
