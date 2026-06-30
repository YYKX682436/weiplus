package i11;

/* loaded from: classes4.dex */
public class z implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f287161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i11.u f287162e;

    public z(i11.u uVar, android.content.Context context) {
        this.f287162e = uVar;
        this.f287161d = context;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        android.database.Cursor cursor;
        boolean z17;
        i11.u uVar = this.f287162e;
        if (uVar.f287153b) {
            return java.lang.Boolean.FALSE;
        }
        uVar.f287153b = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.content.Context context = this.f287161d;
        try {
            cursor = context.getContentResolver().query(android.net.Uri.parse("content://com.vivo.permissionmanager.provider.permission/fuzzy_location_apps"), new java.lang.String[]{"package_name", "selected_fuzzy"}, "package_name=?", new java.lang.String[]{context.getPackageName()}, null);
            z17 = false;
            while (cursor != null) {
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    if (cursor.getString(0) != null && cursor.getInt(1) == 1) {
                        z17 = true;
                    }
                } catch (java.lang.Throwable unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SLocationManager", "check vivo coarse finish, " + z17 + ", " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    uVar.f287153b = false;
                    return java.lang.Boolean.valueOf(z17);
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (java.lang.Throwable unused2) {
            cursor = null;
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SLocationManager", "check vivo coarse finish, " + z17 + ", " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        uVar.f287153b = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
