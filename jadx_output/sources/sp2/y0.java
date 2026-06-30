package sp2;

/* loaded from: classes2.dex */
public final class y0 implements sp2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411284a;

    public y0(sp2.o2 o2Var) {
        this.f411284a = o2Var;
    }

    @Override // sp2.k
    public java.util.List a() {
        return sp2.o2.c(this.f411284a, "getOutsideAllContainerContextList");
    }

    @Override // sp2.k
    public com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView b() {
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = this.f411284a.f411139j;
        if (finderParentRecyclerView != null) {
            return finderParentRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    @Override // sp2.k
    public void c(android.os.Bundle chnlExtraBundle, so2.j5 j5Var) {
        kotlin.jvm.internal.o.g(chnlExtraBundle, "chnlExtraBundle");
        sp2.o2.a(this.f411284a, j5Var, chnlExtraBundle);
    }

    @Override // sp2.k
    public void d(vp2.s data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "onSingEntranceClick: 处理唱一唱入口点击");
        sp2.o2 o2Var = this.f411284a;
        com.tencent.mm.ui.MMActivity activity = o2Var.f411121a;
        kotlin.jvm.internal.o.g(activity, "activity");
        rq2.w wVar = (rq2.w) pf5.z.f353948a.a(activity).a(rq2.w.class);
        cl0.g gVar = new cl0.g();
        gVar.s("sing_num", java.lang.Integer.valueOf(sp2.o2.d(o2Var, data.f438954d.getString(2))));
        boolean z17 = true;
        java.lang.String string = o2Var.f411127d.getString(1);
        java.lang.String gVar2 = gVar.toString();
        wVar.Q6(string, "live_square_sing_btn", gVar2 != null ? r26.i0.t(gVar2, ",", ";", false) : null);
        sp2.d3 d3Var = o2Var.D;
        if (d3Var != null) {
            by1.d b17 = by1.c.f36353b.a().b("nearby_live_ktv_cache", new aq2.h("nearby_live_ktv_cache", null));
            aq2.h hVar = b17 instanceof aq2.h ? (aq2.h) b17 : null;
            if (hVar == null) {
                hVar = new aq2.h("nearby_live_ktv_cache", null);
            }
            boolean z18 = hVar.f36361b != null;
            com.tencent.mars.xlog.Log.i("NearLiveKtvCache", "isKtvCacheValid: 缓存有效性=" + z18);
            if (z18) {
                java.util.LinkedList linkedList = (java.util.LinkedList) hVar.f36361b;
                if (linkedList != null && !linkedList.isEmpty()) {
                    z17 = false;
                }
                if (!z17) {
                    linkedList.size();
                    d3Var.c(linkedList);
                    hVar.f36361b = null;
                    hVar.f36362c = 0L;
                    return;
                }
            }
            com.tencent.mm.ui.MMActivity mMActivity = d3Var.f411007a;
            com.tencent.mm.ui.MMActivity mMActivity2 = mMActivity instanceof com.tencent.mm.ui.MMActivity ? mMActivity : null;
            if (mMActivity2 != null) {
                d3Var.d(mMActivity2);
            }
            new cq2.e().a(d3Var.f411010d, new sp2.v2(d3Var));
        }
    }

    @Override // sp2.k
    public int e() {
        r45.s92 s92Var;
        r45.dk2 dk2Var = this.f411284a.A;
        if (dk2Var == null || (s92Var = (r45.s92) dk2Var.getCustom(12)) == null) {
            return 0;
        }
        return s92Var.getInteger(1);
    }

    @Override // sp2.k
    public com.tencent.mm.protobuf.g f() {
        r45.dk2 dk2Var = this.f411284a.A;
        if (dk2Var != null) {
            return dk2Var.getByteString(6);
        }
        return null;
    }

    @Override // sp2.k
    public r45.dk2 g() {
        return this.f411284a.A;
    }

    @Override // sp2.k
    public void h(int i17, com.tencent.mm.protobuf.g gVar, int i18, yz5.l gciListener) {
        kotlin.jvm.internal.o.g(gciListener, "gciListener");
        int i19 = i18 > 0 ? i18 : 2;
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "loadData: InnerAdapterLinkOutsideOperator, containerId=" + i17 + ", pullType=" + i19 + ", containerNextPagePullType=" + i18);
        rq2.o oVar = rq2.o.f398847a;
        rq2.o.f398856j = true;
        sp2.o2.w(this.f411284a, false, i17, i19, 0L, gciListener, null, null, null, 232, null);
    }

    @Override // sp2.k
    public boolean i() {
        return this.f411284a.v();
    }

    @Override // sp2.k
    public void j(boolean z17) {
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = this.f411284a.f411139j;
        if (finderParentRecyclerView != null) {
            finderParentRecyclerView.setCanScrollVertically(z17);
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }

    @Override // sp2.k
    public boolean k() {
        return ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).Bi();
    }

    @Override // sp2.k
    public void l(so2.j5 feed, int i17, org.json.JSONObject jsonObject) {
        r45.s92 s92Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        cq2.r rVar = cq2.r.f221444a;
        sp2.o2 o2Var = this.f411284a;
        com.tencent.mm.ui.MMActivity mMActivity = o2Var.f411121a;
        r45.dk2 dk2Var = o2Var.A;
        rVar.a(mMActivity, i17, feed, jsonObject, (dk2Var == null || (s92Var = (r45.s92) dk2Var.getCustom(12)) == null) ? 0 : s92Var.getInteger(0), (r21 & 32) != 0 ? 0 : 0, (r21 & 64) != 0 ? 0 : 0, (r21 & 128) != 0 ? true : o2Var.v());
        o2Var.i(jsonObject, feed);
    }

    @Override // sp2.k
    public r45.h81 m() {
        this.f411284a.getClass();
        return null;
    }

    @Override // sp2.k
    public void n(dk2.ic option, int i17, vp2.h0 item) {
        dk2.bc bcVar;
        dk2.hc hcVar;
        kotlin.jvm.internal.o.g(option, "option");
        kotlin.jvm.internal.o.g(item, "item");
        sp2.o2 o2Var = this.f411284a;
        if (kotlin.jvm.internal.o.b((so2.j5) kz5.n0.a0(o2Var.f411145m, i17), item)) {
            o2Var.f411145m.remove(i17);
            up2.h hVar = o2Var.f411151p;
            if (hVar != null) {
                hVar.notifyItemRemoved(i17);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "commitNpsCardOption: " + option + " pos=" + i17);
        try {
            bcVar = item.f438925e;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.LiveEntranceFragmentViewCallback", "commitNpsCardOption: " + e17);
        }
        if (bcVar != null && (hcVar = bcVar.f233256c) != null) {
            dk2.dc dcVar = item.f438926f;
            if (dcVar != null) {
                dcVar.c(hcVar);
            }
            dk2.dc dcVar2 = item.f438926f;
            if (dcVar2 != null) {
                dcVar2.b(hcVar, kz5.b0.c(option));
            }
            dk2.hc hcVar2 = option.f233624c;
            if (hcVar2 == null) {
                item.a(o2Var.f411121a, i17);
                return;
            }
            com.tencent.mm.ui.MMActivity mMActivity = o2Var.f411121a;
            kotlin.jvm.internal.o.e(hcVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.FinderLiveQcPollQuestion");
            com.tencent.mm.plugin.finder.live.widget.e0.W(new com.tencent.mm.plugin.finder.live.widget.pt(mMActivity, hcVar2, new sp2.u0(item), new sp2.v0(item, o2Var, i17), new sp2.w0(item, o2Var, i17)), null, false, 0, 7, null);
            try {
                dk2.dc dcVar3 = item.f438926f;
                if (dcVar3 != null) {
                    kotlin.jvm.internal.o.e(hcVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.FinderLiveQcPollQuestion");
                    dcVar3.d(hcVar2);
                }
                item.c(o2Var.f411121a);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("Finder.LiveEntranceFragmentViewCallback", "onDismissedWithoutResponse: " + e18);
            }
        }
    }

    @Override // sp2.k
    public void o(so2.j5 item, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "[NearbyEndLive] onContainerFeedListEmpty: container feed list empty, removing container. item.hashCode=" + item.hashCode() + ", itemType=" + item.getClass().getSimpleName() + ", containerId=" + i17);
        sp2.o2 o2Var = this.f411284a;
        java.util.Iterator it = o2Var.f411145m.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b((so2.j5) it.next(), item)) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.w("Finder.LiveEntranceFragmentViewCallback", "[NearbyEndLive] onContainerFeedListEmpty: container not found in dataList");
            return;
        }
        o2Var.f411145m.remove(i18);
        up2.h hVar = o2Var.f411151p;
        if (!(hVar instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter)) {
            hVar = null;
        }
        int a07 = hVar != null ? hVar.a0() : 0;
        up2.h hVar2 = o2Var.f411151p;
        if (hVar2 != null) {
            hVar2.notifyItemRemoved(a07 + i18);
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "[NearbyEndLive] onContainerFeedListEmpty: removed container at index=" + i18);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "[NearbyEndLive] onContainerFeedListEmpty: removed " + kz5.h0.B(o2Var.f411149o, new sp2.x0(i17)) + " container(s) from cardContainerList, containerId=" + i17);
        sp2.o2.b(o2Var);
    }

    @Override // sp2.k
    public void p(vp2.s data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "onChatEntranceClick: 处理聊一聊入口点击");
        sp2.o2 o2Var = this.f411284a;
        com.tencent.mm.ui.MMActivity activity = o2Var.f411121a;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        rq2.w wVar = (rq2.w) zVar.a(activity).a(rq2.w.class);
        cl0.g gVar = new cl0.g();
        gVar.s("chat_num", java.lang.Integer.valueOf(sp2.o2.d(o2Var, data.f438954d.getString(2))));
        java.lang.String string = o2Var.f411127d.getString(1);
        java.lang.String gVar2 = gVar.toString();
        wVar.Q6(string, "live_square_chat_btn", gVar2 != null ? r26.i0.t(gVar2, ",", ";", false) : null);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.ui.MMActivity activity2 = o2Var.f411121a;
        kotlin.jvm.internal.o.g(activity2, "activity");
        zy2.zb.qd(zbVar, 2, 17, ((im2.p4) ((zy2.m8) zVar.a(activity2).c(zy2.m8.class))).f292497q.f463010c, null, 8, null);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "report21017ForAnchorLivePath chat entrance click success");
        sp2.d3 d3Var = o2Var.D;
        if (d3Var != null) {
            com.tencent.mm.ui.MMActivity mMActivity = d3Var.f411007a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(mMActivity))) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new sp2.s2(d3Var, mMActivity, null), 3, null);
                return;
            }
            sp2.p pVar = new sp2.p(d3Var.f411007a, d3Var.f411011e, d3Var.f411012f, new sp2.a3(d3Var), sp2.b3.f410989d);
            pVar.f411176h = sp2.z2.f411299d;
            ((com.tencent.mm.plugin.finder.view.e3) ((jz5.n) pVar.f411174f).getValue()).i();
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.qd((zy2.zb) c18, 17, pVar.f411171c, pVar.f411170b, null, 8, null);
        }
    }

    @Override // sp2.k
    public org.json.JSONObject q(android.view.View view, int i17, so2.j5 feed) {
        org.json.JSONObject d17;
        r45.s92 s92Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        cq2.r rVar = cq2.r.f221444a;
        sp2.o2 o2Var = this.f411284a;
        com.tencent.mm.ui.MMActivity mMActivity = o2Var.f411121a;
        r45.dk2 dk2Var = o2Var.A;
        d17 = rVar.d(mMActivity, i17, feed, (dk2Var == null || (s92Var = (r45.s92) dk2Var.getCustom(12)) == null) ? 0 : s92Var.getInteger(0), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? 0 : 0, (r21 & 64) != 0 ? true : o2Var.v(), (r21 & 128) != 0);
        o2Var.i(d17, feed);
        return d17;
    }
}
