package zv2;

/* loaded from: classes10.dex */
public final class p0 extends zv2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView) {
        super(activity, jumpView);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        r45.ew0 ew0Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.k74 lite_app_info;
        g92.b bVar = g92.b.f269769e;
        androidx.appcompat.app.AppCompatActivity context = this.f476395d;
        m92.b j37 = g92.a.j3(bVar, xy2.c.e(context), false, 2, null);
        if (j37 == null || (ew0Var = (r45.ew0) j37.u0().getCustom(57)) == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ew0Var.getCustom(1)) == null || (lite_app_info = finderJumpInfo.getLite_app_info()) == null) {
            return;
        }
        lite_app_info.getString(0);
        lite_app_info.getString(1);
        lite_app_info.getString(2);
        lite_app_info.getBoolean(7);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zv2.m0 m0Var = new zv2.m0(this);
        kotlin.jvm.internal.o.g(context, "context");
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453253o = null;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        h0Var.f310123d = sVar;
        sVar.f144167d = new ya2.n0(m0Var, h0Var);
        xc2.y2.L(xc2.y2.f453343a, context, p0Var, null, sVar, null, 16, null);
    }

    @Override // zv2.b
    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        java.lang.String wording = jumpInfo.getWording();
        if (wording == null) {
            wording = "";
        }
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(this.f476396e, wording, false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f476395d;
        java.lang.String string = appCompatActivity.getResources().getString(com.tencent.mm.R.string.ozo);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        finderJumperView.setDefaultTitle(string);
        finderJumperView.setFilledIconId(com.tencent.mm.R.raw.enterprisewechat_regular);
        finderJumperView.setFilledIconColor(appCompatActivity.getResources().getColor(com.tencent.mm.R.color.f478502m));
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f401398a.a(this.f476395d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.n0(this), null, 22, null), new ry2.f(2, com.tencent.mm.R.color.Red_100, 0, new zv2.o0(this), null, 20, null)), null);
    }
}
