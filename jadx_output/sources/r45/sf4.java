package r45;

/* loaded from: classes15.dex */
public class sf4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385673d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385674e;

    /* renamed from: f, reason: collision with root package name */
    public int f385675f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385676g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385677h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385678i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385679m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385680n;

    /* renamed from: o, reason: collision with root package name */
    public int f385681o;

    /* renamed from: p, reason: collision with root package name */
    public int f385682p;

    /* renamed from: q, reason: collision with root package name */
    public r45.sx3 f385683q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sf4)) {
            return false;
        }
        r45.sf4 sf4Var = (r45.sf4) fVar;
        return n51.f.a(this.f385673d, sf4Var.f385673d) && n51.f.a(this.f385674e, sf4Var.f385674e) && n51.f.a(java.lang.Integer.valueOf(this.f385675f), java.lang.Integer.valueOf(sf4Var.f385675f)) && n51.f.a(this.f385676g, sf4Var.f385676g) && n51.f.a(this.f385677h, sf4Var.f385677h) && n51.f.a(this.f385678i, sf4Var.f385678i) && n51.f.a(this.f385679m, sf4Var.f385679m) && n51.f.a(this.f385680n, sf4Var.f385680n) && n51.f.a(java.lang.Integer.valueOf(this.f385681o), java.lang.Integer.valueOf(sf4Var.f385681o)) && n51.f.a(java.lang.Integer.valueOf(this.f385682p), java.lang.Integer.valueOf(sf4Var.f385682p)) && n51.f.a(this.f385683q, sf4Var.f385683q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385673d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385674e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f385675f);
            java.lang.String str3 = this.f385676g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f385677h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f385678i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f385679m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f385680n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f385681o);
            fVar.e(10, this.f385682p);
            r45.sx3 sx3Var = this.f385683q;
            if (sx3Var != null) {
                fVar.i(11, sx3Var.computeSize());
                this.f385683q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f385673d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f385674e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f385675f);
            java.lang.String str10 = this.f385676g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f385677h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f385678i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f385679m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f385680n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            int e18 = e17 + b36.f.e(9, this.f385681o) + b36.f.e(10, this.f385682p);
            r45.sx3 sx3Var2 = this.f385683q;
            return sx3Var2 != null ? e18 + b36.f.i(11, sx3Var2.computeSize()) : e18;
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
        r45.sf4 sf4Var = (r45.sf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sf4Var.f385673d = aVar2.k(intValue);
                return 0;
            case 2:
                sf4Var.f385674e = aVar2.k(intValue);
                return 0;
            case 3:
                sf4Var.f385675f = aVar2.g(intValue);
                return 0;
            case 4:
                sf4Var.f385676g = aVar2.k(intValue);
                return 0;
            case 5:
                sf4Var.f385677h = aVar2.k(intValue);
                return 0;
            case 6:
                sf4Var.f385678i = aVar2.k(intValue);
                return 0;
            case 7:
                sf4Var.f385679m = aVar2.k(intValue);
                return 0;
            case 8:
                sf4Var.f385680n = aVar2.k(intValue);
                return 0;
            case 9:
                sf4Var.f385681o = aVar2.g(intValue);
                return 0;
            case 10:
                sf4Var.f385682p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.sx3 sx3Var3 = new r45.sx3();
                    if (bArr != null && bArr.length > 0) {
                        sx3Var3.parseFrom(bArr);
                    }
                    sf4Var.f385683q = sx3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
