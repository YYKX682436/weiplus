package e22;

/* loaded from: classes.dex */
public final class g extends com.tencent.mm.modelbase.i {
    public g(int i17, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        gVar2 = (i27 & 4) != 0 ? null : gVar2;
        i18 = (i27 & 8) != 0 ? 5 : i18;
        i19 = (i27 & 16) != 0 ? 0 : i19;
        r45.mw0 mw0Var = new r45.mw0();
        mw0Var.set(7, java.lang.Integer.valueOf(i17));
        mw0Var.set(3, java.lang.Integer.valueOf(i18));
        mw0Var.set(4, java.lang.Integer.valueOf(i19));
        mw0Var.set(5, gVar);
        mw0Var.set(6, gVar2);
        mw0Var.set(8, null);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = mw0Var;
        lVar.f70667d = 4239;
        lVar.f70665b = new r45.nw0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercatelogstream";
        p(lVar.a());
    }
}
