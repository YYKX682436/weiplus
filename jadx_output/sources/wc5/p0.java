package wc5;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f444620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView f444621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(wc5.y0 y0Var, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView msgHistoryGallerySearchBarView) {
        super(1);
        this.f444620d = y0Var;
        this.f444621e = msgHistoryGallerySearchBarView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.CharSequence searchText = this.f444621e.getSearchText();
        this.f444620d.Y6(booleanValue, !(searchText == null || searchText.length() == 0));
        return jz5.f0.f302826a;
    }
}
