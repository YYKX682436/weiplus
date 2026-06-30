package ev3;

/* loaded from: classes5.dex */
public interface d {
    static /* synthetic */ void e(ev3.d dVar, int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSelectMusic");
        }
        dVar.l(i17, audioCacheInfo, z17, (i18 & 8) != 0 ? false : z18, (i18 & 16) != 0 ? false : z19);
    }

    default void a() {
    }

    default void b(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
    }

    void c(int i17, ev3.c cVar);

    default com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo d() {
        return null;
    }

    default com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f() {
        return null;
    }

    default void g() {
    }

    default void i(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
    }

    void k(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, int i17, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle);

    void l(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18, boolean z19);
}
