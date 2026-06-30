package f21;

/* loaded from: classes4.dex */
public class d0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f258852d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f258853e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f258854f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f258855g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f258856h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f258857i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f258858m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f258859n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f258860o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f258861p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f258862q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f258863r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f258864s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f258865t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f258866u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f258867v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f258868w;

    /* renamed from: x, reason: collision with root package name */
    public f21.e0 f258869x;

    /* renamed from: y, reason: collision with root package name */
    public int f258870y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof f21.d0)) {
            return false;
        }
        f21.d0 d0Var = (f21.d0) fVar;
        return n51.f.a(this.f258852d, d0Var.f258852d) && n51.f.a(this.f258853e, d0Var.f258853e) && n51.f.a(this.f258854f, d0Var.f258854f) && n51.f.a(this.f258855g, d0Var.f258855g) && n51.f.a(this.f258856h, d0Var.f258856h) && n51.f.a(this.f258857i, d0Var.f258857i) && n51.f.a(this.f258858m, d0Var.f258858m) && n51.f.a(this.f258859n, d0Var.f258859n) && n51.f.a(this.f258860o, d0Var.f258860o) && n51.f.a(this.f258861p, d0Var.f258861p) && n51.f.a(this.f258862q, d0Var.f258862q) && n51.f.a(this.f258863r, d0Var.f258863r) && n51.f.a(this.f258864s, d0Var.f258864s) && n51.f.a(this.f258865t, d0Var.f258865t) && n51.f.a(this.f258866u, d0Var.f258866u) && n51.f.a(this.f258867v, d0Var.f258867v) && n51.f.a(this.f258868w, d0Var.f258868w) && n51.f.a(this.f258869x, d0Var.f258869x) && n51.f.a(java.lang.Integer.valueOf(this.f258870y), java.lang.Integer.valueOf(d0Var.f258870y));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f258852d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f258853e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f258854f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f258855g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f258856h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f258857i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f258858m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f258859n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f258860o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f258861p;
            if (str10 != null) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.f258862q;
            if (str11 != null) {
                fVar.j(11, str11);
            }
            java.lang.String str12 = this.f258863r;
            if (str12 != null) {
                fVar.j(12, str12);
            }
            java.lang.String str13 = this.f258864s;
            if (str13 != null) {
                fVar.j(13, str13);
            }
            java.lang.String str14 = this.f258865t;
            if (str14 != null) {
                fVar.j(14, str14);
            }
            java.lang.String str15 = this.f258866u;
            if (str15 != null) {
                fVar.j(16, str15);
            }
            java.lang.String str16 = this.f258867v;
            if (str16 != null) {
                fVar.j(17, str16);
            }
            java.lang.String str17 = this.f258868w;
            if (str17 != null) {
                fVar.j(18, str17);
            }
            f21.e0 e0Var = this.f258869x;
            if (e0Var != null) {
                fVar.i(19, e0Var.computeSize());
                this.f258869x.writeFields(fVar);
            }
            fVar.e(20, this.f258870y);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str18 = this.f258852d;
            int j17 = str18 != null ? b36.f.j(1, str18) + 0 : 0;
            java.lang.String str19 = this.f258853e;
            if (str19 != null) {
                j17 += b36.f.j(2, str19);
            }
            java.lang.String str20 = this.f258854f;
            if (str20 != null) {
                j17 += b36.f.j(3, str20);
            }
            java.lang.String str21 = this.f258855g;
            if (str21 != null) {
                j17 += b36.f.j(4, str21);
            }
            java.lang.String str22 = this.f258856h;
            if (str22 != null) {
                j17 += b36.f.j(5, str22);
            }
            java.lang.String str23 = this.f258857i;
            if (str23 != null) {
                j17 += b36.f.j(6, str23);
            }
            java.lang.String str24 = this.f258858m;
            if (str24 != null) {
                j17 += b36.f.j(7, str24);
            }
            java.lang.String str25 = this.f258859n;
            if (str25 != null) {
                j17 += b36.f.j(8, str25);
            }
            java.lang.String str26 = this.f258860o;
            if (str26 != null) {
                j17 += b36.f.j(9, str26);
            }
            java.lang.String str27 = this.f258861p;
            if (str27 != null) {
                j17 += b36.f.j(10, str27);
            }
            java.lang.String str28 = this.f258862q;
            if (str28 != null) {
                j17 += b36.f.j(11, str28);
            }
            java.lang.String str29 = this.f258863r;
            if (str29 != null) {
                j17 += b36.f.j(12, str29);
            }
            java.lang.String str30 = this.f258864s;
            if (str30 != null) {
                j17 += b36.f.j(13, str30);
            }
            java.lang.String str31 = this.f258865t;
            if (str31 != null) {
                j17 += b36.f.j(14, str31);
            }
            java.lang.String str32 = this.f258866u;
            if (str32 != null) {
                j17 += b36.f.j(16, str32);
            }
            java.lang.String str33 = this.f258867v;
            if (str33 != null) {
                j17 += b36.f.j(17, str33);
            }
            java.lang.String str34 = this.f258868w;
            if (str34 != null) {
                j17 += b36.f.j(18, str34);
            }
            f21.e0 e0Var2 = this.f258869x;
            if (e0Var2 != null) {
                j17 += b36.f.i(19, e0Var2.computeSize());
            }
            return j17 + b36.f.e(20, this.f258870y);
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
        f21.d0 d0Var = (f21.d0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d0Var.f258852d = aVar2.k(intValue);
                return 0;
            case 2:
                d0Var.f258853e = aVar2.k(intValue);
                return 0;
            case 3:
                d0Var.f258854f = aVar2.k(intValue);
                return 0;
            case 4:
                d0Var.f258855g = aVar2.k(intValue);
                return 0;
            case 5:
                d0Var.f258856h = aVar2.k(intValue);
                return 0;
            case 6:
                d0Var.f258857i = aVar2.k(intValue);
                return 0;
            case 7:
                d0Var.f258858m = aVar2.k(intValue);
                return 0;
            case 8:
                d0Var.f258859n = aVar2.k(intValue);
                return 0;
            case 9:
                d0Var.f258860o = aVar2.k(intValue);
                return 0;
            case 10:
                d0Var.f258861p = aVar2.k(intValue);
                return 0;
            case 11:
                d0Var.f258862q = aVar2.k(intValue);
                return 0;
            case 12:
                d0Var.f258863r = aVar2.k(intValue);
                return 0;
            case 13:
                d0Var.f258864s = aVar2.k(intValue);
                return 0;
            case 14:
                d0Var.f258865t = aVar2.k(intValue);
                return 0;
            case 15:
            default:
                return -1;
            case 16:
                d0Var.f258866u = aVar2.k(intValue);
                return 0;
            case 17:
                d0Var.f258867v = aVar2.k(intValue);
                return 0;
            case 18:
                d0Var.f258868w = aVar2.k(intValue);
                return 0;
            case 19:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    f21.e0 e0Var3 = new f21.e0();
                    if (bArr != null && bArr.length > 0) {
                        e0Var3.parseFrom(bArr);
                    }
                    d0Var.f258869x = e0Var3;
                }
                return 0;
            case 20:
                d0Var.f258870y = aVar2.g(intValue);
                return 0;
        }
    }
}
