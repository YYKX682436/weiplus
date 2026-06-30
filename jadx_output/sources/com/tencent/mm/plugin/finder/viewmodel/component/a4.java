package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d */
    public final jz5.g f133711d;

    /* renamed from: e */
    public android.graphics.Rect f133712e;

    /* renamed from: f */
    public android.graphics.Rect f133713f;

    /* renamed from: g */
    public android.graphics.Rect f133714g;

    /* renamed from: h */
    public in5.s0 f133715h;

    /* renamed from: i */
    public android.view.View f133716i;

    /* renamed from: m */
    public com.tencent.mm.plugin.finder.viewmodel.component.oc0 f133717m;

    /* renamed from: n */
    public android.view.View f133718n;

    /* renamed from: o */
    public android.view.View f133719o;

    /* renamed from: p */
    public android.view.View f133720p;

    /* renamed from: q */
    public android.view.View f133721q;

    /* renamed from: r */
    public android.view.View f133722r;

    /* renamed from: s */
    public android.view.View f133723s;

    /* renamed from: t */
    public android.view.View f133724t;

    /* renamed from: u */
    public android.view.View f133725u;

    /* renamed from: v */
    public android.view.View f133726v;

    /* renamed from: w */
    public android.view.View f133727w;

    /* renamed from: x */
    public boolean f133728x;

    /* renamed from: y */
    public boolean f133729y;

    /* renamed from: z */
    public yz5.a f133730z;

    static {
        new com.tencent.mm.plugin.finder.viewmodel.component.g2(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133711d = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.h2.f134573d);
        qg2.d dVar = qg2.d.f362793a;
        dVar.g();
        dVar.f();
        this.f133712e = new android.graphics.Rect();
        this.f133713f = new android.graphics.Rect();
        this.f133714g = new android.graphics.Rect();
    }

    public static /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a Z6(com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var, androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, yz5.l lVar, yz5.l lVar2, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 32) != 0) {
            z17 = false;
        }
        return a4Var.Y6(fragment, baseFinderFeed, s0Var, lVar, lVar2, z17);
    }

    public final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a O6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return com.tencent.mm.plugin.finder.viewmodel.component.ha.P6((com.tencent.mm.plugin.finder.viewmodel.component.ha) a17, 3, Z6(this, fragment, baseFinderFeed, holder, com.tencent.mm.plugin.finder.viewmodel.component.i2.f134689d, com.tencent.mm.plugin.finder.viewmodel.component.j2.f134801d, false, 32, null), null, 4, null);
    }

    public final void P6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed feedObj, in5.s0 holder, com.tencent.mm.plugin.finder.view.f5 f5Var) {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer;
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        kotlin.jvm.internal.o.g(holder, "holder");
        Z6(this, fragment, feedObj, holder, new com.tencent.mm.plugin.finder.viewmodel.component.m2(f5Var), new com.tencent.mm.plugin.finder.viewmodel.component.n2(f5Var), false, 32, null);
        if (f5Var == null || (finderCommentDrawer = f5Var.f132067a) == null) {
            return;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = (com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        com.tencent.mm.plugin.finder.viewmodel.component.o2 o2Var = new com.tencent.mm.plugin.finder.viewmodel.component.o2(f5Var);
        haVar.getClass();
        finderCommentDrawer.h(new com.tencent.mm.plugin.finder.viewmodel.component.fa(haVar, 1, o2Var, null));
    }

    public final void Q6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed feedObj, in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar) {
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        kotlin.jvm.internal.o.g(holder, "holder");
        Z6(this, fragment, feedObj, holder, new com.tencent.mm.plugin.finder.viewmodel.component.p2(aiVar), new com.tencent.mm.plugin.finder.viewmodel.component.q2(aiVar), false, 32, null);
        if (aiVar != null) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = (com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
            com.tencent.mm.plugin.finder.viewmodel.component.r2 r2Var = new com.tencent.mm.plugin.finder.viewmodel.component.r2(aiVar);
            haVar.getClass();
            aiVar.O6(new com.tencent.mm.plugin.finder.viewmodel.component.fa(haVar, 9, r2Var, null));
        }
    }

    public final void R6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed feedObj, in5.s0 holder, com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer) {
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        kotlin.jvm.internal.o.g(holder, "holder");
        Z6(this, fragment, feedObj, holder, new com.tencent.mm.plugin.finder.viewmodel.component.y2(finderLikeDrawer), new com.tencent.mm.plugin.finder.viewmodel.component.z2(finderLikeDrawer), false, 32, null);
        if (finderLikeDrawer != null) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = (com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
            com.tencent.mm.plugin.finder.viewmodel.component.a3 a3Var = new com.tencent.mm.plugin.finder.viewmodel.component.a3(finderLikeDrawer);
            haVar.getClass();
            finderLikeDrawer.h(new com.tencent.mm.plugin.finder.viewmodel.component.fa(haVar, 7, a3Var, null));
        }
    }

    public final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a S6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return com.tencent.mm.plugin.finder.viewmodel.component.ha.P6((com.tencent.mm.plugin.finder.viewmodel.component.ha) a17, 16, Z6(this, fragment, baseFinderFeed, holder, com.tencent.mm.plugin.finder.viewmodel.component.b3.f133831d, com.tencent.mm.plugin.finder.viewmodel.component.c3.f133951d, false, 32, null), null, 4, null);
    }

    public final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a T6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return com.tencent.mm.plugin.finder.viewmodel.component.ha.P6((com.tencent.mm.plugin.finder.viewmodel.component.ha) a17, 8, Z6(this, fragment, baseFinderFeed, holder, com.tencent.mm.plugin.finder.viewmodel.component.d3.f134073d, com.tencent.mm.plugin.finder.viewmodel.component.e3.f134186d, false, 32, null), null, 4, null);
    }

    public final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a U6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f133728x = true;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return com.tencent.mm.plugin.finder.viewmodel.component.ha.P6((com.tencent.mm.plugin.finder.viewmodel.component.ha) a17, 12, Y6(fragment, baseFinderFeed, holder, com.tencent.mm.plugin.finder.viewmodel.component.f3.f134326d, new com.tencent.mm.plugin.finder.viewmodel.component.g3(this), true), null, 4, null);
    }

    public final void V6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed feedObj, in5.s0 holder, com.tencent.mm.plugin.finder.drama.detail.y drawer) {
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(drawer, "drawer");
        Z6(this, fragment, feedObj, holder, new com.tencent.mm.plugin.finder.viewmodel.component.h3(drawer), new com.tencent.mm.plugin.finder.viewmodel.component.i3(drawer), false, 32, null);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = (com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        com.tencent.mm.plugin.finder.viewmodel.component.j3 j3Var = new com.tencent.mm.plugin.finder.viewmodel.component.j3(drawer);
        haVar.getClass();
        drawer.f105196q.add(new com.tencent.mm.plugin.finder.viewmodel.component.fa(haVar, 9, j3Var, null));
    }

    public final void W6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed feedObj, in5.s0 holder, com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer) {
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        kotlin.jvm.internal.o.g(holder, "holder");
        Z6(this, fragment, feedObj, holder, new com.tencent.mm.plugin.finder.viewmodel.component.k3(finderPlayListDrawer), new com.tencent.mm.plugin.finder.viewmodel.component.l3(finderPlayListDrawer), false, 32, null);
        if (finderPlayListDrawer != null) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = (com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
            com.tencent.mm.plugin.finder.viewmodel.component.m3 m3Var = new com.tencent.mm.plugin.finder.viewmodel.component.m3(finderPlayListDrawer);
            haVar.getClass();
            finderPlayListDrawer.h(new com.tencent.mm.plugin.finder.viewmodel.component.fa(haVar, 4, m3Var, null));
        }
    }

    public final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a X6(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return com.tencent.mm.plugin.finder.viewmodel.component.ha.P6((com.tencent.mm.plugin.finder.viewmodel.component.ha) a17, 15, Z6(this, fragment, baseFinderFeed, holder, com.tencent.mm.plugin.finder.viewmodel.component.s3.f135854d, com.tencent.mm.plugin.finder.viewmodel.component.t3.f135969d, false, 32, null), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a Y6(androidx.fragment.app.Fragment r34, com.tencent.mm.plugin.finder.model.BaseFinderFeed r35, in5.s0 r36, yz5.l r37, yz5.l r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 2402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.a4.Y6(androidx.fragment.app.Fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, yz5.l, yz5.l, boolean):com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$a");
    }
}
