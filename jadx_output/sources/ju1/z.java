package ju1;

/* loaded from: classes9.dex */
public final class z implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI f301805d;

    public z(com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI couponAndGiftCardListV4UI) {
        this.f301805d = couponAndGiftCardListV4UI;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f301805d.getString(com.tencent.mm.R.string.f490367t0));
    }
}
