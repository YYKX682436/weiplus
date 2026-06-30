package r45;

/* loaded from: classes2.dex */
public class q75 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383744d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383745e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f383746f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q75)) {
            return false;
        }
        r45.q75 q75Var = (r45.q75) fVar;
        return n51.f.a(this.BaseResponse, q75Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383744d), java.lang.Integer.valueOf(q75Var.f383744d)) && n51.f.a(this.f383745e, q75Var.f383745e) && n51.f.a(this.f383746f, q75Var.f383746f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383746f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f383744d);
            java.lang.String str = this.f383745e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383744d);
            java.lang.String str2 = this.f383745e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.g(4, 8, linkedList);
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
        r45.q75 q75Var = (r45.q75) objArr[1];
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
                q75Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            q75Var.f383744d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            q75Var.f383745e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.vx5 vx5Var = new r45.vx5();
            if (bArr3 != null && bArr3.length > 0) {
                vx5Var.parseFrom(bArr3);
            }
            q75Var.f383746f.add(vx5Var);
        }
        return 0;
    }
}
