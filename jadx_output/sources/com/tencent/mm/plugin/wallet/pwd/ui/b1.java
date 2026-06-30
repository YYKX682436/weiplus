package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class b1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public b1(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.d5y);
        root.disable(com.tencent.mm.R.id.m7j);
        root.disable(com.tencent.mm.R.id.aup);
        root.disable(com.tencent.mm.R.id.auo);
        root.disable(com.tencent.mm.R.id.f485303h83);
        root.disable(com.tencent.mm.R.id.pcd);
        root.disable(com.tencent.mm.R.id.pel);
        root.focusFirst(com.tencent.mm.R.id.pbm);
        root.focusOrder().next(com.tencent.mm.R.id.hdt).next(com.tencent.mm.R.id.f487682pf5).next(com.tencent.mm.R.id.pbn).next(com.tencent.mm.R.id.pcg).next(com.tencent.mm.R.id.f485348he1).next(com.tencent.mm.R.id.tenpay_push_down).next(com.tenpay.R.id.tenpay_keyboard_1).next(com.tenpay.R.id.tenpay_keyboard_2).next(com.tenpay.R.id.tenpay_keyboard_3).next(com.tenpay.R.id.tenpay_keyboard_4).next(com.tenpay.R.id.tenpay_keyboard_5).next(com.tenpay.R.id.tenpay_keyboard_6).next(com.tenpay.R.id.tenpay_keyboard_7).next(com.tenpay.R.id.tenpay_keyboard_8).next(com.tenpay.R.id.tenpay_keyboard_9).next(com.tenpay.R.id.tenpay_keyboard_x).next(com.tenpay.R.id.tenpay_keyboard_0).next(com.tenpay.R.id.tenpay_keyboard_d).next(com.tencent.mm.R.id.actionbar_up_indicator);
        int b17 = i65.a.b(getContext(), 24);
        root.view(com.tencent.mm.R.id.pcg).expand(b17, b17, b17, b17);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        super.onResume();
    }
}
