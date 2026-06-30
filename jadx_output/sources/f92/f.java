package f92;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f92.i f260242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f260243e;

    public f(f92.i iVar, int i17) {
        this.f260242d = iVar;
        this.f260243e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f260242d.b("computeDelaySecond=" + this.f260243e);
    }
}
