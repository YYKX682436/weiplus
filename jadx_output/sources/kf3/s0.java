package kf3;

/* loaded from: classes5.dex */
public class s0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f307427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI f307428e;

    public s0(com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI, int i17) {
        this.f307428e = massSendHistoryUI;
        this.f307427d = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI = this.f307428e;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) massSendHistoryUI.getContext(), 1, true);
            k0Var.f211872n = new kf3.q0(this);
            k0Var.f211881s = new kf3.r0(this);
            k0Var.q(massSendHistoryUI.getResources().getString(com.tencent.mm.R.string.m68), 17);
            k0Var.v();
        }
    }
}
