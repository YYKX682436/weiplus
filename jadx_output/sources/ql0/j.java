package ql0;

/* loaded from: classes13.dex */
public final class j implements at.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ at.e f364484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f364485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f364486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql0.l f364487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pl0.e f364488e;

    public j(at.e eVar, boolean z17, java.lang.Float f17, ql0.l lVar, pl0.e eVar2) {
        this.f364484a = eVar;
        this.f364485b = z17;
        this.f364486c = f17;
        this.f364487d = lVar;
        this.f364488e = eVar2;
    }

    @Override // at.e
    public void a(java.lang.String reddotId, int i17, float f17) {
        kotlin.jvm.internal.o.g(reddotId, "reddotId");
        boolean z17 = this.f364485b;
        ql0.l lVar = this.f364487d;
        at.e eVar = this.f364484a;
        if (!z17) {
            eVar.a(reddotId, 2, f17);
            com.tencent.mars.xlog.Log.i(lVar.f364493d, "START_DOWNGRADE_PRELOAD");
            return;
        }
        java.lang.Float f18 = this.f364486c;
        float floatValue = f18 != null ? f18.floatValue() : 0.0f;
        if (floatValue < 0.001d) {
            eVar.a(reddotId, i17, f17);
            com.tencent.mars.xlog.Log.i(lVar.f364493d, "threshold invalid " + floatValue);
            return;
        }
        java.lang.String c17 = this.f364488e.c();
        kotlin.jvm.internal.o.f(c17, "getUid(...)");
        eVar.a(c17, f17 > floatValue ? 1 : 0, f17);
        com.tencent.mars.xlog.Log.i(lVar.f364493d, "threshold:" + floatValue + " score:" + f17);
    }

    @Override // at.e
    public void start(java.lang.String reddotId) {
        kotlin.jvm.internal.o.g(reddotId, "reddotId");
        this.f364484a.start(reddotId);
    }
}
