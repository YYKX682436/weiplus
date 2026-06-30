package kv3;

/* loaded from: classes5.dex */
public final class h extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 {
    public final r45.yv0 F;
    public final boolean G;
    public final com.tencent.mm.plugin.vlog.model.i0 H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f312678J;
    public final java.util.ArrayList K;
    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.component.l0 L;
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment M;
    public android.view.View N;
    public com.google.android.material.tabs.TabLayout P;
    public androidx.viewpager.widget.ViewPager Q;
    public long R;
    public boolean S;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.view.ViewGroup r2, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 r3, boolean r4, r45.yv0 r5, boolean r6, com.tencent.mm.plugin.vlog.model.i0 r7, boolean r8, int r9, kotlin.jvm.internal.i r10) {
        /*
            r1 = this;
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L6
            r4 = r0
        L6:
            r10 = r9 & 8
            if (r10 == 0) goto Lc
            r45.yv0 r5 = r45.yv0.kFinderBgmListTypeSearch
        Lc:
            r10 = r9 & 16
            if (r10 == 0) goto L11
            r6 = r0
        L11:
            r10 = r9 & 32
            if (r10 == 0) goto L17
            com.tencent.mm.plugin.vlog.model.i0 r7 = com.tencent.mm.plugin.vlog.model.i0.f175612d
        L17:
            r9 = r9 & 64
            if (r9 == 0) goto L1c
            r8 = r0
        L1c:
            java.lang.String r9 = "parent"
            kotlin.jvm.internal.o.g(r2, r9)
            java.lang.String r9 = "status"
            kotlin.jvm.internal.o.g(r3, r9)
            java.lang.String r9 = "finderCgiType"
            kotlin.jvm.internal.o.g(r5, r9)
            java.lang.String r9 = "pageType"
            kotlin.jvm.internal.o.g(r7, r9)
            r1.<init>(r2, r3, r4)
            r1.F = r5
            r1.G = r6
            r1.H = r7
            r1.S = r8
            java.lang.String r2 = "FinderMusicSearchComponent"
            r1.I = r2
            kv3.c r2 = new kv3.c
            r2.<init>(r1)
            jz5.g r2 = jz5.h.b(r2)
            r1.f312678J = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.K = r2
            com.tencent.mm.plugin.recordvideo.ui.editor.music.component.l0 r3 = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.l0
            android.content.Context r4 = r1.f156168g
            java.lang.String r5 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            kotlin.jvm.internal.o.e(r4, r5)
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4
            androidx.fragment.app.FragmentManager r4 = r4.getSupportFragmentManager()
            java.lang.String r5 = "getSupportFragmentManager(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            r3.<init>(r4, r2)
            r1.L = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kv3.h.<init>(android.view.ViewGroup, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0, boolean, r45.yv0, boolean, com.tencent.mm.plugin.vlog.model.i0, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public void A() {
        if (!this.G) {
            super.A();
            return;
        }
        if (kotlin.jvm.internal.o.b(this.f156182w, this.f156181v)) {
            com.tencent.mars.xlog.Log.w(this.I, "refreshSearchList: same string, no need to update");
            return;
        }
        this.f156182w = this.f156181v;
        android.view.View view = this.N;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/component/FinderMusicSearchComponent", "refreshSearchList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/component/FinderMusicSearchComponent", "refreshSearchList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment) it.next()).A();
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment finderMusicPickerSearchFragment = this.M;
        if (finderMusicPickerSearchFragment != null) {
            finderMusicPickerSearchFragment.M0();
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public boolean B() {
        return true;
    }

    public final boolean E() {
        if (!this.G) {
            return false;
        }
        java.util.ArrayList arrayList = this.K;
        if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment) it.next()).G0()) {
                return true;
            }
        }
        return false;
    }

    public final void G(cv3.d dVar) {
        if (this.G) {
            java.util.Iterator it = this.K.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment) it.next()).N0(dVar);
            }
        }
    }

    @Override // ev3.b
    public void X(android.view.View itemView, rv3.h feed, int i17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(feed, "feed");
        nv3.k.f340686a.a(itemView, feed);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d
    public long getVideoDuration() {
        return this.R;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1, ev3.b
    public void h(android.view.View itemView, rv3.h feed, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(feed, "feed");
        nv3.c.f340654a.a(feed, i17, z17, 10, this.f156180u, this.A);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1, fv3.b
    public void m() {
        super.m();
        if (this.G) {
            android.view.View n17 = n(com.tencent.mm.R.id.uix);
            this.N = n17;
            com.google.android.material.tabs.TabLayout tabLayout = n17 != null ? (com.google.android.material.tabs.TabLayout) n17.findViewById(com.tencent.mm.R.id.uiy) : null;
            this.P = tabLayout;
            if (tabLayout != null) {
                android.content.Context context = this.f156168g;
                oa.i l17 = tabLayout.l();
                android.content.Context context2 = this.f156168g;
                java.lang.String string = context2.getResources().getString(com.tencent.mm.R.string.oaf);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                tabLayout.d(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0(context, l17, 0, 0, string).f156291a, true);
                android.content.Context context3 = this.f156168g;
                oa.i l18 = tabLayout.l();
                java.lang.String string2 = context2.getResources().getString(com.tencent.mm.R.string.oae);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                tabLayout.d(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m0(context3, l18, 0, 1, string2).f156291a, false);
            }
            com.google.android.material.tabs.TabLayout tabLayout2 = this.P;
            if (tabLayout2 != null) {
                tabLayout2.a(new kv3.d(this));
            }
            android.view.View view = this.N;
            this.Q = view != null ? (androidx.viewpager.widget.ViewPager) view.findViewById(com.tencent.mm.R.id.uiz) : null;
            java.util.ArrayList arrayList = this.K;
            ev3.d dVar = this.A;
            kv3.e eVar = new kv3.e(this);
            com.tencent.mm.plugin.vlog.model.i0 i0Var = this.H;
            arrayList.add(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFeedFragment(dVar, true, i0Var, eVar));
            arrayList.add(new com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment(this.A, true, i0Var, new kv3.f(this)));
            androidx.viewpager.widget.ViewPager viewPager = this.Q;
            if (viewPager != null) {
                viewPager.setId(android.view.View.generateViewId());
            }
            androidx.viewpager.widget.ViewPager viewPager2 = this.Q;
            if (viewPager2 != null) {
                viewPager2.setAdapter(this.L);
            }
            androidx.viewpager.widget.ViewPager viewPager3 = this.Q;
            if (viewPager3 != null) {
                viewPager3.setOffscreenPageLimit(arrayList.size() - 1);
            }
            androidx.viewpager.widget.ViewPager viewPager4 = this.Q;
            if (viewPager4 != null) {
                viewPager4.addOnPageChangeListener(new kv3.g(this));
            }
            this.M = (com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment) arrayList.get(0);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a
    public void o(boolean z17) {
        if (this.G && z17) {
            return;
        }
        super.o(z17);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public void u(boolean z17, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1 searchType) {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a f17;
        kotlin.jvm.internal.o.g(searchType, "searchType");
        ev3.d dVar = this.A;
        ((nv3.i) ((jz5.n) this.f312678J).getValue()).a(this.f156181v, z17, searchType, (dVar == null || (f17 = dVar.f()) == null) ? null : f17.p());
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public boolean v() {
        return this.S;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public boolean w() {
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((c61.p7) ((m40.k0) c17)).hj(m40.j0.f323411g);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public int x() {
        return 10;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public java.lang.String y() {
        return this.I;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public void z() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerSearchFragment finderMusicPickerSearchFragment;
        super.z();
        nv3.i iVar = (nv3.i) ((jz5.n) this.f312678J).getValue();
        jv3.a aVar = iVar.f340681e;
        if (aVar != null) {
            aVar.j();
        }
        iVar.f340681e = null;
        if (!this.G || (finderMusicPickerSearchFragment = this.M) == null) {
            return;
        }
        nv3.i iVar2 = (nv3.i) finderMusicPickerSearchFragment.f156353r.getValue();
        jv3.a aVar2 = iVar2.f340681e;
        if (aVar2 != null) {
            aVar2.j();
        }
        iVar2.f340681e = null;
    }
}
