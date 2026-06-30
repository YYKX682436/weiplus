package r45;

/* loaded from: classes9.dex */
public class ex3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f373781d;

    /* renamed from: e, reason: collision with root package name */
    public int f373782e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373783f;

    /* renamed from: g, reason: collision with root package name */
    public int f373784g;

    /* renamed from: h, reason: collision with root package name */
    public int f373785h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373786i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ex3)) {
            return false;
        }
        r45.ex3 ex3Var = (r45.ex3) fVar;
        return n51.f.a(this.BaseResponse, ex3Var.BaseResponse) && n51.f.a(this.f373781d, ex3Var.f373781d) && n51.f.a(java.lang.Integer.valueOf(this.f373782e), java.lang.Integer.valueOf(ex3Var.f373782e)) && n51.f.a(this.f373783f, ex3Var.f373783f) && n51.f.a(java.lang.Integer.valueOf(this.f373784g), java.lang.Integer.valueOf(ex3Var.f373784g)) && n51.f.a(java.lang.Integer.valueOf(this.f373785h), java.lang.Integer.valueOf(ex3Var.f373785h)) && n51.f.a(this.f373786i, ex3Var.f373786i);
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
            r45.cu5 cu5Var = this.f373781d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f373781d.writeFields(fVar);
            }
            fVar.e(3, this.f373782e);
            java.lang.String str = this.f373783f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f373784g);
            fVar.e(6, this.f373785h);
            java.lang.String str2 = this.f373786i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f373781d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f373782e);
            java.lang.String str3 = this.f373783f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int e18 = e17 + b36.f.e(5, this.f373784g) + b36.f.e(6, this.f373785h);
            java.lang.String str4 = this.f373786i;
            return str4 != null ? e18 + b36.f.j(7, str4) : e18;
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
        r45.ex3 ex3Var = (r45.ex3) objArr[1];
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
                    ex3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    ex3Var.f373781d = cu5Var3;
                }
                return 0;
            case 3:
                ex3Var.f373782e = aVar2.g(intValue);
                return 0;
            case 4:
                ex3Var.f373783f = aVar2.k(intValue);
                return 0;
            case 5:
                ex3Var.f373784g = aVar2.g(intValue);
                return 0;
            case 6:
                ex3Var.f373785h = aVar2.g(intValue);
                return 0;
            case 7:
                ex3Var.f373786i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
