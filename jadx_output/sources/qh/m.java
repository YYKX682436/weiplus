package qh;

/* loaded from: classes12.dex */
public class m implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f363366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.u f363367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.t f363368c;

    public m(qh.t tVar, rh.c1 c1Var, qh.u uVar) {
        this.f363368c = tVar;
        this.f363366a = c1Var;
        this.f363367b = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.u uVar = this.f363367b;
        this.f363368c.b((rh.o2) obj, this.f363366a, uVar);
    }
}
