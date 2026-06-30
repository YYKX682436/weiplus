package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.view;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/view/FinderMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout;", "", "getRecentPlayedType", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment;", "getDefaultTabFragmentInstance", "", "getPageTypeArray", "getDefaultSelectPageTabType", "getLikeTabType", "", "yes", "Ljz5/f0;", "setPlayFirstSongOnRecommendFinish", "Lyu3/b;", "setupInfo", "setupConfig", "", "Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "audioList", "setLocalAudioList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderMusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f156379m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMusicPickerComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, false, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f156379m = "MicroMsg.Finder.MusicPickerComponentLayout";
    }

    private final com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment getDefaultTabFragmentInstance() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment) e(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerEditRecommendFragment.class);
    }

    private final int getRecentPlayedType() {
        return 14;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getDefaultSelectPageTabType() {
        return 7;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getLikeTabType() {
        return 9;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int[] getPageTypeArray() {
        java.util.List k17 = kz5.c0.k(java.lang.Integer.valueOf(getDefaultSelectPageTabType()), java.lang.Integer.valueOf(getLikeTabType()));
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((c61.p7) ((m40.k0) c17)).hj(m40.j0.f323411g)) {
            k17.add(java.lang.Integer.valueOf(getRecentPlayedType()));
        }
        return kz5.n0.R0(k17);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f k() {
        return new kv3.a(this, this, getDefaultSelectPageTabType());
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a o() {
        kv3.h hVar = new kv3.h(this, this, false, null, false, null, false, 124, null);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        hVar.A = d17 != null ? d17.w() : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d18 = d();
        hVar.B = d18 != null ? d18.f156223p : null;
        return hVar;
    }

    public void r() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment defaultTabFragmentInstance = getDefaultTabFragmentInstance();
        if (defaultTabFragmentInstance != null) {
            defaultTabFragmentInstance.M0();
        }
    }

    public final void setLocalAudioList(java.util.List<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment defaultTabFragmentInstance = getDefaultTabFragmentInstance();
        if (defaultTabFragmentInstance != null) {
            defaultTabFragmentInstance.P0(audioList);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public void setPlayFirstSongOnRecommendFinish(boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment defaultTabFragmentInstance = getDefaultTabFragmentInstance();
        if (defaultTabFragmentInstance != null) {
            defaultTabFragmentInstance.f156401t = z17;
        }
    }

    public final void setupConfig(yu3.b setupInfo) {
        kotlin.jvm.internal.o.g(setupInfo, "setupInfo");
        com.tencent.mars.xlog.Log.i(this.f156379m, "setupConfig: ");
        st3.k kVar = setupInfo.f465863c;
        if (setupInfo.f465862b) {
            kVar.f412549d = false;
        }
        setupLyricsGroup(kVar.f412547b);
        p(kVar.f412549d, kVar.f412548c);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment defaultTabFragmentInstance = getDefaultTabFragmentInstance();
        if (defaultTabFragmentInstance != null) {
            defaultTabFragmentInstance.R0(setupInfo.f465861a);
        }
    }
}
