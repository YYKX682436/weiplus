package xe2;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f453919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug2.g f453920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f453921f;

    public x(yg2.b bVar, ug2.g gVar, xe2.b0 b0Var) {
        this.f453919d = bVar;
        this.f453920e = gVar;
        this.f453921f = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.l.f(null, new xe2.w(this.f453919d, this.f453920e, this.f453921f, null), 1, null);
    }
}
