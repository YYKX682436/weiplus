package cw2;

/* loaded from: classes14.dex */
public final class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f224118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f224119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f224120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f224121g;

    public y5(cw2.z5 z5Var, int i17, int i18, int i19) {
        this.f224118d = z5Var;
        this.f224119e = i17;
        this.f224120f = i18;
        this.f224121g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw2.b6 b6Var = this.f224118d.f224135c;
        if (b6Var != null) {
            b6Var.f223599e = this.f224119e;
            b6Var.f223600f = this.f224120f;
            b6Var.f223601g = this.f224121g;
        }
    }
}
