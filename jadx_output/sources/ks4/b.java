package ks4;

/* loaded from: classes8.dex */
public final class b extends ks4.i {
    public b(com.tencent.mm.protobuf.g ctxBuff, com.tencent.mm.protobuf.g signBuff) {
        kotlin.jvm.internal.o.g(ctxBuff, "ctxBuff");
        kotlin.jvm.internal.o.g(signBuff, "signBuff");
        r45.l80 l80Var = new r45.l80();
        l80Var.f379220e = signBuff;
        l80Var.f379219d = ctxBuff;
        l80Var.f379221f = js4.r.f301567c;
        s(l80Var, new r45.m80(), 5994, "/cgi-bin/micromsg-bin/consumewecoin");
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonWeCoinCgi", "CgiConsumeWecoinRequest: ctxBuff: " + ctxBuff + ", sign: " + signBuff);
    }
}
