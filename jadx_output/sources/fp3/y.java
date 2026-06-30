package fp3;

/* loaded from: classes9.dex */
public class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI f265343d;

    public y(com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI mallOrderTransactionInfoUI) {
        this.f265343d = mallOrderTransactionInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f265343d.finish();
        return false;
    }
}
