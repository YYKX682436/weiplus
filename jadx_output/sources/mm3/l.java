package mm3;

/* loaded from: classes4.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.n f329648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f329649e;

    public l(mm3.n nVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f329648d = nVar;
        this.f329649e = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            this.f329648d.getActivity().finish();
        } else {
            this.f329649e.u();
        }
    }
}
