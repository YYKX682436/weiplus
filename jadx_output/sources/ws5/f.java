package ws5;

/* loaded from: classes3.dex */
public interface f {
    static /* synthetic */ void j(ws5.f fVar, yz5.a aVar, yz5.a aVar2, yz5.p pVar, yz5.l lVar, yz5.a aVar3, yz5.a aVar4, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i17 & 1) != 0) {
            aVar = null;
        }
        if ((i17 & 2) != 0) {
            aVar2 = null;
        }
        if ((i17 & 4) != 0) {
            pVar = null;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        if ((i17 & 16) != 0) {
            aVar3 = null;
        }
        if ((i17 & 32) != 0) {
            aVar4 = null;
        }
        fVar.c(aVar, aVar2, pVar, lVar, aVar3, aVar4);
    }

    android.view.View H();

    void c(yz5.a aVar, yz5.a aVar2, yz5.p pVar, yz5.l lVar, yz5.a aVar3, yz5.a aVar4);

    java.lang.Object e();

    android.view.View f();

    default boolean g() {
        return false;
    }

    long getBindFeedId();

    android.view.View getCoverView();

    java.lang.Object getLivePlayer();

    int getPlayStatus();

    java.lang.String getStreamId();

    android.view.TextureView getTextureView();

    int getVideoHeight();

    float getVideoRatioWH();

    int getVideoWidth();

    default void h(android.graphics.Rect currentRect) {
        kotlin.jvm.internal.o.g(currentRect, "currentRect");
    }

    boolean isMute();

    boolean isPlaying();

    boolean k();

    boolean o();

    boolean pause();

    java.lang.Object q();

    void release();

    void resume();

    void setMute(boolean z17);

    void stop();
}
