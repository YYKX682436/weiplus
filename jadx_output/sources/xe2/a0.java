package xe2;

/* loaded from: classes3.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f453832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug2.a f453833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f453834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f453835g;

    public a0(yg2.b bVar, ug2.a aVar, xe2.b0 b0Var, java.lang.Integer num) {
        this.f453832d = bVar;
        this.f453833e = aVar;
        this.f453834f = b0Var;
        this.f453835g = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.l.f(null, new xe2.z(this.f453832d, this.f453833e, this.f453834f, this.f453835g, null), 1, null);
    }
}
