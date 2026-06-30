package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerNewLifeRecommendDataFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MusicPickerNewLifeRecommendDataFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment {
    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public wt3.e F0(yu3.a createInfo) {
        kotlin.jvm.internal.o.g(createInfo, "createInfo");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(createInfo.f465853c)) {
            return new wt3.e0(this.f156385i, createInfo, 0, 4, null);
        }
        return new wt3.t0(this.f156385i, createInfo.f465854d, createInfo.f465851a, getActivity());
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public boolean G0() {
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public void K0() {
        wt3.e eVar = this.f156397p;
        wt3.t0 t0Var = eVar instanceof wt3.t0 ? (wt3.t0) eVar : null;
        if (t0Var == null) {
            return;
        }
        t0Var.f449499t = new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.g(this);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment
    public void Q0(java.lang.String str) {
        wt3.e eVar = this.f156397p;
        wt3.t0 t0Var = eVar instanceof wt3.t0 ? (wt3.t0) eVar : null;
        wt3.v0 v0Var = t0Var != null ? t0Var.f449498s : null;
        if (v0Var == null) {
            return;
        }
        v0Var.f449520g = str;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 11;
    }
}
