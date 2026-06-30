package so2;

/* loaded from: classes2.dex */
public final class h4 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yw2 f410400d;

    /* renamed from: e, reason: collision with root package name */
    public int f410401e;

    public h4(r45.yw2 divider) {
        kotlin.jvm.internal.o.g(divider, "divider");
        this.f410400d = divider;
        this.f410401e = -1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410400d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f410400d.getInteger(2);
    }
}
