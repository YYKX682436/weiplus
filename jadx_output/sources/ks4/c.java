package ks4;

/* loaded from: classes8.dex */
public final class c extends ks4.i {
    public c(java.lang.String token, com.tencent.mm.protobuf.g ctxBuff, com.tencent.mm.protobuf.g sign, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(token, "token");
        kotlin.jvm.internal.o.g(ctxBuff, "ctxBuff");
        kotlin.jvm.internal.o.g(sign, "sign");
        r45.bk0 bk0Var = new r45.bk0();
        bk0Var.f370813d = ctxBuff;
        bk0Var.f370814e = sign;
        bk0Var.f370815f = token;
        bk0Var.f370816g = str;
        bk0Var.f370817h = i17;
        bk0Var.f370818i = js4.r.f301567c;
        s(bk0Var, new r45.ck0(), 5991, "/cgi-bin/micromsg-bin/encashincome");
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonWeCoinCgi", "CgiEncashIncomeRequest: ctx_buff: " + ctxBuff + ", sign: " + sign);
    }
}
