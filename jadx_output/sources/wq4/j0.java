package wq4;

/* loaded from: classes14.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f448642d;

    /* renamed from: e, reason: collision with root package name */
    public final long f448643e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f448644f;

    /* renamed from: g, reason: collision with root package name */
    public final int f448645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f448646h;

    public j0(wq4.k0 k0Var, java.lang.String str, long j17, boolean z17, int i17) {
        this.f448646h = k0Var;
        this.f448642d = str;
        this.f448643e = j17;
        this.f448644f = z17;
        this.f448645g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f448646h.d(this.f448642d, this.f448643e, this.f448644f, this.f448645g);
    }
}
