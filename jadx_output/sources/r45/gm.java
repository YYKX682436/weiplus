package r45;

/* loaded from: classes14.dex */
public class gm extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375348d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375349e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375350f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375351g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375352h;

    /* renamed from: i, reason: collision with root package name */
    public int f375353i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375354m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375355n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375356o;

    /* renamed from: p, reason: collision with root package name */
    public int f375357p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f375358q;

    /* renamed from: r, reason: collision with root package name */
    public int f375359r;

    /* renamed from: s, reason: collision with root package name */
    public int f375360s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gm)) {
            return false;
        }
        r45.gm gmVar = (r45.gm) fVar;
        return n51.f.a(this.BaseRequest, gmVar.BaseRequest) && n51.f.a(this.f375348d, gmVar.f375348d) && n51.f.a(this.f375349e, gmVar.f375349e) && n51.f.a(this.f375350f, gmVar.f375350f) && n51.f.a(this.f375351g, gmVar.f375351g) && n51.f.a(this.f375352h, gmVar.f375352h) && n51.f.a(java.lang.Integer.valueOf(this.f375353i), java.lang.Integer.valueOf(gmVar.f375353i)) && n51.f.a(this.f375354m, gmVar.f375354m) && n51.f.a(this.f375355n, gmVar.f375355n) && n51.f.a(this.f375356o, gmVar.f375356o) && n51.f.a(java.lang.Integer.valueOf(this.f375357p), java.lang.Integer.valueOf(gmVar.f375357p)) && n51.f.a(this.f375358q, gmVar.f375358q) && n51.f.a(java.lang.Integer.valueOf(this.f375359r), java.lang.Integer.valueOf(gmVar.f375359r)) && n51.f.a(java.lang.Integer.valueOf(this.f375360s), java.lang.Integer.valueOf(gmVar.f375360s));
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
            java.lang.String str = this.f375348d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375349e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f375350f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f375351g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f375352h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f375353i);
            java.lang.String str6 = this.f375354m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f375355n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f375356o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f375357p);
            java.lang.String str9 = this.f375358q;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.e(13, this.f375359r);
            fVar.e(14, this.f375360s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str10 = this.f375348d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f375349e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f375350f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f375351g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f375352h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            int e17 = i18 + b36.f.e(7, this.f375353i);
            java.lang.String str15 = this.f375354m;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f375355n;
            if (str16 != null) {
                e17 += b36.f.j(9, str16);
            }
            java.lang.String str17 = this.f375356o;
            if (str17 != null) {
                e17 += b36.f.j(10, str17);
            }
            int e18 = e17 + b36.f.e(11, this.f375357p);
            java.lang.String str18 = this.f375358q;
            if (str18 != null) {
                e18 += b36.f.j(12, str18);
            }
            return e18 + b36.f.e(13, this.f375359r) + b36.f.e(14, this.f375360s);
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
        r45.gm gmVar = (r45.gm) objArr[1];
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
                    gmVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                gmVar.f375348d = aVar2.k(intValue);
                return 0;
            case 3:
                gmVar.f375349e = aVar2.k(intValue);
                return 0;
            case 4:
                gmVar.f375350f = aVar2.k(intValue);
                return 0;
            case 5:
                gmVar.f375351g = aVar2.k(intValue);
                return 0;
            case 6:
                gmVar.f375352h = aVar2.k(intValue);
                return 0;
            case 7:
                gmVar.f375353i = aVar2.g(intValue);
                return 0;
            case 8:
                gmVar.f375354m = aVar2.k(intValue);
                return 0;
            case 9:
                gmVar.f375355n = aVar2.k(intValue);
                return 0;
            case 10:
                gmVar.f375356o = aVar2.k(intValue);
                return 0;
            case 11:
                gmVar.f375357p = aVar2.g(intValue);
                return 0;
            case 12:
                gmVar.f375358q = aVar2.k(intValue);
                return 0;
            case 13:
                gmVar.f375359r = aVar2.g(intValue);
                return 0;
            case 14:
                gmVar.f375360s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
