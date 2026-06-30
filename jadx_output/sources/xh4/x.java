package xh4;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final xh4.x f454643a = new xh4.x();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f454644b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(xh4.x r13, com.tencent.mm.ui.MMFragmentActivity r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xh4.x.a(xh4.x, com.tencent.mm.ui.MMFragmentActivity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean d() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairConfigTeenModeFollowSys()) == 1;
    }

    public final void b(android.app.Activity context, yz5.a onContinue, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onContinue, "onContinue");
        if (!uh4.c0.getService().T2()) {
            onContinue.invoke();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkNeedShowDialogAfterVerifyPwd] show dialog");
            db5.e1.B(context, context.getString(com.tencent.mm.R.string.olk), "", context.getString(com.tencent.mm.R.string.f490358sq), context.getString(com.tencent.mm.R.string.f490347sg), new xh4.p(context, onContinue, aVar), new xh4.q(aVar), com.tencent.mm.R.color.f478524a5);
        }
    }

    public final java.lang.Object c(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        intent.putExtra("Intent_UseResult", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] startActivityForResult");
        ((com.tencent.mm.ui.bd) mMFragmentActivity.startActivityForResult(intent)).f197877a = new xh4.t(rVar, mMFragmentActivity);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final int e(int i17) {
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 3;
        }
        if (i17 == 3) {
            return 8;
        }
        if (i17 != 4) {
            return i17 != 5 ? 18 : 16;
        }
        return 12;
    }

    public final int f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            boolean z17 = true;
            if (android.provider.Settings.Secure.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "minors_mode", 0) != 1) {
                z17 = false;
            }
            if (z17) {
                return android.provider.Settings.Secure.getInt(context.getContentResolver(), "minors_mode_age_range", 0);
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeUtil", "Setting not found: " + e17.getMessage());
            return 0;
        }
    }

    public final boolean g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int f17 = f(context);
        if (f(context) != 0) {
            r45.kz2 O6 = ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) ((iz2.c) pf5.u.f353936a.e(zy2.b6.class).c(iz2.c.class))).O6();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            kotlin.jvm.internal.o.f(calendar, "getInstance(...)");
            int integer = calendar.get(1) - O6.getInteger(0);
            int e17 = e(f17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "age change isNeedToShowNotice finderAge: " + integer + ", sysAge: " + e17);
            if (integer != e17) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String h(int i17) {
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "Block" : "Allow" : "Limited";
    }

    public final void i(android.content.Context context) {
        ya2.r rVar = ya2.r.f460525a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "age change updateTeenModeFinderAge");
        int f17 = f(context);
        int e17 = e(f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeUtil", "updateTeenModeFinderAge sysAge: " + f17 + ", curAge: " + e17);
        try {
            r45.kz2 kz2Var = new r45.kz2();
            java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_TEEN_MODE_MANAGE_CONFIG_STRING_SYNC, "");
            kotlin.jvm.internal.o.d(v17);
            if (v17.length() > 0) {
                kz2Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
            }
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            kotlin.jvm.internal.o.f(calendar, "getInstance(...)");
            int i17 = calendar.get(1);
            int i18 = calendar.get(2);
            kz2Var.set(0, java.lang.Integer.valueOf(i17 - e17));
            kz2Var.set(1, java.lang.Integer.valueOf(i18));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            rVar.e(kz2Var.getInteger(0), kz2Var.getInteger(1), kz2Var.getLong(3));
            ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) ((iz2.c) pf5.u.f353936a.e(zy2.b6.class).c(iz2.c.class))).W6(kz2Var, "systemUpdate");
        } catch (java.lang.Throwable th6) {
            int e18 = e(f(context));
            r45.kz2 kz2Var2 = new r45.kz2();
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
            kotlin.jvm.internal.o.f(calendar2, "getInstance(...)");
            int i19 = calendar2.get(1);
            int i27 = calendar2.get(2) + 1;
            kz2Var2.set(0, java.lang.Integer.valueOf((i19 - e18) + 1));
            kz2Var2.set(1, java.lang.Integer.valueOf(i27));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            rVar.e(kz2Var2.getInteger(0), kz2Var2.getInteger(1), kz2Var2.getLong(3));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_TEEN_MODE_MANAGE_CONFIG_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(kz2Var2.toByteArray()));
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TeenModeUtil", th6, "getTeenModeManageInfo: parse teen mode config fail, ", new java.lang.Object[0]);
        }
    }
}
