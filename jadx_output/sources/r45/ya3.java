package r45;

/* loaded from: classes4.dex */
public class ya3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.gi5 f390924d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f390925e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ya3)) {
            return false;
        }
        r45.ya3 ya3Var = (r45.ya3) fVar;
        return n51.f.a(this.BaseResponse, ya3Var.BaseResponse) && n51.f.a(this.f390924d, ya3Var.f390924d) && n51.f.a(this.f390925e, ya3Var.f390925e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390925e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.gi5 gi5Var = this.f390924d;
            if (gi5Var != null) {
                fVar.i(2, gi5Var.computeSize());
                this.f390924d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.gi5 gi5Var2 = this.f390924d;
            if (gi5Var2 != null) {
                i18 += b36.f.i(2, gi5Var2.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
        r45.ya3 ya3Var = (r45.ya3) objArr[1];
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
                ya3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.gi5 gi5Var3 = new r45.gi5();
                if (bArr3 != null && bArr3.length > 0) {
                    gi5Var3.parseFrom(bArr3);
                }
                ya3Var.f390924d = gi5Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.j53 j53Var = new r45.j53();
            if (bArr4 != null && bArr4.length > 0) {
                j53Var.parseFrom(bArr4);
            }
            ya3Var.f390925e.add(j53Var);
        }
        return 0;
    }
}
