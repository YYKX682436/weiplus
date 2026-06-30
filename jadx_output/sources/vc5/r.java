package vc5;

/* loaded from: classes10.dex */
public final class r implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView f435341d;

    public r(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView msgHistoryGallerySearchBarView) {
        this.f435341d = msgHistoryGallerySearchBarView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.e(this.f435341d, false, str.length() > 0, false, 5, null);
        yz5.l onSearchTextChangedListener = this.f435341d.getOnSearchTextChangedListener();
        if (onSearchTextChangedListener != null) {
            onSearchTextChangedListener.invoke(str);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
