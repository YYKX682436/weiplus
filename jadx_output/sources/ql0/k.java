package ql0;

/* loaded from: classes13.dex */
public final class k implements at.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at.e f364489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f364490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f364491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql0.l f364492d;

    public k(at.e eVar, boolean z17, java.lang.Float f17, ql0.l lVar) {
        this.f364489a = eVar;
        this.f364490b = z17;
        this.f364491c = f17;
        this.f364492d = lVar;
    }

    @Override // at.e
    public void a(java.lang.String reddotId, int i17, float f17) {
        kotlin.jvm.internal.o.g(reddotId, "reddotId");
        boolean z17 = this.f364490b;
        ql0.l lVar = this.f364492d;
        at.e eVar = this.f364489a;
        if (!z17) {
            eVar.a(reddotId, 2, f17);
            com.tencent.mars.xlog.Log.i(lVar.f364493d, "cell START_DOWNGRADE_PRELOAD");
            return;
        }
        java.lang.Float f18 = this.f364491c;
        float floatValue = f18 != null ? f18.floatValue() : 0.0f;
        if (floatValue < 0.001d) {
            eVar.a(reddotId, i17, f17);
            com.tencent.mars.xlog.Log.i(lVar.f364493d, "cell threshold invalid " + floatValue);
            return;
        }
        eVar.a(reddotId, f17 > floatValue ? 1 : 0, f17);
        com.tencent.mars.xlog.Log.i(lVar.f364493d, "cell threshold:" + floatValue + " score:" + f17);
    }

    @Override // at.e
    public void start(java.lang.String reddotId) {
        kotlin.jvm.internal.o.g(reddotId, "reddotId");
        this.f364489a.start(reddotId);
    }
}
