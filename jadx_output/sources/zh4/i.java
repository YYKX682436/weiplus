package zh4;

/* loaded from: classes11.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh4.k f472974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zh4.k kVar) {
        super(0);
        this.f472974d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAccountInitialized: start pendingDBTask size=");
        zh4.k kVar = this.f472974d;
        sb6.append(kVar.f472977e.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PluginTextStatus", sb6.toString());
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = kVar.f472977e;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
        copyOnWriteArrayList.clear();
        return jz5.f0.f302826a;
    }
}
