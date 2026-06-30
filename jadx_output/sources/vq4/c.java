package vq4;

/* loaded from: classes13.dex */
public class c extends android.content.BroadcastReceiver {
    public c(vq4.b bVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || "android.intent.action.BATTERY_OKAY".equals(intent.getAction())) {
            return;
        }
        "android.intent.action.BATTERY_LOW".equals(intent.getAction());
    }
}
