package k3;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3.a f303811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f303812e;

    public r(k3.s sVar, m3.a aVar, java.lang.Object obj) {
        this.f303811d = aVar;
        this.f303812e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f303811d.accept(this.f303812e);
    }
}
