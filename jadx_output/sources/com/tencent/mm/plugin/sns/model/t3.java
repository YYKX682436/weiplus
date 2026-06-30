package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class t3 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f164686e;

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f164687f = new char[36];

    /* renamed from: a, reason: collision with root package name */
    public boolean f164688a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f164689b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f164690c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f164691d = new com.tencent.mm.plugin.sns.model.r3(this, android.os.Looper.getMainLooper());

    static {
        int i17 = 0;
        int i18 = 48;
        while (i18 <= 57) {
            f164687f[i17] = (char) i18;
            i18++;
            i17++;
        }
        int i19 = 97;
        while (i19 <= 122) {
            f164687f[i17] = (char) i19;
            i19++;
            i17++;
        }
    }

    public static boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delFileByTime", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        boolean z17 = false;
        java.util.Iterator it = com.tencent.mm.vfs.w6.s(str, false).iterator();
        while (true) {
            if (!it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delFileByTime", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                z17 = true;
                break;
            }
            com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) it.next();
            if (!f164686e) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delFileByTime", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
                break;
            }
            if (x1Var.f213232b != null && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && str3 != null) {
                java.lang.String str4 = x1Var.f213232b;
                if (!str4.contains(str2) && !str4.contains(str3)) {
                }
            }
            if (!x1Var.f213236f) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (java.lang.System.currentTimeMillis() - x1Var.f213235e > 604800000) {
                    x1Var.a();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.RemoveSnsTask");
        return z17;
    }
}
