package u42;

/* loaded from: classes4.dex */
public class b {
    public boolean a(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.sdk.platformtools.o4 f17;
        java.lang.String str3;
        if (u46.l.e(str) || i17 <= 0 || u46.l.e(str2) || (f17 = g42.i.f()) == null) {
            return false;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        if (u46.l.e(str) || u46.l.e(valueOf)) {
            str3 = null;
        } else {
            str3 = "mmkv_key_realtime_report_cache_" + str + "_" + valueOf;
        }
        if (u46.l.e(str3)) {
            return false;
        }
        r45.uh0 uh0Var = new r45.uh0();
        byte[] j17 = f17.j(str3);
        if (j17 == null || j17.length <= 0) {
            uh0Var.f387375d = str;
            uh0Var.f387376e = i17;
        } else {
            try {
                uh0Var.parseFrom(j17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EdgeComputingRtReportCache", "[EdgeComputingRtReportCache] save parse rtReportItem throw Exception : " + e17.getMessage());
                return false;
            }
        }
        uh0Var.f387377f.add(str2);
        try {
            com.tencent.mars.xlog.Log.i("EdgeComputingRtReportCache", "[EdgeComputingConfigService] rtReportItem encode mmkvEncode : " + f17.H(str3, uh0Var.toByteArray()));
            return true;
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("EdgeComputingRtReportCache", "[EdgeComputingRtReportCache] rtReportItem encode throw IOException : " + e18.getMessage());
            return false;
        }
    }
}
