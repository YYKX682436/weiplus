package y00;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y00.s f458493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f458494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y00.s sVar, kotlinx.coroutines.q qVar) {
        super(1);
        this.f458493d = sVar;
        this.f458494e = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = y00.f.f458523a;
        y00.s sVar = this.f458493d;
        kotlinx.coroutines.q qVar = this.f458494e;
        synchronized (concurrentHashMap) {
            java.util.List list = (java.util.List) concurrentHashMap.get(java.lang.Long.valueOf(sVar.f458546b));
            if (list != null) {
                list.remove(qVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
