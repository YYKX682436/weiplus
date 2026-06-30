package ko3;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f309962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean[] f309963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ko3.u f309964f;

    public h(ko3.u uVar, java.lang.Throwable th6, boolean[] zArr) {
        this.f309964f = uVar;
        this.f309962d = th6;
        this.f309963e = zArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f309964f.f(this.f309962d);
        synchronized (this.f309963e) {
            boolean[] zArr = this.f309963e;
            zArr[0] = true;
            zArr.notifyAll();
        }
    }
}
