package nl4;

/* loaded from: classes11.dex */
public final class e implements pk4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338205a;

    public e(nl4.r rVar) {
        this.f338205a = rVar;
    }

    @Override // pk4.v
    public void a(dk4.a aVar, long j17) {
        ll4.a aVar2;
        nl4.r rVar = this.f338205a;
        if (aVar != null) {
            rVar.f338232b = aVar.f234470g;
        }
        rVar.f338233c = j17;
        if (rVar.f338235e || (aVar2 = rVar.f338231a) == null) {
            return;
        }
        long j18 = rVar.f338232b;
        kl4.n nVar = (kl4.n) aVar2;
        ((ku5.t0) ku5.t0.f312615d).B(new kl4.m(nVar.f308956a.f308868e, nVar.f308956a, j17, j18));
    }
}
