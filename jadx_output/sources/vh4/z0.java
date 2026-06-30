package vh4;

/* loaded from: classes4.dex */
public final class z0 extends com.tencent.mm.modelbase.i {
    public z0(java.lang.String wardUserName, int i17, java.lang.String businessKey, long j17) {
        kotlin.jvm.internal.o.g(wardUserName, "wardUserName");
        kotlin.jvm.internal.o.g(businessKey, "businessKey");
        jz5.g b17 = jz5.h.b(new vh4.y0(wardUserName, i17, businessKey, j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = (r45.o6) ((jz5.n) b17).getValue();
        lVar.f70665b = new r45.p6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/agreeteenagermodeauthorization";
        lVar.f70667d = 6216;
        p(lVar.a());
    }
}
