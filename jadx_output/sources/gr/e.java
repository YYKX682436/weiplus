package gr;

/* loaded from: classes4.dex */
public final class e extends com.tencent.mm.modelbase.i {
    public e(java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        r45.re3 re3Var = new r45.re3();
        r45.se3 se3Var = new r45.se3();
        re3Var.f384760d = productId;
        re3Var.f384762f = -1;
        re3Var.f384761e = 3;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = re3Var;
        lVar.f70665b = se3Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getemotiondetail";
        lVar.f70667d = 412;
        p(lVar.a());
    }
}
