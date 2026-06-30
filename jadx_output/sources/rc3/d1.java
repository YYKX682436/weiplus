package rc3;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f393966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float[] f393968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float[] f393969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float[] f393970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float[] f393971i;

    public d1(rc3.f1 f1Var, int i17, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        this.f393966d = f1Var;
        this.f393967e = i17;
        this.f393968f = fArr;
        this.f393969g = fArr2;
        this.f393970h = fArr3;
        this.f393971i = fArr4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc3.k1 k1Var;
        rc3.f1 f1Var = this.f393966d;
        java.lang.String str = (java.lang.String) f1Var.f393993n.get(java.lang.Integer.valueOf(this.f393967e));
        if (str == null || (k1Var = (sc3.k1) f1Var.f393988f.invoke(str)) == null) {
            return;
        }
        k1Var.H0().Bi(this.f393967e, this.f393968f, this.f393969g, this.f393970h, this.f393971i);
    }
}
