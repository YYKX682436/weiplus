package r45;

/* loaded from: classes2.dex */
public class r76 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f384596d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f384597e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384598f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r76)) {
            return false;
        }
        r45.r76 r76Var = (r45.r76) fVar;
        return n51.f.a(this.BaseResponse, r76Var.BaseResponse) && n51.f.a(this.f384596d, r76Var.f384596d) && n51.f.a(java.lang.Boolean.valueOf(this.f384597e), java.lang.Boolean.valueOf(r76Var.f384597e)) && n51.f.a(this.f384598f, r76Var.f384598f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384596d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f384597e);
            com.tencent.mm.protobuf.g gVar = this.f384598f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f384597e);
            com.tencent.mm.protobuf.g gVar2 = this.f384598f;
            return gVar2 != null ? i18 + b36.f.b(4, gVar2) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.r76 r76Var = (r45.r76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                r76Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                r76Var.f384597e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            r76Var.f384598f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.k96 k96Var = new r45.k96();
            if (bArr3 != null && bArr3.length > 0) {
                k96Var.parseFrom(bArr3);
            }
            r76Var.f384596d.add(k96Var);
        }
        return 0;
    }
}
