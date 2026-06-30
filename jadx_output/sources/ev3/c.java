package ev3;

/* loaded from: classes5.dex */
public interface c {
    void J(int i17, java.lang.String str);

    default void K(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
    }

    default void L(int i17, java.lang.String musicKey, cw3.g mode) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        kotlin.jvm.internal.o.g(mode, "mode");
    }

    default void S(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
    }

    default void o(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18, int i18, boolean z19) {
    }

    default void q(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
    }

    default void w(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
    }

    void y(int i17, java.lang.String str);
}
