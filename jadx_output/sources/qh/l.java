package qh;

/* loaded from: classes12.dex */
public class l implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f363363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.u f363364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.t f363365c;

    public l(qh.t tVar, rh.c1 c1Var, qh.u uVar) {
        this.f363365c = tVar;
        this.f363363a = c1Var;
        this.f363364b = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.u uVar = this.f363364b;
        this.f363365c.b((rh.o2) obj, this.f363363a, uVar);
    }
}
