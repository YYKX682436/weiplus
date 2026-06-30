package ev0;

/* loaded from: classes5.dex */
public final class f extends cu0.y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(context, ignoreBackgroundTouchEvent);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
    }

    @Override // cv3.c
    public void b() {
        ((com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout) e()).u();
    }

    @Override // cv3.h
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout c() {
        com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout movieComposingMusicPickerComponentLayout = new com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout(this.f222569d, null);
        movieComposingMusicPickerComponentLayout.setMusicPickerDrawer(this);
        return movieComposingMusicPickerComponentLayout;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void onSelectMusic(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        ((com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout) e()).v(info);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setLocalAudioList(java.util.List audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        ((com.tencent.mm.mj_publisher.finder.movie_composing.music.MovieComposingMusicPickerComponentLayout) e()).setLocalAudioList(audioList);
    }
}
