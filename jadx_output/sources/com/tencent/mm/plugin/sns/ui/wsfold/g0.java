package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class g0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 f171374d;

    public g0(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3) {
        this.f171374d = snsWsFoldDetailUIV3;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        xa4.b bVar = xa4.b.f452821a;
        com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3 snsWsFoldDetailUIV3 = this.f171374d;
        if (itemId == 1) {
            bVar.g("view_clk", 1);
            com.tencent.mm.sdk.coroutines.LifecycleScope.e(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3.U6(snsWsFoldDetailUIV3), null, new com.tencent.mm.plugin.sns.ui.wsfold.d0(snsWsFoldDetailUIV3, null), 1, null);
            androidx.appcompat.app.AppCompatActivity context = snsWsFoldDetailUIV3.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.okl);
            e4Var.b(com.tencent.mm.R.raw.icons_outlined_done);
            e4Var.c();
        } else if (itemId == 2) {
            bVar.g("view_clk", 2);
            com.tencent.mm.sdk.coroutines.LifecycleScope.e(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3.U6(snsWsFoldDetailUIV3), null, new com.tencent.mm.plugin.sns.ui.wsfold.e0(snsWsFoldDetailUIV3, null), 1, null);
            androidx.appcompat.app.AppCompatActivity context2 = snsWsFoldDetailUIV3.getContext();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.d(com.tencent.mm.R.string.okl);
            e4Var2.b(com.tencent.mm.R.raw.icons_outlined_done);
            e4Var2.c();
        } else if (itemId == 3) {
            bVar.g("view_clk", 3);
            com.tencent.mm.sdk.coroutines.LifecycleScope.e(com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3.U6(snsWsFoldDetailUIV3), null, new com.tencent.mm.plugin.sns.ui.wsfold.f0(snsWsFoldDetailUIV3, null), 1, null);
            androidx.appcompat.app.AppCompatActivity context3 = snsWsFoldDetailUIV3.getContext();
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context3);
            e4Var3.d(com.tencent.mm.R.string.okl);
            e4Var3.b(com.tencent.mm.R.raw.icons_outlined_done);
            e4Var3.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3$setupBottomSheet$3");
    }
}
