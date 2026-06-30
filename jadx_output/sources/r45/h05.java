package r45;

/* loaded from: classes11.dex */
public class h05 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375714d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375715e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375716f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375717g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375718h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375719i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375720m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375721n;

    /* renamed from: o, reason: collision with root package name */
    public int f375722o;

    /* renamed from: p, reason: collision with root package name */
    public r45.b05 f375723p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f375724q;

    /* renamed from: r, reason: collision with root package name */
    public r45.m05 f375725r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f375726s;

    /* renamed from: t, reason: collision with root package name */
    public int f375727t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f375728u;

    /* renamed from: v, reason: collision with root package name */
    public int f375729v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h05)) {
            return false;
        }
        r45.h05 h05Var = (r45.h05) fVar;
        return n51.f.a(this.f375714d, h05Var.f375714d) && n51.f.a(this.f375715e, h05Var.f375715e) && n51.f.a(this.f375716f, h05Var.f375716f) && n51.f.a(this.f375717g, h05Var.f375717g) && n51.f.a(this.f375718h, h05Var.f375718h) && n51.f.a(this.f375719i, h05Var.f375719i) && n51.f.a(this.f375720m, h05Var.f375720m) && n51.f.a(this.f375721n, h05Var.f375721n) && n51.f.a(java.lang.Integer.valueOf(this.f375722o), java.lang.Integer.valueOf(h05Var.f375722o)) && n51.f.a(this.f375723p, h05Var.f375723p) && n51.f.a(this.f375724q, h05Var.f375724q) && n51.f.a(this.f375725r, h05Var.f375725r) && n51.f.a(this.f375726s, h05Var.f375726s) && n51.f.a(java.lang.Integer.valueOf(this.f375727t), java.lang.Integer.valueOf(h05Var.f375727t)) && n51.f.a(this.f375728u, h05Var.f375728u) && n51.f.a(java.lang.Integer.valueOf(this.f375729v), java.lang.Integer.valueOf(h05Var.f375729v));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375714d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375715e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f375716f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f375717g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f375718h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f375719i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f375720m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f375721n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            fVar.e(9, this.f375722o);
            r45.b05 b05Var = this.f375723p;
            if (b05Var != null) {
                fVar.i(10, b05Var.computeSize());
                this.f375723p.writeFields(fVar);
            }
            java.lang.String str9 = this.f375724q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            r45.m05 m05Var = this.f375725r;
            if (m05Var != null) {
                fVar.i(12, m05Var.computeSize());
                this.f375725r.writeFields(fVar);
            }
            java.lang.String str10 = this.f375726s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            fVar.e(15, this.f375727t);
            java.lang.String str11 = this.f375728u;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            fVar.e(17, this.f375729v);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f375714d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f375715e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f375716f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f375717g;
            if (str15 != null) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f375718h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f375719i;
            if (str17 != null) {
                j17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f375720m;
            if (str18 != null) {
                j17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f375721n;
            if (str19 != null) {
                j17 += b36.f.j(8, str19);
            }
            int e17 = j17 + b36.f.e(9, this.f375722o);
            r45.b05 b05Var2 = this.f375723p;
            if (b05Var2 != null) {
                e17 += b36.f.i(10, b05Var2.computeSize());
            }
            java.lang.String str20 = this.f375724q;
            if (str20 != null) {
                e17 += b36.f.j(11, str20);
            }
            r45.m05 m05Var2 = this.f375725r;
            if (m05Var2 != null) {
                e17 += b36.f.i(12, m05Var2.computeSize());
            }
            java.lang.String str21 = this.f375726s;
            if (str21 != null) {
                e17 += b36.f.j(13, str21);
            }
            int e18 = e17 + b36.f.e(15, this.f375727t);
            java.lang.String str22 = this.f375728u;
            if (str22 != null) {
                e18 += b36.f.j(16, str22);
            }
            return e18 + b36.f.e(17, this.f375729v);
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
        r45.h05 h05Var = (r45.h05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                h05Var.f375714d = aVar2.k(intValue);
                return 0;
            case 2:
                h05Var.f375715e = aVar2.k(intValue);
                return 0;
            case 3:
                h05Var.f375716f = aVar2.k(intValue);
                return 0;
            case 4:
                h05Var.f375717g = aVar2.k(intValue);
                return 0;
            case 5:
                h05Var.f375718h = aVar2.k(intValue);
                return 0;
            case 6:
                h05Var.f375719i = aVar2.k(intValue);
                return 0;
            case 7:
                h05Var.f375720m = aVar2.k(intValue);
                return 0;
            case 8:
                h05Var.f375721n = aVar2.k(intValue);
                return 0;
            case 9:
                h05Var.f375722o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.b05 b05Var3 = new r45.b05();
                    if (bArr != null && bArr.length > 0) {
                        b05Var3.parseFrom(bArr);
                    }
                    h05Var.f375723p = b05Var3;
                }
                return 0;
            case 11:
                h05Var.f375724q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.m05 m05Var3 = new r45.m05();
                    if (bArr2 != null && bArr2.length > 0) {
                        m05Var3.parseFrom(bArr2);
                    }
                    h05Var.f375725r = m05Var3;
                }
                return 0;
            case 13:
                h05Var.f375726s = aVar2.k(intValue);
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                h05Var.f375727t = aVar2.g(intValue);
                return 0;
            case 16:
                h05Var.f375728u = aVar2.k(intValue);
                return 0;
            case 17:
                h05Var.f375729v = aVar2.g(intValue);
                return 0;
        }
    }
}
