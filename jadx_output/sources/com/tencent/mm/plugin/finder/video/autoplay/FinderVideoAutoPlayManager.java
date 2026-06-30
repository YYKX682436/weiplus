package com.tencent.mm.plugin.finder.video.autoplay;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/autoplay/FinderVideoAutoPlayManager;", "Lfc2/d;", "Ldw2/c0;", "Ltd2/c;", "Ldw2/a0;", "Lcom/tencent/mm/ui/MMFragmentActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/tencent/mm/plugin/finder/viewmodel/component/nb0;", "recycler", "Ldw2/b0;", "feedSelectorAdapter", "Luo2/v;", "musicManager", "", "tabType", "<init>", "(Lcom/tencent/mm/ui/MMFragmentActivity;Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/finder/viewmodel/component/nb0;Ldw2/b0;Luo2/v;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderVideoAutoPlayManager extends fc2.d implements dw2.c0, td2.c, dw2.a0 {

    /* renamed from: z, reason: collision with root package name */
    public static long f130773z = -1;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.MMFragmentActivity f130774g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f130775h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.nb0 f130776i;

    /* renamed from: m, reason: collision with root package name */
    public final dw2.b0 f130777m;

    /* renamed from: n, reason: collision with root package name */
    public final uo2.v f130778n;

    /* renamed from: o, reason: collision with root package name */
    public final int f130779o;

    /* renamed from: p, reason: collision with root package name */
    public final kz2.c f130780p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f130781q;

    /* renamed from: r, reason: collision with root package name */
    public long f130782r;

    /* renamed from: s, reason: collision with root package name */
    public final int f130783s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f130784t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f130785u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f130786v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashSet f130787w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f130788x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f130789y;

    public FinderVideoAutoPlayManager(com.tencent.mm.ui.MMFragmentActivity activity, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.viewmodel.component.nb0 recycler, dw2.b0 feedSelectorAdapter, uo2.v musicManager, int i17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(feedSelectorAdapter, "feedSelectorAdapter");
        kotlin.jvm.internal.o.g(musicManager, "musicManager");
        this.f130774g = activity;
        this.f130775h = recyclerView;
        this.f130776i = recycler;
        this.f130777m = feedSelectorAdapter;
        this.f130778n = musicManager;
        this.f130779o = i17;
        this.f130780p = new kz2.c("ReadyPlayForward");
        this.f130781q = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new dw2.u(this));
        this.f130782r = -1L;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f130783s = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128050z2).getValue()).r()).intValue();
        dw2.o oVar = (dw2.o) feedSelectorAdapter;
        com.tencent.mars.xlog.Log.i(oVar.f244136a, "bindRecyclerView recyclerView:" + recyclerView);
        oVar.f244138c = recyclerView;
        oVar.f244139d = i17;
        if ((recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Z4).getValue()).r()).intValue() == 1) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView;
            finderRecyclerView.setDeferPageSelectedUntilIdle(!((java.lang.Boolean) ((jz5.n) oVar.f244149n).getValue()).booleanValue());
            finderRecyclerView.setPageChangeListener(new dw2.f(oVar));
        }
        recyclerView.O(new dw2.h(recyclerView, oVar));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = oVar.f244138c;
        if (recyclerView2 != null) {
            recyclerView2.i(new dw2.e(recyclerView2, oVar));
        }
        oVar.f244140e = this;
        this.f130785u = new java.util.HashSet();
        this.f130787w = new java.util.HashSet();
        this.f130789y = true;
    }

    public static final void P0(com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager finderVideoAutoPlayManager, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.storage.FeedData feedData, in5.s0 s0Var, kz2.a aVar, boolean z17) {
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(feedData.getMediaList());
        jz5.f0 f0Var = null;
        if (mb4Var != null) {
            finderVideoAutoPlayManager.N0(s0Var);
            long id6 = feedData.getId();
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (s0Var != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.itemView.findViewById(com.tencent.mm.R.id.g2r);
                if (frameLayout != null && frameLayout.getVisibility() == 0) {
                    com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "playFocusHolder videoContainer shareShadowView is visible, return}");
                } else {
                    cw2.v9 L0 = finderVideoAutoPlayManager.L0(s0Var);
                    if (L0 != null) {
                        com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "playFocusHolder videoContainer " + L0.g());
                        if (aVar != null) {
                            aVar.c("playFocusHolder");
                        }
                        L0.setSelectedToPlay(true);
                        cw2.da videoView = L0.getVideoView();
                        boolean isPlaying = videoView != null ? videoView.isPlaying() : false;
                        boolean isPreRenderFirstFrame = L0.getIsPreRenderFirstFrame();
                        if (isPlaying) {
                            if (aVar != null) {
                                aVar.b("hitPause");
                            }
                        } else if (isPreRenderFirstFrame && aVar != null) {
                            aVar.b("hitPreRender");
                        }
                        com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "lxltest111 isLiveFeed:" + z17 + " videoContainer.isMute:" + L0.getIsMute());
                        if (z17 && L0.getIsMute()) {
                            L0.setMute(false);
                        }
                        L0.m(s0Var.getAdapterPosition(), aVar, baseFinderFeed);
                        if (!finderVideoAutoPlayManager.f130788x && finderVideoAutoPlayManager.f130789y) {
                            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) finderVideoAutoPlayManager.f130776i).a7(dw2.y.f244174d);
                        }
                        f0Var = f0Var2;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.e("Finder.VideoAutoPlayManager", "playFocusHolder videoContainer is null! mediaId=" + mb4Var.getString(9) + "] feedId=" + id6);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "playFocusHolder mediaList first feed.");
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.VideoAutoPlayManager", "playFocusHolder mediaList first feed null.");
        }
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        if (event instanceof fc2.t) {
            int i17 = ((fc2.t) event).f260985d;
            if (i17 == 3 || i17 == 0 || i17 == 5 || i17 == 11) {
                return true;
            }
        } else if ((event instanceof ec2.f) && ((ec2.f) event).f250959d == 25) {
            return true;
        }
        return false;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof fc2.t;
        dw2.b0 b0Var = this.f130777m;
        if (z17) {
            fc2.t tVar = (fc2.t) ev6;
            if (((dw2.o) b0Var).l(tVar.f260992k)) {
                com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "onEventHappen event state:" + tVar.f260991j + " event feed:" + tVar.f260992k);
                this.f130775h.post(new dw2.v(ev6, this));
                return;
            }
            return;
        }
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            dw2.o oVar = (dw2.o) b0Var;
            if (oVar.l(fVar.f250965j)) {
                com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "onEventHappen PlayEvent state:" + fVar.f250959d + " event feed:" + fVar.f250965j);
                int i17 = fVar.f250969n;
                oVar.getClass();
                oVar.c("PlayEvent", i17, false);
            }
        }
    }

    @Override // fc2.d
    public void H0() {
        this.f130781q.removeCallbacksAndMessages(null);
    }

    public final void I0(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17) {
        this.f130781q.removeMessages(1);
        c01.id.c();
        ((dw2.o) this.f130777m).d(z17);
        c01.id.c();
    }

    public final com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag J0(androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view;
        com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag = (k3Var == null || (view = k3Var.itemView) == null) ? null : (com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) view.findViewById(com.tencent.mm.R.id.agy);
        if ((finderImgFeedMusicTag != null ? finderImgFeedMusicTag.getTag(com.tencent.mm.R.id.fun) : null) == null) {
            return null;
        }
        java.lang.Object tag = finderImgFeedMusicTag.getTag(com.tencent.mm.R.id.fun);
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) tag).booleanValue()) {
            return finderImgFeedMusicTag;
        }
        return null;
    }

    public final cw2.v9 L0(androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view;
        android.view.View view2;
        cw2.v9[] v9VarArr = new cw2.v9[2];
        java.lang.Object obj = null;
        v9VarArr[0] = (k3Var == null || (view2 = k3Var.itemView) == null) ? null : (com.tencent.mm.plugin.finder.video.FinderVideoLayout) view2.findViewById(com.tencent.mm.R.id.e_k);
        v9VarArr[1] = (k3Var == null || (view = k3Var.itemView) == null) ? null : (com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout) view.findViewById(com.tencent.mm.R.id.tbm);
        java.util.Iterator it = kz5.c0.i(v9VarArr).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((cw2.v9) next) != null) {
                obj = next;
                break;
            }
        }
        return (cw2.v9) obj;
    }

    public final boolean M0() {
        com.tencent.mm.ui.MMFragmentActivity activity = this.f130774g;
        if (!(activity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI)) {
            return true;
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).S6() == this.f130779o;
    }

    public final void N0(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner;
        android.view.View view;
        com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "pauseAllMedia without:" + k3Var);
        cw2.v9 L0 = L0(k3Var);
        cw2.da videoView = L0 != null ? L0.getVideoView() : null;
        android.content.Context context = (k3Var == null || (view = k3Var.itemView) == null) ? null : view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) this.f130776i).a7(new dw2.x(videoView, activity != null ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) activity.findViewById(com.tencent.mm.R.id.tba) : null, this, k3Var));
        this.f130778n.R6(new dw2.w(J0(k3Var)));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f130775h;
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            androidx.recyclerview.widget.k3 m07 = recyclerView.m0(recyclerView.getChildAt(i17));
            if (m07 != null && (m07 instanceof in5.s0) && !kotlin.jvm.internal.o.b(k3Var, m07)) {
                in5.s0 s0Var = (in5.s0) m07;
                java.lang.Object obj = s0Var.f293125i;
                if ((obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getFeedObject().getMediaType() == 2 && (finderImageBanner = (com.tencent.mm.plugin.finder.view.image.FinderImageBanner) s0Var.p(com.tencent.mm.R.id.f484869fs3)) != null) {
                    finderImageBanner.o();
                }
            }
        }
    }

    public final void O0(in5.s0 s0Var) {
        jz5.f0 f0Var;
        if (s0Var != null) {
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag J0 = J0(s0Var);
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd);
            if (finderFullSeekBarLayout != null ? finderFullSeekBarLayout.isSeekMode : false) {
                return;
            }
            if (J0 != null) {
                J0.e();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("Finder.VideoAutoPlayManager", "playMusicHolder musicContainer is null!");
            }
        }
    }

    @Override // dw2.c0
    public void X(boolean z17) {
        this.f130789y = z17;
    }

    @Override // td2.c
    public void onCreate(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
    }

    @Override // td2.c
    public void onDestroy(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
    }

    @Override // td2.c
    public void onPause(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f130781q;
        n3Var.removeMessages(1);
        n3Var.removeMessages(2);
        this.f130788x = false;
    }

    @Override // td2.c
    public void onResume(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
        com.tencent.mm.ui.MMFragmentActivity activity = this.f130774g;
        if (activity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            if (((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).S6() == this.f130779o) {
                com.tencent.mm.sdk.platformtools.n3 n3Var = this.f130781q;
                if (!n3Var.hasMessages(1)) {
                    n3Var.sendEmptyMessage(1);
                }
            }
        }
        this.f130788x = true;
    }

    @Override // td2.c
    public void onStart(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
    }

    @Override // td2.c
    public void onStop(androidx.lifecycle.y var1) {
        kotlin.jvm.internal.o.g(var1, "var1");
    }

    @Override // dw2.c0
    public void s() {
        com.tencent.mm.ui.MMFragmentActivity activity = this.f130774g;
        D0(activity, this);
        kotlin.jvm.internal.o.g(activity, "activity");
        fc2.c Y6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Y6(this.f130779o);
        if (Y6 != null) {
            Y6.a(this);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f130781q;
        if (n3Var.hasMessages(1)) {
            return;
        }
        n3Var.sendEmptyMessageDelayed(1, 500L);
    }

    @Override // dw2.c0
    public void w0(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "[postCheck] source=".concat(source));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f130781q;
        n3Var.removeMessages(1);
        n3Var.sendEmptyMessage(1);
    }

    @Override // dw2.c0
    public void y(java.lang.String scene, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(scene, "scene");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[lock] scene=");
        sb6.append(scene);
        sb6.append(" isLock=");
        sb6.append(z17);
        sb6.append(" lockSize=");
        java.util.HashSet hashSet = this.f130785u;
        sb6.append(hashSet.size());
        sb6.append(" unLockAfterCheck=");
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", sb6.toString());
        if (z17) {
            hashSet.add(scene);
            this.f130786v = true;
        } else {
            hashSet.remove(scene);
            if (hashSet.size() <= 0) {
                this.f130786v = false;
            }
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f130781q;
        n3Var.removeMessages(1);
        if (this.f130786v || !z18) {
            return;
        }
        n3Var.sendEmptyMessage(1);
    }
}
