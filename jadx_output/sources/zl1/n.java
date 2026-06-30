package zl1;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f473600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl1.t f473601e;

    public n(zl1.t tVar, boolean z17) {
        this.f473601e = tVar;
        this.f473600d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f473601e.i(this.f473600d);
    }
}
