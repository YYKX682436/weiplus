package w32;

/* loaded from: classes13.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w32.n f442686d;

    public l(w32.n nVar) {
        this.f442686d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w32.n nVar = this.f442686d;
        nVar.f442694f = true;
        nVar.getClass();
        ((w32.a) nVar.f442693e).c(-1L, -1, -2, "TimeOut", null);
    }

    public java.lang.String toString() {
        return super.toString() + "|mAsyncTimeOut";
    }
}
