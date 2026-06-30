package k3;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k3.o f303775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303776e;

    public b(k3.c cVar, k3.o oVar, int i17) {
        this.f303775d = oVar;
        this.f303776e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        d3.p pVar = ((e3.g) this.f303775d).f247050a;
        if (pVar != null) {
            pVar.c(this.f303776e);
        }
    }
}
