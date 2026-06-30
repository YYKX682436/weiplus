package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ye implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.cf f120440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f120441e;

    public ye(com.tencent.mm.plugin.finder.live.widget.cf cfVar, android.widget.EditText editText) {
        this.f120440d = cfVar;
        this.f120441e = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.cf cfVar = this.f120440d;
        if (z17) {
            android.widget.EditText editText = cfVar.Q;
            if (editText != null) {
                editText.setHintTextColor(cfVar.f118183e.getResources().getColor(com.tencent.mm.R.color.FG_2));
                return;
            }
            return;
        }
        android.widget.EditText editText2 = cfVar.Q;
        if (editText2 != null) {
            editText2.setHintTextColor(cfVar.f118183e.getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        android.widget.EditText editText3 = cfVar.Q;
        android.text.Editable text = editText3 != null ? editText3.getText() : null;
        boolean z18 = text == null || text.length() == 0;
        android.widget.EditText editText4 = this.f120441e;
        java.lang.String obj = (z18 ? editText4.getHint() : editText4.getText()).toString();
        kotlin.jvm.internal.o.g(obj, "<set-?>");
        cfVar.U = obj;
        cfVar.g0(!(obj.length() == 0));
    }
}
