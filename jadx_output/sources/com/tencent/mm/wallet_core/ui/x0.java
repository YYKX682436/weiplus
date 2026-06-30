package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class x0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f214263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f214265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f214266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f214267h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214268i;

    public x0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, boolean z17, android.view.View view, android.widget.EditText editText, int i17, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f214268i = walletBaseUI;
        this.f214263d = z17;
        this.f214264e = view;
        this.f214265f = editText;
        this.f214266g = i17;
        this.f214267h = onFocusChangeListener;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        boolean isFocused = view.isFocused();
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f214268i;
        if (!isFocused || this.f214263d) {
            java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
            android.view.View view2 = this.f214264e;
            if (view2 instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) {
                com.tencent.mm.wallet_core.ui.r1.p0(view2, walletBaseUI.mKeyboard);
            }
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.wallet_core.ui.w0(this), 200L);
        } else {
            ((android.view.inputmethod.InputMethodManager) walletBaseUI.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.wallet_core.ui.v0(this, view), 300L);
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f214267h;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
