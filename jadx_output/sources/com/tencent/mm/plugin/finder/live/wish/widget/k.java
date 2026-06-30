package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes10.dex */
public final class k implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.m f120722d;

    public k(com.tencent.mm.plugin.finder.live.wish.widget.m mVar) {
        this.f120722d = mVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("InteractionWishContract.ViewCallback", "performanceName afterTextChanged called s:" + ((java.lang.Object) editable));
        int length = str.length();
        com.tencent.mm.plugin.finder.live.wish.widget.m mVar = this.f120722d;
        if (length <= 4) {
            com.tencent.mm.plugin.finder.live.wish.widget.i iVar = mVar.f120734g;
            iVar.getClass();
            iVar.f120710f = str;
            return;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = mVar.f120736i;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("performanceNameEditText");
            throw null;
        }
        java.lang.String substring = str.substring(0, 4);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        mMEditText.setText(substring);
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = mVar.f120736i;
        if (mMEditText2 != null) {
            mMEditText2.setSelection(4);
        } else {
            kotlin.jvm.internal.o.o("performanceNameEditText");
            throw null;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("InteractionWishContract.ViewCallback", "performanceName beforeTextChanged called s:" + ((java.lang.Object) charSequence));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        android.widget.TextView textView = this.f120722d.f120740p;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("performanceNameInvalidDesc");
            throw null;
        }
    }
}
