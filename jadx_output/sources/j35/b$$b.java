package j35;

/* loaded from: classes11.dex */
public final /* synthetic */ class b$$b implements android.content.DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AlarmPermissionHelper", "cancel request schedule exact alarm permission");
        j35.u.m("android.permission.SCHEDULE_EXACT_ALARM", 161);
        j35.b.f297499a = false;
    }
}
