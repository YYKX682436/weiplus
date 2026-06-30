package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class FinderVideoRecycler extends pf5.o0 implements com.tencent.mm.plugin.finder.viewmodel.component.nb0 {

    /* renamed from: g, reason: collision with root package name */
    public int f133674g;

    /* renamed from: q, reason: collision with root package name */
    public int f133681q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver f133682r;

    /* renamed from: u, reason: collision with root package name */
    public cw2.da f133685u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.HandlerThread f133686v;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$onlineVideoEventListener$1 f133689y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f133672e = true;

    /* renamed from: f, reason: collision with root package name */
    public int f133673f = 1;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f133675h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f133676i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f133677m = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f133678n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f133679o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashSet f133680p = new java.util.HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f133683s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final fz2.b f133684t = new com.tencent.mm.plugin.finder.viewmodel.component.y90(this);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f133687w = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashMap f133688x = new java.util.HashMap();

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$onlineVideoEventListener$1] */
    public FinderVideoRecycler() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f133689y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnlineVideoEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$onlineVideoEventListener$1
            {
                this.__eventId = -2133747774;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent) {
                com.tencent.mm.autogen.events.OnlineVideoEvent event = onlineVideoEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.hn hnVar = event.f54588g;
                if (hnVar.f6845b != -21112) {
                    return false;
                }
                java.lang.String str = hnVar.f6846c;
                com.tencent.mars.xlog.Log.w("Finder.VideoRecycler", "[videoSourceChange] mediaId=" + str);
                com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.this;
                finderVideoRecycler.O6(new com.tencent.mm.plugin.finder.viewmodel.component.aa0(str, finderVideoRecycler));
                return false;
            }
        };
    }

    public static final void N6(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler, cw2.da daVar) {
        int V6;
        int i17;
        boolean z17;
        finderVideoRecycler.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean W6 = finderVideoRecycler.W6(daVar);
        daVar.setTag(com.tencent.mm.R.id.g4z, 0);
        finderVideoRecycler.O6(new com.tencent.mm.plugin.finder.viewmodel.component.fa0(daVar));
        java.util.HashSet hashSet = finderVideoRecycler.f133676i;
        hashSet.remove(daVar);
        if (cq.k.f221221n.a()) {
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            finderVideoRecycler.O6(new com.tencent.mm.plugin.finder.viewmodel.component.w90(null, finderVideoRecycler, W6, f0Var));
            V6 = f0Var.f310116d;
            i17 = W6 ? 2 : finderVideoRecycler.f133673f;
        } else {
            V6 = finderVideoRecycler.V6(null);
            i17 = finderVideoRecycler.f133673f;
        }
        boolean z18 = V6 < i17 && finderVideoRecycler.f133680p.contains(java.lang.String.valueOf(daVar.getVideoView().getContext().hashCode()));
        if (z18) {
            finderVideoRecycler.f133677m.add(new java.lang.ref.WeakReference(daVar));
            hashSet.add(daVar);
            com.tencent.mm.plugin.finder.viewmodel.component.l90 l90Var = (com.tencent.mm.plugin.finder.viewmodel.component.l90) finderVideoRecycler.f133679o.remove(java.lang.Integer.valueOf(daVar.hashCode()));
            if (l90Var != null) {
                com.tencent.mm.plugin.finder.viewmodel.component.s90 s90Var = (com.tencent.mm.plugin.finder.viewmodel.component.s90) l90Var;
                com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler2 = s90Var.f135877a;
                java.util.HashMap hashMap = finderVideoRecycler2.f133678n;
                int i18 = s90Var.f135878b;
                java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i18));
                java.lang.String str = s90Var.f135879c;
                if (kotlin.jvm.internal.o.b(obj, str)) {
                    com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "getOrCreate hit cache for wait recycled for mediaId:" + str + ' ' + i18);
                    s90Var.f135880d.invoke(daVar);
                    z17 = true;
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "getOrCreate wait for callback, but it(" + str + ") has been replace(" + ((java.lang.String) finderVideoRecycler2.f133678n.get(java.lang.Integer.valueOf(i18))) + "). key=" + i18);
                    z17 = false;
                }
                if (z17) {
                    hashSet.remove(daVar);
                }
            }
        } else {
            daVar.setTag(com.tencent.mm.R.id.twb, java.lang.Boolean.FALSE);
            daVar.b();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[recycledVideoView] ret=");
        sb6.append(z18);
        sb6.append(" cost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append("ms view=");
        sb6.append(daVar.hashCode());
        sb6.append(" isLP=");
        sb6.append(W6);
        sb6.append(" bucketCount=");
        sb6.append(V6);
        sb6.append(" bucketMax=");
        sb6.append(i17);
        sb6.append(" videoCount=");
        sb6.append(finderVideoRecycler.V6(null));
        sb6.append(", recycledCount=");
        sb6.append(hashSet.size());
        sb6.append(", ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((cw2.da) it.next()).hashCode()));
        }
        sb6.append(arrayList);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", sb6.toString());
    }

    public static /* synthetic */ cw2.da R6(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler, android.content.Context context, int i17, boolean z17, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        return finderVideoRecycler.Q6(context, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? false : z18, (i18 & 16) != 0 ? false : z19);
    }

    public final void O6(yz5.l isRemoveFun) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(isRemoveFun, "isRemoveFun");
        java.util.Iterator it = this.f133677m.iterator();
        while (it.hasNext()) {
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it.next()).get();
            if (daVar != null) {
                if (((java.lang.Boolean) isRemoveFun.invoke(daVar)).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "acrossCreatedVideoViews 1 remove it:" + daVar + " mediaid:" + daVar.getVideoMediaId());
                    it.remove();
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "acrossCreatedVideoViews 2 remove");
                it.remove();
            }
        }
    }

    public void P6(cw2.da videoView) {
        kotlin.jvm.internal.o.g(videoView, "videoView");
        this.f133677m.add(new java.lang.ref.WeakReference(videoView));
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[addVideoView] videoCount=" + V6(null) + " videoView=" + videoView.getClass().getSimpleName());
    }

    public final cw2.da Q6(android.content.Context context, int i17, boolean z17, boolean z18, boolean z19) {
        cw2.da daVar;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i17 == 1) {
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            cw2.da finderVLogCompositionPlayView = new com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView(context);
            finderVLogCompositionPlayView.setContextTag(context.hashCode());
            daVar = finderVLogCompositionPlayView;
        } else if (i17 == 2) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((b92.d1) zbVar).getClass();
            cw2.da liveFeedPlayerView = z19 ? new com.tencent.mm.plugin.finder.video.LiveFeedPlayerView(context2) : new com.tencent.mm.plugin.finder.video.FinderLivePlayView(context2);
            liveFeedPlayerView.setContextTag(context.hashCode());
            cw2.y9 videoAdapter = liveFeedPlayerView.getVideoAdapter();
            daVar = liveFeedPlayerView;
            if (videoAdapter != null) {
                videoAdapter.setContextSimpleName(context.getClass().getSimpleName());
                daVar = liveFeedPlayerView;
            }
        } else if (!((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Ni() || z17) {
            com.tencent.mm.plugin.finder.video.FinderCropVideoView finderCropVideoView = new com.tencent.mm.plugin.finder.video.FinderCropVideoView(context);
            finderCropVideoView.setContextTag(context.hashCode());
            finderCropVideoView.setBanRequestAudioFocus(true);
            daVar = finderCropVideoView;
        } else if (z18) {
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            cw2.da finderFluentVideoView = new com.tencent.mm.plugin.finder.video.FinderFluentVideoView(context3);
            finderFluentVideoView.setContextTag(context.hashCode());
            daVar = finderFluentVideoView;
        } else {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127771ja).getValue()).r()).intValue() > 0) {
                android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                cw2.da oVar = new cw2.o(context4);
                oVar.setContextTag(context.hashCode());
                daVar = oVar;
            } else {
                android.content.Context context5 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context5, "getContext(...)");
                cw2.da finderThumbPlayerProxy = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy(context5);
                finderThumbPlayerProxy.setContextTag(context.hashCode());
                daVar = finderThumbPlayerProxy;
            }
        }
        this.f133677m.add(new java.lang.ref.WeakReference(daVar));
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[createVideoView] activity=" + context.getClass().getSimpleName() + " videoCount=" + V6(null) + " videoView=" + daVar.getClass().getSimpleName() + " cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        return daVar;
    }

    public cw2.da S6(android.content.Context context) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        O6(new com.tencent.mm.plugin.finder.viewmodel.component.p90(context, h0Var));
        return (cw2.da) h0Var.f310123d;
    }

    public final java.lang.String T6(java.lang.String str, cw2.da daVar) {
        if (!(daVar instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy)) {
            return "mediaId:" + str;
        }
        return "ftpp:" + ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar).getFTPPTag() + " mediaId:" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U6(android.view.ViewGroup r23, int r24, mn2.j4 r25, boolean r26, yz5.l r27) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.U6(android.view.ViewGroup, int, mn2.j4, boolean, yz5.l):void");
    }

    public final int V6(java.lang.Class cls) {
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        O6(new com.tencent.mm.plugin.finder.viewmodel.component.v90(cls, f0Var));
        return f0Var.f310116d;
    }

    public final boolean W6(cw2.da daVar) {
        java.lang.Object tag = daVar.getTag(com.tencent.mm.R.id.twb);
        return kotlin.jvm.internal.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE);
    }

    public void X6(cw2.da daVar) {
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "markRecentFocusView videoView:" + daVar);
        this.f133685u = daVar;
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "onFinish");
        this.f133685u = null;
        dead();
        this.f133675h.post(new com.tencent.mm.plugin.finder.viewmodel.component.x90(this));
        this.f133680p.clear();
        this.f133679o.clear();
        this.f133683s.clear();
        com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver headsetReceiver = this.f133682r;
        if (headsetReceiver != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            headsetReceiver.c(context);
        }
    }

    public final void Z6(java.lang.String mediaId) {
        java.lang.String videoMediaId;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.H4).getValue()).r()).intValue() != 1) {
            return;
        }
        java.util.Iterator it = this.f133677m.iterator();
        while (it.hasNext()) {
            cw2.da daVar = (cw2.da) ((java.lang.ref.WeakReference) it.next()).get();
            if (daVar != null && (videoMediaId = daVar.getVideoMediaId()) != null) {
                com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "onPreloadComplete " + videoMediaId + ' ' + mediaId);
                if (kotlin.jvm.internal.o.b(videoMediaId, mediaId)) {
                    daVar.F();
                }
            }
        }
    }

    public void a7(yz5.l filter) {
        kotlin.jvm.internal.o.g(filter, "filter");
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.ca0(this, filter));
    }

    public void b7(android.view.ViewGroup parent, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f133678n.put(java.lang.Integer.valueOf(parent.hashCode()), null);
        android.view.KeyEvent.Callback findViewWithTag = parent.findViewWithTag(java.lang.Integer.valueOf(parent.hashCode()));
        if (findViewWithTag instanceof cw2.da) {
            cw2.da daVar = (cw2.da) findViewWithTag;
            daVar.getVideoMediaId();
            com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[pauseOrRecycle] pauseWithCancel mediaId:" + daVar.getVideoMediaId() + " videoView(" + daVar.hashCode() + ") isForceRemove=" + z17 + " isTryKeep=" + z18);
            daVar.setVideoViewFocused(false);
            if (z18 || !z17) {
                daVar.w();
            } else {
                d7(daVar, "pauseAndRecycle");
            }
        }
    }

    public void c7(android.content.Context context) {
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.ea0(this, context));
    }

    public final void d7(cw2.da daVar, java.lang.String str) {
        java.util.HashMap hashMap = this.f133688x;
        if (hashMap.containsKey(java.lang.Integer.valueOf(daVar.hashCode()))) {
            com.tencent.mars.xlog.Log.w("Finder.VideoRecycler", "[releaseVideoView] videoView=" + daVar.hashCode() + " is releasing, source=" + str);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        hashMap.put(java.lang.Integer.valueOf(daVar.hashCode()), daVar);
        e7(daVar.getVideoView());
        daVar.pause();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[releaseVideoView] async release videoView(");
        sb6.append(daVar.hashCode());
        sb6.append(") parent=");
        android.view.ViewParent parentView = daVar.getParentView();
        sb6.append(parentView != null ? parentView.hashCode() : 0);
        sb6.append(" source=");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", sb6.toString());
        pm0.v.K(null, new com.tencent.mm.plugin.finder.viewmodel.component.ja0(daVar, this, currentTimeMillis, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e7(android.view.View view) {
        android.view.ViewParent parent;
        if (view == 0 || (parent = view.getParent()) == null) {
            return false;
        }
        this.f133678n.put(java.lang.Integer.valueOf(parent.hashCode()), null);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        viewGroup.removeView(view);
        cw2.da daVar = view instanceof cw2.da ? (cw2.da) view : null;
        if (daVar != null) {
            daVar.pause();
        }
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[removeViewFromParent] parent=" + parent.hashCode() + ", videoView=" + view.hashCode() + ", parentTag=" + viewGroup.getTag());
        return true;
    }

    public void f7(android.content.Context context) {
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.na0(this, context));
    }

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[onCleared] videoCount=" + V6(null));
        Y6();
    }
}
