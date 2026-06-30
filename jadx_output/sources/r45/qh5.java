package r45;

/* loaded from: classes9.dex */
public class qh5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384001d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384002e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f384003f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f384004g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384005h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qh5)) {
            return false;
        }
        r45.qh5 qh5Var = (r45.qh5) fVar;
        return n51.f.a(this.BaseResponse, qh5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384001d), java.lang.Integer.valueOf(qh5Var.f384001d)) && n51.f.a(this.f384002e, qh5Var.f384002e) && n51.f.a(this.f384003f, qh5Var.f384003f) && n51.f.a(this.f384004g, qh5Var.f384004g) && n51.f.a(this.f384005h, qh5Var.f384005h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384004g;
        java.util.LinkedList linkedList2 = this.f384003f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f384001d);
            java.lang.String str = this.f384002e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            java.lang.String str2 = this.f384005h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384001d);
            java.lang.String str3 = this.f384002e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
            java.lang.String str4 = this.f384005h;
            return str4 != null ? g17 + b36.f.j(6, str4) : g17;
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
        r45.qh5 qh5Var = (r45.qh5) objArr[1];
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
                    qh5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                qh5Var.f384001d = aVar2.g(intValue);
                return 0;
            case 3:
                qh5Var.f384002e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.up6 up6Var = new r45.up6();
                    if (bArr3 != null && bArr3.length > 0) {
                        up6Var.parseFrom(bArr3);
                    }
                    qh5Var.f384003f.add(up6Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.up6 up6Var2 = new r45.up6();
                    if (bArr4 != null && bArr4.length > 0) {
                        up6Var2.parseFrom(bArr4);
                    }
                    qh5Var.f384004g.add(up6Var2);
                }
                return 0;
            case 6:
                qh5Var.f384005h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
