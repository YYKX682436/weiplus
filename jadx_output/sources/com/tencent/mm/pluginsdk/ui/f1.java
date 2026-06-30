package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public interface f1 {
    boolean a(double d17, boolean z17);

    boolean c(float f17);

    void d();

    void e();

    void g();

    int getCacheTimeSec();

    int getCurrPosMs();

    int getCurrPosSec();

    int getPlayerType();

    int getVideoDurationSec();

    void h(boolean z17, java.lang.String str, int i17);

    boolean isPlaying();

    boolean j();

    boolean pause();

    boolean play();

    void setCover(android.graphics.Bitmap bitmap);

    void setFullDirection(int i17);

    void setIsShowBasicControls(boolean z17);

    void setLoop(boolean z17);

    void setLoopCompletionCallback(com.tencent.mm.pluginsdk.ui.d1 d1Var);

    void setMute(boolean z17);

    void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var);

    void setVideoFooterView(com.tencent.mm.pluginsdk.ui.z0 z0Var);

    void start();

    void stop();
}
