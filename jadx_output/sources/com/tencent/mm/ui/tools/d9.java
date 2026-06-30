package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class d9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper f210356d;

    public d9(com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper) {
        this.f210356d = searchViewNotRealTimeHelper;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper = this.f210356d;
        if (editable == null || editable.length() <= 0) {
            searchViewNotRealTimeHelper.f210145f.setVisibility(8);
            searchViewNotRealTimeHelper.f210146g.setEnabled(false);
        } else {
            searchViewNotRealTimeHelper.f210145f.setVisibility(0);
            searchViewNotRealTimeHelper.f210146g.setEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
