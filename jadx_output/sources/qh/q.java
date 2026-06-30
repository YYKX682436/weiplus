package qh;

/* loaded from: classes12.dex */
public class q implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f363378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.u f363379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.t f363380c;

    public q(qh.t tVar, rh.c1 c1Var, qh.u uVar) {
        this.f363380c = tVar;
        this.f363378a = c1Var;
        this.f363379b = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.u uVar = this.f363379b;
        this.f363380c.b((rh.o2) obj, this.f363378a, uVar);
    }
}
