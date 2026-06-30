package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bl implements tg2.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f112046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112048c;

    public bl(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, android.view.ViewGroup viewGroup) {
        this.f112047b = hmVar;
        this.f112048c = viewGroup;
    }

    @Override // tg2.h
    public void a(java.lang.String giftId, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mars.xlog.Log.i(this.f112047b.f112831r, "on gift batch send, giftId: " + giftId + ", batchNum: " + i17);
        com.tencent.mm.plugin.finder.live.plugin.hm.J1(this.f112047b, null, giftId, i17, false, false, null, false, 113, null);
    }

    @Override // tg2.h
    public void b(android.view.ViewGroup view, java.lang.String giftId, boolean z17, ce2.i iVar, boolean z18) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        if (iVar != null && iVar.T0()) {
            r45.mb v07 = iVar.v0();
            if (!(v07 != null && v07.getInteger(0) == 3)) {
                com.tencent.mm.plugin.finder.live.plugin.hm.t1(this.f112047b, iVar);
                return;
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.hm.J1(this.f112047b, view, giftId, 0, false, z17, iVar, z18, 12, null);
    }

    @Override // tg2.h
    public void c(android.view.ViewGroup view, java.lang.String giftId) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112047b;
        hmVar.L = giftId;
        dk2.u7 u7Var = dk2.u7.f234181a;
        u7Var.h(giftId, false);
        if (hmVar.L != null) {
            java.lang.Object obj = hmVar.K;
            if (obj instanceof android.os.Vibrator) {
                ((android.os.Vibrator) obj).vibrate(50L);
            }
        }
        ce2.i e17 = u7Var.e(giftId);
        if (e17 != null) {
            if (e17.z0().size() == 0) {
                android.view.ViewGroup viewGroup = this.f112048c;
                db5.t7.m(viewGroup.getContext(), viewGroup.getContext().getString(com.tencent.mm.R.string.dja));
                hmVar.G1();
                return;
            }
            ((vg2.b0) ((jz5.n) hmVar.f112826l1).getValue()).c();
            hmVar.A.c(giftId, 1);
            vg2.a0 a0Var = (vg2.a0) ((jz5.n) hmVar.f112829p1).getValue();
            a0Var.getClass();
            a0Var.f436472h = e17;
            java.util.LinkedList z07 = e17.z0();
            if (z07.size() == 0) {
                a0Var.a();
                return;
            }
            android.view.View view2 = a0Var.f436468d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = a0Var.f436468d;
            view3.getViewTreeObserver().addOnPreDrawListener(new vg2.z(a0Var, view));
            java.util.LinkedList linkedList = a0Var.f436470f;
            linkedList.clear();
            linkedList.addAll(z07);
            a0Var.f436471g.notifyItemRangeChanged(0, linkedList.size());
            android.view.ViewGroup.LayoutParams layoutParams = a0Var.f436473i.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = 0;
            }
            view3.requestLayout();
            android.view.ViewGroup viewGroup2 = a0Var.f436466b;
            viewGroup2.removeView(view3);
            viewGroup2.addView(view3);
        }
    }

    @Override // tg2.h
    public void e(android.view.ViewGroup view, java.lang.String giftId) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List arrayList;
        r45.mb v07;
        r45.wd0 wd0Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mars.xlog.Log.i(this.f112047b.f112831r, "onGiftItemClick giftId:" + giftId + " click,panelHiding:" + this.f112047b.f112825J + '!');
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112047b;
        dk2.u7 u7Var = dk2.u7.f234181a;
        hmVar.O1 = u7Var.e(giftId);
        ce2.i iVar = this.f112047b.O1;
        boolean z17 = false;
        jz5.f0 f0Var = null;
        if (iVar != null && iVar.U0()) {
            dk2.ef efVar = dk2.ef.f233372a;
            if (dk2.ef.f233404s) {
                if (dk2.ef.f233403r == null) {
                    efVar.c0(((it2.x) ((rs5.f) i95.n0.c(rs5.f.class))).Bi());
                }
                if (!(dk2.ef.f233404s && dk2.ef.f233403r != null)) {
                    com.tencent.mars.xlog.Log.i(this.f112047b.f112831r, "isCustomGift but resource is not ready, forceUpdate");
                    it2.x xVar = (it2.x) ((rs5.f) i95.n0.c(rs5.f.class));
                    xVar.getClass();
                    com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
                    qVar.c(xVar.f294541r);
                    ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Bi(qVar);
                } else if (!kotlin.jvm.internal.o.b(dk2.u7.f234187g.get(giftId), java.lang.Boolean.TRUE)) {
                    ce2.i iVar2 = this.f112047b.O1;
                    r45.na0 D0 = iVar2 != null ? iVar2.D0() : null;
                    if (iVar2 != null && D0 != null) {
                        u7Var.c("onGiftItemCallback", iVar2, D0);
                    }
                }
            }
        }
        this.f112047b.G1();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar2 = this.f112047b;
        if (hmVar2.f112830q == com.tencent.mm.plugin.finder.live.plugin.jj.f113115e && hmVar2.R1 == 1) {
            ce2.i iVar3 = hmVar2.O1;
            if (iVar3 != null && iVar3.W0()) {
                r45.eq1 eq1Var = ((mm2.n2) this.f112047b.P0(mm2.n2.class)).f329279g;
                if (eq1Var != null && !eq1Var.getBoolean(1)) {
                    z17 = true;
                }
                if (z17) {
                    qo0.c cVar = this.f112047b.f112827p;
                    qo0.b bVar = qo0.b.O4;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_FANS_FROM_WISH", true);
                    cVar.statusChange(bVar, bundle);
                    this.f112047b.H1();
                    return;
                }
            }
            ((mm2.s2) this.f112047b.P0(mm2.s2.class)).f329406h.postValue(u7Var.e(giftId));
            this.f112047b.H1();
            return;
        }
        if (hmVar2.f112825J) {
            return;
        }
        u7Var.h(giftId, true);
        com.tencent.mars.xlog.Log.i(this.f112047b.f112831r, "onGiftItemClick start Preview");
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar3 = this.f112047b;
        hmVar3.L = giftId;
        ce2.i iVar4 = hmVar3.O1;
        java.lang.String str3 = iVar4 != null ? iVar4.field_description : null;
        if (str3 == null || str3.length() == 0) {
            this.f112047b.A.c(giftId, 0);
        } else {
            this.f112047b.A.c(giftId, 2);
        }
        ((vg2.t) ((jz5.n) this.f112047b.f112841y0).getValue()).d(view, giftId);
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar4 = this.f112047b;
        ce2.i iVar5 = hmVar4.O1;
        str = "";
        if (iVar5 != null && pm0.v.z(iVar5.field_flag, 524288) && (wd0Var = iVar5.field_designerInfo) != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) wd0Var.getCustom(0)) != null) {
            java.lang.String nickname = finderContact.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            java.lang.String headUrl = finderContact.getHeadUrl();
            if (headUrl == null) {
                headUrl = "";
            }
            finderContact.getUsername();
            if (nickname.length() > 0) {
                vg2.e0 e0Var = (vg2.e0) ((jz5.n) hmVar4.f112839x1).getValue();
                e0Var.getClass();
                e0Var.f436503g.setText(nickname);
                if (!(headUrl.length() == 0)) {
                    ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(headUrl, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(e0Var.f436502f);
                }
                android.view.View view2 = e0Var.f436499c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftDesignerTipsWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftDesignerTipsWidget", "showWidget", "(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = e0Var.f436499c;
                view3.getViewTreeObserver().addOnPreDrawListener(new vg2.d0(e0Var, view));
                android.view.ViewGroup viewGroup = e0Var.f436498b;
                viewGroup.removeView(view3);
                viewGroup.addView(view3);
            }
        }
        ce2.i iVar6 = this.f112047b.O1;
        if (iVar6 != null && iVar6.a1()) {
            ce2.i iVar7 = this.f112047b.O1;
            if (iVar7 != null) {
                ce2.i iVar8 = iVar7.field_switchSkinInfo.getList(0).size() > 0 ? iVar7 : null;
                if (iVar8 != null) {
                    vg2.r1.j(this.f112047b.E1(), view, iVar8, false, false, 12, null);
                }
            }
        } else {
            ce2.i iVar9 = this.f112047b.O1;
            if (iVar9 != null && iVar9.T0()) {
                ce2.i iVar10 = this.f112047b.O1;
                java.lang.Integer valueOf = (iVar10 == null || (v07 = iVar10.v0()) == null) ? null : java.lang.Integer.valueOf(v07.getInteger(0));
                if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                    com.tencent.mm.plugin.finder.live.plugin.hm hmVar5 = this.f112047b;
                    ce2.i iVar11 = hmVar5.O1;
                    if (iVar11 != null) {
                        vg2.r1.j(hmVar5.E1(), view, iVar11, false, false, 12, null);
                    }
                }
            }
            ce2.i iVar12 = this.f112047b.O1;
            if (iVar12 != null && iVar12.Y0()) {
                vg2.v0 v0Var = this.f112047b.B1;
                if (v0Var != null) {
                    v0Var.b();
                }
                com.tencent.mm.plugin.finder.live.plugin.hm hmVar6 = this.f112047b;
                android.content.Context context = this.f112048c.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                vg2.v0 v0Var2 = new vg2.v0(context, this.f112048c, this.f112047b, null, 8, null);
                android.view.View view4 = v0Var2.f436603d;
                if (view4.getParent() == null) {
                    v0Var2.f436601b.addView(view4);
                }
                android.view.View view5 = v0Var2.f436603d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.getViewTreeObserver().addOnGlobalLayoutListener(new vg2.q0(v0Var2, view));
                com.tencent.mm.plugin.finder.live.plugin.l lVar = v0Var2.f436602c;
                tf2.o oVar = (tf2.o) lVar.U0(tf2.o.class);
                if (oVar == null || (arrayList = oVar.f418940n) == null) {
                    arrayList = new java.util.ArrayList();
                }
                tf2.o oVar2 = (tf2.o) lVar.U0(tf2.o.class);
                km2.q qVar2 = oVar2 != null ? oVar2.f418939m : null;
                if (arrayList.size() <= 1 || qVar2 == null) {
                    android.view.View view6 = (android.view.View) ((jz5.n) v0Var2.f436607h).getValue();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view7 = (android.view.View) ((jz5.n) v0Var2.f436606g).getValue();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((android.view.View) ((jz5.n) v0Var2.f436606g).getValue()).setOnClickListener(new vg2.u0(v0Var2));
                } else {
                    android.view.View view8 = (android.view.View) ((jz5.n) v0Var2.f436607h).getValue();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view9 = (android.view.View) ((jz5.n) v0Var2.f436606g).getValue();
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "showWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView = (android.widget.TextView) ((jz5.n) v0Var2.f436609j).getValue();
                    java.lang.String str4 = qVar2.f309173d;
                    textView.setText(str4 != null ? str4 : "");
                    ((android.widget.RelativeLayout) ((jz5.n) v0Var2.f436608i).getValue()).removeAllViews();
                    android.content.Context context2 = v0Var2.f436600a;
                    android.widget.ImageView imageView = new android.widget.ImageView(context2);
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) v0Var2.f436608i).getValue();
                    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.tencent.mm.plugin.appbrand.ui.u5.a(context2, 20), com.tencent.mm.plugin.appbrand.ui.u5.a(context2, 20));
                    layoutParams.setMargins(com.tencent.mm.plugin.appbrand.ui.u5.a(context2, 0), 0, 0, 0);
                    relativeLayout.addView(imageView, layoutParams);
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    g1Var.a().c(new mn2.n(qVar2.f309171b, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
                    ((android.view.View) ((jz5.n) v0Var2.f436607h).getValue()).setOnClickListener(new vg2.t0(v0Var2, arrayList, qVar2));
                }
                hmVar6.B1 = v0Var2;
            } else {
                ce2.i iVar13 = this.f112047b.O1;
                if (iVar13 != null && iVar13.U0()) {
                    dk2.ef efVar2 = dk2.ef.f233372a;
                    if (dk2.ef.f233404s && dk2.ef.f233403r != null) {
                        com.tencent.mm.plugin.finder.live.plugin.hm hmVar7 = this.f112047b;
                        ce2.i iVar14 = hmVar7.O1;
                        if (iVar14 != null) {
                            java.lang.String str5 = iVar14.field_rewardProductId;
                            if (str5 != null && str5.length() != 0) {
                                r4 = false;
                            }
                            if (r4) {
                                com.tencent.mars.xlog.Log.e(hmVar7.f112831r, "onGiftItemClick custom gift info id is null!");
                            } else {
                                pm0.v.L("preloadCustomGiftService", false, new com.tencent.mm.plugin.finder.live.plugin.al(hmVar7));
                                if (vg2.r1.j(hmVar7.E1(), view, iVar14, false, true, 4, null) && !kotlin.jvm.internal.o.b(dk2.u7.f234187g.get(str5), java.lang.Boolean.TRUE)) {
                                    kotlin.jvm.internal.o.d(str5);
                                    hmVar7.K1(str5);
                                    dk2.u7.f234199s = new it2.b(new java.lang.ref.WeakReference(hmVar7));
                                }
                            }
                            f0Var = jz5.f0.f302826a;
                        }
                        if (f0Var == null) {
                            com.tencent.mars.xlog.Log.e(this.f112047b.f112831r, "onGiftItemClick curClickGiftInfo change to null!");
                        }
                    }
                }
                if (dk2.u7.f234189i.containsKey(giftId)) {
                    com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView finderLiveGiftTagView = this.f112047b.f112834u;
                    int i17 = finderLiveGiftTagView.selectedTabIndex;
                    java.util.List list = finderLiveGiftTagView.f114756g;
                    if (list != null && (str2 = (java.lang.String) list.get(i17)) != null) {
                        str = str2;
                    }
                    if (!kotlin.jvm.internal.o.b(str, this.f112048c.getContext().getString(com.tencent.mm.R.string.f491563dj5))) {
                        ((vg2.x0) ((jz5.n) this.f112047b.f112842y1).getValue()).d(view, giftId);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i(this.f112047b.f112831r, "onGiftItemClick end Preview");
        if (this.f112047b.f112827p.getLiveRole() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327525f, giftId, 0);
        }
    }

    @Override // tg2.h
    public void f(android.view.ViewGroup view, ce2.i giftInfo) {
        boolean z17;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(giftInfo, "giftInfo");
        if (this.f112046a) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        int i17 = r4Var.I0().getInt("BATCH_SELECT_SHOW_NUM_KEY", 0);
        if (i17 > 3) {
            com.tencent.mars.xlog.Log.i("FinderLiveGiftUtil", "isEnableShowBatchToastWidget: " + i17);
            z17 = false;
        } else {
            z17 = !android.text.format.DateUtils.isToday(r4Var.I0().getLong("BATCH_SELECT_SHOW_TIME_KEY", 0L));
        }
        if (z17) {
            vg2.b0 b0Var = (vg2.b0) ((jz5.n) this.f112047b.f112826l1).getValue();
            java.lang.String field_rewardProductId = giftInfo.field_rewardProductId;
            kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
            b0Var.d(view, field_rewardProductId);
            this.f112046a = true;
            r4Var.I0().putInt("BATCH_SELECT_SHOW_NUM_KEY", r4Var.I0().getInt("BATCH_SELECT_SHOW_NUM_KEY", 0) + 1);
            r4Var.I0().putLong("BATCH_SELECT_SHOW_TIME_KEY", java.lang.System.currentTimeMillis());
        }
    }
}
