package mx0;

/* loaded from: classes5.dex */
public final class ga implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.ja f332014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f332016f;

    public ga(mx0.ja jaVar, int i17, boolean z17) {
        this.f332014d = jaVar;
        this.f332015e = i17;
        this.f332016f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx0.ja jaVar = this.f332014d;
        jaVar.f332075d.smoothScrollBy(1, 0);
        dy0.o.a(jaVar.f332075d, this.f332015e, this.f332016f);
    }
}
