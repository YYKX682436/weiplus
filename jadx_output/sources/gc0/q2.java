package gc0;

/* loaded from: classes5.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final gc0.q2 f270257a = new gc0.q2();

    public final long a() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkChattingTimeLimit()) * 60 * 1000;
    }

    public final long b(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        long j17 = gc0.f0.f270167a.b(str).getLong(3);
        if (j17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemarkRecommendConfig", "getTalkerAddTime() sayHiTime: " + k35.m1.e(j17));
            return j17;
        }
        long c17 = g95.e.f269801a.c(str) * 1000;
        long max = java.lang.Math.max(j17, c17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemarkRecommendConfig", "getTalkerAddTime() sayHiTime: " + k35.m1.e(j17) + " contactCreateTime " + k35.m1.e(c17) + ", addTime: " + max);
        return max;
    }
}
