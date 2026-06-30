package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class r0 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175465a;

    public r0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175465a = v0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f175465a.f175484n;
        if (mMEditText != null) {
            mMEditText.n(str);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection inputConnection;
        android.view.inputmethod.InputConnection inputConnection2;
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175465a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = v0Var.f175484n;
        if (mMEditText != null && (inputConnection2 = mMEditText.getInputConnection()) != null) {
            inputConnection2.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = v0Var.f175484n;
        if (mMEditText2 == null || (inputConnection = mMEditText2.getInputConnection()) == null) {
            return;
        }
        inputConnection.sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        com.tencent.mm.plugin.transvoice.ui.v0.E(this.f175465a);
    }
}
