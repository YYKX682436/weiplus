package vc5;

/* loaded from: classes10.dex */
public final class o implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView f435336d;

    public o(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView msgHistoryGallerySearchBarView) {
        this.f435336d = msgHistoryGallerySearchBarView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.e(this.f435336d, z17, false, false, 6, null);
        yz5.l onSearchFocusChangedListener = this.f435336d.getOnSearchFocusChangedListener();
        if (onSearchFocusChangedListener != null) {
            onSearchFocusChangedListener.invoke(java.lang.Boolean.valueOf(z17));
        }
    }
}
