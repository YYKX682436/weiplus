package da2;

/* loaded from: classes2.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da2.g f227740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zi2 f227741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f227742f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227743g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f227744h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f227745i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f227746m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227747n;

    public e(da2.g gVar, r45.zi2 zi2Var, long j17, java.lang.String str, int i17, long j18, int i18, android.content.Context context) {
        this.f227740d = gVar;
        this.f227741e = zi2Var;
        this.f227742f = j17;
        this.f227743g = str;
        this.f227744h = i17;
        this.f227745i = j18;
        this.f227746m = i18;
        this.f227747n = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        menuItem.getItemId();
        if (menuItem.getItemId() == 1001 && da2.g.l(this.f227740d, this.f227741e, this.f227742f, this.f227743g, this.f227744h, this.f227745i, this.f227746m, false, null, 128, null)) {
            return;
        }
        this.f227740d.i(menuItem.getItemId(), this.f227747n, this.f227745i);
    }
}
