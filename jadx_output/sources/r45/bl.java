package r45;

/* loaded from: classes7.dex */
public class bl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370829d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f370830e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f370831f;

    /* renamed from: g, reason: collision with root package name */
    public int f370832g;

    /* renamed from: h, reason: collision with root package name */
    public int f370833h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f370834i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f370835m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f370836n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f370837o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f370838p;

    /* renamed from: q, reason: collision with root package name */
    public int f370839q;

    /* renamed from: r, reason: collision with root package name */
    public float f370840r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bl)) {
            return false;
        }
        r45.bl blVar = (r45.bl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370829d), java.lang.Integer.valueOf(blVar.f370829d)) && n51.f.a(java.lang.Boolean.valueOf(this.f370830e), java.lang.Boolean.valueOf(blVar.f370830e)) && n51.f.a(java.lang.Boolean.valueOf(this.f370831f), java.lang.Boolean.valueOf(blVar.f370831f)) && n51.f.a(java.lang.Integer.valueOf(this.f370832g), java.lang.Integer.valueOf(blVar.f370832g)) && n51.f.a(java.lang.Integer.valueOf(this.f370833h), java.lang.Integer.valueOf(blVar.f370833h)) && n51.f.a(java.lang.Boolean.valueOf(this.f370834i), java.lang.Boolean.valueOf(blVar.f370834i)) && n51.f.a(java.lang.Boolean.valueOf(this.f370835m), java.lang.Boolean.valueOf(blVar.f370835m)) && n51.f.a(java.lang.Boolean.valueOf(this.f370836n), java.lang.Boolean.valueOf(blVar.f370836n)) && n51.f.a(this.f370837o, blVar.f370837o) && n51.f.a(java.lang.Boolean.valueOf(this.f370838p), java.lang.Boolean.valueOf(blVar.f370838p)) && n51.f.a(java.lang.Integer.valueOf(this.f370839q), java.lang.Integer.valueOf(blVar.f370839q)) && n51.f.a(java.lang.Float.valueOf(this.f370840r), java.lang.Float.valueOf(blVar.f370840r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370829d);
            fVar.a(2, this.f370830e);
            fVar.a(3, this.f370831f);
            fVar.e(4, this.f370832g);
            fVar.e(5, this.f370833h);
            fVar.a(6, this.f370834i);
            fVar.a(7, this.f370835m);
            fVar.a(8, this.f370836n);
            java.lang.String str = this.f370837o;
            if (str != null) {
                fVar.j(9, str);
            }
            fVar.a(10, this.f370838p);
            fVar.e(11, this.f370839q);
            fVar.d(12, this.f370840r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370829d) + 0 + b36.f.a(2, this.f370830e) + b36.f.a(3, this.f370831f) + b36.f.e(4, this.f370832g) + b36.f.e(5, this.f370833h) + b36.f.a(6, this.f370834i) + b36.f.a(7, this.f370835m) + b36.f.a(8, this.f370836n);
            java.lang.String str2 = this.f370837o;
            if (str2 != null) {
                e17 += b36.f.j(9, str2);
            }
            return e17 + b36.f.a(10, this.f370838p) + b36.f.e(11, this.f370839q) + b36.f.d(12, this.f370840r);
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
        r45.bl blVar = (r45.bl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                blVar.f370829d = aVar2.g(intValue);
                return 0;
            case 2:
                blVar.f370830e = aVar2.c(intValue);
                return 0;
            case 3:
                blVar.f370831f = aVar2.c(intValue);
                return 0;
            case 4:
                blVar.f370832g = aVar2.g(intValue);
                return 0;
            case 5:
                blVar.f370833h = aVar2.g(intValue);
                return 0;
            case 6:
                blVar.f370834i = aVar2.c(intValue);
                return 0;
            case 7:
                blVar.f370835m = aVar2.c(intValue);
                return 0;
            case 8:
                blVar.f370836n = aVar2.c(intValue);
                return 0;
            case 9:
                blVar.f370837o = aVar2.k(intValue);
                return 0;
            case 10:
                blVar.f370838p = aVar2.c(intValue);
                return 0;
            case 11:
                blVar.f370839q = aVar2.g(intValue);
                return 0;
            case 12:
                blVar.f370840r = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
