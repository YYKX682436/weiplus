package j35;

/* loaded from: classes5.dex */
public class y implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.permission.PermissionActivity f297526d;

    public y(com.tencent.mm.pluginsdk.permission.PermissionActivity permissionActivity) {
        this.f297526d = permissionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "onResume() goIgnoreBatteryOptimizations ");
        int i18 = com.tencent.mm.pluginsdk.permission.PermissionActivity.f189513s;
        com.tencent.mm.pluginsdk.permission.PermissionActivity permissionActivity = this.f297526d;
        permissionActivity.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "goIgnoreBatteryOptimizations()");
        try {
            permissionActivity.startActivityForResult(new android.content.Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS").setData(android.net.Uri.parse("package:" + permissionActivity.getPackageName())), 1);
            if (com.tencent.mm.booter.o.a().getBoolean("954_93_first", true)) {
                jx3.f.INSTANCE.idkeyStat(954L, 93L, 1L, false);
                com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.booter.o.a();
                a17.getClass();
                a17.putBoolean("954_93_first", false);
            }
            jx3.f.INSTANCE.idkeyStat(954L, 94L, 1L, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", java.lang.Integer.valueOf(permissionActivity.f189518i), e17.getMessage());
        }
    }
}
