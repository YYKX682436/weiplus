package r45;

/* loaded from: classes8.dex */
public class w54 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f388896d;

    /* renamed from: e, reason: collision with root package name */
    public double f388897e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388898f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w54)) {
            return false;
        }
        r45.w54 w54Var = (r45.w54) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f388896d), java.lang.Double.valueOf(w54Var.f388896d)) && n51.f.a(java.lang.Double.valueOf(this.f388897e), java.lang.Double.valueOf(w54Var.f388897e)) && n51.f.a(this.f388898f, w54Var.f388898f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.f388896d);
            fVar.c(2, this.f388897e);
            java.lang.String str = this.f388898f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = b36.f.c(1, this.f388896d) + 0 + b36.f.c(2, this.f388897e);
            java.lang.String str2 = this.f388898f;
            return str2 != null ? c17 + b36.f.j(3, str2) : c17;
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
        r45.w54 w54Var = (r45.w54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w54Var.f388896d = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 2) {
            w54Var.f388897e = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        w54Var.f388898f = aVar2.k(intValue);
        return 0;
    }
}
