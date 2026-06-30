package so2;

/* loaded from: classes2.dex */
public final class p implements gr.a0, so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.ra f410535d;

    public p(bw5.ra data, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f410535d = data;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.p.class.getName().hashCode();
    }
}
