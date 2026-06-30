package r45;

/* loaded from: classes9.dex */
public class io6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f377222d;

    /* renamed from: e, reason: collision with root package name */
    public double f377223e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377224f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377225g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.io6)) {
            return false;
        }
        r45.io6 io6Var = (r45.io6) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f377222d), java.lang.Double.valueOf(io6Var.f377222d)) && n51.f.a(java.lang.Double.valueOf(this.f377223e), java.lang.Double.valueOf(io6Var.f377223e)) && n51.f.a(this.f377224f, io6Var.f377224f) && n51.f.a(this.f377225g, io6Var.f377225g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f377222d);
            fVar.c(2, this.f377223e);
            java.lang.String str = this.f377224f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f377225g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = b36.f.c(1, this.f377222d) + 0 + b36.f.c(2, this.f377223e);
            java.lang.String str3 = this.f377224f;
            if (str3 != null) {
                c17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f377225g;
            return str4 != null ? c17 + b36.f.j(4, str4) : c17;
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
        r45.io6 io6Var = (r45.io6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            io6Var.f377222d = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 2) {
            io6Var.f377223e = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 3) {
            io6Var.f377224f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        io6Var.f377225g = aVar2.k(intValue);
        return 0;
    }
}
