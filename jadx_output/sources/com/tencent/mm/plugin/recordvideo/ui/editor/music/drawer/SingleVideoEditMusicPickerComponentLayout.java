package com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/drawer/SingleVideoEditMusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/MusicPickerComponentLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerSingleVideoEditRecommendFragment;", "getDefaultTabFragmentInstance", "", "getPageTypeArray", "", "getDefaultSelectPageTabType", "Lyu3/b;", "setupInfo", "Ljz5/f0;", "setupConfig", "", "Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "audioList", "setLocalAudioList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class SingleVideoEditMusicPickerComponentLayout extends com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f156329n = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f156330m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleVideoEditMusicPickerComponentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, false, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f156330m = "MicroMsg.SingleVideoEditMusicPickerComponentLayout";
    }

    private final com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerSingleVideoEditRecommendFragment getDefaultTabFragmentInstance() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerSingleVideoEditRecommendFragment) e(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerSingleVideoEditRecommendFragment.class);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int getDefaultSelectPageTabType() {
        return 6;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public int[] getPageTypeArray() {
        return new int[]{6};
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 n() {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0(this, this, getPageTypeArray(), getDefaultSelectPageTabType(), new gv3.a(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a o() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_music_search_use_finder_cgi, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.XConfigUtil", "isMusicSearchUseFinderCgi:" + fj6);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 bVar = fj6 ? new uv3.b(this, this, null, false, 12, null) : new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.p1(this, this);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = d();
        bVar.A = d17 != null ? d17.w() : null;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d18 = d();
        bVar.B = d18 != null ? d18.f156223p : null;
        return bVar;
    }

    public void r() {
        com.tencent.mars.xlog.Log.i(this.f156330m, "onActivate: ");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerSingleVideoEditRecommendFragment defaultTabFragmentInstance = getDefaultTabFragmentInstance();
        if (defaultTabFragmentInstance != null) {
            defaultTabFragmentInstance.M0();
        }
    }

    public final void setLocalAudioList(java.util.List<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerSingleVideoEditRecommendFragment defaultTabFragmentInstance = getDefaultTabFragmentInstance();
        if (defaultTabFragmentInstance != null) {
            defaultTabFragmentInstance.P0(audioList);
        }
    }

    public final void setupConfig(yu3.b setupInfo) {
        kotlin.jvm.internal.o.g(setupInfo, "setupInfo");
        com.tencent.mars.xlog.Log.i(this.f156330m, "setupConfig: ");
        st3.k kVar = setupInfo.f465863c;
        if (setupInfo.f465862b) {
            kVar.f412549d = false;
        }
        setupLyricsGroup(kVar.f412547b);
        p(kVar.f412549d, kVar.f412548c);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerSingleVideoEditRecommendFragment defaultTabFragmentInstance = getDefaultTabFragmentInstance();
        if (defaultTabFragmentInstance != null) {
            defaultTabFragmentInstance.R0(setupInfo.f465861a);
        }
    }
}
