package com.tencent.mm.plugin.recordvideo.ui.editor.music;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/NewLifeMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout;", "", "getPageTypeArray", "", "getDefaultSelectPageTabType", "Lyu3/b;", "setupInfo", "Ljz5/f0;", "setupConfig", "", "Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "audioList", "setLocalAudioList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewLifeMusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewLifeMusicPickerComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, false, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getDefaultSelectPageTabType() {
        return 11;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int[] getPageTypeArray() {
        return new int[]{11, 2};
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a o() {
        kv3.h hVar = new kv3.h(this, this, false, r45.yv0.kFinderBgmListTypeNewLifeSearch, false, null, false, 116, null);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        hVar.A = d17 != null ? d17.w() : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d18 = d();
        hVar.B = d18 != null ? d18.f156223p : null;
        return hVar;
    }

    public final void setLocalAudioList(java.util.List<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        androidx.fragment.app.Fragment o17 = h0Var != null ? h0Var.o(getDefaultSelectPageTabType()) : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment = o17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment) o17 : null;
        if (musicPickerRecommendDataFragment != null) {
            musicPickerRecommendDataFragment.P0(audioList);
        }
    }

    public final void setupConfig(yu3.b setupInfo) {
        kotlin.jvm.internal.o.g(setupInfo, "setupInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoRegisterComponentLayout", "setupConfig: ");
        st3.k kVar = setupInfo.f465863c;
        if (setupInfo.f465862b) {
            kVar.f412549d = false;
        }
        setupLyricsGroup(kVar.f412547b);
        p(kVar.f412549d, kVar.f412548c);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        androidx.fragment.app.Fragment o17 = h0Var != null ? h0Var.o(getDefaultSelectPageTabType()) : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment = o17 instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment ? (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment) o17 : null;
        if (musicPickerRecommendDataFragment != null) {
            musicPickerRecommendDataFragment.R0(setupInfo.f465861a);
        }
    }
}
