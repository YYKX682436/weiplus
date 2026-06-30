package ky2;

/* loaded from: classes.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f313515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313516g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f313517h;

    public c(ky2.w wVar, int i17, android.widget.TextView textView, android.view.View view, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f313513d = wVar;
        this.f313514e = i17;
        this.f313515f = textView;
        this.f313516g = view;
        this.f313517h = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        ky2.w wVar = this.f313513d;
        int i18 = wVar.f313589i;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f313517h;
        android.view.View view = this.f313516g;
        android.widget.TextView textView = this.f313515f;
        int i19 = this.f313514e;
        if (itemId == i18) {
            ((ky2.r) wVar.f313585e.get(i19)).f313576b.f313578a = true;
            textView.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.ejt));
            k0Var.u();
        } else if (itemId == wVar.f313590m) {
            ((ky2.r) wVar.f313585e.get(i19)).f313576b.f313578a = false;
            textView.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.ejr));
            k0Var.u();
        }
    }
}
