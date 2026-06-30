package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public final class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f192729d;

    public h7(android.net.Uri uri) {
        this.f192729d = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.database.Cursor query;
        java.lang.String str;
        boolean z17;
        int columnIndex;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 30 || context.getApplicationInfo().targetSdkVersion < 30) {
            query = context.getContentResolver().query(this.f192729d, com.tencent.mm.sdk.platformtools.m7.f192857b, null, null, "date_added DESC limit 1");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("android:query-arg-limit", 1);
            bundle.putStringArray("android:query-arg-sort-columns", new java.lang.String[]{"date_added"});
            bundle.putInt("android:query-arg-sort-direction", 1);
            bundle.putString("android:query-arg-sql-selection", "is_pending = 0");
            query = context.getContentResolver().query(this.f192729d, com.tencent.mm.sdk.platformtools.m7.f192857b, bundle, null);
        }
        if (query == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, mediaQuery failed");
            return;
        }
        if (!query.moveToFirst()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, mediaQuery empty");
            return;
        }
        java.lang.String string = query.getString(query.getColumnIndex("_data"));
        long j17 = query.getLong(query.getColumnIndex("date_added")) * 1000;
        boolean z18 = i17 >= 29 && (columnIndex = query.getColumnIndex("is_pending")) >= 0 && query.getInt(columnIndex) == 1;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        query.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "contentObserver onChange, mediaQuery, path: " + string + ", dateAdded: " + j17 + ", currentTime: " + currentTimeMillis);
        r26.t tVar = com.tencent.mm.sdk.platformtools.m7.f192856a;
        kotlin.jvm.internal.o.d(string);
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(string));
            long j18 = currentTimeMillis - j17;
            if (java.lang.Math.abs(j18) > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT || java.lang.Math.abs(r6Var.B() - j17) > 5000 || !r6Var.m() || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                str = "toLowerCase(...)";
            } else {
                java.lang.String lowerCase = string.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                str = "toLowerCase(...)";
                if ((r26.n0.B(lowerCase, "screenshot", false) || r26.n0.B(string, "截屏", false) || r26.n0.B(string, "截图", false)) && !kotlin.jvm.internal.o.b(string, com.tencent.mm.sdk.platformtools.m7.f192861f)) {
                    com.tencent.mm.sdk.platformtools.m7.f192861f = string;
                    com.tencent.mm.sdk.platformtools.m7.f192862g.post(new com.tencent.mm.sdk.platformtools.k7(string, j17, z18));
                    if (com.tencent.mm.sdk.platformtools.x2.n()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "onContentChange, main process, report screenshot event");
                        if (com.tencent.mm.sdk.platformtools.m7.f192858c != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotService", "onScreenShot, report");
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("trigger_screenshot", null, 36458);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("newFileLimit: ");
            sb6.append(java.lang.Math.abs(j18) <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("lastModifiedLimit: ");
            sb7.append(java.lang.Math.abs(r6Var.B() - j17) <= 5000);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", sb7.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "fileExist: " + r6Var.m());
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "nullFilePath: " + com.tencent.mm.sdk.platformtools.t8.K0(string));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("containPending: ");
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase2 = string.toLowerCase(locale);
            java.lang.String str2 = str;
            kotlin.jvm.internal.o.f(lowerCase2, str2);
            sb8.append(r26.n0.B(lowerCase2, "pending", false));
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("containScreenshot: ");
            java.lang.String lowerCase3 = string.toLowerCase(locale);
            kotlin.jvm.internal.o.f(lowerCase3, str2);
            if (!r26.n0.B(lowerCase3, "screenshot", false) && !r26.n0.B(string, "截屏", false) && !r26.n0.B(string, "截图", false)) {
                z17 = false;
                sb9.append(z17);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", sb9.toString());
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "equalToLast: " + kotlin.jvm.internal.o.b(string, com.tencent.mm.sdk.platformtools.m7.f192861f));
            }
            z17 = true;
            sb9.append(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", sb9.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotUtil", "equalToLast: " + kotlin.jvm.internal.o.b(string, com.tencent.mm.sdk.platformtools.m7.f192861f));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotUtil", "onContentChange, failed: " + th6.getMessage() + ", stackTrace: " + th6.getStackTrace());
        }
    }
}
