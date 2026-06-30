package r45;

/* loaded from: classes9.dex */
public class m75 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380189d;

    /* renamed from: e, reason: collision with root package name */
    public int f380190e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380191f;

    /* renamed from: g, reason: collision with root package name */
    public int f380192g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380193h;

    /* renamed from: i, reason: collision with root package name */
    public int f380194i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380195m;

    /* renamed from: n, reason: collision with root package name */
    public int f380196n;

    /* renamed from: o, reason: collision with root package name */
    public int f380197o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380198p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380199q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f380200r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f380201s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f380202t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f380203u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f380204v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m75)) {
            return false;
        }
        r45.m75 m75Var = (r45.m75) fVar;
        return n51.f.a(this.f380189d, m75Var.f380189d) && n51.f.a(java.lang.Integer.valueOf(this.f380190e), java.lang.Integer.valueOf(m75Var.f380190e)) && n51.f.a(this.f380191f, m75Var.f380191f) && n51.f.a(java.lang.Integer.valueOf(this.f380192g), java.lang.Integer.valueOf(m75Var.f380192g)) && n51.f.a(this.f380193h, m75Var.f380193h) && n51.f.a(java.lang.Integer.valueOf(this.f380194i), java.lang.Integer.valueOf(m75Var.f380194i)) && n51.f.a(this.f380195m, m75Var.f380195m) && n51.f.a(java.lang.Integer.valueOf(this.f380196n), java.lang.Integer.valueOf(m75Var.f380196n)) && n51.f.a(java.lang.Integer.valueOf(this.f380197o), java.lang.Integer.valueOf(m75Var.f380197o)) && n51.f.a(this.f380198p, m75Var.f380198p) && n51.f.a(this.f380199q, m75Var.f380199q) && n51.f.a(this.f380200r, m75Var.f380200r) && n51.f.a(this.f380201s, m75Var.f380201s) && n51.f.a(this.f380202t, m75Var.f380202t) && n51.f.a(this.f380203u, m75Var.f380203u) && n51.f.a(this.f380204v, m75Var.f380204v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380189d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f380190e);
            java.lang.String str2 = this.f380191f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f380192g);
            java.lang.String str3 = this.f380193h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f380194i);
            java.lang.String str4 = this.f380195m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f380196n);
            fVar.e(9, this.f380197o);
            java.lang.String str5 = this.f380198p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f380199q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f380200r;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f380201s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f380202t;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f380203u;
            if (str10 != null) {
                fVar.j(18, str10);
            }
            java.lang.String str11 = this.f380204v;
            if (str11 != null) {
                fVar.j(19, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f380189d;
            int j17 = (str12 != null ? b36.f.j(1, str12) + 0 : 0) + b36.f.e(2, this.f380190e);
            java.lang.String str13 = this.f380191f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            int e17 = j17 + b36.f.e(4, this.f380192g);
            java.lang.String str14 = this.f380193h;
            if (str14 != null) {
                e17 += b36.f.j(5, str14);
            }
            int e18 = e17 + b36.f.e(6, this.f380194i);
            java.lang.String str15 = this.f380195m;
            if (str15 != null) {
                e18 += b36.f.j(7, str15);
            }
            int e19 = e18 + b36.f.e(8, this.f380196n) + b36.f.e(9, this.f380197o);
            java.lang.String str16 = this.f380198p;
            if (str16 != null) {
                e19 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f380199q;
            if (str17 != null) {
                e19 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f380200r;
            if (str18 != null) {
                e19 += b36.f.j(13, str18);
            }
            java.lang.String str19 = this.f380201s;
            if (str19 != null) {
                e19 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f380202t;
            if (str20 != null) {
                e19 += b36.f.j(15, str20);
            }
            java.lang.String str21 = this.f380203u;
            if (str21 != null) {
                e19 += b36.f.j(18, str21);
            }
            java.lang.String str22 = this.f380204v;
            return str22 != null ? e19 + b36.f.j(19, str22) : e19;
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
        r45.m75 m75Var = (r45.m75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m75Var.f380189d = aVar2.k(intValue);
                return 0;
            case 2:
                m75Var.f380190e = aVar2.g(intValue);
                return 0;
            case 3:
                m75Var.f380191f = aVar2.k(intValue);
                return 0;
            case 4:
                m75Var.f380192g = aVar2.g(intValue);
                return 0;
            case 5:
                m75Var.f380193h = aVar2.k(intValue);
                return 0;
            case 6:
                m75Var.f380194i = aVar2.g(intValue);
                return 0;
            case 7:
                m75Var.f380195m = aVar2.k(intValue);
                return 0;
            case 8:
                m75Var.f380196n = aVar2.g(intValue);
                return 0;
            case 9:
                m75Var.f380197o = aVar2.g(intValue);
                return 0;
            case 10:
            case 16:
            case 17:
            default:
                return -1;
            case 11:
                m75Var.f380198p = aVar2.k(intValue);
                return 0;
            case 12:
                m75Var.f380199q = aVar2.k(intValue);
                return 0;
            case 13:
                m75Var.f380200r = aVar2.k(intValue);
                return 0;
            case 14:
                m75Var.f380201s = aVar2.k(intValue);
                return 0;
            case 15:
                m75Var.f380202t = aVar2.k(intValue);
                return 0;
            case 18:
                m75Var.f380203u = aVar2.k(intValue);
                return 0;
            case 19:
                m75Var.f380204v = aVar2.k(intValue);
                return 0;
        }
    }
}
