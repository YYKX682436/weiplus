package vc5;

/* loaded from: classes10.dex */
public final class m implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.d2 f435333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView f435334e;

    public m(em.d2 d2Var, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView msgHistoryGallerySearchBarView) {
        this.f435333d = d2Var;
        this.f435334e = msgHistoryGallerySearchBarView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 3) {
            return false;
        }
        this.f435333d.d().clearFocus();
        int i18 = com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.f201731n;
        this.f435334e.b();
        return true;
    }
}
