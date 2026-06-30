package r45;

/* loaded from: classes7.dex */
public class xc7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389982d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389983e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389984f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389985g;

    /* renamed from: h, reason: collision with root package name */
    public int f389986h;

    /* renamed from: i, reason: collision with root package name */
    public r45.y50 f389987i;

    /* renamed from: m, reason: collision with root package name */
    public r45.fd7 f389988m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f389989n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389990o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f389991p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389992q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xc7)) {
            return false;
        }
        r45.xc7 xc7Var = (r45.xc7) fVar;
        return n51.f.a(this.BaseRequest, xc7Var.BaseRequest) && n51.f.a(this.f389982d, xc7Var.f389982d) && n51.f.a(this.f389983e, xc7Var.f389983e) && n51.f.a(this.f389984f, xc7Var.f389984f) && n51.f.a(this.f389985g, xc7Var.f389985g) && n51.f.a(java.lang.Integer.valueOf(this.f389986h), java.lang.Integer.valueOf(xc7Var.f389986h)) && n51.f.a(this.f389987i, xc7Var.f389987i) && n51.f.a(this.f389988m, xc7Var.f389988m) && n51.f.a(this.f389989n, xc7Var.f389989n) && n51.f.a(this.f389990o, xc7Var.f389990o) && n51.f.a(this.f389991p, xc7Var.f389991p) && n51.f.a(this.f389992q, xc7Var.f389992q);
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
            java.lang.String str = this.f389982d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f389983e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f389984f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f389985g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f389986h);
            r45.y50 y50Var = this.f389987i;
            if (y50Var != null) {
                fVar.i(7, y50Var.computeSize());
                this.f389987i.writeFields(fVar);
            }
            r45.fd7 fd7Var = this.f389988m;
            if (fd7Var != null) {
                fVar.i(8, fd7Var.computeSize());
                this.f389988m.writeFields(fVar);
            }
            java.lang.String str4 = this.f389989n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f389990o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f389991p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f389992q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str8 = this.f389982d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f389983e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str9 = this.f389984f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f389985g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            int e17 = i18 + b36.f.e(6, this.f389986h);
            r45.y50 y50Var2 = this.f389987i;
            if (y50Var2 != null) {
                e17 += b36.f.i(7, y50Var2.computeSize());
            }
            r45.fd7 fd7Var2 = this.f389988m;
            if (fd7Var2 != null) {
                e17 += b36.f.i(8, fd7Var2.computeSize());
            }
            java.lang.String str11 = this.f389989n;
            if (str11 != null) {
                e17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f389990o;
            if (str12 != null) {
                e17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f389991p;
            if (str13 != null) {
                e17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f389992q;
            return str14 != null ? e17 + b36.f.j(12, str14) : e17;
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
        r45.xc7 xc7Var = (r45.xc7) objArr[1];
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
                    xc7Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                xc7Var.f389982d = aVar2.k(intValue);
                return 0;
            case 3:
                xc7Var.f389983e = aVar2.d(intValue);
                return 0;
            case 4:
                xc7Var.f389984f = aVar2.k(intValue);
                return 0;
            case 5:
                xc7Var.f389985g = aVar2.k(intValue);
                return 0;
            case 6:
                xc7Var.f389986h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.y50 y50Var3 = new r45.y50();
                    if (bArr2 != null && bArr2.length > 0) {
                        y50Var3.parseFrom(bArr2);
                    }
                    xc7Var.f389987i = y50Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.fd7 fd7Var3 = new r45.fd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        fd7Var3.parseFrom(bArr3);
                    }
                    xc7Var.f389988m = fd7Var3;
                }
                return 0;
            case 9:
                xc7Var.f389989n = aVar2.k(intValue);
                return 0;
            case 10:
                xc7Var.f389990o = aVar2.k(intValue);
                return 0;
            case 11:
                xc7Var.f389991p = aVar2.k(intValue);
                return 0;
            case 12:
                xc7Var.f389992q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
