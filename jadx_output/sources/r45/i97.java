package r45;

/* loaded from: classes8.dex */
public class i97 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376854d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376855e;

    /* renamed from: f, reason: collision with root package name */
    public int f376856f;

    /* renamed from: g, reason: collision with root package name */
    public int f376857g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376858h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376859i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376860m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376861n;

    /* renamed from: o, reason: collision with root package name */
    public int f376862o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f376863p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f376864q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i97)) {
            return false;
        }
        r45.i97 i97Var = (r45.i97) fVar;
        return n51.f.a(this.BaseRequest, i97Var.BaseRequest) && n51.f.a(this.f376854d, i97Var.f376854d) && n51.f.a(this.f376855e, i97Var.f376855e) && n51.f.a(java.lang.Integer.valueOf(this.f376856f), java.lang.Integer.valueOf(i97Var.f376856f)) && n51.f.a(java.lang.Integer.valueOf(this.f376857g), java.lang.Integer.valueOf(i97Var.f376857g)) && n51.f.a(this.f376858h, i97Var.f376858h) && n51.f.a(this.f376859i, i97Var.f376859i) && n51.f.a(this.f376860m, i97Var.f376860m) && n51.f.a(this.f376861n, i97Var.f376861n) && n51.f.a(java.lang.Integer.valueOf(this.f376862o), java.lang.Integer.valueOf(i97Var.f376862o)) && n51.f.a(this.f376863p, i97Var.f376863p) && n51.f.a(this.f376864q, i97Var.f376864q);
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
            java.lang.String str = this.f376854d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f376855e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f376856f);
            fVar.e(5, this.f376857g);
            java.lang.String str3 = this.f376858h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f376859i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f376860m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f376861n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.e(10, this.f376862o);
            java.lang.String str7 = this.f376863p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f376864q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str9 = this.f376854d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f376855e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            int e17 = i18 + b36.f.e(4, this.f376856f) + b36.f.e(5, this.f376857g);
            java.lang.String str11 = this.f376858h;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f376859i;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f376860m;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f376861n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            int e18 = e17 + b36.f.e(10, this.f376862o);
            java.lang.String str15 = this.f376863p;
            if (str15 != null) {
                e18 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f376864q;
            return str16 != null ? e18 + b36.f.j(12, str16) : e18;
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
        r45.i97 i97Var = (r45.i97) objArr[1];
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
                    i97Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                i97Var.f376854d = aVar2.k(intValue);
                return 0;
            case 3:
                i97Var.f376855e = aVar2.k(intValue);
                return 0;
            case 4:
                i97Var.f376856f = aVar2.g(intValue);
                return 0;
            case 5:
                i97Var.f376857g = aVar2.g(intValue);
                return 0;
            case 6:
                i97Var.f376858h = aVar2.k(intValue);
                return 0;
            case 7:
                i97Var.f376859i = aVar2.k(intValue);
                return 0;
            case 8:
                i97Var.f376860m = aVar2.k(intValue);
                return 0;
            case 9:
                i97Var.f376861n = aVar2.k(intValue);
                return 0;
            case 10:
                i97Var.f376862o = aVar2.g(intValue);
                return 0;
            case 11:
                i97Var.f376863p = aVar2.k(intValue);
                return 0;
            case 12:
                i97Var.f376864q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
