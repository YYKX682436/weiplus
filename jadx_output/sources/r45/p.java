package r45;

/* loaded from: classes9.dex */
public class p extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382632d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382633e;

    /* renamed from: f, reason: collision with root package name */
    public long f382634f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382635g;

    /* renamed from: h, reason: collision with root package name */
    public int f382636h;

    /* renamed from: i, reason: collision with root package name */
    public int f382637i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382638m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382639n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382640o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p)) {
            return false;
        }
        r45.p pVar = (r45.p) fVar;
        return n51.f.a(this.f382632d, pVar.f382632d) && n51.f.a(this.f382633e, pVar.f382633e) && n51.f.a(java.lang.Long.valueOf(this.f382634f), java.lang.Long.valueOf(pVar.f382634f)) && n51.f.a(this.f382635g, pVar.f382635g) && n51.f.a(java.lang.Integer.valueOf(this.f382636h), java.lang.Integer.valueOf(pVar.f382636h)) && n51.f.a(java.lang.Integer.valueOf(this.f382637i), java.lang.Integer.valueOf(pVar.f382637i)) && n51.f.a(this.f382638m, pVar.f382638m) && n51.f.a(this.f382639n, pVar.f382639n) && n51.f.a(this.f382640o, pVar.f382640o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382632d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382633e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f382634f);
            java.lang.String str3 = this.f382635g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(10, this.f382636h);
            fVar.e(11, this.f382637i);
            java.lang.String str4 = this.f382638m;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f382639n;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f382640o;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f382632d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f382633e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int h17 = j17 + b36.f.h(3, this.f382634f);
            java.lang.String str9 = this.f382635g;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            int e17 = h17 + b36.f.e(10, this.f382636h) + b36.f.e(11, this.f382637i);
            java.lang.String str10 = this.f382638m;
            if (str10 != null) {
                e17 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f382639n;
            if (str11 != null) {
                e17 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f382640o;
            return str12 != null ? e17 + b36.f.j(14, str12) : e17;
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
        r45.p pVar = (r45.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pVar.f382632d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            pVar.f382633e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            pVar.f382634f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 5) {
            pVar.f382635g = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 10:
                pVar.f382636h = aVar2.g(intValue);
                return 0;
            case 11:
                pVar.f382637i = aVar2.g(intValue);
                return 0;
            case 12:
                pVar.f382638m = aVar2.k(intValue);
                return 0;
            case 13:
                pVar.f382639n = aVar2.k(intValue);
                return 0;
            case 14:
                pVar.f382640o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
