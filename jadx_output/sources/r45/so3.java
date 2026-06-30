package r45;

/* loaded from: classes4.dex */
public class so3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385882d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385883e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385884f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f385885g;

    /* renamed from: h, reason: collision with root package name */
    public int f385886h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.so3)) {
            return false;
        }
        r45.so3 so3Var = (r45.so3) fVar;
        return n51.f.a(this.BaseResponse, so3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385882d), java.lang.Integer.valueOf(so3Var.f385882d)) && n51.f.a(this.f385883e, so3Var.f385883e) && n51.f.a(this.f385884f, so3Var.f385884f) && n51.f.a(this.f385885g, so3Var.f385885g) && n51.f.a(java.lang.Integer.valueOf(this.f385886h), java.lang.Integer.valueOf(so3Var.f385886h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385883e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385882d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f385884f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.cu5 cu5Var = this.f385885g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f385885g.writeFields(fVar);
            }
            fVar.e(6, this.f385886h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385882d) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f385884f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            r45.cu5 cu5Var2 = this.f385885g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.computeSize());
            }
            return i18 + b36.f.e(6, this.f385886h);
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
        r45.so3 so3Var = (r45.so3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    so3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                so3Var.f385882d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    so3Var.f385883e.add(du5Var);
                }
                return 0;
            case 4:
                so3Var.f385884f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    so3Var.f385885g = cu5Var3;
                }
                return 0;
            case 6:
                so3Var.f385886h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
