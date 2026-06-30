package h00;

/* loaded from: classes8.dex */
public final class i implements h00.w {
    @Override // h00.w
    public bw5.q20 a() {
        return bw5.q20.INIT_CMD_GET_ECS_STRATEGY;
    }

    @Override // h00.w
    public void b(bw5.s20 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        try {
            if (resp.f32772g != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsInitCmdStrategy", "[Ecs_EcInit] EcsInitCmdBrandEcsStrategyHandler error: " + resp.f32772g + ", " + resp.b());
                return;
            }
            if (resp.c() != null) {
                r45.oh0 oh0Var = new r45.oh0();
                oh0Var.parseFrom(resp.c().g());
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsInitCmdStrategy", "handleResp ok");
                ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ni(2047, oh0Var, "EcsInitCmdStrategy");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // h00.w
    public bw5.r20 c(android.os.Bundle bundle) {
        bw5.r20 r20Var = new bw5.r20();
        r20Var.f32383d = 2;
        boolean[] zArr = r20Var.f32385f;
        zArr[1] = true;
        r45.nh0 nh0Var = new r45.nh0();
        nh0Var.f381396d = 2047;
        r20Var.f32384e = com.tencent.mm.protobuf.g.b(nh0Var.toByteArray());
        zArr[2] = true;
        return r20Var;
    }
}
