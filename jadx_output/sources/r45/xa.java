package r45;

/* loaded from: classes4.dex */
public class xa extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389904d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f389905e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f389906f;

    /* renamed from: g, reason: collision with root package name */
    public int f389907g;

    /* renamed from: h, reason: collision with root package name */
    public int f389908h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f389909i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f389910m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f389911n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389912o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f389913p;

    /* renamed from: q, reason: collision with root package name */
    public int f389914q;

    /* renamed from: r, reason: collision with root package name */
    public float f389915r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xa)) {
            return false;
        }
        r45.xa xaVar = (r45.xa) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389904d), java.lang.Integer.valueOf(xaVar.f389904d)) && n51.f.a(java.lang.Boolean.valueOf(this.f389905e), java.lang.Boolean.valueOf(xaVar.f389905e)) && n51.f.a(java.lang.Boolean.valueOf(this.f389906f), java.lang.Boolean.valueOf(xaVar.f389906f)) && n51.f.a(java.lang.Integer.valueOf(this.f389907g), java.lang.Integer.valueOf(xaVar.f389907g)) && n51.f.a(java.lang.Integer.valueOf(this.f389908h), java.lang.Integer.valueOf(xaVar.f389908h)) && n51.f.a(java.lang.Boolean.valueOf(this.f389909i), java.lang.Boolean.valueOf(xaVar.f389909i)) && n51.f.a(java.lang.Boolean.valueOf(this.f389910m), java.lang.Boolean.valueOf(xaVar.f389910m)) && n51.f.a(java.lang.Boolean.valueOf(this.f389911n), java.lang.Boolean.valueOf(xaVar.f389911n)) && n51.f.a(this.f389912o, xaVar.f389912o) && n51.f.a(java.lang.Boolean.valueOf(this.f389913p), java.lang.Boolean.valueOf(xaVar.f389913p)) && n51.f.a(java.lang.Integer.valueOf(this.f389914q), java.lang.Integer.valueOf(xaVar.f389914q)) && n51.f.a(java.lang.Float.valueOf(this.f389915r), java.lang.Float.valueOf(xaVar.f389915r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389904d);
            fVar.a(2, this.f389905e);
            fVar.a(3, this.f389906f);
            fVar.e(4, this.f389907g);
            fVar.e(5, this.f389908h);
            fVar.a(6, this.f389909i);
            fVar.a(7, this.f389910m);
            fVar.a(8, this.f389911n);
            java.lang.String str = this.f389912o;
            if (str != null) {
                fVar.j(9, str);
            }
            fVar.a(10, this.f389913p);
            fVar.e(11, this.f389914q);
            fVar.d(12, this.f389915r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389904d) + 0 + b36.f.a(2, this.f389905e) + b36.f.a(3, this.f389906f) + b36.f.e(4, this.f389907g) + b36.f.e(5, this.f389908h) + b36.f.a(6, this.f389909i) + b36.f.a(7, this.f389910m) + b36.f.a(8, this.f389911n);
            java.lang.String str2 = this.f389912o;
            if (str2 != null) {
                e17 += b36.f.j(9, str2);
            }
            return e17 + b36.f.a(10, this.f389913p) + b36.f.e(11, this.f389914q) + b36.f.d(12, this.f389915r);
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
        r45.xa xaVar = (r45.xa) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xaVar.f389904d = aVar2.g(intValue);
                return 0;
            case 2:
                xaVar.f389905e = aVar2.c(intValue);
                return 0;
            case 3:
                xaVar.f389906f = aVar2.c(intValue);
                return 0;
            case 4:
                xaVar.f389907g = aVar2.g(intValue);
                return 0;
            case 5:
                xaVar.f389908h = aVar2.g(intValue);
                return 0;
            case 6:
                xaVar.f389909i = aVar2.c(intValue);
                return 0;
            case 7:
                xaVar.f389910m = aVar2.c(intValue);
                return 0;
            case 8:
                xaVar.f389911n = aVar2.c(intValue);
                return 0;
            case 9:
                xaVar.f389912o = aVar2.k(intValue);
                return 0;
            case 10:
                xaVar.f389913p = aVar2.c(intValue);
                return 0;
            case 11:
                xaVar.f389914q = aVar2.g(intValue);
                return 0;
            case 12:
                xaVar.f389915r = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
