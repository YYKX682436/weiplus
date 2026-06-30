package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class jo implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ho f169533d;

    public jo(com.tencent.mm.plugin.sns.ui.ho hoVar) {
        this.f169533d = hoVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager$2");
        long c17 = c01.id.c();
        java.lang.String l17 = ca4.z0.l();
        int itemId = menuItem.getItemId();
        xa4.b bVar = xa4.b.f452821a;
        com.tencent.mm.plugin.sns.ui.ho hoVar = this.f169533d;
        if (itemId == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 1, 2, l17, java.lang.Long.valueOf(c17));
            hoVar.b();
            bVar.a(false, nc4.d.f336125g.h(), 2);
        } else if (itemId == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 2, 2, l17, java.lang.Long.valueOf(c17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = hoVar.f168524b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            snsUIAction.o(1, 3);
            bVar.a(false, nc4.d.f336124f.h(), 2);
        } else if (itemId == 8) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            androidx.activity.ComponentActivity c18 = hoVar.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            xa4.g.E(c18);
            com.tencent.mm.plugin.sns.statistics.i0 i0Var = com.tencent.mm.plugin.sns.statistics.j0.f164861a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            androidx.activity.ComponentActivity c19 = hoVar.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            i0Var.f(c19);
            bVar.a(false, nc4.d.f336128m.h(), 2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager$2");
    }
}
