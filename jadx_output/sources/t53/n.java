package t53;

/* loaded from: classes8.dex */
public final class n implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f415808c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f415809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f415810e;

    public n(java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, java.util.concurrent.atomic.AtomicInteger atomicInteger, yz5.l lVar) {
        this.f415806a = str;
        this.f415807b = str2;
        this.f415808c = runnable;
        this.f415809d = atomicInteger;
        this.f415810e = lVar;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        u53.u uVar = (u53.u) map.get(this.f415806a);
        if (uVar != null && ((y53.m) uVar).B) {
            u53.u uVar2 = (u53.u) map.get(this.f415807b);
            if (uVar2 != null && ((y53.m) uVar2).B) {
                this.f415808c.run();
                return;
            }
        }
        if (this.f415809d.getAndSet(-1) >= 0) {
            com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "checkSessionIdAndContact get contact failed");
            this.f415810e.invoke(null);
        }
    }
}
