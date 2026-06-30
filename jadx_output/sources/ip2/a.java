package ip2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ip2.a f293612a = new ip2.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f293613b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f293614c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f293615d = "";

    /* renamed from: e, reason: collision with root package name */
    public static boolean f293616e = true;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f293617f = "";

    /* renamed from: g, reason: collision with root package name */
    public static int f293618g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f293619h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f293620i;

    public final void a(java.lang.String contextId, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment fragment, java.lang.String clickTabContextId, java.lang.String byPass) {
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        kotlin.jvm.internal.o.g(byPass, "byPass");
        com.tencent.mars.xlog.Log.i("FinderLiveSquareTabLifeCycleReport", "enterLiveSquare contextId:" + contextId + " clickTabContextId:" + clickTabContextId + " byPass:" + byPass);
        f293613b = contextId;
        fragment.getF121516t();
        f293614c = clickTabContextId;
        f293617f = byPass;
        if (fragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) {
            ae2.in inVar = ae2.in.f3688a;
            f293618g = ((java.lang.Number) ae2.in.U3.r()).intValue();
        }
    }

    public final void b(com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment) {
        java.lang.String str;
        r45.dd2 dd2Var;
        if (f293620i) {
            com.tencent.mars.xlog.Log.w("FinderLiveSquareTabLifeCycleReport", "liveTabPageIn return for isInOnPauseState");
            return;
        }
        if ((absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) || (absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment)) {
            java.lang.String f121516t = absNearByFragment.getF121516t();
            java.lang.String t07 = absNearByFragment.t0();
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) absNearByFragment : null;
            if (nearbyLiveSquareTabFragment == null || (dd2Var = nearbyLiveSquareTabFragment.f121520t) == null || (str = java.lang.Integer.valueOf(dd2Var.getInteger(0)).toString()) == null) {
                str = "";
            }
            int b17 = absNearByFragment.getB();
            java.lang.String str2 = "page_tab_" + f121516t + '_' + t07;
            java.lang.String s07 = absNearByFragment.s0();
            if (!(str.length() == 0)) {
                str2 = str2 + '_' + str;
            }
            if (android.text.TextUtils.isEmpty(f293615d)) {
                if (b17 / 100000 == 80 || b17 == 80) {
                    f293615d = "page_live_flow";
                }
            }
            java.lang.String valueOf = java.lang.String.valueOf(absNearByFragment.hashCode());
            java.lang.String valueOf2 = java.lang.String.valueOf(b17);
            java.lang.String str3 = f293615d;
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct finderBroadcastPageInStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct();
            finderBroadcastPageInStruct.f56553d = c01.id.c();
            finderBroadcastPageInStruct.r(str2);
            finderBroadcastPageInStruct.f56555f = finderBroadcastPageInStruct.b("tab_id", f121516t, true);
            finderBroadcastPageInStruct.f56556g = finderBroadcastPageInStruct.b("sub_tab_id", t07, true);
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            finderBroadcastPageInStruct.f56557h = finderBroadcastPageInStruct.b("sessionid", Ri != null ? Ri : "", true);
            finderBroadcastPageInStruct.q(f293613b);
            finderBroadcastPageInStruct.f56559j = finderBroadcastPageInStruct.b("TabContextID", f293614c, true);
            finderBroadcastPageInStruct.f56560k = finderBroadcastPageInStruct.b("SubTabContextID", s07, true);
            finderBroadcastPageInStruct.f56562m = finderBroadcastPageInStruct.b("ref_page_id", str3, true);
            finderBroadcastPageInStruct.p(valueOf2);
            cl0.g gVar = new cl0.g();
            int i17 = f293618g;
            if (i17 != -1) {
                gVar.s("is_new_square", java.lang.Integer.valueOf(i17));
                gVar.s("enter_type", java.lang.Integer.valueOf(f293619h));
            }
            d(gVar);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            finderBroadcastPageInStruct.s(r26.i0.t(gVar2, ",", ";", false));
            finderBroadcastPageInStruct.f56564o = finderBroadcastPageInStruct.b("switch_extra", ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck(), true);
            ml2.b1.f327211a.b(new ml2.a1(valueOf, finderBroadcastPageInStruct));
            f293615d = str2;
            f293616e = false;
        }
    }

    public final void c(com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment) {
        r45.dd2 dd2Var;
        if (f293616e) {
            com.tencent.mars.xlog.Log.w("FinderLiveSquareTabLifeCycleReport", "liveTabPageOut return for isNeverPageIn");
            return;
        }
        if ((absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) || (absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment)) {
            java.lang.String f121516t = absNearByFragment.getF121516t();
            java.lang.String t07 = absNearByFragment.t0();
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) absNearByFragment : null;
            if (nearbyLiveSquareTabFragment != null && (dd2Var = nearbyLiveSquareTabFragment.f121520t) != null) {
                java.lang.Integer.valueOf(dd2Var.getInteger(0)).toString();
            }
            absNearByFragment.getB();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("page_tab_");
            sb6.append(f121516t);
            sb6.append('_');
            sb6.append(t07);
            absNearByFragment.s0();
            absNearByFragment.f121462r = "";
            ml2.b1.a(ml2.b1.f327211a, java.lang.String.valueOf(absNearByFragment.hashCode()), null, 2, null);
        }
    }

    public final void d(cl0.g jsonObject) {
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        if (android.text.TextUtils.isEmpty(f293617f)) {
            com.tencent.mars.xlog.Log.i("FinderLiveSquareTabLifeCycleReport", "parseByPassToJson byPass is empty.");
            return;
        }
        try {
            cl0.g gVar = new cl0.g(f293617f);
            java.lang.String optString = gVar.optString("appId");
            java.lang.String optString2 = gVar.optString("versionType");
            if (!android.text.TextUtils.isEmpty(optString)) {
                jsonObject.h("appid", optString);
            }
            if (android.text.TextUtils.isEmpty(optString2)) {
                return;
            }
            jsonObject.h("versiontype", optString2);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.i("FinderLiveSquareTabLifeCycleReport", "parseByPassToJson error.");
        }
    }
}
