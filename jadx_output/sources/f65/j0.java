package f65;

/* loaded from: classes12.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f259889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f259890f;

    public j0(java.lang.String str, int i17, boolean z17) {
        this.f259888d = str;
        this.f259889e = i17;
        this.f259890f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0.c(f65.y0.f260019a, this.f259888d, new f65.i0(this.f259889e, this.f259890f));
    }
}
