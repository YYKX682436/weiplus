package zp1;

/* loaded from: classes12.dex */
public final /* synthetic */ class a$$a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity f474939d;

    public /* synthetic */ a$$a(com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity mMBatteryStatsActivity) {
        this.f474939d = mMBatteryStatsActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.f93827m;
        final com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity mMBatteryStatsActivity = this.f474939d;
        mMBatteryStatsActivity.getClass();
        ph.a.b(com.tencent.matrix.batterycanary.stats.k.class, new wh.t0() { // from class: zp1.a$$f
            @Override // wh.t0
            public final void accept(java.lang.Object obj) {
                final com.tencent.matrix.batterycanary.stats.k kVar = (com.tencent.matrix.batterycanary.stats.k) obj;
                int i18 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.f93827m;
                final com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity mMBatteryStatsActivity2 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.this;
                mMBatteryStatsActivity2.getClass();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMBatteryStatsActivity2.getContext(), 1, true);
                k0Var.f211872n = new db5.o4() { // from class: zp1.a$$g
                    @Override // db5.o4
                    public final void onCreateMMMenu(db5.g4 g4Var) {
                        int i19 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.f93827m;
                        g4Var.add(":main");
                        com.tencent.matrix.batterycanary.stats.k.this.getClass();
                        for (java.lang.String str : java.util.Collections.emptySet()) {
                            if (!com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM.equals(str)) {
                                g4Var.add(":" + str);
                            }
                        }
                    }
                };
                k0Var.f211881s = new db5.t4() { // from class: zp1.a$$h
                    @Override // db5.t4
                    public final void onMMMenuItemSelected(android.view.MenuItem menuItem2, int i19) {
                        int i27 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.f93827m;
                        com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity mMBatteryStatsActivity3 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.this;
                        mMBatteryStatsActivity3.getClass();
                        java.lang.String charSequence = menuItem2.getTitle().toString();
                        if (charSequence.contains(":")) {
                            java.lang.String substring = charSequence.substring(charSequence.lastIndexOf(":") + 1);
                            mMBatteryStatsActivity3.removeAllOptionMenu();
                            mMBatteryStatsActivity3.addTextOptionMenu(1, ":" + substring, new zp1.a$$a(mMBatteryStatsActivity3), null, com.tencent.mm.ui.fb.NORMAL);
                            zp1.e eVar = mMBatteryStatsActivity3.f93828d;
                            eVar.f436829e = substring;
                            eVar.f436828d = 0;
                            eVar.f436827c.post(new vh.w(eVar));
                            mMBatteryStatsActivity3.f93828d.b();
                            mMBatteryStatsActivity3.U6(0);
                        }
                    }
                };
                k0Var.t(true);
                k0Var.q("选择进程", 17);
                k0Var.e(true);
                k0Var.v();
            }
        });
        return false;
    }
}
