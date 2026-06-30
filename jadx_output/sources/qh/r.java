package qh;

/* loaded from: classes12.dex */
public class r implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f363381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.u f363382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.t f363383c;

    public r(qh.t tVar, rh.c1 c1Var, qh.u uVar) {
        this.f363383c = tVar;
        this.f363381a = c1Var;
        this.f363382b = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.u uVar = this.f363382b;
        this.f363383c.b((rh.o2) obj, this.f363381a, uVar);
    }
}
