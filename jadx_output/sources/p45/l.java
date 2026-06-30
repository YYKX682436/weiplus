package p45;

/* loaded from: classes15.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f351943d;

    /* renamed from: e, reason: collision with root package name */
    public int f351944e;

    /* renamed from: f, reason: collision with root package name */
    public int f351945f;

    /* renamed from: g, reason: collision with root package name */
    public int f351946g;

    /* renamed from: h, reason: collision with root package name */
    public int f351947h;

    /* renamed from: i, reason: collision with root package name */
    public int f351948i;

    /* renamed from: m, reason: collision with root package name */
    public int f351949m;

    /* renamed from: n, reason: collision with root package name */
    public int f351950n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p45.l)) {
            return false;
        }
        p45.l lVar = (p45.l) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f351943d), java.lang.Integer.valueOf(lVar.f351943d)) && n51.f.a(java.lang.Integer.valueOf(this.f351944e), java.lang.Integer.valueOf(lVar.f351944e)) && n51.f.a(java.lang.Integer.valueOf(this.f351945f), java.lang.Integer.valueOf(lVar.f351945f)) && n51.f.a(java.lang.Integer.valueOf(this.f351946g), java.lang.Integer.valueOf(lVar.f351946g)) && n51.f.a(java.lang.Integer.valueOf(this.f351947h), java.lang.Integer.valueOf(lVar.f351947h)) && n51.f.a(java.lang.Integer.valueOf(this.f351948i), java.lang.Integer.valueOf(lVar.f351948i)) && n51.f.a(java.lang.Integer.valueOf(this.f351949m), java.lang.Integer.valueOf(lVar.f351949m)) && n51.f.a(java.lang.Integer.valueOf(this.f351950n), java.lang.Integer.valueOf(lVar.f351950n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f351943d);
            fVar.e(2, this.f351944e);
            fVar.e(3, this.f351945f);
            fVar.e(4, this.f351946g);
            fVar.e(5, this.f351947h);
            fVar.e(6, this.f351948i);
            fVar.e(7, this.f351949m);
            fVar.e(8, this.f351950n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f351943d) + 0 + b36.f.e(2, this.f351944e) + b36.f.e(3, this.f351945f) + b36.f.e(4, this.f351946g) + b36.f.e(5, this.f351947h) + b36.f.e(6, this.f351948i) + b36.f.e(7, this.f351949m) + b36.f.e(8, this.f351950n);
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
        p45.l lVar = (p45.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lVar.f351943d = aVar2.g(intValue);
                return 0;
            case 2:
                lVar.f351944e = aVar2.g(intValue);
                return 0;
            case 3:
                lVar.f351945f = aVar2.g(intValue);
                return 0;
            case 4:
                lVar.f351946g = aVar2.g(intValue);
                return 0;
            case 5:
                lVar.f351947h = aVar2.g(intValue);
                return 0;
            case 6:
                lVar.f351948i = aVar2.g(intValue);
                return 0;
            case 7:
                lVar.f351949m = aVar2.g(intValue);
                return 0;
            case 8:
                lVar.f351950n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
