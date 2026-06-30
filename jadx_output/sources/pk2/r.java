package pk2;

/* loaded from: classes3.dex */
public final class r extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356205h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356205h = helper.f356093k0;
        this.f356206i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "clickBeauty");
        boolean n17 = n();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_CAMERA_OPT_SCENE", n17 ? 1 : 0);
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = (com.tencent.mm.plugin.finder.live.viewmodel.r5) o9Var.e(com.tencent.mm.plugin.finder.live.viewmodel.r5.class);
        if (r5Var != null) {
            r5Var.d7(bundle);
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356206i;
    }

    @Override // qk2.f
    public boolean o() {
        mm2.h7 h7Var = (mm2.h7) dk2.ef.f233372a.i(mm2.h7.class);
        if (h7Var != null && h7Var.O6()) {
            return false;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        pk2.o9 o9Var = this.f364427a;
        kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) o9Var.f356074b.a(mm2.g1.class)).f329068f;
        if (r4Var.G1(j2Var != null ? (r45.q12) ((kotlinx.coroutines.flow.h3) j2Var).getValue() : null)) {
            return true;
        }
        return ((mm2.e1) o9Var.f356074b.a(mm2.e1.class)).d7();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f356205h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.otq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.beauty_regular, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    @Override // qk2.h
    public int y() {
        return this.f356205h;
    }
}
