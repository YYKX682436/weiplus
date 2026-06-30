package r45;

/* loaded from: classes10.dex */
public class z03 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f391565d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f391566e;

    /* renamed from: f, reason: collision with root package name */
    public int f391567f;

    /* renamed from: g, reason: collision with root package name */
    public int f391568g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391569h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z03)) {
            return false;
        }
        r45.z03 z03Var = (r45.z03) fVar;
        return n51.f.a(this.BaseResponse, z03Var.BaseResponse) && n51.f.a(this.f391565d, z03Var.f391565d) && n51.f.a(java.lang.Integer.valueOf(this.f391566e), java.lang.Integer.valueOf(z03Var.f391566e)) && n51.f.a(java.lang.Integer.valueOf(this.f391567f), java.lang.Integer.valueOf(z03Var.f391567f)) && n51.f.a(java.lang.Integer.valueOf(this.f391568g), java.lang.Integer.valueOf(z03Var.f391568g)) && n51.f.a(this.f391569h, z03Var.f391569h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391565d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f391566e);
            fVar.e(4, this.f391567f);
            fVar.e(5, this.f391568g);
            com.tencent.mm.protobuf.g gVar = this.f391569h;
            if (gVar != null) {
                fVar.b(100, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f391566e) + b36.f.e(4, this.f391567f) + b36.f.e(5, this.f391568g);
            com.tencent.mm.protobuf.g gVar2 = this.f391569h;
            return gVar2 != null ? i18 + b36.f.b(100, gVar2) : i18;
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
        r45.z03 z03Var = (r45.z03) objArr[1];
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
                z03Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = new com.tencent.mm.protocal.protobuf.FinderCommentInfo();
                if (bArr3 != null && bArr3.length > 0) {
                    finderCommentInfo.parseFrom(bArr3);
                }
                z03Var.f391565d.add(finderCommentInfo);
            }
            return 0;
        }
        if (intValue == 3) {
            z03Var.f391566e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            z03Var.f391567f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            z03Var.f391568g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        z03Var.f391569h = aVar2.d(intValue);
        return 0;
    }
}
