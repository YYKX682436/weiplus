package fp3;

/* loaded from: classes9.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI f265303d;

    public d(com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI) {
        this.f265303d = mallOrderDetailInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.B;
        com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI = this.f265303d;
        db5.e1.h(mallOrderDetailInfoUI, "", new java.lang.String[]{mallOrderDetailInfoUI.getString(com.tencent.mm.R.string.grm)}, "", false, new fp3.e(mallOrderDetailInfoUI));
        return true;
    }
}
