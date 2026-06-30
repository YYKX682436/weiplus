package d5;

/* loaded from: classes13.dex */
public abstract class c extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f226474a = a5.a0.e("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a5.a0.c().a(f226474a, java.lang.String.format("onReceive : %s", intent), new java.lang.Throwable[0]);
        java.lang.String str = d5.b.f226470g;
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
