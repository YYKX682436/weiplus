package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class hg implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.ig f146996a;

    public hg(com.tencent.mm.plugin.luckymoney.ui.ig igVar) {
        this.f146996a = igVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0);
        com.tencent.mm.plugin.luckymoney.ui.ig igVar = this.f146996a;
        if (b17 > 0) {
            com.tencent.mm.plugin.luckymoney.ui.up.a(igVar.f147029b.getContext(), com.tencent.mm.R.string.f492414gj5);
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = igVar.f147028a.f145285p;
        if (realnameGuideHelper != null) {
            realnameGuideHelper.a(igVar.f147029b, null, null, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
