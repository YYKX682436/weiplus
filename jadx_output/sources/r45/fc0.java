package r45;

/* loaded from: classes8.dex */
public class fc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374194d;

    /* renamed from: e, reason: collision with root package name */
    public int f374195e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fc0)) {
            return false;
        }
        r45.fc0 fc0Var = (r45.fc0) fVar;
        return n51.f.a(this.f374194d, fc0Var.f374194d) && n51.f.a(java.lang.Integer.valueOf(this.f374195e), java.lang.Integer.valueOf(fc0Var.f374195e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374194d;
            if (str != null) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f374194d;
            if (str2 != null) {
                return 0 + b36.f.j(1, str2);
            }
            return 0;
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
        r45.fc0 fc0Var = (r45.fc0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        fc0Var.f374194d = aVar2.k(intValue);
        return 0;
    }
}
