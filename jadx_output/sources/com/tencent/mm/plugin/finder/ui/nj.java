package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class nj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f129559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, so2.j5 j5Var) {
        super(0);
        this.f129558d = finderShareFeedRelUI;
        this.f129559e = j5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129558d;
        com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
        if (w8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        java.lang.String str = finderShareFeedRelUI.R1;
        if (str == null) {
            ya2.b2 contact = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f129559e).getContact();
            str = contact != null ? contact.D0() : null;
            if (str == null) {
                str = "";
            }
        }
        w8Var.y(true, false, str, null);
        return jz5.f0.f302826a;
    }
}
