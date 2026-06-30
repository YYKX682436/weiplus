package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class lj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f129484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        super(1);
        this.f129483d = finderShareFeedRelUI;
        this.f129484e = finderFeedShareRelativeListLoader;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.report.n4 n4Var;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.f129483d.E;
        if (w8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        w8Var.o().setEnableLoadMore((this.f129483d.E7().E || this.f129483d.f128774g2) ? false : true);
        if (!it.getHasMore() && it.getPullType() == 19) {
            com.tencent.mm.plugin.finder.feed.w8 w8Var2 = this.f129483d.E;
            if (w8Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            w8Var2.o().setEnableRefresh(false);
            com.tencent.mm.plugin.finder.feed.w8 w8Var3 = this.f129483d.E;
            if (w8Var3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            w8Var3.o().setLimitTopRequest(-1);
            com.tencent.mm.plugin.finder.feed.w8 w8Var4 = this.f129483d.E;
            if (w8Var4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            w8Var4.o().setRefreshTargetY(-1);
            com.tencent.mm.plugin.finder.feed.w8 w8Var5 = this.f129483d.E;
            if (w8Var5 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            w8Var5.o().setDamping(0.0f);
            com.tencent.mm.plugin.finder.feed.w8 w8Var6 = this.f129483d.E;
            if (w8Var6 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            w8Var6.o().animate().cancel();
            com.tencent.mm.plugin.finder.feed.w8 w8Var7 = this.f129483d.E;
            if (w8Var7 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            w8Var7.o().setTranslationY(0.0f);
            com.tencent.mm.plugin.finder.feed.w8 w8Var8 = this.f129483d.E;
            if (w8Var8 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            w8Var8.o().getRecyclerView().setTranslationY(0.0f);
        }
        if (it.getPullType() == 2) {
            com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129483d;
            com.tencent.mm.plugin.finder.ui.qm qmVar = finderShareFeedRelUI.D;
            if (qmVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            if (!qmVar.R) {
                qmVar.R = true;
                com.tencent.mm.plugin.finder.feed.w8 w8Var9 = finderShareFeedRelUI.E;
                if (w8Var9 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                w8Var9.o().post(new com.tencent.mm.plugin.finder.ui.jj(this.f129483d));
                com.tencent.mars.xlog.Log.i(this.f129484e.getF123427d(), "preload for enter");
                so2.j5 j5Var = (so2.j5) kz5.n0.Z(this.f129483d.E7().getDataList());
                androidx.appcompat.app.AppCompatActivity context = this.f129483d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.r0 a76 = nyVar != null ? nyVar.a7(-1) : null;
                com.tencent.mm.plugin.finder.report.k4 k4Var = a76 instanceof com.tencent.mm.plugin.finder.report.k4 ? (com.tencent.mm.plugin.finder.report.k4) a76 : null;
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    if ((k4Var == null || (n4Var = k4Var.f125108z) == null || ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() != n4Var.f125153a) ? false : true) {
                        com.tencent.mm.plugin.finder.report.n4 n4Var2 = k4Var.f125108z;
                        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = n4Var2 != null ? n4Var2.f125159d : null;
                        if (finderItem != null) {
                            finderItem.setEnhanceTriggerConfig(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getEnhanceTriggerConfig());
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI activity = this.f129483d;
        kotlin.jvm.internal.o.g(activity, "activity");
        qt2.u uVar = (qt2.u) pf5.z.f353948a.a(activity).a(qt2.u.class);
        in5.s0 O6 = uVar.O6();
        if (O6 != null) {
            int h17 = ((in5.c) O6.f293125i).h();
            if ((!uVar.f366621q && h17 == 3001) || h17 == 2) {
                uVar.f366621q = true;
                ku5.u0 u0Var = ku5.t0.f312615d;
                qt2.n nVar = new qt2.n(uVar);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                uVar.f366622r = t0Var.z(nVar, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, false);
                android.view.View itemView = O6.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                ym5.a1.h(itemView, new qt2.o(uVar));
            }
        }
        if ((it instanceof com.tencent.mm.plugin.finder.feed.model.y1) && it.getPullType() == 19) {
            java.util.List incrementList = it.getIncrementList();
            if ((incrementList != null ? incrementList.size() : 0) >= 0) {
                com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI2 = this.f129483d;
                com.tencent.mm.plugin.finder.ui.qm qmVar2 = finderShareFeedRelUI2.D;
                if (qmVar2 == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                if (qmVar2.Q) {
                    com.tencent.mm.plugin.finder.feed.w8 w8Var10 = finderShareFeedRelUI2.E;
                    if (w8Var10 == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    androidx.recyclerview.widget.RecyclerView recyclerView = w8Var10.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.post(new com.tencent.mm.plugin.finder.ui.kj(this.f129483d));
                    }
                }
            }
            com.tencent.mm.plugin.finder.ui.qm qmVar3 = this.f129483d.D;
            if (qmVar3 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            qmVar3.Q = false;
        }
        return jz5.f0.f302826a;
    }
}
