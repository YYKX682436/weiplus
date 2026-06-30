package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes5.dex */
public class m1 implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI f179418d;

    public m1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI) {
        this.f179418d = wcPayRealnameInputAddressUI;
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        android.animation.ObjectAnimator ofFloat;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI = this.f179418d;
        boolean z18 = wcPayRealnameInputAddressUI.f179257r;
        if (!wcPayRealnameInputAddressUI.f179257r && z17) {
            int height = ((android.view.WindowManager) wcPayRealnameInputAddressUI.getSystemService("window")).getDefaultDisplay().getHeight();
            int b17 = i65.a.b(wcPayRealnameInputAddressUI.getContext(), 96);
            int b18 = i65.a.b(wcPayRealnameInputAddressUI.getContext(), 40);
            int b19 = i65.a.b(wcPayRealnameInputAddressUI.getContext(), 32);
            int b27 = i65.a.b(wcPayRealnameInputAddressUI.getContext(), 40);
            int j17 = (((height - com.tencent.mm.ui.bl.j(wcPayRealnameInputAddressUI.getContext())) - com.tencent.mm.ui.bl.c(wcPayRealnameInputAddressUI.getContext())) - o25.n1.a(wcPayRealnameInputAddressUI.getContext())) - wcPayRealnameInputAddressUI.f179247e.getBottom();
            if (((j17 - b27) - i17) - b18 > b19) {
                wcPayRealnameInputAddressUI.f179256q = i17 - (b17 - b18);
            } else {
                wcPayRealnameInputAddressUI.f179256q = ((j17 - b19) - b27) - b17;
            }
        }
        if (wcPayRealnameInputAddressUI.f179257r != z17) {
            wcPayRealnameInputAddressUI.f179257r = z17;
            if (z17) {
                android.widget.Button button = wcPayRealnameInputAddressUI.f179248f;
                ofFloat = android.animation.ObjectAnimator.ofFloat(button, "translationY", button.getTranslationY(), wcPayRealnameInputAddressUI.f179248f.getTranslationY() - wcPayRealnameInputAddressUI.f179256q);
            } else {
                android.widget.Button button2 = wcPayRealnameInputAddressUI.f179248f;
                ofFloat = android.animation.ObjectAnimator.ofFloat(button2, "translationY", button2.getTranslationY(), wcPayRealnameInputAddressUI.f179248f.getTranslationY() + wcPayRealnameInputAddressUI.f179256q);
            }
            ofFloat.setDuration(175L);
            ofFloat.setInterpolator(new y3.b());
            ofFloat.start();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "onInputPanelChange() isKeyboardShow:%s keyboardHeight:%s moveHeight:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(wcPayRealnameInputAddressUI.f179256q));
    }
}
