package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mr f118970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(com.tencent.mm.plugin.finder.live.widget.mr mrVar) {
        super(0);
        this.f118970d = mrVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.mr mrVar = this.f118970d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = mrVar.N;
        java.lang.Boolean bool = null;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("descEdt");
            throw null;
        }
        boolean requestFocus = mMEditText.requestFocus();
        android.content.Context context = mrVar.f118183e;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = mrVar.N;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("descEdt");
                throw null;
            }
            bool = java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(mMEditText2, 0));
        }
        com.tencent.mars.xlog.Log.i(mrVar.I, "[showKVB] imm:" + inputMethodManager + ", result:" + bool + ", inputEtFocused:" + requestFocus);
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).showVKB();
        }
        return jz5.f0.f302826a;
    }
}
