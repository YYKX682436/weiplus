package rk4;

/* loaded from: classes11.dex */
public final class v3 extends rk4.x3 {

    /* renamed from: e, reason: collision with root package name */
    public final pi0.l1 f397020e;

    public v3(pi0.l1 l1Var, bw5.l20 l20Var) {
        this.f397020e = l1Var;
    }

    @Override // rk4.x3
    public void a(w71.t0 t0Var, java.util.Map map, yz5.l lVar) {
        kotlin.jvm.internal.o.d(t0Var);
        bw5.j20 Pa = t0Var.Pa();
        if (this.f397020e == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("no engine found, handlerId: ");
            sb6.append(Pa.f28775h[1] ? Pa.f28771d : "");
            java.lang.String sb7 = sb6.toString();
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.PlatformHybridRouter", sb7, null);
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.u3(this, Pa, map, null), 3, null);
        }
        bw5.k20 k20Var = new bw5.k20();
        k20Var.f29208d = Pa.f28775h[1] ? Pa.f28771d : "";
        k20Var.f29209e[1] = true;
        if (lVar != null) {
            lVar.invoke(k20Var);
        }
    }

    @Override // w71.r0
    public java.lang.String r() {
        return "java";
    }
}
