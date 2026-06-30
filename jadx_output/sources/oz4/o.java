package oz4;

/* loaded from: classes12.dex */
public class o extends mz4.t {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f350293f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f350294g;

    public o(int i17, int i18, boolean z17, boolean z18) {
        super(i17, i18);
        this.f350293f = z17;
        this.f350294g = z18;
    }

    public int c() {
        return java.lang.Math.abs(this.f333351e - this.f333350d);
    }

    public boolean d(mz4.t tVar) {
        if (tVar == null) {
            return false;
        }
        if (!tVar.a()) {
            return java.lang.Math.max(this.f333350d, tVar.f333350d) < java.lang.Math.min(this.f333351e, tVar.f333351e);
        }
        int i17 = tVar.f333350d;
        int i18 = this.f333350d;
        return (i17 >= i18 && tVar.f333351e < this.f333351e) || ((i17 >= i18 && tVar.f333351e <= this.f333351e) && this.f350294g);
    }
}
