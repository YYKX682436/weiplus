package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class a implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.o0 f123515a;

    public a(com.tencent.mm.plugin.finder.profile.uic.o0 o0Var) {
        this.f123515a = o0Var;
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout view, int i17) {
        float f17;
        com.tencent.mm.ui.ga controller;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = this.f123515a;
        o0Var.getClass();
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(i17) * 1.0f) / o0Var.N);
        if (min == o0Var.G) {
            return;
        }
        o0Var.G = min;
        jz5.g gVar = o0Var.f124033u;
        jz5.g gVar2 = o0Var.f124038z;
        if (min < 0.5f) {
            f17 = (0.5f - min) / 0.5f;
            o0Var.W6().setBackgroundColor(o0Var.getResources().getColor(com.tencent.mm.R.color.a9e));
            if (!o0Var.getFragmentMode()) {
                androidx.appcompat.app.AppCompatActivity activity = o0Var.getActivity();
                com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
                if (mMActivity != null && (controller = mMActivity.getController()) != null) {
                    controller.O0(com.tencent.mm.ui.bk.C());
                }
            }
            ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).setAlpha(0.0f);
            ((android.widget.FrameLayout) ((jz5.n) gVar2).getValue()).setVisibility(8);
            o0Var.W6().setAlpha(1.0f);
            com.tencent.mm.plugin.finder.profile.uic.o0.O6(o0Var, min, f17);
            android.app.Activity context = o0Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.profile.uic.ob) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.ob.class)).L7();
        } else {
            float f18 = (min - 0.5f) / 0.5f;
            jz5.l lVar = o0Var.f124019J;
            int i18 = o0Var.K;
            int i19 = o0Var.E;
            if (lVar == null) {
                o0Var.I = i19;
                o0Var.L = i18;
                ((android.widget.FrameLayout) ((jz5.n) gVar2).getValue()).setVisibility(8);
            } else if (((java.lang.Boolean) lVar.f302833d).booleanValue()) {
                java.lang.Number number = (java.lang.Number) lVar.f302834e;
                o0Var.I = number.intValue();
                o0Var.L = number.intValue();
                jz5.n nVar = (jz5.n) gVar2;
                ((android.widget.FrameLayout) nVar.getValue()).setVisibility(0);
                ((android.widget.FrameLayout) nVar.getValue()).setAlpha(0.4f * f18);
            } else {
                o0Var.I = i19;
                o0Var.L = i18;
                ((android.widget.FrameLayout) ((jz5.n) gVar2).getValue()).setVisibility(8);
            }
            java.lang.Object evaluate = o0Var.H.evaluate(f18, java.lang.Integer.valueOf(o0Var.I), java.lang.Integer.valueOf(o0Var.L));
            kotlin.jvm.internal.o.e(evaluate, "null cannot be cast to non-null type kotlin.Int");
            o0Var.W6().setBackgroundColor(((java.lang.Integer) evaluate).intValue());
            if (!o0Var.getFragmentMode()) {
                androidx.appcompat.app.AppCompatActivity activity2 = o0Var.getActivity();
                kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.tencent.mm.ui.MMActivity) activity2).getController().O0(com.tencent.mm.ui.bk.C());
            }
            ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).setAlpha(f18);
            o0Var.W6().setAlpha(f18);
            com.tencent.mm.plugin.finder.profile.uic.o0.O6(o0Var, min, f18);
            android.app.Activity context2 = o0Var.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.profile.uic.ob) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.ob.class)).g7().setVisibility(8);
            f17 = f18;
        }
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) o0Var.f124027o).getValue()).setAlpha(f17);
        o0Var.Y6().setAlpha(f17);
    }
}
