package so2;

/* loaded from: classes2.dex */
public final class v extends in5.w implements com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.xn5 f410643d;

    public v(r45.xn5 tags) {
        kotlin.jvm.internal.o.g(tags, "tags");
        this.f410643d = tags;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 2147483646;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return -6;
    }
}
