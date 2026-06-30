package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class td implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xv3 f147454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.ud f147456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147457h;

    public td(android.view.View view, r45.xv3 xv3Var, r45.wv3 wv3Var, com.tencent.mm.plugin.luckymoney.ui.ud udVar, android.view.View view2) {
        this.f147453d = view;
        this.f147454e = xv3Var;
        this.f147455f = wv3Var;
        this.f147456g = udVar;
        this.f147457h = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17;
        r45.xv3 xv3Var;
        android.view.View view = this.f147453d;
        int height = (int) (((view != null ? view.getHeight() : 0) / 1200.0f) * (com.tencent.mm.sdk.platformtools.t8.K0(this.f147454e.f390494x) ^ true ? 50 : 48));
        gb3.k kVar = (gb3.k) i95.n0.c(gb3.k.class);
        com.tencent.mm.plugin.luckymoney.ui.ud udVar = this.f147456g;
        android.view.View findViewById = udVar.findViewById(com.tencent.mm.R.id.uee);
        com.tencent.mm.view.MMPAGView O6 = udVar.O6();
        kotlinx.coroutines.y0 y0Var = udVar.f147499d;
        int width = this.f147457h.getWidth();
        ((com.tencent.mm.plugin.luckymoney.model.z2) kVar).getClass();
        if (findViewById == null || O6 == null || view == null) {
            return;
        }
        r45.wv3 wv3Var = this.f147455f;
        java.lang.String str = (wv3Var == null || (xv3Var = wv3Var.f389501g) == null) ? null : xv3Var.M;
        if (str == null || str.length() == 0) {
            return;
        }
        if (width == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogicNew", "[renderFullAtmosphereDynamic] viewWidth == 0, fix it");
            width = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX);
        }
        float f18 = width * 1.62f;
        int round = java.lang.Math.round(f18);
        int round2 = java.lang.Math.round(f18 * 1.2578f);
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = round;
            layoutParams.height = round2;
            findViewById.setLayoutParams(layoutParams);
        }
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (round2 != 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            f17 = ((iArr[1] + view.getHeight()) - round2) - height;
        } else {
            f17 = 0.0f;
        }
        if (f17 == 0.0f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogicNew", "[renderFullAtmosphereDynamic] atmosphereDynamicCoverY == 0, fix it");
            f17 = ((com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f197136b * 0.5f) + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 0)) - round2;
        }
        findViewById.setY(f17);
        com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, 13, y0Var, new com.tencent.mm.plugin.luckymoney.model.y2(java.lang.System.currentTimeMillis(), findViewById, 13, O6));
    }
}
