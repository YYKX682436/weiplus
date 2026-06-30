package cp2;

/* loaded from: classes2.dex */
public final class g1 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f220809a;

    public g1(cp2.q1 q1Var) {
        this.f220809a = q1Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        cp2.q1 q1Var;
        java.util.Iterator it;
        int intValue;
        java.lang.String s07;
        r45.dd2 dd2Var;
        r45.s92 s92Var;
        java.lang.Object tag;
        java.lang.Object tag2;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        java.lang.String str = "NearbyLiveViewCallback";
        com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = recordsSet.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            q1Var = this.f220809a;
            if (!hasNext) {
                break;
            }
            in5.j jVar = (in5.j) it6.next();
            in5.c cVar = jVar.f293070a;
            if (cVar instanceof so2.h1) {
                r45.ni4 ni4Var = new r45.ni4();
                in5.c cVar2 = jVar.f293070a;
                kotlin.jvm.internal.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedLive");
                so2.h1 h1Var = (so2.h1) cVar2;
                ni4Var.set(0, java.lang.Long.valueOf(h1Var.getItemId()));
                so2.h3.f410392d.f(ni4Var, q1Var.f220884f.getCommentScene(), -1);
                ni4Var.set(5, java.lang.Integer.valueOf((int) jVar.f293073d));
                ni4Var.set(6, java.lang.Integer.valueOf(jVar.f293074e));
                ni4Var.set(4, h1Var.g0());
                android.view.View view = jVar.f293075f;
                if (view == null || (tag2 = view.getTag(com.tencent.mm.R.id.f486100k62)) == null) {
                    java.lang.Integer num = 0;
                    intValue = num.intValue();
                } else {
                    long longValue = tag2 instanceof java.lang.Long ? ((java.lang.Long) tag2).longValue() : 0L;
                    intValue = java.lang.Integer.valueOf(longValue != 0 ? (int) (android.os.SystemClock.elapsedRealtime() - longValue) : 0).intValue();
                }
                ni4Var.set(7, java.lang.Integer.valueOf(intValue));
                android.view.View view2 = jVar.f293075f;
                ni4Var.set(8, java.lang.Boolean.valueOf((view2 == null || (tag = view2.getTag(com.tencent.mm.R.id.k67)) == null) ? false : java.lang.Boolean.valueOf(((java.lang.Boolean) tag).booleanValue()).booleanValue()));
                ni4Var.set(9, java.lang.Long.valueOf(jVar.f293071b));
                ni4Var.set(13, java.lang.Long.valueOf(jVar.f293071b));
                ni4Var.set(12, java.lang.Integer.valueOf(ni4Var.getInteger(5)));
                cq2.r rVar = cq2.r.f221444a;
                com.tencent.mm.ui.MMActivity mMActivity = q1Var.f220882d;
                int i17 = jVar.f293074e;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar2;
                r45.fd1 fd1Var = cp2.b.f220775x;
                int integer = (fd1Var == null || (s92Var = (r45.s92) fd1Var.getCustom(11)) == null) ? 0 : s92Var.getInteger(0);
                int q17 = q1Var.q();
                com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = q1Var.f220883e;
                com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) absNearByFragment : null;
                org.json.JSONObject d17 = rVar.d(mMActivity, i17, baseFinderFeed, integer, q17, (nearbyLiveSquareTabFragment == null || (dd2Var = nearbyLiveSquareTabFragment.f121520t) == null) ? 0 : dd2Var.getInteger(0), q1Var.q() != 0, false);
                cp2.c cVar3 = q1Var.f220884f;
                java.lang.String commentScene = java.lang.String.valueOf(cVar3.getCommentScene());
                kotlin.jvm.internal.o.g(commentScene, "commentScene");
                sp2.i iVar = sp2.i.f411047a;
                it = it6;
                java.lang.String str2 = str;
                long j17 = jVar.f293074e;
                ml2.x1 x1Var = ml2.x1.f328218y;
                d17.put("exp_time", (int) jVar.f293073d);
                java.lang.String jSONObject = d17.toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                iVar.a(h1Var, j17, x1Var, commentScene, jSONObject);
                linkedList.add(ni4Var);
                q1Var.f220894s.h(h1Var, jVar.f293074e, ml2.x1.f328202f, java.lang.String.valueOf(cVar3.getCommentScene()), (absNearByFragment == null || (s07 = absNearByFragment.s0()) == null) ? "" : s07, q1Var.f220896u.a(jVar.f293074e, jVar.f293075f, "onExpose"));
                str = str2;
                com.tencent.mars.xlog.Log.i(str, "onExposeTimeRecorded pos:" + jVar.f293074e + " feedId: " + ni4Var.getLong(0) + "  startTime: " + jVar.f293071b + " auto_play_time_ms:" + ni4Var.getInteger(7) + " auto_play_with_sound:" + ni4Var.getBoolean(8) + " exposeTime:" + jVar.f293073d + " nick:" + h1Var.getFeedObject().getFeedObject().getNickname());
            } else {
                it = it6;
                if (cVar instanceof com.tencent.mm.plugin.finder.feed.ys) {
                    java.lang.String string = q1Var.a().getString(2);
                    if (string == null) {
                        string = "";
                    }
                    com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    finderBroadcastEidExposeStruct.f56537d = java.lang.System.currentTimeMillis();
                    finderBroadcastEidExposeStruct.u("");
                    finderBroadcastEidExposeStruct.p(q1Var.f220896u.a(jVar.f293074e, jVar.f293075f, "onExpose"));
                    finderBroadcastEidExposeStruct.A("");
                    finderBroadcastEidExposeStruct.y("");
                    java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                    if (Ri == null) {
                        Ri = "";
                    }
                    finderBroadcastEidExposeStruct.w(Ri);
                    finderBroadcastEidExposeStruct.r(q1Var.a().getString(1));
                    finderBroadcastEidExposeStruct.q(java.lang.String.valueOf(q1Var.a().getInteger(5)));
                    finderBroadcastEidExposeStruct.f56545l = finderBroadcastEidExposeStruct.b("TabContextID", string, true);
                    finderBroadcastEidExposeStruct.x("");
                    finderBroadcastEidExposeStruct.v("");
                    finderBroadcastEidExposeStruct.f56548o = finderBroadcastEidExposeStruct.b("ref_commentscene", "", true);
                    finderBroadcastEidExposeStruct.s("all_my_follow");
                    finderBroadcastEidExposeStruct.t("");
                    finderBroadcastEidExposeStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
                    finderBroadcastEidExposeStruct.k();
                }
            }
            it6 = it;
        }
        rq2.v.f398891a.g(q1Var.f220884f.getCommentScene(), linkedList);
        if (cp2.b.f220774w) {
            return;
        }
        so2.h3.f410392d.d(linkedList);
    }

    @Override // in5.p
    public void d(in5.j item) {
        r45.dd2 dd2Var;
        r45.s92 s92Var;
        kotlin.jvm.internal.o.g(item, "item");
        in5.c cVar = item.f293070a;
        if (cVar instanceof so2.h1) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.ni4 ni4Var = new r45.ni4();
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedLive");
            so2.h1 h1Var = (so2.h1) cVar;
            ni4Var.set(0, java.lang.Long.valueOf(h1Var.getItemId()));
            ni4Var.set(5, java.lang.Integer.valueOf((int) item.f293071b));
            ni4Var.set(9, java.lang.Long.valueOf(item.f293071b));
            ni4Var.set(6, java.lang.Integer.valueOf(item.f293074e));
            ni4Var.set(4, h1Var.g0());
            ni4Var.set(11, 2);
            android.view.View view = item.f293075f;
            if (view != null) {
                view.setTag(com.tencent.mm.R.id.k67, java.lang.Boolean.FALSE);
            }
            android.view.View view2 = item.f293075f;
            if (view2 != null) {
                view2.setTag(com.tencent.mm.R.id.f486100k62, 0L);
            }
            so2.h3 h3Var = so2.h3.f410392d;
            cp2.q1 q1Var = this.f220809a;
            h3Var.f(ni4Var, q1Var.f220884f.getCommentScene(), -1);
            rq2.v vVar = rq2.v.f398891a;
            cp2.c cVar2 = q1Var.f220884f;
            ((java.util.LinkedList) vVar.a(cVar2.getCommentScene())).add(ni4Var);
            linkedList.add(ni4Var);
            if (!cp2.b.f220774w) {
                h3Var.d(linkedList);
            }
            cq2.r rVar = cq2.r.f221444a;
            com.tencent.mm.ui.MMActivity mMActivity = q1Var.f220882d;
            int i17 = item.f293074e;
            so2.j5 j5Var = (so2.j5) cVar;
            r45.fd1 fd1Var = cp2.b.f220775x;
            int integer = (fd1Var == null || (s92Var = (r45.s92) fd1Var.getCustom(11)) == null) ? 0 : s92Var.getInteger(0);
            int q17 = q1Var.q();
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = q1Var.f220883e;
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = absNearByFragment instanceof com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment ? (com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) absNearByFragment : null;
            org.json.JSONObject d17 = rVar.d(mMActivity, i17, j5Var, integer, q17, (nearbyLiveSquareTabFragment == null || (dd2Var = nearbyLiveSquareTabFragment.f121520t) == null) ? 0 : dd2Var.getInteger(0), q1Var.q() != 0, false);
            sp2.i iVar = sp2.i.f411047a;
            long j17 = item.f293074e;
            ml2.x1 x1Var = ml2.x1.f328217x;
            java.lang.String valueOf = java.lang.String.valueOf(cVar2.getCommentScene());
            java.lang.String jSONObject = d17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            iVar.a(h1Var, j17, x1Var, valueOf, jSONObject);
            ni4Var.getLong(0);
            h1Var.getFeedObject().getFeedObject().getNickname();
        }
    }
}
