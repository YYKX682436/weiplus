package mt5;

/* loaded from: classes8.dex */
public class p implements lt5.a {

    /* renamed from: a, reason: collision with root package name */
    public int f331326a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f331327b = "";

    @Override // lt5.a
    public synchronized lt5.f a(android.content.Context context) {
        if (!b()) {
            this.f331326a = -205;
            return lt5.f.a(-205);
        }
        java.lang.System.currentTimeMillis();
        this.f331326a = 0;
        try {
            android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
            if (query == null) {
                this.f331326a = -201;
                return lt5.f.a(-201);
            }
            try {
                if (query.moveToNext()) {
                    try {
                        this.f331327b = query.getString(query.getColumnIndex("value"));
                    } catch (java.lang.Throwable unused) {
                        this.f331326a = -203;
                    }
                } else {
                    this.f331326a = -202;
                }
                java.lang.System.currentTimeMillis();
                return new lt5.f(this.f331327b, this.f331326a);
            } finally {
                try {
                    query.close();
                } catch (java.lang.Throwable unused2) {
                }
            }
        } catch (java.lang.Throwable unused3) {
            this.f331326a = org.chromium.net.NetError.ERR_CERT_COMMON_NAME_INVALID;
            return lt5.f.a(org.chromium.net.NetError.ERR_CERT_COMMON_NAME_INVALID);
        }
    }

    public final boolean b() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            java.lang.reflect.Method method = cls.getMethod("get", java.lang.String.class, java.lang.String.class);
            method.setAccessible(true);
            return "1".equals((java.lang.String) method.invoke(cls, "persist.sys.identifierid.supported", "0"));
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
