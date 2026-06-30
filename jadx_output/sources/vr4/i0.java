package vr4;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public vr4.u0 f439732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f439733e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.i0)) {
            return false;
        }
        vr4.i0 i0Var = (vr4.i0) fVar;
        return n51.f.a(this.f439732d, i0Var.f439732d) && n51.f.a(this.f439733e, i0Var.f439733e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            vr4.u0 u0Var = this.f439732d;
            if (u0Var != null) {
                fVar.i(1, u0Var.computeSize());
                this.f439732d.writeFields(fVar);
            }
            java.lang.String str = this.f439733e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            vr4.u0 u0Var2 = this.f439732d;
            int i18 = u0Var2 != null ? 0 + b36.f.i(1, u0Var2.computeSize()) : 0;
            java.lang.String str2 = this.f439733e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        vr4.i0 i0Var = (vr4.i0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            i0Var.f439733e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            vr4.u0 u0Var3 = new vr4.u0();
            if (bArr != null && bArr.length > 0) {
                u0Var3.parseFrom(bArr);
            }
            i0Var.f439732d = u0Var3;
        }
        return 0;
    }
}
