package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fa extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f112525p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f112526q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.FrameLayout f112527r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy f112528s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView f112529t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f112530u;

    /* renamed from: v, reason: collision with root package name */
    public int f112531v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112525p = "Finder.FinderLiveAudioModePreviewPlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.enq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f112526q = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.env);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f112527r = (android.widget.FrameLayout) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.enw);
        ((com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView) findViewById3).setVisibility(8);
        kotlin.jvm.internal.o.f(findViewById3, "apply(...)");
        this.f112529t = (com.tencent.mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView) findViewById3;
        this.f112531v = -1;
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        u1(micUserMap.size() > 1);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        android.view.ViewGroup viewGroup = this.f365323d;
        java.lang.String str = this.f112525p;
        if (ordinal != 191) {
            if (ordinal != 248) {
                return;
            }
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", true) : true;
            com.tencent.mars.xlog.Log.i(str, "FINDER_LIVE_CO_LIVE_CAMERA_TOGGLE: open=" + z17);
            t1(z17 ^ true);
            if (this.f112531v == -1) {
                this.f112531v = com.tencent.mm.ui.bl.c(viewGroup.getContext());
            }
            zl2.r4.g(zl2.r4.f473950a, this.f112525p, this.f365323d, z17, false, this.f112531v, 8, null);
            return;
        }
        boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
        boolean z19 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
        t1(z18);
        if (z19) {
            K0(4);
        }
        if (z18) {
            if (this.f112531v == -1) {
                this.f112531v = com.tencent.mm.ui.bl.c(viewGroup.getContext());
            }
            zl2.r4.g(zl2.r4.f473950a, this.f112525p, this.f365323d, !r5.x1(), false, this.f112531v, 8, null);
        }
        com.tencent.mars.xlog.Log.i(str, "FINDER_LIVE_MODE_SWITCH isAudioMode:" + z18);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f112530u = true;
        y1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(boolean z17) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.uo1 liveDesc;
        java.util.LinkedList linkedList;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4;
        r45.uo1 liveDesc2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAudioMode isAudioMode:");
        sb6.append(z17);
        sb6.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
        sb6.append(((mm2.c1) P0(mm2.c1.class)).I4);
        sb6.append(" liveDesc.cover:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) P0(mm2.c1.class)).f328846n;
        sb6.append((finderObject2 == null || (objectDesc4 = finderObject2.getObjectDesc()) == null || (liveDesc2 = objectDesc4.getLiveDesc()) == null) ? null : liveDesc2.getString(0));
        sb6.append(" media.url:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = ((mm2.c1) P0(mm2.c1.class)).f328846n;
        sb6.append((finderObject3 == null || (objectDesc3 = finderObject3.getObjectDesc()) == null || (media2 = objectDesc3.getMedia()) == null || (finderMedia2 = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media2)) == null) ? null : finderMedia2.getUrl());
        com.tencent.mars.xlog.Log.i(this.f112525p, sb6.toString());
        if (zl2.r4.f473950a.x1()) {
            if (z17) {
                java.lang.String str = (java.lang.String) ((kotlinx.coroutines.flow.h3) ((mm2.g1) P0(mm2.g1.class)).f329075p).getValue();
                ((mm2.c1) P0(mm2.c1.class)).w7();
                pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.z9(this, str));
            } else {
                K0(4);
            }
        } else if (z17) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = ((mm2.c1) P0(mm2.c1.class)).f328846n;
            java.lang.String string = (finderObject4 == null || (objectDesc2 = finderObject4.getObjectDesc()) == null || (liveDesc = objectDesc2.getLiveDesc()) == null) ? null : liveDesc.getString(0);
            if ((string == null || string.length() == 0) && ((finderObject = ((mm2.c1) P0(mm2.c1.class)).f328846n) == null || (objectDesc = finderObject.getObjectDesc()) == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null || (string = finderMedia.getUrl()) == null)) {
                string = "";
            }
            if (string == null || string.length() == 0) {
                java.lang.String str2 = V0().f309129d.f68542m;
                kotlin.jvm.internal.o.d(str2);
                java.lang.String str3 = str2.length() > 0 ? str2 : null;
                if (str3 == null) {
                    str3 = ((mm2.c1) P0(mm2.c1.class)).f328852o;
                }
                ya2.b2 b17 = ((mm2.c1) P0(mm2.c1.class)).Y4 ? ya2.h.f460484a.b(((mm2.c1) P0(mm2.c1.class)).f328852o) : ya2.h.f460484a.b(str3);
                string = b17 != null ? b17.y0() : "";
            }
            ((mm2.c1) P0(mm2.c1.class)).w7();
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.z9(this, string));
        } else {
            K0(4);
        }
        if (!z17) {
            y1();
        }
        xh2.b bVar = ((mm2.y2) P0(mm2.y2.class)).f329565r;
        u1(((bVar == null || (linkedList = bVar.f454530i) == null) ? 0 : linkedList.size()) > 1);
    }

    public final void u1(boolean z17) {
        android.widget.FrameLayout frameLayout = this.f112527r;
        android.widget.ImageView imageView = this.f112526q;
        java.lang.String str = this.f112525p;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "checkIsNeedForbidMainAudioCover alpha 1");
            x1(imageView, true);
            x1(frameLayout, true);
        } else {
            com.tencent.mars.xlog.Log.i(str, "checkIsNeedForbidMainAudioCover alpha 0");
            x1(imageView, false);
            x1(frameLayout, false);
            x1(this.f112529t, false);
        }
    }

    public final void v1(java.lang.String str) {
        if (r26.i0.y(str, "http", false)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c a17 = g1Var.e().a(new mn2.j0(str));
            com.tencent.mm.plugin.finder.live.plugin.ba baVar = new com.tencent.mm.plugin.finder.live.plugin.ba(this);
            a17.getClass();
            a17.f447873d = baVar;
            a17.g(g1Var.h(mn2.f1.G));
            a17.f();
            return;
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a18.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        java.io.InputStream D = com.tencent.mm.vfs.w6.D(a18, com.tencent.mm.vfs.a3.f212781a.m(a18, null));
        kotlin.jvm.internal.o.f(D, "openRead(...)");
        android.view.ViewGroup viewGroup = this.f365323d;
        android.graphics.Bitmap P = com.tencent.mm.sdk.platformtools.x.P(D, 0.0f, i65.a.B(viewGroup.getContext()), i65.a.k(viewGroup.getContext()), true);
        this.f112526q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(viewGroup.getContext().getResources(), P));
        ((mm2.c1) P0(mm2.c1.class)).I4 = P;
    }

    public final void w1() {
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f112528s;
        if (finderLiveThumbPlayerProxy != null) {
            if (!finderLiveThumbPlayerProxy.isPlaying()) {
                finderLiveThumbPlayerProxy = null;
            }
            if (finderLiveThumbPlayerProxy != null) {
                finderLiveThumbPlayerProxy.pause();
            }
        }
    }

    public final void x1(android.view.View view, boolean z17) {
        float f17 = z17 ? 1.0f : 0.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAudioModePreviewPlugin", "setViewAlpha", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAudioModePreviewPlugin", "setViewAlpha", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void y1() {
        com.tencent.mars.xlog.Log.i(this.f112525p, "playerView stopAndReleasePlayerView " + this.f112528s);
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f112528s;
        if (finderLiveThumbPlayerProxy != null) {
            finderLiveThumbPlayerProxy.stop();
        }
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy2 = this.f112528s;
        if (finderLiveThumbPlayerProxy2 != null) {
            finderLiveThumbPlayerProxy2.d();
        }
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy3 = this.f112528s;
        if (finderLiveThumbPlayerProxy3 != null) {
            finderLiveThumbPlayerProxy3.b();
        }
        this.f112528s = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        this.f112530u = false;
        if (((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(((ct2.j) P0(ct2.j.class)).P6())) {
            ((mm2.c1) P0(mm2.c1.class)).B1.observe(this, new com.tencent.mm.plugin.finder.live.plugin.ca(this));
        }
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.ea(this, null), 3, null);
    }
}
