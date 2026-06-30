package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f151873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f151874f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView, long j17, boolean z17) {
        super(0);
        this.f151872d = musicMvLyricView;
        this.f151873e = j17;
        this.f151874f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        int i17;
        boolean z17;
        androidx.recyclerview.widget.o1 u2Var;
        androidx.recyclerview.widget.o1 u2Var2;
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView = this.f151872d;
        if (!((java.util.ArrayList) musicMvLyricView.f151693s).isEmpty()) {
            java.util.ArrayList arrayList = (java.util.ArrayList) musicMvLyricView.f151693s;
            int size = arrayList.size();
            int i18 = 0;
            while (true) {
                j17 = this.f151873e;
                if (i18 > size) {
                    i17 = 0;
                    break;
                }
                i17 = (i18 + size) / 2;
                if (j17 >= ((com.tencent.mm.plugin.mv.ui.view.v2) arrayList.get(i17)).f151967d) {
                    i18 = i17 + 1;
                    if (i18 >= arrayList.size() || j17 < ((com.tencent.mm.plugin.mv.ui.view.v2) arrayList.get(i18)).f151967d) {
                        break;
                    }
                } else {
                    size = i17 - 1;
                }
            }
            if (i17 >= 0) {
                if (j17 < 1000 || i17 < 5) {
                    musicMvLyricView.f151696v = false;
                    z17 = true;
                } else {
                    z17 = false;
                }
                int i19 = musicMvLyricView.f151695u;
                boolean z18 = this.f151874f;
                if (i17 != i19) {
                    musicMvLyricView.c(i19, i17);
                    if (musicMvLyricView.f151700z) {
                        musicMvLyricView.h(i17);
                        musicMvLyricView.f151700z = false;
                    } else if (z18) {
                        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = musicMvLyricView.f151683f;
                        boolean z19 = (linearLayoutManager != null ? linearLayoutManager.findViewByPosition(musicMvLyricView.f151695u) : null) != null;
                        boolean z27 = musicMvLyricView.f151696v;
                        if (!z27 || z19) {
                            androidx.recyclerview.widget.o1 o1Var = musicMvLyricView.E;
                            if (o1Var instanceof com.tencent.mm.plugin.mv.ui.view.r2) {
                                if (o1Var != null && o1Var.f12053e) {
                                    if (o1Var != null) {
                                        o1Var.f12049a = i17;
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "1");
                                }
                            }
                            com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv = musicMvLyricView.getLyricRv();
                            if (lyricRv != null) {
                                lyricRv.f1();
                            }
                            if (z17) {
                                android.content.Context context = musicMvLyricView.getContext();
                                kotlin.jvm.internal.o.f(context, "getContext(...)");
                                u2Var = new com.tencent.mm.plugin.mv.ui.view.r2(musicMvLyricView, context);
                            } else {
                                android.content.Context context2 = musicMvLyricView.getContext();
                                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                u2Var = new com.tencent.mm.plugin.mv.ui.view.u2(musicMvLyricView, context2);
                            }
                            u2Var.f12049a = i17;
                            musicMvLyricView.E = u2Var;
                            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = musicMvLyricView.f151683f;
                            if (linearLayoutManager2 != null) {
                                linearLayoutManager2.startSmoothScroll(u2Var);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "2 fastScroll:%b", java.lang.Boolean.valueOf(z17));
                        } else if (!z27 && !z19 && !musicMvLyricView.f151698x) {
                            com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv2 = musicMvLyricView.getLyricRv();
                            if (lyricRv2 != null) {
                                lyricRv2.f1();
                            }
                            if (z17) {
                                android.content.Context context3 = musicMvLyricView.getContext();
                                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                                u2Var2 = new com.tencent.mm.plugin.mv.ui.view.r2(musicMvLyricView, context3);
                            } else {
                                android.content.Context context4 = musicMvLyricView.getContext();
                                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                                u2Var2 = new com.tencent.mm.plugin.mv.ui.view.u2(musicMvLyricView, context4);
                            }
                            u2Var2.f12049a = i17;
                            musicMvLyricView.E = u2Var2;
                            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager3 = musicMvLyricView.f151683f;
                            if (linearLayoutManager3 != null) {
                                linearLayoutManager3.startSmoothScroll(u2Var2);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "3 fastScroll:%b", java.lang.Boolean.valueOf(z17));
                        }
                    }
                }
                if (!z18) {
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager4 = musicMvLyricView.f151683f;
                    if ((linearLayoutManager4 != null ? linearLayoutManager4.findViewByPosition(i17) : null) != null) {
                        android.content.Context context5 = musicMvLyricView.getContext();
                        kotlin.jvm.internal.o.f(context5, "getContext(...)");
                        com.tencent.mm.plugin.mv.ui.view.s2 s2Var = new com.tencent.mm.plugin.mv.ui.view.s2(musicMvLyricView, context5);
                        s2Var.f12049a = i17;
                        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager5 = musicMvLyricView.f151683f;
                        if (linearLayoutManager5 != null) {
                            linearLayoutManager5.startSmoothScroll(s2Var);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "4");
                    } else {
                        int[] iArr = new int[2];
                        com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv3 = musicMvLyricView.getLyricRv();
                        if (lyricRv3 != null) {
                            lyricRv3.getLocationInWindow(iArr);
                        }
                        int height = ((int) (musicMvLyricView.getHeight() * com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.L)) - iArr[1];
                        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager6 = musicMvLyricView.f151683f;
                        if (linearLayoutManager6 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList2.add(java.lang.Integer.valueOf(height));
                            arrayList2.add(java.lang.Integer.valueOf(i17));
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(linearLayoutManager6, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$setCurrentTime$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            linearLayoutManager6.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                            yj0.a.f(linearLayoutManager6, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$setCurrentTime$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "5");
                    }
                }
                musicMvLyricView.f151695u = i17;
            }
        }
        return jz5.f0.f302826a;
    }
}
