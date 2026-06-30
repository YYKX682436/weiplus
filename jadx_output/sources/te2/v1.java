package te2;

/* loaded from: classes3.dex */
public final class v1 extends com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC
    public com.tencent.mm.plugin.finder.live.view.k0 O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new com.tencent.mm.plugin.finder.live.view.a2((com.tencent.mm.ui.MMActivity) activity, getFragment(), null);
    }

    @Override // com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC
    public void P6() {
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).setSelfNavigationBarVisible(8);
        }
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
    }

    @Override // com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC
    public void S6() {
        gk2.e eVar = gk2.e.f272471n;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O1) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f111556h;
            if (c8Var != null) {
                c8Var.z();
            }
            qp1.h0.b();
            com.tencent.mars.xlog.Log.i(this.f111552d, "tryShowFloatBallWhenExitPage resumeFloatBall");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        java.lang.String str = this.f111552d;
        com.tencent.mars.xlog.Log.i(str, "[LiveLifecycler]onStop " + this);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
        if (k0Var != null) {
            k0Var.stop();
        }
        gk2.e eVar = gk2.e.f272471n;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O1) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f111556h;
            if (c8Var != null) {
                c8Var.z();
            }
            qp1.h0.b();
            com.tencent.mars.xlog.Log.i(str, "onStop resumeFloatBall");
        }
    }
}
