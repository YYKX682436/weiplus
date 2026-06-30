package in2;

/* loaded from: classes10.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292813e;

    public c(in2.s sVar, android.view.View view) {
        this.f292812d = sVar;
        this.f292813e = view;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        in2.s sVar = this.f292812d;
        if (itemId == sVar.L) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = sVar.P;
            if (mMSwitchBtn != null) {
                mMSwitchBtn.setCheck(false);
            }
            sf2.x xVar = sVar.I;
            xVar.q7(false);
            xVar.n7(false, new in2.l(sVar, false, this.f292813e));
        }
    }
}
