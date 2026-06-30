package fj2;

/* loaded from: classes3.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f263167e;

    public e(int i17, kotlin.jvm.internal.h0 h0Var, yz5.a aVar) {
        this.f263166d = h0Var;
        this.f263167e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) this.f263166d.f310123d;
            if (k0Var != null) {
                k0Var.u();
            }
            this.f263167e.invoke();
        }
    }
}
