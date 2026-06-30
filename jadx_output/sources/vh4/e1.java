package vh4;

/* loaded from: classes.dex */
public final class e1 extends com.tencent.mm.modelbase.i {
    public e1(java.lang.String guardianUserName, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(guardianUserName, "guardianUserName");
        jz5.g b17 = jz5.h.b(new vh4.d1(guardianUserName, i17, str));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = (r45.zo3) ((jz5.n) b17).getValue();
        lVar.f70665b = new r45.ap3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getteenagermodeprebindguardianinfo";
        lVar.f70667d = 6232;
        p(lVar.a());
    }
}
