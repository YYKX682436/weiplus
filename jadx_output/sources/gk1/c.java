package gk1;

/* loaded from: classes7.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.d0 d0Var = e42.d0.clicfg_android_appbrand_fakenative_use_snapshot_loading;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return ((h62.d) e0Var).fj(d0Var, false);
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(lp0.b.e());
        sb7.append("appbrand/runtime_snapshots/");
        java.lang.String vVar = new kk.v(((km0.c) gm0.j1.p().a()).a() ? gm0.j1.b().h() : gm0.l.d()).toString();
        kotlin.jvm.internal.o.f(vVar, "let(...)");
        sb7.append(vVar);
        java.lang.String sb8 = sb7.toString();
        com.tencent.mm.vfs.w6.u(sb8);
        sb6.append(sb8);
        sb6.append('/');
        sb6.append(str);
        return sb6.toString();
    }
}
