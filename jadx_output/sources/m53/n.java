package m53;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f323913d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f323914e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323915f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f323916g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323917h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f323918i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f323919m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f323920n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.n)) {
            return false;
        }
        m53.n nVar = (m53.n) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f323913d), java.lang.Boolean.valueOf(nVar.f323913d)) && n51.f.a(java.lang.Boolean.valueOf(this.f323914e), java.lang.Boolean.valueOf(nVar.f323914e)) && n51.f.a(java.lang.Boolean.valueOf(this.f323915f), java.lang.Boolean.valueOf(nVar.f323915f)) && n51.f.a(java.lang.Boolean.valueOf(this.f323916g), java.lang.Boolean.valueOf(nVar.f323916g)) && n51.f.a(java.lang.Boolean.valueOf(this.f323917h), java.lang.Boolean.valueOf(nVar.f323917h)) && n51.f.a(java.lang.Boolean.valueOf(this.f323918i), java.lang.Boolean.valueOf(nVar.f323918i)) && n51.f.a(java.lang.Boolean.valueOf(this.f323919m), java.lang.Boolean.valueOf(nVar.f323919m)) && n51.f.a(java.lang.Boolean.valueOf(this.f323920n), java.lang.Boolean.valueOf(nVar.f323920n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f323913d);
            fVar.a(2, this.f323914e);
            fVar.a(3, this.f323915f);
            fVar.a(4, this.f323916g);
            fVar.a(5, this.f323917h);
            fVar.a(6, this.f323918i);
            fVar.a(7, this.f323919m);
            fVar.a(8, this.f323920n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f323913d) + 0 + b36.f.a(2, this.f323914e) + b36.f.a(3, this.f323915f) + b36.f.a(4, this.f323916g) + b36.f.a(5, this.f323917h) + b36.f.a(6, this.f323918i) + b36.f.a(7, this.f323919m) + b36.f.a(8, this.f323920n);
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
        m53.n nVar = (m53.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nVar.f323913d = aVar2.c(intValue);
                return 0;
            case 2:
                nVar.f323914e = aVar2.c(intValue);
                return 0;
            case 3:
                nVar.f323915f = aVar2.c(intValue);
                return 0;
            case 4:
                nVar.f323916g = aVar2.c(intValue);
                return 0;
            case 5:
                nVar.f323917h = aVar2.c(intValue);
                return 0;
            case 6:
                nVar.f323918i = aVar2.c(intValue);
                return 0;
            case 7:
                nVar.f323919m = aVar2.c(intValue);
                return 0;
            case 8:
                nVar.f323920n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
