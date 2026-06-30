package uw4;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf.a f431730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw4.n f431731e;

    public g(uw4.n nVar, pf.a aVar) {
        this.f431731e = nVar;
        this.f431730d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        uw4.n nVar = this.f431731e;
        nVar.getClass();
        nVar.setWebViewClientProxy(new uw4.k(nVar, this.f431730d));
    }
}
