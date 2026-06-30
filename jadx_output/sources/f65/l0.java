package f65;

/* loaded from: classes12.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f259895e;

    public l0(java.lang.String str, int i17) {
        this.f259894d = str;
        this.f259895e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0.c(f65.y0.f260019a, this.f259894d, new f65.k0(this.f259895e));
    }
}
