package l45;

/* loaded from: classes10.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f316450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l45.l f316451e;

    public i(l45.l lVar, java.lang.Exception exc) {
        this.f316451e = lVar;
        this.f316450d = exc;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f316451e.f316455d.onError(this.f316450d);
    }
}
