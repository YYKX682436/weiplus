package cr;

/* loaded from: classes12.dex */
public abstract class m {
    public static final boolean a(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        return (emojiInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_encrypturl) || com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_aeskey)) ? false : true;
    }

    public static final boolean b(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        boolean z17;
        boolean z18;
        if (emojiInfo == null) {
            return false;
        }
        if (!gr.z.f274703a) {
            int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableEmoticonExternUrl", 0);
            int errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.getErrorCode();
            if ((b17 & 1) == 1) {
                try {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageInfo("com.google.android.wearable.app.cn", 1);
                    z17 = true;
                } catch (java.lang.Throwable unused) {
                    z17 = false;
                }
                if (!z17) {
                    try {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageInfo("com.google.android.wearable.app", 1);
                        z18 = true;
                    } catch (android.util.AndroidException | java.lang.Exception unused2) {
                        z18 = false;
                    }
                    if (!z18) {
                        gr.z.f274706d = true;
                    }
                }
                gr.z.f274706d = false;
            } else {
                gr.z.f274706d = false;
            }
            if (errorCode < 0) {
                gr.z.f274706d = false;
                switch (errorCode) {
                    case -906:
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 10L, 1L, false);
                        break;
                    case -905:
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 9L, 1L, false);
                        break;
                    case -904:
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 8L, 1L, false);
                        break;
                    case -903:
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 7L, 1L, false);
                        break;
                    case -902:
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 6L, 1L, false);
                        break;
                    case -901:
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 5L, 1L, false);
                        break;
                }
            }
            gr.z.f274703a = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDownload:%b", java.lang.Boolean.valueOf(gr.z.f274706d));
        }
        return (!(gr.z.f274706d && ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj()) || com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_externUrl) || com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_aeskey)) ? false : true;
    }
}
