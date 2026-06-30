package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class s7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC f151447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(int i17, int i18, com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f151445d = i17;
        this.f151446e = i18;
        this.f151447f = musicMvSongInfoUIC;
        this.f151448g = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.util.List data;
        com.tencent.mm.plugin.mv.ui.view.w2 w2Var;
        com.tencent.mm.plugin.mv.ui.view.v2 v2Var;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        int i18 = this.f151445d;
        if (i18 >= 0 && (i17 = this.f151446e) >= 0) {
            java.util.Collection<java.lang.ref.WeakReference> values = this.f151447f.f151008p.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            for (java.lang.ref.WeakReference weakReference : values) {
                com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar = (com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar) weakReference.get();
                if (musicMainSeekBar != null) {
                    musicMainSeekBar.setProgress(i18);
                }
                com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar2 = (com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar) weakReference.get();
                if (musicMainSeekBar2 != null) {
                    musicMainSeekBar2.setMaxProgress(i17);
                }
            }
            androidx.appcompat.app.AppCompatActivity activity = this.f151448g;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = (com.tencent.mm.plugin.mv.ui.uic.s1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.s1.class);
            s1Var.f151421o = i18;
            int i19 = s1Var.f151422p;
            ll3.h1 h1Var = s1Var.f151420n;
            if (h1Var != null) {
                i19 = h1Var.a(i18);
            }
            int i27 = s1Var.f151422p;
            java.util.ArrayList arrayList = s1Var.f151418i;
            int i28 = 1;
            if (i19 != i27 && i19 >= 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) it.next();
                    if (recyclerView.getVisibility() == 0 && (linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
                        int w17 = linearLayoutManager.w();
                        int y17 = linearLayoutManager.y();
                        recyclerView.f1();
                        if (((i19 > y17 + i28 || w17 - i28 > i19) ? 0 : i28) != 0) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList2.add(java.lang.Integer.valueOf(i19));
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            recyclerView.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(recyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        } else {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList3.add(java.lang.Integer.valueOf(i19));
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                            recyclerView.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(recyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                        }
                    }
                    i28 = 1;
                }
            }
            s1Var.f151422p = i19;
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R6 = s1Var.R6();
            if (R6 != null && R6.getVisibility() == 0) {
                com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R62 = s1Var.R6();
                if (R62 != null) {
                    int i29 = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
                    pm0.v.X(new com.tencent.mm.plugin.mv.ui.view.i3(R62, i18, true));
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R63 = s1Var.R6();
                if (R63 != null && R63.A != 0) {
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = R63.lyricRv;
                    androidx.recyclerview.widget.p2 B0 = wxRecyclerView != null ? wxRecyclerView.B0(0) : null;
                    kotlin.jvm.internal.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.view.LyricItemDecoration");
                    com.tencent.mm.plugin.mv.ui.view.a0 a0Var = (com.tencent.mm.plugin.mv.ui.view.a0) B0;
                    if (R63.showPreludeLenNum <= 3) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "checkPreludeTime preludeLen:%d", java.lang.Long.valueOf(R63.A));
                        R63.showPreludeLenNum++;
                    }
                    long j17 = R63.A;
                    a0Var.f151770r = j17;
                    long j18 = i18;
                    if (j18 < j17 && !a0Var.f151769q) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "startAnim");
                        a0Var.g(j18);
                        R63.isShowLyricPrelude = true;
                        if (R63.f151695u == 0) {
                            R63.c(0, 0);
                        }
                    } else if (j18 > j17) {
                        if (a0Var.f151769q) {
                            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.mv.ui.view.a0.f151758x, "stopAnim");
                        }
                        a0Var.f151769q = false;
                        a0Var.f151760e.invalidate();
                        R63.isShowLyricPrelude = false;
                        if (R63.f151695u == 0) {
                            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = R63.f151682e;
                            if ((wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null || (w2Var = (com.tencent.mm.plugin.mv.ui.view.w2) data.get(0)) == null || (v2Var = w2Var.f151979d) == null || v2Var.f151969f) ? false : true) {
                                R63.c(0, 0);
                            }
                        }
                    }
                }
            } else {
                long j19 = s1Var.f151430x;
                if (j19 != 0) {
                    int i37 = s1Var.I;
                    java.lang.String str = s1Var.f151413d;
                    if (i37 <= 10) {
                        com.tencent.mars.xlog.Log.i(str, "checkPreludeTime preludeLen:%d, ", java.lang.Long.valueOf(j19));
                        s1Var.I++;
                    }
                    com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = s1Var.f151429w;
                    if (musicMvLyricPreludeView != null) {
                        musicMvLyricPreludeView.setPreludeLen(s1Var.f151430x);
                        long j27 = i18;
                        if (j27 < s1Var.f151430x && !musicMvLyricPreludeView.getEnableAnim()) {
                            com.tencent.mars.xlog.Log.i(str, "checkPreludeTime startAnim");
                            musicMvLyricPreludeView.setVisibility(0);
                            androidx.recyclerview.widget.RecyclerView recyclerView2 = s1Var.f151417h;
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(4);
                            }
                            musicMvLyricPreludeView.f(j27);
                            s1Var.f151431y = true;
                        } else if (j27 > s1Var.f151430x) {
                            if (musicMvLyricPreludeView.getEnableAnim()) {
                                musicMvLyricPreludeView.enableAnim = false;
                                musicMvLyricPreludeView.invalidate();
                                com.tencent.mars.xlog.Log.i(str, "checkPreludeTime stopAnim");
                            }
                            s1Var.f151431y = false;
                            if (musicMvLyricPreludeView.getVisibility() == 0) {
                                musicMvLyricPreludeView.setVisibility(8);
                            }
                            androidx.recyclerview.widget.RecyclerView recyclerView3 = s1Var.f151417h;
                            if (!(recyclerView3 != null && recyclerView3.getVisibility() == 0)) {
                                androidx.recyclerview.widget.RecyclerView recyclerView4 = s1Var.f151417h;
                                if (recyclerView4 != null) {
                                    recyclerView4.setVisibility(0);
                                }
                                androidx.recyclerview.widget.RecyclerView recyclerView5 = s1Var.f151417h;
                                if (recyclerView5 != null) {
                                    recyclerView5.setAlpha(1.0f);
                                }
                                com.tencent.mars.xlog.Log.i(str, "scrollToFistLine");
                                if (s1Var.f151422p <= 0) {
                                    java.util.Iterator it6 = arrayList.iterator();
                                    while (it6.hasNext()) {
                                        androidx.recyclerview.widget.RecyclerView recyclerView6 = (androidx.recyclerview.widget.RecyclerView) it6.next();
                                        if (recyclerView6.getVisibility() == 0 && ((androidx.recyclerview.widget.LinearLayoutManager) recyclerView6.getLayoutManager()) != null) {
                                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                                            arrayList4.add(0);
                                            java.util.Collections.reverse(arrayList4);
                                            yj0.a.d(recyclerView6, arrayList4.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "scrollToFistLine", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                                            recyclerView6.c1(((java.lang.Integer) arrayList4.get(0)).intValue());
                                            yj0.a.f(recyclerView6, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "scrollToFistLine", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ((com.tencent.mm.plugin.mv.ui.uic.n0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151310i.set(14, java.lang.Integer.valueOf(i17));
        }
        return jz5.f0.f302826a;
    }
}
