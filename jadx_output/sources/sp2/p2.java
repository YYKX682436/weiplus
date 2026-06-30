package sp2;

/* loaded from: classes3.dex */
public final class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f411180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f411181e;

    public p2(yz5.a aVar, sp2.d3 d3Var) {
        this.f411180d = aVar;
        this.f411181e = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a aVar = this.f411180d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f411181e.f411014h = null;
    }
}
