package r45;

/* loaded from: classes9.dex */
public class bp6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370951d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370952e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lj5 f370953f;

    /* renamed from: g, reason: collision with root package name */
    public r45.po5 f370954g;

    /* renamed from: h, reason: collision with root package name */
    public int f370955h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370956i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bp6)) {
            return false;
        }
        r45.bp6 bp6Var = (r45.bp6) fVar;
        return n51.f.a(this.BaseResponse, bp6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370951d), java.lang.Integer.valueOf(bp6Var.f370951d)) && n51.f.a(this.f370952e, bp6Var.f370952e) && n51.f.a(this.f370953f, bp6Var.f370953f) && n51.f.a(this.f370954g, bp6Var.f370954g) && n51.f.a(java.lang.Integer.valueOf(this.f370955h), java.lang.Integer.valueOf(bp6Var.f370955h)) && n51.f.a(this.f370956i, bp6Var.f370956i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f370951d);
            java.lang.String str = this.f370952e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.lj5 lj5Var = this.f370953f;
            if (lj5Var != null) {
                fVar.i(4, lj5Var.computeSize());
                this.f370953f.writeFields(fVar);
            }
            r45.po5 po5Var = this.f370954g;
            if (po5Var != null) {
                fVar.i(5, po5Var.computeSize());
                this.f370954g.writeFields(fVar);
            }
            fVar.e(6, this.f370955h);
            java.lang.String str2 = this.f370956i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f370951d);
            java.lang.String str3 = this.f370952e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.lj5 lj5Var2 = this.f370953f;
            if (lj5Var2 != null) {
                i18 += b36.f.i(4, lj5Var2.computeSize());
            }
            r45.po5 po5Var2 = this.f370954g;
            if (po5Var2 != null) {
                i18 += b36.f.i(5, po5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(6, this.f370955h);
            java.lang.String str4 = this.f370956i;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        r45.bp6 bp6Var = (r45.bp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    bp6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                bp6Var.f370951d = aVar2.g(intValue);
                return 0;
            case 3:
                bp6Var.f370952e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.lj5 lj5Var3 = new r45.lj5();
                    if (bArr2 != null && bArr2.length > 0) {
                        lj5Var3.parseFrom(bArr2);
                    }
                    bp6Var.f370953f = lj5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.po5 po5Var3 = new r45.po5();
                    if (bArr3 != null && bArr3.length > 0) {
                        po5Var3.parseFrom(bArr3);
                    }
                    bp6Var.f370954g = po5Var3;
                }
                return 0;
            case 6:
                bp6Var.f370955h = aVar2.g(intValue);
                return 0;
            case 7:
                bp6Var.f370956i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
