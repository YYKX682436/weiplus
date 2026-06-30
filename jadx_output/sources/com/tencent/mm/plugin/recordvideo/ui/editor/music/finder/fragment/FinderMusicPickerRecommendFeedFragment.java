package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerRecommendFeedFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "Liv3/b;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderMusicPickerRecommendFeedFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment implements iv3.b {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f156335n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.i0 f156336o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f156337p;

    /* renamed from: q, reason: collision with root package name */
    public cv3.d f156338q;

    /* renamed from: r, reason: collision with root package name */
    public wt3.e f156339r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f156340s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f156341t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f156342u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f156343v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f156344w;

    /* renamed from: x, reason: collision with root package name */
    public nv3.t f156345x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMusicPickerRecommendFeedFragment(ev3.d dVar, boolean z17, com.tencent.mm.plugin.vlog.model.i0 scene) {
        super(dVar);
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f156335n = z17;
        this.f156336o = scene;
        this.f156337p = "MicroMsg.MusicPickerRecommendFeedFragment[" + hashCode() + ']';
    }

    public final void A0() {
        if (!this.f156340s) {
            this.f156342u = true;
            return;
        }
        dv3.c cVar = this.f156381e;
        if (cVar != null && cVar.K == 0) {
            C0(true);
        }
    }

    public final void B0(boolean z17) {
        if (z17) {
            nv3.t tVar = this.f156345x;
            this.f156343v = tVar != null ? tVar.f340716n : false;
            if (tVar != null) {
                tVar.f("onSearchVisibleChanged");
                return;
            }
            return;
        }
        if (this.f156343v) {
            nv3.t tVar2 = this.f156345x;
            if (tVar2 != null) {
                tVar2.b(false);
            }
            this.f156343v = false;
        }
    }

    public final void C0(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f156337p, "requestListenBgmList loadFirstPage:" + z17);
        if (!z17) {
            wt3.e eVar = this.f156339r;
            if (eVar != null) {
                eVar.f449403l.obtainMessage(2).sendToTarget();
                return;
            }
            return;
        }
        x0();
        wt3.e eVar2 = this.f156339r;
        if (eVar2 != null) {
            eVar2.f449403l.obtainMessage(1).sendToTarget();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [wt3.e0] */
    public final void F0(yu3.a createInfo) {
        kotlin.jvm.internal.o.g(createInfo, "createInfo");
        com.tencent.mars.xlog.Log.i(this.f156337p, "setupFetchDataTask");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(createInfo.f465853c);
        im5.c cVar = this.f156385i;
        qv3.b e0Var = !K0 ? new wt3.e0(cVar, createInfo, 12) : new qv3.b(cVar, createInfo, 12);
        this.f156339r = e0Var;
        e0Var.a(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.i(this));
        wt3.e eVar = this.f156339r;
        if (eVar != null) {
            eVar.g().c();
        }
        wt3.e eVar2 = this.f156339r;
        if (eVar2 != null) {
            eVar2.f449399h = 30;
        }
        if (eVar2 != null) {
            eVar2.b();
        }
    }

    @Override // iv3.b
    public void Y(android.view.View itemView, rv3.h item, int i17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(item, "item");
        nv3.t tVar = this.f156345x;
        if (tVar != null) {
            tVar.c(item, i17);
        }
        r0(itemView, item);
    }

    @Override // ev3.b
    public void h(android.view.View itemView, rv3.h feed, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 12;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.tencent.mars.xlog.Log.i(this.f156337p, "onDestroyView: ");
        super.onDestroyView();
        p0();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        nv3.t tVar = this.f156345x;
        if (tVar != null) {
            tVar.f("onPause");
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        nv3.t tVar = this.f156345x;
        if (tVar != null) {
            tVar.b(true);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.i(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.j(this));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.h hVar = new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.h(this);
        dv3.d dVar = new dv3.d(new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment$buildRVItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type == 2 ? new rv3.k() : new ov3.b(yz5.p.this, this, false, false, 12, null);
            }
        }, arrayList);
        this.f156381e = dVar;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f156382f;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(dVar);
        }
        this.f156340s = true;
        this.f156345x = new nv3.t(getContext(), 12, this.f156382f, this.f156381e, this.f156380d, this.f156338q, this.f156336o, this.f156344w);
        if (this.f156342u) {
            dv3.c cVar = this.f156381e;
            if (cVar != null && cVar.K == 0) {
                C0(true);
            }
            this.f156342u = false;
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void p0() {
        super.p0();
        com.tencent.mars.xlog.Log.i(this.f156337p, "onDeactivate");
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            cVar.K = 0;
        }
        this.f156341t = true;
        wt3.e eVar = this.f156339r;
        if (eVar != null) {
            eVar.c();
        }
        wt3.e eVar2 = this.f156339r;
        if (eVar2 != null) {
            eVar2.f449404m = null;
        }
        nv3.t tVar = this.f156345x;
        if (tVar != null) {
            tVar.d();
        }
        this.f156345x = null;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void t0() {
        A0();
    }
}
