package oe1;

/* loaded from: classes15.dex */
public interface o1 {
    boolean a(double d17, boolean z17);

    boolean b(double d17);

    boolean c(float f17);

    void d();

    void e();

    void g();

    int getCacheTimeSec();

    int getCurrPosMs();

    int getCurrPosSec();

    int getPlayerType();

    int getVideoDurationSec();

    android.view.View getView();

    void h(boolean z17, java.lang.String str, int i17);

    boolean isPlaying();

    boolean j();

    void m();

    boolean pause();

    boolean play();

    void setCover(android.graphics.Bitmap bitmap);

    void setFullDirection(int i17);

    void setIMMVideoViewCallback(oe1.h1 h1Var);

    void setIsShowBasicControls(boolean z17);

    default void setMinBufferDuration(long j17) {
    }

    void setMute(boolean z17);

    void setScaleType(oe1.m1 m1Var);

    void setVideoContext(oe1.s1 s1Var);

    void setVideoFooterView(oe1.g1 g1Var);

    void setVideoSource(int i17);

    void start();

    void stop();
}
