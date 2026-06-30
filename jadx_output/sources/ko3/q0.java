package ko3;

/* loaded from: classes13.dex */
public class q0 extends android.content.BroadcastReceiver {
    public q0(ko3.p0 p0Var) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        ko3.r0.f309996b = intent.getExtras().getBoolean(fo3.s.INSTANCE.V6("3<<;14\"<<"));
    }
}
