package hy2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM f286062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM) {
        super(0);
        this.f286062d = finderTeenModeLimitVM;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM = this.f286062d;
        if (finderTeenModeLimitVM.Q6()) {
            long c17 = (c01.id.c() - finderTeenModeLimitVM.f136736m) + finderTeenModeLimitVM.f136735i;
            zl2.q4 q4Var = zl2.q4.f473933a;
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            kotlin.jvm.internal.o.f(calendar, "getInstance(...)");
            calendar.setTimeInMillis(c01.id.c());
            calendar.set(11, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_CLEAR_TIME_LONG_SYNC;
            if (timeInMillis >= c18.t(u3Var, 0L)) {
                com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "ClearEnjoyFinderTime on 0 time");
                long c19 = c01.id.c();
                finderTeenModeLimitVM.f136736m = c19;
                finderTeenModeLimitVM.f136735i = 0L;
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC, java.lang.Long.valueOf(finderTeenModeLimitVM.f136735i));
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(c19));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_SHOW_TEENAGER_REST_TIME_LONG_SYNC, java.lang.Long.valueOf(finderTeenModeLimitVM.f136735i));
            }
            com.tencent.mm.storage.n3 c27 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC;
            boolean o17 = c27.o(u3Var2, false);
            com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "checkTeemModeLimit: currentEnjoyFinderMs=" + c17 + " , hasCurFewClose=" + o17);
            if (finderTeenModeLimitVM.R6()) {
                long c28 = c01.id.c();
                long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_CURFEW_CLOSE_TIME_LONG_SYNC, c28);
                com.tencent.mars.xlog.Log.i("FinderTeenModeLimitVM", "checkTeemModeLimit: isInLimitTimeRange, currentTime=" + c28 + ", lastTime=" + t17);
                if (!o17 || c28 - t17 >= 57600000) {
                    finderTeenModeLimitVM.S6(true);
                }
            } else if (o17) {
                gm0.j1.u().c().x(u3Var2, java.lang.Boolean.FALSE);
            }
            if (c17 >= hy2.g.f286058a.c() * 1000) {
                finderTeenModeLimitVM.S6(false);
            }
        } else {
            finderTeenModeLimitVM.V6();
        }
        return jz5.f0.f302826a;
    }
}
