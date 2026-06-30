package r45;

/* loaded from: classes15.dex */
public class w50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388878d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388879e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388880f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388881g;

    /* renamed from: h, reason: collision with root package name */
    public long f388882h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388883i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388884m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388885n;

    /* renamed from: o, reason: collision with root package name */
    public r45.qt3 f388886o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f388887p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388888q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f388889r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f388890s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f388891t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f388892u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f388893v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f388894w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f388895x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w50)) {
            return false;
        }
        r45.w50 w50Var = (r45.w50) fVar;
        return n51.f.a(this.f388878d, w50Var.f388878d) && n51.f.a(this.f388879e, w50Var.f388879e) && n51.f.a(this.f388880f, w50Var.f388880f) && n51.f.a(this.f388881g, w50Var.f388881g) && n51.f.a(java.lang.Long.valueOf(this.f388882h), java.lang.Long.valueOf(w50Var.f388882h)) && n51.f.a(this.f388883i, w50Var.f388883i) && n51.f.a(this.f388884m, w50Var.f388884m) && n51.f.a(this.f388885n, w50Var.f388885n) && n51.f.a(this.f388886o, w50Var.f388886o) && n51.f.a(this.f388887p, w50Var.f388887p) && n51.f.a(this.f388888q, w50Var.f388888q) && n51.f.a(this.f388889r, w50Var.f388889r) && n51.f.a(this.f388890s, w50Var.f388890s) && n51.f.a(this.f388891t, w50Var.f388891t) && n51.f.a(this.f388892u, w50Var.f388892u) && n51.f.a(this.f388893v, w50Var.f388893v) && n51.f.a(this.f388894w, w50Var.f388894w) && n51.f.a(this.f388895x, w50Var.f388895x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388878d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388879e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f388880f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f388881g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.h(5, this.f388882h);
            java.lang.String str5 = this.f388883i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f388884m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f388885n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            r45.qt3 qt3Var = this.f388886o;
            if (qt3Var != null) {
                fVar.i(9, qt3Var.computeSize());
                this.f388886o.writeFields(fVar);
            }
            java.lang.String str8 = this.f388887p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f388888q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f388889r;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f388890s;
            if (str11 != null) {
                fVar.j(14, str11);
            }
            java.lang.String str12 = this.f388891t;
            if (str12 != null) {
                fVar.j(15, str12);
            }
            java.lang.String str13 = this.f388892u;
            if (str13 != null) {
                fVar.j(16, str13);
            }
            java.lang.String str14 = this.f388893v;
            if (str14 != null) {
                fVar.j(17, str14);
            }
            java.lang.String str15 = this.f388894w;
            if (str15 != null) {
                fVar.j(18, str15);
            }
            java.lang.String str16 = this.f388895x;
            if (str16 != null) {
                fVar.j(19, str16);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str17 = this.f388878d;
            int j17 = str17 != null ? b36.f.j(1, str17) + 0 : 0;
            java.lang.String str18 = this.f388879e;
            if (str18 != null) {
                j17 += b36.f.j(2, str18);
            }
            java.lang.String str19 = this.f388880f;
            if (str19 != null) {
                j17 += b36.f.j(3, str19);
            }
            java.lang.String str20 = this.f388881g;
            if (str20 != null) {
                j17 += b36.f.j(4, str20);
            }
            int h17 = j17 + b36.f.h(5, this.f388882h);
            java.lang.String str21 = this.f388883i;
            if (str21 != null) {
                h17 += b36.f.j(6, str21);
            }
            java.lang.String str22 = this.f388884m;
            if (str22 != null) {
                h17 += b36.f.j(7, str22);
            }
            java.lang.String str23 = this.f388885n;
            if (str23 != null) {
                h17 += b36.f.j(8, str23);
            }
            r45.qt3 qt3Var2 = this.f388886o;
            if (qt3Var2 != null) {
                h17 += b36.f.i(9, qt3Var2.computeSize());
            }
            java.lang.String str24 = this.f388887p;
            if (str24 != null) {
                h17 += b36.f.j(10, str24);
            }
            java.lang.String str25 = this.f388888q;
            if (str25 != null) {
                h17 += b36.f.j(11, str25);
            }
            java.lang.String str26 = this.f388889r;
            if (str26 != null) {
                h17 += b36.f.j(13, str26);
            }
            java.lang.String str27 = this.f388890s;
            if (str27 != null) {
                h17 += b36.f.j(14, str27);
            }
            java.lang.String str28 = this.f388891t;
            if (str28 != null) {
                h17 += b36.f.j(15, str28);
            }
            java.lang.String str29 = this.f388892u;
            if (str29 != null) {
                h17 += b36.f.j(16, str29);
            }
            java.lang.String str30 = this.f388893v;
            if (str30 != null) {
                h17 += b36.f.j(17, str30);
            }
            java.lang.String str31 = this.f388894w;
            if (str31 != null) {
                h17 += b36.f.j(18, str31);
            }
            java.lang.String str32 = this.f388895x;
            return str32 != null ? h17 + b36.f.j(19, str32) : h17;
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
        r45.w50 w50Var = (r45.w50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w50Var.f388878d = aVar2.k(intValue);
                return 0;
            case 2:
                w50Var.f388879e = aVar2.k(intValue);
                return 0;
            case 3:
                w50Var.f388880f = aVar2.k(intValue);
                return 0;
            case 4:
                w50Var.f388881g = aVar2.k(intValue);
                return 0;
            case 5:
                w50Var.f388882h = aVar2.i(intValue);
                return 0;
            case 6:
                w50Var.f388883i = aVar2.k(intValue);
                return 0;
            case 7:
                w50Var.f388884m = aVar2.k(intValue);
                return 0;
            case 8:
                w50Var.f388885n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.qt3 qt3Var3 = new r45.qt3();
                    if (bArr != null && bArr.length > 0) {
                        qt3Var3.parseFrom(bArr);
                    }
                    w50Var.f388886o = qt3Var3;
                }
                return 0;
            case 10:
                w50Var.f388887p = aVar2.k(intValue);
                return 0;
            case 11:
                w50Var.f388888q = aVar2.k(intValue);
                return 0;
            case 12:
            default:
                return -1;
            case 13:
                w50Var.f388889r = aVar2.k(intValue);
                return 0;
            case 14:
                w50Var.f388890s = aVar2.k(intValue);
                return 0;
            case 15:
                w50Var.f388891t = aVar2.k(intValue);
                return 0;
            case 16:
                w50Var.f388892u = aVar2.k(intValue);
                return 0;
            case 17:
                w50Var.f388893v = aVar2.k(intValue);
                return 0;
            case 18:
                w50Var.f388894w = aVar2.k(intValue);
                return 0;
            case 19:
                w50Var.f388895x = aVar2.k(intValue);
                return 0;
        }
    }
}
