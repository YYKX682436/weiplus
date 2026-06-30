package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerTemplateClipRecommendFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MusicPickerTemplateClipRecommendFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment {

    /* renamed from: n, reason: collision with root package name */
    public final ev3.d f156405n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f156406o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f156407p;

    public MusicPickerTemplateClipRecommendFragment(ev3.d dVar) {
        super(dVar);
        this.f156405n = dVar;
        this.f156406o = "MicroMsg.MusicPickerSnsTemplateRecommendFragment";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.q qVar = new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.q(this);
        dv3.f fVar = new dv3.f(new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerTemplateClipRecommendFragment$buildRVItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new rv3.s(yz5.p.this);
            }
        }, arrayList);
        fVar.f293105o = new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.r(this, fVar);
        this.f156381e = fVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 5;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i(this.f156406o, "onDestroy: ");
        p0();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        com.tencent.mars.xlog.Log.i(this.f156406o, "onViewCreated: ");
        if (this.f156407p) {
            return;
        }
        x0();
    }
}
