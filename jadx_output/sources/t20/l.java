package t20;

@j95.b
/* loaded from: classes8.dex */
public final class l extends i95.w implements sq.e {
    public void wi(java.util.List policies) {
        kotlin.jvm.internal.o.g(policies, "policies");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsUserStateMgrService", "updateSamplingPolicy: " + policies.size() + " policies");
        int i17 = y02.g1.f458605d;
        y02.e1 e1Var = (y02.e1) urgen.ur_E2DE.UR_F857.UR_1332();
        if (e1Var != null) {
            bw5.e9[] policies2 = (bw5.e9[]) policies.toArray(new bw5.e9[0]);
            kotlin.jvm.internal.o.g(policies2, "policies");
            urgen.ur_E2DE.UR_F857.UR_B8BB(((y02.g1) e1Var).getCppPointer(), y02.k.a(policies2));
        }
    }
}
