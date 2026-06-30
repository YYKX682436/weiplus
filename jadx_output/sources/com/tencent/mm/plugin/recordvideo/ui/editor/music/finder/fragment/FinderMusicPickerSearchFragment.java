package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerSearchFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/d;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class FinderMusicPickerSearchFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment implements com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d {

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.i0 f156349n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f156350o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f156351p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f156352q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f156353r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f156354s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f156355t;

    /* renamed from: u, reason: collision with root package name */
    public dv3.c f156356u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f156357v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMusicPickerSearchFragment(ev3.d dVar, boolean z17, com.tencent.mm.plugin.vlog.model.i0 scene, yz5.a getSearchComponent) {
        super(dVar);
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(getSearchComponent, "getSearchComponent");
        this.f156349n = scene;
        this.f156350o = getSearchComponent;
        this.f156351p = "FinderMusicPickerSearchFragment[" + hashCode() + ']';
        jz5.i iVar = jz5.i.f302831f;
        this.f156352q = jz5.h.a(iVar, new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.q(this));
        this.f156353r = jz5.h.a(iVar, new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.p(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void A() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerSearchFragment", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
            wxRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerSearchFragment", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        dv3.c cVar = this.f156356u;
        if (cVar != null) {
            cVar.T0(new java.util.LinkedList());
        }
        dv3.c cVar2 = this.f156356u;
        if (cVar2 == null) {
            return;
        }
        cVar2.K = 0;
    }

    public final void A0(boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f17;
        ev3.d dVar = this.f156380d;
        ((nv3.i) this.f156353r.getValue()).a(((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d) this.f156352q.getValue()).C(), z17, F0(), (dVar == null || (f17 = dVar.f()) == null) ? null : f17.p());
    }

    public r45.yv0 B0() {
        return r45.yv0.kFinderBgmListTypeSearch;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public java.lang.String C() {
        return "";
    }

    public in5.s C0(final yz5.a aVar, final yz5.p pVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 2) {
                    return new rv3.k();
                }
                com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment finderMusicPickerSearchFragment = com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment.this;
                finderMusicPickerSearchFragment.getClass();
                com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment.this.getClass();
                com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment.this.getClass();
                return new rv3.m(pVar, finderMusicPickerSearchFragment, false, false, aVar);
            }
        };
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    /* renamed from: D, reason: from getter */
    public dv3.c getF156356u() {
        return this.f156356u;
    }

    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1 F0() {
        return com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1.f156188d;
    }

    public boolean G0() {
        return false;
    }

    public void H0(boolean z17) {
    }

    public void J0(android.view.View view, int i17, in5.s0 holder) {
        rv3.h hVar;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        dv3.c cVar = this.f156356u;
        boolean z17 = false;
        if (cVar != null && cVar.M0(i17) == 1) {
            z17 = true;
        }
        if (!z17 || (hVar = (rv3.h) holder.f293125i) == null) {
            return;
        }
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = hVar.f400395d;
        audioCacheInfo.f155726w = i17;
        java.lang.String a17 = audioCacheInfo.a();
        com.tencent.mars.xlog.Log.i(this.f156351p, "onMusicItemClick: position: " + i17 + ", " + a17);
        dv3.c cVar2 = this.f156356u;
        boolean b17 = kotlin.jvm.internal.o.b(cVar2 != null ? cVar2.f243996J : null, a17);
        ev3.d dVar = this.f156380d;
        if (!b17) {
            if (dVar != null) {
                ev3.d.e(dVar, n0(), hVar.f400395d, true, this instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFeedFragment, false, 16, null);
            }
            dv3.c cVar3 = this.f156356u;
            if (cVar3 != null) {
                cVar3.S0(a17);
            }
        } else if (dVar != null) {
            ev3.d.e(dVar, n0(), hVar.f400395d, false, false, false, 24, null);
        }
        r0(view, hVar);
    }

    public void K0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).y();
        dv3.c cVar = this.f156356u;
        if (cVar == null || y17 != cVar.getItemCount() - 1 || !this.f156357v || cVar.O0()) {
            return;
        }
        java.util.ArrayList arrayList = cVar.I;
        int size = arrayList.size();
        arrayList.add(new rv3.j());
        cVar.notifyItemRangeInserted(size, 1);
        A0(true);
    }

    public void L0(boolean z17) {
    }

    public final void M0() {
        this.f156355t = !this.f156354s;
        dv3.c cVar = this.f156356u;
        if (cVar != null && cVar.K == 0) {
            A0(false);
        }
    }

    public void N0(cv3.d dVar) {
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void i0(java.util.ArrayList audioList, boolean z17) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        if (z17) {
            dv3.c cVar = this.f156356u;
            if (cVar != null) {
                dv3.c.F0(cVar, audioList, false, 2, null);
            }
        } else {
            dv3.c cVar2 = this.f156356u;
            if (cVar2 != null) {
                cVar2.T0(audioList);
            }
        }
        z0();
        L0(z17);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void j(fv3.d statusEnum, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(statusEnum, "statusEnum");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 10;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.i(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.o(this));
        }
        ev3.d dVar = this.f156380d;
        if (dVar != null) {
            dVar.c(3, this);
        }
        dv3.e eVar = new dv3.e(C0(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.l(this), new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.m(this)), new java.util.ArrayList());
        this.f156356u = eVar;
        eVar.f293105o = new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.n(this);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f156382f;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(eVar);
        }
        this.f156354s = true;
        if (this.f156355t) {
            M0();
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void p(boolean z17) {
        this.f156357v = z17;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void t0() {
        M0();
    }
}
