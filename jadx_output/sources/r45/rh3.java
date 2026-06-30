package r45;

/* loaded from: classes9.dex */
public class rh3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384864d;

    /* renamed from: e, reason: collision with root package name */
    public int f384865e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384866f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384867g;

    /* renamed from: h, reason: collision with root package name */
    public int f384868h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384869i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384870m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rh3)) {
            return false;
        }
        r45.rh3 rh3Var = (r45.rh3) fVar;
        return n51.f.a(this.BaseResponse, rh3Var.BaseResponse) && n51.f.a(this.f384864d, rh3Var.f384864d) && n51.f.a(java.lang.Integer.valueOf(this.f384865e), java.lang.Integer.valueOf(rh3Var.f384865e)) && n51.f.a(this.f384866f, rh3Var.f384866f) && n51.f.a(this.f384867g, rh3Var.f384867g) && n51.f.a(java.lang.Integer.valueOf(this.f384868h), java.lang.Integer.valueOf(rh3Var.f384868h)) && n51.f.a(this.f384869i, rh3Var.f384869i) && n51.f.a(this.f384870m, rh3Var.f384870m);
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
            java.lang.String str = this.f384864d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f384865e);
            java.lang.String str2 = this.f384866f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f384867g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f384868h);
            java.lang.String str4 = this.f384869i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f384870m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str6 = this.f384864d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            int e17 = i18 + b36.f.e(3, this.f384865e);
            java.lang.String str7 = this.f384866f;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f384867g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            int e18 = e17 + b36.f.e(6, this.f384868h);
            java.lang.String str9 = this.f384869i;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f384870m;
            return str10 != null ? e18 + b36.f.j(8, str10) : e18;
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
        r45.rh3 rh3Var = (r45.rh3) objArr[1];
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
                    rh3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                rh3Var.f384864d = aVar2.k(intValue);
                return 0;
            case 3:
                rh3Var.f384865e = aVar2.g(intValue);
                return 0;
            case 4:
                rh3Var.f384866f = aVar2.k(intValue);
                return 0;
            case 5:
                rh3Var.f384867g = aVar2.k(intValue);
                return 0;
            case 6:
                rh3Var.f384868h = aVar2.g(intValue);
                return 0;
            case 7:
                rh3Var.f384869i = aVar2.k(intValue);
                return 0;
            case 8:
                rh3Var.f384870m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
