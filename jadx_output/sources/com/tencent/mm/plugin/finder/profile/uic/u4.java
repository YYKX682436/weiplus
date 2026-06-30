package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f124254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader f124255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader) {
        super(1);
        this.f124254d = recyclerView;
        this.f124255e = finderProfileFeedLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent data = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(data, "data");
        hc2.f1.w(this.f124254d, data, this.f124255e, false, null, 12, null);
        return jz5.f0.f302826a;
    }
}
