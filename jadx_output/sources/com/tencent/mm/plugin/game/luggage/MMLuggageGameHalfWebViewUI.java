package com.tencent.mm.plugin.game.luggage;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/MMLuggageGameHalfWebViewUI;", "Lcom/tencent/mm/plugin/game/luggage/MMLuggageGameWebViewUI;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MMLuggageGameHalfWebViewUI extends com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI {

    /* renamed from: i, reason: collision with root package name */
    public int f139500i;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f139499h = jz5.h.b(new com.tencent.mm.plugin.game.luggage.w0(this));

    /* renamed from: m, reason: collision with root package name */
    public boolean f139501m = true;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f139502n = jz5.h.b(new com.tencent.mm.plugin.game.luggage.z0(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f139503o = jz5.h.b(new com.tencent.mm.plugin.game.luggage.a1(this));

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI
    public com.tencent.mm.plugin.game.luggage.page.x0 U6(android.os.Bundle params, java.lang.String url) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(url, "url");
        sd.o0 g17 = com.tencent.mm.plugin.game.luggage.p1.g(this, url);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createPage, wc : ");
        sb6.append(g17 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMLuggageGameHalfWebViewUI", sb6.toString());
        if (g17 == null) {
            sd.x xVar = this.f139504d.f406669j;
            kotlin.jvm.internal.o.f(xVar, "getCtrl(...)");
            return new com.tencent.mm.plugin.game.luggage.page.d(xVar, null, params);
        }
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = (com.tencent.mm.plugin.game.luggage.page.b0) g17.h();
        if ((b0Var != null ? b0Var.getParent() : null) instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = b0Var.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(b0Var);
        }
        sd.x xVar2 = this.f139504d.f406669j;
        kotlin.jvm.internal.o.f(xVar2, "getCtrl(...)");
        return new com.tencent.mm.plugin.game.luggage.page.c(xVar2, g17, params);
    }

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI
    public void X6(android.view.View view) {
    }

    public final double Y6() {
        return ((java.lang.Number) ((jz5.n) this.f139499h).getValue()).doubleValue();
    }

    public final void Z6(android.view.ViewGroup viewGroup) {
        java.util.Objects.toString(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof android.view.ViewGroup) {
                childAt.setBackgroundResource(0);
                Z6((android.view.ViewGroup) childAt);
            } else if (!kotlin.jvm.internal.o.b(childAt, (android.view.View) ((jz5.n) this.f139502n).getValue())) {
                java.util.Objects.toString(childAt);
                childAt.setBackgroundColor(0);
            }
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bga;
    }

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(com.tencent.mm.R.anim.f477783bc, com.tencent.mm.R.anim.f477784bd);
        float floatExtra = getIntent().getFloatExtra("KHalfScreenHeightPercent", -1.0f);
        if (floatExtra <= 0.0f || floatExtra > 1.0f) {
            int intExtra = getIntent().getIntExtra("KHalfScreenHeight", (int) Y6());
            this.f139500i = intExtra;
            this.f139500i = com.tencent.mm.ui.zk.a(this, intExtra);
            this.f139501m = true;
        } else {
            this.f139500i = (int) (floatExtra * Y6());
            this.f139501m = false;
        }
        if (this.f139500i > Y6()) {
            this.f139500i = (int) Y6();
        }
        boolean C = com.tencent.mm.ui.bk.C();
        jz5.g gVar = this.f139502n;
        if (C) {
            ((android.view.View) ((jz5.n) gVar).getValue()).setBackgroundResource(com.tencent.mm.R.color.f479225td);
        }
        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.game.luggage.y0(this));
        this.f139504d.f406662c.setAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477810c4));
        ((com.tencent.mm.plugin.game.luggage.GameRoundContainerView) ((jz5.n) this.f139503o).getValue()).addView(this.f139504d.f406662c, new android.view.ViewGroup.LayoutParams(-1, this.f139500i));
        if (this.f139501m) {
            return;
        }
        try {
            if (getWindow() != null) {
                android.view.View findViewById = getWindow().getDecorView().findViewById(android.R.id.content);
                kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.View childAt = ((android.view.ViewGroup) findViewById).getChildAt(0);
                kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                Z6((android.view.ViewGroup) childAt);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
