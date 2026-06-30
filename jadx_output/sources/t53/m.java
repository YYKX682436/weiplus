package t53;

/* loaded from: classes7.dex */
public final class m implements u53.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f415792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f415793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f415794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f415795d;

    public m(java.util.concurrent.atomic.AtomicInteger atomicInteger, yz5.l lVar, java.util.LinkedList linkedList, java.lang.Runnable runnable) {
        this.f415792a = atomicInteger;
        this.f415793b = lVar;
        this.f415794c = linkedList;
        this.f415795d = runnable;
    }

    @Override // u53.d0
    public final void a(java.lang.String str) {
        if (!(str == null || str.length() == 0)) {
            this.f415794c.add(str);
            this.f415795d.run();
        } else if (this.f415792a.getAndSet(-1) >= 0) {
            com.tencent.mars.xlog.Log.e("GameLife.PluginGameLife", "checkSessionIdAndContact get session failed");
            this.f415793b.invoke(null);
        }
    }
}
