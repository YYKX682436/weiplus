package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class m1 extends com.tencent.mm.ui.tools.c9 {

    /* renamed from: r, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f138301r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f138302s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.widget.l1 f138303t;

    public m1(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f138301r = activity;
    }

    @Override // com.tencent.mm.ui.tools.c9
    public boolean h() {
        return this.f138302s;
    }

    @Override // com.tencent.mm.ui.tools.c9
    public void j(androidx.fragment.app.FragmentActivity fragmentActivity, android.view.Menu menu) {
        if (fragmentActivity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.FTSVoiceSearchViewHelper", "on add search menu, activity is null");
            return;
        }
        if (this.f210323h == null) {
            if (com.tencent.mm.plugin.fts.ui.n3.g(fragmentActivity)) {
                s();
            } else {
                this.f210323h = new com.tencent.mm.plugin.fts.ui.widget.FTSActionBarSearchView(fragmentActivity);
            }
        }
        super.j(fragmentActivity, menu);
    }

    @Override // com.tencent.mm.ui.tools.c9
    public void p() {
        com.tencent.mm.plugin.fts.ui.widget.l1 l1Var = this.f138303t;
        if (l1Var != null) {
            com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI = ((com.tencent.mm.plugin.fts.ui.k0) l1Var).f138091a;
            fTSBaseMainUI.getStateCenter().B3(new b23.g(fTSBaseMainUI.K1));
        }
    }

    @Override // com.tencent.mm.ui.tools.c9
    public void r(java.lang.String str) {
        t(str, k23.r2.f303683e);
    }

    public final void s() {
        if (this.f210323h != null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f138301r;
        this.f210323h = new com.tencent.mm.plugin.fts.ui.widget.v(appCompatActivity);
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(appCompatActivity).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        com.tencent.mm.ui.tools.o3 o3Var = this.f210323h;
        kotlin.jvm.internal.o.e(o3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.widget.FTSActionBarNewSearchView");
        com.tencent.mm.plugin.fts.ui.widget.v vVar = (com.tencent.mm.plugin.fts.ui.widget.v) o3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[ftsaisearch] setSearchView " + vVar);
        fVar.f469399e = vVar;
        yz5.l lVar = fVar.f469400f;
        if (lVar != null) {
            vVar.C = lVar;
        }
        java.lang.Object obj = this.f210323h;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
        if (((android.view.View) obj).getParent() == null) {
            android.view.View findViewById = appCompatActivity.findViewById(com.tencent.mm.R.id.u8p);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) findViewById).addView((android.view.View) this.f210323h);
        }
    }

    public final void t(java.lang.String str, k23.r2 voiceTextType) {
        kotlin.jvm.internal.o.g(voiceTextType, "voiceTextType");
        try {
            super.r(str);
            androidx.appcompat.app.AppCompatActivity context = this.f138301r;
            kotlin.jvm.internal.o.g(context, "context");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(z13.f.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            z13.f fVar = (z13.f) a17;
            if (str == null) {
                str = "";
            }
            fVar.h7(str, voiceTextType, "", true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSVoiceSearchViewHelper", "setSearchContent exception: " + e17.getMessage());
        }
    }

    public final void u(java.lang.String str) {
        super.r(str);
    }
}
