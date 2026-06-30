package n22;

/* loaded from: classes8.dex */
public abstract class c {
    public static void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomReport", "reportEmojiMgrAction action:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11596, java.lang.Integer.valueOf(i17));
    }

    public static void b(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomReport", "reportEmojiMgrAction action:%d, scene:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11596, i17 + "," + i18);
    }

    public static void c(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomReport", "reportEmojiMgrAction action:%d, scene:%d, success:%d, fail:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11596, i17 + "," + i18 + "," + i19 + "," + i27);
    }
}
