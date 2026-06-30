package uo;

/* loaded from: classes12.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uo.a f429519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f429520e;

    public l(uo.a aVar, yz5.p pVar) {
        this.f429519d = aVar;
        this.f429520e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uo.a aVar = this.f429519d;
        if (((java.lang.Boolean) aVar.f429500b.invoke()).booleanValue()) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(aVar.f429502d);
        yz5.p pVar = this.f429520e;
        pVar.invoke(valueOf, new uo.k(aVar, pVar));
    }
}
