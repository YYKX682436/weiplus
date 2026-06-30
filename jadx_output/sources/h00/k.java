package h00;

/* loaded from: classes8.dex */
public final class k implements h00.w {
    @Override // h00.w
    public bw5.q20 a() {
        return bw5.q20.INIT_CMD_GET_ECS_CONFIG;
    }

    @Override // h00.w
    public void b(bw5.s20 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        if (resp.f32772g != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsInitCmdGetEcsConfigHandler", "[Ecs_EcInit] EcsInitCmdGetEcsConfigHandler error: " + resp.f32772g + ", " + resp.b());
            return;
        }
        com.tencent.mm.protobuf.g c17 = resp.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleResp respBuffer is null?? ");
        sb6.append(c17 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsInitCmdGetEcsConfigHandler", sb6.toString());
        if (c17 != null) {
            try {
                bw5.i6 parseFrom = new bw5.i6().parseFrom(c17.g());
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsConfig");
                boolean[] zArr = parseFrom.f28478i;
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsInitCmdGetEcsConfigHandler", "handleResp ok");
                ((h00.b) ((c00.a3) i95.n0.c(c00.a3.class))).wi(parseFrom);
                sq.e eVar = (sq.e) i95.n0.c(sq.e.class);
                if (eVar != null) {
                    if (zArr[3]) {
                        long j17 = parseFrom.f28475f;
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsUserStateMgrService", "updateJsApiKvLimitedSize: " + j17);
                        int i17 = y02.g1.f458605d;
                        y02.e1 e1Var = (y02.e1) urgen.ur_E2DE.UR_F857.UR_1332();
                        if (e1Var != null) {
                            urgen.ur_E2DE.UR_F857.UR_DCF1(((y02.g1) e1Var).getCppPointer(), j17);
                        }
                    }
                    if (zArr[4]) {
                        java.util.LinkedList linkedList = parseFrom.f28476g;
                        kotlin.jvm.internal.o.f(linkedList, "getSamplingPolicies(...)");
                        ((t20.l) eVar).wi(linkedList);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // h00.w
    public bw5.r20 c(android.os.Bundle bundle) {
        bw5.r20 r20Var = new bw5.r20();
        r20Var.f32383d = 4;
        r20Var.f32385f[1] = true;
        return r20Var;
    }
}
