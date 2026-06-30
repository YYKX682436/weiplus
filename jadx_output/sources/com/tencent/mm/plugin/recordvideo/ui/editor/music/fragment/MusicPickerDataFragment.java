package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "Landroidx/fragment/app/Fragment;", "Lev3/b;", "Lev3/c;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class MusicPickerDataFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements ev3.b, ev3.c {

    /* renamed from: d, reason: collision with root package name */
    public final ev3.d f156380d;

    /* renamed from: e, reason: collision with root package name */
    public dv3.c f156381e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f156382f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f156383g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f156384h;

    /* renamed from: i, reason: collision with root package name */
    public final im5.c f156385i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f156386m;

    public MusicPickerDataFragment() {
        this(null);
    }

    public void F() {
        x0();
    }

    @Override // ev3.c
    public void J(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.w.f400417a);
        }
        dv3.c cVar2 = this.f156381e;
        if (cVar2 == null) {
            return;
        }
        cVar2.S0("");
    }

    @Override // ev3.c
    public void L(int i17, java.lang.String musicKey, cw3.g mode) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        kotlin.jvm.internal.o.g(mode, "mode");
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            cVar.V0(musicKey, new rv3.u(mode));
        }
    }

    public void N() {
        y0();
    }

    @Override // ev3.c
    public void S(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.x.f400418a);
        }
    }

    /* renamed from: j0 */
    public boolean getS1() {
        return false;
    }

    public boolean l0() {
        return false;
    }

    public boolean m0() {
        return this instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment;
    }

    public abstract int n0();

    public boolean o0() {
        return this instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerRecommendFeedFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        toString();
        return inflater.inflate(com.tencent.mm.R.layout.dcx, viewGroup, false);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        toString();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        com.tencent.mars.xlog.Log.i(this.f156386m, "onViewCreated: " + this);
        this.f156384h = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.q1j);
        this.f156383g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.q1k);
        this.f156382f = (com.tencent.mm.view.recyclerview.WxRecyclerView) view.findViewById(com.tencent.mm.R.id.f486044pz4);
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getContext(), 1, false);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(wxLinearLayoutManager);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f156382f;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.P(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.a());
        }
        android.content.Context context = getContext();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f156382f;
        if (m0()) {
            pv3.f fVar = pv3.f.f358589a;
            boolean o07 = o0();
            i95.m c17 = i95.n0.c(m40.k0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (((c61.p7) ((m40.k0) c17)).hj(m40.j0.f323412h) && context != null && wxRecyclerView3 != null && o07) {
                if (pv3.f.f358594f == null) {
                    i95.m c18 = i95.n0.c(c50.b1.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    pv3.f.f358594f = new cs2.i(context, 0);
                }
                in5.o.b(wxRecyclerView3, new pv3.a(), pv3.b.f358583d);
            }
        }
    }

    public void p0() {
        this.f156385i.dead();
    }

    public void q(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            cVar.U0(info, z17);
        }
    }

    public final void q0(android.view.View view, rv3.h hVar) {
        xv3.a.a(xv3.a.f457429a, this.f156380d, n0(), hVar, view, false, true, null, 64, null);
    }

    public final void r0(android.view.View view, rv3.h hVar) {
        xv3.a.a(xv3.a.f457429a, this.f156380d, n0(), hVar, view, true, false, null, 64, null);
    }

    public void s0() {
    }

    public void t0() {
    }

    public void u0(java.lang.String musicId, boolean z17) {
        kotlin.jvm.internal.o.g(musicId, "musicId");
    }

    public boolean w0() {
        return this instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFeedFragment;
    }

    public final void x0() {
        android.widget.LinearLayout linearLayout = this.f156384h;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        android.widget.TextView textView = this.f156383g;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // ev3.c
    public void y(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.y.f400419a);
        }
        dv3.c cVar2 = this.f156381e;
        if (cVar2 == null) {
            return;
        }
        cVar2.S0(musicKey);
    }

    public final void y0() {
        android.widget.LinearLayout linearLayout = this.f156384h;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        android.widget.TextView textView = this.f156383g;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    public void z0() {
        android.widget.LinearLayout linearLayout = this.f156384h;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        android.widget.TextView textView = this.f156383g;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public MusicPickerDataFragment(ev3.d dVar) {
        this.f156380d = dVar;
        this.f156385i = new im5.c();
        this.f156386m = "MicroMsg.MusicPickerDataFragment";
    }
}
