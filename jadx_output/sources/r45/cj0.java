package r45;

/* loaded from: classes12.dex */
public class cj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371580d;

    /* renamed from: e, reason: collision with root package name */
    public int f371581e;

    /* renamed from: f, reason: collision with root package name */
    public int f371582f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f371583g;

    /* renamed from: h, reason: collision with root package name */
    public int f371584h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371585i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371586m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371587n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371588o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f371589p;

    /* renamed from: q, reason: collision with root package name */
    public int f371590q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371591r;

    /* renamed from: s, reason: collision with root package name */
    public int f371592s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f371593t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cj0)) {
            return false;
        }
        r45.cj0 cj0Var = (r45.cj0) fVar;
        return n51.f.a(this.f371580d, cj0Var.f371580d) && n51.f.a(java.lang.Integer.valueOf(this.f371581e), java.lang.Integer.valueOf(cj0Var.f371581e)) && n51.f.a(java.lang.Integer.valueOf(this.f371582f), java.lang.Integer.valueOf(cj0Var.f371582f)) && n51.f.a(this.f371583g, cj0Var.f371583g) && n51.f.a(java.lang.Integer.valueOf(this.f371584h), java.lang.Integer.valueOf(cj0Var.f371584h)) && n51.f.a(this.f371585i, cj0Var.f371585i) && n51.f.a(this.f371586m, cj0Var.f371586m) && n51.f.a(this.f371587n, cj0Var.f371587n) && n51.f.a(this.f371588o, cj0Var.f371588o) && n51.f.a(this.f371589p, cj0Var.f371589p) && n51.f.a(java.lang.Integer.valueOf(this.f371590q), java.lang.Integer.valueOf(cj0Var.f371590q)) && n51.f.a(this.f371591r, cj0Var.f371591r) && n51.f.a(java.lang.Integer.valueOf(this.f371592s), java.lang.Integer.valueOf(cj0Var.f371592s)) && n51.f.a(this.f371593t, cj0Var.f371593t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371580d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f371581e);
            fVar.e(3, this.f371582f);
            r45.cu5 cu5Var = this.f371583g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f371583g.writeFields(fVar);
            }
            fVar.e(5, this.f371584h);
            java.lang.String str2 = this.f371585i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f371586m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f371587n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f371588o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f371589p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.e(11, this.f371590q);
            java.lang.String str7 = this.f371591r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.e(14, this.f371592s);
            java.lang.String str8 = this.f371593t;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f371580d;
            int j17 = (str9 != null ? b36.f.j(1, str9) + 0 : 0) + b36.f.e(2, this.f371581e) + b36.f.e(3, this.f371582f);
            r45.cu5 cu5Var2 = this.f371583g;
            if (cu5Var2 != null) {
                j17 += b36.f.i(4, cu5Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(5, this.f371584h);
            java.lang.String str10 = this.f371585i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f371586m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f371587n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f371588o;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f371589p;
            if (str14 != null) {
                e17 += b36.f.j(10, str14);
            }
            int e18 = e17 + b36.f.e(11, this.f371590q);
            java.lang.String str15 = this.f371591r;
            if (str15 != null) {
                e18 += b36.f.j(12, str15);
            }
            int e19 = e18 + b36.f.e(14, this.f371592s);
            java.lang.String str16 = this.f371593t;
            return str16 != null ? e19 + b36.f.j(16, str16) : e19;
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
        r45.cj0 cj0Var = (r45.cj0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cj0Var.f371580d = aVar2.k(intValue);
                return 0;
            case 2:
                cj0Var.f371581e = aVar2.g(intValue);
                return 0;
            case 3:
                cj0Var.f371582f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    cj0Var.f371583g = cu5Var3;
                }
                return 0;
            case 5:
                cj0Var.f371584h = aVar2.g(intValue);
                return 0;
            case 6:
                cj0Var.f371585i = aVar2.k(intValue);
                return 0;
            case 7:
                cj0Var.f371586m = aVar2.k(intValue);
                return 0;
            case 8:
                cj0Var.f371587n = aVar2.k(intValue);
                return 0;
            case 9:
                cj0Var.f371588o = aVar2.k(intValue);
                return 0;
            case 10:
                cj0Var.f371589p = aVar2.k(intValue);
                return 0;
            case 11:
                cj0Var.f371590q = aVar2.g(intValue);
                return 0;
            case 12:
                cj0Var.f371591r = aVar2.k(intValue);
                return 0;
            case 13:
            case 15:
            default:
                return -1;
            case 14:
                cj0Var.f371592s = aVar2.g(intValue);
                return 0;
            case 16:
                cj0Var.f371593t = aVar2.k(intValue);
                return 0;
        }
    }
}
