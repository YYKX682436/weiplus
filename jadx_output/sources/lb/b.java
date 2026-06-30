package lb;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lb.c f317650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lb.e f317652f;

    public b(lb.e eVar, lb.c cVar, java.lang.String str) {
        this.f317652f = eVar;
        this.f317650d = cVar;
        this.f317651e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        lb.e eVar;
        synchronized (this.f317652f.f317654a) {
            lb.e eVar2 = this.f317652f;
            eVar2.f317657d = this.f317650d;
            lb.e.a(eVar2);
            lb.i iVar = this.f317652f.f317656c;
            if (iVar != null) {
                try {
                    try {
                        boolean d17 = ((lb.g) iVar).d(this.f317651e);
                        "supportCapacity result is ".concat(java.lang.String.valueOf(d17));
                        lb.c cVar = this.f317650d;
                        if (cVar != null) {
                            ((com.unionpay.i) cVar).a(d17 ? 1 : 0, new android.os.Bundle());
                        }
                        eVar = this.f317652f;
                    } catch (java.lang.Exception unused) {
                        ((com.unionpay.i) this.f317650d).a(0, new android.os.Bundle());
                        eVar = this.f317652f;
                    }
                    eVar.b();
                } catch (java.lang.Throwable th6) {
                    this.f317652f.b();
                    throw th6;
                }
            }
        }
    }
}
