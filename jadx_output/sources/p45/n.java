package p45;

/* loaded from: classes15.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351954d;

    /* renamed from: e, reason: collision with root package name */
    public int f351955e;

    /* renamed from: f, reason: collision with root package name */
    public int f351956f;

    /* renamed from: g, reason: collision with root package name */
    public int f351957g;

    /* renamed from: h, reason: collision with root package name */
    public int f351958h;

    /* renamed from: i, reason: collision with root package name */
    public int f351959i;

    /* renamed from: m, reason: collision with root package name */
    public int f351960m;

    /* renamed from: n, reason: collision with root package name */
    public int f351961n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.n)) {
            return false;
        }
        p45.n nVar = (p45.n) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351954d), java.lang.Integer.valueOf(nVar.f351954d)) && n51.f.a(java.lang.Integer.valueOf(this.f351955e), java.lang.Integer.valueOf(nVar.f351955e)) && n51.f.a(java.lang.Integer.valueOf(this.f351956f), java.lang.Integer.valueOf(nVar.f351956f)) && n51.f.a(java.lang.Integer.valueOf(this.f351957g), java.lang.Integer.valueOf(nVar.f351957g)) && n51.f.a(java.lang.Integer.valueOf(this.f351958h), java.lang.Integer.valueOf(nVar.f351958h)) && n51.f.a(java.lang.Integer.valueOf(this.f351959i), java.lang.Integer.valueOf(nVar.f351959i)) && n51.f.a(java.lang.Integer.valueOf(this.f351960m), java.lang.Integer.valueOf(nVar.f351960m)) && n51.f.a(java.lang.Integer.valueOf(this.f351961n), java.lang.Integer.valueOf(nVar.f351961n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351954d);
            fVar.e(2, this.f351955e);
            fVar.e(3, this.f351956f);
            fVar.e(4, this.f351957g);
            fVar.e(5, this.f351958h);
            fVar.e(6, this.f351959i);
            fVar.e(7, this.f351960m);
            fVar.e(8, this.f351961n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f351954d) + 0 + b36.f.e(2, this.f351955e) + b36.f.e(3, this.f351956f) + b36.f.e(4, this.f351957g) + b36.f.e(5, this.f351958h) + b36.f.e(6, this.f351959i) + b36.f.e(7, this.f351960m) + b36.f.e(8, this.f351961n);
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
        p45.n nVar = (p45.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nVar.f351954d = aVar2.g(intValue);
                return 0;
            case 2:
                nVar.f351955e = aVar2.g(intValue);
                return 0;
            case 3:
                nVar.f351956f = aVar2.g(intValue);
                return 0;
            case 4:
                nVar.f351957g = aVar2.g(intValue);
                return 0;
            case 5:
                nVar.f351958h = aVar2.g(intValue);
                return 0;
            case 6:
                nVar.f351959i = aVar2.g(intValue);
                return 0;
            case 7:
                nVar.f351960m = aVar2.g(intValue);
                return 0;
            case 8:
                nVar.f351961n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
