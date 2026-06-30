package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class u5 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f124257b;

    public u5(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC, so2.j5 j5Var) {
        this.f124256a = finderProfileFeedUIC;
        this.f124257b = j5Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124256a;
        android.app.Activity context = finderProfileFeedUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[0] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        android.app.Activity context2 = finderProfileFeedUIC.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[1] = new jz5.l("finder_context_id", java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p));
        android.app.Activity context3 = finderProfileFeedUIC.getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135387s);
        r45.nw1 liveInfo = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f124257b).getFeedObject().getLiveInfo();
        lVarArr[3] = new jz5.l("live_enter_status", liveInfo != null ? java.lang.Integer.valueOf(liveInfo.getInteger(2)) : null);
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
