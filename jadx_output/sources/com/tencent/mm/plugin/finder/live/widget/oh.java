package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class oh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f119303d;

    public oh(com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        this.f119303d = xhVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFansModifyGiftWidget", "afterTextChanged " + ((java.lang.Object) editable));
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        com.tencent.mm.plugin.finder.live.widget.xh xhVar = this.f119303d;
        xhVar.B = valueOf;
        xhVar.f120328n.setText(valueOf);
        xhVar.f120327m.l("customText", xhVar.B);
        xhVar.f();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
