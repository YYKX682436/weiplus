package r45;

/* loaded from: classes8.dex */
public class x14 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389650d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389651e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389653g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389654h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389655i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389656m;

    /* renamed from: n, reason: collision with root package name */
    public int f389657n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389658o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389660q;

    /* renamed from: r, reason: collision with root package name */
    public int f389661r;

    /* renamed from: s, reason: collision with root package name */
    public int f389662s;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f389652f = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f389659p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x14)) {
            return false;
        }
        r45.x14 x14Var = (r45.x14) fVar;
        return n51.f.a(this.BaseRequest, x14Var.BaseRequest) && n51.f.a(this.f389650d, x14Var.f389650d) && n51.f.a(this.f389651e, x14Var.f389651e) && n51.f.a(this.f389652f, x14Var.f389652f) && n51.f.a(this.f389653g, x14Var.f389653g) && n51.f.a(this.f389654h, x14Var.f389654h) && n51.f.a(this.f389655i, x14Var.f389655i) && n51.f.a(this.f389656m, x14Var.f389656m) && n51.f.a(java.lang.Integer.valueOf(this.f389657n), java.lang.Integer.valueOf(x14Var.f389657n)) && n51.f.a(this.f389658o, x14Var.f389658o) && n51.f.a(this.f389659p, x14Var.f389659p) && n51.f.a(this.f389660q, x14Var.f389660q) && n51.f.a(java.lang.Integer.valueOf(this.f389661r), java.lang.Integer.valueOf(x14Var.f389661r)) && n51.f.a(java.lang.Integer.valueOf(this.f389662s), java.lang.Integer.valueOf(x14Var.f389662s));
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
            java.lang.String str = this.f389650d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389651e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, this.f389652f);
            java.lang.String str3 = this.f389653g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f389654h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f389655i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f389656m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f389657n);
            java.lang.String str7 = this.f389658o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.g(11, 1, this.f389659p);
            java.lang.String str8 = this.f389660q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f389661r);
            fVar.e(14, this.f389662s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str9 = this.f389650d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f389651e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            int g17 = i18 + b36.f.g(4, 1, this.f389652f);
            java.lang.String str11 = this.f389653g;
            if (str11 != null) {
                g17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f389654h;
            if (str12 != null) {
                g17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f389655i;
            if (str13 != null) {
                g17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f389656m;
            if (str14 != null) {
                g17 += b36.f.j(8, str14);
            }
            int e17 = g17 + b36.f.e(9, this.f389657n);
            java.lang.String str15 = this.f389658o;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            int g18 = e17 + b36.f.g(11, 1, this.f389659p);
            java.lang.String str16 = this.f389660q;
            if (str16 != null) {
                g18 += b36.f.j(12, str16);
            }
            return g18 + b36.f.e(13, this.f389661r) + b36.f.e(14, this.f389662s);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f389652f.clear();
            this.f389659p.clear();
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
        r45.x14 x14Var = (r45.x14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    x14Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                x14Var.f389650d = aVar2.k(intValue);
                return 0;
            case 3:
                x14Var.f389651e = aVar2.k(intValue);
                return 0;
            case 4:
                x14Var.f389652f.add(aVar2.k(intValue));
                return 0;
            case 5:
                x14Var.f389653g = aVar2.k(intValue);
                return 0;
            case 6:
                x14Var.f389654h = aVar2.k(intValue);
                return 0;
            case 7:
                x14Var.f389655i = aVar2.k(intValue);
                return 0;
            case 8:
                x14Var.f389656m = aVar2.k(intValue);
                return 0;
            case 9:
                x14Var.f389657n = aVar2.g(intValue);
                return 0;
            case 10:
                x14Var.f389658o = aVar2.k(intValue);
                return 0;
            case 11:
                x14Var.f389659p.add(aVar2.k(intValue));
                return 0;
            case 12:
                x14Var.f389660q = aVar2.k(intValue);
                return 0;
            case 13:
                x14Var.f389661r = aVar2.g(intValue);
                return 0;
            case 14:
                x14Var.f389662s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
