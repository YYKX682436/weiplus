package r45;

/* loaded from: classes9.dex */
public class v20 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387819d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387820e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387821f;

    /* renamed from: g, reason: collision with root package name */
    public r45.r65 f387822g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387823h;

    /* renamed from: i, reason: collision with root package name */
    public r45.co6 f387824i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v20)) {
            return false;
        }
        r45.v20 v20Var = (r45.v20) fVar;
        return n51.f.a(this.BaseResponse, v20Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387819d), java.lang.Integer.valueOf(v20Var.f387819d)) && n51.f.a(this.f387820e, v20Var.f387820e) && n51.f.a(this.f387821f, v20Var.f387821f) && n51.f.a(this.f387822g, v20Var.f387822g) && n51.f.a(this.f387823h, v20Var.f387823h) && n51.f.a(this.f387824i, v20Var.f387824i);
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
            fVar.e(2, this.f387819d);
            java.lang.String str = this.f387820e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387821f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.r65 r65Var = this.f387822g;
            if (r65Var != null) {
                fVar.i(5, r65Var.computeSize());
                this.f387822g.writeFields(fVar);
            }
            java.lang.String str3 = this.f387823h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            r45.co6 co6Var = this.f387824i;
            if (co6Var != null) {
                fVar.i(7, co6Var.computeSize());
                this.f387824i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387819d);
            java.lang.String str4 = this.f387820e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f387821f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            r45.r65 r65Var2 = this.f387822g;
            if (r65Var2 != null) {
                i18 += b36.f.i(5, r65Var2.computeSize());
            }
            java.lang.String str6 = this.f387823h;
            if (str6 != null) {
                i18 += b36.f.j(6, str6);
            }
            r45.co6 co6Var2 = this.f387824i;
            return co6Var2 != null ? i18 + b36.f.i(7, co6Var2.computeSize()) : i18;
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
        r45.v20 v20Var = (r45.v20) objArr[1];
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
                    v20Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                v20Var.f387819d = aVar2.g(intValue);
                return 0;
            case 3:
                v20Var.f387820e = aVar2.k(intValue);
                return 0;
            case 4:
                v20Var.f387821f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r65 r65Var3 = new r45.r65();
                    if (bArr2 != null && bArr2.length > 0) {
                        r65Var3.parseFrom(bArr2);
                    }
                    v20Var.f387822g = r65Var3;
                }
                return 0;
            case 6:
                v20Var.f387823h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.co6 co6Var3 = new r45.co6();
                    if (bArr3 != null && bArr3.length > 0) {
                        co6Var3.parseFrom(bArr3);
                    }
                    v20Var.f387824i = co6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
