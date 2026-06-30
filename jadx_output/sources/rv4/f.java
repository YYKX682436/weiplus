package rv4;

/* loaded from: classes.dex */
public final class f implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((org.json.JSONObject) obj2).optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)), java.lang.Long.valueOf(((org.json.JSONObject) obj).optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)));
    }
}
