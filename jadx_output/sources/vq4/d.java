package vq4;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static vq4.c f439282a;

    public static void a() {
        if (f439282a == null) {
            f439282a = new vq4.c(null);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(f439282a, intentFilter);
    }
}
