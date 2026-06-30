package r45;

/* loaded from: classes9.dex */
public class gx extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375583d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375584e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375585f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375586g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375587h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375588i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375589m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375590n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f375591o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f375592p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gx)) {
            return false;
        }
        r45.gx gxVar = (r45.gx) fVar;
        return n51.f.a(this.BaseRequest, gxVar.BaseRequest) && n51.f.a(this.f375583d, gxVar.f375583d) && n51.f.a(this.f375584e, gxVar.f375584e) && n51.f.a(this.f375585f, gxVar.f375585f) && n51.f.a(this.f375586g, gxVar.f375586g) && n51.f.a(this.f375587h, gxVar.f375587h) && n51.f.a(this.f375588i, gxVar.f375588i) && n51.f.a(this.f375589m, gxVar.f375589m) && n51.f.a(this.f375590n, gxVar.f375590n) && n51.f.a(java.lang.Boolean.valueOf(this.f375591o), java.lang.Boolean.valueOf(gxVar.f375591o)) && n51.f.a(this.f375592p, gxVar.f375592p);
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
            java.lang.String str = this.f375583d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375584e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f375585f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f375586g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f375587h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f375588i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            com.tencent.mm.protobuf.g gVar = this.f375589m;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            java.lang.String str7 = this.f375590n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.a(10, this.f375591o);
            java.lang.String str8 = this.f375592p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str9 = this.f375583d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f375584e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f375585f;
            if (str11 != null) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f375586g;
            if (str12 != null) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f375587h;
            if (str13 != null) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f375588i;
            if (str14 != null) {
                i18 += b36.f.j(7, str14);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f375589m;
            if (gVar2 != null) {
                i18 += b36.f.b(8, gVar2);
            }
            java.lang.String str15 = this.f375590n;
            if (str15 != null) {
                i18 += b36.f.j(9, str15);
            }
            int a17 = i18 + b36.f.a(10, this.f375591o);
            java.lang.String str16 = this.f375592p;
            return str16 != null ? a17 + b36.f.j(11, str16) : a17;
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
        r45.gx gxVar = (r45.gx) objArr[1];
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
                    gxVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                gxVar.f375583d = aVar2.k(intValue);
                return 0;
            case 3:
                gxVar.f375584e = aVar2.k(intValue);
                return 0;
            case 4:
                gxVar.f375585f = aVar2.k(intValue);
                return 0;
            case 5:
                gxVar.f375586g = aVar2.k(intValue);
                return 0;
            case 6:
                gxVar.f375587h = aVar2.k(intValue);
                return 0;
            case 7:
                gxVar.f375588i = aVar2.k(intValue);
                return 0;
            case 8:
                gxVar.f375589m = aVar2.d(intValue);
                return 0;
            case 9:
                gxVar.f375590n = aVar2.k(intValue);
                return 0;
            case 10:
                gxVar.f375591o = aVar2.c(intValue);
                return 0;
            case 11:
                gxVar.f375592p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
