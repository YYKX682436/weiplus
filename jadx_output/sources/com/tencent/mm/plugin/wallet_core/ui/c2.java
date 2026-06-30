package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class c2 implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180170a;

    public c2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180170a = walletCardElementUI;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        this.f180170a.f179915m2 = i17;
    }
}
