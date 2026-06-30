package pk2;

/* loaded from: classes3.dex */
public final class u9 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356291h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356292i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356291h = helper.f356117w0;
        this.f356292i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
    }

    public final boolean D() {
        return zl2.q4.f473933a.E() && ((java.lang.Number) ae2.in.f3688a.T().r()).intValue() == 1;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356292i;
    }

    @Override // qk2.f
    public boolean o() {
        return D();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        if (D()) {
            s(menu, o9Var.f356117w0, "Debug(内部)", com.tencent.mm.R.raw.icons_outlined_tag);
            s(menu, o9Var.f356113u0, "礼物用例(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.f356111t0, "单礼物动画(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.f356107r0, "耗时(内部)", com.tencent.mm.R.raw.icons_outlined_time);
            s(menu, o9Var.f356109s0, "直播统计(内部)", com.tencent.mm.R.raw.icons_outlined_transfer);
            s(menu, o9Var.E0, "PK用例(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.H0, "播放异常(模拟)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.f356121y0, "评论热词(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.A0, "热评特效", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.C0, "礼物墙通知(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.D0, "礼物众筹", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.F0, "背包礼物气泡", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.G0, "礼物外露", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.K0, "Hierarchy", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.L0, "KWS唤醒(模拟)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.M0, "Mock FlipCamera", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.N0, "Mock Echo", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.O0, "福袋(自定义)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.P0, "福袋(自定义话术)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.Q0, "福袋(背包Same)", com.tencent.mm.R.raw.icons_outlined_tv);
            s(menu, o9Var.R0, "福袋(背包Random)", com.tencent.mm.R.raw.icons_outlined_tv);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f356291h;
    }
}
