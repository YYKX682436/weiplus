package r45;

/* loaded from: classes14.dex */
public class d64 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f372174d;

    /* renamed from: e, reason: collision with root package name */
    public float f372175e;

    /* renamed from: f, reason: collision with root package name */
    public int f372176f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372177g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372178h;

    /* renamed from: i, reason: collision with root package name */
    public int f372179i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d64)) {
            return false;
        }
        r45.d64 d64Var = (r45.d64) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f372174d), java.lang.Float.valueOf(d64Var.f372174d)) && n51.f.a(java.lang.Float.valueOf(this.f372175e), java.lang.Float.valueOf(d64Var.f372175e)) && n51.f.a(java.lang.Integer.valueOf(this.f372176f), java.lang.Integer.valueOf(d64Var.f372176f)) && n51.f.a(this.f372177g, d64Var.f372177g) && n51.f.a(this.f372178h, d64Var.f372178h) && n51.f.a(java.lang.Integer.valueOf(this.f372179i), java.lang.Integer.valueOf(d64Var.f372179i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f372174d);
            fVar.d(2, this.f372175e);
            fVar.e(3, this.f372176f);
            java.lang.String str = this.f372177g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f372178h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f372179i);
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f372174d) + 0 + b36.f.d(2, this.f372175e) + b36.f.e(3, this.f372176f);
            java.lang.String str3 = this.f372177g;
            if (str3 != null) {
                d17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f372178h;
            if (str4 != null) {
                d17 += b36.f.j(5, str4);
            }
            return d17 + b36.f.e(6, this.f372179i);
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
        r45.d64 d64Var = (r45.d64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d64Var.f372174d = aVar2.f(intValue);
                return 0;
            case 2:
                d64Var.f372175e = aVar2.f(intValue);
                return 0;
            case 3:
                d64Var.f372176f = aVar2.g(intValue);
                return 0;
            case 4:
                d64Var.f372177g = aVar2.k(intValue);
                return 0;
            case 5:
                d64Var.f372178h = aVar2.k(intValue);
                return 0;
            case 6:
                d64Var.f372179i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
