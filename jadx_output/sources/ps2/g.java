package ps2;

/* loaded from: classes10.dex */
public final class g extends ps2.e {
    @Override // ps2.e
    public com.tencent.mm.protocal.protobuf.FinderObject b(byte[] bArr) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        if (bArr != null) {
            pj4.u1 u1Var = new pj4.u1();
            u1Var.parseFrom(bArr);
            finderObject.setId(u1Var.f355306f.f355286d);
            finderObject.setObjectNonceId(u1Var.f355306f.f355287e);
        }
        return finderObject;
    }

    @Override // ps2.e, bi4.r0
    public bi4.o0 w7(java.lang.String str) {
        return new ps2.f(str, "RingtoneTextStatusService");
    }
}
