package qh;

/* loaded from: classes12.dex */
public class p implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f363375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.u f363376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.t f363377c;

    public p(qh.t tVar, rh.c1 c1Var, qh.u uVar) {
        this.f363377c = tVar;
        this.f363375a = c1Var;
        this.f363376b = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.u uVar = this.f363376b;
        this.f363377c.b((rh.o2) obj, this.f363375a, uVar);
    }
}
