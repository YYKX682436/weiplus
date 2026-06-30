package qw3;

/* loaded from: classes3.dex */
public class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw3.i f367141d;

    public b(qw3.i iVar) {
        this.f367141d = iVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        qw3.i iVar = this.f367141d;
        if (itemId == 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(iVar.f367166d.C)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BankRemitBankcardInputUI", "paylist url is null");
            } else {
                com.tencent.mm.wallet_core.ui.r1.V(iVar.f367166d.getContext(), iVar.f367166d.C, false);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14673, 6);
            return;
        }
        if (itemId != 1) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.V(iVar.f367166d.getContext(), "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2) + "/touch/scene_product.html?scene_id=kf4568", true);
    }
}
