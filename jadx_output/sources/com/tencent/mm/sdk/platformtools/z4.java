package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public final class z4 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public long f193130a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f193131b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f193132c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f193133d;

    public z4(android.content.Context context, android.os.Handler handler) {
        super(handler);
        this.f193133d = context;
    }

    public static void a(com.tencent.mm.sdk.platformtools.z4 z4Var, android.content.Context context, android.net.Uri uri) {
        android.database.Cursor query;
        z4Var.getClass();
        android.database.Cursor cursor = null;
        try {
            try {
                if (android.os.Build.VERSION.SDK_INT < 30 || context.getApplicationInfo().targetSdkVersion < 30) {
                    query = context.getContentResolver().query(uri, com.tencent.mm.sdk.platformtools.a5.f192456d, null, null, "date_added DESC limit 1");
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("android:query-arg-limit", 1);
                    bundle.putStringArray("android:query-arg-sort-columns", new java.lang.String[]{"date_added"});
                    bundle.putInt("android:query-arg-sort-direction", 1);
                    query = context.getContentResolver().query(uri, com.tencent.mm.sdk.platformtools.a5.f192456d, bundle, null);
                }
                cursor = query;
                if (cursor != null && cursor.moveToFirst()) {
                    com.tencent.mm.sdk.platformtools.a5.f192454b.post(new com.tencent.mm.sdk.platformtools.y4(z4Var, context, cursor.getString(cursor.getColumnIndex("_data")), cursor.getLong(cursor.getColumnIndex("date_added")), java.lang.System.currentTimeMillis() / 1000));
                }
                if (cursor == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScreenShotUtil", "summerscreenshot fail e:" + e17.getMessage());
                if (cursor == null) {
                    return;
                }
            }
            cursor.close();
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                cursor.close();
            }
            throw th6;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17, android.net.Uri uri) {
        android.net.Uri uri2 = this.f193132c;
        if (uri2 != null && uri != null && uri2.getPath() != null && this.f193132c.getPath().equals(uri.getPath())) {
            super.onChange(z17, uri);
            return;
        }
        this.f193132c = uri;
        com.tencent.mm.sdk.platformtools.a5.f192453a.post(new com.tencent.mm.sdk.platformtools.x4(this, z17, uri));
        super.onChange(z17, uri);
    }
}
