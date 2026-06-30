package rc3;

/* loaded from: classes7.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f393974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f393976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f393977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f393978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f393979i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f393980m;

    public e1(rc3.f1 f1Var, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f393974d = f1Var;
        this.f393975e = i17;
        this.f393976f = i18;
        this.f393977g = i19;
        this.f393978h = i27;
        this.f393979i = i28;
        this.f393980m = i29;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc3.k1 k1Var;
        rc3.f1 f1Var = this.f393974d;
        java.lang.String str = (java.lang.String) f1Var.f393993n.get(java.lang.Integer.valueOf(this.f393975e));
        if (str == null || (k1Var = (sc3.k1) f1Var.f393988f.invoke(str)) == null) {
            return;
        }
        k1Var.H0().B8(this.f393975e, this.f393976f, this.f393977g, this.f393978h, this.f393979i, this.f393980m);
    }
}
