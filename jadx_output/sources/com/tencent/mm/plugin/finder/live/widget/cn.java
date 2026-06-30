package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes5.dex */
public final class cn implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f118014d;

    public cn(com.tencent.mm.plugin.finder.live.widget.mn mnVar) {
        this.f118014d = mnVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f118014d;
        android.text.Editable text = mnVar.f119090n.getText();
        java.lang.String obj = text != null ? text.toString() : null;
        if (obj == null || obj.length() == 0) {
            mnVar.f119089m.setVisibility(8);
        } else {
            mnVar.f119089m.setVisibility(0);
        }
        if (obj == null) {
            obj = "";
        }
        mnVar.f119100x = obj;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
