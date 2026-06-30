package ra3;

/* loaded from: classes8.dex */
public final class g0 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public long f393500a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f393501b;

    /* renamed from: c, reason: collision with root package name */
    public android.net.Uri f393502c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f393503d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f393504e;

    public g0(android.content.Context context, java.lang.ref.WeakReference weakReference) {
        super(ra3.h0.f393509b);
        this.f393504e = context;
        this.f393503d = weakReference;
    }

    public static void a(ra3.g0 g0Var, android.content.Context context, android.net.Uri uri) {
        android.database.Cursor query;
        g0Var.getClass();
        android.database.Cursor cursor = null;
        try {
            try {
                if (android.os.Build.VERSION.SDK_INT < 30 || context.getApplicationInfo().targetSdkVersion < 30) {
                    query = context.getContentResolver().query(uri, ra3.h0.f393510c, null, null, "date_added DESC limit 1");
                } else {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("android:query-arg-limit", 1);
                    bundle.putStringArray("android:query-arg-sort-columns", new java.lang.String[]{"date_added"});
                    bundle.putInt("android:query-arg-sort-direction", 1);
                    query = context.getContentResolver().query(uri, ra3.h0.f393510c, bundle, null);
                }
                cursor = query;
                if (cursor != null && cursor.moveToFirst()) {
                    ra3.h0.f393509b.post(new ra3.f0(g0Var, context, cursor.getString(cursor.getColumnIndex("_data")), cursor.getLong(cursor.getColumnIndex("date_added")), java.lang.System.currentTimeMillis() / 1000));
                }
                if (cursor == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("LiteAppUtils", "summerscreenshot fail e:" + e17.getMessage());
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
        android.net.Uri uri2 = this.f393502c;
        if (uri2 != null && uri != null && uri2.getPath() != null && this.f393502c.getPath().equals(uri.getPath())) {
            super.onChange(z17, uri);
            return;
        }
        this.f393502c = uri;
        ra3.h0.f393508a.post(new ra3.e0(this, z17, uri));
        super.onChange(z17, uri);
    }
}
