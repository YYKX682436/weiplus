package r45;

/* loaded from: classes4.dex */
public class nu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381672d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381673e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381674f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381675g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381676h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381677i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381678m;

    /* renamed from: n, reason: collision with root package name */
    public float f381679n;

    /* renamed from: o, reason: collision with root package name */
    public float f381680o;

    /* renamed from: p, reason: collision with root package name */
    public float f381681p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f381682q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f381683r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f381684s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nu)) {
            return false;
        }
        r45.nu nuVar = (r45.nu) fVar;
        return n51.f.a(this.f381672d, nuVar.f381672d) && n51.f.a(this.f381673e, nuVar.f381673e) && n51.f.a(this.f381674f, nuVar.f381674f) && n51.f.a(this.f381675g, nuVar.f381675g) && n51.f.a(this.f381676h, nuVar.f381676h) && n51.f.a(this.f381677i, nuVar.f381677i) && n51.f.a(this.f381678m, nuVar.f381678m) && n51.f.a(java.lang.Float.valueOf(this.f381679n), java.lang.Float.valueOf(nuVar.f381679n)) && n51.f.a(java.lang.Float.valueOf(this.f381680o), java.lang.Float.valueOf(nuVar.f381680o)) && n51.f.a(java.lang.Float.valueOf(this.f381681p), java.lang.Float.valueOf(nuVar.f381681p)) && n51.f.a(this.f381682q, nuVar.f381682q) && n51.f.a(this.f381683r, nuVar.f381683r) && n51.f.a(this.f381684s, nuVar.f381684s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381672d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381673e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381674f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f381675g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f381676h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f381677i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f381678m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.d(8, this.f381679n);
            fVar.d(9, this.f381680o);
            fVar.d(10, this.f381681p);
            java.lang.String str8 = this.f381682q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f381683r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f381684s;
            if (str10 == null) {
                return 0;
            }
            fVar.j(13, str10);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f381672d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f381673e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f381674f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f381675g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f381676h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f381677i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f381678m;
            if (str17 != null) {
                j17 += b36.f.j(7, str17);
            }
            int d17 = j17 + b36.f.d(8, this.f381679n) + b36.f.d(9, this.f381680o) + b36.f.d(10, this.f381681p);
            java.lang.String str18 = this.f381682q;
            if (str18 != null) {
                d17 += b36.f.j(11, str18);
            }
            java.lang.String str19 = this.f381683r;
            if (str19 != null) {
                d17 += b36.f.j(12, str19);
            }
            java.lang.String str20 = this.f381684s;
            return str20 != null ? d17 + b36.f.j(13, str20) : d17;
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
        r45.nu nuVar = (r45.nu) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nuVar.f381672d = aVar2.k(intValue);
                return 0;
            case 2:
                nuVar.f381673e = aVar2.k(intValue);
                return 0;
            case 3:
                nuVar.f381674f = aVar2.k(intValue);
                return 0;
            case 4:
                nuVar.f381675g = aVar2.k(intValue);
                return 0;
            case 5:
                nuVar.f381676h = aVar2.k(intValue);
                return 0;
            case 6:
                nuVar.f381677i = aVar2.k(intValue);
                return 0;
            case 7:
                nuVar.f381678m = aVar2.k(intValue);
                return 0;
            case 8:
                nuVar.f381679n = aVar2.f(intValue);
                return 0;
            case 9:
                nuVar.f381680o = aVar2.f(intValue);
                return 0;
            case 10:
                nuVar.f381681p = aVar2.f(intValue);
                return 0;
            case 11:
                nuVar.f381682q = aVar2.k(intValue);
                return 0;
            case 12:
                nuVar.f381683r = aVar2.k(intValue);
                return 0;
            case 13:
                nuVar.f381684s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
