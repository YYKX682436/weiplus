package r45;

/* loaded from: classes9.dex */
public class ea3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373185d;

    /* renamed from: e, reason: collision with root package name */
    public int f373186e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373187f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373188g;

    /* renamed from: h, reason: collision with root package name */
    public int f373189h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373190i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373191m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373192n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373193o;

    /* renamed from: p, reason: collision with root package name */
    public int f373194p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ea3)) {
            return false;
        }
        r45.ea3 ea3Var = (r45.ea3) fVar;
        return n51.f.a(this.BaseRequest, ea3Var.BaseRequest) && n51.f.a(this.f373185d, ea3Var.f373185d) && n51.f.a(java.lang.Integer.valueOf(this.f373186e), java.lang.Integer.valueOf(ea3Var.f373186e)) && n51.f.a(this.f373187f, ea3Var.f373187f) && n51.f.a(this.f373188g, ea3Var.f373188g) && n51.f.a(java.lang.Integer.valueOf(this.f373189h), java.lang.Integer.valueOf(ea3Var.f373189h)) && n51.f.a(this.f373190i, ea3Var.f373190i) && n51.f.a(this.f373191m, ea3Var.f373191m) && n51.f.a(this.f373192n, ea3Var.f373192n) && n51.f.a(this.f373193o, ea3Var.f373193o) && n51.f.a(java.lang.Integer.valueOf(this.f373194p), java.lang.Integer.valueOf(ea3Var.f373194p));
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
            java.lang.String str = this.f373185d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f373186e);
            java.lang.String str2 = this.f373187f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f373188g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f373189h);
            java.lang.String str4 = this.f373190i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f373191m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f373192n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            com.tencent.mm.protobuf.g gVar = this.f373193o;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            fVar.e(11, this.f373194p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f373185d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int e17 = i18 + b36.f.e(3, this.f373186e);
            java.lang.String str8 = this.f373187f;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f373188g;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            int e18 = e17 + b36.f.e(6, this.f373189h);
            java.lang.String str10 = this.f373190i;
            if (str10 != null) {
                e18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f373191m;
            if (str11 != null) {
                e18 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f373192n;
            if (str12 != null) {
                e18 += b36.f.j(9, str12);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f373193o;
            if (gVar2 != null) {
                e18 += b36.f.b(10, gVar2);
            }
            return e18 + b36.f.e(11, this.f373194p);
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
        r45.ea3 ea3Var = (r45.ea3) objArr[1];
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
                    ea3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ea3Var.f373185d = aVar2.k(intValue);
                return 0;
            case 3:
                ea3Var.f373186e = aVar2.g(intValue);
                return 0;
            case 4:
                ea3Var.f373187f = aVar2.k(intValue);
                return 0;
            case 5:
                ea3Var.f373188g = aVar2.k(intValue);
                return 0;
            case 6:
                ea3Var.f373189h = aVar2.g(intValue);
                return 0;
            case 7:
                ea3Var.f373190i = aVar2.k(intValue);
                return 0;
            case 8:
                ea3Var.f373191m = aVar2.k(intValue);
                return 0;
            case 9:
                ea3Var.f373192n = aVar2.k(intValue);
                return 0;
            case 10:
                ea3Var.f373193o = aVar2.d(intValue);
                return 0;
            case 11:
                ea3Var.f373194p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
