package df2;

/* loaded from: classes3.dex */
public final class to extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231460m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f231461n;

    /* renamed from: o, reason: collision with root package name */
    public r45.j32 f231462o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView f231463p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.z10 f231464q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231460m = "LiveNoticeBannerController";
    }

    public static final void Z6(df2.to toVar, int i17) {
        toVar.getClass();
        if (zl2.r4.f473950a.w1()) {
            cl0.g gVar = new cl0.g();
            gVar.o("result", i17);
            r45.j32 j32Var = toVar.f231462o;
            gVar.o("display", (j32Var != null ? j32Var.getInteger(2) : 0) <= 0 ? 1 : 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328346c2, gVar.toString(), null, 4, null);
            return;
        }
        cl0.g gVar2 = new cl0.g();
        gVar2.o("result", i17);
        r45.j32 j32Var2 = toVar.f231462o;
        gVar2.o("notice_count", j32Var2 != null ? j32Var2.getInteger(2) : 0);
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0.hj((ml2.r0) c18, ml2.b4.E2, gVar2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public static final void a7(df2.to toVar, boolean z17, r45.h32 h32Var) {
        toVar.getClass();
        cl0.g gVar = new cl0.g();
        gVar.o("result", z17 ? 3 : 4);
        gVar.h("notice_id", h32Var.getString(4));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.E2, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public static final void b7(df2.to toVar, r45.j32 j32Var) {
        java.util.LinkedList list;
        com.tencent.mm.plugin.finder.live.view.ub ubVar;
        com.tencent.mm.plugin.finder.live.view.ub ubVar2;
        qo0.c liveStatus;
        toVar.getClass();
        if (zl2.r4.f473950a.w1()) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            ml2.l1 l1Var = ml2.l1.f327688o;
            y4Var.getClass();
            y4Var.f328295e0 = l1Var;
            r45.j32 j32Var2 = toVar.f231462o;
            java.util.LinkedList list2 = j32Var2 != null ? j32Var2.getList(0) : null;
            boolean z17 = list2 == null || list2.isEmpty();
            pk2.i2 i2Var = pk2.l2.f355938m;
            if (z17) {
                com.tencent.mm.ui.MMActivity N6 = toVar.N6();
                if (N6 != null) {
                    i2Var.c(N6, j32Var, null, true);
                    return;
                }
                return;
            }
            com.tencent.mm.ui.MMActivity N62 = toVar.N6();
            if (N62 != null) {
                i2Var.d(N62, j32Var, null, true);
                return;
            }
            return;
        }
        if (j32Var == null || (list = j32Var.getList(0)) == null) {
            return;
        }
        java.util.LinkedList linkedList = list.isEmpty() ^ true ? list : null;
        if (linkedList != null) {
            if (linkedList.size() != 1) {
                i95.m c17 = i95.n0.c(vd2.i5.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.ic T6 = vd2.i5.T6((vd2.i5) c17, ((mm2.c1) toVar.business(mm2.c1.class)).f328852o, toVar.O6(), false, new r45.qt2(), 0, 16, null);
                com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = (com.tencent.mm.plugin.finder.profile.widget.s4) T6;
                s4Var.F = true;
                java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
                kotlin.jvm.internal.o.g(valueOf, "<set-?>");
                s4Var.E = valueOf;
                s4Var.G = new df2.so(toVar);
                s4Var.H = 105;
                zy2.ic.a(T6, j32Var, null, false, null, 0, 0, null, 126, null);
                return;
            }
            r45.h32 h32Var = (r45.h32) kz5.n0.Z(linkedList);
            if (h32Var == null || (ubVar = toVar.f291099e) == null || ubVar.getLiveStatus() == null) {
                return;
            }
            if (toVar.f231464q == null && (ubVar2 = toVar.f291099e) != null && (liveStatus = ubVar2.getLiveStatus()) != null) {
                com.tencent.mm.plugin.finder.live.plugin.z10 z10Var = new com.tencent.mm.plugin.finder.live.plugin.z10(toVar.O6(), toVar.getStore().getLiveRoomData(), liveStatus, null, null);
                z10Var.f115269u = new df2.ko(toVar);
                z10Var.f115270v = 105;
                toVar.f231464q = z10Var;
            }
            com.tencent.mm.plugin.finder.live.plugin.z10 z10Var2 = toVar.f231464q;
            if (z10Var2 != null) {
                z10Var2.f0(new cm2.y(h32Var));
                z10Var2.f115268t = false;
                z10Var2.f115261m.performClick();
            }
        }
    }

    public final com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView c7() {
        return (com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView) S6(com.tencent.mm.R.id.ubl);
    }

    public final com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView d7() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView finderLiveNoticeBannerView = this.f231463p;
        if (finderLiveNoticeBannerView != null) {
            return finderLiveNoticeBannerView;
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView finderLiveNoticeBannerView2 = new com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView(O6());
        finderLiveNoticeBannerView2.setOnClickListener(new df2.lo(this));
        ym5.a1.h(finderLiveNoticeBannerView2, new df2.mo(this));
        this.f231463p = finderLiveNoticeBannerView2;
        return finderLiveNoticeBannerView2;
    }

    public final void e7() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView c76;
        java.util.LinkedList list;
        if (c7() == null) {
            return;
        }
        r45.j32 j32Var = this.f231462o;
        boolean z17 = false;
        r45.h32 h32Var = (j32Var == null || (list = j32Var.getList(0)) == null) ? null : (r45.h32) kz5.n0.Z(list);
        if (h32Var != null || zl2.r4.f473950a.w1()) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView c77 = c7();
            if (c77 != null) {
                if (!c77.f117650p.contains(d7())) {
                    z17 = true;
                }
            }
            if (z17 && (c76 = c7()) != null) {
                c76.c(d7());
            }
            d7().b(h32Var);
        } else {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView d76 = d7();
            com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView c78 = c7();
            if (c78 != null) {
                c78.f(d76);
            }
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView c79 = c7();
        if (c79 != null) {
            c79.post(new df2.ro(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[LOOP:1: B:32:0x0096->B:34:0x009c, LOOP_END] */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveMsg(r45.r71 r14) {
        /*
            r13 = this;
            super.onLiveMsg(r14)
            boolean r0 = r13.f231461n
            if (r0 == 0) goto Lcb
            if (r14 == 0) goto Lcb
            r0 = 15
            java.util.LinkedList r14 = r14.getList(r0)
            if (r14 == 0) goto Lcb
            java.util.Iterator r14 = r14.iterator()
        L15:
            boolean r0 = r14.hasNext()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L33
            java.lang.Object r0 = r14.next()
            r4 = r0
            r45.gd2 r4 = (r45.gd2) r4
            int r4 = r4.getInteger(r2)
            r5 = 30023(0x7547, float:4.2071E-41)
            if (r4 != r5) goto L2f
            r4 = r1
            goto L30
        L2f:
            r4 = r2
        L30:
            if (r4 == 0) goto L15
            goto L34
        L33:
            r0 = r3
        L34:
            r45.gd2 r0 = (r45.gd2) r0
            if (r0 == 0) goto Lcb
            r45.j32 r14 = new r45.j32
            r14.<init>()
            com.tencent.mm.protobuf.g r0 = r0.getByteString(r1)
            if (r0 == 0) goto L48
            byte[] r0 = r0.g()
            goto L49
        L48:
            r0 = r3
        L49:
            if (r0 != 0) goto L4d
        L4b:
            r14 = r3
            goto L5e
        L4d:
            r14.parseFrom(r0)     // Catch: java.lang.Exception -> L51
            goto L5e
        L51:
            r14 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r1 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r1, r0, r14)
            goto L4b
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onLiveMsg: update notice list, size="
            r0.<init>(r1)
            if (r14 == 0) goto L76
            java.util.LinkedList r1 = r14.getList(r2)
            if (r1 == 0) goto L76
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L77
        L76:
            r1 = r3
        L77:
            r0.append(r1)
            java.lang.String r1 = ", ids = "
            r0.append(r1)
            if (r14 == 0) goto Lba
            java.util.LinkedList r1 = r14.getList(r2)
            if (r1 == 0) goto Lba
            java.util.ArrayList r4 = new java.util.ArrayList
            r2 = 10
            int r2 = kz5.d0.q(r1, r2)
            r4.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L96:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r1.next()
            r45.h32 r2 = (r45.h32) r2
            r3 = 4
            java.lang.String r2 = r2.getString(r3)
            r4.add(r2)
            goto L96
        Lab:
            java.lang.String r5 = "|"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            r12 = 0
            java.lang.String r3 = kz5.n0.g0(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        Lba:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r13.f231460m
            com.tencent.mars.xlog.Log.i(r1, r0)
            r13.f231462o = r14
            r13.e7()
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.to.onLiveMsg(r45.r71):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        boolean F1 = zl2.r4.F1(getStore().getLiveRoomData());
        java.lang.String str = this.f231460m;
        if (F1) {
            com.tencent.mars.xlog.Log.i(str, "noticeBannerSwitch set to false");
            this.f231461n = false;
            return;
        }
        boolean z17 = pm0.v.z(hc1Var != null ? hc1Var.getInteger(12) : 0, 8);
        com.tencent.mars.xlog.Log.i(str, "noticeBannerSwitch set to " + z17);
        this.f231461n = z17;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        if (((mm2.c1) business(mm2.c1.class)).a8() && this.f231461n) {
            e7();
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f231463p = null;
        this.f231464q = null;
    }
}
