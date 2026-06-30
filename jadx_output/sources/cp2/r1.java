package cp2;

/* loaded from: classes2.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.u1 f220902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f220903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f220904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f220905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f220906h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220907i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220908m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f220909n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(cp2.u1 u1Var, int i17, so2.j5 j5Var, java.util.ArrayList arrayList, android.view.View view, java.lang.String str, java.lang.String str2, long j17) {
        super(2);
        this.f220902d = u1Var;
        this.f220903e = i17;
        this.f220904f = j5Var;
        this.f220905g = arrayList;
        this.f220906h = view;
        this.f220907i = str;
        this.f220908m = str2;
        this.f220909n = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        int i17;
        java.lang.Integer num;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject3;
        r45.dm2 object_extend;
        r45.pm2 pm2Var;
        r45.wm2 wm2Var;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject4;
        r45.nw1 liveInfo;
        r45.dd2 dd2Var;
        r45.dd2 dd2Var2;
        java.lang.String str7;
        java.util.ArrayList arrayList;
        zl2.l lVar;
        long j17;
        int i18;
        java.lang.String str8;
        java.lang.Object obj3;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject5;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject6;
        r45.dm2 object_extend2;
        r45.pm2 pm2Var2;
        r45.wm2 wm2Var2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject7;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject8;
        r45.dd2 dd2Var3;
        r45.dd2 dd2Var4;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject9;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject10;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.uo1 liveDesc;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject11;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject12;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject13;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = intent;
        cp2.u1 u1Var = this.f220902d;
        u1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveRoom pos: ");
        int i19 = this.f220903e;
        sb6.append(i19);
        sb6.append(" launchWithAnim: ");
        sb6.append(booleanValue);
        com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", sb6.toString());
        so2.j5 feed = this.f220904f;
        if (feed instanceof com.tencent.mm.plugin.finder.feed.e30) {
            r45.uc1 uc1Var = new r45.uc1();
            com.tencent.mm.plugin.finder.feed.e30 e30Var = (com.tencent.mm.plugin.finder.feed.e30) feed;
            uc1Var.set(0, new java.util.LinkedList(e30Var.f106622o));
            r45.c72 c72Var = e30Var.f106623p;
            uc1Var.set(1, c72Var != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) c72Var.getCustom(0) : null);
            intent2.putExtra("FINDER_JUMP_INFO_WITH_OUTSIDE", uc1Var.toByteArray());
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3 t3Var = vd2.t3.f435921a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.B1).getValue()).r()).intValue() == 1;
        zl2.l lVar2 = zl2.l.f473865a;
        java.lang.String str12 = this.f220907i;
        java.lang.String str13 = this.f220908m;
        long j18 = this.f220909n;
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment2 = u1Var.f220921b;
        if (z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(feed);
            intent2.putExtra("key_chnl_extra", u1Var.a(i19, this.f220906h, "onItemClick"));
            if (absNearByFragment2 == null || (str7 = absNearByFragment2.s0()) == null) {
                str7 = "";
            }
            intent2.putExtra("key_click_sub_tab_context_id", str7);
            boolean z18 = feed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            long j19 = 0;
            if (baseFinderFeed == null || (feedObject13 = baseFinderFeed.getFeedObject()) == null) {
                arrayList = arrayList2;
                lVar = lVar2;
                j17 = 0;
            } else {
                arrayList = arrayList2;
                lVar = lVar2;
                j17 = feedObject13.getId();
            }
            intent2.putExtra("CURRENT_FEED_ID", j17);
            intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
            int i27 = qs5.z.f366478a;
            intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 1);
            r45.k42 k42Var = new r45.k42();
            r45.j42 j42Var = new r45.j42();
            r45.kc1 kc1Var = new r45.kc1();
            com.tencent.mm.ui.MMActivity activity = u1Var.f220920a;
            kotlin.jvm.internal.o.g(activity, "activity");
            zy2.b8 b8Var = (zy2.b8) pf5.z.f353948a.a(activity).c(zy2.b8.class);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            if (baseFinderFeed2 != null && (feedObject12 = baseFinderFeed2.getFeedObject()) != null) {
                j19 = feedObject12.getId();
            }
            i17 = i19;
            r45.kc1 P6 = ((com.tencent.mm.plugin.finder.feed.fg) b8Var).P6(j19);
            if (P6 != null) {
                i18 = 0;
                str8 = P6.getString(0);
            } else {
                i18 = 0;
                str8 = null;
            }
            kc1Var.set(i18, str8);
            j42Var.set(i18, kc1Var);
            k42Var.set(i18, j42Var);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            k42Var.set(1, (baseFinderFeed3 == null || (feedObject11 = baseFinderFeed3.getFeedObject()) == null) ? null : feedObject11.getDescription());
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            if (baseFinderFeed4 == null || (feedObject10 = baseFinderFeed4.getFeedObject()) == null || (finderObject = feedObject10.getFinderObject()) == null || (objectDesc = finderObject.getObjectDesc()) == null || (liveDesc = objectDesc.getLiveDesc()) == null || (obj3 = liveDesc.getString(1)) == null) {
                obj3 = "";
            }
            k42Var.set(3, obj3);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed5 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            k42Var.set(2, (baseFinderFeed5 == null || (feedObject9 = baseFinderFeed5.getFeedObject()) == null) ? null : feedObject9.getLocation());
            intent2.putExtra("PRE_JOIN_LIVE_INFO", k42Var.toByteArray());
            intent2.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            android.os.Bundle bundle = new android.os.Bundle();
            boolean z19 = absNearByFragment2 instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = z19 ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) absNearByFragment2 : null;
            if (nearbyLiveSquareTabFragment == null || (dd2Var4 = nearbyLiveSquareTabFragment.f121519s) == null || (str9 = java.lang.Integer.valueOf(dd2Var4.getInteger(0)).toString()) == null) {
                str9 = "";
            }
            bundle.putString("tab_id", str9);
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment2 = z19 ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) absNearByFragment2 : null;
            if (nearbyLiveSquareTabFragment2 == null || (dd2Var3 = nearbyLiveSquareTabFragment2.f121520t) == null || (str10 = java.lang.Integer.valueOf(dd2Var3.getInteger(0)).toString()) == null) {
                str10 = "";
            }
            bundle.putString("sub_tab_id", str10);
            bundle.putString("card_index", java.lang.String.valueOf(i17));
            intent2.putExtra("KEY_PARAMS_ENTRANCE_REPORT_INFO", bundle);
            jz5.l d17 = lVar.d(arrayList, feed, false);
            java.util.List list = (java.util.List) d17.f302833d;
            int intValue = ((java.lang.Number) d17.f302834e).intValue();
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, str12);
            wk0Var.set(1, str13);
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            r45.ta4 ta4Var = new r45.ta4();
            ta4Var.set(8, java.lang.Boolean.TRUE);
            wk0Var.set(7, ta4Var);
            num = 1;
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            y74Var.set(1, java.lang.Integer.valueOf(u1Var.b().getInteger(5)));
            boolean z27 = feed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed6 = z27 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            if (baseFinderFeed6 == null || (feedObject8 = baseFinderFeed6.getFeedObject()) == null || (str11 = feedObject8.getNickName()) == null) {
                str11 = "";
            }
            y74Var.set(2, str11);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed7 = z27 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            y74Var.set(5, (baseFinderFeed7 == null || (feedObject7 = baseFinderFeed7.getFeedObject()) == null) ? null : feedObject7.getFeedObject());
            wk0Var.set(6, y74Var);
            r45.ta4 ta4Var2 = new r45.ta4();
            java.util.LinkedList list2 = ta4Var2.getList(20);
            r45.qa4 qa4Var = new r45.qa4();
            str2 = "card_index";
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(j18));
            list2.add(qa4Var);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed8 = z27 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            if (baseFinderFeed8 != null && (feedObject5 = baseFinderFeed8.getFeedObject()) != null && (feedObject6 = feedObject5.getFeedObject()) != null && (object_extend2 = feedObject6.getObject_extend()) != null && (pm2Var2 = (r45.pm2) object_extend2.getCustom(12)) != null && (wm2Var2 = (r45.wm2) pm2Var2.getCustom(10)) != null) {
                ta4Var2.set(30, new com.tencent.mm.protobuf.g(wm2Var2.toByteArray()));
            }
            wk0Var.set(7, ta4Var2);
            str = "";
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(u1Var.f220920a, intent2, list, intValue, wk0Var, null);
            absNearByFragment = absNearByFragment2;
        } else {
            str = "";
            i17 = i19;
            num = 1;
            str2 = "card_index";
            jz5.l d18 = lVar2.d(this.f220905g, feed, false);
            java.util.List list3 = (java.util.List) d18.f302833d;
            int intValue2 = ((java.lang.Number) d18.f302834e).intValue();
            r45.wk0 wk0Var2 = new r45.wk0();
            wk0Var2.set(0, str12);
            wk0Var2.set(1, str13);
            wk0Var2.set(2, java.lang.Boolean.FALSE);
            wk0Var2.set(3, 1001);
            wk0Var2.set(4, -1);
            wk0Var2.set(5, -1);
            r45.ta4 ta4Var3 = new r45.ta4();
            ta4Var3.set(8, java.lang.Boolean.TRUE);
            java.util.LinkedList list4 = ta4Var3.getList(20);
            r45.qa4 qa4Var2 = new r45.qa4();
            qa4Var2.set(0, "UserClick");
            qa4Var2.set(1, java.lang.Long.valueOf(j18));
            list4.add(qa4Var2);
            boolean z28 = feed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed9 = z28 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            if (baseFinderFeed9 != null && (feedObject2 = baseFinderFeed9.getFeedObject()) != null && (feedObject3 = feedObject2.getFeedObject()) != null && (object_extend = feedObject3.getObject_extend()) != null && (pm2Var = (r45.pm2) object_extend.getCustom(12)) != null && (wm2Var = (r45.wm2) pm2Var.getCustom(10)) != null) {
                ta4Var3.set(30, new com.tencent.mm.protobuf.g(wm2Var.toByteArray()));
            }
            wk0Var2.set(7, ta4Var3);
            r45.y74 y74Var2 = new r45.y74();
            y74Var2.set(1, java.lang.Integer.valueOf(u1Var.b().getInteger(5)));
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed10 = z28 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed : null;
            if (baseFinderFeed10 == null || (feedObject = baseFinderFeed10.getFeedObject()) == null || (str3 = feedObject.getNickName()) == null) {
                str3 = str;
            }
            y74Var2.set(2, str3);
            wk0Var2.set(6, y74Var2);
            absNearByFragment = absNearByFragment2;
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(u1Var.f220920a, intent2, list3, intValue2, wk0Var2, null);
        }
        kotlin.jvm.internal.o.g(feed, "feed");
        cl0.g gVar = new cl0.g();
        boolean z29 = absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment3 = z29 ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) absNearByFragment : null;
        if (nearbyLiveSquareTabFragment3 == null || (dd2Var2 = nearbyLiveSquareTabFragment3.f121519s) == null || (str4 = java.lang.Integer.valueOf(dd2Var2.getInteger(0)).toString()) == null) {
            str4 = str;
        }
        gVar.s("tab_id", str4);
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment4 = z29 ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) absNearByFragment : null;
        if (nearbyLiveSquareTabFragment4 == null || (dd2Var = nearbyLiveSquareTabFragment4.f121520t) == null || (str5 = java.lang.Integer.valueOf(dd2Var.getInteger(0)).toString()) == null) {
            str5 = str;
        }
        gVar.s("sub_tab_id", str5);
        gVar.s("card_type", num);
        gVar.s(str2, java.lang.Integer.valueOf(i17));
        so2.h1 h1Var = feed instanceof so2.h1 ? (so2.h1) feed : null;
        if (h1Var == null || (feedObject4 = h1Var.getFeedObject()) == null || (liveInfo = feedObject4.getLiveInfo()) == null || (str6 = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str6 = str;
        }
        gVar.s("liveid", str6);
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
        boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
        finderBroadcastEidClickStruct.u(str);
        finderBroadcastEidClickStruct.p(str);
        finderBroadcastEidClickStruct.B(str);
        finderBroadcastEidClickStruct.y(str);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = str;
        }
        finderBroadcastEidClickStruct.w(Ri);
        java.lang.String string = u1Var.b().getString(1);
        if (string == null) {
            string = str;
        }
        finderBroadcastEidClickStruct.r(string);
        finderBroadcastEidClickStruct.q(u1Var.c());
        finderBroadcastEidClickStruct.A(str);
        finderBroadcastEidClickStruct.x(str);
        finderBroadcastEidClickStruct.v(str);
        finderBroadcastEidClickStruct.s("more_page_card");
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderBroadcastEidClickStruct.t(r26.i0.t(gVar2, ",", ";", false));
        finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        finderBroadcastEidClickStruct.k();
        ig2.o.f291411a.a("startActivity");
        return jz5.f0.f302826a;
    }
}
