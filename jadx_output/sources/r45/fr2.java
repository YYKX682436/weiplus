package r45;

/* loaded from: classes2.dex */
public class fr2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374573d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cq2 f374574e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fr2)) {
            return false;
        }
        r45.fr2 fr2Var = (r45.fr2) fVar;
        return n51.f.a(this.f374573d, fr2Var.f374573d) && n51.f.a(this.f374574e, fr2Var.f374574e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374573d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.cq2 cq2Var = this.f374574e;
            if (cq2Var != null) {
                fVar.i(2, cq2Var.computeSize());
                this.f374574e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f374573d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.cq2 cq2Var2 = this.f374574e;
            return cq2Var2 != null ? j17 + b36.f.i(2, cq2Var2.computeSize()) : j17;
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
        r45.fr2 fr2Var = (r45.fr2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fr2Var.f374573d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.cq2 cq2Var3 = new r45.cq2();
            if (bArr != null && bArr.length > 0) {
                cq2Var3.parseFrom(bArr);
            }
            fr2Var.f374574e = cq2Var3;
        }
        return 0;
    }
}
