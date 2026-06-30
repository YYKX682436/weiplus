package zq2;

/* loaded from: classes2.dex */
public final class e implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.id2 f475032d;

    public e(r45.id2 themeTag, r45.fa2 container, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(themeTag, "themeTag");
        kotlin.jvm.internal.o.g(container, "container");
        this.f475032d = themeTag;
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
        return 12;
    }
}
