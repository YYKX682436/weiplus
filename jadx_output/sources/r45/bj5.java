package r45;

/* loaded from: classes8.dex */
public class bj5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yi5 f370807d;

    /* renamed from: e, reason: collision with root package name */
    public int f370808e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370809f;

    /* renamed from: g, reason: collision with root package name */
    public int f370810g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370811h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bj5)) {
            return false;
        }
        r45.bj5 bj5Var = (r45.bj5) fVar;
        return n51.f.a(this.f370807d, bj5Var.f370807d) && n51.f.a(java.lang.Integer.valueOf(this.f370808e), java.lang.Integer.valueOf(bj5Var.f370808e)) && n51.f.a(this.BaseResponse, bj5Var.BaseResponse) && n51.f.a(this.f370809f, bj5Var.f370809f) && n51.f.a(java.lang.Integer.valueOf(this.f370810g), java.lang.Integer.valueOf(bj5Var.f370810g)) && n51.f.a(this.f370811h, bj5Var.f370811h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.yi5 yi5Var = this.f370807d;
            if (yi5Var != null) {
                fVar.i(1, yi5Var.computeSize());
                this.f370807d.writeFields(fVar);
            }
            fVar.e(2, this.f370808e);
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(3, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f370809f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f370810g);
            java.lang.String str2 = this.f370811h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.yi5 yi5Var2 = this.f370807d;
            int i18 = (yi5Var2 != null ? 0 + b36.f.i(1, yi5Var2.computeSize()) : 0) + b36.f.e(2, this.f370808e);
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null) {
                i18 += b36.f.i(3, ieVar2.computeSize());
            }
            java.lang.String str3 = this.f370809f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f370810g);
            java.lang.String str4 = this.f370811h;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
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
        r45.bj5 bj5Var = (r45.bj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.yi5 yi5Var3 = new r45.yi5();
                    if (bArr != null && bArr.length > 0) {
                        yi5Var3.parseFrom(bArr);
                    }
                    bj5Var.f370807d = yi5Var3;
                }
                return 0;
            case 2:
                bj5Var.f370808e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    bj5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 4:
                bj5Var.f370809f = aVar2.k(intValue);
                return 0;
            case 5:
                bj5Var.f370810g = aVar2.g(intValue);
                return 0;
            case 6:
                bj5Var.f370811h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
