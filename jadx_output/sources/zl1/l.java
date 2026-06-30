package zl1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f473597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl1.t f473598e;

    public l(zl1.t tVar, boolean z17) {
        this.f473598e = tVar;
        this.f473597d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f473598e.d(this.f473597d);
    }
}
