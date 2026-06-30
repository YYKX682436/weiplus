package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class c5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        super(1);
        this.f154264d = contactWidgetTabBizInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list;
        int i17;
        boolean z17;
        boolean z18;
        androidx.lifecycle.m1 m1Var;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo;
        r45.km kmVar;
        r45.lm lmVar;
        java.util.LinkedList linkedList;
        as3.m0 type = (as3.m0) obj;
        kotlin.jvm.internal.o.g(type, "type");
        as3.m0 m0Var = as3.m0.f13533g;
        vr3.v vVar = vr3.v.f439652a;
        gr3.b bVar = gr3.b.f274847a;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo2 = this.f154264d;
        if (type == m0Var) {
            r45.wl wlVar = contactWidgetTabBizInfo2.f154211q;
            if (!((wlVar == null || (kmVar = wlVar.f389238i) == null || (lmVar = kmVar.f378815d) == null || (linkedList = lmVar.f379589g) == null || !linkedList.isEmpty()) ? false : true)) {
                if (contactWidgetTabBizInfo2.f154210p1 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "half screen menu is showing, return");
                } else {
                    r45.wl wlVar2 = contactWidgetTabBizInfo2.f154211q;
                    kotlin.jvm.internal.o.d(wlVar2);
                    r45.lm MenuInfo = wlVar2.f389238i.f378815d;
                    kotlin.jvm.internal.o.f(MenuInfo, "MenuInfo");
                    com.tencent.mm.storage.z3 z3Var = contactWidgetTabBizInfo2.f154206n;
                    java.util.List b17 = qr3.c0.b(MenuInfo, z3Var != null && z3Var.r2());
                    final com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo2.f154198d;
                    if (contactInfoUI instanceof android.app.Activity) {
                        com.tencent.mm.storage.z3 z3Var2 = contactWidgetTabBizInfo2.f154206n;
                        int i18 = z3Var2 != null ? z3Var2.f236586x1 : 0;
                        int i19 = com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer.f154715z;
                        kotlin.jvm.internal.o.d(contactInfoUI);
                        android.view.Window window = contactInfoUI.getWindow();
                        kotlin.jvm.internal.o.f(window, "getWindow(...)");
                        sr3.g gVar = contactWidgetTabBizInfo2.f154203i;
                        boolean a17 = gVar.a();
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileServiceInfoDrawer", "createDrawerToAttachWindow");
                        final com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer bizProfileServiceInfoDrawer = new com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer(contactInfoUI);
                        android.graphics.Point b18 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        int i27 = b18.x;
                        int i28 = b18.y;
                        java.lang.System.nanoTime();
                        boolean z19 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        if (!z19) {
                            if (i28 >= i27) {
                                i27 = i28;
                            }
                            i28 = i27;
                        }
                        bizProfileServiceInfoDrawer.setTopOffset((int) (i28 * 0.25f));
                        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                        cs3.f fVar = new cs3.f(new vr3.z(contactInfoUI, a17));
                        h0Var.f310123d = fVar;
                        kotlin.jvm.internal.o.f(bizProfileServiceInfoDrawer.getContext(), "getContext(...)");
                        fVar.f222109g = bizProfileServiceInfoDrawer;
                        bizProfileServiceInfoDrawer.setSquaresBackgroundResource(com.tencent.mm.R.drawable.ctq);
                        bizProfileServiceInfoDrawer.setEnableClickBackgroundToCloseDrawer(true);
                        bizProfileServiceInfoDrawer.h(fVar);
                        bizProfileServiceInfoDrawer.setBuilder((cs3.f) h0Var.f310123d);
                        window.getDecorView().post(new cs3.b(contactInfoUI, layoutParams, window, bizProfileServiceInfoDrawer, h0Var, i18));
                        contactInfoUI.mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer$Companion$createDrawerToAttachWindow$2
                            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                            public final void onDestroy() {
                                com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer.this.b();
                                ((com.tencent.mm.ui.MMFragmentActivity) contactInfoUI).mo133getLifecycle().c(this);
                            }
                        });
                        bizProfileServiceInfoDrawer.h(new com.tencent.mm.plugin.profile.ui.tab.l6(bizProfileServiceInfoDrawer, contactWidgetTabBizInfo2));
                        contactWidgetTabBizInfo2.f154210p1 = bizProfileServiceInfoDrawer;
                        android.view.View view = contactWidgetTabBizInfo2.f154219x0;
                        if (view == null) {
                            kotlin.jvm.internal.o.o("contentView");
                            throw null;
                        }
                        view.post(new com.tencent.mm.plugin.profile.ui.tab.m6(contactWidgetTabBizInfo2, b17));
                        if (gVar.a()) {
                            contactWidgetTabBizInfo = contactWidgetTabBizInfo2;
                            bVar.b(0L, 0L, 800L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, contactWidgetTabBizInfo2.f154208p, (r29 & 128) != 0 ? 0 : contactWidgetTabBizInfo2.Z, (r29 & 256) != 0 ? 0 : 0);
                            vVar.a(contactWidgetTabBizInfo.f154206n, 2, contactWidgetTabBizInfo.f154208p, contactWidgetTabBizInfo.f154201g, contactWidgetTabBizInfo.d());
                        }
                    }
                }
            }
            contactWidgetTabBizInfo = contactWidgetTabBizInfo2;
            vVar.a(contactWidgetTabBizInfo.f154206n, 2, contactWidgetTabBizInfo.f154208p, contactWidgetTabBizInfo.f154201g, contactWidgetTabBizInfo.d());
        } else {
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout bizProfileTabLayout = contactWidgetTabBizInfo2.C;
            if (bizProfileTabLayout == null) {
                kotlin.jvm.internal.o.o("menuTabLayout");
                throw null;
            }
            int A = bizProfileTabLayout.A(type);
            java.util.List list2 = contactWidgetTabBizInfo2.f154222z;
            if (A < ((java.util.ArrayList) list2).size()) {
                gr3.c.f(contactWidgetTabBizInfo2.f154198d, A);
                androidx.viewpager.widget.ViewPager viewPager = contactWidgetTabBizInfo2.A;
                if (viewPager == null) {
                    kotlin.jvm.internal.o.o("viewPager");
                    throw null;
                }
                viewPager.setCurrentItem(A, false);
                vVar.a(contactWidgetTabBizInfo2.f154206n, A, contactWidgetTabBizInfo2.f154208p, contactWidgetTabBizInfo2.f154201g, contactWidgetTabBizInfo2.d());
                gr3.f.f274857a.a(contactWidgetTabBizInfo2.f154209p0, "click_tab", "tab.index", type.ordinal());
                if (contactWidgetTabBizInfo2.f154203i.a() && (m1Var = (androidx.fragment.app.Fragment) kz5.n0.a0(list2, A)) != null && (m1Var instanceof zy2.h5) && ((zy2.h5) m1Var).O()) {
                    androidx.fragment.app.Fragment fragment = contactWidgetTabBizInfo2.f154204l1;
                    if (fragment == null || !kotlin.jvm.internal.o.b(m1Var, fragment)) {
                        list = list2;
                        i17 = A;
                        z17 = false;
                        z18 = true;
                        bVar.b(0L, 0L, 702L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, contactWidgetTabBizInfo2.f154208p, (r29 & 128) != 0 ? 0 : contactWidgetTabBizInfo2.Z, (r29 & 256) != 0 ? 0 : 0);
                    } else {
                        list = list2;
                        i17 = A;
                        z17 = false;
                        z18 = true;
                        bVar.b(0L, 0L, 700L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, contactWidgetTabBizInfo2.f154208p, (r29 & 128) != 0 ? 0 : contactWidgetTabBizInfo2.Z, (r29 & 256) != 0 ? 0 : 0);
                    }
                } else {
                    list = list2;
                    i17 = A;
                    z17 = false;
                    z18 = true;
                }
                androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) kz5.n0.a0(list, i17);
                androidx.fragment.app.Fragment fragment3 = contactWidgetTabBizInfo2.f154204l1;
                boolean z27 = (fragment3 == null || !kotlin.jvm.internal.o.b(fragment2, fragment3)) ? z17 : z18;
                com.tencent.mm.plugin.profile.o oVar = contactWidgetTabBizInfo2.X;
                if (oVar != null) {
                    oVar.h(type, z27);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
