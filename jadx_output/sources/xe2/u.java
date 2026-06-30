package xe2;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f453907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug2.a f453908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f453909f;

    public u(yg2.b bVar, ug2.a aVar, xe2.b0 b0Var) {
        this.f453907d = bVar;
        this.f453908e = aVar;
        this.f453909f = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.l.f(null, new xe2.t(this.f453907d, this.f453908e, this.f453909f, null), 1, null);
    }
}
