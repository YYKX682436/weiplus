package ft0;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft0.d f266455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f266456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f266457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ft0.d dVar, boolean z17, boolean z18) {
        super(0);
        this.f266455d = dVar;
        this.f266456e = z17;
        this.f266457f = z18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.Log.c(this.f266455d.f266461b, "release", new java.lang.Object[0]);
        ms0.c cVar = this.f266455d.f266462c;
        if (cVar != null) {
            ms0.c.o(cVar, false, 1, null);
        }
        ft0.d dVar = this.f266455d;
        dVar.f266463d = null;
        if (this.f266456e && this.f266457f) {
            synchronized (dVar.f266466g) {
                try {
                    dVar.f266466g.notifyAll();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(dVar.f266461b, e17, "notify release error", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
