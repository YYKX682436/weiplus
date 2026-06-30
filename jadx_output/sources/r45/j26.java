package r45;

/* loaded from: classes4.dex */
public class j26 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377520d;

    /* renamed from: e, reason: collision with root package name */
    public long f377521e;

    /* renamed from: f, reason: collision with root package name */
    public long f377522f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j26)) {
            return false;
        }
        r45.j26 j26Var = (r45.j26) fVar;
        return n51.f.a(this.f377520d, j26Var.f377520d) && n51.f.a(java.lang.Long.valueOf(this.f377521e), java.lang.Long.valueOf(j26Var.f377521e)) && n51.f.a(java.lang.Long.valueOf(this.f377522f), java.lang.Long.valueOf(j26Var.f377522f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377520d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f377521e);
            fVar.h(3, this.f377522f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f377520d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f377521e) + b36.f.h(3, this.f377522f);
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
        r45.j26 j26Var = (r45.j26) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j26Var.f377520d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            j26Var.f377521e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        j26Var.f377522f = aVar2.i(intValue);
        return 0;
    }
}
