package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class g0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.h0 f199072d;

    public g0(com.tencent.mm.ui.chatting.component.h0 h0Var) {
        this.f199072d = h0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.component.h0 h0Var = this.f199072d;
        if (itemId == 6) {
            h0Var.getClass();
            try {
                android.app.Activity g17 = h0Var.f198580d.g();
                kotlin.jvm.internal.o.d(g17);
                sw.a.a(g17, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsComponent", "openBrandEcsNotifySettingUI success");
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                if (rVar == null) {
                    return true;
                }
                ((cy1.a) rVar).Bj("ecs_tl_notification_setting", "view_clk", kz5.q0.f314001d, 12, false);
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrandEcsComponent", "openBrandEcsNotifySettingUI failed: " + e17.getMessage());
                return true;
            }
        }
        if (itemId != 7) {
            return false;
        }
        h0Var.getClass();
        try {
            android.app.Activity context = h0Var.f198580d.g();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsComponent", "openBrandServiceConversationList");
            ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
            if (lifecycleScope == null) {
                return true;
            }
            v65.i.c(lifecycleScope, null, new zv.z1(context, null), 1, null);
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandEcsComponent", "openBrandServiceConversationList failed: " + e18.getMessage());
            return true;
        }
    }
}
