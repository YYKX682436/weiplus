package r45;

/* loaded from: classes4.dex */
public class ca6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f371402d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f371403e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ca6)) {
            return false;
        }
        r45.ca6 ca6Var = (r45.ca6) fVar;
        return n51.f.a(this.f371402d, ca6Var.f371402d) && n51.f.a(this.f371403e, ca6Var.f371403e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f371402d;
            if (snsObject != null) {
                fVar.i(1, snsObject.computeSize());
                this.f371402d.writeFields(fVar);
            }
            r45.du5 du5Var = this.f371403e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f371403e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = this.f371402d;
            int i18 = snsObject2 != null ? 0 + b36.f.i(1, snsObject2.computeSize()) : 0;
            r45.du5 du5Var2 = this.f371403e;
            return du5Var2 != null ? i18 + b36.f.i(2, du5Var2.computeSize()) : i18;
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
        r45.ca6 ca6Var = (r45.ca6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.mm.protocal.protobuf.SnsObject snsObject3 = new com.tencent.mm.protocal.protobuf.SnsObject();
                if (bArr != null && bArr.length > 0) {
                    snsObject3.parseFrom(bArr);
                }
                ca6Var.f371402d = snsObject3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.du5 du5Var3 = new r45.du5();
            if (bArr2 != null && bArr2.length > 0) {
                du5Var3.b(bArr2);
            }
            ca6Var.f371403e = du5Var3;
        }
        return 0;
    }
}
