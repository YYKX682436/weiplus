package u73;

/* loaded from: classes9.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f425124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ft5 f425125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.an6 f425127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f425128h;

    public g(com.tencent.mm.ui.MMActivity mMActivity, r45.ft5 ft5Var, java.lang.String str, r45.an6 an6Var, int i17) {
        this.f425124d = mMActivity;
        this.f425125e = ft5Var;
        this.f425126f = str;
        this.f425127g = an6Var;
        this.f425128h = i17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f425124d, 1, false);
        k0Var.f211872n = new u73.e(this);
        k0Var.f211881s = new u73.f(this);
        k0Var.v();
        return false;
    }
}
