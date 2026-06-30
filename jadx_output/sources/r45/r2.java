package r45;

/* loaded from: classes4.dex */
public class r2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f384451d;

    /* renamed from: e, reason: collision with root package name */
    public float f384452e;

    /* renamed from: f, reason: collision with root package name */
    public float f384453f;

    /* renamed from: g, reason: collision with root package name */
    public float f384454g;

    /* renamed from: h, reason: collision with root package name */
    public float f384455h;

    /* renamed from: i, reason: collision with root package name */
    public float f384456i;

    /* renamed from: m, reason: collision with root package name */
    public float f384457m;

    /* renamed from: n, reason: collision with root package name */
    public float f384458n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r2)) {
            return false;
        }
        r45.r2 r2Var = (r45.r2) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f384451d), java.lang.Float.valueOf(r2Var.f384451d)) && n51.f.a(java.lang.Float.valueOf(this.f384452e), java.lang.Float.valueOf(r2Var.f384452e)) && n51.f.a(java.lang.Float.valueOf(this.f384453f), java.lang.Float.valueOf(r2Var.f384453f)) && n51.f.a(java.lang.Float.valueOf(this.f384454g), java.lang.Float.valueOf(r2Var.f384454g)) && n51.f.a(java.lang.Float.valueOf(this.f384455h), java.lang.Float.valueOf(r2Var.f384455h)) && n51.f.a(java.lang.Float.valueOf(this.f384456i), java.lang.Float.valueOf(r2Var.f384456i)) && n51.f.a(java.lang.Float.valueOf(this.f384457m), java.lang.Float.valueOf(r2Var.f384457m)) && n51.f.a(java.lang.Float.valueOf(this.f384458n), java.lang.Float.valueOf(r2Var.f384458n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f384451d);
            fVar.d(2, this.f384452e);
            fVar.d(3, this.f384453f);
            fVar.d(4, this.f384454g);
            fVar.d(5, this.f384455h);
            fVar.d(6, this.f384456i);
            fVar.d(7, this.f384457m);
            fVar.d(8, this.f384458n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f384451d) + 0 + b36.f.d(2, this.f384452e) + b36.f.d(3, this.f384453f) + b36.f.d(4, this.f384454g) + b36.f.d(5, this.f384455h) + b36.f.d(6, this.f384456i) + b36.f.d(7, this.f384457m) + b36.f.d(8, this.f384458n);
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
        r45.r2 r2Var = (r45.r2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r2Var.f384451d = aVar2.f(intValue);
                return 0;
            case 2:
                r2Var.f384452e = aVar2.f(intValue);
                return 0;
            case 3:
                r2Var.f384453f = aVar2.f(intValue);
                return 0;
            case 4:
                r2Var.f384454g = aVar2.f(intValue);
                return 0;
            case 5:
                r2Var.f384455h = aVar2.f(intValue);
                return 0;
            case 6:
                r2Var.f384456i = aVar2.f(intValue);
                return 0;
            case 7:
                r2Var.f384457m = aVar2.f(intValue);
                return 0;
            case 8:
                r2Var.f384458n = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
