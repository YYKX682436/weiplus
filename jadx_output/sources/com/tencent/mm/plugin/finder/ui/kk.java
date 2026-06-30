package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class kk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f129444d = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ya2.b2 contact;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129444d;
        com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
        if (w8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderShareFeedRelUI.Y;
        w8Var.y(false, true, (baseFinderFeed == null || (contact = baseFinderFeed.getContact()) == null) ? "" : contact.D0(), null);
        return jz5.f0.f302826a;
    }
}
