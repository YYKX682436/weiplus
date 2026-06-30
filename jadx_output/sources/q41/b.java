package q41;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f360031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f360032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f360033g;

    public b(java.lang.String str, int i17, int i18, long j17) {
        this.f360030d = str;
        this.f360031e = i17;
        this.f360032f = i18;
        this.f360033g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm.u8 Di = ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(this.f360030d);
        if (Di == null) {
            return;
        }
        q41.f.b((k41.g0) Di, this.f360031e, this.f360032f, this.f360033g);
    }
}
