package r45;

/* loaded from: classes4.dex */
public class lu3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379838d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379839e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f379840f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379841g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ye5 f379842h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lu3)) {
            return false;
        }
        r45.lu3 lu3Var = (r45.lu3) fVar;
        return n51.f.a(this.BaseRequest, lu3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f379838d), java.lang.Integer.valueOf(lu3Var.f379838d)) && n51.f.a(this.f379839e, lu3Var.f379839e) && n51.f.a(this.f379840f, lu3Var.f379840f) && n51.f.a(this.f379841g, lu3Var.f379841g) && n51.f.a(this.f379842h, lu3Var.f379842h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f379838d);
            java.lang.String str = this.f379839e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cu5 cu5Var = this.f379840f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f379840f.writeFields(fVar);
            }
            java.lang.String str2 = this.f379841g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.ye5 ye5Var = this.f379842h;
            if (ye5Var != null) {
                fVar.i(6, ye5Var.computeSize());
                this.f379842h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f379838d);
            java.lang.String str3 = this.f379839e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.cu5 cu5Var2 = this.f379840f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.computeSize());
            }
            java.lang.String str4 = this.f379841g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            r45.ye5 ye5Var2 = this.f379842h;
            return ye5Var2 != null ? i18 + b36.f.i(6, ye5Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.lu3 lu3Var = (r45.lu3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    lu3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                lu3Var.f379838d = aVar2.g(intValue);
                return 0;
            case 3:
                lu3Var.f379839e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    lu3Var.f379840f = cu5Var3;
                }
                return 0;
            case 5:
                lu3Var.f379841g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ye5 ye5Var3 = new r45.ye5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ye5Var3.parseFrom(bArr3);
                    }
                    lu3Var.f379842h = ye5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
