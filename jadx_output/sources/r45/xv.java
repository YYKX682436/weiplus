package r45;

/* loaded from: classes9.dex */
public class xv extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390465d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390466e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390467f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390468g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390469h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390470i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390471m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390472n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xv)) {
            return false;
        }
        r45.xv xvVar = (r45.xv) fVar;
        return n51.f.a(this.BaseResponse, xvVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f390465d), java.lang.Integer.valueOf(xvVar.f390465d)) && n51.f.a(this.f390466e, xvVar.f390466e) && n51.f.a(this.f390467f, xvVar.f390467f) && n51.f.a(this.f390468g, xvVar.f390468g) && n51.f.a(this.f390469h, xvVar.f390469h) && n51.f.a(this.f390470i, xvVar.f390470i) && n51.f.a(this.f390471m, xvVar.f390471m) && n51.f.a(this.f390472n, xvVar.f390472n);
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
            fVar.e(2, this.f390465d);
            java.lang.String str = this.f390466e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f390467f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f390468g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f390469h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f390470i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f390471m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f390472n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f390465d);
            java.lang.String str8 = this.f390466e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f390467f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f390468g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f390469h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f390470i;
            if (str12 != null) {
                i18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f390471m;
            if (str13 != null) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f390472n;
            return str14 != null ? i18 + b36.f.j(9, str14) : i18;
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
        r45.xv xvVar = (r45.xv) objArr[1];
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
                    xvVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                xvVar.f390465d = aVar2.g(intValue);
                return 0;
            case 3:
                xvVar.f390466e = aVar2.k(intValue);
                return 0;
            case 4:
                xvVar.f390467f = aVar2.k(intValue);
                return 0;
            case 5:
                xvVar.f390468g = aVar2.k(intValue);
                return 0;
            case 6:
                xvVar.f390469h = aVar2.k(intValue);
                return 0;
            case 7:
                xvVar.f390470i = aVar2.k(intValue);
                return 0;
            case 8:
                xvVar.f390471m = aVar2.k(intValue);
                return 0;
            case 9:
                xvVar.f390472n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
