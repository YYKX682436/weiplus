package wn4;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f447532e;

    public c(long j17, long j18) {
        this.f447531d = j17;
        this.f447532e = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wn4.x xVar = wn4.x.f447571a;
        wn4.x.i(xVar.e(com.tencent.mm.R.string.l88), xVar.e(com.tencent.mm.R.string.k3q) + ((this.f447531d * 100) / this.f447532e) + '%', null);
    }
}
