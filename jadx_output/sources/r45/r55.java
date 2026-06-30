package r45;

/* loaded from: classes9.dex */
public class r55 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384552d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384553e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384554f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384555g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384556h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384557i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384558m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384559n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f384560o;

    /* renamed from: p, reason: collision with root package name */
    public r45.r1 f384561p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f384562q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384563r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f384564s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f384565t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r55)) {
            return false;
        }
        r45.r55 r55Var = (r45.r55) fVar;
        return n51.f.a(this.BaseRequest, r55Var.BaseRequest) && n51.f.a(this.f384552d, r55Var.f384552d) && n51.f.a(this.f384553e, r55Var.f384553e) && n51.f.a(this.f384554f, r55Var.f384554f) && n51.f.a(this.f384555g, r55Var.f384555g) && n51.f.a(this.f384556h, r55Var.f384556h) && n51.f.a(this.f384557i, r55Var.f384557i) && n51.f.a(this.f384558m, r55Var.f384558m) && n51.f.a(this.f384559n, r55Var.f384559n) && n51.f.a(this.f384560o, r55Var.f384560o) && n51.f.a(this.f384561p, r55Var.f384561p) && n51.f.a(this.f384562q, r55Var.f384562q) && n51.f.a(this.f384563r, r55Var.f384563r) && n51.f.a(this.f384564s, r55Var.f384564s) && n51.f.a(this.f384565t, r55Var.f384565t);
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
            java.lang.String str = this.f384552d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384553e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f384554f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f384555g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f384556h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f384557i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f384558m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f384559n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f384560o;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            r45.r1 r1Var = this.f384561p;
            if (r1Var != null) {
                fVar.i(11, r1Var.computeSize());
                this.f384561p.writeFields(fVar);
            }
            java.lang.String str10 = this.f384562q;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f384563r;
            if (str11 != null) {
                fVar.j(13, str11);
            }
            java.lang.String str12 = this.f384564s;
            if (str12 != null) {
                fVar.j(14, str12);
            }
            java.lang.String str13 = this.f384565t;
            if (str13 != null) {
                fVar.j(15, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str14 = this.f384552d;
            if (str14 != null) {
                i18 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f384553e;
            if (str15 != null) {
                i18 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f384554f;
            if (str16 != null) {
                i18 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f384555g;
            if (str17 != null) {
                i18 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f384556h;
            if (str18 != null) {
                i18 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f384557i;
            if (str19 != null) {
                i18 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f384558m;
            if (str20 != null) {
                i18 += b36.f.j(8, str20);
            }
            java.lang.String str21 = this.f384559n;
            if (str21 != null) {
                i18 += b36.f.j(9, str21);
            }
            java.lang.String str22 = this.f384560o;
            if (str22 != null) {
                i18 += b36.f.j(10, str22);
            }
            r45.r1 r1Var2 = this.f384561p;
            if (r1Var2 != null) {
                i18 += b36.f.i(11, r1Var2.computeSize());
            }
            java.lang.String str23 = this.f384562q;
            if (str23 != null) {
                i18 += b36.f.j(12, str23);
            }
            java.lang.String str24 = this.f384563r;
            if (str24 != null) {
                i18 += b36.f.j(13, str24);
            }
            java.lang.String str25 = this.f384564s;
            if (str25 != null) {
                i18 += b36.f.j(14, str25);
            }
            java.lang.String str26 = this.f384565t;
            return str26 != null ? i18 + b36.f.j(15, str26) : i18;
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
        r45.r55 r55Var = (r45.r55) objArr[1];
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
                    r55Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                r55Var.f384552d = aVar2.k(intValue);
                return 0;
            case 3:
                r55Var.f384553e = aVar2.k(intValue);
                return 0;
            case 4:
                r55Var.f384554f = aVar2.k(intValue);
                return 0;
            case 5:
                r55Var.f384555g = aVar2.k(intValue);
                return 0;
            case 6:
                r55Var.f384556h = aVar2.k(intValue);
                return 0;
            case 7:
                r55Var.f384557i = aVar2.k(intValue);
                return 0;
            case 8:
                r55Var.f384558m = aVar2.k(intValue);
                return 0;
            case 9:
                r55Var.f384559n = aVar2.k(intValue);
                return 0;
            case 10:
                r55Var.f384560o = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr2 != null && bArr2.length > 0) {
                        r1Var3.parseFrom(bArr2);
                    }
                    r55Var.f384561p = r1Var3;
                }
                return 0;
            case 12:
                r55Var.f384562q = aVar2.k(intValue);
                return 0;
            case 13:
                r55Var.f384563r = aVar2.k(intValue);
                return 0;
            case 14:
                r55Var.f384564s = aVar2.k(intValue);
                return 0;
            case 15:
                r55Var.f384565t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
