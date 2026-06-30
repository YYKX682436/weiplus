package r45;

/* loaded from: classes7.dex */
public class mh4 extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;
    public java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public int f380508d;

    /* renamed from: e, reason: collision with root package name */
    public float f380509e;

    /* renamed from: f, reason: collision with root package name */
    public float f380510f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380511g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380513i;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380516o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380517p;

    /* renamed from: r, reason: collision with root package name */
    public int f380519r;

    /* renamed from: s, reason: collision with root package name */
    public int f380520s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f380522u;

    /* renamed from: v, reason: collision with root package name */
    public int f380523v;

    /* renamed from: w, reason: collision with root package name */
    public long f380524w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f380525x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f380526y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f380527z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f380512h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f380514m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f380515n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f380518q = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public int f380521t = 1;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mh4)) {
            return false;
        }
        r45.mh4 mh4Var = (r45.mh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380508d), java.lang.Integer.valueOf(mh4Var.f380508d)) && n51.f.a(java.lang.Float.valueOf(this.f380509e), java.lang.Float.valueOf(mh4Var.f380509e)) && n51.f.a(java.lang.Float.valueOf(this.f380510f), java.lang.Float.valueOf(mh4Var.f380510f)) && n51.f.a(this.f380511g, mh4Var.f380511g) && n51.f.a(this.f380512h, mh4Var.f380512h) && n51.f.a(this.f380513i, mh4Var.f380513i) && n51.f.a(this.f380514m, mh4Var.f380514m) && n51.f.a(this.f380515n, mh4Var.f380515n) && n51.f.a(this.f380516o, mh4Var.f380516o) && n51.f.a(this.f380517p, mh4Var.f380517p) && n51.f.a(this.f380518q, mh4Var.f380518q) && n51.f.a(java.lang.Integer.valueOf(this.f380519r), java.lang.Integer.valueOf(mh4Var.f380519r)) && n51.f.a(java.lang.Integer.valueOf(this.f380520s), java.lang.Integer.valueOf(mh4Var.f380520s)) && n51.f.a(java.lang.Integer.valueOf(this.f380521t), java.lang.Integer.valueOf(mh4Var.f380521t)) && n51.f.a(this.f380522u, mh4Var.f380522u) && n51.f.a(java.lang.Integer.valueOf(this.f380523v), java.lang.Integer.valueOf(mh4Var.f380523v)) && n51.f.a(java.lang.Long.valueOf(this.f380524w), java.lang.Long.valueOf(mh4Var.f380524w)) && n51.f.a(java.lang.Boolean.valueOf(this.f380525x), java.lang.Boolean.valueOf(mh4Var.f380525x)) && n51.f.a(this.f380526y, mh4Var.f380526y) && n51.f.a(this.f380527z, mh4Var.f380527z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(mh4Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(mh4Var.B)) && n51.f.a(this.C, mh4Var.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380518q;
        java.util.LinkedList linkedList2 = this.f380515n;
        java.util.LinkedList linkedList3 = this.f380512h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380508d);
            fVar.d(2, this.f380509e);
            fVar.d(3, this.f380510f);
            java.lang.String str = this.f380511g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 1, linkedList3);
            java.lang.String str2 = this.f380513i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 1, this.f380514m);
            fVar.g(8, 8, linkedList2);
            java.lang.String str3 = this.f380516o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f380517p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.g(11, 8, linkedList);
            fVar.e(12, this.f380519r);
            fVar.e(13, this.f380520s);
            fVar.e(14, this.f380521t);
            java.lang.String str5 = this.f380522u;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            fVar.e(16, this.f380523v);
            fVar.h(17, this.f380524w);
            fVar.a(18, this.f380525x);
            java.lang.String str6 = this.f380526y;
            if (str6 != null) {
                fVar.j(19, str6);
            }
            java.lang.String str7 = this.f380527z;
            if (str7 != null) {
                fVar.j(20, str7);
            }
            fVar.e(21, this.A);
            fVar.e(22, this.B);
            java.lang.String str8 = this.C;
            if (str8 != null) {
                fVar.j(23, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380508d) + 0 + b36.f.d(2, this.f380509e) + b36.f.d(3, this.f380510f);
            java.lang.String str9 = this.f380511g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            int g17 = e17 + b36.f.g(5, 1, linkedList3);
            java.lang.String str10 = this.f380513i;
            if (str10 != null) {
                g17 += b36.f.j(6, str10);
            }
            int g18 = g17 + b36.f.g(7, 1, this.f380514m) + b36.f.g(8, 8, linkedList2);
            java.lang.String str11 = this.f380516o;
            if (str11 != null) {
                g18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f380517p;
            if (str12 != null) {
                g18 += b36.f.j(10, str12);
            }
            int g19 = g18 + b36.f.g(11, 8, linkedList) + b36.f.e(12, this.f380519r) + b36.f.e(13, this.f380520s) + b36.f.e(14, this.f380521t);
            java.lang.String str13 = this.f380522u;
            if (str13 != null) {
                g19 += b36.f.j(15, str13);
            }
            int e18 = g19 + b36.f.e(16, this.f380523v) + b36.f.h(17, this.f380524w) + b36.f.a(18, this.f380525x);
            java.lang.String str14 = this.f380526y;
            if (str14 != null) {
                e18 += b36.f.j(19, str14);
            }
            java.lang.String str15 = this.f380527z;
            if (str15 != null) {
                e18 += b36.f.j(20, str15);
            }
            int e19 = e18 + b36.f.e(21, this.A) + b36.f.e(22, this.B);
            java.lang.String str16 = this.C;
            return str16 != null ? e19 + b36.f.j(23, str16) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            this.f380514m.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.mh4 mh4Var = (r45.mh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mh4Var.f380508d = aVar2.g(intValue);
                return 0;
            case 2:
                mh4Var.f380509e = aVar2.f(intValue);
                return 0;
            case 3:
                mh4Var.f380510f = aVar2.f(intValue);
                return 0;
            case 4:
                mh4Var.f380511g = aVar2.k(intValue);
                return 0;
            case 5:
                mh4Var.f380512h.add(aVar2.k(intValue));
                return 0;
            case 6:
                mh4Var.f380513i = aVar2.k(intValue);
                return 0;
            case 7:
                mh4Var.f380514m.add(aVar2.k(intValue));
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nh4 nh4Var = new r45.nh4();
                    if (bArr2 != null && bArr2.length > 0) {
                        nh4Var.parseFrom(bArr2);
                    }
                    mh4Var.f380515n.add(nh4Var);
                }
                return 0;
            case 9:
                mh4Var.f380516o = aVar2.k(intValue);
                return 0;
            case 10:
                mh4Var.f380517p = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.kh4 kh4Var = new r45.kh4();
                    if (bArr3 != null && bArr3.length > 0) {
                        kh4Var.parseFrom(bArr3);
                    }
                    mh4Var.f380518q.add(kh4Var);
                }
                return 0;
            case 12:
                mh4Var.f380519r = aVar2.g(intValue);
                return 0;
            case 13:
                mh4Var.f380520s = aVar2.g(intValue);
                return 0;
            case 14:
                mh4Var.f380521t = aVar2.g(intValue);
                return 0;
            case 15:
                mh4Var.f380522u = aVar2.k(intValue);
                return 0;
            case 16:
                mh4Var.f380523v = aVar2.g(intValue);
                return 0;
            case 17:
                mh4Var.f380524w = aVar2.i(intValue);
                return 0;
            case 18:
                mh4Var.f380525x = aVar2.c(intValue);
                return 0;
            case 19:
                mh4Var.f380526y = aVar2.k(intValue);
                return 0;
            case 20:
                mh4Var.f380527z = aVar2.k(intValue);
                return 0;
            case 21:
                mh4Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                mh4Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                mh4Var.C = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
