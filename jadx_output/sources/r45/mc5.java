package r45;

/* loaded from: classes10.dex */
public class mc5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380363d;

    /* renamed from: e, reason: collision with root package name */
    public int f380364e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f380365f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f380366g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mc5)) {
            return false;
        }
        r45.mc5 mc5Var = (r45.mc5) fVar;
        return n51.f.a(this.f380363d, mc5Var.f380363d) && n51.f.a(java.lang.Integer.valueOf(this.f380364e), java.lang.Integer.valueOf(mc5Var.f380364e)) && n51.f.a(this.f380365f, mc5Var.f380365f) && n51.f.a(this.f380366g, mc5Var.f380366g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380363d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f380364e);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f380365f;
            if (finderObject != null) {
                fVar.i(3, finderObject.computeSize());
                this.f380365f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f380366g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f380363d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f380364e);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f380365f;
            if (finderObject2 != null) {
                j17 += b36.f.i(3, finderObject2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f380366g;
            return gVar2 != null ? j17 + b36.f.b(4, gVar2) : j17;
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
        r45.mc5 mc5Var = (r45.mc5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mc5Var.f380363d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            mc5Var.f380364e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            mc5Var.f380366g = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = new com.tencent.mm.protocal.protobuf.FinderObject();
            if (bArr != null && bArr.length > 0) {
                finderObject3.parseFrom(bArr);
            }
            mc5Var.f380365f = finderObject3;
        }
        return 0;
    }
}
