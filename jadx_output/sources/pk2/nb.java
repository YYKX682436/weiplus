package pk2;

/* loaded from: classes3.dex */
public final class nb extends qk2.h {

    /* renamed from: j, reason: collision with root package name */
    public static final pk2.mb f356044j = new pk2.mb(null);

    /* renamed from: h, reason: collision with root package name */
    public final int f356045h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356046i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356045h = helper.f356100o;
        this.f356046i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.f8.f355747a.c(2, 2, null);
        f356044j.a(o9Var.f356078d, "onItemClicked");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327277x2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "2");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1");
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356046i;
    }

    @Override // qk2.f
    public boolean o() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        pk2.o9 o9Var = this.f364427a;
        gk2.e buContext = o9Var.f356074b;
        kotlin.jvm.internal.o.g(buContext, "buContext");
        boolean z17 = pm0.v.z(((mm2.c1) buContext.a(mm2.c1.class)).Q1, 67108864);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[isDisableContactSwitch] isDisable = " + z17 + ", flag = " + ((mm2.c1) buContext.a(mm2.c1.class)).Q1);
        if (z17) {
            return false;
        }
        pk2.d9 d9Var = o9Var.f356082f;
        return d9Var != null && d9Var.f355659b;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.String string = ((mm2.c1) o9Var.c(mm2.c1.class)).I7().getString(0);
        if (string == null) {
            string = "";
        }
        java.lang.String str = string;
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eio, str);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        menu.g(this.f356045h, pk2.o9.b(o9Var, string2, str, 0, 4, null), com.tencent.mm.R.raw.icons_outlined_exchange);
        pk2.f8.f355747a.c(2, 1, null);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327277x2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "1");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1");
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f356045h;
    }
}
