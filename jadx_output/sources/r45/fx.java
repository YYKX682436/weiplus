package r45;

/* loaded from: classes9.dex */
public class fx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374665d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374666e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374667f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374668g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374669h;

    /* renamed from: i, reason: collision with root package name */
    public int f374670i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374671m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374672n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f374673o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fx)) {
            return false;
        }
        r45.fx fxVar = (r45.fx) fVar;
        return n51.f.a(this.BaseResponse, fxVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f374665d), java.lang.Integer.valueOf(fxVar.f374665d)) && n51.f.a(this.f374666e, fxVar.f374666e) && n51.f.a(this.f374667f, fxVar.f374667f) && n51.f.a(this.f374668g, fxVar.f374668g) && n51.f.a(this.f374669h, fxVar.f374669h) && n51.f.a(java.lang.Integer.valueOf(this.f374670i), java.lang.Integer.valueOf(fxVar.f374670i)) && n51.f.a(this.f374671m, fxVar.f374671m) && n51.f.a(this.f374672n, fxVar.f374672n) && n51.f.a(this.f374673o, fxVar.f374673o);
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
            fVar.e(2, this.f374665d);
            java.lang.String str = this.f374666e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f374667f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f374668g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f374669h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f374670i);
            java.lang.String str5 = this.f374671m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f374672n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f374673o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f374665d);
            java.lang.String str8 = this.f374666e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f374667f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f374668g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f374669h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            int e17 = i18 + b36.f.e(7, this.f374670i);
            java.lang.String str12 = this.f374671m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f374672n;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f374673o;
            return str14 != null ? e17 + b36.f.j(10, str14) : e17;
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
        r45.fx fxVar = (r45.fx) objArr[1];
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
                    fxVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                fxVar.f374665d = aVar2.g(intValue);
                return 0;
            case 3:
                fxVar.f374666e = aVar2.k(intValue);
                return 0;
            case 4:
                fxVar.f374667f = aVar2.k(intValue);
                return 0;
            case 5:
                fxVar.f374668g = aVar2.k(intValue);
                return 0;
            case 6:
                fxVar.f374669h = aVar2.k(intValue);
                return 0;
            case 7:
                fxVar.f374670i = aVar2.g(intValue);
                return 0;
            case 8:
                fxVar.f374671m = aVar2.k(intValue);
                return 0;
            case 9:
                fxVar.f374672n = aVar2.k(intValue);
                return 0;
            case 10:
                fxVar.f374673o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
