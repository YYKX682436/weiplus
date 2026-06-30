package zy2;

/* loaded from: classes2.dex */
public interface g5 {
    static /* synthetic */ boolean u(zy2.g5 g5Var, java.lang.Integer num, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startOrPlay");
        }
        if ((i17 & 1) != 0) {
            num = null;
        }
        return g5Var.J(num);
    }

    boolean J(java.lang.Integer num);

    boolean a(double d17, boolean z17);

    void b();

    void d();

    long getCurrentPlayMs();

    int getCurrentPlaySecond();

    long getCurrentStartPlayMs();

    int getVideoDuration();

    long getVideoDurationMs();

    android.view.View getVideoView();

    boolean getVideoViewFocused();

    boolean isPlaying();

    default boolean l() {
        return isPlaying();
    }

    boolean pause();

    boolean play();

    boolean r(double d17, boolean z17, int i17);

    void setCustomSurface(android.view.Surface surface);

    void setCustomSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture);

    void setIMMVideoViewCallback(zy2.ub ubVar);

    void setLoop(boolean z17);

    void setMute(boolean z17);

    void setVideoViewFocused(boolean z17);

    void stop();

    boolean t();
}
