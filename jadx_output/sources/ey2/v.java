package ey2;

/* loaded from: classes2.dex */
public final class v implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.n1 f257551a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.qt2 f257552b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f257553c;

    public v(so2.n1 item, r45.qt2 contextObj, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f257551a = item;
        this.f257552b = contextObj;
        this.f257553c = finderTimelineFeedLoader;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return new ey2.u(this.f257551a, null, this.f257552b, this.f257553c, 2, null);
    }
}
