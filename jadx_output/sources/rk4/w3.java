package rk4;

/* loaded from: classes11.dex */
public final class w3 {
    public w3(kotlin.jvm.internal.i iVar) {
    }

    public final void a(pi0.l1 instance, w71.t0 params) {
        kotlin.jvm.internal.o.g(instance, "instance");
        kotlin.jvm.internal.o.g(params, "params");
        bw5.j20 Pa = params.Pa();
        bw5.l20 l20Var = new bw5.l20();
        l20Var.f29610d = instance.f354647f;
        boolean[] zArr = l20Var.f29616m;
        zArr[1] = true;
        l20Var.f29611e = Pa.f28775h[2] ? Pa.f28772e : bw5.f20.HybridRouterBizTypeDefault;
        zArr[2] = true;
        l20Var.f29612f = Pa.b();
        zArr[3] = true;
        l20Var.f29613g = Pa.f28774g;
        zArr[4] = true;
        l20Var.f29614h = params.nb();
        zArr[5] = true;
        byte[] byteArray = l20Var.toByteArray();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_C563.UR_1EDC.UR_D246(byteArray);
        rk4.v3 v3Var = new rk4.v3(instance, l20Var);
        int i17 = w71.s0.f443448d;
        java.lang.String str = zArr[1] ? l20Var.f29610d : "";
        kotlin.jvm.internal.o.f(str, "getPageId(...)");
        urgen.ur_C563.UR_30EB.UR_A00B(str, v3Var);
    }
}
