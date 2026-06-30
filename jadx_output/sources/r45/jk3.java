package r45;

/* loaded from: classes8.dex */
public class jk3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377900d;

    /* renamed from: e, reason: collision with root package name */
    public r45.w0 f377901e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jk3)) {
            return false;
        }
        r45.jk3 jk3Var = (r45.jk3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377900d), java.lang.Integer.valueOf(jk3Var.f377900d)) && n51.f.a(this.f377901e, jk3Var.f377901e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377900d);
            r45.w0 w0Var = this.f377901e;
            if (w0Var != null) {
                fVar.i(2, w0Var.computeSize());
                this.f377901e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377900d) + 0;
            r45.w0 w0Var2 = this.f377901e;
            return w0Var2 != null ? e17 + b36.f.i(2, w0Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.jk3 jk3Var = (r45.jk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jk3Var.f377900d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.w0 w0Var3 = new r45.w0();
            if (bArr != null && bArr.length > 0) {
                w0Var3.parseFrom(bArr);
            }
            jk3Var.f377901e = w0Var3;
        }
        return 0;
    }
}
