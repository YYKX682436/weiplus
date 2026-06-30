package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class of implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.pf f147278a;

    public of(com.tencent.mm.plugin.luckymoney.ui.pf pfVar) {
        this.f147278a = pfVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0);
        com.tencent.mm.plugin.luckymoney.ui.pf pfVar = this.f147278a;
        if (b17 > 0) {
            com.tencent.mm.plugin.luckymoney.ui.up.a(pfVar.f147317b, com.tencent.mm.R.string.f492414gj5);
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = pfVar.f147316a.f145285p;
        if (realnameGuideHelper != null) {
            realnameGuideHelper.a(pfVar.f147317b, null, null, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f147278a.f147317b.f146327n.setVisibility(0);
    }
}
