package cw2;

/* loaded from: classes2.dex */
public final class s1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223987a;

    public s1(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f223987a = finderFullSeekBarLayout;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f223987a;
        android.content.Context context = finderFullSeekBarLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[0] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.V6().getInteger(5)) : null);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderFullSeekBarLayout.H;
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u((baseFinderFeed == null || (feedObject3 = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject3.getId()));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = finderFullSeekBarLayout.H;
        lVarArr[2] = new jz5.l("session_buffer", (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? null : feedObject2.getSessionBuffer());
        android.content.Context context2 = finderFullSeekBarLayout.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[3] = new jz5.l("finder_tab_context_id", nyVar2 != null ? nyVar2.V6().getString(2) : null);
        return kz5.c1.k(lVarArr);
    }
}
