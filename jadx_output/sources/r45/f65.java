package r45;

/* loaded from: classes4.dex */
public class f65 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374046d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374047e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374048f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374049g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374050h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374051i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374052m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374053n;

    /* renamed from: o, reason: collision with root package name */
    public int f374054o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f374055p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f65)) {
            return false;
        }
        r45.f65 f65Var = (r45.f65) fVar;
        return n51.f.a(this.BaseRequest, f65Var.BaseRequest) && n51.f.a(this.f374046d, f65Var.f374046d) && n51.f.a(this.f374047e, f65Var.f374047e) && n51.f.a(this.f374048f, f65Var.f374048f) && n51.f.a(this.f374049g, f65Var.f374049g) && n51.f.a(this.f374050h, f65Var.f374050h) && n51.f.a(this.f374051i, f65Var.f374051i) && n51.f.a(this.f374052m, f65Var.f374052m) && n51.f.a(this.f374053n, f65Var.f374053n) && n51.f.a(java.lang.Integer.valueOf(this.f374054o), java.lang.Integer.valueOf(f65Var.f374054o)) && n51.f.a(this.f374055p, f65Var.f374055p);
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
            java.lang.String str = this.f374046d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374047e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374048f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f374049g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f374050h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f374051i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f374052m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f374053n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f374054o);
            java.lang.String str9 = this.f374055p;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str10 = this.f374046d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f374047e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f374048f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f374049g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f374050h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f374051i;
            if (str15 != null) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f374052m;
            if (str16 != null) {
                i18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f374053n;
            if (str17 != null) {
                i18 += b36.f.j(9, str17);
            }
            int e17 = i18 + b36.f.e(10, this.f374054o);
            java.lang.String str18 = this.f374055p;
            return str18 != null ? e17 + b36.f.j(11, str18) : e17;
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
        r45.f65 f65Var = (r45.f65) objArr[1];
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
                    f65Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                f65Var.f374046d = aVar2.k(intValue);
                return 0;
            case 3:
                f65Var.f374047e = aVar2.k(intValue);
                return 0;
            case 4:
                f65Var.f374048f = aVar2.k(intValue);
                return 0;
            case 5:
                f65Var.f374049g = aVar2.k(intValue);
                return 0;
            case 6:
                f65Var.f374050h = aVar2.k(intValue);
                return 0;
            case 7:
                f65Var.f374051i = aVar2.k(intValue);
                return 0;
            case 8:
                f65Var.f374052m = aVar2.k(intValue);
                return 0;
            case 9:
                f65Var.f374053n = aVar2.k(intValue);
                return 0;
            case 10:
                f65Var.f374054o = aVar2.g(intValue);
                return 0;
            case 11:
                f65Var.f374055p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
