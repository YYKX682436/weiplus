package jm4;

/* loaded from: classes11.dex */
public class k4 extends b66.y implements jm4.i4 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f300394d = 0;

    static {
        new jm4.j4(null);
    }

    public void d(bw5.yq0 action, bw5.ar0 scene, bw5.lp0 lp0Var, bw5.o50 o50Var, yz5.l lVar) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(scene, "scene");
        int i17 = action.f35626d;
        int i18 = scene.f25422d;
        jm4.x1 x1Var = null;
        byte[] byteArray = lp0Var != null ? lp0Var.toByteArray() : null;
        byte[] byteArray2 = o50Var != null ? o50Var.toByteArray() : null;
        if (lVar != null) {
            x1Var = new jm4.x1();
            x1Var.f300441d = lVar;
        }
        urgen.ur_0025.UR_5769.UR_6EC5(getCppPointer(), i17, i18, byteArray, byteArray2, x1Var);
    }

    public void e(bw5.lp0 tingItem, bw5.ar0 scene, int i17, yz5.l lVar) {
        jm4.x1 x1Var;
        kotlin.jvm.internal.o.g(tingItem, "tingItem");
        kotlin.jvm.internal.o.g(scene, "scene");
        byte[] byteArray = tingItem.toByteArray();
        int i18 = scene.f25422d;
        if (lVar == null) {
            x1Var = null;
        } else {
            x1Var = new jm4.x1();
            x1Var.f300441d = lVar;
        }
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_0025.UR_5769.UR_01BD(cppPointer, byteArray, i18, i17, x1Var);
    }
}
