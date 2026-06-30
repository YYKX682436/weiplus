package r45;

/* loaded from: classes7.dex */
public class ep3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f373651d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f373652e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f373653f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ep3)) {
            return false;
        }
        r45.ep3 ep3Var = (r45.ep3) fVar;
        return n51.f.a(this.BaseResponse, ep3Var.BaseResponse) && n51.f.a(this.f373651d, ep3Var.f373651d) && n51.f.a(this.f373652e, ep3Var.f373652e) && n51.f.a(java.lang.Integer.valueOf(this.f373653f), java.lang.Integer.valueOf(ep3Var.f373653f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373652e;
        java.util.LinkedList linkedList2 = this.f373651d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f373653f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f373653f);
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
        r45.ep3 ep3Var = (r45.ep3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                ep3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.bl6 bl6Var = new r45.bl6();
                if (bArr3 != null && bArr3.length > 0) {
                    bl6Var.parseFrom(bArr3);
                }
                ep3Var.f373651d.add(bl6Var);
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            ep3Var.f373653f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.s46 s46Var = new r45.s46();
            if (bArr4 != null && bArr4.length > 0) {
                s46Var.parseFrom(bArr4);
            }
            ep3Var.f373652e.add(s46Var);
        }
        return 0;
    }
}
