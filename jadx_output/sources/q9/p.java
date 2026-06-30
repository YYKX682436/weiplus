package q9;

/* loaded from: classes15.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final d9.l0 f360870a;

    /* renamed from: b, reason: collision with root package name */
    public final q9.n f360871b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f360872c;

    /* renamed from: d, reason: collision with root package name */
    public final m8.d0[] f360873d;

    public p(d9.l0 l0Var, q9.n nVar, java.lang.Object obj, m8.d0[] d0VarArr) {
        this.f360870a = l0Var;
        this.f360871b = nVar;
        this.f360872c = obj;
        this.f360873d = d0VarArr;
    }

    public boolean a(q9.p pVar, int i17) {
        return pVar != null && t9.d0.a(this.f360871b.f360868b[i17], pVar.f360871b.f360868b[i17]) && t9.d0.a(this.f360873d[i17], pVar.f360873d[i17]);
    }
}
