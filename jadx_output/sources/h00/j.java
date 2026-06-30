package h00;

/* loaded from: classes8.dex */
public final class j implements h00.w {
    @Override // h00.w
    public bw5.q20 a() {
        return bw5.q20.INIT_CMD_GET_CARD_HOLDER_ENTRANCE_INFO;
    }

    @Override // h00.w
    public void b(bw5.s20 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        try {
            if (resp.f32772g != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsInitCmdCardHolderEntranceInfo", "[Ecs_EcInit] EcsInitCmdCardHolderEntranceInfoHandler error: " + resp.f32772g + ", " + resp.b());
                return;
            }
            if (resp.c() != null) {
                bw5.c6 c6Var = new bw5.c6();
                c6Var.parseFrom(resp.c().g());
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsInitCmdCardHolderEntranceInfo", "handleResp show_type:" + c6Var.f25937d + " title_type:" + c6Var.f25941h);
                h00.a aVar = h00.a.f277808a;
                aVar.getClass();
                h00.a.f277810c.c(aVar, h00.a.f277809b[0], c6Var);
                c00.x3 x3Var = (c00.x3) i95.n0.c(c00.x3.class);
                if (x3Var != null) {
                    g20.g gVar = (g20.g) x3Var;
                    if (gVar.f267776g != null) {
                        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar.f267774e).getValue()).post(new g20.b(gVar));
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // h00.w
    public bw5.r20 c(android.os.Bundle bundle) {
        bw5.r20 r20Var = new bw5.r20();
        r20Var.f32383d = 1;
        r20Var.f32385f[1] = true;
        return r20Var;
    }
}
