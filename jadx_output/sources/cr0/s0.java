package cr0;

/* loaded from: classes12.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f221743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f221746g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f221747h;

    public s0(cr0.u0 u0Var, java.lang.String str, java.lang.String str2, long j17, long j18) {
        this.f221743d = u0Var;
        this.f221744e = str;
        this.f221745f = str2;
        this.f221746g = j17;
        this.f221747h = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f221743d.c().lock(new cr0.r0(this.f221743d, this.f221744e, this.f221745f, this.f221746g, this.f221747h));
    }
}
