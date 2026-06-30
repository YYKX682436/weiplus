package r45;

/* loaded from: classes7.dex */
public class ux1 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f387714e;

    /* renamed from: f, reason: collision with root package name */
    public int f387715f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f387713d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f387716g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ux1)) {
            return false;
        }
        r45.ux1 ux1Var = (r45.ux1) fVar;
        return n51.f.a(this.BaseResponse, ux1Var.BaseResponse) && n51.f.a(this.f387713d, ux1Var.f387713d) && n51.f.a(this.f387714e, ux1Var.f387714e) && n51.f.a(java.lang.Integer.valueOf(this.f387715f), java.lang.Integer.valueOf(ux1Var.f387715f)) && n51.f.a(this.f387716g, ux1Var.f387716g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387716g;
        java.util.LinkedList linkedList2 = this.f387713d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar = this.f387714e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f387715f);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar2 = this.f387714e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.e(4, this.f387715f) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.ux1 ux1Var = (r45.ux1) objArr[1];
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
                ux1Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.ay1 ay1Var = new r45.ay1();
                if (bArr3 != null && bArr3.length > 0) {
                    ay1Var.parseFrom(bArr3);
                }
                ux1Var.f387713d.add(ay1Var);
            }
            return 0;
        }
        if (intValue == 3) {
            ux1Var.f387714e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            ux1Var.f387715f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.cy1 cy1Var = new r45.cy1();
            if (bArr4 != null && bArr4.length > 0) {
                cy1Var.parseFrom(bArr4);
            }
            ux1Var.f387716g.add(cy1Var);
        }
        return 0;
    }
}
