package so2;

/* loaded from: classes2.dex */
public final class z extends in5.w implements com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.uj0 f410729d;

    public z(com.tencent.mm.plugin.finder.storage.uj0 config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f410729d = config;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return Integer.MAX_VALUE;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return -8;
    }
}
