package r45;

/* loaded from: classes11.dex */
public class pj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383085d;

    /* renamed from: e, reason: collision with root package name */
    public int f383086e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383087f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383088g;

    /* renamed from: h, reason: collision with root package name */
    public int f383089h;

    /* renamed from: i, reason: collision with root package name */
    public int f383090i;

    /* renamed from: m, reason: collision with root package name */
    public int f383091m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383092n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383093o;

    /* renamed from: p, reason: collision with root package name */
    public int f383094p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pj)) {
            return false;
        }
        r45.pj pjVar = (r45.pj) fVar;
        return n51.f.a(this.f383085d, pjVar.f383085d) && n51.f.a(java.lang.Integer.valueOf(this.f383086e), java.lang.Integer.valueOf(pjVar.f383086e)) && n51.f.a(this.f383087f, pjVar.f383087f) && n51.f.a(this.f383088g, pjVar.f383088g) && n51.f.a(java.lang.Integer.valueOf(this.f383089h), java.lang.Integer.valueOf(pjVar.f383089h)) && n51.f.a(java.lang.Integer.valueOf(this.f383090i), java.lang.Integer.valueOf(pjVar.f383090i)) && n51.f.a(java.lang.Integer.valueOf(this.f383091m), java.lang.Integer.valueOf(pjVar.f383091m)) && n51.f.a(this.f383092n, pjVar.f383092n) && n51.f.a(this.f383093o, pjVar.f383093o) && n51.f.a(java.lang.Integer.valueOf(this.f383094p), java.lang.Integer.valueOf(pjVar.f383094p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383085d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f383086e);
            java.lang.String str2 = this.f383087f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383088g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f383089h);
            fVar.e(6, this.f383090i);
            fVar.e(7, this.f383091m);
            java.lang.String str4 = this.f383092n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f383093o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f383094p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f383085d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f383086e);
            java.lang.String str7 = this.f383087f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f383088g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            int e17 = j17 + b36.f.e(5, this.f383089h) + b36.f.e(6, this.f383090i) + b36.f.e(7, this.f383091m);
            java.lang.String str9 = this.f383092n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f383093o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            return e17 + b36.f.e(10, this.f383094p);
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
        r45.pj pjVar = (r45.pj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pjVar.f383085d = aVar2.k(intValue);
                return 0;
            case 2:
                pjVar.f383086e = aVar2.g(intValue);
                return 0;
            case 3:
                pjVar.f383087f = aVar2.k(intValue);
                return 0;
            case 4:
                pjVar.f383088g = aVar2.k(intValue);
                return 0;
            case 5:
                pjVar.f383089h = aVar2.g(intValue);
                return 0;
            case 6:
                pjVar.f383090i = aVar2.g(intValue);
                return 0;
            case 7:
                pjVar.f383091m = aVar2.g(intValue);
                return 0;
            case 8:
                pjVar.f383092n = aVar2.k(intValue);
                return 0;
            case 9:
                pjVar.f383093o = aVar2.k(intValue);
                return 0;
            case 10:
                pjVar.f383094p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
