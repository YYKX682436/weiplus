package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerSingleVideoEditRecommendFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MusicPickerSingleVideoEditRecommendFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment {
    public MusicPickerSingleVideoEditRecommendFragment(ev3.d dVar) {
        super(dVar, false, 2, null);
        hashCode();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public in5.s B0(yz5.p pVar) {
        return new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerSingleVideoEditRecommendFragment$buildRVItemConverts$1(pVar);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public dv3.c C0(java.util.ArrayList initData) {
        kotlin.jvm.internal.o.g(initData, "initData");
        return new dv3.f(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerSingleVideoEditRecommendFragment$buildRVItemConverts$1(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.p(this)), initData);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public boolean H0() {
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 6;
    }
}
