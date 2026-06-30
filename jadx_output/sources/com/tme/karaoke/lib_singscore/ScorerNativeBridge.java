package com.tme.karaoke.lib_singscore;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 42\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b2\u00103J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 J:\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0086 ¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000fH\u0086 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0001H\u0086 J\u0011\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0001H\u0086 J\u0011\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0001H\u0086 J\u0011\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0001H\u0086 J\u0011\u0010\u001e\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u001dH\u0086 J\t\u0010\u001f\u001a\u00020\bH\u0086 J\u0011\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\bH\u0086 J\u0011\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001dH\u0086 J\t\u0010$\u001a\u00020\u0012H\u0086 J\t\u0010%\u001a\u00020\u0012H\u0086 J\"\u0010(\u001a\u00020\u00122\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u000fH\u0086 ¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0086 J\u000b\u0010.\u001a\u0004\u0018\u00010-H\u0086 R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/tme/karaoke/lib_singscore/ScorerNativeBridge;", "", "Lcom/tme/karaoke/lib_singscore/ScoreInfo;", "info", "Lcom/tme/karaoke/lib_singscore/ScoreOption;", "option", "Lcom/tme/karaoke/lib_singscore/ScoreConfig;", "config", "", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "", "pcmData", "", "timeStamp", "dataLen", "", "", "pitchs", "Ljz5/f0;", "processWithBuffer", "([BFI[[F)V", "Lcom/tme/karaoke/lib_singscore/NoteItem;", "getAllGrove", "()[Lcom/tme/karaoke/lib_singscore/NoteItem;", "callback", "setGroveAndHitCallback", "setScoreUpdateCallback", "setMultiScoreTmpCallback", "setMultiTotalScoreTmpCallback", "", "seek", "getStcCount", "keyShift", "setKeyShift", "reduceRatio", "setReduceRatio", "finish", "unInit", "Lcom/tme/karaoke/lib_singscore/MultiScoreResult;", "multiScoreResults", "updateMultiStcResults", "([Lcom/tme/karaoke/lib_singscore/MultiScoreResult;)V", io.flutter.plugin.editing.SpellCheckPlugin.START_INDEX_KEY, io.flutter.plugin.editing.SpellCheckPlugin.END_INDEX_KEY, "calculateMultiScore", "", "getValidScoreArray", "", "nativeHandle", "J", "<init>", "()V", "Companion", "oy5/e", "lib_singscore_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class ScorerNativeBridge {
    public static final oy5.e Companion = new oy5.e(null);
    private static boolean loadRet;
    private static yz5.q log;
    private long nativeHandle;

    static {
        if (loadRet) {
            return;
        }
        loadRet = oy5.f.f350093a.a();
    }

    public static final void log(int i17, java.lang.String tag, java.lang.String msg) {
        Companion.getClass();
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        yz5.q qVar = log;
        if (qVar != null) {
            qVar.invoke(java.lang.Integer.valueOf(i17), tag, msg);
        }
    }

    public static final native int[] native_process(byte[] bArr, int i17);

    public static final native int native_processForTotal(byte[] bArr, int i17, int[] iArr, int i18, int i19);

    public static final void registerLog(yz5.q log2) {
        Companion.getClass();
        kotlin.jvm.internal.o.g(log2, "log");
        log = log2;
    }

    public static final void unregisterLog() {
        Companion.getClass();
        log = null;
    }

    public final native void calculateMultiScore(int i17, int i18);

    public final native void finish();

    public final native com.tme.karaoke.lib_singscore.NoteItem[] getAllGrove();

    public final native int getStcCount();

    public final native boolean[] getValidScoreArray();

    public final native int init(com.tme.karaoke.lib_singscore.ScoreInfo info, com.tme.karaoke.lib_singscore.ScoreOption option, com.tme.karaoke.lib_singscore.ScoreConfig config);

    public final native void processWithBuffer(byte[] pcmData, float timeStamp, int dataLen, float[][] pitchs);

    public final native void seek(double d17);

    public final native void setGroveAndHitCallback(java.lang.Object obj);

    public final native void setKeyShift(int i17);

    public final native void setMultiScoreTmpCallback(java.lang.Object obj);

    public final native void setMultiTotalScoreTmpCallback(java.lang.Object obj);

    public final native void setReduceRatio(double d17);

    public final native void setScoreUpdateCallback(java.lang.Object obj);

    public final native void unInit();

    public final native void updateMultiStcResults(com.tme.karaoke.lib_singscore.MultiScoreResult[] multiScoreResults);
}
