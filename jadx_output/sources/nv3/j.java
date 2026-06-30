package nv3;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f340683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout f340684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f340685f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout musicPickerComponentLayout, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        super(2);
        this.f340683d = i17;
        this.f340684e = musicPickerComponentLayout;
        this.f340685f = audioCacheInfo;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yz5.q musicClipChangeListener$plugin_recordvideo_release;
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderMusicClipHelper", "onClipChanged: musicId=" + this.f340683d + " startMs=" + longValue + " durationMs=" + longValue2);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout musicPickerComponentLayout = this.f340684e;
        if (musicPickerComponentLayout != null && (musicClipChangeListener$plugin_recordvideo_release = musicPickerComponentLayout.getMusicClipChangeListener$plugin_recordvideo_release()) != null) {
            musicClipChangeListener$plugin_recordvideo_release.invoke(this.f340685f, java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2));
        }
        return jz5.f0.f302826a;
    }
}
