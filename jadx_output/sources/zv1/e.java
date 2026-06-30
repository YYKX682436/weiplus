package zv1;

/* loaded from: classes10.dex */
public final class e implements zv1.d {
    @Override // zv1.d
    public com.tencent.mm.plugin.clean.cache.CacheClassifyType a() {
        return com.tencent.mm.plugin.clean.cache.CacheClassifyType.APPBRAND_FUSE;
    }

    @Override // zv1.d
    public long c(long j17, com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z17) {
        if (z17) {
            return j17;
        }
        return 0L;
    }
}
