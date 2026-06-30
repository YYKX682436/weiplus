package d9;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.io.IOException f227380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d9.t f227381e;

    public o(d9.t tVar, java.io.IOException iOException) {
        this.f227381e = tVar;
        this.f227380d = iOException;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f227381e.f227402h.onLoadError(this.f227380d);
    }
}
