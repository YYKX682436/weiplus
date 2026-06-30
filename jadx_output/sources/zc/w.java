package zc;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.WxaLiteAppWidgetAdapter f471375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f471376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f471377f;

    public w(com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter, long j17, int i17) {
        this.f471375d = wxaLiteAppWidgetAdapter;
        this.f471376e = j17;
        this.f471377f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f471375d.f45975q.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        long j17 = this.f471376e;
        if (i17 < 26 || !vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(j17);
        } else {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, this.f471377f));
        }
    }
}
