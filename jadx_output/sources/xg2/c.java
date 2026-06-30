package xg2;

/* loaded from: classes.dex */
public final class c extends az2.j {
    /* JADX WARN: Multi-variable type inference failed */
    public c(r45.my3 my3Var, com.tencent.mm.protobuf.f fVar, java.lang.String str, int i17) {
        super(null, null, 3, null);
        if (my3Var instanceof com.tencent.mm.protobuf.f) {
            if (fVar instanceof r45.ny3) {
                r45.ny3 ny3Var = (r45.ny3) fVar;
                ny3Var.setBaseResponse(new r45.ie());
                r45.ie baseResponse = ny3Var.getBaseResponse();
                if (baseResponse != null) {
                    baseResponse.f376960e = new r45.du5();
                }
            }
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = (com.tencent.mm.protobuf.f) my3Var;
            lVar.f70665b = fVar;
            lVar.f70666c = str;
            lVar.f70667d = i17;
            p(lVar.a());
        }
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
    }
}
