package vp2;

/* loaded from: classes2.dex */
public final class p extends com.tencent.mm.plugin.finder.model.BaseFinderFeed {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f438949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.storage.FinderItem feedObject, r45.fa2 container) {
        super(feedObject);
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438949d = container;
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.c
    public int h() {
        return 9;
    }
}
