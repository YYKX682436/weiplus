package zv1;

/* loaded from: classes10.dex */
public final class f implements zv1.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.clean.cache.CacheClassifyType f476298a;

    public f(com.tencent.mm.plugin.clean.cache.CacheClassifyType type) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f476298a = type;
    }

    @Override // zv1.d
    public com.tencent.mm.plugin.clean.cache.CacheClassifyType a() {
        return this.f476298a;
    }

    @Override // zv1.d
    public long c(long j17, com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z17) {
        if (z17) {
            return j17;
        }
        return 0L;
    }
}
