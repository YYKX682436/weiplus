package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class qn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147357d;

    public qn(com.tencent.mm.plugin.luckymoney.ui.co coVar) {
        this.f147357d = coVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f147357d;
        float width = coVar.f146810f.getWidth() * 1.0993f;
        int round = java.lang.Math.round(width);
        int round2 = java.lang.Math.round(width * 1.72f);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) coVar.f146812h.getLayoutParams();
        layoutParams.width = round;
        layoutParams.height = round2;
        coVar.f146812h.setLayoutParams(layoutParams);
    }
}
