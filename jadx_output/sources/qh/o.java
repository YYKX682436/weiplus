package qh;

/* loaded from: classes12.dex */
public class o implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f363372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.u f363373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.t f363374c;

    public o(qh.t tVar, rh.c1 c1Var, qh.u uVar) {
        this.f363374c = tVar;
        this.f363372a = c1Var;
        this.f363373b = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.u uVar = this.f363373b;
        this.f363374c.b((rh.o2) obj, this.f363372a, uVar);
    }
}
