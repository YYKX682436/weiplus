package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class km0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f113279p;

    /* renamed from: q, reason: collision with root package name */
    public final fg2.z1 f113280q;

    /* renamed from: r, reason: collision with root package name */
    public volatile int f113281r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f113282s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f113283t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f113284u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f113285v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f113286w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.ObjectAnimator f113287x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f113288y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km0(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113279p = rootView;
        this.f113280q = fg2.z1.a(rootView);
        this.f113284u = true;
        this.f113285v = new java.util.LinkedList();
        this.f113286w = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.finder.live.plugin.ul0(this));
        this.f113288y = jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.rl0.f114158d);
        K0(8);
        rootView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ql0(this));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.km0 km0Var) {
        com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "startLoop: " + km0Var.f113281r);
        int i17 = km0Var.f113281r + 1;
        if (i17 >= km0Var.f113285v.size()) {
            i17 = 0;
        }
        km0Var.f113286w.removeMessages(1);
        if (km0Var.f113285v.size() > 1) {
            km0Var.f113286w.sendMessageDelayed(km0Var.f113286w.obtainMessage(1, i17, 0), 5000L);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "currentList size <=1 not need loop");
        km0Var.f113281r = 0;
        if (!km0Var.f113285v.isEmpty()) {
            com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "currentList size ==1 update view to current data");
            java.lang.Object obj = km0Var.f113285v.get(km0Var.f113281r);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            km0Var.w1((com.tencent.mm.plugin.finder.live.plugin.tl0) obj, false);
        }
        km0Var.f113284u = true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        zg2.d dVar;
        zg2.d dVar2;
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.sl0.f114276a[status.ordinal()] == 1) {
            ((mm2.f7) P0(mm2.f7.class)).f329058f.observe(this, new com.tencent.mm.plugin.finder.live.plugin.wl0(this));
            df2.c9 c9Var = (df2.c9) U0(df2.c9.class);
            if (c9Var != null && (dVar2 = c9Var.f229867m) != null) {
                dVar2.observe(this, new com.tencent.mm.plugin.finder.live.plugin.yl0(this));
            }
            ((mm2.f7) P0(mm2.f7.class)).f329059g.observe(this, new com.tencent.mm.plugin.finder.live.plugin.am0(this));
            df2.a0 a0Var = (df2.a0) U0(df2.a0.class);
            if (a0Var != null && (dVar = a0Var.f229647m) != null) {
                dVar.observe(this, new com.tencent.mm.plugin.finder.live.plugin.cm0(this));
            }
            this.f113280q.f262424f.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.dm0(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        u1(true);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return (zl2.r4.F1(S0()) || ((mm2.c1) P0(mm2.c1.class)).f328801f2 == 1) ? false : true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void u1(boolean z17) {
        this.f113281r = 0;
        if (z17 || this.f113285v.isEmpty()) {
            this.f113285v.clear();
            K0(8);
            this.f113284u = true;
            this.f113286w.removeMessages(1);
        }
        android.animation.ObjectAnimator objectAnimator = this.f113287x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final java.util.HashMap v1() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("user_type", zl2.r4.f473950a.w1() ? "1" : "2");
        java.lang.String str = this.f113282s;
        if (str == null) {
            str = "";
        }
        hashMap.put("wish_list_id", str);
        hashMap.put("screen_type", x0() ? "2" : "1");
        int i17 = this.f113281r;
        int size = this.f113285v.size() - 1;
        if (i17 > size) {
            i17 = size;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        if (((com.tencent.mm.plugin.finder.live.plugin.tl0) this.f113285v.get(i17)).f114425a instanceof r45.aa4) {
            hashMap.put("type", "1");
        } else if (((com.tencent.mm.plugin.finder.live.plugin.tl0) this.f113285v.get(i17)).f114425a instanceof r45.zv1) {
            hashMap.put("type", "2");
        } else if (((com.tencent.mm.plugin.finder.live.plugin.tl0) this.f113285v.get(i17)).f114425a instanceof r45.gh6) {
            hashMap.put("type", "3");
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0205, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1(com.tencent.mm.plugin.finder.live.plugin.tl0 r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.km0.w1(com.tencent.mm.plugin.finder.live.plugin.tl0, boolean):void");
    }
}
