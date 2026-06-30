package rh;

/* loaded from: classes12.dex */
public abstract class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final rh.d3 f395484a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.d3 f395485b;

    /* renamed from: c, reason: collision with root package name */
    public final rh.d3 f395486c;

    /* renamed from: d, reason: collision with root package name */
    public final long f395487d;

    public o2(rh.d3 d3Var, rh.d3 d3Var2) {
        this.f395484a = d3Var;
        this.f395485b = d3Var2;
        this.f395487d = d3Var2.f395363a - d3Var.f395363a;
        rh.d3 a17 = a();
        this.f395486c = a17;
        a17.f395364b = true;
    }

    public abstract rh.d3 a();

    public boolean b() {
        return this.f395484a.f395365c && this.f395485b.f395365c;
    }

    public o2(rh.d3 d3Var, rh.d3 d3Var2, rh.d3 d3Var3) {
        this.f395484a = d3Var;
        this.f395485b = d3Var2;
        this.f395487d = d3Var2.f395363a - d3Var.f395363a;
        this.f395486c = d3Var3;
        d3Var3.f395364b = true;
    }
}
