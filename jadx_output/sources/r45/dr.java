package r45;

/* loaded from: classes12.dex */
public class dr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372674d;

    /* renamed from: e, reason: collision with root package name */
    public int f372675e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372676f;

    /* renamed from: g, reason: collision with root package name */
    public int f372677g;

    /* renamed from: h, reason: collision with root package name */
    public int f372678h;

    /* renamed from: i, reason: collision with root package name */
    public int f372679i;

    /* renamed from: m, reason: collision with root package name */
    public int f372680m;

    /* renamed from: n, reason: collision with root package name */
    public int f372681n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f372682o;

    /* renamed from: p, reason: collision with root package name */
    public int f372683p;

    /* renamed from: q, reason: collision with root package name */
    public int f372684q;

    /* renamed from: r, reason: collision with root package name */
    public int f372685r;

    /* renamed from: s, reason: collision with root package name */
    public int f372686s;

    /* renamed from: t, reason: collision with root package name */
    public int f372687t;

    /* renamed from: u, reason: collision with root package name */
    public int f372688u;

    /* renamed from: v, reason: collision with root package name */
    public int f372689v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dr)) {
            return false;
        }
        r45.dr drVar = (r45.dr) fVar;
        return n51.f.a(this.f372674d, drVar.f372674d) && n51.f.a(java.lang.Integer.valueOf(this.f372675e), java.lang.Integer.valueOf(drVar.f372675e)) && n51.f.a(this.f372676f, drVar.f372676f) && n51.f.a(java.lang.Integer.valueOf(this.f372677g), java.lang.Integer.valueOf(drVar.f372677g)) && n51.f.a(java.lang.Integer.valueOf(this.f372678h), java.lang.Integer.valueOf(drVar.f372678h)) && n51.f.a(java.lang.Integer.valueOf(this.f372679i), java.lang.Integer.valueOf(drVar.f372679i)) && n51.f.a(java.lang.Integer.valueOf(this.f372680m), java.lang.Integer.valueOf(drVar.f372680m)) && n51.f.a(java.lang.Integer.valueOf(this.f372681n), java.lang.Integer.valueOf(drVar.f372681n)) && n51.f.a(this.f372682o, drVar.f372682o) && n51.f.a(java.lang.Integer.valueOf(this.f372683p), java.lang.Integer.valueOf(drVar.f372683p)) && n51.f.a(java.lang.Integer.valueOf(this.f372684q), java.lang.Integer.valueOf(drVar.f372684q)) && n51.f.a(java.lang.Integer.valueOf(this.f372685r), java.lang.Integer.valueOf(drVar.f372685r)) && n51.f.a(java.lang.Integer.valueOf(this.f372686s), java.lang.Integer.valueOf(drVar.f372686s)) && n51.f.a(java.lang.Integer.valueOf(this.f372687t), java.lang.Integer.valueOf(drVar.f372687t)) && n51.f.a(java.lang.Integer.valueOf(this.f372688u), java.lang.Integer.valueOf(drVar.f372688u)) && n51.f.a(java.lang.Integer.valueOf(this.f372689v), java.lang.Integer.valueOf(drVar.f372689v));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372674d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f372675e);
            java.lang.String str2 = this.f372676f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f372677g);
            fVar.e(5, this.f372678h);
            fVar.e(6, this.f372679i);
            fVar.e(7, this.f372680m);
            fVar.e(8, this.f372681n);
            java.lang.String str3 = this.f372682o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f372683p);
            fVar.e(11, this.f372684q);
            fVar.e(12, this.f372685r);
            fVar.e(13, this.f372686s);
            fVar.e(14, this.f372687t);
            fVar.e(15, this.f372688u);
            fVar.e(16, this.f372689v);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f372674d;
            int j17 = (str4 != null ? b36.f.j(1, str4) + 0 : 0) + b36.f.e(2, this.f372675e);
            java.lang.String str5 = this.f372676f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int e17 = j17 + b36.f.e(4, this.f372677g) + b36.f.e(5, this.f372678h) + b36.f.e(6, this.f372679i) + b36.f.e(7, this.f372680m) + b36.f.e(8, this.f372681n);
            java.lang.String str6 = this.f372682o;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.e(10, this.f372683p) + b36.f.e(11, this.f372684q) + b36.f.e(12, this.f372685r) + b36.f.e(13, this.f372686s) + b36.f.e(14, this.f372687t) + b36.f.e(15, this.f372688u) + b36.f.e(16, this.f372689v);
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
        r45.dr drVar = (r45.dr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                drVar.f372674d = aVar2.k(intValue);
                return 0;
            case 2:
                drVar.f372675e = aVar2.g(intValue);
                return 0;
            case 3:
                drVar.f372676f = aVar2.k(intValue);
                return 0;
            case 4:
                drVar.f372677g = aVar2.g(intValue);
                return 0;
            case 5:
                drVar.f372678h = aVar2.g(intValue);
                return 0;
            case 6:
                drVar.f372679i = aVar2.g(intValue);
                return 0;
            case 7:
                drVar.f372680m = aVar2.g(intValue);
                return 0;
            case 8:
                drVar.f372681n = aVar2.g(intValue);
                return 0;
            case 9:
                drVar.f372682o = aVar2.k(intValue);
                return 0;
            case 10:
                drVar.f372683p = aVar2.g(intValue);
                return 0;
            case 11:
                drVar.f372684q = aVar2.g(intValue);
                return 0;
            case 12:
                drVar.f372685r = aVar2.g(intValue);
                return 0;
            case 13:
                drVar.f372686s = aVar2.g(intValue);
                return 0;
            case 14:
                drVar.f372687t = aVar2.g(intValue);
                return 0;
            case 15:
                drVar.f372688u = aVar2.g(intValue);
                return 0;
            case 16:
                drVar.f372689v = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
