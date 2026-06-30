package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/finder/fragment/FinderMusicPickerLikeFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerLikeBgmFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class FinderMusicPickerLikeFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment {
    public boolean S1;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f156331u;

    /* renamed from: v, reason: collision with root package name */
    public jv3.a f156332v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f156333w;

    public FinderMusicPickerLikeFragment(ev3.d dVar, boolean z17, boolean z18) {
        super(dVar, z17);
        this.S1 = z18;
        this.f156331u = "FinderMusicPickerLikeFragment[" + hashCode() + ']';
        this.f156333w = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.c(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment
    public dv3.c A0() {
        java.lang.String str;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo d17;
        hv3.a aVar = new hv3.a(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment$buildRVItemConverts$1(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.b(this), this), new java.util.ArrayList());
        ev3.d dVar = this.f156380d;
        if (dVar == null || (d17 = dVar.d()) == null || (str = d17.a()) == null) {
            str = "";
        }
        aVar.S0(str);
        return aVar;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment
    public boolean B0() {
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment
    public int C0() {
        return 12;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment
    /* renamed from: F0, reason: from getter */
    public java.lang.String getF156331u() {
        return this.f156331u;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment
    public boolean H0(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        dv3.c cVar = this.f156381e;
        if (cVar != null && cVar.M0(i17) == 1) {
            rv3.h hVar = (rv3.h) holder.f293125i;
            kotlin.jvm.internal.o.d(hVar);
            jz5.g gVar = this.f156333w;
            ((rl5.r) ((jz5.n) gVar).getValue()).a();
            int[] t17 = pm0.v.t(view);
            ((rl5.r) ((jz5.n) gVar).getValue()).h(view, new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.f(this), new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.g(this, hVar, i17, view), t17[0] + (view.getWidth() / 2), t17[1] + view.getHeight());
            M0(hVar.f400395d, true);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment
    public void J0(boolean z17) {
        com.tencent.mars.xlog.Log.i(getF156331u(), "requestListenBgmList loadFirstPage:" + z17);
        if (z17) {
            x0();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jv3.a aVar = this.f156332v;
        if (aVar != null) {
            aVar.j();
        }
        jv3.a aVar2 = new jv3.a(K0(), 100, this.f156390q, 0L, null, null, null, nv3.d.a(nv3.f.f340658l, getActivity(), null, 2, null).toString(), null, null, 0, 0, 0, null, 16248, null);
        pq5.g l17 = aVar2.l();
        l17.f(this.f156385i);
        l17.h(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.d(currentTimeMillis, this, z17));
        this.f156332v = aVar2;
    }

    public int K0() {
        return 3;
    }

    public void L0(rv3.h item, int i17, android.view.View itemView) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        M0(item.f400395d, false);
        nv3.c.f340654a.a(item, i17, false, n0(), this.f156381e, this.f156380d);
    }

    public void M0(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f17;
        kotlin.jvm.internal.o.g(info, "info");
        ev3.d dVar = this.f156380d;
        if (dVar == null || (f17 = dVar.f()) == null) {
            return;
        }
        f17.i(info, n0(), z17);
    }

    @Override // ev3.b
    public void X(android.view.View itemView, rv3.h feed, int i17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(feed, "feed");
        nv3.k.f340686a.a(itemView, feed);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    /* renamed from: j0, reason: from getter */
    public boolean getS1() {
        return this.S1;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public boolean m0() {
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 9;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment, com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void p0() {
        super.p0();
        jv3.a aVar = this.f156332v;
        if (aVar != null) {
            aVar.j();
        }
        this.f156332v = null;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, ev3.c
    public void q(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
        if (!z17) {
            java.lang.String a17 = info.a();
            dv3.c cVar = this.f156381e;
            if (cVar != null) {
                cVar.R0(a17);
                return;
            }
            return;
        }
        dv3.c cVar2 = this.f156381e;
        if (cVar2 != null) {
            dv3.c.H0(cVar2, kz5.b0.c(info), false, 2, null);
        }
        com.tencent.mars.xlog.Log.i(getF156331u(), "[onMusicFavChanged] " + this + ' ' + info.a() + " musicPlayStatus:" + musicPlayStatus);
        dv3.c cVar3 = this.f156381e;
        if (cVar3 != null) {
            cVar3.V0(info.a(), musicPlayStatus);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.post(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.e(this));
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public boolean w0() {
        return true;
    }
}
