package rv4;

/* loaded from: classes12.dex */
public final class j {
    public j(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(org.json.JSONObject jSONObject, rv4.m mVar) {
        boolean z17 = true;
        if (mVar == null) {
            return true;
        }
        long optLong = jSONObject.optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP);
        long j17 = optLong ^ Long.MIN_VALUE;
        int compare = java.lang.Long.compare(j17, Long.MIN_VALUE);
        long j18 = mVar.f400521a;
        if (compare > 0) {
            long j19 = j18 ^ Long.MIN_VALUE;
            if (java.lang.Long.compare(j19, Long.MIN_VALUE) > 0 && java.lang.Long.compare(j17, j19) < 0) {
                z17 = false;
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("FTSGlobalTeachHistory", "filter history " + jSONObject + " for timestamp " + ((java.lang.Object) jz5.x.a(optLong)) + " and minTimestamp " + ((java.lang.Object) jz5.x.a(j18)));
        }
        return z17;
    }
}
