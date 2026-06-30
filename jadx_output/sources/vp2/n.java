package vp2;

/* loaded from: classes2.dex */
public final class n extends com.tencent.mm.plugin.finder.model.BaseFinderFeed {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fa2 f438944d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f438945e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f438946f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.storage.FinderItem feedObject, r45.fa2 container) {
        super(feedObject);
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438944d = container;
    }

    public final void f2(boolean z17) {
        this.f438946f = z17;
    }

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.c
    public int h() {
        return 1;
    }
}
