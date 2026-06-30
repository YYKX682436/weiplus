package ux3;

/* loaded from: classes4.dex */
public final class j extends com.tencent.mm.modelbase.i {
    public j(java.lang.String queryContent, int i17, java.lang.String sessionId, long j17, int i18) {
        kotlin.jvm.internal.o.g(queryContent, "queryContent");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        t45.z0 z0Var = new t45.z0();
        z0Var.f415667d = queryContent;
        z0Var.f415668e = i17;
        z0Var.f415669f = sessionId;
        z0Var.f415670g = j17;
        t45.w0 w0Var = new t45.w0();
        w0Var.f415652d = i18;
        z0Var.f415671h = new com.tencent.mm.protobuf.g(w0Var.toByteArray());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = z0Var;
        lVar.f70665b = new t45.a1();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/micromsg-bin/searchringback";
        lVar.f70667d = 6442;
        p(lVar.a());
    }
}
