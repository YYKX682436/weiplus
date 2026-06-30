package r45;

/* loaded from: classes4.dex */
public class i05 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376623d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376624e = "WGS84";

    /* renamed from: f, reason: collision with root package name */
    public double f376625f;

    /* renamed from: g, reason: collision with root package name */
    public double f376626g;

    /* renamed from: h, reason: collision with root package name */
    public double f376627h;

    /* renamed from: i, reason: collision with root package name */
    public int f376628i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i05)) {
            return false;
        }
        r45.i05 i05Var = (r45.i05) fVar;
        return n51.f.a(this.f376623d, i05Var.f376623d) && n51.f.a(this.f376624e, i05Var.f376624e) && n51.f.a(java.lang.Double.valueOf(this.f376625f), java.lang.Double.valueOf(i05Var.f376625f)) && n51.f.a(java.lang.Double.valueOf(this.f376626g), java.lang.Double.valueOf(i05Var.f376626g)) && n51.f.a(java.lang.Double.valueOf(this.f376627h), java.lang.Double.valueOf(i05Var.f376627h)) && n51.f.a(java.lang.Integer.valueOf(this.f376628i), java.lang.Integer.valueOf(i05Var.f376628i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376623d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376624e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.c(3, this.f376625f);
            fVar.c(4, this.f376626g);
            fVar.c(5, this.f376627h);
            fVar.e(6, this.f376628i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f376623d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f376624e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.c(3, this.f376625f) + b36.f.c(4, this.f376626g) + b36.f.c(5, this.f376627h) + b36.f.e(6, this.f376628i);
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
        r45.i05 i05Var = (r45.i05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i05Var.f376623d = aVar2.k(intValue);
                return 0;
            case 2:
                i05Var.f376624e = aVar2.k(intValue);
                return 0;
            case 3:
                i05Var.f376625f = aVar2.e(intValue);
                return 0;
            case 4:
                i05Var.f376626g = aVar2.e(intValue);
                return 0;
            case 5:
                i05Var.f376627h = aVar2.e(intValue);
                return 0;
            case 6:
                i05Var.f376628i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
