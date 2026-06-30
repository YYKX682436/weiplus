package h12;

/* loaded from: classes8.dex */
public abstract class f {
    public static void a(long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiReportHepler", "report id stat key:%d, value:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(96L, j17, j18, false);
    }

    public static void b(java.lang.String str, int i17, int i18, int i19, java.lang.String str2, int i27, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiReportHepler", "report kv stat md5:%s, downType:%d donwloadResult:%d verifyResult:%d productID:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12007, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str2, java.lang.Integer.valueOf(i27), str3);
    }
}
