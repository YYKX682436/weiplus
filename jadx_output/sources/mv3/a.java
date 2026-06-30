package mv3;

/* loaded from: classes5.dex */
public final class a extends cv3.h {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f331671p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r1, int r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.o.g(r1, r3)
            r0.<init>(r1, r2)
            java.lang.String r1 = "MicroMsg.Finder.MusicPickerDrawer"
            r0.f331671p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mv3.a.<init>(android.content.Context, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // cv3.c
    public void b() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = d();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout finderMusicPickerComponentLayout = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout) d17 : null;
        if (finderMusicPickerComponentLayout != null) {
            finderMusicPickerComponentLayout.r();
        }
    }

    @Override // cv3.h
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout c() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout(this.f222569d, null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setLocalAudioList(java.util.List audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = d();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout finderMusicPickerComponentLayout = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout) d17 : null;
        if (finderMusicPickerComponentLayout != null) {
            finderMusicPickerComponentLayout.setLocalAudioList(audioList);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setPlayMusicWhenSearchFinish(boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = d();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout finderMusicPickerComponentLayout = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout) d17 : null;
        if (finderMusicPickerComponentLayout != null) {
            finderMusicPickerComponentLayout.setPlayFirstSongOnRecommendFinish(z17);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setup(java.lang.String videoPath, java.util.ArrayList imageList, long j17, long j18, boolean z17, st3.k config, boolean z18) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(imageList, "imageList");
        kotlin.jvm.internal.o.g(config, "config");
        int size = imageList.size();
        java.lang.String str = this.f331671p;
        com.tencent.mars.xlog.Log.i(str, "setup: before imageSize:" + size);
        if ((!imageList.isEmpty()) && size > 2 && kotlin.jvm.internal.o.b(imageList.get(0), imageList.get(size - 1))) {
            int i17 = size - 2;
            if (kotlin.jvm.internal.o.b(imageList.get(0), imageList.get(i17))) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(imageList.subList(0, i17));
                imageList.clear();
                imageList.addAll(arrayList);
            }
        }
        com.tencent.mars.xlog.Log.i(str, "setup: after imageSize:" + imageList.size());
        yu3.b bVar = new yu3.b(new yu3.a(config.f412551f.ordinal(), false, videoPath, imageList, j17, j18, config.f412546a, 2, null, null, 770, null), z17, config, z18);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = d();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout finderMusicPickerComponentLayout = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view.FinderMusicPickerComponentLayout) d17 : null;
        if (finderMusicPickerComponentLayout != null) {
            finderMusicPickerComponentLayout.setupConfig(bVar);
        }
    }
}
