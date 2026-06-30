package y80;

@j95.b
/* loaded from: classes2.dex */
public final class a1 extends i95.w implements z80.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f459825d = "MicroMsg.NavigationPOIDataLogicService";

    public boolean wi(android.content.Context context, z80.r0 jumpData) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpData, "jumpData");
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var == null) {
            com.tencent.mars.xlog.Log.e(this.f459825d, "jumpNavigation: failed");
            return false;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = jumpData.f470666a;
        b1Var.f317016c = 0;
        b1Var.f317022f = jumpData.f470667b;
        b1Var.f317032k = jumpData.f470668c;
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(context, b1Var);
        return true;
    }
}
