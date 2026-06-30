package j35;

/* loaded from: classes11.dex */
public class c extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction().equals("android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED")) {
            context.unregisterReceiver(j35.b.f297500b);
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                android.app.AlarmManager alarmManager = (android.app.AlarmManager) b3.l.getSystemService(context, android.app.AlarmManager.class);
                if (alarmManager == null || !alarmManager.canScheduleExactAlarms()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlarmPermissionHelper", "unable schedule exact alarms");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlarmPermissionHelper", "enable schedule exact alarms");
                }
            }
        }
    }
}
