package pk2;

/* loaded from: classes3.dex */
public final class u8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356290d;

    public u8(pk2.d9 d9Var, android.app.Activity activity) {
        this.f356290d = d9Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        pk2.o9 o9Var;
        pk2.d9 d9Var = this.f356290d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = d9Var.f355660c;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        java.util.Iterator it = ((java.util.ArrayList) d9Var.f355672o).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            o9Var = d9Var.f355680w;
            if (!hasNext) {
                break;
            }
            qk2.h hVar = (qk2.h) it.next();
            hVar.w(g4Var);
            if (hVar.y() == o9Var.f356100o) {
                g4Var.g(o9Var.f356096m, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491699dy4), com.tencent.mm.R.raw.icons_outlined_report_problem);
            }
        }
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        zl2.q4 q4Var = zl2.q4.f473933a;
        if (q4Var.E() && ((java.lang.Number) ae2.in.f3688a.T().r()).intValue() == 1) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491686dx5, "Mb2.0:是");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            g4Var.g(o9Var.f356122z, pk2.o9.b(o9Var, string, "Mb2.0:是", 0, 4, null), com.tencent.mm.R.raw.icons_outlined_tag);
        }
        com.tencent.mm.ui.MMActivity activity = o9Var.f356078d;
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a() && ((java.lang.Number) ae2.in.f3688a.T().r()).intValue() == 1) {
            g4Var.g(o9Var.f356115v0, "推荐信息", com.tencent.mm.R.raw.finder_icons_link);
        }
        r45.qw1 qw1Var = ((mm2.c1) o9Var.c(mm2.c1.class)).Q5;
        java.lang.String string2 = qw1Var != null ? qw1Var.getString(0) : null;
        boolean z17 = !(string2 == null || string2.length() == 0);
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "canShowInnerData:" + z17);
        if (z17) {
            g4Var.g(o9Var.f356119x0, "统计(内部)", com.tencent.mm.R.raw.icons_outlined_more2);
        }
        if (q4Var.E() && ((java.lang.Number) ae2.in.f3688a.T().r()).intValue() == 1) {
            g4Var.g(o9Var.f356117w0, "Debug(内部)", com.tencent.mm.R.raw.icons_outlined_tag);
            g4Var.g(o9Var.f356113u0, "礼物用例(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.f356111t0, "单礼物动画(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.f356107r0, "耗时(内部)", com.tencent.mm.R.raw.icons_outlined_time);
            g4Var.g(o9Var.f356109s0, "直播统计(内部)", com.tencent.mm.R.raw.icons_outlined_transfer);
            g4Var.g(o9Var.E0, "PK用例(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.H0, "播放异常(模拟)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.f356121y0, "评论热词(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.A0, "热评特效", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.C0, "礼物墙通知(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.D0, "礼物众筹", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.F0, "背包礼物气泡", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.G0, "礼物外露", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.K0, "层级输出", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.L0, "KWS唤醒(模拟)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.M0, "FlipCamera", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.N0, "Echo", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.O0, "福袋(自定义)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.P0, "福袋(自定义话术)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.Q0, "福袋(背包Same)", com.tencent.mm.R.raw.icons_outlined_tv);
            g4Var.g(o9Var.R0, "福袋(背包Random)", com.tencent.mm.R.raw.icons_outlined_tv);
        }
    }
}
