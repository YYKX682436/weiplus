package wf4;

/* loaded from: classes.dex */
public abstract class k {
    public static final void a(boolean z17, java.lang.String str) {
        if (z17) {
            try {
                com.tencent.mm.vfs.w6.h(str);
                com.tencent.mars.xlog.Log.i("ExtTranslateVoiceEventListenerKtHelper", "cleanUpTempFile deleted: " + str);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("ExtTranslateVoiceEventListenerKtHelper", "cleanUpTempFile failed to delete: " + str);
            }
        }
    }

    public static final boolean b() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceMsgIlink()) == 1;
    }
}
