package kr5;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr5.c f311523d;

    public a(kr5.c cVar) {
        this.f311523d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kr5.c cVar = this.f311523d;
        cVar.getClass();
        android.content.SharedPreferences sharedPreferences = kr5.p.f311570a.getSharedPreferences("HTTPDNSFile", 0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = sharedPreferences.getLong("httpdnsIps_timestamp", 0L);
        java.lang.String string = sharedPreferences.getString("httpdnsIps", "");
        java.lang.String string2 = sharedPreferences.getString("httpType", "");
        java.util.List arrayList = new java.util.ArrayList();
        if (!string.isEmpty()) {
            if (currentTimeMillis <= j17) {
                if ((string2.equals(cVar.f311527b.f311554i) ? java.lang.Boolean.TRUE : (string2.equals("Https") || cVar.f311527b.f311554i.equals("Https")) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE).booleanValue()) {
                    arrayList = java.util.Arrays.asList(string.split(";"));
                }
            }
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove("httpdnsIps");
            edit.remove("httpType");
            edit.remove("httpdnsIps_timestamp");
            edit.apply();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        cVar.e(arrayList);
    }
}
