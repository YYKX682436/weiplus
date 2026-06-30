package qh;

/* loaded from: classes12.dex */
public class n implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f363369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qh.u f363370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh.t f363371c;

    public n(qh.t tVar, rh.c1 c1Var, qh.u uVar) {
        this.f363371c = tVar;
        this.f363369a = c1Var;
        this.f363370b = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.u uVar = this.f363370b;
        this.f363371c.b((rh.o2) obj, this.f363369a, uVar);
    }
}
