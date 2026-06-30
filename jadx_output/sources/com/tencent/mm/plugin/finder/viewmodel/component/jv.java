package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jv extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pv f134899g;

    public jv(com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar) {
        this.f134899g = pvVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        boolean containsKey;
        r45.qq2 qq2Var;
        r45.gr2 gr2Var;
        r45.qq2 qq2Var2;
        r45.gr2 gr2Var2;
        r45.qq2 qq2Var3;
        r45.gr2 gr2Var3;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2;
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar = this.f134899g;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) pvVar.f135628d).getValue();
        com.tencent.mm.protobuf.g gVar = null;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter != null && (ev6 instanceof ec2.f)) {
            ec2.f fVar = (ec2.f) ev6;
            int i17 = fVar.f250959d;
            if (i17 == 2) {
                in5.s0 s0Var2 = (in5.s0) in5.n0.Y(wxRecyclerAdapter, fVar.f250965j, false, 2, null);
                if (s0Var2 == null || (baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var2.f293125i) == null) {
                    return;
                }
                pvVar.Q6(baseFinderFeed2);
                return;
            }
            if (i17 != 3 || (s0Var = (in5.s0) in5.n0.Y(wxRecyclerAdapter, fVar.f250965j, false, 2, null)) == null || (baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i) == null) {
                return;
            }
            r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            boolean z17 = false;
            if (object_extend != null && (qq2Var3 = (r45.qq2) object_extend.getCustom(3)) != null && (gr2Var3 = (r45.gr2) qq2Var3.getCustom(4)) != null) {
                z17 = gr2Var3.getBoolean(0);
            }
            r45.dm2 object_extend2 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            int integer = (object_extend2 == null || (qq2Var2 = (r45.qq2) object_extend2.getCustom(3)) == null || (gr2Var2 = (r45.gr2) qq2Var2.getCustom(4)) == null) ? -1 : gr2Var2.getInteger(1);
            r45.dm2 object_extend3 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            if (object_extend3 != null && (qq2Var = (r45.qq2) object_extend3.getCustom(3)) != null && (gr2Var = (r45.gr2) qq2Var.getCustom(4)) != null) {
                gVar = gr2Var.getByteString(2);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderProfilePreloadUIC", "[handlePreloadOnProgress] isPreload:" + z17 + ", preloadWaitTime:" + integer + ", offset:" + fVar.f250963h);
            if (z17) {
                java.lang.String userName = baseFinderFeed.getFeedObject().getUserName();
                r45.xk bizInfo = baseFinderFeed.getFeedObject().getBizInfo();
                if (integer <= 0 || fVar.f250963h < integer || baseFinderFeed.getIsDeepEnjoy()) {
                    return;
                }
                java.util.Set set = pvVar.f135629e;
                if (set.contains(userName) || bizInfo != null) {
                    return;
                }
                bu2.g0 g0Var = bu2.g0.f24511a;
                kotlin.jvm.internal.o.g(userName, "userName");
                synchronized (g0Var) {
                    containsKey = bu2.g0.f24512b.containsKey(userName);
                }
                if (containsKey) {
                    return;
                }
                set.add(userName);
                pvVar.R6(userName, "handlePreloadOnProgress", baseFinderFeed.getFeedObject(), gVar);
            }
        }
    }
}
