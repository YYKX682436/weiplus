package cv3;

/* loaded from: classes5.dex */
public final class i extends cv3.h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.content.Context r1, int r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.o.g(r1, r3)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cv3.i.<init>(android.content.Context, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // cv3.c
    public void b() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = d();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout newLifeMusicPickerComponentLayout = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout) d17 : null;
        if (newLifeMusicPickerComponentLayout != null) {
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) newLifeMusicPickerComponentLayout.b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
            androidx.lifecycle.m1 o17 = h0Var != null ? h0Var.o(newLifeMusicPickerComponentLayout.getDefaultSelectPageTabType()) : null;
            com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment = o17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment) o17 : null;
            if (musicPickerRecommendDataFragment != null) {
                musicPickerRecommendDataFragment.M0();
            }
        }
    }

    @Override // cv3.h
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout c() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout(this.f222569d, null);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setLocalAudioList(java.util.List audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = d();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout newLifeMusicPickerComponentLayout = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout) d17 : null;
        if (newLifeMusicPickerComponentLayout != null) {
            newLifeMusicPickerComponentLayout.setLocalAudioList(audioList);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setup(java.lang.String videoPath, java.util.ArrayList imageList, long j17, long j18, boolean z17, st3.k config, boolean z18) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(imageList, "imageList");
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeMusicPickerDrawer", "setup: ");
        yu3.b bVar = new yu3.b(new yu3.a(config.f412551f.ordinal(), false, videoPath, imageList, j17, j18, config.f412546a, 0, null, null, ce1.i.CTRL_INDEX, null), z17, config, z18);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout d17 = d();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout newLifeMusicPickerComponentLayout = d17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.NewLifeMusicPickerComponentLayout) d17 : null;
        if (newLifeMusicPickerComponentLayout != null) {
            newLifeMusicPickerComponentLayout.setupConfig(bVar);
        }
    }
}
