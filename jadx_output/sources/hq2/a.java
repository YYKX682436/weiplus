package hq2;

/* loaded from: classes2.dex */
public final class a implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.dd2 f283205d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fa2 f283206e;

    public a(r45.dd2 tabInfo, r45.fa2 container) {
        kotlin.jvm.internal.o.g(tabInfo, "tabInfo");
        kotlin.jvm.internal.o.g(container, "container");
        this.f283205d = tabInfo;
        this.f283206e = container;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
