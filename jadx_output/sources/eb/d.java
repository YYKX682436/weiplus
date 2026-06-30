package eb;

/* loaded from: classes13.dex */
public abstract class d {
    public static void a(android.content.Context context, java.lang.String str, android.content.Intent intent) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        java.lang.String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        java.lang.String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!android.text.TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        java.lang.String stringExtra4 = intent.getStringExtra("from");
        if (stringExtra4 == null || !stringExtra4.startsWith("/topics/")) {
            stringExtra4 = null;
        }
        if (stringExtra4 != null) {
            bundle.putString("_nt", stringExtra4);
        }
        try {
            bundle.putInt("_nmt", java.lang.Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
        } catch (java.lang.NumberFormatException unused) {
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", java.lang.Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (java.lang.NumberFormatException unused2) {
            }
        }
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 22 + java.lang.String.valueOf(bundle).length());
        }
        za.a aVar = (za.a) xa.b.a().get(za.a.class);
        if (aVar != null) {
            ((za.b) aVar).logEvent(com.google.android.gms.measurement.AppMeasurement.FCM_ORIGIN, str, bundle);
        }
    }
}
