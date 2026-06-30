package r45;

/* loaded from: classes8.dex */
public class h14 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375749d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375750e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375751f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375752g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375753h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375754i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375755m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375756n;

    /* renamed from: o, reason: collision with root package name */
    public int f375757o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f375758p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f375759q;

    /* renamed from: r, reason: collision with root package name */
    public int f375760r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h14)) {
            return false;
        }
        r45.h14 h14Var = (r45.h14) fVar;
        return n51.f.a(this.BaseRequest, h14Var.BaseRequest) && n51.f.a(this.f375749d, h14Var.f375749d) && n51.f.a(this.f375750e, h14Var.f375750e) && n51.f.a(this.f375751f, h14Var.f375751f) && n51.f.a(this.f375752g, h14Var.f375752g) && n51.f.a(this.f375753h, h14Var.f375753h) && n51.f.a(this.f375754i, h14Var.f375754i) && n51.f.a(this.f375755m, h14Var.f375755m) && n51.f.a(this.f375756n, h14Var.f375756n) && n51.f.a(java.lang.Integer.valueOf(this.f375757o), java.lang.Integer.valueOf(h14Var.f375757o)) && n51.f.a(this.f375758p, h14Var.f375758p) && n51.f.a(this.f375759q, h14Var.f375759q) && n51.f.a(java.lang.Integer.valueOf(this.f375760r), java.lang.Integer.valueOf(h14Var.f375760r));
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
            java.lang.String str = this.f375749d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375750e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f375751f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f375752g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f375753h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f375754i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f375755m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            com.tencent.mm.protobuf.g gVar = this.f375756n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            fVar.e(10, this.f375757o);
            java.lang.String str8 = this.f375758p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f375759q;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.e(13, this.f375760r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str10 = this.f375749d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f375750e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f375751f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f375752g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f375753h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f375754i;
            if (str15 != null) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f375755m;
            if (str16 != null) {
                i18 += b36.f.j(8, str16);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f375756n;
            if (gVar2 != null) {
                i18 += b36.f.b(9, gVar2);
            }
            int e17 = i18 + b36.f.e(10, this.f375757o);
            java.lang.String str17 = this.f375758p;
            if (str17 != null) {
                e17 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f375759q;
            if (str18 != null) {
                e17 += b36.f.j(12, str18);
            }
            return e17 + b36.f.e(13, this.f375760r);
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
        r45.h14 h14Var = (r45.h14) objArr[1];
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
                    h14Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                h14Var.f375749d = aVar2.k(intValue);
                return 0;
            case 3:
                h14Var.f375750e = aVar2.k(intValue);
                return 0;
            case 4:
                h14Var.f375751f = aVar2.k(intValue);
                return 0;
            case 5:
                h14Var.f375752g = aVar2.k(intValue);
                return 0;
            case 6:
                h14Var.f375753h = aVar2.k(intValue);
                return 0;
            case 7:
                h14Var.f375754i = aVar2.k(intValue);
                return 0;
            case 8:
                h14Var.f375755m = aVar2.k(intValue);
                return 0;
            case 9:
                h14Var.f375756n = aVar2.d(intValue);
                return 0;
            case 10:
                h14Var.f375757o = aVar2.g(intValue);
                return 0;
            case 11:
                h14Var.f375758p = aVar2.k(intValue);
                return 0;
            case 12:
                h14Var.f375759q = aVar2.k(intValue);
                return 0;
            case 13:
                h14Var.f375760r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
