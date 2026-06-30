package r45;

/* loaded from: classes9.dex */
public class j70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377620d;

    /* renamed from: e, reason: collision with root package name */
    public int f377621e;

    /* renamed from: f, reason: collision with root package name */
    public long f377622f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j70)) {
            return false;
        }
        r45.j70 j70Var = (r45.j70) fVar;
        return n51.f.a(this.f377620d, j70Var.f377620d) && n51.f.a(java.lang.Integer.valueOf(this.f377621e), java.lang.Integer.valueOf(j70Var.f377621e)) && n51.f.a(java.lang.Long.valueOf(this.f377622f), java.lang.Long.valueOf(j70Var.f377622f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377620d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377621e);
            fVar.h(3, this.f377622f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f377620d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f377621e) + b36.f.h(3, this.f377622f);
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
        r45.j70 j70Var = (r45.j70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j70Var.f377620d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            j70Var.f377621e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        j70Var.f377622f = aVar2.i(intValue);
        return 0;
    }
}
