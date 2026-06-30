package ux3;

/* loaded from: classes4.dex */
public final class h extends com.tencent.mm.modelbase.i {
    public h(int i17, int i18, java.lang.String sessionId, int i19) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        t45.y yVar = new t45.y();
        yVar.f415659f = i17;
        yVar.f415660g = 0;
        yVar.f415657d = i18;
        yVar.f415658e = sessionId;
        t45.x0 x0Var = new t45.x0();
        x0Var.f415656e = i18;
        x0Var.f415655d = i19;
        yVar.f415662i = android.util.Base64.encodeToString(x0Var.toByteArray(), 2);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = yVar;
        lVar.f70665b = new t45.z();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getrecommendringback";
        lVar.f70667d = 4215;
        p(lVar.a());
    }
}
