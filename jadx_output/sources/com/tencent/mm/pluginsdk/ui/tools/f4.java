package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public interface f4 {
    void a(double d17, boolean z17);

    void b(double d17);

    boolean c(android.content.Context context, boolean z17);

    int getCurrentPosition();

    int getDuration();

    double getLastProgresstime();

    long getLastSurfaceUpdateTime();

    java.lang.String getVideoPath();

    boolean isPlaying();

    void onDetach();

    void pause();

    void setLoop(boolean z17);

    void setMute(boolean z17);

    void setOnInfoCallback(com.tencent.mm.pluginsdk.ui.tools.b4 b4Var);

    void setOnSeekCompleteCallback(com.tencent.mm.pluginsdk.ui.tools.c4 c4Var);

    void setOnSurfaceCallback(com.tencent.mm.pluginsdk.ui.tools.d4 d4Var);

    void setOneTimeVideoTextureUpdateCallback(com.tencent.mm.pluginsdk.ui.tools.e4 e4Var);

    void setPlayProgressCallback(boolean z17);

    void setThumb(android.graphics.Bitmap bitmap);

    void setVideoCallback(com.tencent.mm.pluginsdk.ui.tools.a4 a4Var);

    void setVideoPath(java.lang.String str);

    boolean start();

    void stop();
}
