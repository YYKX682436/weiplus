package r45;

/* loaded from: classes2.dex */
public class hg2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ig2 f376133d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f376134e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.lg2 f376135f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hg2)) {
            return false;
        }
        r45.hg2 hg2Var = (r45.hg2) fVar;
        return n51.f.a(this.BaseResponse, hg2Var.BaseResponse) && n51.f.a(this.f376133d, hg2Var.f376133d) && n51.f.a(this.f376134e, hg2Var.f376134e) && n51.f.a(this.f376135f, hg2Var.f376135f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376134e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.ig2 ig2Var = this.f376133d;
            if (ig2Var != null) {
                fVar.i(2, ig2Var.computeSize());
                this.f376133d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            r45.lg2 lg2Var = this.f376135f;
            if (lg2Var != null) {
                fVar.i(4, lg2Var.computeSize());
                this.f376135f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.ig2 ig2Var2 = this.f376133d;
            if (ig2Var2 != null) {
                i18 += b36.f.i(2, ig2Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            r45.lg2 lg2Var2 = this.f376135f;
            return lg2Var2 != null ? g17 + b36.f.i(4, lg2Var2.computeSize()) : g17;
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
        r45.hg2 hg2Var = (r45.hg2) objArr[1];
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
                hg2Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.ig2 ig2Var3 = new r45.ig2();
                if (bArr3 != null && bArr3.length > 0) {
                    ig2Var3.parseFrom(bArr3);
                }
                hg2Var.f376133d = ig2Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                if (bArr4 != null && bArr4.length > 0) {
                    finderObject.parseFrom(bArr4);
                }
                hg2Var.f376134e.add(finderObject);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr5 = (byte[]) j27.get(i29);
            r45.lg2 lg2Var3 = new r45.lg2();
            if (bArr5 != null && bArr5.length > 0) {
                lg2Var3.parseFrom(bArr5);
            }
            hg2Var.f376135f = lg2Var3;
        }
        return 0;
    }
}
