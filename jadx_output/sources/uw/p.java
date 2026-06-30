package uw;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final uw.p f431501a = new uw.p();

    public static final void a(uw.p pVar, int i17) {
        pVar.getClass();
        try {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Bj("ecs_push_permission_tips_goto_settings", "view_clk", kz5.b1.e(new jz5.l("permission_type", java.lang.String.valueOf(i17))), 12, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrsNotificationPushUtils", "reportGoToSettingsAction error: " + e17.getMessage());
        }
    }

    public static final void b(uw.p pVar, int i17) {
        pVar.getClass();
        try {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Bj("ecs_push_permission_tips_i_know", "view_clk", kz5.b1.e(new jz5.l("permission_type", java.lang.String.valueOf(i17))), 12, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrsNotificationPushUtils", "reportIKnowAction error: " + e17.getMessage());
        }
    }

    public final boolean c(android.content.Context context) {
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            z17 = !new z2.n1(context).a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrsNotificationPushUtils", "isSystemPushClosed error: " + e17.getMessage());
            z17 = false;
        }
        if (z17) {
            d(1);
            try {
                com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
                com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
                i0Var.g(com.tencent.mm.R.string.o9c);
                i0Var.d(com.tencent.mm.R.string.o8v);
                i0Var.e(com.tencent.mm.R.string.o8m);
                aVar.F = uw.l.f431497d;
                i0Var.f(com.tencent.mm.R.string.o8h);
                aVar.E = new uw.m(context);
                aVar.A = false;
                i0Var.a().show();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrsNotificationPushUtils", "showSystemPushClosedDialog error: " + e18.getMessage());
            }
            return false;
        }
        try {
            z18 = !ip.b.s();
            com.tencent.mars.xlog.Log.i("MicroMsg.BrsNotificationPushUtils", "isWeChatPushClosed: isClosed=" + z18);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrsNotificationPushUtils", "isWeChatPushClosed error: " + e19.getMessage());
            z18 = false;
        }
        if (!z18) {
            return true;
        }
        d(2);
        try {
            com.tencent.mm.ui.widget.dialog.i0 i0Var2 = new com.tencent.mm.ui.widget.dialog.i0(context);
            com.tencent.mm.ui.widget.dialog.a aVar2 = i0Var2.f211821b;
            i0Var2.g(com.tencent.mm.R.string.o9p);
            i0Var2.d(com.tencent.mm.R.string.o9l);
            i0Var2.e(com.tencent.mm.R.string.o8m);
            aVar2.F = uw.n.f431499d;
            i0Var2.f(com.tencent.mm.R.string.o8h);
            aVar2.E = new uw.o(context);
            aVar2.A = false;
            i0Var2.a().show();
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrsNotificationPushUtils", "showWeChatPushClosedDialog error: " + e27.getMessage());
        }
        return false;
    }

    public final void d(int i17) {
        try {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Bj("ecs_push_permission_tips", "view_exp", kz5.b1.e(new jz5.l("permission_type", java.lang.String.valueOf(i17))), 12, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrsNotificationPushUtils", "reportExpose error: " + e17.getMessage());
        }
    }
}
