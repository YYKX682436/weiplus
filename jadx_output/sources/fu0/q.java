package fu0;

/* loaded from: classes5.dex */
public final class q extends cu0.x {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f266810p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        super(recordConfigProvider, context, ignoreBackgroundTouchEvent);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f266810p = "MicroMsg.CreationComposingMusicPicker";
    }

    @Override // cu0.x
    public boolean c(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        if (audioCacheInfo != null) {
            return audioCacheInfo.f155709J;
        }
        return false;
    }

    @Override // cu0.x
    public cu0.y d(yz5.l ignoreBackgroundTouchEvent) {
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        return new fu0.u(this.f222351a, ignoreBackgroundTouchEvent);
    }

    @Override // cu0.x
    public java.lang.String j() {
        return this.f266810p;
    }

    @Override // cu0.x
    public void k() {
        if (l()) {
            return;
        }
        if (this.f222355e != null) {
            super.k();
        } else {
            this.f222353c.d();
        }
    }

    @Override // cu0.x
    public boolean l() {
        return ((com.tencent.mm.mj_publisher.finder.composing_creation.music.CreationComposingMusicPickerComponentLayout) g().e()).r();
    }

    @Override // cu0.x
    public boolean m() {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f222355e;
        if (audioCacheInfo == null) {
            return false;
        }
        if (audioCacheInfo.f155716m) {
            java.lang.String str = audioCacheInfo.f155715i;
            if (!(str == null || str.length() == 0) && com.tencent.mm.vfs.w6.j(audioCacheInfo.f155715i)) {
                return false;
            }
        }
        return super.m();
    }

    @Override // cu0.x
    public void n(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f222355e;
        if (z17 && this.f222355e == null) {
            g().toggleLyrics(false);
        }
    }
}
