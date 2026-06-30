package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f214124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f214126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214127g;

    public d0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, boolean z17, int i17, android.widget.EditText editText) {
        this.f214127g = walletBaseUI;
        this.f214124d = z17;
        this.f214125e = i17;
        this.f214126f = editText;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/WalletBaseUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f214127g;
        boolean isShown = walletBaseUI.mKBLayout.isShown();
        boolean z17 = this.f214124d;
        if (!isShown && !z17) {
            walletBaseUI.showTenpayKB();
            walletBaseUI.setKBMode(this.f214125e);
        } else if (z17) {
            walletBaseUI.hideTenpayKB();
            ((android.view.inputmethod.InputMethodManager) walletBaseUI.getContext().getSystemService("input_method")).showSoftInput(this.f214126f, 0);
        }
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WalletBaseUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
