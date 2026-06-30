package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public abstract class l extends qo0.a implements com.tencent.mm.plugin.finder.live.plugin.po0, androidx.lifecycle.y {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f113324f;

    /* renamed from: g, reason: collision with root package name */
    public final qo0.c f113325g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f113326h;

    /* renamed from: i, reason: collision with root package name */
    public int f113327i;

    /* renamed from: m, reason: collision with root package name */
    public int f113328m;

    /* renamed from: n, reason: collision with root package name */
    public final int f113329n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.lifecycle.b0 f113330o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.ViewGroup vg6, qo0.c liveStatus, r45.qt2 qt2Var) {
        super(vg6, liveStatus);
        kotlin.jvm.internal.o.g(vg6, "vg");
        kotlin.jvm.internal.o.g(liveStatus, "liveStatus");
        this.f113324f = vg6;
        this.f113325g = liveStatus;
        this.f113326h = qt2Var;
        this.f113327i = this.f365323d.getVisibility();
        this.f113328m = 65535;
        ae2.in inVar = ae2.in.f3688a;
        this.f113329n = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3832o3).getValue()).r()).intValue();
        this.f113330o = new androidx.lifecycle.b0(this, true);
    }

    public static void b1(com.tencent.mm.plugin.finder.live.plugin.l lVar, android.view.View view, java.lang.String tag, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notify2ChangeCommentHeight");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        lVar.getClass();
        kotlin.jvm.internal.o.g(tag, "tag");
        if (lVar.x0()) {
            return;
        }
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.live.plugin.j(view, tag, lVar));
        } else {
            lVar.f365323d.post(new com.tencent.mm.plugin.finder.live.plugin.k(tag, z17, lVar));
        }
    }

    public static /* synthetic */ void q1(com.tencent.mm.plugin.finder.live.plugin.l lVar, java.lang.String str, java.lang.Object obj, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postPortraitAction");
        }
        if ((i17 & 2) != 0) {
            obj = null;
        }
        lVar.p1(str, obj);
    }

    public static /* synthetic */ void s1(com.tencent.mm.plugin.finder.live.plugin.l lVar, java.lang.String str, java.lang.Object obj, int i17, int i18, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postPortraitActionDelay");
        }
        if ((i18 & 2) != 0) {
            obj = null;
        }
        if ((i18 & 4) != 0) {
            i17 = android.view.ViewConfiguration.getJumpTapTimeout();
        }
        lVar.r1(str, obj, i17);
    }

    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // qo0.a
    public void E0(int i17) {
    }

    @Override // qo0.a
    public void K0(int i17) {
        this.f113327i = i17;
        if (k()) {
            android.content.Context context = R0().getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f && G()) {
                i17 = T0();
            } else if (r() && this.f113328m == 8) {
                i17 = T0();
            }
        } else {
            i17 = 8;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        viewGroup.setVisibility(i17);
        if (i17 == 0) {
            viewGroup.setAlpha(1.0f);
        }
    }

    @Override // qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.i.f112885a[status.ordinal()] == 1) {
            n1();
        }
    }

    @Override // qo0.a
    public void O0() {
        this.f113330o.i(androidx.lifecycle.n.DESTROYED);
    }

    public androidx.lifecycle.c1 P0(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        return S0().a(bu6);
    }

    public final void Q0() {
        android.content.Context context = R0().getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f && G()) {
            return;
        }
        if (r() && this.f113328m == 8) {
            return;
        }
        K0(this.f113327i);
    }

    public com.tencent.mm.plugin.finder.live.view.k0 R0() {
        qo0.c cVar = this.f113325g;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return (com.tencent.mm.plugin.finder.live.view.k0) cVar;
    }

    public final gk2.e S0() {
        qo0.c cVar = this.f113325g;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return ((com.tencent.mm.plugin.finder.live.view.k0) cVar).getBuContext();
    }

    public int T0() {
        return 8;
    }

    public com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController U0(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        qo0.c cVar = this.f113325g;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        if (k0Var != null) {
            return k0Var.getController(modelClass);
        }
        return null;
    }

    public final km2.m V0() {
        qo0.c cVar = this.f113325g;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return ((com.tencent.mm.plugin.finder.live.view.k0) cVar).getData();
    }

    public final dk2.xf W0() {
        return dk2.ef.f233372a.j(R0());
    }

    public com.tencent.mm.plugin.finder.live.plugin.l X0(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        qo0.c cVar = this.f113325g;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        if (k0Var != null) {
            return k0Var.getPlugin(modelClass);
        }
        return null;
    }

    public com.tencent.mm.plugin.finder.live.view.k0 Y0() {
        qo0.c cVar = this.f113325g;
        if (cVar instanceof com.tencent.mm.plugin.finder.live.view.k0) {
            return (com.tencent.mm.plugin.finder.live.view.k0) cVar;
        }
        return null;
    }

    public final tn0.w0 Z0() {
        qo0.c cVar = this.f113325g;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        if (k0Var != null) {
            return k0Var.getTRTCLiveCore();
        }
        return null;
    }

    public boolean a1() {
        android.content.Context context = this.f113324f.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            return false;
        }
        android.app.Activity activity = (android.app.Activity) context;
        return activity.isDestroyed() | activity.isFinishing();
    }

    public void c1(boolean z17) {
    }

    public void d1(boolean z17) {
        if (this.f113329n == 1) {
            android.view.ViewGroup viewGroup = this.f365323d;
            viewGroup.forceHasOverlappingRendering(viewGroup.hasOverlappingRendering());
        }
        if (z17) {
            K0(this.f113327i);
        }
    }

    public void e1(boolean z17) {
        if (this.f113329n == 1) {
            this.f365323d.forceHasOverlappingRendering(false);
        }
        if (z17) {
            return;
        }
        K0(this.f113327i);
    }

    public void f1(float f17) {
        if (this.f113329n == 1) {
            this.f365323d.setAlpha(f17);
        }
    }

    public void g1(android.content.res.Configuration configuration) {
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f113330o;
    }

    public tn0.w0 h() {
        return Z0();
    }

    public void h1(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
    }

    public void i1(android.os.Bundle bundle) {
    }

    public void j1(android.os.Bundle bundle, long j17) {
    }

    public void k1(android.content.Intent intent) {
    }

    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
    }

    public void n1() {
    }

    @Override // qo0.a, to0.a
    public java.lang.String name() {
        return getClass().getSimpleName() + '@' + hashCode();
    }

    public final void p1(java.lang.String action, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(action, "action");
        r1(action, obj, 0);
    }

    public gk2.e q5() {
        return S0();
    }

    public final void r1(java.lang.String action, java.lang.Object obj, int i17) {
        kotlin.jvm.internal.o.g(action, "action");
        ((mm2.c1) P0(mm2.c1.class)).R5 = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("ACTION_POST_PORTRAIT", action);
        if (i17 > 0) {
            bundle.putInt("ACTION_POST_PORTRAIT_DELAY", i17);
        }
        ((mm2.c1) P0(mm2.c1.class)).f328853o2 = new km2.i("EVENT_POST_PORTRAIT_ACTION", bundle, obj);
        R0().onPortraitAction(((mm2.c1) P0(mm2.c1.class)).f328813h2, ((mm2.c1) P0(mm2.c1.class)).f328807g2, bundle, obj);
    }

    public dk2.xf z() {
        return W0();
    }

    @Override // qo0.a
    public void z0() {
        if (this.f113330o.f11605c == androidx.lifecycle.n.DESTROYED) {
            this.f113330o = new androidx.lifecycle.b0(this, true);
        }
        this.f113330o.i(androidx.lifecycle.n.RESUMED);
    }
}
