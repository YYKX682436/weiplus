package hr3;

/* loaded from: classes11.dex */
public class ja implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283696d;

    public ja(hr3.va vaVar) {
        this.f283696d = vaVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f283696d.f284109e.K1, 1, false);
        k0Var.f211881s = new hr3.z9(this);
        k0Var.f211872n = new hr3.aa(this);
        k0Var.v();
        return true;
    }
}
