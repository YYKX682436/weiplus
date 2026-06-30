package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class i5 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderEditTextUI f129349a;

    public i5(com.tencent.mm.plugin.finder.ui.FinderEditTextUI finderEditTextUI) {
        this.f129349a = finderEditTextUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView = this.f129349a.f128563t;
        if (finderEditTextView == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderEditTextView.f136948e;
        if (mMEditText != null) {
            mMEditText.n(str);
        } else {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.finder.widget.edit.FinderEditTextView finderEditTextView = this.f129349a.f128563t;
        if (finderEditTextView == null) {
            kotlin.jvm.internal.o.o("editView");
            throw null;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderEditTextView.f136948e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        android.view.inputmethod.InputConnection inputConnection = mMEditText.getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 67));
            inputConnection.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
