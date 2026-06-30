package wd1;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd1.k f444803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, wd1.k kVar) {
        super(0);
        this.f444802d = str;
        this.f444803e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wl1.h hVar;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f444802d) && (hVar = this.f444803e.f444824f) != null) {
            java.lang.String script = this.f444802d;
            kotlin.jvm.internal.o.g(script, "script");
            wl1.d dVar = new wl1.d(hVar, script);
            if (hVar.f447041a.get()) {
                dVar.invoke();
            } else {
                synchronized (hVar) {
                    hVar.f447042b.add(new wl1.b(dVar));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
