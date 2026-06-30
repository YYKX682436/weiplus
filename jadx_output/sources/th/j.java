package th;

/* loaded from: classes12.dex */
public class j implements sh.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ th.k f419252a;

    public j(th.k kVar) {
        this.f419252a = kVar;
    }

    @Override // sh.b
    public boolean a(rh.c1 c1Var, long j17) {
        th.k kVar = this.f419252a;
        th.o oVar = kVar.f419255c;
        oVar.f419264b.post(new th.n(oVar, c1Var));
        th.o oVar2 = kVar.f419255c;
        return oVar2.f419267e == null || !oVar2.f419265c.get(kVar.f419254b, false);
    }
}
