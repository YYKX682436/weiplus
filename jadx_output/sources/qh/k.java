package qh;

/* loaded from: classes12.dex */
public class k implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f363360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.u f363361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.t f363362c;

    public k(qh.t tVar, rh.c1 c1Var, qh.u uVar) {
        this.f363362c = tVar;
        this.f363360a = c1Var;
        this.f363361b = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.u uVar = this.f363361b;
        this.f363362c.b((rh.o2) obj, this.f363360a, uVar);
    }
}
