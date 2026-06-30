package com.tencent.mm.plugin.game.luggage;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/LuggageGameHalfWebViewUI;", "Lcom/tencent/mm/plugin/game/luggage/LuggageGameWebViewUI;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class LuggageGameHalfWebViewUI extends com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI {

    /* renamed from: n, reason: collision with root package name */
    public int f139489n;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f139488m = jz5.h.b(new com.tencent.mm.plugin.game.luggage.r(this));

    /* renamed from: o, reason: collision with root package name */
    public boolean f139490o = true;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f139491p = jz5.h.b(new com.tencent.mm.plugin.game.luggage.w(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f139492q = jz5.h.b(new com.tencent.mm.plugin.game.luggage.x(this));

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI
    public com.tencent.mm.plugin.game.luggage.page.x0 W6(android.os.Bundle params, java.lang.String url) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(url, "url");
        sd.o0 g17 = com.tencent.mm.plugin.game.luggage.p1.g(this, url);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createPage, wc : ");
        sb6.append(g17 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameHalfWebViewUI", sb6.toString());
        if (g17 == null) {
            sd.x xVar = this.f139494d.f406669j;
            kotlin.jvm.internal.o.f(xVar, "getCtrl(...)");
            return new com.tencent.mm.plugin.game.luggage.page.d(xVar, null, params);
        }
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = (com.tencent.mm.plugin.game.luggage.page.b0) g17.h();
        if ((b0Var != null ? b0Var.getParent() : null) instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = b0Var.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(b0Var);
        }
        sd.x xVar2 = this.f139494d.f406669j;
        kotlin.jvm.internal.o.f(xVar2, "getCtrl(...)");
        return new com.tencent.mm.plugin.game.luggage.page.c(xVar2, g17, params);
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI
    public void a7(android.view.View view) {
    }

    public final double c7() {
        return ((java.lang.Number) ((jz5.n) this.f139488m).getValue()).doubleValue();
    }

    public final void d7(android.view.ViewGroup viewGroup) {
        java.util.Objects.toString(viewGroup);
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof android.view.ViewGroup) {
                childAt.setBackgroundResource(0);
                d7((android.view.ViewGroup) childAt);
            } else if (!kotlin.jvm.internal.o.b(childAt, (android.view.View) ((jz5.n) this.f139491p).getValue()) && !(childAt instanceof android.view.TextureView)) {
                java.util.Objects.toString(childAt);
                childAt.setBackgroundColor(0);
            }
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bga;
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(com.tencent.mm.R.anim.f477811c5, com.tencent.mm.R.anim.f477784bd);
        float floatExtra = getIntent().getFloatExtra("KHalfScreenHeightPercent", -1.0f);
        int intExtra = getIntent().getIntExtra("KHalfScreenBackGroundColor", 0);
        if (floatExtra <= 0.0f || floatExtra > 1.0f) {
            int intExtra2 = getIntent().getIntExtra("KHalfScreenHeight", (int) c7());
            this.f139489n = intExtra2;
            this.f139489n = com.tencent.mm.ui.zk.a(this, intExtra2);
            this.f139490o = true;
        } else {
            this.f139489n = (int) (floatExtra * c7());
            this.f139490o = false;
        }
        if (this.f139489n > c7()) {
            this.f139489n = (int) c7();
        }
        jz5.g gVar = this.f139491p;
        ((android.view.View) ((jz5.n) gVar).getValue()).setBackgroundColor(intExtra);
        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.game.luggage.t(this));
        this.f139494d.f406662c.setAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477810c4));
        jz5.g gVar2 = this.f139492q;
        ((com.tencent.mm.plugin.game.luggage.GameRoundContainerView) ((jz5.n) gVar2).getValue()).addView(this.f139494d.f406662c, new android.view.ViewGroup.LayoutParams(-1, this.f139489n));
        ((com.tencent.mm.plugin.game.luggage.GameRoundContainerView) ((jz5.n) gVar2).getValue()).setOnDismissListener(new com.tencent.mm.plugin.game.luggage.u(this));
        ((com.tencent.mm.plugin.game.luggage.GameRoundContainerView) ((jz5.n) gVar2).getValue()).setCanCragDelegate(new com.tencent.mm.plugin.game.luggage.v(this));
        if (this.f139490o) {
            return;
        }
        try {
            if (getWindow() != null) {
                android.view.View findViewById = getWindow().getDecorView().findViewById(android.R.id.content);
                kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.View childAt = ((android.view.ViewGroup) findViewById).getChildAt(0);
                kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                d7((android.view.ViewGroup) childAt);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
