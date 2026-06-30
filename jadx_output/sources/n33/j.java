package n33;

/* loaded from: classes8.dex */
public class j extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f334521d;

    /* renamed from: e, reason: collision with root package name */
    public int f334522e;

    /* renamed from: f, reason: collision with root package name */
    public int f334523f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f334524g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f334525h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f334526i;

    /* renamed from: m, reason: collision with root package name */
    public int f334527m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f334528n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f334529o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f334530p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f334531q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f334532r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f334533s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f334534t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof n33.j)) {
            return false;
        }
        n33.j jVar = (n33.j) fVar;
        return n51.f.a(this.BaseRequest, jVar.BaseRequest) && n51.f.a(this.f334521d, jVar.f334521d) && n51.f.a(java.lang.Integer.valueOf(this.f334522e), java.lang.Integer.valueOf(jVar.f334522e)) && n51.f.a(java.lang.Integer.valueOf(this.f334523f), java.lang.Integer.valueOf(jVar.f334523f)) && n51.f.a(this.f334524g, jVar.f334524g) && n51.f.a(this.f334525h, jVar.f334525h) && n51.f.a(this.f334526i, jVar.f334526i) && n51.f.a(java.lang.Integer.valueOf(this.f334527m), java.lang.Integer.valueOf(jVar.f334527m)) && n51.f.a(this.f334528n, jVar.f334528n) && n51.f.a(this.f334529o, jVar.f334529o) && n51.f.a(this.f334530p, jVar.f334530p) && n51.f.a(this.f334531q, jVar.f334531q) && n51.f.a(this.f334532r, jVar.f334532r) && n51.f.a(this.f334533s, jVar.f334533s) && n51.f.a(this.f334534t, jVar.f334534t);
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
            java.lang.String str = this.f334521d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f334522e);
            fVar.e(4, this.f334523f);
            java.lang.String str2 = this.f334524g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f334525h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f334526i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f334527m);
            java.lang.String str5 = this.f334528n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f334529o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f334530p;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f334531q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f334532r;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f334533s;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f334534t;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str12 = this.f334521d;
            if (str12 != null) {
                i18 += b36.f.j(2, str12);
            }
            int e17 = i18 + b36.f.e(3, this.f334522e) + b36.f.e(4, this.f334523f);
            java.lang.String str13 = this.f334524g;
            if (str13 != null) {
                e17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f334525h;
            if (str14 != null) {
                e17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f334526i;
            if (str15 != null) {
                e17 += b36.f.j(7, str15);
            }
            int e18 = e17 + b36.f.e(8, this.f334527m);
            java.lang.String str16 = this.f334528n;
            if (str16 != null) {
                e18 += b36.f.j(9, str16);
            }
            java.lang.String str17 = this.f334529o;
            if (str17 != null) {
                e18 += b36.f.j(10, str17);
            }
            java.lang.String str18 = this.f334530p;
            if (str18 != null) {
                e18 += b36.f.j(11, str18);
            }
            java.lang.String str19 = this.f334531q;
            if (str19 != null) {
                e18 += b36.f.j(12, str19);
            }
            java.lang.String str20 = this.f334532r;
            if (str20 != null) {
                e18 += b36.f.j(13, str20);
            }
            java.lang.String str21 = this.f334533s;
            if (str21 != null) {
                e18 += b36.f.j(14, str21);
            }
            java.lang.String str22 = this.f334534t;
            return str22 != null ? e18 + b36.f.j(15, str22) : e18;
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
        n33.j jVar = (n33.j) objArr[1];
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
                    jVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                jVar.f334521d = aVar2.k(intValue);
                return 0;
            case 3:
                jVar.f334522e = aVar2.g(intValue);
                return 0;
            case 4:
                jVar.f334523f = aVar2.g(intValue);
                return 0;
            case 5:
                jVar.f334524g = aVar2.k(intValue);
                return 0;
            case 6:
                jVar.f334525h = aVar2.k(intValue);
                return 0;
            case 7:
                jVar.f334526i = aVar2.k(intValue);
                return 0;
            case 8:
                jVar.f334527m = aVar2.g(intValue);
                return 0;
            case 9:
                jVar.f334528n = aVar2.k(intValue);
                return 0;
            case 10:
                jVar.f334529o = aVar2.k(intValue);
                return 0;
            case 11:
                jVar.f334530p = aVar2.k(intValue);
                return 0;
            case 12:
                jVar.f334531q = aVar2.k(intValue);
                return 0;
            case 13:
                jVar.f334532r = aVar2.k(intValue);
                return 0;
            case 14:
                jVar.f334533s = aVar2.k(intValue);
                return 0;
            case 15:
                jVar.f334534t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
