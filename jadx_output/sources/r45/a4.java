package r45;

/* loaded from: classes4.dex */
public class a4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f369709d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f369710e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369711f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a4)) {
            return false;
        }
        r45.a4 a4Var = (r45.a4) fVar;
        return n51.f.a(this.BaseResponse, a4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f369709d), java.lang.Integer.valueOf(a4Var.f369709d)) && n51.f.a(this.f369710e, a4Var.f369710e) && n51.f.a(this.f369711f, a4Var.f369711f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f369710e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f369709d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f369711f;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f369709d) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f369711f;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.a4 a4Var = (r45.a4) objArr[1];
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
                a4Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            a4Var.f369709d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            a4Var.f369711f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.lk4 lk4Var = new r45.lk4();
            if (bArr3 != null && bArr3.length > 0) {
                lk4Var.parseFrom(bArr3);
            }
            a4Var.f369710e.add(lk4Var);
        }
        return 0;
    }
}
