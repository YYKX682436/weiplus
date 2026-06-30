package nn0;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f338589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn0.m f338590e;

    public k(nn0.m mVar, int i17) {
        this.f338590e = mVar;
        this.f338589d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f338590e.e(this.f338589d);
    }
}
