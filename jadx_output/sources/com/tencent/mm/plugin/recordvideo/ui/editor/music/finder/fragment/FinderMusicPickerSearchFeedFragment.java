package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerSearchFeedFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerSearchFragment;", "Liv3/b;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderMusicPickerSearchFeedFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment implements iv3.b {

    /* renamed from: w, reason: collision with root package name */
    public nv3.t f156346w;

    /* renamed from: x, reason: collision with root package name */
    public cv3.d f156347x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f156348y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMusicPickerSearchFeedFragment(ev3.d dVar, boolean z17, com.tencent.mm.plugin.vlog.model.i0 scene, yz5.a getSearchComponent) {
        super(dVar, z17, scene, getSearchComponent);
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(getSearchComponent, "getSearchComponent");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment
    public r45.yv0 B0() {
        return r45.yv0.kFinderBgmListTypeSearchFeedCard;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment
    public in5.s C0(yz5.a aVar, final yz5.p pVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFeedFragment$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type == 2 ? new rv3.k() : new ov3.b(yz5.p.this, this, false, false, 12, null);
            }
        };
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void F() {
        nv3.t tVar = this.f156346w;
        if (tVar != null) {
            tVar.f("showSearching");
        }
        x0();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1 F0() {
        return com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1.f156189e;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment
    public boolean G0() {
        nv3.t tVar = this.f156346w;
        if (tVar != null) {
            return tVar.f340716n;
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment
    public void H0(boolean z17) {
        this.f156348y = z17;
        nv3.t tVar = this.f156346w;
        if (tVar != null) {
            tVar.f340710h = z17;
            if (z17) {
                tVar.b(false);
            } else {
                tVar.f("onDrawerVisibleChanged");
            }
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment
    public void J0(android.view.View view, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment
    public void K0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        nv3.t tVar = this.f156346w;
        if (tVar != null) {
            tVar.b(false);
        }
        super.K0(recyclerView);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment
    public void L0(boolean z17) {
        if (z17) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.k(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment
    public void N0(cv3.d dVar) {
        this.f156347x = dVar;
    }

    @Override // iv3.b
    public void Y(android.view.View itemView, rv3.h item, int i17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(item, "item");
        nv3.t tVar = this.f156346w;
        if (tVar != null) {
            tVar.c(item, i17);
        }
        r0(itemView, item);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public boolean m0() {
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 13;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public boolean o0() {
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        nv3.t tVar = this.f156346w;
        if (tVar != null) {
            tVar.f("onPause");
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        nv3.t tVar = this.f156346w;
        if (tVar != null) {
            tVar.b(true);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f156346w = new nv3.t(getActivity(), 13, this.f156382f, this.f156356u, this.f156380d, this.f156347x, this.f156349n, this.f156348y);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void p0() {
        super.p0();
        nv3.t tVar = this.f156346w;
        if (tVar != null) {
            tVar.d();
        }
        this.f156346w = null;
    }
}
