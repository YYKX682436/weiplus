package kn;

/* loaded from: classes13.dex */
public class g0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn.i0 f309394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f309395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f309396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309397g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f309398h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f309399i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309400m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309401n;

    public g0(kn.i0 i0Var, boolean z17, int i17, java.lang.String str, int i18, int i19, java.lang.String str2, java.lang.String str3) {
        this.f309394d = i0Var;
        this.f309395e = z17;
        this.f309396f = i17;
        this.f309397g = str;
        this.f309398h = i18;
        this.f309399i = i19;
        this.f309400m = str2;
        this.f309401n = str3;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kn.i0 i0Var;
        if (menuItem.getItemId() != 0 || (i0Var = this.f309394d) == null) {
            return;
        }
        boolean z17 = this.f309395e;
        if (z17) {
            i0Var.a();
        } else {
            i0Var.b();
        }
        int i18 = this.f309396f;
        if (i18 == 2) {
            kn.k0.c(this.f309397g, 2, this.f309398h, z17 ? 1 : 2, this.f309399i, this.f309400m, this.f309401n);
        } else if (i18 == 1) {
            kn.k0.b(this.f309397g, this.f309398h, 3, 2, this.f309400m, this.f309401n);
        }
    }
}
