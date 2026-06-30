package zw1;

/* loaded from: classes5.dex */
public class h0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI f476648d;

    public h0(com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f476648d = collectCreateQRCodeNewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI = this.f476648d;
        collectCreateQRCodeNewUI.setResult(0);
        collectCreateQRCodeNewUI.finish();
        return true;
    }
}
