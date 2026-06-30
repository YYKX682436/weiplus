package hr3;

/* loaded from: classes11.dex */
public class oa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f283857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f283858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.va f283859f;

    public oa(hr3.va vaVar, boolean z17, boolean z18) {
        this.f283859f = vaVar;
        this.f283857d = z17;
        this.f283858e = z18;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f283859f.f284109e.K1, 1, false);
        k0Var.f211881s = new hr3.ma(this);
        k0Var.f211872n = new hr3.na(this);
        k0Var.v();
        return true;
    }
}
