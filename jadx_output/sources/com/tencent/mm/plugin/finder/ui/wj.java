package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class wj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(0);
        this.f129993d = finderShareFeedRelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ya2.b2 contact;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129993d;
        com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
        if (w8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        java.lang.String str = finderShareFeedRelUI.R1;
        if (str == null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderShareFeedRelUI.Y;
            str = (baseFinderFeed == null || (contact = baseFinderFeed.getContact()) == null) ? null : contact.D0();
            if (str == null) {
                str = "";
            }
        }
        w8Var.y(true, false, str, null);
        return jz5.f0.f302826a;
    }
}
