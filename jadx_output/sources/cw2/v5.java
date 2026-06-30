package cw2;

/* loaded from: classes11.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f224064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f224065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f224066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f224067g;

    public v5(cw2.z5 z5Var, android.view.Surface surface, int i17, int i18) {
        this.f224064d = z5Var;
        this.f224065e = surface;
        this.f224066f = i17;
        this.f224067g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f224064d.f224141i = new cw2.p5(this.f224065e, this.f224066f, this.f224067g);
    }
}
