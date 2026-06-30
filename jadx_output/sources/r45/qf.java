package r45;

/* loaded from: classes8.dex */
public class qf extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f383922d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f383923e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383924f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf)) {
            return false;
        }
        r45.qf qfVar = (r45.qf) fVar;
        return n51.f.a(this.BaseResponse, qfVar.BaseResponse) && n51.f.a(this.f383922d, qfVar.f383922d) && n51.f.a(this.f383923e, qfVar.f383923e) && n51.f.a(this.f383924f, qfVar.f383924f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383923e;
        java.util.LinkedList linkedList2 = this.f383922d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f383924f;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f383924f;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.qf qfVar = (r45.qf) objArr[1];
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
                qfVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.yi4 yi4Var = new r45.yi4();
                if (bArr3 != null && bArr3.length > 0) {
                    yi4Var.parseFrom(bArr3);
                }
                qfVar.f383922d.add(yi4Var);
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            qfVar.f383924f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.vi4 vi4Var = new r45.vi4();
            if (bArr4 != null && bArr4.length > 0) {
                vi4Var.parseFrom(bArr4);
            }
            qfVar.f383923e.add(vi4Var);
        }
        return 0;
    }
}
