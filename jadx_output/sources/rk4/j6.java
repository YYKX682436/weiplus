package rk4;

/* loaded from: classes11.dex */
public final class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f396753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f396754e;

    public j6(bw5.o50 o50Var, bw5.ar0 ar0Var) {
        this.f396753d = o50Var;
        this.f396754e = ar0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            bw5.ar0 scene = this.f396754e;
            rk4.i6 i6Var = new rk4.i6(scene);
            jm4.k4 k4Var = (jm4.k4) Zi;
            kotlin.jvm.internal.o.g(scene, "scene");
            bw5.o50 o50Var = this.f396753d;
            byte[] byteArray = o50Var != null ? o50Var.toByteArray() : null;
            int i17 = scene.f25422d;
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f300441d = i6Var;
            urgen.ur_0025.UR_5769.UR_F8E4(k4Var.getCppPointer(), byteArray, i17, 0, x1Var);
        }
    }
}
