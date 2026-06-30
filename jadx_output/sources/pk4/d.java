package pk4;

/* loaded from: classes3.dex */
public interface d {
    void a(double d17, boolean z17);

    void b(double d17);

    boolean c(android.content.Context context, boolean z17);

    boolean d();

    boolean e();

    void f(ok4.d dVar);

    void g();

    int getCurrentPosition();

    int getDuration();

    double getLastProgresstime();

    long getLastSurfaceUpdateTime();

    com.tencent.mm.pluginsdk.ui.e1 getScaleType();

    java.lang.String getVideoPath();

    float getVideoSpeedRatio();

    boolean isInitialized();

    boolean isMuted();

    boolean isPlaying();

    void onDetach();

    void pause();

    void prepare();

    void setAutoFixRotation(boolean z17);

    void setDolbyEnable(boolean z17);

    void setLoop(boolean z17);

    void setMute(boolean z17);

    void setOnInfoCallback(com.tencent.mm.pluginsdk.ui.tools.b4 b4Var);

    void setOnSeekCompleteCallback(com.tencent.mm.pluginsdk.ui.tools.c4 c4Var);

    void setOneTimeVideoTextureUpdateCallback(com.tencent.mm.pluginsdk.ui.tools.e4 e4Var);

    void setOnlineVideo(boolean z17);

    void setPlayProgressCallback(boolean z17);

    void setResourceDownloader(fk4.u uVar);

    void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var);

    void setVideoCallback(com.tencent.mm.pluginsdk.ui.tools.a4 a4Var);

    void setVideoPath(java.lang.String str);

    void setVideoSpeedRatio(float f17);

    boolean start();

    void stop();
}
