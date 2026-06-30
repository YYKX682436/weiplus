package cq1;

/* loaded from: classes8.dex */
public final class u extends com.tencent.mm.modelbase.i {
    public u(java.lang.String inputUrl) {
        kotlin.jvm.internal.o.g(inputUrl, "inputUrl");
        r45.q00 q00Var = new r45.q00();
        q00Var.f383532d = inputUrl;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = q00Var;
        lVar.f70665b = new r45.r00();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkexternalurl_nonlogin";
        lVar.f70667d = 9613;
        p(lVar.a());
        com.tencent.mm.modelbase.o oVar = this.f70646f;
        oVar.f70714e = 1;
        oVar.setRsaInfo(o45.pi.a());
    }
}
