package r45;

/* loaded from: classes8.dex */
public class an5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370142d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370143e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f370144f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f370145g;

    /* renamed from: h, reason: collision with root package name */
    public int f370146h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370147i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370148m;

    /* renamed from: n, reason: collision with root package name */
    public int f370149n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f370150o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f370151p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f370152q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f370153r;

    /* renamed from: s, reason: collision with root package name */
    public r45.ce4 f370154s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f370155t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.an5)) {
            return false;
        }
        r45.an5 an5Var = (r45.an5) fVar;
        return n51.f.a(this.BaseResponse, an5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370142d), java.lang.Integer.valueOf(an5Var.f370142d)) && n51.f.a(this.f370143e, an5Var.f370143e) && n51.f.a(java.lang.Boolean.valueOf(this.f370144f), java.lang.Boolean.valueOf(an5Var.f370144f)) && n51.f.a(java.lang.Boolean.valueOf(this.f370145g), java.lang.Boolean.valueOf(an5Var.f370145g)) && n51.f.a(java.lang.Integer.valueOf(this.f370146h), java.lang.Integer.valueOf(an5Var.f370146h)) && n51.f.a(this.f370147i, an5Var.f370147i) && n51.f.a(this.f370148m, an5Var.f370148m) && n51.f.a(java.lang.Integer.valueOf(this.f370149n), java.lang.Integer.valueOf(an5Var.f370149n)) && n51.f.a(this.f370150o, an5Var.f370150o) && n51.f.a(this.f370151p, an5Var.f370151p) && n51.f.a(this.f370152q, an5Var.f370152q) && n51.f.a(this.f370153r, an5Var.f370153r) && n51.f.a(this.f370154s, an5Var.f370154s) && n51.f.a(this.f370155t, an5Var.f370155t);
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
            fVar.e(2, this.f370142d);
            java.lang.String str = this.f370143e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f370144f);
            fVar.a(5, this.f370145g);
            fVar.e(6, this.f370146h);
            java.lang.String str2 = this.f370147i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f370148m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f370149n);
            java.lang.String str4 = this.f370150o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f370151p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f370152q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f370153r;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            r45.ce4 ce4Var = this.f370154s;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.computeSize());
                this.f370154s.writeFields(fVar);
            }
            java.lang.String str8 = this.f370155t;
            if (str8 != null) {
                fVar.j(100, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f370142d);
            java.lang.String str9 = this.f370143e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int a17 = i18 + b36.f.a(4, this.f370144f) + b36.f.a(5, this.f370145g) + b36.f.e(6, this.f370146h);
            java.lang.String str10 = this.f370147i;
            if (str10 != null) {
                a17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f370148m;
            if (str11 != null) {
                a17 += b36.f.j(8, str11);
            }
            int e17 = a17 + b36.f.e(9, this.f370149n);
            java.lang.String str12 = this.f370150o;
            if (str12 != null) {
                e17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f370151p;
            if (str13 != null) {
                e17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f370152q;
            if (str14 != null) {
                e17 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f370153r;
            if (str15 != null) {
                e17 += b36.f.j(13, str15);
            }
            r45.ce4 ce4Var2 = this.f370154s;
            if (ce4Var2 != null) {
                e17 += b36.f.i(99, ce4Var2.computeSize());
            }
            java.lang.String str16 = this.f370155t;
            return str16 != null ? e17 + b36.f.j(100, str16) : e17;
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
        r45.an5 an5Var = (r45.an5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 99) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ce4 ce4Var3 = new r45.ce4();
                if (bArr != null && bArr.length > 0) {
                    ce4Var3.parseFrom(bArr);
                }
                an5Var.f370154s = ce4Var3;
            }
            return 0;
        }
        if (intValue == 100) {
            an5Var.f370155t = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    an5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                an5Var.f370142d = aVar2.g(intValue);
                return 0;
            case 3:
                an5Var.f370143e = aVar2.k(intValue);
                return 0;
            case 4:
                an5Var.f370144f = aVar2.c(intValue);
                return 0;
            case 5:
                an5Var.f370145g = aVar2.c(intValue);
                return 0;
            case 6:
                an5Var.f370146h = aVar2.g(intValue);
                return 0;
            case 7:
                an5Var.f370147i = aVar2.k(intValue);
                return 0;
            case 8:
                an5Var.f370148m = aVar2.k(intValue);
                return 0;
            case 9:
                an5Var.f370149n = aVar2.g(intValue);
                return 0;
            case 10:
                an5Var.f370150o = aVar2.k(intValue);
                return 0;
            case 11:
                an5Var.f370151p = aVar2.k(intValue);
                return 0;
            case 12:
                an5Var.f370152q = aVar2.k(intValue);
                return 0;
            case 13:
                an5Var.f370153r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
