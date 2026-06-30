package r45;

/* loaded from: classes8.dex */
public class p1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382651d;

    /* renamed from: e, reason: collision with root package name */
    public int f382652e;

    /* renamed from: f, reason: collision with root package name */
    public int f382653f;

    /* renamed from: g, reason: collision with root package name */
    public int f382654g;

    /* renamed from: h, reason: collision with root package name */
    public int f382655h;

    /* renamed from: i, reason: collision with root package name */
    public int f382656i;

    /* renamed from: m, reason: collision with root package name */
    public int f382657m;

    /* renamed from: n, reason: collision with root package name */
    public int f382658n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p1)) {
            return false;
        }
        r45.p1 p1Var = (r45.p1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382651d), java.lang.Integer.valueOf(p1Var.f382651d)) && n51.f.a(java.lang.Integer.valueOf(this.f382652e), java.lang.Integer.valueOf(p1Var.f382652e)) && n51.f.a(java.lang.Integer.valueOf(this.f382653f), java.lang.Integer.valueOf(p1Var.f382653f)) && n51.f.a(java.lang.Integer.valueOf(this.f382654g), java.lang.Integer.valueOf(p1Var.f382654g)) && n51.f.a(java.lang.Integer.valueOf(this.f382655h), java.lang.Integer.valueOf(p1Var.f382655h)) && n51.f.a(java.lang.Integer.valueOf(this.f382656i), java.lang.Integer.valueOf(p1Var.f382656i)) && n51.f.a(java.lang.Integer.valueOf(this.f382657m), java.lang.Integer.valueOf(p1Var.f382657m)) && n51.f.a(java.lang.Integer.valueOf(this.f382658n), java.lang.Integer.valueOf(p1Var.f382658n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382651d);
            fVar.e(2, this.f382652e);
            fVar.e(3, this.f382653f);
            fVar.e(4, this.f382654g);
            fVar.e(5, this.f382655h);
            fVar.e(6, this.f382656i);
            fVar.e(7, this.f382657m);
            fVar.e(8, this.f382658n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f382651d) + 0 + b36.f.e(2, this.f382652e) + b36.f.e(3, this.f382653f) + b36.f.e(4, this.f382654g) + b36.f.e(5, this.f382655h) + b36.f.e(6, this.f382656i) + b36.f.e(7, this.f382657m) + b36.f.e(8, this.f382658n);
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
        r45.p1 p1Var = (r45.p1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p1Var.f382651d = aVar2.g(intValue);
                return 0;
            case 2:
                p1Var.f382652e = aVar2.g(intValue);
                return 0;
            case 3:
                p1Var.f382653f = aVar2.g(intValue);
                return 0;
            case 4:
                p1Var.f382654g = aVar2.g(intValue);
                return 0;
            case 5:
                p1Var.f382655h = aVar2.g(intValue);
                return 0;
            case 6:
                p1Var.f382656i = aVar2.g(intValue);
                return 0;
            case 7:
                p1Var.f382657m = aVar2.g(intValue);
                return 0;
            case 8:
                p1Var.f382658n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
