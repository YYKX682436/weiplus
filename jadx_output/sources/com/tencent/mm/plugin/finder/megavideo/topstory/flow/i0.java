package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes8.dex */
public final class i0 implements pf5.g {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f120935d;

    /* renamed from: e, reason: collision with root package name */
    public final int f120936e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f120937f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f120938g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.megavideo.topstory.flow.j f120939h;

    /* renamed from: i, reason: collision with root package name */
    public r45.vs2 f120940i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f120941m;

    /* renamed from: n, reason: collision with root package name */
    public vn2.q f120942n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f120943o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f120944p;

    public i0(android.app.Activity activity, int i17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f120935d = activity;
        this.f120936e = i17;
        this.f120938g = "";
        this.f120941m = "";
        if (!vn2.u0.f438388b) {
            if (((a03.h0) ((n40.o) i95.n0.c(n40.o.class))).f426n != null) {
                java.lang.String str = ((a03.h0) ((n40.o) i95.n0.c(n40.o.class))).f429q;
                this.f120938g = str == null ? "" : str;
            }
        }
        if (this.f120938g.length() == 0) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            this.f120938g = "47-2-281-".concat(r26.i0.t(uuid, "-", "", false));
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(this.f120938g);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.h0 h0Var = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.O7).getValue()).r()).intValue() == 1 ? com.tencent.mm.plugin.finder.megavideo.topstory.flow.h0.f120928d : null;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            nyVar.k7(281, 2, h0Var);
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        zy2.ra raVar = (zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).c(zy2.ra.class);
        java.lang.String str2 = this.f120938g;
        ((com.tencent.mm.plugin.finder.viewmodel.component.ny) raVar).f135382p = str2;
        if (i17 == 1 || i17 == 2) {
            if (vn2.u0.f438388b) {
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.z0 z0Var = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.z0(activity, str2);
                android.view.View h17 = ((xn2.f1) ((jz5.n) z0Var.f121041e).getValue()).h();
                kotlin.jvm.internal.o.f(h17, "<get-root>(...)");
                this.f120937f = h17;
                this.f120939h = z0Var;
            } else {
                com.tencent.mm.plugin.finder.megavideo.topstory.flow.w0 w0Var = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.w0(activity, str2);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) w0Var.f121026d).getValue();
                n40.o oVar = (n40.o) i95.n0.c(n40.o.class);
                kotlin.jvm.internal.o.d(viewGroup);
                a03.h0 h0Var2 = (a03.h0) oVar;
                h0Var2.getClass();
                android.app.Activity context = w0Var.f121023a;
                kotlin.jvm.internal.o.g(context, "context");
                java.lang.String contextId = w0Var.f121024b;
                kotlin.jvm.internal.o.g(contextId, "contextId");
                ((qk.t6) ((jz5.n) h0Var2.f430r).getValue()).b();
                kotlinx.coroutines.l.d(h0Var2.f425m, null, kotlinx.coroutines.a1.UNDISPATCHED, new a03.d0(h0Var2, context, contextId, null), 1, null);
                this.f120937f = viewGroup;
                this.f120939h = w0Var;
            }
            kotlin.jvm.internal.o.e(this.f120939h, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.megavideo.topstory.flow.IRequest");
        }
        this.f120942n = new vn2.q(this.f120938g);
    }

    public final int a(android.app.Activity activity) {
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment;
        int hashCode = activity.hashCode();
        if (!(activity instanceof com.tencent.mm.ui.vas.VASActivity)) {
            return hashCode;
        }
        try {
            com.tencent.mm.ui.vas.VASActivity vASActivity = activity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) activity : null;
            return (vASActivity == null || (vASCommonFragment = vASActivity.get_fragment()) == null) ? hashCode : vASCommonFragment.hashCode();
        } catch (jz5.e0 unused) {
            return hashCode;
        }
    }

    public final void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "isCreate from " + this.f120944p + " to " + z17);
        this.f120944p = z17;
    }

    @Override // pf5.g
    public void onDestroy() {
        vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onDestroy");
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar = this.f120939h;
        if (jVar != null) {
            jVar.onDestroy();
        }
        this.f120939h = null;
        android.view.View view = this.f120937f;
        android.view.ViewParent parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f120937f);
        }
        this.f120937f = null;
        this.f120942n = null;
    }

    @Override // pf5.g
    public void onNewIntent(android.content.Intent intent) {
        vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onNewIntent intent=" + intent);
    }

    @Override // pf5.g
    public void onPause() {
        vn2.q qVar;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar = this.f120939h;
        java.lang.Boolean valueOf = jVar != null ? java.lang.Boolean.valueOf(jVar.onPause()) : null;
        vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onPause sessionExit=" + valueOf);
        vn2.q qVar2 = this.f120942n;
        if (qVar2 != null) {
            qVar2.c();
        }
        if (!kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE) || (qVar = this.f120942n) == null) {
            return;
        }
        qVar.f();
    }

    @Override // pf5.g
    public void onResume() {
        vn2.q qVar;
        vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onResume isCreated=" + this.f120944p);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar = this.f120939h;
        java.lang.Boolean valueOf = jVar != null ? java.lang.Boolean.valueOf(jVar.e(this.f120944p)) : null;
        if (this.f120943o && !this.f120944p) {
            vn2.q qVar2 = this.f120942n;
            if (qVar2 != null) {
                qVar2.b();
            }
            if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE) && (qVar = this.f120942n) != null) {
                qVar.e();
            }
        }
        b(false);
    }

    @Override // pf5.g
    public void onStart() {
        vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onStart");
        vn2.q qVar = this.f120942n;
        if (qVar != null) {
            qVar.f438361g = "TopStoryHomeUI";
        }
        android.app.Activity activity = this.f120935d;
        if (qVar != null) {
            qVar.f438362h = a(activity);
        }
        vn2.q qVar2 = this.f120942n;
        if (qVar2 != null) {
            kotlin.jvm.internal.o.g(activity, "activity");
            qVar2.d("onStart ".concat(activity.getClass().getName()));
            qVar2.f438357c = activity;
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar = this.f120939h;
        if (jVar != null) {
            jVar.onStart();
        }
    }

    @Override // pf5.g
    public void onStop() {
        vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onStop");
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar = this.f120939h;
        if (jVar != null) {
            jVar.onStop();
        }
        vn2.q qVar = this.f120942n;
        if (qVar != null) {
            qVar.a(this.f120935d);
        }
    }
}
