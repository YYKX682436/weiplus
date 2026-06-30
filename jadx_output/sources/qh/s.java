package qh;

/* loaded from: classes12.dex */
public class s implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f363384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.u f363385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.t f363386c;

    public s(qh.t tVar, rh.c1 c1Var, qh.u uVar) {
        this.f363386c = tVar;
        this.f363384a = c1Var;
        this.f363385b = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.u uVar = this.f363385b;
        this.f363386c.b((rh.o2) obj, this.f363384a, uVar);
    }
}
