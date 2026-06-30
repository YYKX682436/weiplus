package xx5;

/* loaded from: classes8.dex */
public abstract class e {
    public static void a(int i17, boolean z17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = "20260502," + i17 + "," + str + "," + (z17 ? 1 : 0) + "," + i18 + "," + str2 + "," + str3.replaceAll(",", " ");
        by5.c4.f("KVReportForChildProcessException", "report:" + str4);
        by5.s0.t(26120, str4);
    }
}
