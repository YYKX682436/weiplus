package ev3;

/* loaded from: classes5.dex */
public interface a extends com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a {
    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    default void a() {
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    default void b(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    default void c(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a
    default void d() {
    }
}
