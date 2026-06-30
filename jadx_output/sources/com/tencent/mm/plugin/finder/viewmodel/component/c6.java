package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class c6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f133968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC) {
        super(2);
        this.f133967d = s0Var;
        this.f133968e = finderBulletUIC;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        in5.s0 s0Var = this.f133967d;
        int c17 = com.tencent.mm.ui.bl.c(s0Var.f293121e);
        boolean z17 = s0Var.f293121e.getResources().getConfiguration().orientation == 1;
        com.tencent.mars.xlog.Log.i("FinderBulletUIC", "onKeyboardChange: isShow=" + booleanValue + ", height=" + intValue + ", navigationBarHeight=" + c17 + ", isPortrait=" + z17);
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = this.f133968e;
        if (booleanValue) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel W6 = finderBulletUIC.W6();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, intValue);
            if (z17) {
                layoutParams.bottomMargin = c17;
            } else {
                layoutParams.setMarginEnd(c17);
            }
            W6.setLayoutParams(layoutParams);
            finderBulletUIC.c7(false);
        } else if (finderBulletUIC.f133496f == 1) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel W62 = finderBulletUIC.W6();
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, 0);
            if (z17) {
                layoutParams2.bottomMargin = c17;
            } else {
                layoutParams2.setMarginEnd(c17);
            }
            W62.setLayoutParams(layoutParams2);
            com.tencent.mm.plugin.finder.megavideo.ui.MegaVideoInputLayout T6 = finderBulletUIC.T6();
            if (T6 != null) {
                T6.a();
            }
        }
        return jz5.f0.f302826a;
    }
}
