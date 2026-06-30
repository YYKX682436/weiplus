package gv3;

/* loaded from: classes5.dex */
public final class b extends cv3.h {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f276109p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, int i17) {
        super(context, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f276109p = "MicroMsg.Finder.MusicPickerDrawer";
    }

    @Override // cv3.c
    public vu3.c a() {
        return new vu3.b(this.f222569d, 0, 2, null);
    }

    @Override // cv3.c
    public void b() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout e17 = e();
        if (e17 != null) {
            e17.r();
        }
    }

    @Override // cv3.h
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout c() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout(this.f222569d, null);
    }

    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout e() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = d();
        if (d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout) {
            return (com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout) d17;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setLocalAudioList(java.util.List audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout e17 = e();
        if (e17 != null) {
            e17.setLocalAudioList(audioList);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setPlayMusicWhenSearchFinish(boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout e17 = e();
        if (e17 != null) {
            e17.setPlayFirstSongOnRecommendFinish(z17);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setup(java.lang.String videoPath, java.util.ArrayList imageList, long j17, long j18, boolean z17, st3.k config, boolean z18) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(imageList, "imageList");
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mars.xlog.Log.i(this.f276109p, "setup: ");
        yu3.b bVar = new yu3.b(new yu3.a(config.f412551f.ordinal(), false, videoPath, imageList, j17, j18, config.f412546a, 0, null, null, ce1.i.CTRL_INDEX, null), z17, config, z18);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout e17 = e();
        if (e17 != null) {
            e17.setupConfig(bVar);
        }
    }
}
