package r91;

/* loaded from: classes4.dex */
public class i implements r91.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f393448a;

    public i(android.content.Context context) {
        this.f393448a = context;
    }

    @Override // r91.f
    public android.os.Bundle a(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String string = bundle != null ? bundle.getString("type", com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN) : com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN;
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (string.hashCode() == 94921639) {
            string.equals(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN);
        }
        bundle2.putBoolean(ya.b.SUCCESS, true);
        bundle2.putString("type", string);
        bundle2.putString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "crash will be triggered after response");
        new android.os.Handler(this.f393448a.getMainLooper()).postDelayed(new r91.i$$a(), 100L);
        com.tencent.mars.xlog.Log.i("MicroMsg.QualityMockCmd", "qualityMock type=%s scheduled", string);
        return bundle2;
    }
}
