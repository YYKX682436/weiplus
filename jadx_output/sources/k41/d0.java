package k41;

/* loaded from: classes9.dex */
public final class d0 extends c01.l implements com.tencent.mm.modelbase.i1 {
    @Override // c01.l
    public com.tencent.mm.storage.f9 b(com.tencent.mm.modelbase.p0 addMsgInfo, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        r45.j4 j4Var = addMsgInfo.f70726a;
        k41.k0 b17 = k41.o0.b(x51.j1.g(j4Var.f377561h));
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuCardExtension", "kefuCard content parse failed");
            return super.b(addMsgInfo, str, str2, str3);
        }
        if (j4Var.f377560g == 67) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).cj(b17.f304021e);
        }
        if (b17.f304017a.length() > 0) {
            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
            r0Var.f70529a = b17.f304017a;
            r0Var.f70530b = 3;
            r0Var.f70534f = 1;
            r0Var.f70533e = b17.f304019c;
            r0Var.f70532d = b17.f304020d;
            r0Var.f70537i = -1;
            com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
        }
        return super.b(addMsgInfo, str, str2, str3);
    }
}
