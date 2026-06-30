package wt3;

/* loaded from: classes5.dex */
public final class y extends com.tencent.mm.modelbase.i {
    public y(java.util.LinkedList imageData, float f17, float f18, long j17, long j18, int i17, int i18, com.tencent.mm.protobuf.g gVar, boolean z17) {
        kotlin.jvm.internal.o.g(imageData, "imageData");
        r45.ih4 ih4Var = new r45.ih4();
        r45.jh4 jh4Var = new r45.jh4();
        jh4Var.setBaseResponse(new r45.ie());
        jh4Var.getBaseResponse().f376960e = new r45.du5();
        ih4Var.f377045d = i18;
        ih4Var.f377046e = f17;
        ih4Var.f377047f = f18;
        ih4Var.f377049h = j17;
        ih4Var.f377051m = j18;
        ih4Var.f377050i = i17;
        if (z17) {
            ih4Var.f377052n = gVar;
        } else {
            ih4Var.f377048g = imageData;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ih4Var;
        lVar.f70665b = jh4Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getrecommendedmusiclist";
        lVar.f70667d = 341;
        p(lVar.a());
    }
}
