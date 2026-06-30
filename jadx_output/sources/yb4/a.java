package yb4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final yb4.a f460697a = new yb4.a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f460698b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f460699c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f460700d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f460701e;

    /* renamed from: f, reason: collision with root package name */
    public static long f460702f;

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canBrowseCmtImgOrEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        boolean z17 = true;
        if (!b()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canBrowseCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            boolean z18 = f460700d || f460701e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canBrowseCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            if (!z18) {
                z17 = false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canBrowseCmtImgOrEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        return z17;
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canBrowseEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        c();
        boolean z17 = f460698b || f460699c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canBrowseEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        return z17;
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUpdateConfig", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f460702f >= 600000) {
            boolean a07 = c01.e2.a0();
            f460702f = currentTimeMillis;
            f460698b = j62.e.g().c(a07 ? new com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonWechat() : new com.tencent.mm.plugin.sns.config.RCSnsCmtSendEmoticonInternal()) == 1;
            f460699c = j62.e.g().c(a07 ? new com.tencent.mm.plugin.sns.config.RCSnsCmtBrowseEmoticonWechat() : new com.tencent.mm.plugin.sns.config.RCSnsCmtBrowseEmoticonInternal()) == 1;
            f460700d = j62.e.g().c(a07 ? new com.tencent.mm.plugin.sns.config.RCSnsCmtSendImgWechat() : new com.tencent.mm.plugin.sns.config.RCSnsCmtSendImgInternal()) == 1;
            f460701e = j62.e.g().c(a07 ? new com.tencent.mm.plugin.sns.config.RCSnsCmtBrowseImgWechat() : new com.tencent.mm.plugin.sns.config.RCSnsCmtBrowseImgInternal()) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtEmoticonConfig", "checkUpdateConfig is time to update canSendEmoticon: " + f460698b + " canBrowseEmoticon: " + f460699c + " canSendCmtImg: " + f460700d + " canBrowseCmtImg: " + f460701e);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUpdateConfig", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
    }
}
