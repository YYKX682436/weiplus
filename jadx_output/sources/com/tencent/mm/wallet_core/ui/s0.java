package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class s0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f214225d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f214226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f214227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f214228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214229h;

    public s0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, boolean z17, android.widget.EditText editText, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f214229h = walletBaseUI;
        this.f214226e = z17;
        this.f214227f = editText;
        this.f214228g = onFocusChangeListener;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            ((android.view.inputmethod.InputMethodManager) this.f214229h.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.wallet_core.ui.q0(this, view), 300L);
        } else {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.wallet_core.ui.r0(this), 200L);
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f214228g;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
