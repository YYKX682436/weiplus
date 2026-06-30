package f65;

/* loaded from: classes12.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f259875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f259876f;

    public d0(java.lang.String str, int i17, int i18) {
        this.f259874d = str;
        this.f259875e = i17;
        this.f259876f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0.c(f65.y0.f260019a, this.f259874d, new f65.c0(this.f259875e, this.f259876f));
    }
}
