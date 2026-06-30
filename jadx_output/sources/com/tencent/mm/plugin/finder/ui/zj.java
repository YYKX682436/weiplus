package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class zj implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f130109a;

    public zj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f130109a = finderShareFeedRelUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f130109a;
        androidx.appcompat.app.AppCompatActivity context = finderShareFeedRelUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(context).c(zy2.ra.class))).V6();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderShareFeedRelUI.f128778k2;
        if (baseFinderFeed == null) {
            baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(finderShareFeedRelUI.E7().getDataListJustForAdapter());
        }
        long id6 = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? finderShareFeedRelUI.f128784p0 : feedObject.getId();
        androidx.appcompat.app.AppCompatActivity context2 = finderShareFeedRelUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
        return kz5.c1.k(new jz5.l("extra_info", V6.getString(11)), new jz5.l("enter_source_info", V6.getString(12)), new jz5.l("source_feedid", pm0.v.u(id6)), new jz5.l("source_feed_commentScene", java.lang.Integer.valueOf(integer)), new jz5.l("source_feed_sessionbuffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(id6, baseFinderFeed != null ? baseFinderFeed.w() : null, integer)));
    }
}
