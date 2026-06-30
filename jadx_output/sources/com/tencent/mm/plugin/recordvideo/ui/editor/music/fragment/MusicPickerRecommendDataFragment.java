package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerRecommendDataFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/fragment/MusicPickerDataFragment;", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class MusicPickerRecommendDataFragment extends com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f156394x = 0;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f156395n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f156396o;

    /* renamed from: p, reason: collision with root package name */
    public wt3.e f156397p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f156398q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f156399r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f156400s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f156401t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f156402u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f156403v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f156404w;

    public /* synthetic */ MusicPickerRecommendDataFragment(ev3.d dVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(dVar, (i17 & 2) != 0 ? false : z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0() {
        /*
            r6 = this;
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r0 = r6.f156402u
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L39
            java.lang.String r4 = r0.a()
            dv3.c r5 = r6.f156381e
            if (r5 == 0) goto L12
            r5.R0(r4)
        L12:
            dv3.c r5 = r6.f156381e
            if (r5 == 0) goto L1d
            java.util.List r0 = kz5.b0.c(r0)
            r5.G0(r0, r2)
        L1d:
            dv3.c r0 = r6.f156381e
            if (r0 != 0) goto L22
            goto L25
        L22:
            r0.S0(r4)
        L25:
            dv3.c r0 = r6.f156381e
            if (r0 == 0) goto L2c
            r0.I0()
        L2c:
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r6.f156382f
            if (r0 == 0) goto L5b
            com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.h r4 = new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.h
            r4.<init>(r6)
            r0.post(r4)
            goto L5b
        L39:
            boolean r0 = r6.f156403v
            if (r0 != 0) goto L53
            boolean r0 = r6.f156401t
            if (r0 == 0) goto L53
            dv3.c r0 = r6.f156381e
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.f243996J
            goto L49
        L48:
            r0 = r1
        L49:
            java.lang.String r4 = ""
            boolean r0 = kotlin.jvm.internal.o.b(r0, r4)
            if (r0 == 0) goto L53
            r0 = r2
            goto L54
        L53:
            r0 = r3
        L54:
            if (r0 == 0) goto L5a
            r6.T0()
            goto L5b
        L5a:
            r2 = r3
        L5b:
            r6.f156402u = r1
            r6.f156403v = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment.A0():boolean");
    }

    public in5.s B0(final yz5.p pVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment$buildRVItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 2) {
                    return new rv3.k();
                }
                yz5.p pVar2 = yz5.p.this;
                com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment = this;
                musicPickerRecommendDataFragment.getClass();
                return new rv3.l(pVar2, musicPickerRecommendDataFragment, this.l0(), this.getS1());
            }
        };
    }

    public dv3.c C0(java.util.ArrayList initData) {
        kotlin.jvm.internal.o.g(initData, "initData");
        return new dv3.e(B0(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.j(this)), initData);
    }

    public wt3.e F0(yu3.a createInfo) {
        kotlin.jvm.internal.o.g(createInfo, "createInfo");
        return !com.tencent.mm.sdk.platformtools.t8.K0(createInfo.f465853c) ? new wt3.g0(this.f156385i, createInfo.f465853c, createInfo.f465855e, createInfo.f465856f, createInfo.f465851a) : new wt3.b0(this.f156385i, createInfo.f465854d, createInfo.f465851a);
    }

    public boolean G0() {
        return this instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment;
    }

    public boolean H0() {
        return this instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment;
    }

    public int J0() {
        return 9;
    }

    public void K0() {
        wt3.e eVar = this.f156397p;
        if (eVar == null) {
            return;
        }
        eVar.f449404m = new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.k(this);
    }

    public final void L0() {
        if (this.f156399r) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f156396o, "loadFirstPage: ");
        this.f156399r = true;
        x0();
        int i17 = vt3.q.f440037a;
        com.tencent.mm.sdk.platformtools.n3 d17 = gm0.j1.e().d();
        kotlin.jvm.internal.o.f(d17, "getWorkerHandler(...)");
        d17.post(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.m(this));
    }

    public final void M0() {
        com.tencent.mars.xlog.Log.i(this.f156396o, "onActivate: ");
        L0();
    }

    public final void N0(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        info.f155709J = true;
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            cVar.S0(info.a());
        }
        ev3.d dVar = this.f156380d;
        if (dVar != null) {
            ev3.d.e(dVar, n0(), info, true, false, z17, 8, null);
        }
    }

    public void P0(java.util.List audioList) {
        kotlin.jvm.internal.o.g(audioList, "audioList");
        com.tencent.mars.xlog.Log.i(this.f156396o, "setLocalAudioList: size=" + audioList.size());
        dv3.c cVar = this.f156381e;
        if (cVar != null) {
            dv3.c.F0(cVar, audioList, false, 2, null);
        }
    }

    public void Q0(java.lang.String str) {
    }

    public final void R0(yu3.a createInfo) {
        kotlin.jvm.internal.o.g(createInfo, "createInfo");
        com.tencent.mars.xlog.Log.i(this.f156396o, "setupFetchDataTask: ");
        this.f156397p = F0(createInfo);
        K0();
        wt3.e eVar = this.f156397p;
        if (eVar != null) {
            eVar.g().c();
        }
        wt3.e eVar2 = this.f156397p;
        if (eVar2 != null) {
            eVar2.f449399h = 30;
        }
        if (eVar2 != null) {
            eVar2.f449398g = createInfo.f465857g && ((tt3.a) tt3.b.f422037b.a()).f422035h;
        }
        wt3.e eVar3 = this.f156397p;
        if (eVar3 != null) {
            eVar3.b();
        }
        if (!this.f156401t || this.f156403v) {
            return;
        }
        T0();
    }

    public final void T0() {
        rv3.h L0;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        dv3.c cVar = this.f156381e;
        if (cVar == null || (L0 = cVar.L0()) == null || (audioCacheInfo = L0.f400395d) == null) {
            return;
        }
        N0(audioCacheInfo, true);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public int n0() {
        return 1;
    }

    @Override // ev3.c
    public void o(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, boolean z18, int i18, boolean z19) {
        dv3.c cVar;
        dv3.c cVar2;
        if (i18 != n0() || audioCacheInfo == null) {
            return;
        }
        if (z18 && (cVar2 = this.f156381e) != null) {
            cVar2.R0(audioCacheInfo.a());
        }
        if (H0() && z17 && (cVar = this.f156381e) != null) {
            dv3.b bVar = new dv3.b(J0());
            java.util.Iterator it = cVar.I.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else if (((java.lang.Boolean) bVar.invoke(it.next())).booleanValue()) {
                    break;
                } else {
                    i19++;
                }
            }
            cVar.Q0(i19);
        }
        dv3.c cVar3 = this.f156381e;
        if (cVar3 != null) {
            cVar3.G0(kz5.b0.c(audioCacheInfo), true);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f156382f;
        if (wxRecyclerView != null) {
            wxRecyclerView.post(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.n(this));
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i(this.f156396o, "onDestroy: ");
        p0();
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.tencent.mars.xlog.Log.i(this.f156396o, "onDestroyView: ");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        com.tencent.mars.xlog.Log.i(this.f156396o, "onViewCreated: ");
        if (this.f156399r && !this.f156400s) {
            x0();
        }
        if (G0() && (wxRecyclerView = this.f156382f) != null) {
            wxRecyclerView.i(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.l(this));
        }
        ev3.d dVar = this.f156380d;
        if (dVar != null) {
            dVar.c(n0(), this);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f156382f;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(this.f156381e);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f156382f;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.post(new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.o(this));
        }
        yz5.l lVar = this.f156404w;
        if (lVar != null) {
            lVar.invoke(view);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void p0() {
        super.p0();
        this.f156398q = true;
        wt3.e eVar = this.f156397p;
        if (eVar != null) {
            eVar.c();
        }
        wt3.e eVar2 = this.f156397p;
        if (eVar2 == null) {
            return;
        }
        eVar2.f449404m = null;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment
    public void t0() {
        L0();
    }

    public MusicPickerRecommendDataFragment(ev3.d dVar, boolean z17) {
        super(dVar);
        this.f156395n = z17;
        this.f156396o = "MicroMsg.MusicPickerRecommendFragment[" + hashCode() + ']';
        this.f156401t = true;
        dv3.c C0 = C0(new java.util.ArrayList());
        C0.f293105o = new com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.i(this, C0);
        this.f156381e = C0;
    }
}
