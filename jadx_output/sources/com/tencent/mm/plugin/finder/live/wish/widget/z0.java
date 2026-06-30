package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.a1 f120826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.finder.live.wish.widget.a1 a1Var) {
        super(0);
        this.f120826d = a1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.wish.widget.a1 a1Var = this.f120826d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = a1Var.f120686i;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        mMEditText.setFocusableInTouchMode(true);
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = a1Var.f120686i;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("editText");
            throw null;
        }
        mMEditText2.requestFocus();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) a1Var.f118381d.getSystemService("input_method");
        if (inputMethodManager != null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText3 = a1Var.f120686i;
            if (mMEditText3 == null) {
                kotlin.jvm.internal.o.o("editText");
                throw null;
            }
            inputMethodManager.showSoftInput(mMEditText3, 0);
        }
        return jz5.f0.f302826a;
    }
}
