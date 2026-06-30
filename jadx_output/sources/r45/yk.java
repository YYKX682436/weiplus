package r45;

/* loaded from: classes8.dex */
public class yk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391162d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391163e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391164f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391165g;

    /* renamed from: h, reason: collision with root package name */
    public int f391166h;

    /* renamed from: i, reason: collision with root package name */
    public int f391167i;

    /* renamed from: m, reason: collision with root package name */
    public int f391168m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391169n;

    /* renamed from: o, reason: collision with root package name */
    public int f391170o;

    /* renamed from: p, reason: collision with root package name */
    public int f391171p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yk)) {
            return false;
        }
        r45.yk ykVar = (r45.yk) fVar;
        return n51.f.a(this.f391162d, ykVar.f391162d) && n51.f.a(this.f391163e, ykVar.f391163e) && n51.f.a(this.f391164f, ykVar.f391164f) && n51.f.a(this.f391165g, ykVar.f391165g) && n51.f.a(java.lang.Integer.valueOf(this.f391166h), java.lang.Integer.valueOf(ykVar.f391166h)) && n51.f.a(java.lang.Integer.valueOf(this.f391167i), java.lang.Integer.valueOf(ykVar.f391167i)) && n51.f.a(java.lang.Integer.valueOf(this.f391168m), java.lang.Integer.valueOf(ykVar.f391168m)) && n51.f.a(this.f391169n, ykVar.f391169n) && n51.f.a(java.lang.Integer.valueOf(this.f391170o), java.lang.Integer.valueOf(ykVar.f391170o)) && n51.f.a(java.lang.Integer.valueOf(this.f391171p), java.lang.Integer.valueOf(ykVar.f391171p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391162d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391163e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391164f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f391165g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f391166h);
            fVar.e(6, this.f391167i);
            fVar.e(7, this.f391168m);
            java.lang.String str5 = this.f391169n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f391170o);
            fVar.e(10, this.f391171p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f391162d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f391163e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f391164f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f391165g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f391166h) + b36.f.e(6, this.f391167i) + b36.f.e(7, this.f391168m);
            java.lang.String str10 = this.f391169n;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            return e17 + b36.f.e(9, this.f391170o) + b36.f.e(10, this.f391171p);
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
        r45.yk ykVar = (r45.yk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ykVar.f391162d = aVar2.k(intValue);
                return 0;
            case 2:
                ykVar.f391163e = aVar2.k(intValue);
                return 0;
            case 3:
                ykVar.f391164f = aVar2.k(intValue);
                return 0;
            case 4:
                ykVar.f391165g = aVar2.k(intValue);
                return 0;
            case 5:
                ykVar.f391166h = aVar2.g(intValue);
                return 0;
            case 6:
                ykVar.f391167i = aVar2.g(intValue);
                return 0;
            case 7:
                ykVar.f391168m = aVar2.g(intValue);
                return 0;
            case 8:
                ykVar.f391169n = aVar2.k(intValue);
                return 0;
            case 9:
                ykVar.f391170o = aVar2.g(intValue);
                return 0;
            case 10:
                ykVar.f391171p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
