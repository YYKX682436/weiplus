package r45;

/* loaded from: classes12.dex */
public class rc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f384709d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384710e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384711f;

    /* renamed from: g, reason: collision with root package name */
    public int f384712g;

    /* renamed from: h, reason: collision with root package name */
    public long f384713h;

    /* renamed from: i, reason: collision with root package name */
    public int f384714i;

    /* renamed from: m, reason: collision with root package name */
    public int f384715m;

    /* renamed from: n, reason: collision with root package name */
    public long f384716n;

    /* renamed from: o, reason: collision with root package name */
    public long f384717o;

    /* renamed from: p, reason: collision with root package name */
    public int f384718p;

    /* renamed from: q, reason: collision with root package name */
    public long f384719q;

    /* renamed from: r, reason: collision with root package name */
    public double f384720r;

    /* renamed from: s, reason: collision with root package name */
    public int f384721s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rc)) {
            return false;
        }
        r45.rc rcVar = (r45.rc) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f384709d), java.lang.Long.valueOf(rcVar.f384709d)) && n51.f.a(this.f384710e, rcVar.f384710e) && n51.f.a(this.f384711f, rcVar.f384711f) && n51.f.a(java.lang.Integer.valueOf(this.f384712g), java.lang.Integer.valueOf(rcVar.f384712g)) && n51.f.a(java.lang.Long.valueOf(this.f384713h), java.lang.Long.valueOf(rcVar.f384713h)) && n51.f.a(java.lang.Integer.valueOf(this.f384714i), java.lang.Integer.valueOf(rcVar.f384714i)) && n51.f.a(java.lang.Integer.valueOf(this.f384715m), java.lang.Integer.valueOf(rcVar.f384715m)) && n51.f.a(java.lang.Long.valueOf(this.f384716n), java.lang.Long.valueOf(rcVar.f384716n)) && n51.f.a(java.lang.Long.valueOf(this.f384717o), java.lang.Long.valueOf(rcVar.f384717o)) && n51.f.a(java.lang.Integer.valueOf(this.f384718p), java.lang.Integer.valueOf(rcVar.f384718p)) && n51.f.a(java.lang.Long.valueOf(this.f384719q), java.lang.Long.valueOf(rcVar.f384719q)) && n51.f.a(java.lang.Double.valueOf(this.f384720r), java.lang.Double.valueOf(rcVar.f384720r)) && n51.f.a(java.lang.Integer.valueOf(this.f384721s), java.lang.Integer.valueOf(rcVar.f384721s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f384709d);
            java.lang.String str = this.f384710e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384711f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f384712g);
            fVar.h(5, this.f384713h);
            fVar.e(6, this.f384714i);
            fVar.e(7, this.f384715m);
            fVar.h(8, this.f384716n);
            fVar.h(9, this.f384717o);
            fVar.e(10, this.f384718p);
            fVar.h(11, this.f384719q);
            fVar.c(12, this.f384720r);
            fVar.e(13, this.f384721s);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f384709d) + 0;
            java.lang.String str3 = this.f384710e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f384711f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            return h17 + b36.f.e(4, this.f384712g) + b36.f.h(5, this.f384713h) + b36.f.e(6, this.f384714i) + b36.f.e(7, this.f384715m) + b36.f.h(8, this.f384716n) + b36.f.h(9, this.f384717o) + b36.f.e(10, this.f384718p) + b36.f.h(11, this.f384719q) + b36.f.c(12, this.f384720r) + b36.f.e(13, this.f384721s);
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
        r45.rc rcVar = (r45.rc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rcVar.f384709d = aVar2.i(intValue);
                return 0;
            case 2:
                rcVar.f384710e = aVar2.k(intValue);
                return 0;
            case 3:
                rcVar.f384711f = aVar2.k(intValue);
                return 0;
            case 4:
                rcVar.f384712g = aVar2.g(intValue);
                return 0;
            case 5:
                rcVar.f384713h = aVar2.i(intValue);
                return 0;
            case 6:
                rcVar.f384714i = aVar2.g(intValue);
                return 0;
            case 7:
                rcVar.f384715m = aVar2.g(intValue);
                return 0;
            case 8:
                rcVar.f384716n = aVar2.i(intValue);
                return 0;
            case 9:
                rcVar.f384717o = aVar2.i(intValue);
                return 0;
            case 10:
                rcVar.f384718p = aVar2.g(intValue);
                return 0;
            case 11:
                rcVar.f384719q = aVar2.i(intValue);
                return 0;
            case 12:
                rcVar.f384720r = aVar2.e(intValue);
                return 0;
            case 13:
                rcVar.f384721s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
