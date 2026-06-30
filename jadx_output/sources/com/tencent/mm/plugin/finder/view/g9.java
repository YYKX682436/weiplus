package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class g9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView f132150d;

    public g9(com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView) {
        this.f132150d = finderExtendReadingEditView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        this.f132150d.a();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
