package r45;

/* loaded from: classes8.dex */
public class k40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378353d;

    /* renamed from: e, reason: collision with root package name */
    public double f378354e;

    /* renamed from: f, reason: collision with root package name */
    public double f378355f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k40)) {
            return false;
        }
        r45.k40 k40Var = (r45.k40) fVar;
        return n51.f.a(this.f378353d, k40Var.f378353d) && n51.f.a(java.lang.Double.valueOf(this.f378354e), java.lang.Double.valueOf(k40Var.f378354e)) && n51.f.a(java.lang.Double.valueOf(this.f378355f), java.lang.Double.valueOf(k40Var.f378355f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378353d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.c(2, this.f378354e);
            fVar.c(3, this.f378355f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f378353d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.c(2, this.f378354e) + b36.f.c(3, this.f378355f);
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
        r45.k40 k40Var = (r45.k40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k40Var.f378353d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            k40Var.f378354e = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        k40Var.f378355f = aVar2.e(intValue);
        return 0;
    }
}
