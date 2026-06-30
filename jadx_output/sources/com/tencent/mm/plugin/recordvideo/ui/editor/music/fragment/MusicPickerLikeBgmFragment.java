package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerLikeBgmFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class MusicPickerLikeBgmFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f156387n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f156388o;

    /* renamed from: p, reason: collision with root package name */
    public wt3.x f156389p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f156390q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f156391r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f156392s;

    /* renamed from: t, reason: collision with root package name */
    public jz5.l f156393t;

    public MusicPickerLikeBgmFragment(ev3.d dVar, boolean z17) {
        super(dVar);
        this.f156387n = z17;
        this.f156388o = "MicroMsg.MusicPickerLikeBgmFragment[" + hashCode() + ']';
    }

    public dv3.c A0() {
        return new dv3.d(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment$buildRVItemConverts$1(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.d(this), this), new java.util.ArrayList());
    }

    public boolean B0() {
        return false;
    }

    public int C0() {
        return 10;
    }

    /* renamed from: F0, reason: from getter */
    public java.lang.String getF156331u() {
        return this.f156388o;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(boolean r5, int r6, int r7, java.lang.String r8, boolean r9, com.tencent.mm.protobuf.g r10, java.util.LinkedList r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerLikeBgmFragment.G0(boolean, int, int, java.lang.String, boolean, com.tencent.mm.protobuf.g, java.util.LinkedList):void");
    }

    public boolean H0(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        return false;
    }

    public void J0(boolean z17) {
        com.tencent.mars.xlog.Log.i(getF156331u(), "requestListenBgmList loadFirstPage:" + z17);
        if (z17) {
            x0();
        }
        wt3.x xVar = this.f156389p;
        if (xVar != null) {
            xVar.j();
        }
        wt3.x xVar2 = new wt3.x(3, 20, this.f156390q, 0L, 0L, null, null, null, 248, null);
        pq5.g l17 = xVar2.l();
        l17.f(this.f156385i);
        l17.h(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.f(this, z17));
        this.f156389p = xVar2;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.tencent.mars.xlog.Log.i(getF156331u(), "onDestroyView: ");
        super.onDestroyView();
        p0();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        dv3.c cVar;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.i(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.e(this));
        }
        ev3.d dVar = this.f156380d;
        if (dVar != null) {
            dVar.c(n0(), this);
        }
        dv3.c A0 = A0();
        this.f156381e = A0;
        if (A0 != null) {
            A0.f293105o = new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.b(this);
        }
        if (B0() && (cVar = this.f156381e) != null) {
            cVar.f293104n = new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.c(this);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f156382f;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(this.f156381e);
        }
        this.f156391r = true;
        if (this.f156392s) {
            dv3.c cVar2 = this.f156381e;
            if (cVar2 != null && cVar2.K == 0) {
                J0(true);
            }
            this.f156392s = false;
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void p0() {
        super.p0();
        com.tencent.mars.xlog.Log.i(getF156331u(), "onDeactivate: ");
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            cVar.K = 0;
        }
        wt3.x xVar = this.f156389p;
        if (xVar != null) {
            xVar.j();
        }
        this.f156389p = null;
        this.f156390q = null;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void s0() {
        getF156331u();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void t0() {
        getF156331u();
        if (!this.f156391r) {
            this.f156392s = true;
            return;
        }
        dv3.c cVar = this.f156381e;
        if (cVar != null && cVar.K == 0) {
            J0(true);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void u0(java.lang.String musicId, boolean z17) {
        java.util.ArrayList<in5.c> arrayList;
        dv3.c cVar;
        kotlin.jvm.internal.o.g(musicId, "musicId");
        dv3.c cVar2 = this.f156381e;
        boolean z18 = false;
        if (cVar2 != null && cVar2.K == 0) {
            z18 = true;
        }
        if (z18) {
            this.f156393t = new jz5.l(musicId, java.lang.Boolean.valueOf(z17));
            return;
        }
        if (cVar2 == null || (arrayList = cVar2.I) == null) {
            return;
        }
        for (in5.c cVar3 : arrayList) {
            if (cVar3 instanceof rv3.h) {
                rv3.h hVar = (rv3.h) cVar3;
                r45.pg4 pg4Var = hVar.f400395d.A;
                if (kotlin.jvm.internal.o.b(pg4Var != null ? pg4Var.f383018d : null, musicId)) {
                    ev3.d dVar = this.f156380d;
                    if (dVar != null) {
                        ev3.d.e(dVar, n0(), hVar.f400395d, true, false, false, 24, null);
                    }
                    if (!z17 || (cVar = this.f156381e) == null) {
                        return;
                    }
                    java.lang.String musicKey = hVar.f400395d.a();
                    rv3.g gVar = rv3.g.f400393e;
                    kotlin.jvm.internal.o.g(musicKey, "musicKey");
                    int K0 = cVar.K0(musicKey);
                    cVar.N0();
                    gVar.toString();
                    if (K0 >= 0) {
                        java.lang.Object obj = cVar.I.get(K0);
                        rv3.h hVar2 = obj instanceof rv3.h ? (rv3.h) obj : null;
                        if (hVar2 != null) {
                            hVar2.f400397f = gVar;
                        }
                        cVar.notifyItemChanged(K0);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
