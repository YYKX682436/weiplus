package x85;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String lensId) {
        kotlin.jvm.internal.o.g(lensId, "lensId");
        r45.uh3 uh3Var = new r45.uh3();
        r45.vh3 vh3Var = new r45.vh3();
        uh3Var.f387383d = lensId;
        r45.ie ieVar = new r45.ie();
        vh3Var.BaseResponse = ieVar;
        ieVar.f376960e = new r45.du5();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = uh3Var;
        lVar.f70665b = vh3Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getlensinfo";
        lVar.f70667d = 3903;
        p(lVar.a());
    }
}
