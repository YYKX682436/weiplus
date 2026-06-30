package zv;

/* loaded from: classes11.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f475921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475922e;

    public c0(long j17, java.lang.String str) {
        this.f475921d = j17;
        this.f475922e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f475921d != zv.e0.f475940d) {
            return;
        }
        zv.e0.f475941e = true;
        zv.e0.f475937a.b(this.f475922e);
    }
}
