package l34;

/* loaded from: classes12.dex */
public final class k implements l34.b {

    /* renamed from: a, reason: collision with root package name */
    public static final l34.k f315439a = new l34.k();

    @Override // l34.b
    public int a() {
        int i17 = 0;
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().query(android.net.Uri.parse("content://com.bbk.launcher2.settings/favorites?notify=false"), new java.lang.String[]{"intent", "shortcutPermission"}, "intent LIKE '" + new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI").flattenToString() + "%'", null, null);
                if (cursor == null) {
                    return -1;
                }
                int columnIndex = cursor.getColumnIndex("shortcutPermission");
                cursor.moveToFirst();
                int i18 = cursor.getInt(columnIndex);
                com.tencent.mars.xlog.Log.i("MicroMsg.VivoShortcutInstallAdapter", "checkPermissionStatus, status: " + i18);
                if (i18 != 0 && 16 != i18) {
                    i17 = 1;
                }
                cursor.close();
                return i17;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VivoShortcutInstallAdapter", e17, "checkPermissionStatus fail", new java.lang.Object[0]);
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                cursor.close();
            }
            throw th6;
        }
    }

    @Override // l34.b
    public boolean b() {
        android.content.pm.PackageManager packageManager = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager();
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("com.bbk.launcher2", "com.bbk.launcher2.installshortcut.PurviewActivity"));
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        return !nf.c.a(queryIntentActivities) && queryIntentActivities.get(0).activityInfo.exported;
    }

    @Override // l34.b
    public void c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        l34.j.f315438a.b(context);
    }
}
