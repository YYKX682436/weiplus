package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ej implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f129109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129110e;

    public ej(int i17, com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f129109d = i17;
        this.f129110e = finderShareFeedRelUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer num;
        int i17;
        boolean z17 = true;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129110e;
        int i18 = this.f129109d;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    com.tencent.mars.xlog.Log.e(finderShareFeedRelUI.C, "handleFeedActionIfNeeded: unknown feedActionType: " + i18);
                } else {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = finderShareFeedRelUI.G;
                    if (baseFinderFeed != null) {
                        com.tencent.mars.xlog.Log.i(finderShareFeedRelUI.C, "handleOpenCommentAction");
                        boolean C = zl2.q4.f473933a.C(baseFinderFeed);
                        bd2.b bVar = bd2.b.f19244a;
                        if (C) {
                            androidx.appcompat.app.AppCompatActivity context = finderShareFeedRelUI.getContext();
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                            i95.m c17 = i95.n0.c(zy2.zb.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            zy2.zb zbVar = (zy2.zb) c17;
                            ml2.t1 t1Var = ml2.t1.f327936b2;
                            jz5.l[] lVarArr = new jz5.l[3];
                            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
                            lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
                            lVarArr[1] = new jz5.l("feedId", pm0.v.u(baseFinderFeed.getFeedObject().getFeedObject().getId()));
                            lVarArr[2] = new jz5.l("panel_sence", "1");
                            zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), V6 != null ? V6.getString(1) : null, java.lang.String.valueOf(V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null), baseFinderFeed.g0(), null, false, 96, null);
                            r45.nw1 liveInfo2 = baseFinderFeed.getFeedObject().getLiveInfo();
                            if (liveInfo2 != null) {
                                long j17 = liveInfo2.getLong(0);
                                androidx.appcompat.app.AppCompatActivity context2 = finderShareFeedRelUI.getContext();
                                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                androidx.appcompat.app.AppCompatActivity context3 = finderShareFeedRelUI.getContext();
                                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                                bVar.j(context2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), j17, baseFinderFeed.getFeedObject().getUserName(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : baseFinderFeed);
                            }
                        } else {
                            androidx.appcompat.app.AppCompatActivity context4 = finderShareFeedRelUI.getContext();
                            kotlin.jvm.internal.o.f(context4, "getContext(...)");
                            bd2.b.c(bVar, context4, baseFinderFeed, 0L, 0, 12, null);
                        }
                    }
                }
                z17 = false;
            } else {
                com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
                java.lang.String str = finderShareFeedRelUI.C;
                if (w8Var == null) {
                    com.tencent.mars.xlog.Log.e(str, "handleOpenCommentAction: viewCallback is not initialized");
                } else {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = finderShareFeedRelUI.G;
                    if (baseFinderFeed2 != null) {
                        com.tencent.mars.xlog.Log.i(str, "handleOpenHalfScreenProfileAction");
                        com.tencent.mm.plugin.finder.feed.w8 w8Var2 = finderShareFeedRelUI.E;
                        if (w8Var2 == null) {
                            kotlin.jvm.internal.o.o("viewCallback");
                            throw null;
                        }
                        com.tencent.mm.plugin.finder.view.f5 g17 = w8Var2.g();
                        if (g17 != null) {
                            com.tencent.mm.plugin.finder.feed.w8 w8Var3 = finderShareFeedRelUI.E;
                            if (w8Var3 == null) {
                                kotlin.jvm.internal.o.o("viewCallback");
                                throw null;
                            }
                            androidx.recyclerview.widget.k3 q07 = w8Var3.getRecyclerView().q0(0, false);
                            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                            if (s0Var != null) {
                                androidx.appcompat.app.AppCompatActivity context5 = finderShareFeedRelUI.getContext();
                                kotlin.jvm.internal.o.f(context5, "getContext(...)");
                                ((com.tencent.mm.plugin.finder.viewmodel.component.a4) pf5.z.f353948a.a(context5).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class)).P6(null, baseFinderFeed2, s0Var, g17);
                                if (ya2.d.f(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i).getContact())) {
                                    com.tencent.mars.xlog.Log.i(str, "checkJumpProfile: contact, notExist");
                                } else {
                                    int intExtra = finderShareFeedRelUI.getIntent().getIntExtra("key_card_type", 0);
                                    android.content.Context context6 = finderShareFeedRelUI.getContext();
                                    if (context6 == null) {
                                        context6 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                    }
                                    int c18 = com.tencent.mm.ui.bl.c(context6);
                                    android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                    int i19 = b17.x;
                                    int i27 = b17.y;
                                    java.lang.System.nanoTime();
                                    boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                                    if (z18) {
                                        i17 = i27 - c18;
                                    } else {
                                        if (i27 >= i19) {
                                            i19 = i27;
                                        }
                                        i17 = i19 - c18;
                                    }
                                    int a17 = (int) (i17 * kx2.a.f313278a.a(s0Var.f293121e));
                                    com.tencent.mm.plugin.finder.assist.m3 m3Var = com.tencent.mm.plugin.finder.assist.m3.f102381a;
                                    com.tencent.mm.plugin.finder.ui.qm qmVar = finderShareFeedRelUI.D;
                                    if (qmVar == null) {
                                        kotlin.jvm.internal.o.o("presenter");
                                        throw null;
                                    }
                                    m3Var.a(s0Var, baseFinderFeed2, qmVar, intExtra, a17, false, 0);
                                }
                            }
                        }
                    }
                }
                num = null;
                z17 = false;
            }
            num = null;
        } else {
            com.tencent.mm.plugin.finder.feed.w8 w8Var4 = finderShareFeedRelUI.E;
            java.lang.String str3 = finderShareFeedRelUI.C;
            if (w8Var4 == null) {
                com.tencent.mars.xlog.Log.e(str3, "handleOpenCommentAction: viewCallback is not initialized");
            } else {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = finderShareFeedRelUI.G;
                if (baseFinderFeed3 != null) {
                    long longExtra = finderShareFeedRelUI.getIntent().getLongExtra("key_ref_comment_id", 0L);
                    boolean z19 = longExtra != 0;
                    com.tencent.mars.xlog.Log.i(str3, "handleOpenCommentAction, refCommentId: " + longExtra + ", blinkRefComment: " + z19);
                    com.tencent.mm.plugin.finder.feed.w8 w8Var5 = finderShareFeedRelUI.E;
                    if (w8Var5 == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.view.f5 g18 = w8Var5.g();
                    if (g18 != null) {
                        com.tencent.mm.plugin.finder.feed.w8 w8Var6 = finderShareFeedRelUI.E;
                        if (w8Var6 == null) {
                            kotlin.jvm.internal.o.o("viewCallback");
                            throw null;
                        }
                        androidx.recyclerview.widget.k3 q08 = w8Var6.getRecyclerView().q0(0, false);
                        in5.s0 s0Var2 = q08 instanceof in5.s0 ? (in5.s0) q08 : null;
                        if (s0Var2 != null) {
                            androidx.appcompat.app.AppCompatActivity context7 = finderShareFeedRelUI.getContext();
                            kotlin.jvm.internal.o.f(context7, "getContext(...)");
                            ((com.tencent.mm.plugin.finder.viewmodel.component.a4) pf5.z.f353948a.a(context7).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class)).P6(null, baseFinderFeed3, s0Var2, g18);
                        }
                        com.tencent.mm.plugin.finder.view.f5.c(g18, baseFinderFeed3.getFeedObject(), false, longExtra, z19, false, null, false, 0, null, false, 0L, 0, 0, null, 0, 32754, null);
                    }
                    num = null;
                }
            }
            z17 = false;
            num = null;
        }
        if (z17) {
            finderShareFeedRelUI.H = num;
        }
        finderShareFeedRelUI.I = false;
    }
}
