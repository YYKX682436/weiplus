package gt0;

/* loaded from: classes10.dex */
public interface a extends gt0.d {
    boolean g();

    et0.q getCameraPreviewView();

    android.content.Context getContext();

    default com.tencent.mm.modelcontrol.VideoTransPara getDaemonVideoTransPara() {
        return getVideoTransPara();
    }

    ct0.a getEncodeConfig();

    default ms0.c getPreviewRenderer() {
        return null;
    }

    default ms0.c getRecordRenderer() {
        return null;
    }

    default ht0.b getRecorder() {
        return null;
    }

    com.tencent.mm.modelcontrol.VideoTransPara getVideoTransPara();

    default boolean isMute() {
        return false;
    }

    default boolean j() {
        return false;
    }

    default boolean m() {
        return false;
    }
}
