package r45;

/* loaded from: classes10.dex */
public class tl4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386545d;

    /* renamed from: e, reason: collision with root package name */
    public int f386546e;

    /* renamed from: f, reason: collision with root package name */
    public int f386547f;

    /* renamed from: g, reason: collision with root package name */
    public int f386548g;

    /* renamed from: h, reason: collision with root package name */
    public int f386549h;

    /* renamed from: i, reason: collision with root package name */
    public int f386550i;

    /* renamed from: m, reason: collision with root package name */
    public int f386551m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tl4)) {
            return false;
        }
        r45.tl4 tl4Var = (r45.tl4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386545d), java.lang.Integer.valueOf(tl4Var.f386545d)) && n51.f.a(java.lang.Integer.valueOf(this.f386546e), java.lang.Integer.valueOf(tl4Var.f386546e)) && n51.f.a(java.lang.Integer.valueOf(this.f386547f), java.lang.Integer.valueOf(tl4Var.f386547f)) && n51.f.a(java.lang.Integer.valueOf(this.f386548g), java.lang.Integer.valueOf(tl4Var.f386548g)) && n51.f.a(java.lang.Integer.valueOf(this.f386549h), java.lang.Integer.valueOf(tl4Var.f386549h)) && n51.f.a(java.lang.Integer.valueOf(this.f386550i), java.lang.Integer.valueOf(tl4Var.f386550i)) && n51.f.a(java.lang.Integer.valueOf(this.f386551m), java.lang.Integer.valueOf(tl4Var.f386551m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386545d);
            fVar.e(2, this.f386546e);
            fVar.e(3, this.f386547f);
            fVar.e(4, this.f386548g);
            fVar.e(5, this.f386549h);
            fVar.e(6, this.f386550i);
            fVar.e(7, this.f386551m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f386545d) + 0 + b36.f.e(2, this.f386546e) + b36.f.e(3, this.f386547f) + b36.f.e(4, this.f386548g) + b36.f.e(5, this.f386549h) + b36.f.e(6, this.f386550i) + b36.f.e(7, this.f386551m);
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
        r45.tl4 tl4Var = (r45.tl4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tl4Var.f386545d = aVar2.g(intValue);
                return 0;
            case 2:
                tl4Var.f386546e = aVar2.g(intValue);
                return 0;
            case 3:
                tl4Var.f386547f = aVar2.g(intValue);
                return 0;
            case 4:
                tl4Var.f386548g = aVar2.g(intValue);
                return 0;
            case 5:
                tl4Var.f386549h = aVar2.g(intValue);
                return 0;
            case 6:
                tl4Var.f386550i = aVar2.g(intValue);
                return 0;
            case 7:
                tl4Var.f386551m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
