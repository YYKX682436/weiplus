package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class on implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147293e;

    public on(com.tencent.mm.plugin.luckymoney.ui.co coVar, r45.wv3 wv3Var) {
        this.f147293e = coVar;
        this.f147292d = wv3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17;
        r45.wv3 wv3Var = this.f147292d;
        java.lang.String str = wv3Var.f389498d;
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f147293e;
        android.view.ViewGroup.LayoutParams layoutParams = coVar.f146823v.getLayoutParams();
        android.view.ViewGroup viewGroup = coVar.f146808J;
        layoutParams.width = viewGroup.getWidth();
        layoutParams.height = viewGroup.getHeight();
        coVar.f146823v.setLayoutParams(layoutParams);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int height = iArr[1] + viewGroup.getHeight();
        int[] iArr2 = new int[2];
        android.widget.ImageView imageView = coVar.f146811g;
        imageView.getLocationOnScreen(iArr2);
        int height2 = iArr2[1] + imageView.getHeight();
        imageView.getHeight();
        float height3 = imageView.getHeight() / 1200.0f;
        r45.xv3 xv3Var = wv3Var.f389501g;
        if ((xv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390494x) || xv3Var.D != 2) ? false : true) {
            f17 = 40.0f;
        } else {
            r45.xv3 xv3Var2 = wv3Var.f389501g;
            f17 = (xv3Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var2.f390494x) || xv3Var2.D != 1) ? false : true ? 42.0f : 41.0f;
        }
        int i17 = (int) (height3 * f17);
        gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
        int width = coVar.f146810f.getWidth();
        ((com.tencent.mm.plugin.luckymoney.model.w2) jVar).getClass();
        float f18 = width * 1.6399f;
        int round = java.lang.Math.round(f18);
        int round2 = java.lang.Math.round(f18 * 1.2608f);
        android.view.View view = coVar.f146824w;
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = round;
        layoutParams2.height = round2;
        layoutParams2.bottomMargin = (height - height2) + i17;
        view.setLayoutParams(layoutParams2);
    }
}
