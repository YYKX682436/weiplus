package r45;

/* loaded from: classes9.dex */
public class w73 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388928d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388929e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388930f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388931g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388932h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388933i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388934m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388935n;

    /* renamed from: o, reason: collision with root package name */
    public int f388936o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f388937p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388938q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f388939r;

    /* renamed from: s, reason: collision with root package name */
    public r45.r1 f388940s;

    /* renamed from: t, reason: collision with root package name */
    public int f388941t;

    /* renamed from: u, reason: collision with root package name */
    public int f388942u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f388943v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w73)) {
            return false;
        }
        r45.w73 w73Var = (r45.w73) fVar;
        return n51.f.a(this.BaseRequest, w73Var.BaseRequest) && n51.f.a(this.f388928d, w73Var.f388928d) && n51.f.a(this.f388929e, w73Var.f388929e) && n51.f.a(this.f388930f, w73Var.f388930f) && n51.f.a(this.f388931g, w73Var.f388931g) && n51.f.a(this.f388932h, w73Var.f388932h) && n51.f.a(this.f388933i, w73Var.f388933i) && n51.f.a(this.f388934m, w73Var.f388934m) && n51.f.a(this.f388935n, w73Var.f388935n) && n51.f.a(java.lang.Integer.valueOf(this.f388936o), java.lang.Integer.valueOf(w73Var.f388936o)) && n51.f.a(this.f388937p, w73Var.f388937p) && n51.f.a(this.f388938q, w73Var.f388938q) && n51.f.a(this.f388939r, w73Var.f388939r) && n51.f.a(this.f388940s, w73Var.f388940s) && n51.f.a(java.lang.Integer.valueOf(this.f388941t), java.lang.Integer.valueOf(w73Var.f388941t)) && n51.f.a(java.lang.Integer.valueOf(this.f388942u), java.lang.Integer.valueOf(w73Var.f388942u)) && n51.f.a(this.f388943v, w73Var.f388943v);
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
            java.lang.String str = this.f388928d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f388929e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f388930f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f388931g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f388932h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f388933i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f388934m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f388935n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f388936o);
            java.lang.String str9 = this.f388937p;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f388938q;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f388939r;
            if (str11 != null) {
                fVar.j(13, str11);
            }
            r45.r1 r1Var = this.f388940s;
            if (r1Var != null) {
                fVar.i(14, r1Var.computeSize());
                this.f388940s.writeFields(fVar);
            }
            fVar.e(15, this.f388941t);
            fVar.e(16, this.f388942u);
            java.lang.String str12 = this.f388943v;
            if (str12 != null) {
                fVar.j(17, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str13 = this.f388928d;
            if (str13 != null) {
                i18 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f388929e;
            if (str14 != null) {
                i18 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f388930f;
            if (str15 != null) {
                i18 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f388931g;
            if (str16 != null) {
                i18 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f388932h;
            if (str17 != null) {
                i18 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f388933i;
            if (str18 != null) {
                i18 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f388934m;
            if (str19 != null) {
                i18 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f388935n;
            if (str20 != null) {
                i18 += b36.f.j(9, str20);
            }
            int e17 = i18 + b36.f.e(10, this.f388936o);
            java.lang.String str21 = this.f388937p;
            if (str21 != null) {
                e17 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f388938q;
            if (str22 != null) {
                e17 += b36.f.j(12, str22);
            }
            java.lang.String str23 = this.f388939r;
            if (str23 != null) {
                e17 += b36.f.j(13, str23);
            }
            r45.r1 r1Var2 = this.f388940s;
            if (r1Var2 != null) {
                e17 += b36.f.i(14, r1Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(15, this.f388941t) + b36.f.e(16, this.f388942u);
            java.lang.String str24 = this.f388943v;
            return str24 != null ? e18 + b36.f.j(17, str24) : e18;
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
        r45.w73 w73Var = (r45.w73) objArr[1];
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
                    w73Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                w73Var.f388928d = aVar2.k(intValue);
                return 0;
            case 3:
                w73Var.f388929e = aVar2.k(intValue);
                return 0;
            case 4:
                w73Var.f388930f = aVar2.k(intValue);
                return 0;
            case 5:
                w73Var.f388931g = aVar2.k(intValue);
                return 0;
            case 6:
                w73Var.f388932h = aVar2.k(intValue);
                return 0;
            case 7:
                w73Var.f388933i = aVar2.k(intValue);
                return 0;
            case 8:
                w73Var.f388934m = aVar2.k(intValue);
                return 0;
            case 9:
                w73Var.f388935n = aVar2.k(intValue);
                return 0;
            case 10:
                w73Var.f388936o = aVar2.g(intValue);
                return 0;
            case 11:
                w73Var.f388937p = aVar2.k(intValue);
                return 0;
            case 12:
                w73Var.f388938q = aVar2.k(intValue);
                return 0;
            case 13:
                w73Var.f388939r = aVar2.k(intValue);
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr2 != null && bArr2.length > 0) {
                        r1Var3.parseFrom(bArr2);
                    }
                    w73Var.f388940s = r1Var3;
                }
                return 0;
            case 15:
                w73Var.f388941t = aVar2.g(intValue);
                return 0;
            case 16:
                w73Var.f388942u = aVar2.g(intValue);
                return 0;
            case 17:
                w73Var.f388943v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
