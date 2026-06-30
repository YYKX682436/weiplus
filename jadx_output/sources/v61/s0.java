package v61;

/* loaded from: classes13.dex */
public class s0 implements com.tencent.mm.sdk.platformtools.a4 {
    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = v61.u0.f433479a + 1;
        v61.u0.f433479a = i17;
        if (i17 == 1 || i17 == 16 || i17 % 96 == 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1).get(0).topActivity.getClassName();
            if (!com.tencent.mm.plugin.account.ui.MobileVerifyUI.class.getName().equals(r3.getClassName())) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileVerifyUI.class);
                intent.addFlags(2);
                intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                intent.addFlags(67108864);
                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 36, intent, fp.g0.a(1073741824));
                z2.k0 k0Var = new z2.k0(context, "reminder_channel_id");
                k0Var.f(context.getString(com.tencent.mm.R.string.f490531xr));
                android.app.Notification notification = k0Var.D;
                notification.icon = com.tencent.mm.R.drawable.c7v;
                notification.when = java.lang.System.currentTimeMillis();
                k0Var.f469463g = activity;
                z2.i0 i0Var = new z2.i0(k0Var);
                i0Var.f469450b = z2.k0.c(context.getString(com.tencent.mm.R.string.gv8));
                z2.k0 k0Var2 = i0Var.f469520a;
                android.app.Notification b17 = k0Var2 != null ? k0Var2.b() : null;
                b17.defaults |= 1;
                b17.flags = 16 | b17.flags;
                ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(36, b17, false);
            }
        }
        return true;
    }
}
