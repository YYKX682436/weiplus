package d9;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d9.t f227379d;

    public n(d9.t tVar) {
        this.f227379d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.t tVar = this.f227379d;
        if (tVar.P) {
            return;
        }
        tVar.f227413v.b(tVar);
    }
}
