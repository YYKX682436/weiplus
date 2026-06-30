package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.o f153467d;

    public g(com.tencent.mm.plugin.profile.o oVar) {
        this.f153467d = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String d17;
        pb5.a aVar;
        com.tencent.mm.storage.l4 p17;
        int itemId = menuItem.getItemId();
        boolean z17 = false;
        com.tencent.mm.plugin.profile.o oVar = this.f153467d;
        switch (itemId) {
            case 2:
                com.tencent.mm.storage.z3 z3Var = oVar.f153542b;
                java.lang.String d18 = z3Var != null ? z3Var.d1() : null;
                com.tencent.mm.storage.z3 z3Var2 = oVar.f153542b;
                java.lang.String d19 = z3Var2 != null ? z3Var2.d1() : null;
                gr3.e.d(d19 == null ? "" : d19, 800, oVar.f153544d.c(), oVar.f153541a.getIntent(), oVar.f153548h, oVar.f153544d.b(), 0, null, null, null, 0, 0, 4032, null);
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                com.tencent.mm.storage.z3 z3Var3 = oVar.f153542b;
                if (z3Var3 != null && z3Var3.l2()) {
                    z17 = true;
                }
                if (z17) {
                    ob5.a aVar2 = new ob5.a();
                    com.tencent.mm.storage.z3 z3Var4 = oVar.f153542b;
                    d17 = z3Var4 != null ? z3Var4.d1() : null;
                    if (d17 == null) {
                        d17 = "";
                    }
                    aVar2.n(d17);
                    aVar = aVar2;
                } else {
                    pb5.a aVar3 = new pb5.a();
                    com.tencent.mm.storage.z3 z3Var5 = oVar.f153542b;
                    d17 = z3Var5 != null ? z3Var5.d1() : null;
                    if (d17 == null) {
                        d17 = "";
                    }
                    aVar3.n(d17);
                    aVar = aVar3;
                }
                n13.r rVar = new n13.r();
                rVar.f334125i.add(d18 != null ? d18 : "");
                rVar.f334118b = 1;
                rVar.f334120d.f334139a = 8;
                ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(oVar.f153541a, aVar, rVar);
                return;
            case 3:
                oVar.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(oVar.f153541a, com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.class);
                com.tencent.mm.storage.z3 z3Var6 = oVar.f153542b;
                intent.putExtra("Contact_User", z3Var6 != null ? z3Var6.d1() : null);
                intent.putExtra("key_start_biz_profile_setting_from_scene", 2);
                intent.putExtra("key_profile_enter_timestamp", oVar.f153544d.c());
                intent.putExtra("key_start_biz_profile_setting_service_type", oVar.f153548h);
                intent.putExtras(oVar.f153541a.getIntent());
                com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = oVar.f153541a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(contactInfoUI, arrayList.toArray(), "com/tencent/mm/plugin/profile/BizProfileMenuController", "jumpToSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                contactInfoUI.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(contactInfoUI, "com/tencent/mm/plugin/profile/BizProfileMenuController", "jumpToSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            case 4:
                com.tencent.mm.storage.z3 z3Var7 = oVar.f153542b;
                java.lang.String d110 = z3Var7 != null ? z3Var7.d1() : null;
                gr3.e.d(d110 == null ? "" : d110, oc1.f.CTRL_INDEX, oVar.f153544d.c(), oVar.f153541a.getIntent(), oVar.f153548h, oVar.f153544d.b(), 0, null, null, null, 0, 0, 4032, null);
                com.tencent.mm.storage.z3 z3Var8 = oVar.f153542b;
                c01.i0.a(z3Var8 != null ? z3Var8.d1() : null, true);
                com.tencent.mm.storage.z3 z3Var9 = oVar.f153542b;
                if (z3Var9 != null && ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui() && z3Var9.m2()) {
                    if (((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Bi(z3Var9.d1()) && (p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(z3Var9.d1())) != null && kotlin.jvm.internal.o.b("service_officialaccounts", p17.W0())) {
                        com.tencent.mars.xlog.Log.i("BizProfileMenuController", "dealBrandEcsPlaceTopLogic place top out brand ecs box:%s", z3Var9.d1());
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().M(z3Var9.d1());
                    }
                }
                com.tencent.mm.autogen.events.BizPlaceTopChangeEvent bizPlaceTopChangeEvent = new com.tencent.mm.autogen.events.BizPlaceTopChangeEvent();
                com.tencent.mm.storage.z3 z3Var10 = oVar.f153542b;
                bizPlaceTopChangeEvent.f54004g.f8048a = z3Var10 != null ? z3Var10.d1() : null;
                bizPlaceTopChangeEvent.e();
                com.tencent.mm.storage.z3 z3Var11 = oVar.f153542b;
                if (r01.z.n(z3Var11 != null ? z3Var11.d1() : null)) {
                    com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI2 = oVar.f153541a;
                    db5.e1.T(contactInfoUI2, contactInfoUI2.getString(com.tencent.mm.R.string.gqg));
                    return;
                }
                return;
            case 5:
                com.tencent.mm.storage.z3 z3Var12 = oVar.f153542b;
                c01.e2.B0(z3Var12 != null ? z3Var12.d1() : null, true, true);
                com.tencent.mm.storage.z3 z3Var13 = oVar.f153542b;
                if (z3Var13 != null && ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui() && z3Var13.m2()) {
                    if (((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Bi(z3Var13.d1())) {
                        com.tencent.mars.xlog.Log.i("BizProfileMenuController", "dealBrandEcsUnPlaceTopLogic un place top to brand ecs box:%s", z3Var13.d1());
                        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                        java.lang.String d111 = z3Var13.d1();
                        kotlin.jvm.internal.o.f(d111, "getUsername(...)");
                        Di.P(new java.lang.String[]{d111}, "service_officialaccounts");
                    }
                }
                com.tencent.mm.storage.z3 z3Var14 = oVar.f153542b;
                java.lang.String d112 = z3Var14 != null ? z3Var14.d1() : null;
                gr3.e.d(d112 == null ? "" : d112, 904, oVar.f153544d.c(), oVar.f153541a.getIntent(), oVar.f153548h, oVar.f153544d.b(), 0, null, null, null, 0, 0, 4032, null);
                com.tencent.mm.autogen.events.BizPlaceTopChangeEvent bizPlaceTopChangeEvent2 = new com.tencent.mm.autogen.events.BizPlaceTopChangeEvent();
                com.tencent.mm.storage.z3 z3Var15 = oVar.f153542b;
                bizPlaceTopChangeEvent2.f54004g.f8048a = z3Var15 != null ? z3Var15.d1() : null;
                bizPlaceTopChangeEvent2.e();
                com.tencent.mm.storage.z3 z3Var16 = oVar.f153542b;
                if (r01.z.n(z3Var16 != null ? z3Var16.d1() : null)) {
                    com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI3 = oVar.f153541a;
                    db5.e1.T(contactInfoUI3, contactInfoUI3.getString(com.tencent.mm.R.string.ama));
                    return;
                }
                return;
            case 6:
                com.tencent.mm.storage.z3 z3Var17 = oVar.f153542b;
                if (z3Var17 == null || com.tencent.mm.sdk.platformtools.t8.K0(z3Var17.d1())) {
                    return;
                }
                gr3.f.f274857a.a(oVar.f153547g, "complaint", "", -1L);
                com.tencent.mm.storage.z3 z3Var18 = oVar.f153542b;
                java.lang.String d113 = z3Var18 != null ? z3Var18.d1() : null;
                gr3.e.d(d113 == null ? "" : d113, 601, oVar.f153544d.c(), oVar.f153541a.getIntent(), oVar.f153548h, oVar.f153544d.b(), 0, null, null, null, 0, 0, 4032, null);
                android.content.Intent intent2 = new android.content.Intent();
                java.lang.Object[] objArr = new java.lang.Object[1];
                com.tencent.mm.storage.z3 z3Var19 = oVar.f153542b;
                java.lang.String d114 = z3Var19 != null ? z3Var19.d1() : null;
                objArr[0] = d114 != null ? d114 : "";
                java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect", java.util.Arrays.copyOf(objArr, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                intent2.putExtra("rawUrl", format);
                intent2.putExtra("key_menu_hide_expose", true);
                j45.l.j(oVar.f153541a, "webview", ".ui.tools.WebViewUI", intent2, null);
                return;
            case 7:
                com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = oVar.f153545e;
                if (m0Var != null) {
                    m0Var.f();
                    return;
                }
                return;
            case 8:
                com.tencent.mm.plugin.profile.n2.f153540a.o(oVar.f153541a, oVar.f153543c, oVar.f153554n, true, oVar.f153544d.c(), oVar.f153548h, oVar.f153544d.b(), new com.tencent.mm.plugin.profile.f(oVar));
                return;
            case 9:
            default:
                com.tencent.mars.xlog.Log.w("BizProfileMenuController", "default onMMMenuItemSelected err");
                return;
            case 10:
                com.tencent.mm.plugin.profile.ui.tab.m0 m0Var2 = oVar.f153545e;
                if (m0Var2 != null) {
                    m0Var2.g();
                    return;
                }
                return;
        }
    }
}
