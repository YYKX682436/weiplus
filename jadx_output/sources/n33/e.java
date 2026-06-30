package n33;

/* loaded from: classes8.dex */
public class e extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f334494d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f334495e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f334496f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f334497g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f334498h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f334499i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f334500m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f334501n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f334502o;

    /* renamed from: p, reason: collision with root package name */
    public int f334503p;

    /* renamed from: q, reason: collision with root package name */
    public int f334504q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof n33.e)) {
            return false;
        }
        n33.e eVar = (n33.e) fVar;
        return n51.f.a(this.BaseRequest, eVar.BaseRequest) && n51.f.a(this.f334494d, eVar.f334494d) && n51.f.a(this.f334495e, eVar.f334495e) && n51.f.a(this.f334496f, eVar.f334496f) && n51.f.a(this.f334497g, eVar.f334497g) && n51.f.a(this.f334498h, eVar.f334498h) && n51.f.a(this.f334499i, eVar.f334499i) && n51.f.a(this.f334500m, eVar.f334500m) && n51.f.a(this.f334501n, eVar.f334501n) && n51.f.a(this.f334502o, eVar.f334502o) && n51.f.a(java.lang.Integer.valueOf(this.f334503p), java.lang.Integer.valueOf(eVar.f334503p)) && n51.f.a(java.lang.Integer.valueOf(this.f334504q), java.lang.Integer.valueOf(eVar.f334504q));
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
            java.lang.String str = this.f334494d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f334495e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f334496f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f334497g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f334498h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f334499i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f334500m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f334501n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f334502o;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            fVar.e(11, this.f334503p);
            fVar.e(12, this.f334504q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str10 = this.f334494d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f334495e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f334496f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f334497g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f334498h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f334499i;
            if (str15 != null) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f334500m;
            if (str16 != null) {
                i18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f334501n;
            if (str17 != null) {
                i18 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f334502o;
            if (str18 != null) {
                i18 += b36.f.j(10, str18);
            }
            return i18 + b36.f.e(11, this.f334503p) + b36.f.e(12, this.f334504q);
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
        n33.e eVar = (n33.e) objArr[1];
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
                    eVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                eVar.f334494d = aVar2.k(intValue);
                return 0;
            case 3:
                eVar.f334495e = aVar2.k(intValue);
                return 0;
            case 4:
                eVar.f334496f = aVar2.k(intValue);
                return 0;
            case 5:
                eVar.f334497g = aVar2.k(intValue);
                return 0;
            case 6:
                eVar.f334498h = aVar2.k(intValue);
                return 0;
            case 7:
                eVar.f334499i = aVar2.k(intValue);
                return 0;
            case 8:
                eVar.f334500m = aVar2.k(intValue);
                return 0;
            case 9:
                eVar.f334501n = aVar2.k(intValue);
                return 0;
            case 10:
                eVar.f334502o = aVar2.k(intValue);
                return 0;
            case 11:
                eVar.f334503p = aVar2.g(intValue);
                return 0;
            case 12:
                eVar.f334504q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
